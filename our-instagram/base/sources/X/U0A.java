package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes11.dex */
public final class U0A implements InterfaceC72173Lq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ XAp A01;
    public final /* synthetic */ C65867TvU A02;
    public final /* synthetic */ boolean A03;

    @Override // X.InterfaceC72173Lq
    public final float Awi(C3FQ c3fq, float f) {
        return f;
    }

    @Override // X.InterfaceC72173Lq
    public final boolean Eif() {
        return false;
    }

    @Override // X.InterfaceC72173Lq
    public final boolean Eih(C3FQ c3fq) {
        C14360o3.A0B(c3fq, 0);
        return AbstractC167007dF.A1N(c3fq.B6q());
    }

    public U0A(XAp xAp, C65867TvU c65867TvU, int i, boolean z) {
        this.A03 = z;
        this.A02 = c65867TvU;
        this.A01 = xAp;
        this.A00 = i;
    }

    @Override // X.InterfaceC72173Lq
    public final void DvV(float f) {
        if (!this.A03) {
            C65867TvU c65867TvU = this.A02;
            float f2 = c65867TvU.A01 - f;
            c65867TvU.A00 = f2;
            this.A01.DKL(f2);
            SearchEditText searchEditText = c65867TvU.A0F;
            if (searchEditText != null) {
                searchEditText.setEnabled(!AbstractC167007dF.A1N((f > this.A00 ? 1 : (f == this.A00 ? 0 : -1))));
            }
            C5SW c5sw = c65867TvU.A0E;
            if (c5sw != null && c5sw.A09()) {
                c5sw.A08(true);
            }
        }
    }

    @Override // X.InterfaceC72173Lq
    public final /* synthetic */ boolean E5B() {
        return false;
    }

    @Override // X.InterfaceC72173Lq
    public final /* synthetic */ boolean EiW() {
        return true;
    }

    @Override // X.InterfaceC72173Lq
    public final boolean Eig(C3FQ c3fq) {
        UserSession userSession = this.A02.A0R;
        boolean A02 = AbstractC153456vF.A02(userSession);
        if ((this.A03 && !A02) || (!C18U.A06(C06090Tz.A05, userSession, 36315627819896266L) && !A02)) {
            return false;
        }
        return true;
    }
}
