package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.LoY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49155LoY implements C7QD, C7QE {
    public C7QH A00;
    public final View A01;
    public final IgTextView A02;
    public final CircularImageView A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC56392iX A06;
    public final InterfaceC56392iX A07;
    public final AnonymousClass988 A08;
    public final MediaFrameLayout A09;

    public C49155LoY(View view, AnonymousClass988 anonymousClass988) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A08 = anonymousClass988;
        this.A07 = AbstractC56372iV.A00(view.requireViewById(R.id.text));
        this.A09 = view instanceof MediaFrameLayout ? (MediaFrameLayout) view : null;
        this.A04 = AbstractC166997dE.A0X(view, R.id.full_bleed_media);
        this.A06 = AbstractC166997dE.A0X(view, R.id.media_container);
        this.A05 = AbstractC166997dE.A0X(view, R.id.media_overlay_gradient);
        this.A03 = AbstractC31176DnK.A0U(view, R.id.profile_picture);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.username);
    }

    public static final void A00(C49155LoY c49155LoY, boolean z) {
        Context context = c49155LoY.A01.getContext();
        if (z && AbstractC167007dF.A1Z(c49155LoY.A08.A0a)) {
            AbstractC31177DnL.A0q(context, c49155LoY.A02, R.attr.igds_color_primary_text_on_media);
            c49155LoY.A03.A0H(AbstractC43594JPz.A04(context), AbstractC167007dF.A09(context, R.attr.igds_photo_border));
            AbstractC31172DnG.A1T(c49155LoY.A05, 0);
        } else {
            AbstractC31177DnL.A0q(context, c49155LoY.A02, R.attr.igds_color_secondary_text);
            c49155LoY.A03.setStrokeAlpha(0);
            InterfaceC56392iX interfaceC56392iX = c49155LoY.A05;
            if (!interfaceC56392iX.CWW()) {
                return;
            }
            interfaceC56392iX.getView().setVisibility(8);
        }
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A01;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }
}
