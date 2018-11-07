package co.edu.pdam.eci.persistenceapiintegration.data.entity;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

/**
 * @author Santiago Carrillo
 */

@Entity
public abstract class BaseEntity
    implements Serializable
{
    private static final long serialVersionUID = 1L;

    @DatabaseField( generatedId = true )
    @PrimaryKey
    Long id;

    public Long getId()
    {
        return id;
    }
}
