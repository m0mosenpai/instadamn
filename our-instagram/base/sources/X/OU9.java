package X;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* loaded from: classes9.dex */
public final class OU9 {
    public boolean A00 = true;
    public final View A01;
    public final View A02;
    public final View A03;
    public final boolean A04;

    public OU9(View view, View view2, View view3, boolean z) {
        this.A04 = z;
        this.A01 = view;
        this.A02 = view2;
        this.A03 = view3;
    }

    public static final ValueAnimator A00(InterfaceC71963XCp interfaceC71963XCp, OU9 ou9, int i, int i2, int i3, int i4) {
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt(IgReactMediaPickerNativeModule.WIDTH, i, i2), PropertyValuesHolder.ofInt("margin", i3, i4));
        ofPropertyValuesHolder.setDuration(400L);
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
        C55241OfD.A01(ofPropertyValuesHolder, ou9, 16);
        ofPropertyValuesHolder.addListener(new C66300U7y(6, interfaceC71963XCp, ou9));
        return ofPropertyValuesHolder;
    }
}
