package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import ca.psiphon.PsiphonTunnel;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V7A extends AbstractC202988yG {
    public int A00;
    public int A01;
    public final ArrayList A02;
    public final ArrayList A03;
    public final ArrayList A04;
    public final ArrayList A05;
    public final EnumC194908jr A06;

    @Override // X.AbstractC202988yG
    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, C57482kN c57482kN, float f, float f2, int i) {
        int A0W;
        int min;
        int A02;
        boolean A1R = AbstractC167007dF.A1R(0, canvas, textPaint);
        AbstractC43594JPz.A1P(spannable, c57482kN);
        StaticLayout staticLayout = this.A0G;
        if (spannable.length() != 0) {
            ArrayList arrayList = this.A02;
            if (!arrayList.isEmpty() && staticLayout != null) {
                canvas.save();
                int i2 = this.A0A;
                canvas.translate((i2 - i2) / 2.0f, 0.0f);
                int A0W2 = i % A0W();
                int A0W3 = A0W();
                if (this.A00 <= 0) {
                    A0W = 0;
                } else {
                    A0W = (PsiphonTunnel.VPN_INTERFACE_MTU * A0W()) / this.A00;
                }
                int i3 = A0W3 - A0W;
                if (i3 <= 0) {
                    min = 0;
                } else {
                    min = (int) ((Math.min(A0W2, i3) / i3) * this.A01);
                }
                int A0W4 = i % A0W();
                float A0W5 = A0W() - 200;
                float A0W6 = A0W() * 0.2f;
                if (A0W6 > 1000.0f) {
                    A0W6 = 1000.0f;
                }
                float max = Math.max(A0W5 - A0W6, 0.0f);
                float f3 = A0W4;
                float f4 = max - 250.0f;
                if (f3 < f4) {
                    A02 = 255;
                } else {
                    A02 = (int) AbstractC13600mm.A02(f3, f4, max, 255.0f, 0.0f);
                }
                ArrayList arrayList2 = this.A05;
                if (!arrayList2.isEmpty()) {
                    BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                    characterInstance.setText(spannable.toString());
                    int next = characterInstance.next(min);
                    Iterator A13 = AbstractC166997dE.A13(arrayList2);
                    while (A13.hasNext()) {
                        C71065WnN c71065WnN = (C71065WnN) AbstractC166997dE.A0l(A13);
                        List A1J = AbstractC166987dD.A1J(AbstractC70141W6t.A02(staticLayout, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, spannable.getSpanStart(c71065WnN), Math.min(spannable.getSpanEnd(c71065WnN), next)));
                        TextPaint textPaint2 = this.A0b;
                        c71065WnN.A01(AbstractC139126Rt.A03(A1J, textPaint2.getTextSize() * 0.3f, textPaint2.getTextSize() * 0.0f, textPaint2.getTextSize() * (-0.01f), textPaint2.getTextSize() / 4.0f, A1R), textPaint2.getTextSize());
                        c71065WnN.onPreDraw();
                        c71065WnN.A00(canvas, Integer.valueOf(A02));
                    }
                }
                Iterator A132 = AbstractC166997dE.A13(this.A04);
                while (A132.hasNext()) {
                    ((C202888y6) AbstractC166997dE.A0l(A132)).A04 = false;
                }
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(staticLayout.getText().toString());
                int lineForOffset = staticLayout.getLineForOffset(characterInstance2.next(min));
                if (min <= arrayList.size()) {
                    WEG.A01(canvas, null, (C69664Vt5) AbstractC31173DnH.A0i(arrayList, Math.max(min - (A1R ? 1 : 0), 0)), Integer.valueOf(A02), this.A03, 0.0f, 0.0f, lineForOffset);
                }
                canvas.restore();
            }
        }
    }

    @Override // X.C6RB
    public final void A0R() {
        super.A0R();
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            ArrayList arrayList = this.A02;
            arrayList.clear();
            ArrayList arrayList2 = this.A03;
            arrayList2.clear();
            ArrayList arrayList3 = this.A05;
            arrayList3.clear();
            ArrayList arrayList4 = this.A04;
            arrayList4.clear();
            this.A00 = 0;
            Spannable spannable = this.A0F;
            if (spannable != null && spannable.length() != 0) {
                int A00 = AbstractC13670mt.A00(this.A0F.toString());
                this.A01 = A00;
                this.A00 = ((int) (A00 * 75.0f)) + PsiphonTunnel.VPN_INTERFACE_MTU;
                Spannable spannable2 = this.A0F;
                C14360o3.A07(spannable2);
                AbstractC65703TsZ.A1I(spannable2, this, C71065WnN.class, arrayList3, arrayList4);
                int lineCount = staticLayout.getLineCount();
                for (int i = 0; i < lineCount; i++) {
                    Spannable spannable3 = this.A0F;
                    C14360o3.A07(spannable3);
                    int lineEnd = staticLayout.getLineEnd(i);
                    TextPaint textPaint = this.A0b;
                    C14360o3.A07(textPaint);
                    C57482kN A08 = A08();
                    Layout.Alignment alignment = this.A0E;
                    C14360o3.A07(alignment);
                    arrayList2.add(new C69664Vt5(alignment, spannable3, textPaint, A08, 0.0f, 0.0f, staticLayout.getLineLeft(i), staticLayout.getLineRight(i), staticLayout.getLineBaseline(i), 0, lineEnd, i));
                }
                Spannable spannable4 = this.A0F;
                C14360o3.A07(spannable4);
                TextPaint textPaint2 = this.A0b;
                C14360o3.A07(textPaint2);
                C57482kN A082 = A08();
                Layout.Alignment alignment2 = this.A0E;
                C14360o3.A07(alignment2);
                arrayList.addAll(WEG.A00(alignment2, staticLayout, spannable4, textPaint2, A082));
            }
        }
    }

    @Override // X.AbstractC202988yG
    public final EnumC194908jr A0X() {
        return this.A06;
    }

    @Override // X.AbstractC202988yG
    public final void A0Y() {
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            Iterator A13 = AbstractC166997dE.A13(this.A05);
            while (A13.hasNext()) {
                C71065WnN c71065WnN = (C71065WnN) AbstractC166997dE.A0l(A13);
                TextPaint textPaint = this.A0b;
                c71065WnN.A01(AbstractC139126Rt.A02(staticLayout, textPaint.getTextSize() * 0.3f, textPaint.getTextSize() * c71065WnN.A0B, textPaint.getTextSize() * c71065WnN.A08, c71065WnN.A00, 1.0f), textPaint.getTextSize());
            }
        }
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return this.A00;
    }

    public V7A(Context context, int i) {
        super(context, i);
        this.A05 = new ArrayList();
        this.A04 = new ArrayList();
        this.A03 = new ArrayList();
        this.A02 = new ArrayList();
        this.A06 = EnumC194908jr.A0E;
    }
}
