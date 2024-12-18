package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* renamed from: X.Drr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31447Drr implements C3Ow, InterfaceC50477MQf {
    public final C57012jc A00;
    public final C57012jc A01;
    public final C57012jc A02;
    public final InterfaceC56392iX A03;
    public final GradientSpinnerAvatarView A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public C31447Drr(C57012jc c57012jc, C57012jc c57012jc2, C57012jc c57012jc3, InterfaceC56392iX interfaceC56392iX, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        C14360o3.A0B(gradientSpinnerAvatarView, 1);
        this.A04 = gradientSpinnerAvatarView;
        this.A03 = interfaceC56392iX;
        this.A01 = c57012jc;
        this.A02 = c57012jc2;
        this.A00 = c57012jc3;
        this.A05 = C1XM.A00(new MHM(this, 44));
        this.A06 = C1XM.A00(new MHM(this, 45));
        this.A07 = C1XM.A00(new MHM(this, 46));
    }

    public final void A02(C9BW c9bw, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl) {
        AbstractC167007dF.A1K(imageUrl, interfaceC11380iw);
        AbstractC31179DnN.A1P(this.A03);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A04;
        gradientSpinnerAvatarView.setVisibility(0);
        gradientSpinnerAvatarView.A0F(c9bw, interfaceC11380iw, imageUrl);
    }

    public final void A03(C9BW c9bw, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, ImageUrl imageUrl2) {
        AbstractC167007dF.A1K(interfaceC11380iw, imageUrl);
        AbstractC31179DnN.A1P(this.A03);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A04;
        gradientSpinnerAvatarView.setVisibility(0);
        gradientSpinnerAvatarView.A0G(c9bw, interfaceC11380iw, imageUrl, imageUrl2);
    }

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    public final void A00(Drawable drawable) {
        InterfaceC56392iX interfaceC56392iX = this.A03;
        if (interfaceC56392iX.CWW() && interfaceC56392iX.getView().getVisibility() == 0) {
            AbstractC31171DnF.A0J(interfaceC56392iX).setBottomBadgeDrawable(drawable);
        } else {
            this.A04.setBottomBadgeDrawable(drawable);
        }
    }

    public final void A01(Drawable drawable) {
        InterfaceC56392iX interfaceC56392iX = this.A03;
        if (interfaceC56392iX.CWW() && interfaceC56392iX.getView().getVisibility() == 0) {
            AbstractC31171DnF.A0J(interfaceC56392iX).setPresenceBadgeDrawable(drawable);
        } else {
            this.A04.setPresenceBadgeDrawable(drawable);
        }
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A04);
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A04);
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A04.A0O;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A04.setVisibility(8);
    }

    @Override // X.InterfaceC50477MQf
    public final void DQ6() {
        this.A04.A0A();
    }

    @Override // X.InterfaceC50477MQf
    public final void DQ7() {
        this.A04.A09();
    }

    @Override // X.InterfaceC50477MQf
    public final void DS5() {
        this.A04.A0A();
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A04.setVisibility(0);
    }

    public final void A04(List list, InterfaceC11380iw interfaceC11380iw) {
        boolean A1Y = AbstractC25229BEm.A1Y(list);
        InterfaceC56392iX interfaceC56392iX = this.A03;
        AbstractC31172DnG.A1T(interfaceC56392iX, A1Y ? 1 : 0);
        this.A04.setVisibility(8);
        AbstractC31171DnF.A0J(interfaceC56392iX).A08 = A1Y;
        AbstractC31171DnF.A0J(interfaceC56392iX).setImageUrls(list, interfaceC11380iw);
    }

    @Override // X.C3Ow
    public final /* bridge */ /* synthetic */ View Aek() {
        return this.A04;
    }
}
