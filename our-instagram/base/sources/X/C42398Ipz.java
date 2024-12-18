package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ipz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42398Ipz implements InterfaceC50450MPe {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C22P A01;
    public final /* synthetic */ AbstractC59962oe A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C9JS A04;

    public C42398Ipz(Activity activity, C22P c22p, AbstractC59962oe abstractC59962oe, UserSession userSession, C9JS c9js) {
        this.A03 = userSession;
        this.A01 = c22p;
        this.A00 = activity;
        this.A04 = c9js;
        this.A02 = abstractC59962oe;
    }

    @Override // X.InterfaceC50450MPe
    public final void D9U() {
        C22P c22p = this.A01;
        AbstractC41671Ic3.A01(this.A00, null, this.A02, c22p, this.A03, false, true);
    }

    @Override // X.InterfaceC50450MPe
    public final void Dej(C38321qM c38321qM) {
        UserSession userSession = this.A03;
        C22P c22p = this.A01;
        INH A0C = AbstractC86593tX.A0C(c22p);
        C37855Gl9 c37855Gl9 = C37855Gl9.A00;
        Activity activity = this.A00;
        c37855Gl9.A0G(activity, this.A04, c38321qM, A0C);
        A0C.A0q = false;
        A0C.A0l = true;
        AbstractC41671Ic3.A01(activity, A0C.A00(), this.A02, c22p, userSession, false, true);
    }
}
