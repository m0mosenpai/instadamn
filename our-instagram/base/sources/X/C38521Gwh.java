package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;
import java.util.List;

/* renamed from: X.Gwh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38521Gwh extends C3OO implements C3Y7, C33R {
    public C38321qM A00;
    public C75113Zb A01;
    public final int A02;
    public final View A03;
    public final ConstraintLayout A04;
    public final IgFrameLayout A05;
    public final IgFrameLayout A06;
    public final IgFrameLayout A07;
    public final IgLinearLayout A08;
    public final IgSimpleImageView A09;
    public final IgTextView A0A;
    public final IgTextView A0B;
    public final IgTextView A0C;
    public final CircularImageView A0D;
    public final IgImageView A0E;
    public final IgImageView A0F;
    public final IgdsButton A0G;
    public final SimpleVideoLayout A0H;
    public final RoundedCornerLinearLayout A0I;
    public final Context A0J;
    public final UserSession A0K;
    public final IgTextView A0L;
    public final IgView A0M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38521Gwh(Context context, View view, UserSession userSession) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A0K = userSession;
        this.A03 = view;
        this.A0J = context;
        this.A0I = (RoundedCornerLinearLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_pivot_card_container);
        this.A04 = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_pivot_card_profile_header_row);
        this.A0D = AbstractC31176DnK.A0U(view, R.id.intent_aware_ad_pivot_profile_header_image_view);
        this.A0C = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_pivot_profile_name);
        this.A0F = AbstractC167007dF.A0T(view, R.id.intent_aware_ad_pivot_profile_header_row_media_options);
        this.A0E = AbstractC167007dF.A0T(view, R.id.intent_aware_ad_pivot_card_preview_image);
        this.A0G = (IgdsButton) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_pivot_card_cta);
        this.A0H = (SimpleVideoLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_pivot_card_preview_video);
        this.A08 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_pivot_card_name_cta_container);
        this.A0B = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_pivot_card_contextual_cta_text);
        this.A0L = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_pivot_card_contextual_caption_text);
        this.A09 = AbstractC31176DnK.A0T(view, R.id.intent_aware_ad_pivot_card_contextual_cta_chevron);
        this.A07 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_pivot_card_name_contextual_cta_container);
        this.A06 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_pivot_card_caption_container);
        this.A0A = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_pivot_card_caption_text);
        this.A0M = (IgView) AbstractC166997dE.A0R(view, R.id.divider);
        this.A05 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_pivot_card_preview_image_container);
        this.A02 = AbstractC167007dF.A09(context, R.attr.igds_color_primary_button_on_media);
    }

    @Override // X.C3Y7
    public final C3W4 Adr() {
        return null;
    }

    @Override // X.C3Y7
    public final C86083sf B61() {
        return null;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return null;
    }

    @Override // X.C3Y7
    public final InterfaceC80343iO BRd() {
        return null;
    }

    @Override // X.C3Y7
    public final C86033sa BS3() {
        return null;
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        InterfaceC38831rF interfaceC38831rF;
        String str;
        C38321qM c38321qM;
        C38321qM c38321qM2;
        C14360o3.A0B(c75113Zb, 0);
        if (i == 5) {
            Context context = this.A0J;
            int color = context.getColor(AbstractC53242c7.A0D(context));
            C38321qM c38321qM3 = this.A00;
            int color2 = context.getColor(R.color.badge_color);
            if (c38321qM3 != null) {
                if (c38321qM3.A5M()) {
                    str = null;
                    List A0Y = AbstractC37300Gc1.A0Y(c38321qM3);
                    if (A0Y != null && (c38321qM = (C38321qM) AbstractC001800i.A0J(A0Y)) != null && c38321qM.A0C.getDominantColor() != null) {
                        List A0Y2 = AbstractC37300Gc1.A0Y(c38321qM3);
                        if (A0Y2 != null && (c38321qM2 = (C38321qM) AbstractC001800i.A0J(A0Y2)) != null) {
                            interfaceC38831rF = c38321qM2.A0C;
                            str = interfaceC38831rF.getDominantColor();
                        }
                        color2 = Color.parseColor(str);
                    }
                }
                if (c38321qM3.A0C.getDominantColor() != null) {
                    interfaceC38831rF = c38321qM3.A0C;
                    str = interfaceC38831rF.getDominantColor();
                    color2 = Color.parseColor(str);
                }
            }
            int A01 = AbstractC31174DnI.A01(context);
            if (c75113Zb.A28) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new C41787If3(this, A01, color2, color));
                ofFloat.setDuration(200L).start();
            } else {
                this.A0B.setTextColor(A01);
                this.A09.setColorFilter(A01);
                this.A07.setBackgroundColor(color);
            }
        }
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3Vo] */
    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return new Object();
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A0E;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A01;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        return this.A0H;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final int CFi() {
        return this.A0H.getWidth();
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        AbstractC167017dG.A1N(imageUrl, interfaceC11380iw);
        this.A0E.A0D(interfaceC11380iw, null, imageUrl, z);
    }
}
