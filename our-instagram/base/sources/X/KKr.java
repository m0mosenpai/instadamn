package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class KKr extends AnonymousClass803 {
    public final int A00;
    public final Object A01;

    public KKr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C43756JWu c43756JWu;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                return AbstractC25231BEo.A1a(view, (InterfaceC16660sJ) this.A01);
            case 1:
                C43713JUy c43713JUy = (C43713JUy) this.A01;
                JVV jvv = c43713JUy.A00;
                if (jvv == null) {
                    return true;
                }
                c43713JUy.A00(jvv);
                return true;
            default:
                AbstractC43757JWv abstractC43757JWv = ((L0U) this.A01).A01.A04;
                if (abstractC43757JWv instanceof C46110KbA) {
                    c43756JWu = ((C46110KbA) abstractC43757JWv).A06;
                } else {
                    C43755JWt c43755JWt = (C43755JWt) abstractC43757JWv;
                    c43755JWt.A0D();
                    c43756JWu = c43755JWt.A0N;
                }
                if (c43756JWu != null) {
                    C43756JWu.A00(c43756JWu);
                    LIi lIi = c43756JWu.A03;
                    if (lIi != null) {
                        lIi.A02(false);
                        return true;
                    }
                    return true;
                }
                return true;
        }
    }
}
