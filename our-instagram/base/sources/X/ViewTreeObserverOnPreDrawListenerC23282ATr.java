package X;

import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.venue.Venue;

/* renamed from: X.ATr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC23282ATr implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ SpannableStringBuilder A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C140366Wq A02;
    public final /* synthetic */ C30C A03;
    public final /* synthetic */ C38321qM A04;
    public final /* synthetic */ Venue A05;
    public final /* synthetic */ boolean A06;

    public ViewTreeObserverOnPreDrawListenerC23282ATr(SpannableStringBuilder spannableStringBuilder, UserSession userSession, C140366Wq c140366Wq, C30C c30c, C38321qM c38321qM, Venue venue, boolean z) {
        this.A03 = c30c;
        this.A02 = c140366Wq;
        this.A04 = c38321qM;
        this.A01 = userSession;
        this.A06 = z;
        this.A05 = venue;
        this.A00 = spannableStringBuilder;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int right;
        int right2;
        C140366Wq c140366Wq = this.A02;
        TextView textView = c140366Wq.A0C;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        C30C c30c = this.A03;
        if (AbstractC13620mo.A02(c30c.A07)) {
            right = c140366Wq.A0B.getLeft();
            right2 = c140366Wq.A0D.getWidth();
        } else {
            CircularImageView circularImageView = c140366Wq.A0D;
            right = circularImageView.getRight();
            right2 = (c140366Wq.A02.getRight() - textView.getRight()) - circularImageView.getRight();
        }
        C38321qM c38321qM = this.A04;
        TextView textView2 = c140366Wq.A0A;
        if (textView2 == null) {
            textView2 = (TextView) c140366Wq.A04.inflate();
            c140366Wq.A0A = textView2;
        }
        boolean z = this.A06;
        Venue venue = this.A05;
        SpannableStringBuilder spannableStringBuilder = this.A00;
        int i = c30c.A06;
        int i2 = c30c.A02;
        int bottom = textView.getBottom();
        AbstractC167007dF.A1I(textView2, 4, spannableStringBuilder);
        if (z && venue != null) {
            if (AbstractC166987dD.A07(textView) < textView.getPaint().measureText(AnonymousClass001.A0g(AbstractC166987dD.A19(spannableStringBuilder), " • ", venue.A00.getName()))) {
                textView2.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                boolean A4u = c38321qM.A4u();
                AbstractC89383ye.A0B(spannableStringBuilder2, null, new C76733cL(c38321qM), c38321qM.A2Q(), venue.A00.getName(), i, i2, A4u);
                textView2.setText(spannableStringBuilder2);
                ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(right, bottom, right2, 0);
                textView2.setLayoutParams(marginLayoutParams);
                return false;
            }
            AbstractC13880nE.A0P(textView2);
            boolean A4u2 = c38321qM.A4u();
            AbstractC89383ye.A0B(spannableStringBuilder, null, new C76733cL(c38321qM), c38321qM.A2Q(), venue.A00.getName(), i, i2, A4u2);
            textView.setText(spannableStringBuilder);
            return false;
        }
        AbstractC13880nE.A0P(textView2);
        return false;
    }
}
