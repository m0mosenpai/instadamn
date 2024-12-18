package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.HIe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39080HIe extends AbstractC66412zI {
    public final InterfaceC153536vO A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final JPS A03;
    public final InterfaceC43406JFw A04;
    public final C153856vu A05;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(null, 0);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C0YR[] c0yrArr = C38011Gnx.A0E;
        return new C38011Gnx(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_grid_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKY.class;
    }

    public C39080HIe(InterfaceC153536vO interfaceC153536vO, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JPS jps, InterfaceC43406JFw interfaceC43406JFw) {
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A04 = interfaceC43406JFw;
        this.A03 = jps;
        this.A00 = interfaceC153536vO;
        this.A05 = new C153856vu(null, interfaceC153536vO, interfaceC11380iw, userSession, null, new C153736vi(0.5625f, false, false));
    }
}
