package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.8yA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202928yA {
    public static final TextPaint A00 = new TextPaint();

    public static final float A00(TextPaint textPaint, String str, int i, int i2, int i3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(textPaint, 4);
        int length = str.length() - 1;
        int i4 = 0;
        boolean z = false;
        while (i4 <= length) {
            int i5 = length;
            if (!z) {
                i5 = i4;
            }
            int A002 = C14360o3.A00(str.charAt(i5), 32);
            boolean z2 = false;
            if (A002 <= 0) {
                z2 = true;
            }
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i4++;
                }
            } else {
                if (!z2) {
                    break;
                }
                length--;
            }
        }
        if (str.subSequence(i4, length + 1).toString().length() == 0) {
            return i;
        }
        int i6 = (int) (i * 2.0f);
        int i7 = (int) (i2 * 2.0f);
        while (true) {
            int floor = ((int) Math.floor((i7 - i6) / 2.0f)) + i6;
            float f = floor / 2.0f;
            if (i6 >= floor) {
                return f;
            }
            textPaint.setTextSize(f);
            if (i3 > textPaint.measureText(str) && new StaticLayout(str, textPaint, i3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true).getLineCount() == 1) {
                i6 = floor;
            } else {
                i7 = floor;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.8yB, android.text.style.MetricAffectingSpan, java.lang.Object] */
    public static final void A01(Context context, Paint paint, Editable editable, C190888ck c190888ck) {
        float A002;
        C14360o3.A0B(editable, 1);
        C4GL.A05(editable, C202938yB.class);
        C190958cr c190958cr = c190888ck.A06;
        Integer num = c190958cr.A09;
        if (num != null && num.intValue() == 0) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(c190958cr.A08);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(c190958cr.A07);
            int A003 = c190958cr.A00(context);
            String obj = editable.toString();
            TextPaint textPaint = A00;
            textPaint.set(paint);
            for (MetricAffectingSpan metricAffectingSpan : (MetricAffectingSpan[]) C4GL.A06(editable, MetricAffectingSpan.class)) {
                metricAffectingSpan.updateMeasureState(textPaint);
            }
            textPaint.setLinearText(true);
            textPaint.setSubpixelText(true);
            textPaint.setTextSize(dimensionPixelSize);
            StaticLayout staticLayout = new StaticLayout(obj, textPaint, A003, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            int lineCount = staticLayout.getLineCount();
            for (int i = 0; i < lineCount; i++) {
                int lineStart = staticLayout.getLineStart(i);
                int lineEnd = staticLayout.getLineEnd(i);
                String substring = obj.substring(lineStart, lineEnd);
                C14360o3.A07(substring);
                String A0d = AbstractC002300n.A0d(substring, "\n", "", false);
                if (AbstractC13670mt.A0A(A0d)) {
                    A002 = A00(textPaint, A0d, dimensionPixelSize, AbstractC13600mm.A03(dimensionPixelSize2, dimensionPixelSize, 160), A003);
                } else {
                    A002 = A00(textPaint, A0d, dimensionPixelSize, dimensionPixelSize2, A003);
                }
                ?? metricAffectingSpan2 = new MetricAffectingSpan();
                metricAffectingSpan2.A00 = A002;
                editable.setSpan(metricAffectingSpan2, lineStart, lineEnd, 17);
            }
        }
    }
}
