INSERT INTO laboratoire VALUES('Laboratory for Foundations of Computer Science', 'LFCS', 'LFCS, School of Informatics Crichton Stree Edinburgh EH8 9LE', 'URLLABO');
INSERT INTO laboratoire VALUES('Department of Computer and Information Science University of Pennsylvania', 'CIS', '305 Levine/572 Levine North Department of Computer and Information Science  University of Pennsylvania  Levine Hall  3330 Walnut Street  Philadelphia, PA 19104-6389', 'URLLABO');
INSERT INTO laboratoire VALUES('Laboratoire de Recherche en Informatique', 'LRI', 'B�t 490 Universit� Paris-Sud 11 91405 Orsay Cedex France', 'URLLABO');
INSERT INTO laboratoire VALUES('Laboratoire Sp�cification et V�rification', 'LSV', 'ENS de Cachan, 61 avenue du Pr�sident Wilson, 94235 CACHAN Cedex, FRANCE', 'URLLABO');
INSERT INTO laboratoire VALUES('Distributed Programming Laboratory', 'LPD', 'Bat INR 326 Station 14 1015 Lausanne Switzerland ', 'http://lpd.epfl.ch/site/');
INSERT INTO laboratoire VALUES('Theory of Distributed Systems', 'TDS', '32 Vassar Street (32-G672A) Cambridge, MA 02139, USA', 'http://groups.csail.mit.edu/tds/');
INSERT INTO laboratoire VALUES('Microsoft Corporation', 'Microsoft', '1065 La Avenida Mountain View, CA 94043USA.', 'http://research.microsoft.com');
INSERT INTO laboratoire VALUES('INRIA Saclay - Ile-de-France', 'INRIA Saclay', 'Domaine de Voluceau Rocquencourt - BP 105 78153 Le Chesnay Cedex, France', 'http://www.inria.fr/centre/saclay');

INSERT INTO chercheur VALUES('peter@cis.upenn.edu', 'Buneman', 'Peter', 'http://homepages.inf.ed.ac.uk/opb/');
INSERT INTO chercheur VALUES('cohen@lri.fr','Cohen-Boulakia', 'Sarah','http://www.lri.fr/~cohen');
INSERT INTO chercheur VALUES('chris@lri.fr', 'Froidevaux', 'Christine', 'http://www.lri.fr/~chris/');
INSERT INTO chercheur VALUES('susan@cis.upenn.edu', 'Davidson', 'Susan', 'http://www.cis.upenn.edu/~susan/');
INSERT INTO chercheur VALUES('luc.segoufin@inria.fr', 'Segoufin', 'Luc', 'http://www-rocq.inria.fr/~segoufin/');
INSERT INTO chercheur VALUES('lamport@microsoft.com', 'Lamport', 'Leslie', 'http://www.lamport.org/');
INSERT INTO chercheur VALUES('lynch@theory.csail.mit.edu', 'Lynch', 'Nancy', 'http://people.csail.mit.edu/lynch/');
INSERT INTO chercheur VALUES('Rachid.Guerraoui@epfl.ch', 'Guerraroui', 'Rachid', 'http://lpdwww.epfl.ch/rachid/');

INSERT INTO Article VALUES('Adding Structure to Unstructured Data', ' We develop a new schema for unstructured data. Traditional schemas resemble the type systems of programming languages.', 'Long');
INSERT INTO article VALUES('A User-centric Framework for Accessing Biological Sources and Tools', 'We study the representation and querying of XML with incomplete information. We consider a simple model for XML data and their DTDs, a very simple query language, and a representation system for incomplete information in the spirit of the representations systems developed by Imielinski and Lipski for relational databases.', 'Long');
INSERT INTO article VALUES('PDiffView: Viewing the Difference in Provenance of Workflow Results','Provenance Difference Viewer (PDiffView) is a prototype based on these algorithms for differencing runs of SPFL specifications.','Court');
INSERT INTO article VALUES('Automata and Logics for Words and Trees over an Infinite Alphabet','In a data word or a data tree each position carries a label from a finite alphabet and a data value from some infinite domain. These models have been considered in the realm of semistructured data, timed automata and extended temporal logics. This paper survey several know results on automata and logics manipulating data words and data trees, the focus being on their relative expressive power and decidability.', 'Long');
INSERT INTO article VALUES('Representing and Querying XML with Incomplete Information','We study the representation and querying of XML with incomplete information. We consider a simple model for XML data and their DTDs, a very simple query language, and a representation system for incomplete information in the spirit of the representations systems developed by Imielinski and Lipski for relational databases. In the scenario we consider, the incomplete information about an XML document is continuously enriched by successive queries to the document.', 'Long');
INSERT INTO article VALUES('The TLA?+? Proof System: Building a Heterogeneous Verification Platform','Model checking has proved to be an efficient technique for finding subtle bugs in concurrent and distributed algorithms and systems. However, it is usually limited to the analysis of small instances of such systems, due to the problem of state space explosion. When model checking finds no more errors, one can attempt to verify the correctness of a model using theorem proving, which also requires efficient tool support.', 'Long');
INSERT INTO article VALUES('Partial reversal acyclicity','Partial Reversal (PR) is a link reversal algorithm which ensures that an initially directed acyclic graph (DAG) is eventually a destination-oriented DAG. While proofs exist to establish the acyclicity property of PR, they rely on assigning labels to either the nodes or the edges in the graph. In this work we show that such labeling is not necessary and outline a simpler direct proof of the acyclicity property.', 'Court');
INSERT INTO article VALUES('Reliably Detecting Connectivity Using Local Graph Traits', 'This paper studies local graph traits and their relationship with global graph properties. Specifically, we focus on graph k-connectivity. First we prove a negative result that shows there does not exist a local graph trait which perfectly captures graph k-connectivity. We then present three different local graph traits which can be used to reliably predict the k-connectivity of a graph with varying degrees of accuracy.','Long');
INSERT INTO article VALUES('Generalized Universality', 'This paper presents, two decades after k-set consensus was introduced, the generalization with k?>?1 of state machine replication. We show that with k-set consensus, any number of processes can emulate k state machines of which at least one remains highly available. While doing so, we also generalize the very notion of consensus universality. ', 'Long');
INSERT INTO article VALUES('Transactional Memory: Glimmer of a Theory', 'Transactional memory (TM) is a promising paradigm for concurrent programming. This paper is an overview of our recent theoretical work on defining a theory of TM. We first recall some TM correctness properties and then overview results on the inherent power and limitations of TMs.', 'Tutoriel');


insert into publier values('Adding Structure to Unstructured Data', 'ICDT', 1997);
insert into publier values('A User-centric Framework for Accessing Biological Sources and Tools', 'DILS', 2005);
insert into publier values('Representing and Querying XML with Incomplete Information', 'TODS', 2006);
insert into publier values('PDiffView: Viewing the Difference in Provenance of Workflow Results', 'VLDB', 2009);
insert into publier values('Automata and Logics for Words and Trees over an Infinite Alphabet', 'CLS', 2006);
insert into publier values('The TLA?+? Proof System: Building a Heterogeneous Verification Platform', 'ICTAC', 2009);
insert into publier values('Partial reversal acyclicity', 'PODC', 2011);
insert into publier values('Reliably Detecting Connectivity Using Local Graph Traits', 'OPODIS', 2010);
insert into publier values('Generalized Universality', 'CONCUR', 2011);
insert into publier values('Transactional Memory: Glimmer of a Theory', 'CAV', 2010);

insert into travailler values('peter@cis.upenn.edu', 'Laboratory for Foundations of Computer Science');
insert into travailler values('susan@cis.upenn.edu', 'Department of Computer and Information Science University of Pennsylvania');
insert into travailler values('peter@cis.upenn.edu', 'Department of Computer and Information Science University of Pennsylvania');
insert into travailler values('cohen@lri.fr', 'Laboratoire de Recherche en Informatique');
insert into travailler values('chris@lri.fr', 'Laboratoire de Recherche en Informatique');
insert into travailler values('luc.segoufin@inria.fr', 'Laboratoire Sp�cification et V�rification');
insert into travailler values('luc.segoufin@inria.fr', 'INRIA Saclay - Ile-de-France');
insert into travailler values('lamport@microsoft.com', 'Microsoft Corporation');
insert into travailler values('lynch@theory.csail.mit.edu', 'Theory of Distributed Systems');
insert into travailler values('Rachid.Guerraoui@epfl.ch', 'Distributed Programming Laboratory');
insert into travailler values('Rachid.Guerraoui@epfl.ch', 'INRIA Saclay - Ile-de-France');

insert into support values('ICDT', 'Conference');
insert into support values('DILS', 'Conference');
insert into support values('TODS', 'Journal');
insert into support values('VLDB', 'Journal');
insert into support values('CLS', 'Conference');
insert into support values('CAV', 'Conference');
insert into support values('CONCUR', 'Conference');
insert into support values('OPODIS', 'Conference');
insert into support values('PODC', 'Conference');
insert into support values('ICTAC', 'Conference');

Insert into Ecrire values('peter@cis.upenn.edu', 'Adding Structure to Unstructured Data');
Insert into Ecrire values('susan@cis.upenn.edu', 'Adding Structure to Unstructured Data');
Insert into Ecrire values('susan@cis.upenn.edu', 'A User-centric Framework for Accessing Biological Sources and tools');
Insert into Ecrire values('cohen@lri.fr', 'A User-centric Framework for Accessing Biological Sources and tools');
Insert into Ecrire values('chris@lri.fr', 'A User-centric Framework for Accessing Biological Sources and tools');
Insert into Ecrire values('luc.segoufin@inria.fr', 'Automata and Logics for Words and Trees over an Infinite Alphabet');
Insert into Ecrire values('luc.segoufin@inria.fr','Representing and Querying XML with Incomplete Information');
Insert into Ecrire values('Rachid.Guerraoui@epfl.ch', 'Generalized Universality');
Insert into Ecrire values('Rachid.Guerraoui@epfl.ch', 'Transactional Memory: Glimmer of a Theory');
Insert into Ecrire values('lynch@theory.csail.mit.edu', 'Reliably Detecting Connectivity Using Local Graph Traits');
Insert into Ecrire values('lynch@theory.csail.mit.edu', 'Partial reversal acyclicity');
Insert into Ecrire values('lamport@microsoft.com', 'The TLA?+? Proof System: Building a Heterogeneous Verification Platform');


Insert into Annotation values('data');
Insert into Annotation values('bio');
Insert into Annotation values('workflow');
Insert into Annotation values('theory');
Insert into Annotation values('XML');
Insert into Annotation values('Concurrency');
Insert into Annotation values('TLA');
Insert into Annotation values('Consencus');
Insert into Annotation values('Graph');
Insert into Annotation values('Reliability');

/**NOTER**/

INSERT into Noter VALUES('lamport@microsoft.com', 'Automata and Logics for Words and Trees over an Infinite Alphabet', 4);
INSERT into Noter VALUES('lamport@microsoft.com', 'A User-centric Framework for Accessing Biological Sources and Tools', 3);
INSERT into Noter VALUES('Rachid.Guerraoui@epfl.ch', 'Representing and Querying XML with Incomplete Information', 5);
INSERT into Noter VALUES('Rachid.Guerraoui@epfl.ch', 'PDiffView: Viewing the Difference in Provenance of Workflow Results', 1);
INSERT into Noter VALUES('Rachid.Guerraoui@epfl.ch', 'A User-centric Framework for Accessing Biological Sources and Tools', 2);
INSERT into Noter VALUES('Rachid.Guerraoui@epfl.ch', 'Adding Structure to Unstructured Data', 1);
INSERT into Noter VALUES('cohen@lri.fr', 'PDiffView: Viewing the Difference in Provenance of Workflow Results', 1);
INSERT into Noter VALUES('cohen@lri.fr', 'A User-centric Framework for Accessing Biological Sources and Tools', 2);
INSERT into Noter VALUES('peter@cis.upenn.edu', 'Automata and Logics for Words and Trees over an Infinite Alphabet', 1);
INSERT into Noter VALUES('peter@cis.upenn.edu', 'A User-centric Framework for Accessing Biological Sources and Tools', 2);
INSERT into Noter VALUES('luc.segoufin@inria.fr', 'PDiffView: Viewing the Difference in Provenance of Workflow Results', 5);
INSERT into Noter VALUES('luc.segoufin@inria.fr', 'Representing and Querying XML with Incomplete Information',1);
INSERT into Noter VALUES('luc.segoufin@inria.fr', 'A User-centric Framework for Accessing Biological Sources and Tools', 4);
INSERT into Noter VALUES('luc.segoufin@inria.fr', 'Automata and Logics for Words and Trees over an Infinite Alphabet', 1);
INSERT into Noter VALUES('luc.segoufin@inria.fr', 'Adding Structure to Unstructured Data', 4);


/**Annoter**/
INSERT into ANNoter VALUES('lamport@microsoft.com', 'The TLA?+? Proof System: Building a Heterogeneous Verification Platform', 'TLA');
INSERT into AnNoter VALUES('Rachid.Guerraoui@epfl.ch', 'Partial reversal acyclicity', 'Graph');
INSERT into AnNoter VALUES('Rachid.Guerraoui@epfl.ch', 'Reliably Detecting Connectivity Using Local Graph Traits', 'Reliability');
INSERT into AnNoter VALUES('cohen@lri.fr', 'Automata and Logics for Words and Trees over an Infinite Alphabet', 'theory');
INSERT into AnNoter VALUES('peter@cis.upenn.edu', 'Adding Structure to Unstructured Data', 'XML');
INSERT into AnNoter VALUES('peter@cis.upenn.edu', 'A User-centric Framework for Accessing Biological Sources and Tools', 'bio');
INSERT into AnNoter VALUES('peter@cis.upenn.edu', 'PDiffView: Viewing the Difference in Provenance of Workflow Results', 'workflow');
INSERT into AnNoter VALUES('luc.segoufin@inria.fr', 'Adding Structure to Unstructured Data', 'data');
INSERT into ANNoter VALUES('lynch@theory.csail.mit.edu', 'Generalized Universality', 'consencus');
INSERT into ANNoter VALUES('lynch@theory.csail.mit.edu', 'Transactional Memory: Glimmer of a Theory', 'Concurrency');

--Trigger

--trigger sur ecrire verifiant qu'une note est d'un chercheur  qui n'est pas co auteur d'un article

CREATE OR REPLACE TRIGGER verif_note BEFORE
    INSERT OR UPDATE ON Noter
    for each row
    declare
        titre       int ;
        v_email     VARCHAR2(500);
        v_titre     VARCHAR2(500);
        v_titrenote varchar2(500);
        v_chercheur VARCHAR2(500);
    begin

      select distinct titre into v_titre from ecrire where ecrire.email =: new.email and ecrire.TITRE =: new.titre; --selectionne les titres étant travaillé par nouvel email/chercheur
   	--liste des titres du newemail

      select distinct titre into v_titrenote from noter where noter.TITRE =: new.TITRE;

	select distinct email into v_email from ecrire where ecrire.titre =: new.titre and ecrire.EMAIL =: new.email; --selectionne les emails/chercheur travaillant sur nouveau titre
	--liste des emails du newtitre

    select distinct email into v_chercheur FROM noter where noter.email =: new.email;


        if v_email = v_chercheur THEN
            raise_application_error(-20001, 'Impossible d' || '''' || 'inserer la' || 'note');
       end if;

    exception when no_data_found then if v_titre = v_titrenote then
            raise_application_error(-20001, 'Impossible d' || '''' || 'inserer la' || 'note');
    end if;

    end;

--Test :

insert into noter values('susan@cis.upenn.edu', 'Adding Structure to Unstructured Data', 6); --doit y avoir une erreur

delete from noter where email = 'susan@cis.upenn.edu';

INSERT into Noter VALUES('peter@cis.upenn.edu', 'Adding Structure to Unstructured Data', 1);

insert into noter values('susan@cis.upenn.edu', 'PDiffView: Viewing the Difference in Provenance of Workflow Results', 6); --doit y avoir une erreur



select distinct email from ecrire where ecrire.titre =  'Adding Structure to Unstructured Data' and ecrire.EMAIL = 'susan@cis.upenn.edu';
select distinct email from noter where noter.titre =  'Adding Structure to Unstructured Data';
select titre from noter;






--Trigger2

CREATE OR REPLACE TRIGGER maj_annoter AFTER
INSERT OR UPDATE ON annoter
FOR EACH ROW
declare

v_date Date;
v_email varchar2(500);

BEGIN

select sysdate into v_date from dual;
--select email into v_email from annoter where email =: new.EMAIL;



IF INSERTING THEN
v_email := :new.email;
insert into log_chercheurs values(v_email, v_date, 'Insertion');
END IF;

IF UPDATING THEN
v_email := :old.email;
insert into log_chercheurs values(v_email, v_date, 'Update');
END IF;


END;


--Table Log chercheur
drop table log_chercheurs;

create table log_chercheurs(

email varchar2(500) NOT NULL,
dateJour DATE,
type varchar2(500) NOT NULL,
Primary KEY (email, DateJour)

);


--Test:

insert into annoter values('Rachid.Guerraoui@epfl.ch', 'The TLA?+? Proof System: Building a Heterogeneous Verification Platform', 'workflow' );
insert into annoter values('Rachief', 'The TLA?+? Proofsfd: Building a Heterogeneous Verification Platform', 'qqchodr' );
select * from log_chercheurs;

update annoter set LIBELLE = 'toto' where LIBELLE = 'consencus';

select * from annoter;

select sysdate from dual;

