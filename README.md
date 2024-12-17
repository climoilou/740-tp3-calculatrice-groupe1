# Calculatrice
## Objectifs et critères d'évaluation

De la séance courante à la prochaine séance, vous devez être capable de concevoir de manière collaborative une solution logicielle inédite satisfaisant à la problématique du document de conception (développement d’un système de calculs).

Il vous faudra effectuer le développement d'une application native, ce qui comprend les éléments suivants.
1. Analyser le projet de développement de l’application.
   1. Analyse juste des documents de conception.
2. Préparer l’environnement de développement informatique.
   1. Configuration appropriée du système de gestion de versions.
   2. Importation correcte du code source.
3. Programmer la logique applicative.
   1. Programmation correcte des interactions entre l’interface graphique et l’utilisatrice ou l’utilisateur.
4. Contrôler la qualité de l’application.
   1. Application rigoureuse des plans de tests sur l’émulateur et sur la plateforme cible.
   2. Respect des procédures de suivi des problèmes et de gestion des versions.
   3. Respect des documents de conception.

## Mise en situation
Un professeur de mathématiques du secondaire vous demande de développer la version d’essai d’une calculatrice en application console pour ses élèves. Un de vos anciens collègues avait avancé le projet sans utiliser de tests automatisés.

Voici un extrait du document de conception concernant les tests à effectuer.

### Exponentiation
Les opérandes et le résultat de ce programme sont des entiers. Si le résultat possède des décimales, elles doivent être ignorées (le résultat sera tronqué).

Le client définit l’exponentiation de manière générale comme la multiplication du premier opérande du nombre de fois défini par le deuxième opérande entré par l’utilisateur.

Voici davantage de précisions concernant le résultat attendu.
- Pour des opérandes positifs, le résultat sera positif.
- Pour un premier opérande négatif:
  - Le résultat sera positif si le deuxième opérande est pair;
  - Le résultat sera négatif si le deuxième opérande est impair.
- Pour un premier opérande nul:
  - Le résultat sera nul si le deuxième opérande est positif;
  - Le calcul est impossible si le deuxième opérande est non positif (nul ou négatif).

Le client veut que la calculatrice arrête de fonctionner (qu’elle ne soit plus utilisable) dans le cas où le résultat serait impossible à calculer.

### Définitions mathématiques du client

#### Élément neutre
x: nombre quelconque; n: élément neutre; ∗: opérateur quelconque;

n est neutre si et seulement si x∗n=x et n∗x=x.

#### Élément absorbant
x: nombre quelconque; a: élément absorbant; ∗: opérateur quelconque;

a est absorbant si et seulement si x∗a=a et a∗x=a.

#### Nombre pair
Nombre entier se divisant par 2 sans laisser de reste.

#### Nombre impair
Nombre entier qui n'est pas pair.

#### Nombre entier
Nombre s’écrivant sans virgule.

#### Élément nul
Élément non négatif et non positif, dont la valeur est zéro.

## Rôles et responsabilités
| Activité      | Rôle enseignant                                                                                                                           | Rôle étudiant                                                                                                                                                                                        |
|---------------|-------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Enseignement  | Expliquer les exigences du document de conception.                                                                                        | Poser des questions au besoin.                                                                                                                                                                       |
| Apprentissage | Fournir un modèle  de règles et d’étiquettes collaboratives.                                                                              | Participer à la conception de règles et d’étiquettes collaboratives et modifier le modèle selon les besoins d’équipe. Importer le code source et développer la solution logicielle en collaboration. |
| Évaluation    | Commenter de manière formative dans les demandes de tirage en fonction des procédures collaboratives et des résultats des plans de tests. | Commenter de manière formative dans les demandes de tirage en fonction des procédures collaboratives et des résultats des plans de tests.                                                                                                                                                                         |

## Consignes

### Ressources
- Les membres de votre groupe (vos collègues);
- L'enseignant (représente le client);
- Un ordinateur de table du cégep muni d'une connexion internet filaire;
- Un navigateur Web (Edge) avec moteur de recherche intégré (Bing);
- Un environnement de développement (Java);
- Le logiciel Git;
- Un assistant de programmation (IntelliJ IDEA).

### Règles collaboratives
- Faire prévaloir le respect de tous les membres de l'équipe. Ex. ne pas utiliser de langage grossier ou inapproprié dans les commentaires de livrables ou dans les intitulés de versions de travail.
- Signaler au patron tout écart de conduite sérieux et nuisible au bon fonctionnement de l'équipe.
- Accepter les conséquences prévues pour de tels écarts de conduite dans la réalisation du travail d'équipe (un premier avertissement n'entraîne pas de conséquences).