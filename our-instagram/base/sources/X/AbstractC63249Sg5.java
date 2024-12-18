package X;

import android.os.Parcelable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.microg.safeparcel.SafeParcelable;

/* renamed from: X.Sg5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63249Sg5 {
    public static Parcelable.Creator A00(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("CREATOR");
            declaredField.setAccessible(true);
            return (Parcelable.Creator) declaredField.get(null);
        } catch (IllegalAccessException unused) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("CREATOR in ");
            A1C.append(cls);
            throw AbstractC166987dD.A18(AbstractC166997dE.A0x(" is not accessible", A1C));
        } catch (NoSuchFieldException unused2) {
            throw AbstractC166987dD.A18(AbstractC166997dE.A0x(" is an Parcelable without CREATOR", AbstractC31174DnI.A0y(cls)));
        }
    }

    public static Class A02(Field field) {
        Class subClass;
        SafeParcelable.Field field2 = (SafeParcelable.Field) field.getAnnotation(SafeParcelable.Field.class);
        if (field2 != null && (subClass = field2.subClass()) != SafeParcelable.class && subClass != null) {
            return subClass;
        }
        Type genericType = field.getGenericType();
        if (genericType instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericType;
            if (parameterizedType.getActualTypeArguments().length >= 1) {
                Type type = parameterizedType.getActualTypeArguments()[0];
                if (type instanceof Class) {
                    return (Class) type;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static boolean A03(Field field) {
        SafeParcelable.Field field2 = (SafeParcelable.Field) field.getAnnotation(SafeParcelable.Field.class);
        if (field2 != null) {
            return field2.useValueParcel();
        }
        throw AbstractC58318PtA.A0Z();
    }

    public static Parcelable.Creator A01(Field field) {
        Class<?> type = field.getType();
        if ((!type.isArray() || (type = type.getComponentType()) != null) && Parcelable.class.isAssignableFrom(type)) {
            return A00(type);
        }
        throw AbstractC166987dD.A18(AbstractC166997dE.A0x(" is not an Parcelable", AbstractC31174DnI.A0y(type)));
    }
}
