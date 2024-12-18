package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C2R extends AbstractC65902yS {
    public final FragmentActivity A00;
    public final UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2R(FragmentActivity fragmentActivity, C07X c07x, UserSession userSession) {
        super(fragmentActivity, c07x, userSession, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 248);
        AbstractC167027dH.A13(fragmentActivity, userSession, c07x);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.AbstractC65902yS
    public final AbstractC50812Vc A02(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        return new C26352Bkx(this.A00, this.A01, interfaceC16820sZ);
    }

    @Override // X.AbstractC65902yS
    public final int A01() {
        return AbstractC25227BEk.A02(AbstractC13890nF.A01(this.A00));
    }

    @Override // X.AbstractC65902yS
    public final String A04() {
        return "TifuNetegoLithoViewBinder";
    }
}
