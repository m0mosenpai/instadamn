package X;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: X.6Ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140846Ym extends AbstractC140856Yn implements Serializable {
    public final Type A00;

    public final boolean equals(Object o) {
        if (o instanceof AbstractC140846Ym) {
            return this.A00.equals(((AbstractC140846Ym) o).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        Type type = this.A00;
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public AbstractC140846Ym(Type type) {
        type.getClass();
        this.A00 = type;
    }

    public static AbstractC140846Ym toGenericType(Class cls) {
        Type type;
        Type c64740TRz;
        if (cls.isArray()) {
            c64740TRz = AbstractC63322ShW.A00(toGenericType(cls.getComponentType()).A00);
        } else {
            TypeVariable[] typeParameters = cls.getTypeParameters();
            if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
                type = toGenericType(cls.getEnclosingClass()).A00;
            } else {
                type = null;
            }
            if (typeParameters.length <= 0) {
                if (type == null || type == cls.getEnclosingClass()) {
                    return new AbstractC140846Ym(cls);
                }
            } else if (type == null) {
                type = EnumC61080Reu.A00.A00(cls);
                c64740TRz = new C64740TRz(cls, type, typeParameters);
            }
            boolean z = false;
            if (cls.getEnclosingClass() != null) {
                z = true;
            }
            C18C.A0A(cls, "Owner type for unenclosed %s", z);
            c64740TRz = new C64740TRz(cls, type, typeParameters);
        }
        return new AbstractC140846Ym(c64740TRz);
    }

    public AbstractC140846Ym() {
        Type A00 = A00();
        this.A00 = A00;
        C18C.A0B(A00, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", !(A00 instanceof TypeVariable));
    }
}
