package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class N4B extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "LeadGenConsumerBaseFragment";
    public AnonymousClass195 A00;

    public final AbstractC51040Mgq A05() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52577NNx) {
            interfaceC09390do = ((C52577NNx) this).A09;
        } else if (this instanceof C52576NNw) {
            interfaceC09390do = ((C52576NNw) this).A00;
        } else if (this instanceof C52573NNt) {
            interfaceC09390do = ((C52573NNt) this).A04;
        } else {
            interfaceC09390do = ((C52563NNj) this).A0B;
        }
        return (AbstractC51040Mgq) interfaceC09390do.getValue();
    }

    public final void A06() {
        if (this instanceof AbstractC52562NNi) {
            ((AbstractC52562NNi) this).A08(true);
            return;
        }
        if (!(this instanceof C52577NNx) && !(this instanceof C52576NNw)) {
            C52563NNj c52563NNj = (C52563NNj) this;
            UserSession userSession = ((NOV) c52563NNj.A0B.getValue()).A04;
            Activity A04 = AbstractC31172DnG.A04(c52563NNj);
            AbstractC167017dG.A1N(userSession, A04);
            C55772hI.A00(userSession).A09(A04, null);
            A04.finish();
            return;
        }
        ((AbstractC52561NNh) this).A08();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int A02 = C0f9.A02(-1573430619);
        super.onStart();
        this.A00 = PZH.A01(this, A05().A01, 22);
        C0f9.A09(-1053997832, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int A02 = C0f9.A02(1920327990);
        super.onStop();
        this.A00 = MSY.A0r(this.A00);
        C0f9.A09(1211110477, A02);
    }
}
