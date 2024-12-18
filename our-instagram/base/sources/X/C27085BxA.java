package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.BxA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27085BxA extends C3Vd {
    public final float A00;

    @Override // X.C3Vd, X.InterfaceC74243Ve
    public final void E4r(View view, ReboundViewPager reboundViewPager, float f, int i) {
        C14360o3.A0B(view, 1);
        float cameraDistance = view.getCameraDistance();
        float f2 = this.A00;
        int i2 = 0;
        if (cameraDistance != f2) {
            view.setCameraDistance(f2);
        }
        if (Math.abs(f) >= 1.0f) {
            i2 = 4;
        }
        view.setVisibility(i2);
    }

    @Override // X.C3Vd, X.InterfaceC74243Ve
    public final boolean F83(ReboundViewPager reboundViewPager, float f, float f2) {
        return true;
    }

    public C27085BxA(float f) {
        this.A00 = f;
    }
}
