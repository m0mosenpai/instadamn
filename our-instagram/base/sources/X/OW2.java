package X;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class OW2 {
    public final int A00;
    public final AnimatorSet A01;
    public final View A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ValueAnimator A06;
    public final ValueAnimator A07;
    public final ValueAnimator A08;
    public final ValueAnimator A09;
    public final ValueAnimator A0A;
    public final ValueAnimator A0B;
    public final Context A0C;

    public OW2(View view) {
        this.A02 = view;
        ImageView imageView = (ImageView) AbstractC166987dD.A0c(view, R.id.wifi_bottom_bar);
        this.A03 = imageView;
        ImageView imageView2 = (ImageView) AbstractC166987dD.A0c(view, R.id.wifi_middle_bar);
        this.A04 = imageView2;
        ImageView imageView3 = (ImageView) AbstractC166987dD.A0c(view, R.id.wifi_top_bar);
        this.A05 = imageView3;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A0C = A0L;
        int color = A0L.getColor(R.color.sup_icon_light_grey);
        int color2 = A0L.getColor(R.color.abc_decor_view_status_guard_light);
        this.A00 = color2;
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Integer valueOf = Integer.valueOf(color);
        Integer valueOf2 = Integer.valueOf(color2);
        ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, valueOf, valueOf2);
        C55241OfD.A01(ofObject, this, 1);
        this.A06 = ofObject;
        ValueAnimator A00 = A00(valueOf2, valueOf);
        C55241OfD.A01(A00, this, 2);
        this.A07 = A00;
        ValueAnimator A002 = A00(valueOf, valueOf2);
        C55241OfD.A01(A002, this, 3);
        this.A08 = A002;
        ValueAnimator A003 = A00(valueOf2, valueOf);
        C55241OfD.A01(A003, this, 4);
        this.A09 = A003;
        ValueAnimator A004 = A00(valueOf, valueOf2);
        C55241OfD.A01(A004, this, 5);
        this.A0A = A004;
        ValueAnimator A005 = A00(valueOf2, valueOf);
        C55241OfD.A01(A005, this, 6);
        this.A0B = A005;
        AnimatorSet animatorSet = new AnimatorSet();
        this.A01 = animatorSet;
        animatorSet.addListener(new C50730MaX(this, 1));
        A00.setStartDelay(470L);
        A003.setStartDelay(470L);
        A005.setStartDelay(470L);
        imageView.setColorFilter(color);
        imageView2.setColorFilter(color);
        imageView3.setColorFilter(color);
        animatorSet.playSequentially(A00, A002, A003, A004, A005, ofObject);
        animatorSet.setDuration(0L);
    }

    public static ValueAnimator A00(Object obj, Object obj2) {
        return ValueAnimator.ofObject(new ArgbEvaluator(), obj, obj2);
    }

    public final void A01() {
        ImageView imageView = this.A05;
        int i = this.A00;
        imageView.setColorFilter(i);
        this.A04.setColorFilter(i);
        this.A03.setColorFilter(i);
    }
}
