package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L90 {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C45999KXn A03;
    public final InterfaceC09390do A04;

    public final void A01(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        AbstractC47029Kqm.A00(this.A00, this.A02, C05F.A00, str, str2, C50248MHd.A01(this, 34), new C50355MLh(this, 36));
    }

    public final void A00() {
        LHE.A00(this.A00, C50248MHd.A01(this, 32), true);
    }

    public L90(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C45999KXn c45999KXn) {
        AbstractC43594JPz.A1P(userSession, c45999KXn);
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = c45999KXn;
        this.A04 = AbstractC09440dt.A00(EnumC09460dv.A02, C50248MHd.A01(this, 29));
    }
}
