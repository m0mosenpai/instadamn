package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.SgU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63270SgU {
    public static final C63270SgU A01 = new C63270SgU(true);
    public static volatile C63270SgU A02;
    public final Map A00;

    public static C63270SgU A00() {
        C63270SgU c63270SgU;
        C63270SgU c63270SgU2 = A02;
        if (c63270SgU2 == null) {
            synchronized (C63270SgU.class) {
                c63270SgU = A02;
                if (c63270SgU == null) {
                    c63270SgU = SSN.A00();
                    A02 = c63270SgU;
                }
            }
            return c63270SgU;
        }
        return c63270SgU2;
    }

    public C63270SgU(boolean z) {
        this.A00 = Collections.emptyMap();
    }

    public C63270SgU() {
        this.A00 = AbstractC166987dD.A1G();
    }
}
