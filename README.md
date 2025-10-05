<html>
  <body>
    <h1>QT - Quality Threshold</h1>

    Il progetto mostra il funzionamento dell'algoritmo Quality Threshold.
    Il progetto è stato svolto per l'esame di Metodi Avanzati di Programmazione per l'universita degli studi di Bari.
    L'algoritmo viene eseguito su un dataset caricato su una base di dati dando la possibilità all'utente di:
    - Apprendere dal database e salvare su file la conoscenza appresa
    - Apprendere da un file precedentemente salvato

    Algoritmo QT:
    E' un algoritmo di Machine Learning con apprendimento non supervisionato (senza etichette) 
    che effettua soft clustering.
    L’algoritmo cerca tutti i gruppi di punti che stanno dentro una certa soglia di distanza (radius), 
    scegliendo poi quelli più popolaticonsiderendo prima un centroide e 
    confrontando i cluster candidati che hanno una distanza <= al dato radius dal centroide considerato.
    Non avviene una assegnazione casuale come nel k-means (anche esso algoritmo di clustering non supervisionato) 
    ma ha un costo computazionale più alto dato che valuta tutti i punti come possibili candidati.
    
    Aggiornamenti futuri:
    - Integrazione con Spring Boot per creare un'API che restituisca la conoscenza apppresa
    - Containterizzazione con Docker  
  </body>


  
</html>
