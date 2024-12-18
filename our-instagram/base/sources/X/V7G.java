package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.OvershootInterpolator;
import com.instagram.common.session.UserSession;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V7G extends AbstractC202988yG {
    public float A00;
    public float A01;
    public final ArrayList A02;
    public final List A03;
    public final OvershootInterpolator A04;
    public final UserSession A05;
    public final EnumC194908jr A06;
    public final BreakIterator A07;
    public final ArrayList A08;
    public final ArrayList A09;
    public final ArrayList A0A;

    private final void A01(Canvas canvas, C69347Vlt c69347Vlt, float f, boolean z) {
        float f2;
        int i = z ? 1 : -1;
        if (A0O()) {
            i = -i;
        }
        Layout.Alignment alignment = this.A0E;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        if (alignment == alignment2) {
            canvas.translate((C6RE.A02(c69347Vlt.A01) / 2.0f) * i * f, 0.0f);
        }
        StaticLayout staticLayout = c69347Vlt.A02;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        StaticLayout staticLayout2 = c69347Vlt.A01;
        staticLayout2.draw(canvas);
        Layout.Alignment alignment3 = this.A0E;
        int A02 = C6RE.A02(staticLayout2);
        if (alignment3 == alignment2) {
            f2 = (A02 / 2.0f) * i;
        } else {
            f2 = A02 * i;
        }
        canvas.translate(f2 * f, 0.0f);
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return 3000;
    }

    private final void A02(Canvas canvas, C17v c17v, int i, boolean z) {
        float f;
        ArrayList arrayList = this.A02;
        if (!arrayList.isEmpty()) {
            List list = (List) AbstractC31173DnH.A0i(arrayList, i);
            if (!list.isEmpty()) {
                canvas.save();
                int i2 = c17v.A00;
                int i3 = c17v.A01;
                int i4 = c17v.A02;
                if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
                    while (true) {
                        C69347Vlt c69347Vlt = (C69347Vlt) list.get(i2);
                        if (i % 2 == 0) {
                            f = this.A00;
                        } else {
                            f = this.A01;
                        }
                        A01(canvas, c69347Vlt, f, z);
                        if (i2 == i3) {
                            break;
                        } else {
                            i2 += i4;
                        }
                    }
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
            ArrayList arrayList2 = this.A0A;
            arrayList2.clear();
            ArrayList arrayList3 = this.A08;
            arrayList3.clear();
            ArrayList arrayList4 = this.A09;
            arrayList4.clear();
            if (!TextUtils.isEmpty(this.A0F)) {
                Spannable spannable = this.A0F;
                C14360o3.A07(spannable);
                AnonymousClass016.A18(arrayList2, C4GL.A06(spannable, AbstractC202868y4.class));
                Spannable spannable2 = this.A0F;
                C14360o3.A07(spannable2);
                AbstractC65703TsZ.A1I(spannable2, this, C71065WnN.class, arrayList3, arrayList4);
                int lineCount = staticLayout.getLineCount();
                for (int i = 0; i < lineCount; i++) {
                    ArrayList arrayList5 = new ArrayList();
                    CharSequence subSequence = this.A0F.subSequence(staticLayout.getLineStart(i), staticLayout.getLineEnd(i));
                    BreakIterator breakIterator = this.A07;
                    breakIterator.setText(subSequence.toString());
                    int i2 = 0;
                    for (int next = breakIterator.next(); next != -1; next = breakIterator.next()) {
                        TextPaint textPaint = this.A0b;
                        float primaryHorizontal = new StaticLayout(subSequence, textPaint, A08().A00, this.A0E, A08().A02, A08().A01, false).getPrimaryHorizontal(subSequence.length() / 2);
                        C14360o3.A07(textPaint);
                        C57482kN A08 = A08();
                        arrayList5.add(new C69347Vlt(this.A0E, (Spannable) subSequence, textPaint, A08, primaryHorizontal, i2, next));
                        i2 = next;
                    }
                    arrayList.add(arrayList5);
                }
            }
            invalidateSelf();
        }
    }

    @Override // X.AbstractC202988yG
    public final float A0U() {
        return super.A0A * 0.25f;
    }

    @Override // X.AbstractC202988yG
    public final EnumC194908jr A0X() {
        return this.A06;
    }

    @Override // X.AbstractC202988yG
    public final void A0Y() {
        StaticLayout staticLayout = this.A0G;
        Spannable spannable = this.A0F;
        if (spannable != null && spannable.length() != 0 && staticLayout != null) {
            Iterator A13 = AbstractC166997dE.A13(this.A08);
            while (A13.hasNext()) {
                C71065WnN c71065WnN = (C71065WnN) AbstractC166997dE.A0l(A13);
                ArrayList A01 = AbstractC139126Rt.A01(staticLayout, 1.0f);
                TextPaint textPaint = this.A0b;
                c71065WnN.A01(AbstractC139126Rt.A03(A01, textPaint.getTextSize() * 0.3f, textPaint.getTextSize() * 0.0f, textPaint.getTextSize() * (-0.01f), textPaint.getTextSize() / 4.0f, true), textPaint.getTextSize());
            }
            Spannable spannable2 = this.A0F;
            C14360o3.A07(spannable2);
            C4GL.A05(spannable2, C9TA.class);
        }
    }

    public V7G(Context context, UserSession userSession, int i) {
        super(context, i);
        this.A05 = userSession;
        this.A03 = new ArrayList();
        this.A02 = new ArrayList();
        this.A0A = new ArrayList();
        this.A08 = new ArrayList();
        this.A09 = new ArrayList();
        this.A07 = BreakIterator.getCharacterInstance();
        this.A04 = new OvershootInterpolator(1.5f);
        this.A01 = 0.5f;
        this.A06 = EnumC194908jr.A0B;
    }

    public static final float A00(List list, float f, int i, int i2) {
        float f2 = 0.0f;
        while (list.subList(i, i2).iterator().hasNext()) {
            f2 += C6RE.A02(((C69347Vlt) r3.next()).A01) * (f - 1.0f);
        }
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c A[LOOP:1: B:41:0x0136->B:43:0x013c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184 A[LOOP:2: B:46:0x017e->B:48:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027a A[LOOP:4: B:83:0x0274->B:85:0x027a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0265  */
    @Override // X.AbstractC202988yG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Z(android.graphics.Canvas r25, android.text.Spannable r26, android.text.TextPaint r27, X.C57482kN r28, float r29, float r30, int r31) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V7G.A0Z(android.graphics.Canvas, android.text.Spannable, android.text.TextPaint, X.2kN, float, float, int):void");
    }
}
