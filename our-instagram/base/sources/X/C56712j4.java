package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.2j4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56712j4 extends AbstractC56722j5 {
    public static final Comparator A01 = new Comparator() { // from class: X.2j6
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            int i = ((AbstractC56722j5) obj).A04.A0P;
            int i2 = ((AbstractC56722j5) obj2).A04.A0P;
            if (i == i2) {
                return 0;
            }
            if (i >= i2) {
                return 1;
            }
            return -1;
        }
    };
    public RectF A00;

    @Override // X.AbstractC56722j5
    public final void A08(float f) {
    }

    @Override // X.AbstractC56722j5
    public final void A0E(RectF rectF) {
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.2j5, X.2j4] */
    public static C56712j4 A00(AbstractC56652iy abstractC56652iy, C56682j1 c56682j1) {
        ?? abstractC56722j5 = new AbstractC56722j5(abstractC56652iy.A02, c56682j1);
        ArrayList arrayList = new ArrayList();
        abstractC56722j5.A07 = arrayList;
        A02(c56682j1, abstractC56722j5.A06, arrayList, null, abstractC56722j5.A08);
        Collections.sort(abstractC56722j5.A07, A01);
        AbstractC56602it abstractC56602it = abstractC56652iy.A03;
        abstractC56722j5.A00 = new RectF(0.0f, 0.0f, abstractC56602it.A01, abstractC56602it.A00);
        return abstractC56722j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C56682j1 r3, X.AbstractC56722j5 r4, java.util.List r5, java.util.List r6) {
        /*
            X.2iu r2 = r4.A04
            boolean r1 = r2.A0u
            r0 = 0
            if (r1 == 0) goto L9
            r5 = r0
            r6 = r0
        L9:
            byte r0 = r2.A02
            if (r0 == 0) goto L1a
            X.2j5 r0 = r4.A05
            if (r0 != 0) goto L1a
            int r1 = r2.A0O
            android.util.SparseArray r0 = r3.A02
            if (r0 != 0) goto L24
            r0 = 0
        L18:
            r4.A05 = r0
        L1a:
            if (r6 == 0) goto L2b
            boolean r0 = r4 instanceof X.C56712j4
            if (r0 == 0) goto L31
            r6.add(r4)
            return
        L24:
            java.lang.Object r0 = r0.get(r1)
            X.2j5 r0 = (X.AbstractC56722j5) r0
            goto L18
        L2b:
            if (r5 == 0) goto L38
            r5.add(r4)
            goto L38
        L31:
            boolean r0 = r2.A0t
            if (r0 == 0) goto L2b
            r6.add(r4)
        L38:
            boolean r0 = r4 instanceof X.C56772jA
            if (r0 == 0) goto L3e
            java.util.List r6 = r4.A07
        L3e:
            X.2j5 r1 = r4.A06
            X.2j5[] r0 = r4.A08
            A02(r3, r1, r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56712j4.A01(X.2j1, X.2j5, java.util.List, java.util.List):void");
    }

    public static void A02(C56682j1 c56682j1, AbstractC56722j5 abstractC56722j5, List list, List list2, AbstractC56722j5[] abstractC56722j5Arr) {
        if (abstractC56722j5 != null) {
            A01(c56682j1, abstractC56722j5, list, list2);
            return;
        }
        if (abstractC56722j5Arr == null) {
            return;
        }
        for (AbstractC56722j5 abstractC56722j52 : abstractC56722j5Arr) {
            A01(c56682j1, abstractC56722j52, list, list2);
        }
    }

    @Override // X.AbstractC56722j5
    public final void A0A(Canvas canvas) {
        RectF rectF = this.A00;
        if (rectF != null) {
            float f = rectF.left;
            float f2 = this.A0B.A00;
            canvas.clipRect(f * f2, rectF.top * f2, rectF.right * f2, rectF.bottom * f2);
        }
    }
}
