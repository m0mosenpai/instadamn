package X;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.84K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84K {
    public String A00;
    public final C84J A01;
    public final C05A A03 = C10E.A00(C16930sl.A00);
    public final Map A02 = new LinkedHashMap();

    public static final void A00(C84K c84k, Map map) {
        c84k.A03.Egh(AbstractC001800i.A0a(map.values()));
    }

    public final void A01(String str) {
        Map map = this.A02;
        if (map.remove(str) != null) {
            File A00 = this.A01.A00(str);
            try {
                if (A00.exists()) {
                    A00.delete();
                }
            } catch (IOException | SecurityException unused) {
            }
            A00(this, map);
        }
    }

    public C84K(C84J c84j) {
        this.A01 = c84j;
    }
}
