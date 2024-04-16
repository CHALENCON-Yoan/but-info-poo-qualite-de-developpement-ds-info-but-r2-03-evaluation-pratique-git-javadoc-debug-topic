# Evaluation-Pratique

Ce dépôt contient le sujet de l'évaluation pratique de la ressource R2.03. Il permet de vérifier
les compétences suivantes :

- **Gestion de versions** (_git_ / _Gitlab_) :
  - Effectuer un fork d'un dépôt _Gitlab_.
  - Effectuer des commits, envoyer les commits sur _Gitlab_.
- **Utilisation d'un IDE** (_IntelliJ_) :
  - Créer un nouveau projet en clonant un dépôt _Gitlab_.
  - Ajuster la configuration d'un projet (compilateur, ...).
  - Générer la documentation Javadoc d'un projet.
  - Exécuter une application et visualiser la trace d'exécution.
  - Placer un point d'arrêt (conditionnel ou non) et exécuter une application en mode _debug_.
  - Exécuter pas-à-pas (_step into_ / _step over_), observer les variables.

La suite décrit les étapes à valider.

# Etape 0

- Effectuer un **fork** du dépôt.
- **Cloner** le dépôt depuis _IntelliJ_.
- Ajuster les **propriétés du projet** pour compiler avec un JDK >= 11 et le niveau de compatibilité par défaut du JDK.
- **Exécuter** l'application `SetupMain` située dans le paquetage par défaut.
- **Créer un nouveau sous-répertoire `traces`** à la **racine du projet** (au même niveau que `src`).
- Copier/coller la **trace d'exécution** (vue `console`) dans un sous-répertoire `traces` du projet et dans un fichier nommé `step0.txt`.
- **Effectuer un commit** des modifications, en indiquant `Step0-Run` comme résumé.
- **Pousser ce commit** sur _GitLab_.
- **Créer un nouveau sous-répertoire `docs`** à la **racine du projet** (au même niveau que `src` et `traces`).
- **Générer la Javadoc (complète et privée)** dans un sous-répertoire `docs` du projet.
- **Effectuer un commit** de l'ensemble des modifications, en indiquant `Step0-Javadoc` comme résumé.
- **Pousser ce commit** sur _GitLab_.

# Etape 1

- **Exécuter normalement (`run`)** l'application `MainStep1` située dans le paquetage par défaut.
- Copier/coller la **trace d'exécution** dans le sous-répertoire `traces` et dans un fichier nommé `step1-problem.txt`.
- **Effectuer un commit des modifications**, en indiquant `Step1-Problem` comme résumé et en indiquant comme détail la **nature du problème**.
- Pousser ce commit sur _GitLab_.
- **Placer un point d'arrêt** sur la ligne de code où l'exception est **initialement soulevée**.
- Effectuer une **capture d'écran** montrant que ce point d'arrêt est placé correctement.
- **Créer un nouveau sous-répertoire `screenshots`** à la **racine du projet** (au même niveau que `src` et `docs`).
- **Sauvegarder** la capture d'écran au format `png` dans le sous-répertoire `screenshots`, et nommer le fichier `step1_01.png`.
- **Exécuter l'application en mode _debug_**.
- Effectuer une **capture d'écran** montrant :
  - que l'exécution s'est bien arrêtée à l'instruction voulue
  - que le tableau dont la référence est dans l'attribut `vehicles` de l'objet courant ne contient que des références nulles (vue _Debugger_)
- **Arrêter l'exécution**.
- **Déplacer** cette capture d'écran au format `png` dans le sous-répertoire `screenshots`, et nommer le fichier `step1_02.png`.
- **Effectuer un commit de l'ensemble des modifications**, en indiquant `Step1-Debug` comme résumé, et comme détail **où et comment il faudrait résoudre le problème** (l'idée générale, pas de code).
- **Pousser ce commit** sur _GitLab_.

# Etape 2

- **Supprimer le point d'arrêt** posé précédemment.
- **Exécuter normalement** l'application `MainStep2`.
- **Copier/coller la trace d'exécution, à partir de la représentation du plateau à la dernière étape**, dans le sous-répertoire `traces` du projet et dans un fichier nommé `step2-problem.txt`.
- **Placer un point d'arrêt** de sorte de pouvoir interrompre l'exécution **après l'affichage de la réprésentation du plateau au tour `0`** (avant le premier mouvement).
- **Exécuter en mode _debug_** l'application `MainStep2`.
- Effectuer une **capture d'écran** montrant à la fois :
  - que l'exécution s'est bien arrêtée à l'instruction voulue
  - la vue `console` (représentation du plateau au tour `0`)
- **Arrêter l'exécution**.
- **Déplacer** cette capture d'écran au format `png` dans le sous-répertoire `screenshots`, et nommer le fichier `step2_01.png`
- A l'aide du code de la méthode `main` et de la vue `console`, identifier le problème (pas la solution)
- **Effectuer un commit de l'ensemble des modifications**, en indiquant `Step2-Problem` comme résumé et en expliquant comme détail **quel est le problème**.
- **Pousser ce commit** sur _GitLab_.
- **Supprimer le point d'arrêt** posé précédemment.
- **Placer un point d'arrêt conditionnel** à la ligne `111` de la classe `RushHourGameBoard` ( ligne `if (vehicle.isAt(position))` ...), pour interrompre l'exécution si **simultanément** :
  - le paramètre `position` désigne `(0, 1)` (comparer avec `isSame` ;-) )
  - la variable `vehicle` désigne le véhicle de couleur `GREEN`
- **Exécuter en mode _debug_** l'application `MainStep2`.
- Effectuer une **capture d'écran** montrant à la fois :
  - que l'exécution s'est bien arrêtée à l'instruction voulue (et que le point d'arrêt est conditionnel)
  - la popup `breakpoints` (accessible via _view breakpoints_), pour visualiser la condition associée au point d'arrêt
- **Déplacer** cette capture d'écran au format `png` dans le sous-répertoire `screenshots`, et nommer le fichier `step2_02.png`.
- **Fermer** la popup `breakpoints`
- **Exécuter un pas** (_Step Over_).
- Effectuer une **capture d'écran** montrant que l'exécution s'arrête sur l'instruction `return`
- **Arrêter l'exécution**.
- **Déplacer** cette capture d'écran au format `png` dans le sous-répertoire `screenshots`, et nommer le fichier `step2_03.png`.
- **Modifier la condition** du point d'arrêt pour que la position voulue ne soit plus `(0,1)` mais (`0,0`).
- **Exécuter en mode _debug_** l'application `MainStep2`.
- Effectuer une **capture d'écran** montrant à la fois :
  - que l'exécution s'est bien arrêtée à l'instruction voulue
  - la popup `breakpoints` (accessible via _view breakpoints_), pour visualiser la condition associée au point d'arrêt
- **Déplacer** cette capture d'écran au format `png` dans le sous-répertoire `screenshots`, et nommer le fichier `step2_04.png`.
- **Fermer** la popup `breakpoints`
- **Exécuter un pas** (_Step Over_).
- Effectuer une **capture d'écran** montrant que l'exécution ne s'arrête pas sur l'instruction `return`.
- **Arrêter l'exécution**
- **Déplacer** cette capture d'écran au format `png` dans le sous-répertoire `screenshots`, et nommer le fichier `step2_05.png`.
- **Effectuer un commit de l'ensemble des modifications**, en indiquant `Step2-Debug` comme résumé.
- **Pousser ce commit** sur _GitLab_.
- **Corriger** la méthode `isAt` de la classe `Vehicle` puisque le véhicle occupe à la fois les positions `(0,0)` et `(0,1)`.
- **Se replacer dans les conditions** permettant d'interrompre l'exécution après l'affichage de la représentation du plateau au tour `0`.
- Copier/coller la **trace d'exécution** dans le sous-répertoire `traces` et dans un fichier nommé `step2-fixed.txt`.
- **Effectuer un commit de l'ensemble des modifications**, en indiquant `Step2-Fixed` comme résumé.
- **Pousser ce commit** sur _GitLab_.

# Etape 3

*Certaines exécutions de l'application `Step2Main` montrent encore un dysfonctionnement à la fin de la partie.*

- **Executer normalement** l'application `MainStep2` **jusqu'à faire apparaitre le dysfonctionnement**.
- Copier/coller une **trace d'exécution manifestant ce dysfonctionnement, à partir de la représentation du plateau à la dernière étape**, dans le sous-répertoire `traces`,  dans un fichier nommé `step3-problem.txt`.
- **Effectuer un commit de l'ensemble des modifications**, en indiquant `Step3-Problem` comme résumé et en expliquant comme détail **quel est le problème observé**.
- **Pousser ce commit** sur _GitLab_.
- **Placer un point d'arrêt** (conditionnel) à l'**endroit approprié** pour manifester le problème.
- **Exécuter en mode _debug_** l'application `MainStep2`.
- Effectuer une **capture d'écran** montrant à la fois :
  - que l'exécution s'est bien arrêtée à l'instruction voulue
  - la popup `breakpoints` (accessible via _view breakpoints_), pour visualiser la condition associée au point d'arrêt
- **Arrêter l'exécution**.
- **Déplacer** cette capture d'écran au format `png` dans le sous-répertoire `screenshots`, et nommer le fichier `step3_01.png`.
- **Effectuer un commit de l'ensemble des modifications**, en indiquant `Step3-Problem` comme résumé et en expliquant comme détail quel est le problème.
- **Pousser ce commit** sur _GitLab_.
- **Corriger** le problème.
- **Effectuer un commit de l'ensemble des modifications**, en indiquant `Step3-Fixed` comme résumé et en expliquant comme détail quel est le problème.
- Pousser ce commit sur _GitLab_.
