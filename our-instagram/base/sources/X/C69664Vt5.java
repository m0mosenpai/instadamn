package X;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vt5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69664Vt5 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final String A06;
    public final boolean A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final StaticLayout A0C;
    public final C6S5 A0D;
    public final List A0E;
    public final boolean A0F;
    public final C190868ci[] A0G;
    public final C202888y6[] A0H;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0048, code lost:
    
        if (r2 == X.C6S5.A07) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C69664Vt5(android.text.Layout.Alignment r16, android.text.Spannable r17, android.text.TextPaint r18, X.C57482kN r19, float r20, float r21, float r22, float r23, float r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69664Vt5.<init>(android.text.Layout$Alignment, android.text.Spannable, android.text.TextPaint, X.2kN, float, float, float, float, float, int, int, int):void");
    }

    public final void A00(Canvas canvas, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (this.A0F) {
                Iterator it = this.A0E.iterator();
                while (it.hasNext()) {
                    TextPaint paint = ((Layout) it.next()).getPaint();
                    if (paint != null) {
                        paint.setAlpha(intValue);
                    }
                }
                this.A0C.getPaint().setAlpha(intValue);
            } else {
                for (C190868ci c190868ci : this.A0G) {
                    c190868ci.A03 = Integer.valueOf(intValue);
                    c190868ci.A01 = 0.0f;
                    c190868ci.A00 = 0.0f;
                }
            }
        }
        canvas.save();
        canvas.translate(this.A00, this.A0A);
        Iterator it2 = this.A0E.iterator();
        while (it2.hasNext()) {
            ((Layout) it2.next()).draw(canvas);
        }
        this.A0C.draw(canvas);
        canvas.restore();
    }
}
