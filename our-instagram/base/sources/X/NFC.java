package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class NFC extends AbstractC66422zJ {
    public final int A00;
    public final int A01;
    public final AbstractC59962oe A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56091OvB c56091OvB = (C56091OvB) interfaceC66482zP;
        C51372MmX c51372MmX = (C51372MmX) c3oo;
        AbstractC167007dF.A1K(c56091OvB, c51372MmX);
        int i = this.A01;
        int i2 = this.A00;
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = c56091OvB.A00;
        User A01 = c08730cb.A01(userSession);
        boolean A1S = AbstractC25230BEn.A1S(i, i2);
        C905641r c905641r = c51372MmX.A01;
        C0UO c0uo = c56091OvB.A01.A04;
        String str = ((C51721Msy) c0uo.getValue()).A01;
        InterfaceC09390do interfaceC09390do = c905641r.A0F;
        int dimensionPixelSize = AbstractC166987dD.A0d(interfaceC09390do).getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material);
        C905641r.A02(userSession, c905641r, A1S);
        c905641r.A03(A01, str, A1S);
        InterfaceC09390do interfaceC09390do2 = c905641r.A0E;
        float f = dimensionPixelSize;
        AbstractC37302Gc3.A06(interfaceC09390do2).setTextSize(0, f);
        InterfaceC09390do interfaceC09390do3 = c905641r.A07;
        AbstractC37302Gc3.A06(interfaceC09390do3).setTextSize(0, f);
        InterfaceC09390do interfaceC09390do4 = c905641r.A04;
        ((IgdsButton) AbstractC166987dD.A17(interfaceC09390do4)).setSize(EnumC99714dp.A04);
        if (A1S) {
            int dimensionPixelSize2 = AbstractC166987dD.A0d(interfaceC09390do).getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            ViewGroup.LayoutParams layoutParams = AbstractC167007dF.A0L(interfaceC09390do2).getLayoutParams();
            String A00 = AbstractC111324zv.A00(20);
            C14360o3.A0C(layoutParams, A00);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            AbstractC31175DnJ.A08(AbstractC167007dF.A0L(interfaceC09390do4), A00).bottomMargin = dimensionPixelSize2;
            AbstractC31175DnJ.A08(AbstractC167007dF.A0L(interfaceC09390do3), A00).bottomMargin = dimensionPixelSize2;
        } else {
            InterfaceC09390do interfaceC09390do5 = c905641r.A0B;
            ((ImageView) AbstractC166987dD.A17(interfaceC09390do5)).setImageDrawable(C905641r.A01(c905641r, A01, AbstractC167027dH.A01(c905641r.A09)));
            AbstractC167017dG.A1W(interfaceC09390do5, 0);
        }
        AbstractC50522MSa.A14(c51372MmX, new PZ2(c51372MmX, A01, null, A1S), c0uo);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56091OvB.class;
    }

    public NFC(AbstractC59962oe abstractC59962oe, int i, int i2) {
        this.A02 = abstractC59962oe;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = this.A01;
        int i2 = this.A00;
        View inflate = layoutInflater.inflate(R.layout.share_open_carousel_card_preview_layout, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(48));
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate;
        MSY.A10(igFrameLayout, i, i2);
        Object A0Q = AbstractC37303Gc4.A0Q(igFrameLayout, new C51372MmX(igFrameLayout));
        C14360o3.A0C(A0Q, "null cannot be cast to non-null type com.instagram.creation.fragment.sharepreview.ShareOpenCarouselCardPreviewViewBinder.Companion.Holder");
        return (C3OO) A0Q;
    }
}
