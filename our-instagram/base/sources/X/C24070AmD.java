package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.AmD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24070AmD implements InterfaceC58304Psw {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C8JI A01;

    @Override // X.InterfaceC57996Png
    public final /* bridge */ /* synthetic */ void Dd7(Object obj) {
        InterfaceC58187Pqt interfaceC58187Pqt = (InterfaceC58187Pqt) obj;
        C14360o3.A0B(interfaceC58187Pqt, 0);
        C8JI c8ji = this.A01;
        AbstractC59962oe abstractC59962oe = c8ji.A08;
        if (!abstractC59962oe.mDetached && abstractC59962oe.mView != null) {
            ViewStub viewStub = (ViewStub) AbstractC166997dE.A0S(this.A00, R.id.pre_capture_sup_toggle_stub);
            UserSession userSession = c8ji.A09;
            c8ji.A01 = interfaceC58187Pqt.Csg(viewStub, abstractC59962oe, userSession, null, new MTX(c8ji, 4));
            c8ji.A03 = interfaceC58187Pqt.Csd(null, abstractC59962oe, new MTX(c8ji, 5));
            c8ji.A02 = interfaceC58187Pqt.Csb(abstractC59962oe, userSession, new MTX(c8ji, 6));
            c8ji.A04 = interfaceC58187Pqt.Csf(abstractC59962oe, userSession, c8ji.A0A, new MTX(c8ji, 7));
            C55U c55u = c8ji.A00;
            if (c55u != null) {
                c8ji.A00 = null;
                C8JI.A03(null, c8ji);
                C8JI.A02(c55u, c8ji);
            }
        }
    }

    public C24070AmD(View view, C8JI c8ji) {
        this.A01 = c8ji;
        this.A00 = view;
    }
}
