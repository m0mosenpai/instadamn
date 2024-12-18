package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OC0 {
    public final C54719OEw A00;
    public final O3Y A01;
    public final InterfaceC09390do A02;
    public final C55558Ols A03;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.Nv1] */
    public OC0(FragmentActivity fragmentActivity, UserSession userSession) {
        O3Y o3y = new O3Y(userSession);
        this.A01 = o3y;
        this.A00 = new C54719OEw(o3y, new Object(), AbstractC23021Ah.A00(userSession));
        C60842q8 A0a = AbstractC25225BEi.A0a(new C57248PbW(fragmentActivity, 5), new C57248PbW(this, 6), C57535Pg9.A00(null, fragmentActivity, 14), AbstractC25225BEi.A1D(C114775Gk.class));
        this.A02 = A0a;
        C55558Ols c55558Ols = new C55558Ols(fragmentActivity, (C114775Gk) A0a.getValue());
        fragmentActivity.getLifecycle().A09(c55558Ols);
        this.A03 = c55558Ols;
    }
}
