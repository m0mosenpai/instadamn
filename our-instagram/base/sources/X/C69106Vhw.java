package X;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vhw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69106Vhw {
    public C69664Vt5 A00;
    public List A01;
    public final int A02;

    public C69106Vhw(Layout.Alignment alignment, Spannable spannable, StaticLayout staticLayout, TextPaint textPaint, C57482kN c57482kN, int i, int i2, boolean z) {
        int lineEnd;
        float lineLeft;
        float lineRight;
        this.A02 = i2;
        this.A01 = new ArrayList();
        if (i > 0) {
            int i3 = i - 1;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int lineForOffset = staticLayout.getLineForOffset(i3);
            int lineCount = staticLayout.getLineCount();
            int i4 = lineForOffset + 1;
            lineCount = lineCount > i4 ? i4 : lineCount;
            for (int i5 = 0; i5 < lineCount; i5++) {
                int lineStart = staticLayout.getLineStart(i5);
                if (i5 == lineForOffset) {
                    lineEnd = i3 + 1;
                } else {
                    lineEnd = staticLayout.getLineEnd(i5);
                }
                String A0d = AbstractC002300n.A0d(staticLayout.getText().subSequence(lineStart, lineEnd).toString(), "\n", "", false);
                float lineTop = staticLayout.getLineTop(i5);
                float lineBottom = staticLayout.getLineBottom(i5);
                if (i5 == lineForOffset && z) {
                    lineRight = staticLayout.getLineRight(i5);
                    lineLeft = lineRight - textPaint.measureText(A0d);
                } else if (i5 == lineForOffset && !z) {
                    lineLeft = staticLayout.getLineLeft(i5);
                    lineRight = textPaint.measureText(A0d) + lineLeft;
                } else {
                    lineLeft = staticLayout.getLineLeft(i5);
                    lineRight = staticLayout.getLineRight(i5);
                }
                RectF rectF = new RectF(lineLeft, lineTop, lineRight, lineBottom);
                if (rectF.width() > 0.0f && A0d.length() > 0) {
                    arrayList2.add(rectF);
                } else if (!arrayList2.isEmpty()) {
                    arrayList.add(arrayList2);
                    arrayList2 = new ArrayList();
                }
            }
            AbstractC25228BEl.A1Q(arrayList2, arrayList, arrayList2.isEmpty() ? 1 : 0);
            this.A01 = arrayList;
            this.A00 = new C69664Vt5(alignment, spannable, textPaint, c57482kN, staticLayout.getLineBottom(i2), staticLayout.getLineTop(i2), staticLayout.getLineLeft(i2), staticLayout.getLineRight(i2), staticLayout.getLineBaseline(i2), staticLayout.getLineStart(i2), i, 0);
        }
    }
}
