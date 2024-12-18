package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class V5T extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC16620sF A02;
    public final InterfaceC16620sF A03;
    public final InterfaceC16610sE A04;
    public final InterfaceC16600sD A05;

    public V5T(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16610sE interfaceC16610sE, InterfaceC16600sD interfaceC16600sD) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = interfaceC16620sF;
        this.A04 = interfaceC16610sE;
        this.A05 = interfaceC16600sD;
        this.A02 = interfaceC16620sF2;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new UJW(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_gifter, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C70796Wh9 c70796Wh9 = (C70796Wh9) interfaceC66482zP;
        UJW ujw = (UJW) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c70796Wh9, ujw);
        Resources resources = ujw.itemView.getResources();
        User user = c70796Wh9.A04;
        String A0r = AbstractC166997dE.A0r(resources, user.getUsername(), 2131953054);
        C14360o3.A07(A0r);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = ujw.A08;
        ImageUrl Bhu = user.Bhu();
        InterfaceC11380iw interfaceC11380iw = this.A00;
        gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, Bhu);
        gradientSpinnerAvatarView.setContentDescription(AbstractC166997dE.A0r(ujw.itemView.getResources(), user.getUsername(), 2131953050));
        AbstractC56952jT.A02(gradientSpinnerAvatarView, A0r);
        Reel reel = c70796Wh9.A03;
        if (reel == null) {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            WNV.A00(gradientSpinnerAvatarView, 36, c70796Wh9, this);
        } else {
            gradientSpinnerAvatarView.setGradientColor(C3PP.A00(this.A01, reel));
            WNX.A00(gradientSpinnerAvatarView, ujw, this, c70796Wh9, 9);
            gradientSpinnerAvatarView.setGradientSpinnerVisible(A1R);
        }
        IgTextView igTextView = ujw.A04;
        AbstractC31173DnH.A1F(igTextView, user);
        C85963sQ.A0B(igTextView, user.isVerified());
        IgTextView igTextView2 = ujw.A03;
        Resources resources2 = ujw.itemView.getResources();
        C14360o3.A07(resources2);
        igTextView2.setText(C23831Eq.A09(resources2, c70796Wh9.A00));
        ujw.A05.setUrl(c70796Wh9.A02, interfaceC11380iw);
        ujw.A06.setVisibility(AbstractC167007dF.A05(c70796Wh9.A06 ? 1 : 0));
        Context A03 = AbstractC37301Gc2.A03(ujw);
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = ujw.A07;
        IgFrameLayout igFrameLayout = ujw.A01;
        C68708Vak c68708Vak = ujw.A00;
        boolean z = c70796Wh9.A07;
        String str = c70796Wh9.A05;
        String id = user.getId();
        String A0r2 = AbstractC166997dE.A0r(ujw.itemView.getResources(), user.getUsername(), 2131953052);
        C14360o3.A07(A0r2);
        String A0q = AbstractC166997dE.A0q(ujw.itemView.getResources(), 2131953016);
        igBouncyUfiButtonImageView.setSelected(z);
        int i = R.attr.igds_color_primary_icon;
        if (z) {
            i = R.attr.igds_color_icon_badge;
        }
        AbstractC31173DnH.A11(A03, igBouncyUfiButtonImageView, AbstractC53242c7.A0H(A03, i));
        c68708Vak.A00.A01(new WeakReference(igBouncyUfiButtonImageView));
        C0fQ.A00(new WMi(this, c68708Vak, str, id, z), igFrameLayout);
        igFrameLayout.setContentDescription(A0r2);
        AbstractC56952jT.A02(igFrameLayout, A0q);
        WNV.A00(ujw.A02, 37, c70796Wh9, this);
        WNV.A00(ujw.itemView, 38, c70796Wh9, this);
        View view = ujw.itemView;
        view.setContentDescription(AbstractC166997dE.A0r(view.getResources(), user.getUsername(), 2131953049));
        AbstractC56952jT.A02(ujw.itemView, A0r);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70796Wh9.class;
    }
}
