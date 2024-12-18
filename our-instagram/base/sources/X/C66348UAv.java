package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.UAv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66348UAv extends Animation {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public C66348UAv(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.A00.setAnimationProgress(f);
    }
}
