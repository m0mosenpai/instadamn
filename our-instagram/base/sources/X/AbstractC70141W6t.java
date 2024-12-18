package X;

import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.W6t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70141W6t {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r14 == r13) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.RectF A00(android.text.Layout r6, float r7, float r8, float r9, float r10, float r11, float r12, int r13, int r14, int r15, int r16, int r17, boolean r18, boolean r19) {
        /*
            r3 = r16
            r1 = r17
            if (r19 == 0) goto L4d
            if (r15 != r13) goto L48
            java.lang.CharSequence r0 = r6.getText()
            int r0 = r0.length()
            if (r1 <= r0) goto L13
            r1 = r0
        L13:
            float r2 = r6.getPrimaryHorizontal(r1)
        L17:
            if (r14 != r13) goto L67
        L19:
            float r5 = r6.getPrimaryHorizontal(r3)
        L1d:
            int r0 = r6.getLineTop(r13)
            float r4 = (float) r0
            int r0 = r6.getLineBaseline(r13)
            float r3 = (float) r0
            int r0 = r6.getLineBottom(r13)
            float r1 = (float) r0
            int r0 = r6.getLineCount()
            int r0 = r0 + (-1)
            if (r13 >= r0) goto L37
            float r1 = r1 - r4
            float r1 = r1 / r12
            float r1 = r1 + r4
        L37:
            float r2 = r2 - r7
            float r4 = r4 - r8
            float r5 = r5 + r9
            if (r18 != 0) goto L3e
            float r3 = r1 + r10
        L3e:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r2, r4, r5, r3)
            float r0 = -r11
            r1.offset(r0, r0)
            return r1
        L48:
            float r2 = r6.getLineLeft(r13)
            goto L17
        L4d:
            if (r14 != r13) goto L62
            float r2 = r6.getPrimaryHorizontal(r3)
        L53:
            if (r15 != r13) goto L67
            java.lang.CharSequence r0 = r6.getText()
            int r0 = r0.length()
            r3 = r1
            if (r1 <= r0) goto L19
            r3 = r0
            goto L19
        L62:
            float r2 = r6.getLineLeft(r13)
            goto L53
        L67:
            float r5 = r6.getLineRight(r13)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70141W6t.A00(android.text.Layout, float, float, float, float, float, float, int, int, int, int, int, boolean, boolean):android.graphics.RectF");
    }

    public static final ArrayList A01(Layout layout, float f, float f2, float f3, float f4, float f5, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = A02(layout, f2, f3, f4, f5, 1.0f, i, i2).iterator();
        while (it.hasNext()) {
            RectF rectF = (RectF) it.next();
            C139136Ru c139136Ru = new C139136Ru();
            c139136Ru.A02(rectF.left, rectF.top);
            float f6 = rectF.right;
            float tan = (float) Math.tan(Math.toRadians(0.0d));
            c139136Ru.A01(f6 + (f * tan), rectF.top);
            c139136Ru.A01(rectF.right, rectF.bottom);
            c139136Ru.A01(rectF.left + (f * (-1.0f) * tan), rectF.bottom);
            c139136Ru.A00();
            arrayList.add(c139136Ru);
        }
        return arrayList;
    }

    public static final ArrayList A02(Layout layout, float f, float f2, float f3, float f4, float f5, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int lineCount = layout.getLineCount();
        for (int i3 = 0; i3 < lineCount; i3++) {
            int lineForOffset = layout.getLineForOffset(i);
            int lineForOffset2 = layout.getLineForOffset(i2);
            if (lineForOffset <= i3 && i3 <= lineForOffset2 && !TextUtils.isEmpty(AbstractC002300n.A0d(AbstractC65702TsY.A0X(layout, i3), "\n", "", false))) {
                RectF A00 = A00(layout, f, f2, f3, f4, 0.0f, f5, i3, lineForOffset, lineForOffset2, i, i2, false, AbstractC13620mo.A03(layout.getText().toString()));
                if (A00.width() > f + f3) {
                    arrayList.add(A00);
                }
            }
        }
        return arrayList;
    }
}
