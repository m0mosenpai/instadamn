package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.facebook.R;

/* renamed from: X.Uxo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67772Uxo extends AbstractC70175WEx {
    public static final int[] A01 = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager A00;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r1 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C67772Uxo A00(android.view.View r8, java.lang.CharSequence r9) {
        /*
            r1 = 0
        L1:
            boolean r0 = r8 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 != 0) goto L63
            boolean r0 = r8 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L15
            int r1 = r8.getId()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 == r0) goto L63
            r1 = r8
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L15:
            android.view.ViewParent r8 = r8.getParent()
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto L21
            android.view.View r8 = (android.view.View) r8
            if (r8 != 0) goto L1
        L21:
            r8 = r1
        L22:
            if (r8 == 0) goto L66
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r7)
            int[] r0 = X.C67772Uxo.A01
            android.content.res.TypedArray r5 = r7.obtainStyledAttributes(r0)
            r4 = 0
            r3 = -1
            int r2 = r5.getResourceId(r4, r3)
            r0 = 1
            int r1 = r5.getResourceId(r0, r3)
            r5.recycle()
            if (r2 == r3) goto L47
            r0 = 2131627919(0x7f0e0f8f, float:1.8883116E38)
            if (r1 != r3) goto L4a
        L47:
            r0 = 2131624807(0x7f0e0367, float:1.8876804E38)
        L4a:
            android.view.View r0 = r6.inflate(r0, r8, r4)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            X.Uxo r1 = new X.Uxo
            r1.<init>(r7, r0, r8, r0)
            X.UBZ r0 = r1.A09
            android.view.View r0 = r0.getChildAt(r4)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            android.widget.TextView r0 = r0.A01
            r0.setText(r9)
            return r1
        L63:
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L22
        L66:
            java.lang.String r1 = "No suitable parent found from the given view. Please provide a valid view."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67772Uxo.A00(android.view.View, java.lang.CharSequence):X.Uxo");
    }

    @Override // X.AbstractC70175WEx
    public final int A03() {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        return this.A00.getRecommendedTimeoutMillis(0, 3);
    }

    public C67772Uxo(Context context, View view, ViewGroup viewGroup, X86 x86) {
        super(context, view, viewGroup, x86);
        this.A00 = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }
}
