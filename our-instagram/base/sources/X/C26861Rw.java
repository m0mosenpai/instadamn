package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Rw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26861Rw {
    public final Map A00;

    public final void A00(String str) {
        Map map = this.A00;
        String str2 = (String) map.get("platform_path");
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() != 0) {
            str = AnonymousClass001.A0g(str2, "::", str);
        }
        map.put("platform_path", str);
    }

    public C26861Rw(Map map) {
        this.A00 = map;
    }

    public C26861Rw() {
        this(new HashMap());
    }
}
