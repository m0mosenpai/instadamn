package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Vtg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69690Vtg {
    public final C19280xC A00;
    public final UserSession A01;

    public final void A00() {
        AbstractC11060iN.A00(this.A01).EHW(this.A00);
    }

    public final void A01(String str, Number number) {
        Double d;
        C19280xC c19280xC = this.A00;
        if (number != null) {
            d = Double.valueOf(number.doubleValue());
        } else {
            d = null;
        }
        c19280xC.A0A(str, d);
    }

    public C69690Vtg(C19280xC c19280xC, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = c19280xC;
    }
}
