# Design-Pattern Exercices 
## Modélisation du Logiciel -- TP : Codage de Design Patterns 
### Prof: M. Richard DUFOUR - Avignon Université

## Abstract Factory
Nous souhaitons mettre en place un système permettant de créer des boutons ainsi que des menus.
Un des problèmes qui se pose est que, selon le système d’exploitation (par ex. MacOS et Windows)
de l’utilisateur, les boutons ainsi que les menus s’affichent différemment.
Proposez une implémentation de ce problème (sans passer par les interfaces graphiques, mais en les
simulant) avec implémentation du pattern Singleton.
## Builder
Nous voulons réaliser une application permettant de construire des objets de type Véhicule, ici des
motos ainsi que des voitures. Chaque véhicule possède un nombre de roues, qui ont leurs propres
caractéristiques (taille, charge maxi…).
Question 1 : Proposez une implémentation de ce problème, en considérant ici que Roue est bien
entendu une classe.
Question 2 : Proposez un diagramme de séquence pour modéliser l’échange de messages entre les
objets.

## Composite
Nous souhaitons modéliser une hiérarchie d’employés au sein d’une entreprise. Parmi ces
employés, nous distinguons les employés classiques et les managers. Tous les employés ont un
nom, un prénom, une adresse et font tous partie d’un service particulier (DRH, comptabilité,
informatique…).
Les employés classiques ont, en plus, un nombre d’heures de travail hebdomadaire qui leur est
assigné, ainsi qu’un taux horaire.
Les managers ont, eux, un ensemble d’employés sous leur responsabilité : selon leur niveau
hiérarchique, ils peuvent être responsables d’employés classiques, mais également d’autres
managers. Enfin, les managers, qui ne sont pas au taux horaire, ont un salaire fixe mensuel.
Question : Proposez une modélisation de ce problème, puis implémentez la solution. Nous devrions
pouvoir, au sein de l’entreprise, connaître les différents employés, éventuellement les personnes
qu’ils managent selon leur responsabilité, et enfin leur salaire mensuel.
## Adapter
Une entreprise souhaite pouvoir gérer un ensemble de documents pouvant être de nature différente
(Texte, HTML ou PDF). Ces classes ne possèdent qu’une seule méthode permettant d’afficher le
document : il implémente alors une interface commune Document qui ne propose qu’une méthode
afficheDocument().
Une classe composantPDF existe déjà, mais ne propose pas la méthode afficheDocument(), mais la
méthode afficheNom() et afficheVersion(). Ces deux infos se trouvent maintenant dans la méthode
afficheDocument().
Question : Proposez une solution (modélisation + implémentation) de ce problème
