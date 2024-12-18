package X;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

/* renamed from: X.Sdr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63145Sdr {
    public static final C63145Sdr A04 = new C63145Sdr();
    public final String A00;
    public final String A01;
    public final Field A02;
    public final Field A03;

    public static Field A00(Class cls, String str) {
        for (Field field : cls.getDeclaredFields()) {
            if (str.equals(field.getName()) && field.getType() == Class.class) {
                field.setAccessible(true);
                return field;
            }
        }
        throw AbstractC58319PtB.A0l("No field named '%s' in class '%s'", new Object[]{str, cls.getName()});
    }

    public C63145Sdr() {
        String obj;
        Field field;
        String obj2;
        Field field2 = null;
        try {
            field = A00(EnumSet.class, "elementType");
            obj = null;
        } catch (Exception e) {
            obj = e.toString();
            field = null;
        }
        this.A03 = field;
        this.A01 = obj;
        try {
            obj2 = null;
            field2 = A00(EnumMap.class, "keyType");
        } catch (Exception e2) {
            obj2 = e2.toString();
        }
        this.A02 = field2;
        this.A00 = obj2;
    }
}
