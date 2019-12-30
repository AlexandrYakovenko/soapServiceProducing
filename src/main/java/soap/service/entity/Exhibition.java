package soap.service.entity;

import java.util.Objects;

public class Exhibition {
    private Long id;
    private String title;

    public Exhibition() {
    }

    public Exhibition(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Exhibition{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exhibition that = (Exhibition) o;
        return id.equals(that.id) &&
                title.equals(that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
