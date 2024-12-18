package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import ca.psiphon.PsiphonTunnel;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class V7D extends AbstractC202988yG {
    public static float A09 = 0.2f;
    public static float A0A;
    public int A00;
    public int A01;
    public int A02;
    public final ArrayList A03;
    public final ArrayList A04;
    public final ArrayList A05;
    public final ArrayList A06;
    public final Paint A07;
    public final EnumC194908jr A08;

    @Override // X.AbstractC202988yG
    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, C57482kN c57482kN, float f, float f2, int i) {
        int A0W;
        int min;
        float f3;
        int A0W2;
        boolean A1R = AbstractC167007dF.A1R(0, canvas, textPaint);
        AbstractC43594JPz.A1P(spannable, c57482kN);
        StaticLayout staticLayout = this.A0G;
        if (spannable.length() != 0) {
            ArrayList arrayList = this.A03;
            if (!arrayList.isEmpty() && staticLayout != null) {
                canvas.save();
                int i2 = this.A0A;
                canvas.translate((i2 - i2) / 2.0f, 0.0f);
                int A0W3 = i % A0W();
                int A0W4 = A0W();
                if (this.A00 <= 0) {
                    A0W = 0;
                } else {
                    A0W = (PsiphonTunnel.VPN_INTERFACE_MTU * A0W()) / this.A00;
                }
                int i3 = A0W4 - A0W;
                if (i3 <= 0) {
                    min = 0;
                } else {
                    min = (int) ((Math.min(A0W3, i3) / i3) * this.A01);
                }
                ArrayList arrayList2 = this.A06;
                if (!arrayList2.isEmpty()) {
                    BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                    characterInstance.setText(spannable.toString());
                    int next = characterInstance.next(min);
                    Iterator A13 = AbstractC166997dE.A13(arrayList2);
                    while (A13.hasNext()) {
                        C71063WnK c71063WnK = (C71063WnK) AbstractC166997dE.A0l(A13);
                        ArrayList A00 = C6S3.A00(AbstractC68595VWw.A00(staticLayout, this.A0b.getTextSize(), spannable.getSpanStart(c71063WnK), Math.min(spannable.getSpanEnd(c71063WnK), next)));
                        C14360o3.A0C(A00, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Path>");
                        c71063WnK.A02 = A00;
                        c71063WnK.onPreDraw();
                        c71063WnK.AQP(canvas);
                    }
                }
                Iterator A132 = AbstractC166997dE.A13(this.A05);
                while (A132.hasNext()) {
                    ((C202888y6) AbstractC166997dE.A0l(A132)).A04 = false;
                }
                Paint paint = this.A07;
                float f4 = this.A02;
                if (this.A00 > 0 && (A0W2 = (1000 * A0W()) / this.A00) > 0) {
                    int i4 = i % A0W2;
                    float f5 = A0W2 / 2.0f;
                    float f6 = i4;
                    if (f6 >= f5) {
                        f6 = A0W2 - i4;
                    }
                    f3 = f6 / f5;
                } else {
                    f3 = 0.0f;
                }
                paint.setAlpha((int) (f4 * f3));
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(staticLayout.getText().toString());
                int lineForOffset = staticLayout.getLineForOffset(characterInstance2.next(min));
                if (min <= arrayList.size()) {
                    WEG.A01(canvas, paint, (C69664Vt5) AbstractC31173DnH.A0i(arrayList, Math.max(min - (A1R ? 1 : 0), 0)), null, this.A04, A0A, A09, lineForOffset);
                }
                canvas.restore();
            }
        }
    }

    @Override // X.C6RB
    public final void A0R() {
        super.A0R();
        ArrayList arrayList = this.A03;
        arrayList.clear();
        ArrayList arrayList2 = this.A04;
        arrayList2.clear();
        ArrayList arrayList3 = this.A06;
        arrayList3.clear();
        ArrayList arrayList4 = this.A05;
        arrayList4.clear();
        TextPaint textPaint = this.A0b;
        A09 = textPaint.measureText(" ") * 0.2f;
        this.A00 = 0;
        StaticLayout staticLayout = this.A0G;
        Spannable spannable = this.A0F;
        if (spannable != null && spannable.length() != 0 && staticLayout != null) {
            int A00 = AbstractC13670mt.A00(this.A0F.toString());
            this.A01 = A00;
            this.A00 = ((int) (A00 * 75.0f)) + PsiphonTunnel.VPN_INTERFACE_MTU;
            Spannable spannable2 = this.A0F;
            C14360o3.A07(spannable2);
            C190868ci c190868ci = (C190868ci) C4GL.A00(spannable2, C190868ci.class);
            if (c190868ci != null) {
                Paint paint = this.A07;
                int i = c190868ci.A05;
                paint.setColor(i);
                this.A02 = Color.alpha(i);
            }
            Spannable spannable3 = this.A0F;
            C14360o3.A07(spannable3);
            AbstractC65703TsZ.A1I(spannable3, this, C71063WnK.class, arrayList3, arrayList4);
            int lineCount = staticLayout.getLineCount();
            for (int i2 = 0; i2 < lineCount; i2++) {
                Spannable spannable4 = this.A0F;
                C14360o3.A07(spannable4);
                int lineEnd = staticLayout.getLineEnd(i2);
                C57482kN A08 = A08();
                Layout.Alignment alignment = this.A0E;
                C14360o3.A07(alignment);
                arrayList2.add(new C69664Vt5(alignment, spannable4, textPaint, A08, 0.0f, 0.0f, staticLayout.getLineLeft(i2), staticLayout.getLineRight(i2), staticLayout.getLineBaseline(i2), 0, lineEnd, i2));
            }
            Spannable spannable5 = this.A0F;
            C14360o3.A07(spannable5);
            C57482kN A082 = A08();
            Layout.Alignment alignment2 = this.A0E;
            C14360o3.A07(alignment2);
            arrayList.addAll(WEG.A00(alignment2, staticLayout, spannable5, textPaint, A082));
        }
    }

    @Override // X.AbstractC202988yG
    public final float A0U() {
        return A09 + A0A;
    }

    @Override // X.AbstractC202988yG
    public final EnumC194908jr A0X() {
        return this.A08;
    }

    @Override // X.AbstractC202988yG
    public final void A0Y() {
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            Iterator A13 = AbstractC166997dE.A13(this.A06);
            while (A13.hasNext()) {
                C71063WnK c71063WnK = (C71063WnK) AbstractC166997dE.A0l(A13);
                ArrayList A00 = C6S3.A00(AbstractC68595VWw.A00(staticLayout, this.A0b.getTextSize(), this.A0F.getSpanStart(c71063WnK), this.A0F.getSpanEnd(c71063WnK)));
                C14360o3.A0C(A00, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Path>");
                c71063WnK.A02 = A00;
            }
        }
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return this.A00;
    }

    public V7D(Context context, int i) {
        super(context, i);
        Paint paint = new Paint();
        this.A07 = paint;
        this.A06 = new ArrayList();
        this.A05 = new ArrayList();
        this.A04 = new ArrayList();
        this.A03 = new ArrayList();
        this.A02 = Color.alpha(-1);
        this.A08 = EnumC194908jr.A0D;
        paint.setColor(0);
    }

    @Override // X.C6RB
    public final void A0A(float f) {
        super.A0A(f);
        A0A = f / 2.1818182f;
    }
}
