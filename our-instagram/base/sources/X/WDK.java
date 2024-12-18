package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.List;

/* loaded from: classes11.dex */
public final class WDK {
    public final C005001p A01 = new C005001p(0);
    public final C005001p A00 = new C005001p(0);

    public static WDK A00(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return A01(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                return A01(AbstractC31174DnI.A0z(loadAnimator));
            }
            return null;
        } catch (Exception e) {
            android.util.Log.w("MotionSpec", AnonymousClass001.A0R("Can't load animation resource ID #0x", Integer.toHexString(i)), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.VKE, java.lang.Object] */
    public static WDK A01(List list) {
        WDK wdk = new WDK();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                wdk.A00.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = AbstractC153306uz.A01;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = AbstractC153306uz.A04;
                    }
                } else {
                    interpolator = AbstractC153306uz.A02;
                }
                ?? obj = new Object();
                obj.A00 = 0;
                obj.A01 = 1;
                obj.A02 = startDelay;
                obj.A03 = duration;
                obj.A04 = interpolator;
                obj.A00 = objectAnimator.getRepeatCount();
                obj.A01 = objectAnimator.getRepeatMode();
                wdk.A01.put(propertyName, obj);
            } else {
                throw AbstractC37303Gc4.A0M(animator, "Animator must be an ObjectAnimator: ", new StringBuilder());
            }
        }
        return wdk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WDK)) {
            return false;
        }
        return this.A01.equals(((WDK) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n');
        sb.append(MSY.A0h(this));
        sb.append('{');
        AbstractC58318PtA.A1T(sb, System.identityHashCode(this));
        sb.append(" timings: ");
        sb.append(this.A01);
        return AbstractC166997dE.A0x("}\n", sb);
    }
}
