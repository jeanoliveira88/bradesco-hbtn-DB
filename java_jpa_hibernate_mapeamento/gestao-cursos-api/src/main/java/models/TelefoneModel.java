package models;

import entities.Telefone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TelefoneModel {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao-cursos-jpa");
    EntityManager em = emf.createEntityManager();

    public void create(Telefone telefone) {
        try {
            System.out.println("Iniciando a transação");
            em.getTransaction().begin();
            em.persist(telefone);
            em.getTransaction().commit();
            System.out.println("curso criado com sucesso !!!");
        } catch (Exception e) {
            em.close();
            System.err.println("Erro ao criar um curso !!!" + e.getMessage());
        }
    }
}
