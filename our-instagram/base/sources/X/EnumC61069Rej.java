package X;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Rej, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class EnumC61069Rej {
    public static final EnumC61069Rej A00;
    public static final EnumC61069Rej A01;
    public static final EnumC61069Rej A02;

    static {
        C60783RSu c60783RSu = new C60783RSu(0);
        C60783RSu c60783RSu2 = new C60783RSu(1);
        A01 = c60783RSu2;
        C60783RSu c60783RSu3 = new C60783RSu(2);
        A02 = c60783RSu3;
        C60783RSu c60783RSu4 = new C60783RSu(3);
        if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
            if (new AbstractC140856Yn() { // from class: X.RSY
            }.A00().toString().contains("java.util.Map.java.util.Map")) {
                A00 = c60783RSu3;
                return;
            } else {
                A00 = c60783RSu4;
                return;
            }
        }
        if (new AbstractC140856Yn() { // from class: X.RSZ
        }.A00() instanceof Class) {
            A00 = c60783RSu2;
        } else {
            A00 = c60783RSu;
        }
    }

    public final Type A01(Type componentType) {
        EnumC61069Rej enumC61069Rej;
        switch (((C60783RSu) this).A00) {
            case 0:
                break;
            case 1:
                if (componentType instanceof Class) {
                    return Array.newInstance((Class<?>) componentType, 0).getClass();
                }
                break;
            case 2:
                enumC61069Rej = A01;
                return enumC61069Rej.A01(componentType);
            default:
                enumC61069Rej = A02;
                return enumC61069Rej.A01(componentType);
        }
        return new C64734TRs(componentType);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    public final Type A02(Type type) {
        EnumC61069Rej enumC61069Rej;
        switch (((C60783RSu) this).A00) {
            case 0:
                type.getClass();
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                if (!cls.isArray()) {
                    return type;
                }
                return new C64734TRs(cls.getComponentType());
            case 1:
                type.getClass();
                return type;
            case 2:
                enumC61069Rej = A01;
                return enumC61069Rej.A02(type);
            default:
                enumC61069Rej = A02;
                return enumC61069Rej.A02(type);
        }
    }

    public String A00(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public EnumC61069Rej(String $enum$name, int $enum$ordinal) {
    }
}
