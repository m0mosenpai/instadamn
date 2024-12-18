package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.text.ExpandableTextView;

/* renamed from: X.EYz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32651EYz extends AbstractC66422zJ {
    public final UserSession A00;
    public final FG0 A01;

    public C32651EYz(UserSession userSession, FG0 fg0) {
        C14360o3.A0B(fg0, 2);
        this.A00 = userSession;
        this.A01 = fg0;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31993E3v(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_search_meta_ai_snippet, false), this.A00, this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        EY2 ey2 = (EY2) interfaceC66482zP;
        C31993E3v c31993E3v = (C31993E3v) c3oo;
        AbstractC167017dG.A1N(ey2, c31993E3v);
        if (!ey2.A03) {
            C34721FRi c34721FRi = c31993E3v.A09.A00.A0F.A01;
            if (c34721FRi != null && (str = c34721FRi.A07) != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34721FRi.A0E, "universal_search_meta_ai_snippet_loading");
                if (A0f.isSampled()) {
                    AbstractC31173DnH.A1L(A0f, str);
                    A0f.Cht();
                }
            }
            C36156FxV c36156FxV = new C36156FxV(2, ey2, c31993E3v);
            c31993E3v.A01 = c36156FxV;
            C36156FxV c36156FxV2 = new C36156FxV(3, ey2, c31993E3v);
            c31993E3v.A00 = c36156FxV2;
            C25671My c25671My = c31993E3v.A06;
            c25671My.A01(c36156FxV, C36097FwX.class);
            c25671My.A01(c36156FxV2, C36113Fwn.class);
            ExpandableTextView expandableTextView = c31993E3v.A08;
            AbstractC31171DnF.A14(expandableTextView);
            c31993E3v.A03 = false;
            expandableTextView.setCollapsedLines(4);
            expandableTextView.A01 = Integer.MAX_VALUE;
            FpQ.A01(expandableTextView, 36, c31993E3v, ey2);
            ShimmerFrameLayout shimmerFrameLayout = c31993E3v.A05;
            shimmerFrameLayout.A02();
            shimmerFrameLayout.setVisibility(0);
            expandableTextView.setVisibility(8);
            c31993E3v.A04.setVisibility(8);
            IgLinearLayout igLinearLayout = c31993E3v.A02;
            if (igLinearLayout != null) {
                igLinearLayout.setVisibility(8);
            }
            expandableTextView.A03 = false;
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C31993E3v c31993E3v = (C31993E3v) c3oo;
        C14360o3.A0B(c31993E3v, 0);
        InterfaceC41501vz interfaceC41501vz = c31993E3v.A01;
        if (interfaceC41501vz != null) {
            c31993E3v.A06.A02(interfaceC41501vz, C36097FwX.class);
        }
        InterfaceC41501vz interfaceC41501vz2 = c31993E3v.A00;
        if (interfaceC41501vz2 != null) {
            c31993E3v.A06.A02(interfaceC41501vz2, C36113Fwn.class);
        }
        c31993E3v.A01 = null;
        c31993E3v.A00 = null;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return EY2.class;
    }
}
