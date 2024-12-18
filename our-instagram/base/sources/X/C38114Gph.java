package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgImageButton;
import java.util.List;

/* renamed from: X.Gph, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38114Gph extends AbstractC66412zI {
    public final JPS A00;
    public final InterfaceC43406JFw A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16590sC A03;
    public final InterfaceC16590sC A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;

    public final void A00(C5qT c5qT, HKX hkx, IgImageButton igImageButton, int i) {
        boolean A1a = AbstractC31175DnJ.A1a(igImageButton);
        C132835z6 c132835z6 = hkx.A02;
        List list = c132835z6.A05;
        if (list != null && list.size() >= i) {
            C5qT c5qT2 = new C5qT(c5qT.A01, i);
            List list2 = c132835z6.A05;
            C14360o3.A0A(list2);
            C38321qM c38321qM = (C38321qM) list2.get(i);
            UserSession userSession = this.A06;
            if (AbstractC37301Gc2.A1Y(userSession, c38321qM)) {
                InterfaceC11380iw interfaceC11380iw = this.A05;
                int i2 = c5qT2.A01;
                AbstractC167007dF.A1D(c38321qM, A1a ? 1 : 0, interfaceC11380iw);
                IZ9.A00(null, interfaceC11380iw, c38321qM, igImageButton, i2, i, false, false);
                return;
            }
            C127915qK A02 = AbstractC127905qJ.A02(A1a ? 1 : 0, A1a ? 1 : 0);
            InterfaceC43406JFw interfaceC43406JFw = this.A01;
            C130505uv c130505uv = new C130505uv(EnumC130515uw.A0H, null, c132835z6, null);
            c130505uv.A01();
            interfaceC43406JFw.EE0(igImageButton, c5qT2, A02, new C127995qS(A02, c130505uv, c38321qM), false);
            ViewOnClickListenerC41993IjO viewOnClickListenerC41993IjO = new ViewOnClickListenerC41993IjO(c38321qM, hkx, this, c5qT2, i, 0);
            ViewOnTouchListenerC42057IkQ viewOnTouchListenerC42057IkQ = new ViewOnTouchListenerC42057IkQ(i, 0, c38321qM, c5qT2, this);
            int i3 = c5qT2.A01;
            InterfaceC11380iw interfaceC11380iw2 = this.A05;
            AbstractC167007dF.A1D(userSession, 0, c38321qM);
            C14360o3.A0B(interfaceC11380iw2, 11);
            AbstractC153386v7.A03(viewOnClickListenerC41993IjO, viewOnTouchListenerC42057IkQ, interfaceC11380iw2, userSession, c38321qM, igImageButton, 1.0f, i3, i, A1a, false);
            return;
        }
        AbstractC153386v7.A04(igImageButton);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        HKX hkx = (HKX) interfaceC66482zP;
        C38491GwC c38491GwC = (C38491GwC) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, hkx, c38491GwC);
        C5qT BAM = this.A00.BAM(hkx);
        this.A01.EE0(AbstractC31171DnF.A06(c38491GwC), BAM, ((AbstractC127945qN) hkx).A02, hkx, false);
        if (hkx.A01) {
            View view = c38491GwC.itemView;
            AbstractC37304Gc5.A0t(view, c38491GwC, view.getPaddingLeft(), c38491GwC.A00.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        } else {
            View view2 = c38491GwC.itemView;
            AbstractC37304Gc5.A0t(view2, c38491GwC, view2.getPaddingLeft(), 0);
        }
        ViewOnClickListenerC42034Ik3.A00(c38491GwC.A00, 12, hkx, this);
        c38491GwC.A01.setText(hkx.A02.A00().A04);
        A00(BAM, hkx, c38491GwC.A03, 0);
        A00(BAM, hkx, c38491GwC.A02, A1R ? 1 : 0);
        A00(BAM, hkx, c38491GwC.A04, 2);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        C38491GwC c38491GwC = new C38491GwC(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.tri_media_keyword_recommendation, false));
        C14360o3.A0A(AbstractC31172DnG.A05(c38491GwC));
        int A0A = (int) (((AbstractC13880nE.A0A(r1) - (AbstractC167017dG.A03(r1) * 2)) - (r1.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing) * 2)) / 3.0f);
        AbstractC13880nE.A0h(c38491GwC.A03, A0A, A0A);
        AbstractC13880nE.A0h(c38491GwC.A02, A0A, A0A);
        AbstractC13880nE.A0h(c38491GwC.A04, A0A, A0A);
        return c38491GwC;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKX.class;
    }

    public C38114Gph(InterfaceC11380iw interfaceC11380iw, UserSession userSession, JPS jps, InterfaceC43406JFw interfaceC43406JFw, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16590sC interfaceC16590sC, InterfaceC16590sC interfaceC16590sC2) {
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A01 = interfaceC43406JFw;
        this.A00 = jps;
        this.A02 = interfaceC16660sJ;
        this.A03 = interfaceC16590sC;
        this.A04 = interfaceC16590sC2;
    }
}
