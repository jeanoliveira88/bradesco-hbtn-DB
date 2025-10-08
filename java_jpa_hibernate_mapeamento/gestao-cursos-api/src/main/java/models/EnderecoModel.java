package models;

import entities.Endereco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EnderecoModel {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao-cursos-jpa");
    EntityManager em = emf.createEntityManager();

    public void create(Endereco endereco) {
        try {
            System.out.println("Iniciando a transação");
            em.getTransaction().begin();
            em.persist(endereco);
            em.getTransaction().commit();
            System.out.println("curso criado com sucesso !!!");
        } catch (Exception e) {
            em.close();
            System.err.println("Erro ao criar um curso !!!" + e.getMessage());
        }
    }
}
