package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Lno, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49111Lno implements C7QC {
    public final InterfaceC11380iw A00;
    public final AnonymousClass988 A01;
    public final C162907Rb A02;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C49155LoY c49155LoY = new C49155LoY(AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.prompts_contextual_reply_card, false), this.A01);
        this.A02.A00(c49155LoY);
        return c49155LoY;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        CharSequence charSequence;
        CharSequence charSequence2;
        C49155LoY c49155LoY = (C49155LoY) c7qd;
        KTK ktk = (KTK) interfaceC129555tK;
        boolean A1R = AbstractC167007dF.A1R(0, c49155LoY, ktk);
        C7QY c7qy = ktk.A02;
        C7QL c7ql = c7qy.A0C;
        View view = c49155LoY.A01;
        C7IM c7im = c7ql.A03;
        Drawable A00 = AbstractC162807Qr.A00();
        AbstractC162737Qk.A07(A00, c7im, ktk.A06);
        view.setBackground(A00);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C1583678w c1583678w = c7qy.A0E;
        CircularImageView circularImageView = c49155LoY.A03;
        if (c1583678w != null) {
            circularImageView.setVisibility(0);
            circularImageView.setUrl((ImageUrl) c1583678w.A0A.get(0), interfaceC11380iw);
            charSequence = c1583678w.A03;
        } else {
            circularImageView.setVisibility(8);
            charSequence = null;
        }
        c49155LoY.A02.setText(charSequence);
        C1579877i c1579877i = c7qy.A0D;
        if (c1579877i != null && (charSequence2 = c1579877i.A09) != null) {
            InterfaceC56392iX interfaceC56392iX = c49155LoY.A07;
            AbstractC31172DnG.A1T(interfaceC56392iX, 0);
            ((TextView) interfaceC56392iX.getView()).setText(charSequence2);
        }
        MediaFrameLayout mediaFrameLayout = c49155LoY.A09;
        if (mediaFrameLayout != null) {
            mediaFrameLayout.A00 = -1.0f;
        }
        AbstractC1583778x abstractC1583778x = c7qy.A0F;
        if (abstractC1583778x != null && (abstractC1583778x instanceof C158737Aj)) {
            if (AbstractC167007dF.A1Z(c49155LoY.A08.A0a)) {
                InterfaceC56392iX interfaceC56392iX2 = c49155LoY.A04;
                AbstractC31172DnG.A1T(interfaceC56392iX2, 0);
                IgImageView igImageView = (IgImageView) interfaceC56392iX2.getView();
                ImageUrl imageUrl = ((C158737Aj) abstractC1583778x).A00;
                igImageView.setUrl(imageUrl, interfaceC11380iw);
                if (mediaFrameLayout != null) {
                    mediaFrameLayout.A00 = AbstractC34144F4u.A00(Integer.valueOf(imageUrl.getWidth()), Integer.valueOf(imageUrl.getHeight()));
                }
            } else {
                InterfaceC56392iX interfaceC56392iX3 = c49155LoY.A06;
                AbstractC31172DnG.A1T(interfaceC56392iX3, 0);
                MediaFrameLayout mediaFrameLayout2 = (MediaFrameLayout) interfaceC56392iX3.getView();
                ImageUrl imageUrl2 = ((C158737Aj) abstractC1583778x).A00;
                mediaFrameLayout2.A00 = AbstractC34144F4u.A00(Integer.valueOf(imageUrl2.getWidth()), Integer.valueOf(imageUrl2.getHeight()));
                AbstractC31172DnG.A0Z(interfaceC56392iX3.getView(), R.id.media).setUrl(imageUrl2, interfaceC11380iw);
            }
            C49155LoY.A00(c49155LoY, A1R);
        } else {
            C49155LoY.A00(c49155LoY, false);
        }
        this.A02.A02(c49155LoY, ktk);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C49155LoY c49155LoY = (C49155LoY) c7qd;
        C14360o3.A0B(c49155LoY, 0);
        c49155LoY.A03.A09();
        InterfaceC56392iX interfaceC56392iX = c49155LoY.A07;
        if (interfaceC56392iX.CWW()) {
            AbstractC31172DnG.A1T(interfaceC56392iX, 8);
        }
        AbstractC31178DnM.A1P(c49155LoY.A06);
        AbstractC31178DnM.A1P(c49155LoY.A04);
        AbstractC31178DnM.A1P(c49155LoY.A05);
        this.A02.A01(c49155LoY);
    }

    public C49111Lno(InterfaceC11380iw interfaceC11380iw, AnonymousClass988 anonymousClass988, C162907Rb c162907Rb) {
        this.A02 = c162907Rb;
        this.A00 = interfaceC11380iw;
        this.A01 = anonymousClass988;
    }
}
