package X;

import android.animation.ValueAnimator;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LrJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49325LrJ implements MNS {
    public final C43771JXk A00;
    public final ReelBrandingBadgeView A01;

    public final void A00() {
        C43771JXk c43771JXk = this.A00;
        LGO lgo = LGO.A01;
        if (c43771JXk.A02 == null) {
            C43771JXk.A00(c43771JXk);
            c43771JXk.A02 = lgo;
            c43771JXk.A03 = null;
        } else {
            if (c43771JXk.A03 == null) {
                C43771JXk.A00(c43771JXk);
                if (!lgo.equals(c43771JXk.A02)) {
                    c43771JXk.A03 = lgo;
                    float[] A1b = AbstractC43592JPx.A1b();
                    // fill-array-data instruction
                    A1b[0] = 1.0f;
                    A1b[1] = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
                    ofFloat.setDuration(c43771JXk.A05);
                    LMA.A01(ofFloat, c43771JXk, 21);
                    ofFloat.addListener(new C46074KaV(c43771JXk, 4));
                    c43771JXk.A01 = ofFloat;
                    ofFloat.start();
                }
            } else {
                c43771JXk.A03 = lgo;
            }
            this.A01.A02(c43771JXk);
        }
        c43771JXk.invalidateSelf();
        this.A01.A02(c43771JXk);
    }

    public C49325LrJ(ReelBrandingBadgeView reelBrandingBadgeView, Integer num) {
        this.A01 = reelBrandingBadgeView;
        this.A00 = new C43771JXk(reelBrandingBadgeView.getContext(), num, TimeUnit.MILLISECONDS);
    }
}
