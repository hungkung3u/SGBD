Drop Table Article;
Drop Table Chercheur;
Drop Table Laboratoire;
Drop Table Support;
Drop Table Annotation;
Drop Table Ecrire;
Drop Table Publier;
Drop Table Travailler;
Drop Table Annoter;
Drop Table Noter;

Create TABLE Article(
  Titre VARCHAR2(500),
  Resume VARCHAR2(500),
  TypeArticle VARCHAR2(500),
  PRIMARY KEY (Titre)
  );

CREATE TABLE Chercheur(
  Email VARCHAR2(500),
  NomChercheur VARCHAR2(500),
  PrenomChercheur VARCHAR2(500),
  UrlChercheur VARCHAR2(500),
  PRIMARY KEY (email)
  );

CREATE TABLE Laboratoire(
  Nomlabo VARCHAR2(500),
  SigleLabo VARCHAR2(500),
  AdresseLabo VARCHAR2(500),
  UrlLabo VARCHAR2(500),
  Primary KEY (NomLabo)
);

CREATE TABLE Support(
  NOMSUPPORT VARCHAR2(500),
  TYPESUPPORT VARCHAR2(500),
  Primary KEY (NOMSUPPORT)
);

CREATE TABLE Annotation(
  LIBELLE VARCHAR2(500),
  Primary KEY ( LIBELLE)
);


CREATE TABLE Ecrire(
  EMAIL VARCHAR2(500),
  TITRE VARCHAR2(500),
  Primary KEY ( EMAIL, TITRE)
);

CREATE TABLE Publier(
  TITRE VARCHAR2(500),
  NOMSUPPORT VARCHAR2(500),
  ANNEE_PUBLICATION Number(38),
  Primary KEY ( TITRE, NOMSUPPORT)
);

CREATE TABLE Travailler(
  EMAIL VARCHAR2(500),
  NOMLABO VARCHAR2(500)
);

CREATE TABLE Annoter(
  EMAIL VARCHAR2(500),
  TITRE VARCHAR2(500),
  LIBELLE VARCHAR2(500),
  Primary KEY (EMAIL, TITRE, LIBELLE)
);

CREATE TABLE Noter(
  EMAIL VARCHAR2(500),
  TITRE VARCHAR2(500),
  NOTE NUMBER(38),
  Primary KEY (Email, Titre)
);





SELECT * FROM article WHERE titre = (SELECT titre FROM ecrire WHERE email = 'peter@cis.upenn.edu');

Select * from Ecrire;



SELECT * FROM article WHERE titre = (SELECT titre FROM ecrire WHERE email = 'Rachid.Guerraoui@epfl.ch')


Select * from Article natural join Ecrire WHERE titre = (SELECT titre FROM ecrire WHERE email = 'Rachid.Guerraoui@epfl.ch');


SELECT titre FROM ecrire WHERE email = 'Rachid.Guerraoui@epfl.ch';


--Select Email from Ecrire where TITRE = (Select titre from ecrire where email = "");

--Select * from Travailler order by EMAIL;



SELECT email from Noter where (SELECT COUNT(*) FROM Noter where EMAIL = 'luc.segoufin@inria.fr')  > 2 AND EMAIL = 'luc.segoufin@inria.fr';


SELECT email from Noter where (SELECT COUNT(*) FROM Noter where EMAIL = 'cohen@lri.fr')  > 2 AND EMAIL = 'cohen@lri.fr';


Select avg(cast(note as float)) from Noter where EMAIL = 'peter@cis.upenn.edu';

Select avg(note) from Noter where EMAIL = 'peter@cis.upenn.edu';



Select sum(note) from Noter where EMAIL = 'luc.segoufin@inria.fr';

Select count(NOTE) from Noter where EMAIL = 'luc.segoufin@inria.fr';


--SELECT count(*),   from

--Q6

SELECT EMAIL from Travailler where NOMLABO = pNomLabo;
--nb article
SELECT count(*) from Ecrire where EMAIL = 'susan@cis.upenn.edu';

SELECT avg(NOTE) from Noter where TITRE =
                                  ;
SELECT sum(NOTE) from NOTER where TITRE = '';

SELECT sum(NOTE) from NOTER where TITRE = 'Adding Structure to Unstructured Data';

