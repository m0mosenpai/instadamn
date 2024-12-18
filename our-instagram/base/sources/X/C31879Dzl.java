package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Dzl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31879Dzl extends C2UU {
    public List A00;
    public final InterfaceC08100bW A01;
    public final AbstractC59962oe A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;

    public C31879Dzl(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 3);
        this.A02 = abstractC59962oe;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A01 = AbstractC31175DnJ.A0B();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C7QY c7qy;
        C14360o3.A0B(c3oo, 0);
        c3oo.itemView.setOnClickListener(null);
        List list = this.A00;
        if (list != null && (c7qy = (C7QY) list.get(i)) != null) {
            AbstractC46805Kn0.A00(AbstractC31171DnF.A06(c3oo), this.A03, c7qy, true);
            ViewOnClickListenerC35684FpJ.A00(c3oo.itemView, c3oo, this, c7qy, 13);
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        C14360o3.A07(A0E);
        View A0R = AbstractC25226BEj.A0R(A0E, viewGroup, R.layout.generic_xma_vstack_subitem, false);
        int A02 = AbstractC31171DnF.A02(viewGroup.getResources(), R.dimen.account_discovery_bottom_gap);
        A0R.setPadding(A02, A02, A02, A02);
        AbstractC31172DnG.A1J(A0R, R.id.avatar_view, 0);
        AbstractC31176DnK.A0E(A0R).setMaxLines(2);
        AbstractC31176DnK.A1D(A0R, R.id.right_icon);
        return new C3OO(A0R);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(697423078);
        int A0I = AbstractC25231BEo.A0I(this.A00);
        C0f9.A0A(953511515, A03);
        return A0I;
    }
}
