package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N93 extends AbstractC65632xz {
    public InterfaceC55362gb A00;
    public C4NJ A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    public N93(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C4NJ c4nj;
        int A03 = C0f9.A03(279558515);
        C14360o3.A0B(view, 1);
        InterfaceC55362gb interfaceC55362gb = this.A00;
        if (interfaceC55362gb != null && (c4nj = this.A01) != null) {
            UserSession userSession = this.A03;
            InterfaceC11380iw interfaceC11380iw = this.A02;
            AbstractC167007dF.A1D(userSession, 1, interfaceC11380iw);
            new C66082yk(interfaceC11380iw, userSession).ADw(interfaceC55362gb, c4nj, new C81423kC(view));
        }
        C0f9.A0A(-1799337757, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1773165053);
        View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.generic_v3_megaphone, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(2));
        C0f9.A0A(26062450, A0G);
        return inflate;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31180DnO.A1S(anonymousClass306);
    }
}
