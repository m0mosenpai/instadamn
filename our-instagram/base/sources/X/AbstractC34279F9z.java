package X;

import java.util.Map;

/* renamed from: X.F9z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34279F9z {
    public static final EnumC33407Epe A00(String str) {
        String str2;
        Map map = EnumC33407Epe.A01;
        if (str != null) {
            str2 = AbstractC167007dF.A0h(str);
        } else {
            str2 = null;
        }
        EnumC33407Epe enumC33407Epe = (EnumC33407Epe) map.get(str2);
        if (enumC33407Epe == null) {
            return EnumC33407Epe.A0E;
        }
        return enumC33407Epe;
    }
}
