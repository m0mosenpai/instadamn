package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.Bx7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27082Bx7 extends C3Vd {
    public final float A00;

    public C27082Bx7(float f) {
        this.A00 = f;
    }

    @Override // X.C3Vd, X.InterfaceC74243Ve
    public final void E4r(View view, ReboundViewPager reboundViewPager, float f, int i) {
        AbstractC167017dG.A1N(reboundViewPager, view);
        view.setTranslationX(((reboundViewPager.getWidth() / 2) - (this.A00 / 2.0f)) + (f * (reboundViewPager.getPageSize() + reboundViewPager.A00)));
    }
}
