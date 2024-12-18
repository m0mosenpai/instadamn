package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.foa.session.IgMetaSessionImpl;

/* renamed from: X.CUd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27959CUd {
    public final Activity A00;
    public final UserSession A01;

    public final void A00(CWR cwr, InterfaceC31002Dk1 interfaceC31002Dk1, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC31002Dk1, 1);
        C27333C4o c27333C4o = new C27333C4o(this.A00, AbstractC28057CYl.A01(this.A01), cwr, C30182DRn.A01(interfaceC31002Dk1, 1), C30182DRn.A01(new C29512CzQ(this, 0), 2), C30182DRn.A01(C30182DRn.A01(interfaceC16660sJ, 3), 5));
        CAD.A00 = c27333C4o;
        c27333C4o.A0F();
    }

    public final void A01(CWL cwl, InterfaceC31002Dk1 interfaceC31002Dk1) {
        AbstractC28375Cfd c27332C4n;
        Activity activity = this.A00;
        IgMetaSessionImpl A01 = AbstractC28057CYl.A01(this.A01);
        C30182DRn A012 = C30182DRn.A01(new C29512CzQ(interfaceC31002Dk1, 1), 4);
        if (C18U.A06(C06090Tz.A05, AbstractC28057CYl.A00(A01), 36325763944297822L)) {
            c27332C4n = new C27330C4l(activity, A01, cwl, A012);
        } else {
            c27332C4n = new C27332C4n(activity, A01, cwl, A012);
        }
        c27332C4n.A0F();
    }

    public C27959CUd(Activity activity, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, activity);
        this.A01 = userSession;
        this.A00 = activity;
    }
}
