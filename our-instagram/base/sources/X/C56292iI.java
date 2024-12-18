package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.2iI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56292iI extends ViewGroup.MarginLayoutParams {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public View A09;
    public CoordinatorLayout.Behavior A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Rect A0F;

    public final void A00(CoordinatorLayout.Behavior behavior) {
        CoordinatorLayout.Behavior behavior2 = this.A0A;
        if (behavior2 != behavior) {
            if (behavior2 != null) {
                behavior2.A0G();
            }
            this.A0A = behavior;
            this.A0B = true;
            if (behavior != null) {
                behavior.A0K(this);
            }
        }
    }

    public C56292iI(C56292iI c56292iI) {
        super((ViewGroup.MarginLayoutParams) c56292iI);
        this.A0B = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A0F = new Rect();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae A[Catch: Exception -> 0x00dd, TryCatch #0 {Exception -> 0x00dd, blocks: (B:12:0x00a4, B:14:0x00ae, B:15:0x00b6, B:17:0x00be, B:18:0x00d2), top: B:11:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be A[Catch: Exception -> 0x00dd, TryCatch #0 {Exception -> 0x00dd, blocks: (B:12:0x00a4, B:14:0x00ae, B:15:0x00b6, B:17:0x00be, B:18:0x00d2), top: B:11:0x00a4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C56292iI(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            r8.<init>(r9, r10)
            r6 = 0
            r8.A0B = r6
            r8.A02 = r6
            r8.A00 = r6
            r1 = -1
            r8.A04 = r1
            r8.A05 = r1
            r8.A03 = r6
            r8.A01 = r6
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.A0F = r0
            int[] r0 = X.AbstractC56032hq.A01
            android.content.res.TypedArray r4 = r9.obtainStyledAttributes(r10, r0)
            int r0 = r4.getInteger(r6, r6)
            r8.A02 = r0
            r5 = 1
            int r0 = r4.getResourceId(r5, r1)
            r8.A05 = r0
            r0 = 2
            int r0 = r4.getInteger(r0, r6)
            r8.A00 = r0
            r0 = 6
            int r0 = r4.getInteger(r0, r1)
            r8.A04 = r0
            r0 = 5
            int r0 = r4.getInt(r0, r6)
            r8.A03 = r0
            r0 = 4
            int r0 = r4.getInt(r0, r6)
            r8.A01 = r0
            r1 = 3
            boolean r0 = r4.hasValue(r1)
            r8.A0B = r0
            if (r0 == 0) goto L61
            java.lang.String r3 = r4.getString(r1)
            java.lang.Class[] r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L6c
            r0 = 0
        L5f:
            r8.A0A = r0
        L61:
            r4.recycle()
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r8.A0A
            if (r0 == 0) goto L6b
            r0.A0K(r8)
        L6b:
            return
        L6c:
            java.lang.String r0 = "."
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L88
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = r9.getPackageName()
            r7.append(r0)
        L80:
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            goto La4
        L88:
            r2 = 46
            int r0 = r3.indexOf(r2)
            if (r0 >= 0) goto La4
            java.lang.String r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto La4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r2)
            goto L80
        La4:
            java.lang.ThreadLocal r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.A0J     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Exception -> Ldd
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> Ldd
            if (r2 != 0) goto Lb6
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> Ldd
            r2.<init>()     // Catch: java.lang.Exception -> Ldd
            r0.set(r2)     // Catch: java.lang.Exception -> Ldd
        Lb6:
            java.lang.Object r1 = r2.get(r3)     // Catch: java.lang.Exception -> Ldd
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1     // Catch: java.lang.Exception -> Ldd
            if (r1 != 0) goto Ld2
            java.lang.ClassLoader r0 = r9.getClassLoader()     // Catch: java.lang.Exception -> Ldd
            java.lang.Class r1 = java.lang.Class.forName(r3, r6, r0)     // Catch: java.lang.Exception -> Ldd
            java.lang.Class[] r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.A0L     // Catch: java.lang.Exception -> Ldd
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Exception -> Ldd
            r1.setAccessible(r5)     // Catch: java.lang.Exception -> Ldd
            r2.put(r3, r1)     // Catch: java.lang.Exception -> Ldd
        Ld2:
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r10}     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Exception -> Ldd
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) r0     // Catch: java.lang.Exception -> Ldd
            goto L5f
        Ldd:
            r2 = move-exception
            java.lang.String r0 = "Could not inflate Behavior subclass "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r3)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56292iI.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public C56292iI(int i, int i2) {
        super(i, i2);
        this.A0B = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A0F = new Rect();
    }

    public C56292iI(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A0B = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A0F = new Rect();
    }

    public C56292iI(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A0B = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A0F = new Rect();
    }
}
