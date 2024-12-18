package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.Bx9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27084Bx9 extends C3Vd {
    public final float A00;
    public final float A01;

    public C27084Bx9(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    @Override // X.C3Vd, X.InterfaceC74243Ve
    public final void E4r(View view, ReboundViewPager reboundViewPager, float f, int i) {
        AbstractC167017dG.A1N(reboundViewPager, view);
        float min = Math.min(1.0f, Math.abs(f));
        float width = reboundViewPager.getWidth() / 2;
        float f2 = this.A01 / 2.0f;
        view.setTranslationX((width - f2) + (reboundViewPager.getPageSize() * f) + (f * reboundViewPager.A00));
        view.setPivotX(f2);
        view.setPivotY(this.A00 / 2.0f);
        float f3 = 1.0f - (min * 0.2f);
        view.setScaleX(f3);
        view.setScaleY(f3);
    }
}
