# Esercizio #1

Modificare il funzionamento del programma in modo che:
- Il metodo goToWork() fallisca randomicamente lanciando un eccezione
- Sia presente un metodo *callWorkers()* che chiami tutti i dipendenti a lavoro tramite il metodo goToWork() e ritorni un array (o lista) di dipendenti che non si sono presentati.
NB: Un dipendente non si presenta al lavoro se la sua chiamata a goToWork fallisce lanciando un'eccezione
- Il metodo *startWorkDay()* che faccia lavorare tutti i dipendenti che sono presenti a lavoro. Idealmente il metodo *work()* va chiamato solo su oggetti *Employee* che siamo sicuri non lancino eccezioni.
- Ad un certo punto si stampi il numero di impiegati a lavoro ed il numero di impiegati che non si sono presentati.
- Aggiungere un metodo *endWorkDay()* che mandi solo i dipendenti presenti a casa.

# Esercizio #2
Rinominare la classe *CompanyState* in *Company* e trasformarla da singleton ad oggetto riutilizzabile.
Il funzionamento del programma deve rimanere identico, inserire un riferimento ad un oggetto *Company*, creato nel main, in ogni classe in cui serve.