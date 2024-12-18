package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.SdD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63109SdD {
    public static long A00;
    public static C63304ShA A01;

    public static C63304ShA A00() {
        synchronized (C63109SdD.class) {
            C63304ShA c63304ShA = A01;
            if (c63304ShA != null) {
                A01 = c63304ShA.A02;
                c63304ShA.A02 = null;
                A00 -= OdexSchemeArtXdex.STATE_PGO_ATTEMPTED;
                return c63304ShA;
            }
            return new C63304ShA();
        }
    }

    public static void A01(C63304ShA c63304ShA) {
        if (c63304ShA.A02 == null && c63304ShA.A03 == null) {
            if (!c63304ShA.A05) {
                synchronized (C63109SdD.class) {
                    long j = A00 + OdexSchemeArtXdex.STATE_PGO_ATTEMPTED;
                    if (j <= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED) {
                        A00 = j;
                        c63304ShA.A02 = A01;
                        c63304ShA.A00 = 0;
                        c63304ShA.A01 = 0;
                        A01 = c63304ShA;
                    }
                }
                return;
            }
            return;
        }
        throw AbstractC58318PtA.A0Y();
    }
}
