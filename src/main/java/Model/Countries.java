/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "Countries", catalog = "booktique", schema = "dbo")
@NamedQueries(
{
    @NamedQuery(name = "Countries.findAll", query = "SELECT c FROM Countries c"),
    @NamedQuery(name = "Countries.findById", query = "SELECT c FROM Countries c WHERE c.id = :id"),
    @NamedQuery(name = "Countries.findByName", query = "SELECT c FROM Countries c WHERE c.name = :name")
})
public class Countries implements Serializable
{

    @Column(name = "ISO")
    private String iso;
    @Column(name = "PrintableName")
    private String printableName;
    @Column(name = "ISO3")
    private String iso3;
    @Column(name = "NumCode")
    private Short numCode;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @OneToMany(mappedBy = "countryId")
    private List<Staffs> staffsList;
    @OneToMany(mappedBy = "countryId")
    private List<BookTitles> bookTitlesList;
    @OneToMany(mappedBy = "countryId")
    private List<Readers> readersList;
    @OneToMany(mappedBy = "countryId")
    private List<Publishers> publishersList;

    public Countries()
    {
    }

    public Countries(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Staffs> getStaffsList()
    {
        return staffsList;
    }

    public void setStaffsList(List<Staffs> staffsList)
    {
        this.staffsList = staffsList;
    }

    public List<BookTitles> getBookTitlesList()
    {
        return bookTitlesList;
    }

    public void setBookTitlesList(List<BookTitles> bookTitlesList)
    {
        this.bookTitlesList = bookTitlesList;
    }

    public List<Readers> getReadersList()
    {
        return readersList;
    }

    public void setReadersList(List<Readers> readersList)
    {
        this.readersList = readersList;
    }

    public List<Publishers> getPublishersList()
    {
        return publishersList;
    }

    public void setPublishersList(List<Publishers> publishersList)
    {
        this.publishersList = publishersList;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Countries))
        {
            return false;
        }
        Countries other = (Countries) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Model.Countries[ id=" + id + " ]";
    }

    public String getIso()
    {
        return iso;
    }

    public void setIso(String iso)
    {
        this.iso = iso;
    }

    public String getPrintableName()
    {
        return printableName;
    }

    public void setPrintableName(String printableName)
    {
        this.printableName = printableName;
    }

    public String getIso3()
    {
        return iso3;
    }

    public void setIso3(String iso3)
    {
        this.iso3 = iso3;
    }

    public Short getNumCode()
    {
        return numCode;
    }

    public void setNumCode(Short numCode)
    {
        this.numCode = numCode;
    }
    
}
