package X;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* renamed from: X.W3q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70100W3q {
    public final ArrayList A01(Layout layout, Integer num, float f, int i, int i2) {
        RectF rectF;
        float lineLeft;
        float lineRight;
        int lineForOffset = layout.getLineForOffset(i);
        int lineForOffset2 = layout.getLineForOffset(i2);
        ArrayList arrayList = new ArrayList();
        boolean A03 = AbstractC13620mo.A03(layout.getText().toString());
        C139136Ru c139136Ru = new C139136Ru();
        RectF rectF2 = new RectF();
        float f2 = f * 0.8f;
        float f3 = f * 0.15f;
        float f4 = f * 0.25f;
        if (lineForOffset <= lineForOffset2) {
            int i3 = lineForOffset;
            rectF = null;
            while (true) {
                if (A03) {
                    if (lineForOffset2 == i3) {
                        int length = layout.getText().length();
                        int i4 = i2;
                        if (i2 > length) {
                            i4 = length;
                        }
                        lineLeft = layout.getPrimaryHorizontal(i4);
                    } else {
                        lineLeft = layout.getLineLeft(i3);
                    }
                    if (lineForOffset == i3) {
                        lineRight = layout.getPrimaryHorizontal(i);
                    } else {
                        lineRight = layout.getLineRight(i3);
                    }
                } else {
                    if (lineForOffset == i3) {
                        lineLeft = layout.getPrimaryHorizontal(i);
                    } else {
                        lineLeft = layout.getLineLeft(i3);
                    }
                    if (lineForOffset2 == i3) {
                        int length2 = layout.getText().length();
                        int i5 = i2;
                        if (i2 > length2) {
                            i5 = length2;
                        }
                        lineRight = layout.getPrimaryHorizontal(i5);
                    } else {
                        lineRight = layout.getLineRight(i3);
                    }
                }
                RectF rectF3 = new RectF(lineLeft, layout.getLineTop(i3), lineRight, layout.getLineBottom(i3));
                int lineStart = layout.getLineStart(i3);
                int lineEnd = layout.getLineEnd(i3);
                CharSequence text = layout.getText();
                C14360o3.A07(text);
                String obj = text.subSequence(lineStart, lineEnd).toString();
                if (rectF3.width() > 0.0f && AbstractC002300n.A0d(obj, "\n", "", false).length() > 0) {
                    if (num != C05F.A0C || lineEnd <= i2) {
                        rectF = rectF3;
                    }
                    if (c139136Ru.A00.isEmpty()) {
                        rectF2 = rectF3;
                    }
                    rectF3.set(rectF3.left - f2, rectF3.top - f3, rectF3.right + f2, rectF3.bottom + f4);
                    c139136Ru.A03(rectF3, Path.Direction.CW);
                } else {
                    if (rectF != null) {
                        c139136Ru.A03(C71066WnO.A07.A00(rectF2, rectF, num, f, A03), Path.Direction.CW);
                    }
                    arrayList.add(c139136Ru);
                    c139136Ru = new C139136Ru();
                    rectF = null;
                }
                if (i3 == lineForOffset2) {
                    break;
                }
                i3++;
            }
        } else {
            rectF = null;
        }
        if (!c139136Ru.A00.isEmpty()) {
            if (rectF != null) {
                c139136Ru.A03(C71066WnO.A07.A00(rectF2, rectF, num, f, A03), Path.Direction.CW);
            }
            arrayList.add(c139136Ru);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        return new android.graphics.RectF(r6.left, r6.top, r9, r7.bottom);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r3 = r6.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return new android.graphics.RectF(r3, r6.top, r3 - (r9 * 2.0f), r7.bottom);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0010, code lost:
    
        if (r10 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r10 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.RectF A00(android.graphics.RectF r6, android.graphics.RectF r7, java.lang.Integer r8, float r9, boolean r10) {
        /*
            r5 = this;
            int r1 = r8.intValue()
            r0 = 0
            if (r1 == r0) goto L10
            r0 = 2
            if (r1 == r0) goto L1e
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            return r4
        L10:
            if (r10 != 0) goto L20
        L12:
            float r2 = r6.left
            float r1 = r6.top
            float r0 = r7.bottom
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r2, r1, r9, r0)
            return r4
        L1e:
            if (r10 != 0) goto L12
        L20:
            float r3 = r6.right
            float r2 = r6.top
            r0 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r0
            float r1 = r3 - r9
            float r0 = r7.bottom
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r3, r2, r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70100W3q.A00(android.graphics.RectF, android.graphics.RectF, java.lang.Integer, float, boolean):android.graphics.RectF");
    }
}
