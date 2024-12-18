package X;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.ui.widget.pulsingbutton.PulsingPillButton;

/* renamed from: X.GMr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36870GMr implements Runnable {
    public final /* synthetic */ PulsingPillButton A00;

    public RunnableC36870GMr(PulsingPillButton pulsingPillButton) {
        this.A00 = pulsingPillButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PulsingPillButton pulsingPillButton = this.A00;
        if (pulsingPillButton.A04) {
            AnimatorSet animatorSet = pulsingPillButton.A06;
            if (!animatorSet.isStarted()) {
                FrameLayout frameLayout = pulsingPillButton.A08;
                frameLayout.setVisibility(0);
                FrameLayout frameLayout2 = pulsingPillButton.A09;
                frameLayout2.setVisibility(0);
                int i = frameLayout.getLayoutParams().width;
                int i2 = frameLayout.getLayoutParams().height;
                Context A0L = AbstractC166997dE.A0L(pulsingPillButton);
                float f = i;
                float A00 = AbstractC13880nE.A00(A0L, pulsingPillButton.A00) * 2.0f;
                float f2 = i2;
                float f3 = (f + A00) / f;
                float f4 = (A00 + f2) / f2;
                int i3 = frameLayout2.getLayoutParams().width;
                int i4 = frameLayout2.getLayoutParams().height;
                float f5 = i3;
                float A002 = AbstractC13880nE.A00(A0L, pulsingPillButton.A01) * 2.0f;
                float f6 = i4;
                float f7 = (f5 + A002) / f5;
                float f8 = (A002 + f6) / f6;
                int i5 = pulsingPillButton.A02;
                boolean z = pulsingPillButton.A03;
                Keyframe ofFloat = Keyframe.ofFloat(0.0f, AbstractC31175DnJ.A00(z ? 1 : 0));
                Keyframe ofFloat2 = Keyframe.ofFloat(1.0f, 0.0f);
                Property property = View.ALPHA;
                PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(property, ofFloat, ofFloat2);
                PropertyValuesHolder A003 = AbstractC34853FXl.A00(f3, z);
                PropertyValuesHolder A01 = AbstractC34853FXl.A01(f4, z);
                C14360o3.A0A(ofKeyframe);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, A003, A01, ofKeyframe);
                C14360o3.A07(ofPropertyValuesHolder);
                ofPropertyValuesHolder.setDuration(2000L);
                ofPropertyValuesHolder.setRepeatCount(i5);
                int i6 = pulsingPillButton.A02;
                boolean z2 = pulsingPillButton.A03;
                float f9 = 0.3f;
                if (z2) {
                    f9 = 1.0f;
                }
                PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, f9), Keyframe.ofFloat(1.0f, 0.0f));
                PropertyValuesHolder A004 = AbstractC34853FXl.A00(f7, z2);
                PropertyValuesHolder A012 = AbstractC34853FXl.A01(f8, z2);
                C14360o3.A0A(ofKeyframe2);
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(frameLayout2, A004, A012, ofKeyframe2);
                C14360o3.A07(ofPropertyValuesHolder2);
                ofPropertyValuesHolder2.setDuration(2000L);
                ofPropertyValuesHolder2.setRepeatCount(i6);
                animatorSet.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2);
                animatorSet.start();
                return;
            }
        }
        if (pulsingPillButton.A04) {
            return;
        }
        pulsingPillButton.A08.setVisibility(8);
        pulsingPillButton.A09.setVisibility(8);
        AnimatorSet animatorSet2 = pulsingPillButton.A06;
        if (!animatorSet2.isStarted()) {
            return;
        }
        animatorSet2.end();
    }
}
