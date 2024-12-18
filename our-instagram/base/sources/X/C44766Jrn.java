package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Jrn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44766Jrn extends C3OO {
    public C45115Jxk A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final ConstrainedImageView A04;
    public final ConstrainedImageView A05;
    public final List A06;
    public final List A07;

    public static ObjectAnimator A00(ObjectAnimator objectAnimator, Random random) {
        ObjectAnimator duration = objectAnimator.setDuration(random.nextInt(1000) + CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
        C14360o3.A07(duration);
        duration.setRepeatCount(-1);
        duration.setRepeatMode(2);
        return duration;
    }

    public final void A01(boolean z) {
        List<InterfaceC56392iX> list = this.A06;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC56392iX) it.next()).setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
        if (z) {
            List list2 = this.A07;
            if (list2.isEmpty()) {
                Random random = new Random();
                for (InterfaceC56392iX interfaceC56392iX : list) {
                    View view = interfaceC56392iX.getView();
                    C14360o3.A0B(view, 0);
                    Random random2 = new Random();
                    int dimensionPixelOffset = AbstractC25228BEl.A0M(view).getDimensionPixelOffset(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                    ObjectAnimator A00 = A00(ObjectAnimator.ofFloat(view, "translationY", -random2.nextInt(dimensionPixelOffset), random2.nextInt(dimensionPixelOffset)), random2);
                    ObjectAnimator A002 = A00(ObjectAnimator.ofFloat(view, "translationX", -random2.nextInt(dimensionPixelOffset), random2.nextInt(dimensionPixelOffset)), random2);
                    ObjectAnimator A003 = A00(ObjectAnimator.ofFloat(view, "rotation", -random2.nextInt(20), random2.nextInt(20)), random2);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(A00, A002, A003);
                    list2.add(animatorSet);
                    float nextFloat = (random.nextFloat() * 0.6f) + 0.4f;
                    interfaceC56392iX.getView().setScaleX(nextFloat);
                    interfaceC56392iX.getView().setScaleY(nextFloat);
                }
            }
        }
        for (Animator animator : this.A07) {
            if (z) {
                animator.start();
            } else {
                animator.cancel();
            }
        }
    }

    public C44766Jrn(View view) {
        super(view);
        this.A03 = AbstractC31176DnK.A0U(view, R.id.row_avatar);
        this.A01 = AbstractC167007dF.A0N(view, R.id.primary_name);
        this.A02 = AbstractC167007dF.A0N(view, R.id.subtitle);
        this.A04 = (ConstrainedImageView) AbstractC166997dE.A0R(view, R.id.main_emoji);
        this.A05 = (ConstrainedImageView) AbstractC166997dE.A0R(view, R.id.overlay);
        this.A07 = AbstractC166987dD.A1E();
        this.A06 = AbstractC16960so.A1N(AbstractC56372iV.A01(view.requireViewById(R.id.super_react_emoji_1), false, false), AbstractC37301Gc2.A0D(view, R.id.super_react_emoji_2), AbstractC37301Gc2.A0D(view, R.id.super_react_emoji_3), AbstractC37301Gc2.A0D(view, R.id.super_react_emoji_4), AbstractC37301Gc2.A0D(view, R.id.super_react_emoji_5), AbstractC37301Gc2.A0D(view, R.id.super_react_emoji_6), AbstractC37301Gc2.A0D(view, R.id.super_react_emoji_7), AbstractC37301Gc2.A0D(view, R.id.super_react_emoji_8));
    }
}
