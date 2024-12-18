package X;

import java.lang.reflect.ParameterizedType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Reu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class EnumC61080Reu {
    public static final EnumC61080Reu A00;
    public static final /* synthetic */ EnumC61080Reu[] A01;
    public static final EnumC61080Reu A02;

    static {
        EnumC61080Reu enumC61080Reu = new EnumC61080Reu() { // from class: X.RSs
        };
        A02 = enumC61080Reu;
        A01 = new EnumC61080Reu[]{enumC61080Reu, new C60782RSt()};
        ParameterizedType parameterizedType = (ParameterizedType) new S3B() { // from class: X.RSr
        }.getClass().getGenericSuperclass();
        parameterizedType.getClass();
        for (EnumC61080Reu enumC61080Reu2 : values()) {
            if (enumC61080Reu2.A00(S3B.class) == parameterizedType.getOwnerType()) {
                A00 = enumC61080Reu2;
                return;
            }
        }
        throw AbstractC58318PtA.A0V();
    }

    public static EnumC61080Reu[] values() {
        return (EnumC61080Reu[]) A01.clone();
    }

    public final Class A00(Class rawType) {
        if ((this instanceof C60782RSt) && rawType.isLocalClass()) {
            return null;
        }
        return rawType.getEnclosingClass();
    }

    public EnumC61080Reu(String $enum$name, int $enum$ordinal) {
    }
}
