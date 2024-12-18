package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Gwk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38524Gwk extends C3OO implements C33R {
    public C37931GmT A00;
    public final Context A01;
    public final View A02;
    public final RelativeLayout A03;
    public final TextView A04;
    public final TextView A05;
    public final IgFrameLayout A06;
    public final IgFrameLayout A07;
    public final IgFrameLayout A08;
    public final IgFrameLayout A09;
    public final IgLinearLayout A0A;
    public final IgTextView A0B;
    public final IgView A0C;
    public final IgView A0D;
    public final IgImageView A0E;
    public final C38214GrJ A0F;
    public final IgImageButton A0G;
    public final Activity A0H;
    public final ViewGroup A0I;
    public final UserSession A0J;
    public final IgImageView A0K;

    @Override // X.C33R
    public void DSJ(C75113Zb c75113Zb, int i) {
        C38214GrJ c38214GrJ;
        C14360o3.A0B(c75113Zb, 0);
        if (this.A00 != null && i == 5) {
            if (this.A06.getVisibility() == 0 && c75113Zb.A28) {
                this.A0D.animate().alpha(0.0f).withEndAction(new J30(this)).setDuration(200L);
                this.A07.animate().alpha(1.0f).withEndAction(new J31(this)).setDuration(200L);
                return;
            }
            return;
        }
        if (i != 50) {
            return;
        }
        if (this instanceof HKM) {
            c38214GrJ = ((HKM) this).A01;
        } else {
            c38214GrJ = this.A0F;
        }
        if (c38214GrJ == null) {
            return;
        }
        c38214GrJ.DSJ(c75113Zb, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38524Gwk(Activity activity, Context context, View view, UserSession userSession) {
        super(view);
        C38214GrJ c38214GrJ;
        AbstractC167017dG.A1R(context, userSession);
        this.A02 = view;
        this.A01 = context;
        this.A0J = userSession;
        this.A0H = activity;
        this.A0G = (IgImageButton) AbstractC166987dD.A0c(view, R.id.image_button);
        this.A03 = (RelativeLayout) AbstractC166987dD.A0c(view, R.id.ad_overlay);
        this.A0C = (IgView) AbstractC166987dD.A0c(view, R.id.top_legibility_gradient);
        this.A09 = (IgFrameLayout) AbstractC166987dD.A0c(view, R.id.more_button_click_area);
        this.A0K = AbstractC37302Gc3.A0K(view, R.id.more_button);
        this.A0E = AbstractC37302Gc3.A0K(view, R.id.carousel_icon);
        this.A0I = (ViewGroup) AbstractC166987dD.A0c(view, R.id.handle_sponsored_pill_container);
        this.A08 = (IgFrameLayout) AbstractC166987dD.A0c(view, R.id.handle_sponsored_pill_click_area);
        this.A0A = (IgLinearLayout) AbstractC166987dD.A0c(view, R.id.handle_sponsored_pill);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.handle_pill);
        this.A05 = AbstractC25230BEn.A0Q(view, R.id.label_pill);
        this.A0D = (IgView) AbstractC166987dD.A0c(view, R.id.legibility_gradient_bottom);
        this.A0B = AbstractC31175DnJ.A0L(view, R.id.ad_cta_text_banner);
        this.A06 = (IgFrameLayout) AbstractC166987dD.A0c(view, R.id.cta_button_banner);
        this.A07 = (IgFrameLayout) AbstractC166987dD.A0c(view, R.id.cta_button_banner_color_fill);
        if (view instanceof ViewGroup) {
            c38214GrJ = new C38214GrJ(activity, context, (ViewGroup) view, userSession);
        } else {
            c38214GrJ = null;
        }
        this.A0F = c38214GrJ;
    }
}
