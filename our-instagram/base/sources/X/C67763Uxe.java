package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.facebook.R;

/* renamed from: X.Uxe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67763Uxe extends AbstractC69573Vrc {
    public float A00;
    public int A01;
    public ObjectAnimator A02;
    public AbstractC68255VJs A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC69617VsK A06;
    public final Interpolator[] A07;
    public static final int[] A0A = {533, 567, 850, 750};
    public static final int[] A09 = {1267, 1000, 333, 0};
    public static final Property A08 = new C66041Tyd(13);

    public C67763Uxe(Context context, C67757UxY c67757UxY) {
        super(2);
        this.A01 = 0;
        this.A03 = null;
        this.A06 = c67757UxY;
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_head_interpolator);
        if (loadInterpolator != null) {
            Interpolator loadInterpolator2 = AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_tail_interpolator);
            if (loadInterpolator2 != null) {
                Interpolator loadInterpolator3 = AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_head_interpolator);
                if (loadInterpolator3 != null) {
                    Interpolator loadInterpolator4 = AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_tail_interpolator);
                    if (loadInterpolator4 != null) {
                        this.A07 = new Interpolator[]{loadInterpolator, loadInterpolator2, loadInterpolator3, loadInterpolator4};
                        return;
                    }
                    throw new NullPointerException("Failed to parse interpolator, no start tag found");
                }
                throw new NullPointerException("Failed to parse interpolator, no start tag found");
            }
            throw new NullPointerException("Failed to parse interpolator, no start tag found");
        }
        throw new NullPointerException("Failed to parse interpolator, no start tag found");
    }
}
