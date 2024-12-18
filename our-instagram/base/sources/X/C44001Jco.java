package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jco, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44001Jco extends AbstractC66412zI {
    public final AbstractC59962oe A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C57112jm A03 = C57112jm.A00();

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(null, 0);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        UserSession userSession = this.A02;
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        if ((C18U.A06(A0j, userSession, 36314773121469230L) && !C2E8.A07(userSession) && AbstractC23021Ah.A00(userSession).A22()) || C18U.A06(A0j, userSession, 36315438841335022L) || !C18U.A06(A0j, userSession, 36314189005851118L)) {
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new KR4(layoutInflater, AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_direct_inbox_tray, false), this);
        }
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.active_now_tray_shimmer_placeholder, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        return new KR3(new ComposeView(AbstractC166997dE.A0L(viewGroup), null, 0), (ShimmerFrameLayout) inflate, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return AbstractC45177JzJ.class;
    }

    public C44001Jco(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = abstractC59962oe;
    }
}
