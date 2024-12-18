package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.3WT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WT {
    public C69182VjB A00;
    public C69182VjB A01;
    public C69182VjB A02;
    public final View A03;
    public final C52102aA A04 = C52102aA.A01();

    public final void A03() {
        this.A00 = null;
        A02();
        A02();
    }

    public final ColorStateList A00() {
        C69182VjB c69182VjB = this.A02;
        if (c69182VjB != null) {
            return c69182VjB.A00;
        }
        return null;
    }

    public final PorterDuff.Mode A01() {
        C69182VjB c69182VjB = this.A02;
        if (c69182VjB != null) {
            return c69182VjB.A01;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.VjB, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r5 = this;
            android.view.View r4 = r5.A03
            android.graphics.drawable.Drawable r3 = r4.getBackground()
            if (r3 == 0) goto L45
            X.VjB r0 = r5.A00
            if (r0 == 0) goto L46
            X.VjB r2 = r5.A01
            if (r2 != 0) goto L17
            X.VjB r2 = new X.VjB
            r2.<init>()
            r5.A01 = r2
        L17:
            r1 = 0
            r2.A00 = r1
            r0 = 0
            r2.A02 = r0
            r2.A01 = r1
            r2.A03 = r0
            android.content.res.ColorStateList r0 = r4.getBackgroundTintList()
            r1 = 1
            if (r0 == 0) goto L2c
            r2.A02 = r1
            r2.A00 = r0
        L2c:
            android.graphics.PorterDuff$Mode r0 = r4.getBackgroundTintMode()
            if (r0 == 0) goto L36
            r2.A03 = r1
            r2.A01 = r0
        L36:
            boolean r0 = r2.A02
            if (r0 != 0) goto L3e
            boolean r0 = r2.A03
            if (r0 == 0) goto L46
        L3e:
            int[] r0 = r4.getDrawableState()
            X.C52112aB.A03(r3, r2, r0)
        L45:
            return
        L46:
            X.VjB r2 = r5.A02
            if (r2 != 0) goto L3e
            X.VjB r2 = r5.A00
            if (r2 == 0) goto L45
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3WT.A02():void");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.VjB, java.lang.Object] */
    public final void A04(int i) {
        ColorStateList A03;
        C52102aA c52102aA = this.A04;
        if (c52102aA != null && (A03 = c52102aA.A03(this.A03.getContext(), i)) != null) {
            C69182VjB c69182VjB = this.A00;
            C69182VjB c69182VjB2 = c69182VjB;
            if (c69182VjB == null) {
                ?? obj = new Object();
                this.A00 = obj;
                c69182VjB2 = obj;
            }
            c69182VjB2.A00 = A03;
            c69182VjB2.A02 = true;
        } else {
            this.A00 = null;
        }
        A02();
        A02();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.VjB, java.lang.Object] */
    public final void A05(ColorStateList colorStateList) {
        C69182VjB c69182VjB = this.A02;
        C69182VjB c69182VjB2 = c69182VjB;
        if (c69182VjB == null) {
            ?? obj = new Object();
            this.A02 = obj;
            c69182VjB2 = obj;
        }
        c69182VjB2.A00 = colorStateList;
        c69182VjB2.A02 = true;
        A02();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.VjB, java.lang.Object] */
    public final void A06(PorterDuff.Mode mode) {
        C69182VjB c69182VjB = this.A02;
        C69182VjB c69182VjB2 = c69182VjB;
        if (c69182VjB == null) {
            ?? obj = new Object();
            this.A02 = obj;
            c69182VjB2 = obj;
        }
        c69182VjB2.A01 = mode;
        c69182VjB2.A03 = true;
        A02();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.VjB, java.lang.Object] */
    public final void A07(AttributeSet attributeSet, int i) {
        View view = this.A03;
        Context context = view.getContext();
        int[] iArr = AbstractC53402cO.A0Q;
        C53122bu A00 = C53122bu.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A00.A02;
        AbstractC010103p.A06(context, typedArray, attributeSet, view, iArr, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                ColorStateList A03 = this.A04.A03(context, typedArray.getResourceId(0, -1));
                if (A03 != null) {
                    C69182VjB c69182VjB = this.A00;
                    C69182VjB c69182VjB2 = c69182VjB;
                    if (c69182VjB == null) {
                        ?? obj = new Object();
                        this.A00 = obj;
                        c69182VjB2 = obj;
                    }
                    c69182VjB2.A00 = A03;
                    c69182VjB2.A02 = true;
                    A02();
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(A00.A01(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC55852hR.A00(null, typedArray.getInt(2, -1)));
            }
        } finally {
            typedArray.recycle();
        }
    }

    public C3WT(View view) {
        this.A03 = view;
    }
}
