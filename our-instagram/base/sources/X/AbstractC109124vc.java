package X;

import java.util.Locale;
import java.util.Map;

/* renamed from: X.4vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109124vc {
    public static final EnumC109104va A00(String str) {
        String str2;
        Map map = EnumC109104va.A01;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            C14360o3.A07(str2);
        } else {
            str2 = null;
        }
        EnumC109104va enumC109104va = (EnumC109104va) map.get(str2);
        if (enumC109104va == null) {
            return EnumC109104va.A0E;
        }
        return enumC109104va;
    }
}
