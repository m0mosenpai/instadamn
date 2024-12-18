package X;

import android.os.Handler;

/* renamed from: X.JmX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44527JmX extends AbstractC52922bZ {
    public int A00;
    public C47297Kv8 A01;
    public final Handler A02 = AbstractC167007dF.A0J();
    public final Runnable A03 = new RunnableC49856M0b(this);
    public final C05A A04;
    public final C0UO A05;

    public final void A00(String str) {
        C05A c05a = this.A04;
        C45098JxS c45098JxS = (C45098JxS) c05a.getValue();
        C73 c73 = C73.A02;
        boolean z = c45098JxS.A05;
        String str2 = c45098JxS.A02;
        boolean z2 = c45098JxS.A06;
        KzF kzF = c45098JxS.A00;
        String str3 = c45098JxS.A04;
        AbstractC167017dG.A1O(c73, str);
        c05a.Egh(new C45098JxS(kzF, c73, str, str2, str3, z, z2));
    }

    public final boolean A01() {
        C0UO c0uo = this.A05;
        return C14360o3.A0K(((C45098JxS) c0uo.getValue()).A03, ((C45098JxS) c0uo.getValue()).A02);
    }

    public final boolean A02() {
        C05A c05a = this.A04;
        if (((C45098JxS) c05a.getValue()).A01 != C73.A04) {
            if (((C45098JxS) c05a.getValue()).A01 != C73.A02 || ((C45098JxS) c05a.getValue()).A05) {
                if (((C45098JxS) c05a.getValue()).A01 == C73.A03 && !((C45098JxS) c05a.getValue()).A05) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public C44527JmX() {
        C008002u A1H = AbstractC25225BEi.A1H(new C45098JxS(null, C73.A04, "", null, null, false, true));
        this.A04 = A1H;
        this.A05 = AbstractC208910l.A02(A1H);
    }
}
