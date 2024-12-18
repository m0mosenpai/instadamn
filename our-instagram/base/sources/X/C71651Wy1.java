package X;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: X.Wy1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71651Wy1 implements Comparator {
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();
    public final InterfaceC102244iy A02;
    public final boolean A03;

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[ORIG_RETURN, RETURN] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            android.graphics.Rect r5 = r6.A00
            android.graphics.Rect r4 = r6.A01
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r7
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.getBoundsInParent(r5)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r8 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r8
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo
            r0.getBoundsInParent(r4)
            int r1 = r5.top
            int r0 = r4.top
            r3 = -1
            if (r1 < r0) goto L40
            r2 = 1
            if (r1 > r0) goto L35
            int r1 = r5.left
            int r0 = r4.left
            if (r1 < r0) goto L3b
            if (r1 > r0) goto L36
            int r1 = r5.bottom
            int r0 = r4.bottom
            if (r1 < r0) goto L40
            if (r1 > r0) goto L35
            int r1 = r5.right
            int r0 = r4.right
            if (r1 < r0) goto L3b
            if (r1 > r0) goto L36
            r2 = 0
        L35:
            return r2
        L36:
            boolean r0 = r6.A03
            if (r0 == 0) goto L3f
            return r3
        L3b:
            boolean r0 = r6.A03
            if (r0 == 0) goto L40
        L3f:
            r3 = 1
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71651Wy1.compare(java.lang.Object, java.lang.Object):int");
    }

    public C71651Wy1(InterfaceC102244iy interfaceC102244iy, boolean z) {
        this.A03 = z;
        this.A02 = interfaceC102244iy;
    }
}
