package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9FI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FI extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C79623hD c79623hD;
        if (this.A00 != 0) {
            View view = (View) obj;
            InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) obj2;
            C14360o3.A0B(view, 0);
            C14360o3.A0B(interfaceC60442pS, 1);
            C75563aN c75563aN = (C75563aN) this.A02;
            C38321qM c38321qM = (C38321qM) this.A01;
            boolean z = this.A03;
            UserSession userSession = c75563aN.A00;
            C71313Hs A00 = C71313Hs.A00(userSession);
            C14360o3.A07(A00);
            A00.A05(view, EnumC71343Hv.A0e);
            if (z) {
                Context context = view.getContext();
                C14360o3.A07(context);
                c79623hD = new C79623hD(new C86933u7(context, new C75113Zb(c38321qM.A0p(), c38321qM.A4w()), userSession, c38321qM), userSession, c38321qM, interfaceC60442pS, "in_app_browser_v2", C16910sj.A00);
            } else {
                c79623hD = new C79623hD(null, userSession, c38321qM, interfaceC60442pS);
            }
            A00.A0A(view, c79623hD);
        } else {
            View view2 = (View) obj;
            InterfaceC60442pS interfaceC60442pS2 = (InterfaceC60442pS) obj2;
            C14360o3.A0B(view2, 0);
            C14360o3.A0B(interfaceC60442pS2, 1);
            AbstractC99834e5.A01(view2, ((C75563aN) this.A02).A00, (C38321qM) this.A01, interfaceC60442pS2, this.A03);
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FI(int i, Object obj, Object obj2, boolean z) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
    }
}
