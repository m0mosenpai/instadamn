package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54902fo {
    public final Map A00 = new LinkedHashMap();

    public final synchronized String A00(String str, boolean z, boolean z2) {
        String str2;
        int i;
        String A0G;
        C14360o3.A0B(str, 0);
        if (z) {
            str2 = AnonymousClass001.A0R(str, "_start");
        } else if (z2) {
            str2 = AnonymousClass001.A0R(str, "_end");
        } else {
            str2 = str;
        }
        int i2 = 0;
        C14360o3.A0B(str2, 0);
        Map map = this.A00;
        Integer num = (Integer) map.get(str2);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        A0G = AnonymousClass001.A0G(str, '_', i);
        Integer num2 = (Integer) map.get(str2);
        if (num2 != null) {
            i2 = num2.intValue();
        }
        map.put(str2, Integer.valueOf(i2 + 1));
        if (z) {
            A0G = AnonymousClass001.A0R(A0G, "_start");
        } else if (z2) {
            A0G = AnonymousClass001.A0R(A0G, "_end");
        }
        return A0G;
    }
}
