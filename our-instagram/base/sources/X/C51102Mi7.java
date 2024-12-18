package X;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Mi7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51102Mi7 extends C110814yt {
    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        C14360o3.A0B(displayMetrics, 0);
        return 60.0f / displayMetrics.densityDpi;
    }

    @Override // X.C110814yt
    public final int A0C(View view, int i) {
        C14360o3.A0B(view, 0);
        AbstractC70663Fe abstractC70663Fe = ((AbstractC110824yu) this).A02;
        if (abstractC70663Fe == null || !abstractC70663Fe.A1X()) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(17));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int left = view.getLeft() - marginLayoutParams.leftMargin;
        int right = view.getRight() + marginLayoutParams.rightMargin;
        return AbstractC50522MSa.A04(abstractC70663Fe.A03 - abstractC70663Fe.Baw(), abstractC70663Fe.Bau(), right, left);
    }

    @Override // X.C110814yt
    public final int A0D(View view, int i) {
        C14360o3.A0B(view, 0);
        AbstractC70663Fe abstractC70663Fe = ((AbstractC110824yu) this).A02;
        if (abstractC70663Fe == null || !abstractC70663Fe.A1Y()) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(17));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int top = view.getTop() - marginLayoutParams.topMargin;
        int bottom = view.getBottom() + marginLayoutParams.bottomMargin;
        return AbstractC50522MSa.A04(abstractC70663Fe.A00 - abstractC70663Fe.Bat(), abstractC70663Fe.Bax(), bottom, top);
    }

    @Override // X.C110814yt
    public final int A0B(int i, int i2, int i3, int i4, int i5) {
        return AbstractC50522MSa.A04(i4, i3, i2, i);
    }
}
