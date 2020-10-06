# Fremtind, oppgave: Smartbil
 
## oppgve 1 :rocket: ##

![alt text](https://github.com/Fridthoy/Fremtind/blob/master/pictures/klassediagram.png)


diagrammet over viser en min løsning på hvilke klasser jeg ville laget for å å kunne vise 
dataene til denne applikasjonen.

### om koden ### 
programmet er programmert i java, dette fordi at det er oversiktlig for OOP
(samt at jeg har hørt at fremtind bruker dette programerinsspråket). 

Jeg tar utgangspunkt i at jeg får denne informasjonen fra API-er (som jeg vet er en mulighet for IOS og android): 

* fart
* retning
* posisjon
* fartsgrense
* vær
* mobilbruk

Car objektet vil lagre informasjon når fart > 10(km/t), når Car objektet har stått stille (fart = 0)
i en periode vil Ride objektet bli oppdatert på dette ved hjelp av grensesnittet "EventListener". 
Deretter vil Ride objektet kjøre en analyse ved hjelp av informasjon fra car objectet, men også 
informasjon fra Enviroment objektet. 

detaljert beskrivelse er kommentert i programmet. 


 
## oppgve 2 :traffic_light: ##