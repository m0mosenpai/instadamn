package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.6Pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138456Pb {
    public static final C138456Pb A00 = new Object();

    public static final ObjectAnimator A02(C6TT c6tt) {
        long j;
        int ordinal = c6tt.A05.ordinal();
        if (ordinal != 3) {
            if (ordinal != 2) {
                j = 1300;
            } else {
                j = 300;
            }
        } else {
            j = 1200;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c6tt.A00(), "translationY", 0.0f);
        ofFloat.setDuration(1300L);
        ofFloat.setStartDelay(j);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        return ofFloat;
    }

    public static final AnimatorSet A00(C6TT c6tt, int i) {
        TextView A01 = c6tt.A01();
        long j = i + 900;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(A01, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setStartDelay(j);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(A01, "translationY", 0.0f);
        ofFloat2.setDuration(250L);
        ofFloat2.setStartDelay(j);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        return animatorSet;
    }

    public static final AnimatorSet A01(C6TT c6tt, int i, long j) {
        ImageView A002 = c6tt.A00();
        long j2 = i + 600;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(A002, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(j2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(A002, "translationY", c6tt.A01);
        ofFloat2.setDuration(j);
        ofFloat2.setStartDelay(j2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        return animatorSet;
    }

    public static final void A03(C138446Pa c138446Pa) {
        AnimatorSet A002 = c138446Pa.A00();
        if (A002 != null) {
            A002.cancel();
        }
        C141596ac c141596ac = c138446Pa.A00;
        if (c141596ac != null) {
            c141596ac.A0t = false;
        }
    }
}
