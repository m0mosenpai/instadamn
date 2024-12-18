package X;

import android.content.Context;

/* renamed from: X.Oab, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55081Oab {
    public static int A00;
    public static C31349DqE A01;
    public static final C55081Oab A02 = new Object();
    public static final InterfaceC58152PqH A03 = new P3D(0);

    public static final void A00() {
        C31349DqE c31349DqE = A01;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
        }
        A01 = null;
    }

    public final void A01(Context context, int i) {
        A02(AbstractC166997dE.A0p(context, i));
    }

    public final void A02(String str) {
        A00();
        C146106i8 A0j = AbstractC25229BEm.A0j();
        A0j.A0D = str;
        A0j.A02 = A00 + 8;
        A0j.A0R = true;
        A0j.A0A(A03);
        C31349DqE A002 = A0j.A00();
        AbstractC166997dE.A1O(C41451vu.A01, A002);
        A01 = A002;
    }
}
