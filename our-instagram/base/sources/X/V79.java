package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class V79 extends AbstractC202988yG {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public final Paint A04;
    public final ArrayList A05;
    public final EnumC194908jr A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final ArrayList A09;
    public final ArrayList A0A;

    @Override // X.AbstractC202988yG
    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, C57482kN c57482kN, float f, float f2, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, canvas, textPaint);
        AbstractC43594JPz.A1P(spannable, c57482kN);
        StaticLayout staticLayout = this.A0G;
        if (spannable.length() != 0) {
            ArrayList arrayList = this.A07;
            if (!arrayList.isEmpty() && staticLayout != null) {
                Iterator A13 = AbstractC166997dE.A13(this.A0A);
                while (A13.hasNext()) {
                    C71064WnL c71064WnL = (C71064WnL) AbstractC166997dE.A0l(A13);
                    c71064WnL.onPreDraw();
                    c71064WnL.AQP(canvas);
                }
                Iterator A132 = AbstractC166997dE.A13(this.A09);
                while (A132.hasNext()) {
                    ((C202888y6) AbstractC166997dE.A0l(A132)).A04 = false;
                }
                Paint paint = this.A04;
                float f3 = this.A01;
                int i3 = i % 1000;
                float f4 = 1000.0f / 2.0f;
                float f5 = i3;
                if (f5 >= f4) {
                    f5 = 1000 - i3;
                }
                paint.setAlpha((int) (f3 * (f5 / f4)));
                ArrayList arrayList2 = this.A05;
                Iterator A133 = AbstractC166997dE.A13(arrayList2);
                while (true) {
                    if (A133.hasNext()) {
                        int intValue = ((Number) AbstractC166997dE.A0l(A133)).intValue();
                        if (i <= intValue) {
                            i2 = arrayList2.indexOf(Integer.valueOf(intValue));
                            break;
                        }
                    } else {
                        i2 = this.A02;
                        break;
                    }
                }
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(staticLayout.getText().toString());
                WEG.A01(canvas, paint, (C69664Vt5) AbstractC31173DnH.A0i(arrayList, Math.max(i2 - (A1R ? 1 : 0), 0)), null, this.A08, this.A00, 0.0f, staticLayout.getLineForOffset(characterInstance.next(i2)));
            }
        }
    }

    @Override // X.C6RB
    public final void A0R() {
        super.A0R();
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            ArrayList arrayList = this.A08;
            arrayList.clear();
            ArrayList arrayList2 = this.A07;
            arrayList2.clear();
            ArrayList arrayList3 = this.A05;
            arrayList3.clear();
            ArrayList arrayList4 = this.A0A;
            arrayList4.clear();
            ArrayList arrayList5 = this.A09;
            arrayList5.clear();
            if (!TextUtils.isEmpty(this.A0F)) {
                int A00 = AbstractC13670mt.A00(this.A0F.toString());
                this.A02 = A00;
                this.A03 = (int) (A00 * 400.0f);
                int A0W = A0W();
                if (A0W > 0) {
                    this.A03 = A0W;
                }
                Spannable spannable = this.A0F;
                C14360o3.A07(spannable);
                C190868ci c190868ci = (C190868ci) C4GL.A00(spannable, C190868ci.class);
                if (c190868ci != null) {
                    int i = c190868ci.A05;
                    Integer valueOf = Integer.valueOf(i);
                    int alpha = Color.alpha(i);
                    Integer valueOf2 = Integer.valueOf(alpha);
                    if (valueOf != null) {
                        this.A04.setColor(i);
                    }
                    if (valueOf2 != null) {
                        this.A01 = alpha;
                    }
                }
                int i2 = this.A02;
                for (int i3 = 0; i3 < i2; i3++) {
                    AbstractC166997dE.A1W(arrayList3, AbstractC50712Us.A01.A05(this.A03 / 2));
                }
                C01T.A1C(arrayList3);
                Spannable spannable2 = this.A0F;
                C14360o3.A07(spannable2);
                AbstractC65703TsZ.A1I(spannable2, this, C71064WnL.class, arrayList4, arrayList5);
                int lineCount = staticLayout.getLineCount();
                for (int i4 = 0; i4 < lineCount; i4++) {
                    Spannable spannable3 = this.A0F;
                    C14360o3.A07(spannable3);
                    int lineEnd = staticLayout.getLineEnd(i4);
                    TextPaint textPaint = this.A0b;
                    C14360o3.A07(textPaint);
                    C57482kN A08 = A08();
                    Layout.Alignment alignment = this.A0E;
                    C14360o3.A07(alignment);
                    arrayList.add(new C69664Vt5(alignment, spannable3, textPaint, A08, 0.0f, 0.0f, staticLayout.getLineLeft(i4), staticLayout.getLineRight(i4), staticLayout.getLineBaseline(i4), 0, lineEnd, i4));
                }
                Spannable spannable4 = this.A0F;
                C14360o3.A07(spannable4);
                TextPaint textPaint2 = this.A0b;
                C14360o3.A07(textPaint2);
                C57482kN A082 = A08();
                Layout.Alignment alignment2 = this.A0E;
                C14360o3.A07(alignment2);
                arrayList2.addAll(WEG.A00(alignment2, staticLayout, spannable4, textPaint2, A082));
            }
        }
    }

    @Override // X.AbstractC202988yG
    public final EnumC194908jr A0X() {
        return this.A06;
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return this.A03;
    }

    public V79(Context context, int i) {
        super(context, i);
        this.A04 = new Paint();
        this.A0A = new ArrayList();
        this.A09 = new ArrayList();
        this.A05 = new ArrayList();
        this.A08 = new ArrayList();
        this.A07 = new ArrayList();
        this.A01 = Color.alpha(-1);
        this.A06 = EnumC194908jr.A08;
        int alpha = Color.alpha(-1);
        Integer valueOf = Integer.valueOf(alpha);
        this.A04.setColor(0);
        if (valueOf != null) {
            this.A01 = alpha;
        }
        this.A00 = 2.0f;
    }
}
