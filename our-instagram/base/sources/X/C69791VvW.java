package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.venue.Venue;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.VvW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69791VvW {
    public Venue A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final C70995WmB A05;
    public final GradientSpinner A06;
    public final Context A07;
    public final View A08;
    public final View A09;
    public final LinearLayout A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final UserSession A0D;

    public final void A00(Spannable spannable, View.OnClickListener onClickListener, String str) {
        A02(false);
        TextView textView = this.A0C;
        textView.setText(str);
        LinearLayout linearLayout = this.A0A;
        C0fQ.A00(onClickListener, linearLayout);
        textView.setVisibility(0);
        TextView textView2 = this.A0B;
        if (spannable == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(spannable);
            textView2.setVisibility(0);
        }
        textView.setGravity(8388611);
        linearLayout.setGravity(8388627);
        ImageView imageView = this.A02;
        if (imageView.getVisibility() == 4) {
            imageView.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        if (r6 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.InterfaceC11380iw r4, X.InterfaceC71924XAi r5, com.instagram.model.reels.Reel r6, com.instagram.model.venue.Venue r7) {
        /*
            r3 = this;
            if (r7 == 0) goto L5
            r2 = 1
            if (r6 != 0) goto L6
        L5:
            r2 = 0
        L6:
            r3.A03(r2)
            com.instagram.model.venue.Venue r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r7, r0)
            if (r0 != 0) goto L1e
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A04
            r1 = 4
            r0.setVisibility(r1)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r3.A06
            r0.setVisibility(r1)
            r3.A00 = r7
        L1e:
            if (r2 == 0) goto L52
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r3.A04
            r1 = 4
            X.OwY r0 = new X.OwY
            r0.<init>(r3, r1)
            r2.A0E = r0
            X.C14360o3.A0A(r6)
            com.instagram.common.typedurl.ImageUrl r0 = r6.A07()
            if (r0 == 0) goto L39
            X.C14360o3.A0A(r4)
            r2.setUrl(r0, r4)
        L39:
            android.widget.LinearLayout r1 = r3.A0A
            r0 = 28
            X.WNX.A00(r1, r6, r3, r5, r0)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = r3.A06
            r0 = 29
            X.WNX.A00(r1, r6, r3, r5, r0)
            com.instagram.common.session.UserSession r0 = r3.A0D
            boolean r0 = r6.A16(r0)
            if (r0 == 0) goto L53
            r1.A04()
        L52:
            return
        L53:
            r1.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69791VvW.A01(X.0iw, X.XAi, com.instagram.model.reels.Reel, com.instagram.model.venue.Venue):void");
    }

    public final void A02(boolean z) {
        TextView textView = this.A03;
        textView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        LinearLayout linearLayout = this.A0A;
        int i = 0;
        if (z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (z) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            C14360o3.A07(compoundDrawables);
            Drawable drawable = compoundDrawables[0];
            if (drawable != null) {
                Context context = this.A07;
                AbstractC25231BEo.A0x(context, drawable, AbstractC53242c7.A08(context));
            }
            this.A02.setVisibility(8);
            this.A01.setVisibility(8);
            this.A08.setVisibility(8);
            this.A09.setVisibility(8);
        }
    }

    public final void A03(boolean z) {
        int i = 0;
        this.A08.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        View view = this.A09;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        if (!z) {
            this.A0A.setOnClickListener(null);
        }
    }

    public C69791VvW(View view, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, view);
        this.A07 = AbstractC166997dE.A0L(view);
        this.A0D = userSession;
        this.A0A = (LinearLayout) AbstractC166997dE.A0R(view, R.id.action_bar_title_layout);
        this.A0C = AbstractC167007dF.A0N(view, R.id.action_bar_title);
        this.A0B = AbstractC167007dF.A0N(view, R.id.action_bar_sub_title);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.search_field_affordance);
        this.A03 = A0N;
        this.A01 = AbstractC31176DnK.A0D(view, R.id.accessory_button);
        this.A02 = AbstractC31176DnK.A0D(view, R.id.x_button);
        CircularImageView A0U = AbstractC31176DnK.A0U(view, R.id.story_image);
        this.A04 = A0U;
        GradientSpinner gradientSpinner = (GradientSpinner) AbstractC166997dE.A0R(view, R.id.gradient_spinner);
        this.A06 = gradientSpinner;
        this.A05 = new C70995WmB(A0U, gradientSpinner);
        this.A08 = AbstractC166997dE.A0S(view, R.id.story_container);
        this.A09 = AbstractC166997dE.A0S(view, R.id.story_separator);
        A0N.setHint(2131972993);
    }
}
