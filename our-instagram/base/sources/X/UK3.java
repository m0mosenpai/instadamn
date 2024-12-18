package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UK3 extends AbstractC66024TyM {
    public static final String[] A01 = {"android:visibility:visibility", "android:visibility:parent"};
    public int A00 = 3;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r1 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r5.A03 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r5.A01 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (r9 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.VlS, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C69320VlS A00(X.C66025TyN r8, X.C66025TyN r9) {
        /*
            X.VlS r5 = new X.VlS
            r5.<init>()
            r6 = 0
            r5.A05 = r6
            r5.A04 = r6
            java.lang.String r7 = "android:visibility:parent"
            r4 = 0
            r3 = -1
            java.lang.String r2 = "android:visibility:visibility"
            if (r8 == 0) goto L72
            java.util.Map r1 = r8.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L72
            int r0 = X.AbstractC65702TsY.A0E(r2, r1)
            r5.A01 = r0
            java.lang.Object r0 = r1.get(r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.A03 = r0
        L28:
            if (r9 == 0) goto L6f
            java.util.Map r1 = r9.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L6f
            int r0 = X.AbstractC65702TsY.A0E(r2, r1)
            r5.A00 = r0
            java.lang.Object r4 = r1.get(r7)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L3e:
            r5.A02 = r4
            r3 = 1
            if (r8 == 0) goto L50
            if (r9 == 0) goto L56
            int r2 = r5.A01
            int r1 = r5.A00
            if (r2 != r1) goto L5f
            android.view.ViewGroup r0 = r5.A03
            if (r0 != r4) goto L5f
        L4f:
            return r5
        L50:
            int r0 = r5.A00
            if (r0 == 0) goto L65
            if (r9 != 0) goto L4f
        L56:
            int r0 = r5.A01
            if (r0 != 0) goto L4f
        L5a:
            r5.A04 = r6
        L5c:
            r5.A05 = r3
            return r5
        L5f:
            if (r2 == r1) goto L68
            if (r2 == 0) goto L5a
            if (r1 != 0) goto L4f
        L65:
            r5.A04 = r3
            goto L5c
        L68:
            if (r4 == 0) goto L5a
            android.view.ViewGroup r0 = r5.A03
            if (r0 != 0) goto L4f
            goto L65
        L6f:
            r5.A00 = r3
            goto L3e
        L72:
            r5.A01 = r3
            r5.A03 = r4
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UK3.A00(X.TyN, X.TyN):X.VlS");
    }

    public static void A01(C66025TyN c66025TyN) {
        View view = c66025TyN.A00;
        int visibility = view.getVisibility();
        Map map = c66025TyN.A02;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public final ObjectAnimator A0d(View view, C66025TyN c66025TyN, C66025TyN c66025TyN2) {
        Number number;
        Property property = VZP.A00;
        float f = 1.0f;
        Number number2 = (Number) c66025TyN.A02.get("android:fade:transitionAlpha");
        if (number2 != null) {
            f = number2.floatValue();
        }
        if (f == 0.0f) {
            float f2 = 1.0f;
            if (c66025TyN2 != null && (number = (Number) c66025TyN2.A02.get("android:fade:transitionAlpha")) != null) {
                f2 = number.floatValue();
            }
            VZP.A02.A03(view, f2);
            return null;
        }
        VZP.A02.A03(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) VZP.A01, 0.0f);
        U87 u87 = new U87(view);
        ofFloat.addListener(u87);
        A07().A0A(u87);
        return ofFloat;
    }
}
