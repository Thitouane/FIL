<?xml version="1.0" encoding="UTF-8"?>
<mm:FIL xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:mm="http://www.example.org/mm" name="Portail">
  <composeDesFormations name="Master">
    <composeDesMentions description="master mention informatique" name="Info" responsableFormation="//@enseignantsChercheurs.0">
      <composeDeSemestres name="1">
        <composesDesUEs name="ACT" nbECTS="6">
          <semainier name="Cours">
            <composeDeSemaines ressourcepedagogique="//@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.0/@ressourcepedagogique.0" Début="29/11/21" Fin="05/12/21" Remarque="une semaine"/>
            <composeDeSemaines ressourcepedagogique="//@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.0/@ressourcepedagogique.0" Début="06/12/21" Fin="12/12/21"/>
          </semainier>
          <ressourcepedagogique name="act_ressources" contenu="R"/>
        </composesDesUEs>
        <composesDesUEs name="PJE" enseignants="//@enseignantsChercheurs.2"/>
        <composesDesUEs name="IIR"/>
        <composesDesUEs name="Anglais"/>
        <composesDesUEs name="TAC"/>
        <composesDesUEs name="IDM" enseignants="//@enseignantsChercheurs.2 //@enseignantsChercheurs.1"/>
      </composeDeSemestres>
      <composeDeSemestres name="2">
        <composesDesUEs name="ASE"/>
        <composesDesUEs name="ISI"/>
        <composesDesUEs name="PJI"/>
        <composesDesUEs name="ASA"/>
        <composesDesUEs name="SR1"/>
        <composesDesUEs name="SR2"/>
        <composesDesUEs name="BDR"/>
        <composesDesUEs name="IIHM"/>
      </composeDeSemestres>
      <composeDesParcours semestres="//@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1" ueObligatoires="//@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.0 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.3 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.3 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.0 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.6 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.7 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.2 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.1 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.4 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.2 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.5 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.4" ueOptionelles="//@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.5" name="e-services" responsableParcours="//@enseignantsChercheurs.3"/>
      <composeDesParcours semestres="//@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1" ueObligatoires="//@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.0 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.3 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.3 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.0 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.6 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.5 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.2 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.1 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.5 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.4 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.1/@composesDesUEs.2 //@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.1" ueOptionelles="//@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.4" name="genie logiciel" responsableParcours="//@enseignantsChercheurs.4"/>
    </composeDesMentions>
    <composeDesMentions name="MIAGE" ueOptionnelles="//@composeDesFormations.0/@composeDesMentions.0/@composeDeSemestres.0/@composesDesUEs.5">
      <composeDeSemestres name="1">
        <composesDesUEs description="on apprend le miage" name="miage" enseignants="//@enseignantsChercheurs.5">
          <semainier name="miage">
            <composeDeSemaines ressourcepedagogique="//@composeDesFormations.0/@composeDesMentions.1/@composeDeSemestres.0/@composesDesUEs.0/@ressourcepedagogique.0" Début="ajd" Fin="demain" Remarque="journée miage"/>
          </semainier>
          <ressourcepedagogique name="miage" contenu="le miage"/>
        </composesDesUEs>
      </composeDeSemestres>
    </composeDesMentions>
  </composeDesFormations>
  <enseignantsChercheurs name="Romain Rouvroy"/>
  <enseignantsChercheurs name="Xavier Lepallec"/>
  <enseignantsChercheurs name="Cedric Dumoulin"/>
  <enseignantsChercheurs name="Jean-Claude Tarby"/>
  <enseignantsChercheurs name="Clement Quinton"/>
  <enseignantsChercheurs name="Mr. Miage"/>
</mm:FIL>