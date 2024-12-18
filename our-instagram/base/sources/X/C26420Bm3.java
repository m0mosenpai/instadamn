package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bm3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26420Bm3 extends AbstractC51572Yf {
    public final Activity A00;
    public final UserSession A01;
    public final CR3 A02;
    public final InterfaceC30896Di9 A03;

    public C26420Bm3(Activity activity, UserSession userSession, CR3 cr3, InterfaceC30896Di9 interfaceC30896Di9) {
        AbstractC167027dH.A0a(1, activity, userSession, interfaceC30896Di9, cr3);
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = interfaceC30896Di9;
        this.A02 = cr3;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        InterfaceC30896Di9 interfaceC30896Di9 = this.A03;
        if (interfaceC30896Di9 instanceof C26269Bjc) {
            C75933ay c75933ay = C51722Yv.A02;
            C51722Yv A0C = AbstractC25234BEr.A0C(null, AbstractC25225BEi.A0m(C05F.A00, 100.0f, 0), 0);
            C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
            A12.A00(new C26612Bp9(this.A00, c75933ay, this.A01, this.A02, (C26269Bjc) interfaceC30896Di9));
            return AbstractC76963ci.A01(A12, c76223bS, A0C);
        }
        if (interfaceC30896Di9 instanceof C29558D0k) {
            return null;
        }
        throw B4Z.A00();
    }
}
