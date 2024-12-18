package androidx.constraintlayout.widget;

import X.AbstractC56322iM;
import X.C0f9;
import X.C56082hw;
import X.C56302iJ;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public class Group extends AbstractC56322iM {
    @Override // X.AbstractC56322iM
    public final void A09(ConstraintLayout container) {
        C56082hw c56082hw = ((C56302iJ) getLayoutParams()).A0x;
        c56082hw.A0I(0);
        c56082hw.A0H(0);
    }

    @Override // X.AbstractC56322iM, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1816887170);
        super.onAttachedToWindow();
        A05();
        C0f9.A0D(1579384541, A06);
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        A05();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        A05();
    }

    public Group(Context context) {
        super(context);
    }

    @Override // X.AbstractC56322iM
    public final void A06(AttributeSet attrs) {
        super.A06(attrs);
    }

    @Override // X.AbstractC56322iM
    public final void A08(ConstraintLayout container) {
        A0A(container);
    }

    public Group(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Group(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
