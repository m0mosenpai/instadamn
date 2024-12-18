package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oc1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55134Oc1 {
    public C54986OTu A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final double A05;
    public final long A06;
    public final C51959Mxg A07;
    public final NML A08;
    public final C19L A09;
    public final boolean A0A;

    public C55134Oc1(C51959Mxg c51959Mxg, NML nml, C19L c19l, double d, long j, boolean z) {
        C14360o3.A0B(c19l, 2);
        this.A07 = c51959Mxg;
        this.A09 = c19l;
        this.A08 = nml;
        this.A0A = z;
        this.A05 = d;
        this.A06 = j;
        this.A01 = AbstractC166987dD.A1E();
    }

    public static final void A00(C55134Oc1 c55134Oc1) {
        if ((c55134Oc1.A0A && !c55134Oc1.A02) || c55134Oc1.A04) {
            return;
        }
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "ttnc_estimator_prediction_start");
        c55134Oc1.A04 = true;
        NML nml = c55134Oc1.A08;
        if (nml != null) {
            C57561PgZ c57561PgZ = new C57561PgZ(c55134Oc1, 12);
            long currentTimeMillis = System.currentTimeMillis();
            NMI nmi = nml.A01;
            if (nmi == null) {
                nmi = AbstractC55167OdV.A02(nml, currentTimeMillis);
            }
            TW3 tw3 = new TW3(c57561PgZ, 21);
            C54779OIt c54779OIt = new C54779OIt(nmi, nmi, null);
            c54779OIt.A00 = tw3;
            c54779OIt.A02.ELI(c54779OIt);
            return;
        }
        A02(c55134Oc1, "null_model");
    }

    public static final void A01(C55134Oc1 c55134Oc1, C54986OTu c54986OTu) {
        c55134Oc1.A00 = c54986OTu;
        List list = c55134Oc1.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((O38) it.next()).A00.invoke(c54986OTu);
        }
        list.clear();
        c55134Oc1.A03();
    }

    public static final void A02(C55134Oc1 c55134Oc1, String str) {
        C18720vz c18720vz = AbstractC12960li.A00;
        C226418s.A06(C226218q.A01(c18720vz).A02, "ttnc_estimator_failure_reason", str);
        C226418s A01 = C226218q.A01(c18720vz);
        A01.A0P(A01.A02, "ttnc_estimator_prediction_failed");
        A01(c55134Oc1, new C54986OTu(-1.0d, -1.0d, -1L, false));
    }

    public final void A03() {
        int i;
        C54986OTu c54986OTu;
        String str;
        if (!this.A03 && (i = this.A07.A00) > 0 && (c54986OTu = this.A00) != null) {
            boolean z = true;
            boolean A1O = AbstractC167007dF.A1O((c54986OTu.A00 > c54986OTu.A01 ? 1 : (c54986OTu.A00 == c54986OTu.A01 ? 0 : -1)));
            boolean A1R = MSY.A1R((i > c54986OTu.A02 ? 1 : (i == c54986OTu.A02 ? 0 : -1)));
            if (A1O != A1R) {
                z = false;
            }
            C18720vz c18720vz = AbstractC12960li.A00;
            C226418s.A07(C226218q.A01(c18720vz).A02, "ttnc_estimator_correct", z);
            C226418s A01 = C226218q.A01(c18720vz);
            if (A1R) {
                str = "ttnc_estimator_correct_slow";
            } else {
                str = "ttnc_estimator_correct_fast";
            }
            C226418s.A07(A01.A02, str, z);
            this.A03 = true;
        }
    }
}
