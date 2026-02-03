package com.candidat.app.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class NotificationId implements Serializable {
    
    private String idCandidat;
    private Integer idUt;

    public NotificationId() {
    }

    public NotificationId(String idCandidat, Integer idUt) {
        this.idCandidat = idCandidat;
        this.idUt = idUt;
    }

    // Getters
    public String getIdCandidat() { return idCandidat; }
    public Integer getIdUt() { return idUt; }

    // Setters
    public void setIdCandidat(String idCandidat) { this.idCandidat = idCandidat; }
    public void setIdUt(Integer idUt) { this.idUt = idUt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotificationId)) return false;
        NotificationId that = (NotificationId) o;
        return Objects.equals(idCandidat, that.idCandidat) &&
               Objects.equals(idUt, that.idUt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCandidat, idUt);
    }
}