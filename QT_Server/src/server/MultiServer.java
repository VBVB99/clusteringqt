package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Classe che rappresenta un server multi-threaded che accetta connessioni
 * da piu' client su una porta specificata.
 * 
 * Per ogni client che si connette, viene creato un nuovo thread
 * {@link ServerOneClient} che gestisce la comunicazione in parallelo.
 */
public class MultiServer {
    /** Porta su cui il server rimane in ascolto */
    private int port;

    /**
     * Costruttore parametrizzato della classe MultiServer.
     * Inizializza il numero di porta e avvia il server.
     *
     * @param port numero di porta su cui il server deve rimanere in ascolto.
     */
    public MultiServer(int port) {
        this.port = port;
        run();
    }

    /**
     * Avvia il server e gestisce le connessioni client.
     * Per ogni client accettato, viene creato un nuovo thread
     * dedicato mediante la classe {@link ServerOneClient}
     */
    private void run() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server avviato sulla porta " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Nuovo client connesso: " + clientSocket);

                new ServerOneClient(clientSocket).start();
            }

        } catch (IOException e) {
            System.err.println("[!] Errore server: " + e.getMessage());
        }
    }

    /**
     * Metodo principale che crea una istanza della classe MultiServer sulla porta 7070.
     *
     * @param args eventuali parametri da linea di comando (non usati)
     */
    public static void main(String[] args) {
        new MultiServer(7070);
    }
}
