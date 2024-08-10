# 120 Calculatrice
## Fonctionnement de l'application
L’application affiche une calculette qui fonctionne de la même manière que la calculatrice Windows. Notre calculette ne peut faire qu'un seul calcul à la fois, ensuite on clear et on fait le calcul suivant. 
Il faut gérer spécifiquement certaines situations:
- Au démarrage ou au clear, l'affichage affiche 0
- Si l'affichage affiche 0, le fait d'appuyer sur 0 ou ± ne change pas l'affichage
- Si l'affichage affiche 0, le fait d'appuyer sur "." l'affichage affiche "0."
Le choix des couleurs est libre mais nécessaire.
## Diagramme d'activité de l'application
![image](https://github.com/user-attachments/assets/7010524b-1f90-4445-a586-32b29e55d825)
## Interface homme-machine
### Application au démarrage
![image](https://github.com/user-attachments/assets/cfeaf9e4-677a-4104-a201-63e51bbc071d)
### En cours de fonctionnement
![image](https://github.com/user-attachments/assets/6507f8ff-6c44-41fa-92a5-46d6dd6c7b75)
### Changement de signe
![image](https://github.com/user-attachments/assets/f0749483-8461-40d7-9eb5-a9be8fa46091)
## Fonctionnement interne
Le Modèle_120 sépare la partie affichage (ihm-ctrl) de la partie intelligente (metier), vous devez conserver ce principe dans votre conception (voir diagramme d’activité). 
Pour faire un calcul, effectué lors de l'appui du =, il est nécessaire d'avoir:
- Un premier nombre (caché)
- Un opérateur
- Un deuxième nombre (visible)
En interne, il est possible de travailler avec des doubles ou des Strings et il faut être judicieux au moment où l'un des quatre opérateurs est sélectionné.
