
package grupo2_tp6_c2.Ejercicio1;

import java.util.Objects;

public class Producto_Ej1 {
    private String Nombre;
    private String Categoria;
    private long Precio;

    public Producto_Ej1(String Nombre, String Categoria, long Precio) {
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public long getPrecio() {
        return Precio;
    }

    public void setPrecio(long Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return Categoria+", "+Nombre+" de "+Precio+" pesos";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.Nombre);
        hash = 53 * hash + Objects.hashCode(this.Categoria);
        hash = 53 * hash + (int) (this.Precio ^ (this.Precio >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto_Ej1 other = (Producto_Ej1) obj;
        if (this.Precio != other.Precio) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return Objects.equals(this.Categoria, other.Categoria);
    }
}
