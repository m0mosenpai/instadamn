package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes11.dex */
public final class U4W extends FrameLayout {
    public ViewGroup A00;
    public C66211U4h A01;
    public U6H A02;

    public final void setMode(U6H u6h) {
        C14360o3.A0B(u6h, 0);
        this.A02 = u6h;
    }

    public final C66211U4h getContentPager() {
        C66211U4h c66211U4h = this.A01;
        if (c66211U4h != null) {
            return c66211U4h;
        }
        C14360o3.A0F("contentPager");
        throw C00O.createAndThrow();
    }

    public final ViewGroup getHeaderContainer() {
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            return viewGroup;
        }
        C14360o3.A0F("headerContainer");
        throw C00O.createAndThrow();
    }

    public final U6H getMode() {
        return this.A02;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getContentPager().layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        getHeaderContainer().measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredWidth()), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredHeight()), Integer.MIN_VALUE));
        getHeaderContainer().layout(0, 0, getHeaderContainer().getMeasuredWidth(), getHeaderContainer().getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.A02.A01) {
            i3 = Integer.MIN_VALUE;
        }
        getContentPager().measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, i3));
        setMeasuredDimension(getContentPager().getMeasuredWidth(), getContentPager().getMeasuredHeight());
    }
}
