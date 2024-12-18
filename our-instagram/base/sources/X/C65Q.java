package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: X.65Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C65Q {
    public C65U A00;
    public C65U A01;
    public C65U A02;
    public C65U A03;
    public C65S A04;
    public C65S A05;
    public C65S A06;
    public C65S A07;
    public C65V A08;
    public C65V A09;
    public C65V A0A;
    public C65V A0B;

    public static C72G A01(Context context, AttributeSet attributeSet, int i, int i2) {
        C65T c65t = new C65T(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C65N.A0Q, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return A02(context, c65t, resourceId, resourceId2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.65S] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.65S] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.65S] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.65S] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    public static C72G A02(Context context, C65U c65u, int i, int i2) {
        ?? r0;
        ?? r02;
        ?? r03;
        ?? r04;
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C65N.A0W);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            C65U A00 = A00(obtainStyledAttributes, c65u, 5);
            C65U A002 = A00(obtainStyledAttributes, A00, 8);
            C65U A003 = A00(obtainStyledAttributes, A00, 9);
            C65U A004 = A00(obtainStyledAttributes, A00, 7);
            C65U A005 = A00(obtainStyledAttributes, A00, 6);
            C72G c72g = new C72G();
            if (i4 == 0 || i4 != 1) {
                r0 = new Object();
            } else {
                r0 = new Object();
            }
            c72g.A06 = r0;
            c72g.A02 = A002;
            if (i5 == 0 || i5 != 1) {
                r02 = new Object();
            } else {
                r02 = new Object();
            }
            c72g.A07 = r02;
            c72g.A03 = A003;
            if (i6 == 0 || i6 != 1) {
                r03 = new Object();
            } else {
                r03 = new Object();
            }
            c72g.A05 = r03;
            c72g.A01 = A004;
            if (i7 == 0 || i7 != 1) {
                r04 = new Object();
            } else {
                r04 = new Object();
            }
            c72g.A04 = r04;
            c72g.A00 = A005;
            return c72g;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r5.A01.Art(r6) != r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if ((r5.A04 instanceof X.C65R) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r5.A08.getClass().equals(X.C65V.class) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(android.graphics.RectF r6) {
        /*
            r5 = this;
            X.65V r0 = r5.A09
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<X.65V> r1 = X.C65V.class
            boolean r0 = r0.equals(r1)
            r4 = 1
            if (r0 == 0) goto L34
            X.65V r0 = r5.A0A
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            X.65V r0 = r5.A0B
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            X.65V r0 = r5.A08
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            r3 = 1
            if (r0 != 0) goto L35
        L34:
            r3 = 0
        L35:
            X.65U r0 = r5.A02
            float r1 = r0.Art(r6)
            X.65U r0 = r5.A03
            float r0 = r0.Art(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            X.65U r0 = r5.A00
            float r0 = r0.Art(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            X.65U r0 = r5.A01
            float r0 = r0.Art(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L5b
        L5a:
            r2 = 0
        L5b:
            X.65S r0 = r5.A07
            boolean r0 = r0 instanceof X.C65R
            if (r0 == 0) goto L74
            X.65S r0 = r5.A06
            boolean r0 = r0 instanceof X.C65R
            if (r0 == 0) goto L74
            X.65S r0 = r5.A05
            boolean r0 = r0 instanceof X.C65R
            if (r0 == 0) goto L74
            X.65S r0 = r5.A04
            boolean r1 = r0 instanceof X.C65R
            r0 = 1
            if (r1 != 0) goto L75
        L74:
            r0 = 0
        L75:
            if (r3 == 0) goto L7c
            if (r2 == 0) goto L7c
            if (r0 == 0) goto L7c
            return r4
        L7c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65Q.A03(android.graphics.RectF):boolean");
    }

    public C65Q(C72G c72g) {
        this.A06 = c72g.A06;
        this.A07 = c72g.A07;
        this.A05 = c72g.A05;
        this.A04 = c72g.A04;
        this.A02 = c72g.A02;
        this.A03 = c72g.A03;
        this.A01 = c72g.A01;
        this.A00 = c72g.A00;
        this.A0B = c72g.A0B;
        this.A0A = c72g.A0A;
        this.A08 = c72g.A08;
        this.A09 = c72g.A09;
    }

    public static C65U A00(TypedArray typedArray, C65U c65u, int i) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new C65T(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 != 6) {
                return c65u;
            }
            return new C72H(peekValue.getFraction(1.0f, 1.0f));
        }
        return c65u;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.65S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.65S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.65V] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.65V] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.65S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.65S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.65V] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.65V] */
    public C65Q() {
        this.A06 = new Object();
        this.A07 = new Object();
        this.A05 = new Object();
        this.A04 = new Object();
        this.A02 = new C65T(0.0f);
        this.A03 = new C65T(0.0f);
        this.A01 = new C65T(0.0f);
        this.A00 = new C65T(0.0f);
        this.A0B = new Object();
        this.A0A = new Object();
        this.A08 = new Object();
        this.A09 = new Object();
    }
}
