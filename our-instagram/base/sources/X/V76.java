package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V76 extends C5RU {
    public C66646URk A00;
    public C6S5 A01;
    public int A02;
    public List A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final Paint A07;
    public final TextPaint A08;
    public final TextPaint A09;
    public final ArrayList A0A;
    public final ArrayList A0B;
    public final ArrayList A0C;
    public final ArrayList A0D;
    public final int A0E;
    public final int A0F;
    public final Typeface A0G;
    public final TextPaint A0H;
    public final TextPaint A0I;
    public final C69770Vv7 A0J;
    public final C70076W1t A0K;
    public final ArrayList A0L;

    public V76(Context context, C66646URk c66646URk, C70076W1t c70076W1t) {
        int i;
        int i2;
        int intValue;
        int A00;
        int A002;
        this.A06 = context;
        int A003 = (int) AbstractC13880nE.A00(context, 420.0f);
        this.A0F = A003;
        this.A0E = (int) AbstractC13880nE.A00(context, 55.0f);
        Typeface A02 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A0u);
        this.A0G = A02;
        this.A0J = new C69770Vv7();
        this.A0D = new ArrayList();
        this.A0A = new ArrayList();
        this.A0B = new ArrayList();
        this.A0C = new ArrayList();
        this.A0L = new ArrayList();
        float A004 = AbstractC13880nE.A00(context, 25.0f);
        this.A05 = AbstractC13880nE.A00(context, 12.0f);
        this.A04 = AbstractC13880nE.A00(context, 8.0f);
        this.A01 = c66646URk.A03;
        this.A02 = c66646URk.A00;
        Integer num = c66646URk.A05;
        Integer num2 = c66646URk.A04;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(WF8.A02(this.A01, num, this.A02));
        Paint.Align align = Paint.Align.LEFT;
        textPaint.setTextAlign(align);
        textPaint.setTypeface(A02);
        textPaint.setTextSize(A004);
        this.A09 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(WF8.A02(this.A01, num, this.A02));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(A02);
        textPaint2.setTextSize(A004);
        this.A0I = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.A02;
        }
        textPaint3.setColor(i);
        textPaint3.setTextAlign(align);
        textPaint3.setTypeface(A02);
        textPaint3.setTextSize(A004);
        textPaint3.setStyle(Paint.Style.FILL_AND_STROKE);
        float f = A004 * 0.11363637f;
        textPaint3.setStrokeWidth(f);
        Paint.Join join = Paint.Join.ROUND;
        textPaint3.setStrokeJoin(join);
        this.A08 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = this.A02;
        }
        textPaint4.setColor(i2);
        textPaint4.setTextAlign(align);
        textPaint4.setTypeface(A02);
        textPaint4.setTextSize(A004);
        textPaint4.setStyle(Paint.Style.STROKE);
        textPaint4.setStrokeWidth(f);
        textPaint4.setStrokeJoin(join);
        this.A0H = textPaint4;
        Paint paint = new Paint();
        if (num2 == null && (num2 = WF8.A04(this.A01, this.A02)) == null) {
            intValue = 16777215;
        } else {
            intValue = num2.intValue();
        }
        paint.setColor(intValue);
        this.A07 = paint;
        this.A03 = new ArrayList();
        if (c70076W1t != null) {
            A00 = c70076W1t.A00;
            A002 = c70076W1t.A01;
        } else {
            A00 = WF8.A00(A02, A004, A003, 1);
            A002 = WF8.A00(A02, A004, A003, 1);
        }
        this.A0K = new C70076W1t(A002, A00);
        this.A00 = c66646URk;
        A00();
    }

    @Override // X.C5RU
    public final void A08(C66646URk c66646URk) {
        C14360o3.A0B(c66646URk, 0);
        if (!C14360o3.A0K(this.A00, c66646URk)) {
            this.A00 = c66646URk;
            A00();
        }
    }

    @Override // X.C5RU
    public final void A09(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A01 = c6s5;
        A02();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C69104Vhu A00;
        int i;
        C14360o3.A0B(canvas, 0);
        ArrayList arrayList = this.A0D;
        if (arrayList != null && !arrayList.isEmpty() && (A00 = this.A0J.A00()) != null && (i = A00.A01) >= 0 && i < arrayList.size()) {
            int i2 = 128;
            this.A09.setAlpha(128);
            TextPaint textPaint = this.A08;
            C6S5 c6s5 = this.A01;
            C6S5 c6s52 = C6S5.A06;
            if (c6s5 != c6s52) {
                i2 = 255;
            }
            textPaint.setAlpha(i2);
            float A01 = AbstractC65702TsY.A01(canvas, this);
            Layout layout = (Layout) AbstractC31173DnH.A0i(arrayList, i);
            Layout layout2 = (Layout) AbstractC31173DnH.A0i(this.A0A, i);
            Layout layout3 = (Layout) AbstractC31173DnH.A0i(this.A0B, i);
            canvas.translate(0.0f, (-layout.getHeight()) / A01);
            int A002 = C6RE.A00(layout);
            int A012 = C6RE.A01(layout);
            float lineBottom = layout.getLineBottom(layout.getLineCount() - 1);
            float f = (A012 - A002) / A01;
            canvas.translate(-f, 0.0f);
            if (this.A01 != c6s52) {
                float f2 = this.A04;
                float f3 = A002 - f2;
                float lineTop = layout.getLineTop(0);
                float f4 = this.A05;
                RectF rectF = new RectF(f3, lineTop - f4, A012 + f2, lineBottom + f4);
                float A003 = AbstractC13880nE.A00(this.A06, 4.0f);
                canvas.drawRoundRect(rectF, A003, A003, this.A07);
            } else {
                ((Layout) AbstractC31173DnH.A0i(this.A0C, i)).draw(canvas);
            }
            if (this.A01 == c6s52) {
                layout3.draw(canvas);
            }
            layout2.draw(canvas);
            layout.draw(canvas);
            canvas.translate(f, 0.0f);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        A01();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    private final void A00() {
        this.A0J.A02(this.A00.A07);
        this.A03 = new C69590Vrt(this.A0K, this.A00.A07).A00();
        A01();
    }

    private final void A01() {
        int size;
        ArrayList arrayList = this.A0D;
        arrayList.clear();
        ArrayList arrayList2 = this.A0C;
        arrayList2.clear();
        ArrayList arrayList3 = this.A0A;
        arrayList3.clear();
        ArrayList arrayList4 = this.A0B;
        arrayList4.clear();
        ArrayList arrayList5 = this.A0L;
        arrayList5.clear();
        StringBuilder sb = new StringBuilder();
        int size2 = this.A03.size();
        int i = 0;
        while (i < size2) {
            sb.setLength(0);
            int A01 = AbstractC31176DnK.A01(this.A03, i);
            i++;
            Number number = (Number) AbstractC001800i.A0O(this.A03, i);
            if (number != null) {
                size = number.intValue();
            } else {
                size = this.A00.A07.size();
            }
            Iterator it = this.A00.A07.subList(A01, size).iterator();
            while (it.hasNext()) {
                sb.append(((US9) it.next()).A06);
                sb.append(" ");
                TextPaint textPaint = this.A0I;
                String A19 = AbstractC166987dD.A19(sb);
                int intrinsicWidth = getIntrinsicWidth();
                C14360o3.A0B(textPaint, 1);
                Layout.Alignment alignment = AbstractC70057W0r.A00;
                arrayList3.add(AbstractC70057W0r.A00(alignment, textPaint, A19, 1, intrinsicWidth));
                TextPaint textPaint2 = this.A0H;
                String A192 = AbstractC166987dD.A19(sb);
                int intrinsicWidth2 = getIntrinsicWidth();
                C14360o3.A0B(textPaint2, 1);
                arrayList4.add(AbstractC70057W0r.A00(alignment, textPaint2, A192, 1, intrinsicWidth2));
            }
            Integer valueOf = Integer.valueOf(((US9) this.A00.A07.get(A01)).A00());
            US9 us9 = (US9) this.A00.A07.get(size - 1);
            C09530e4 A0o = AbstractC167007dF.A0o(valueOf, ((int) (us9.A02 / us9.A01)) + us9.A03);
            TextPaint textPaint3 = this.A09;
            String A193 = AbstractC166987dD.A19(sb);
            int intrinsicWidth3 = getIntrinsicWidth();
            C14360o3.A0B(textPaint3, 1);
            Layout.Alignment alignment2 = AbstractC70057W0r.A00;
            StaticLayout A00 = AbstractC70057W0r.A00(alignment2, textPaint3, A193, 1, intrinsicWidth3);
            TextPaint textPaint4 = this.A08;
            String A194 = AbstractC166987dD.A19(sb);
            int intrinsicWidth4 = getIntrinsicWidth();
            C14360o3.A0B(textPaint4, 1);
            StaticLayout A002 = AbstractC70057W0r.A00(alignment2, textPaint4, A194, 1, intrinsicWidth4);
            while (A01 < size) {
                arrayList.add(A00);
                arrayList2.add(A002);
                arrayList5.add(A0o);
                A01++;
            }
        }
    }

    private final void A02() {
        int i;
        int A02 = WF8.A02(this.A01, null, this.A02);
        this.A09.setColor(A02);
        this.A0I.setColor(A02);
        this.A0H.setColor(this.A02);
        Paint paint = this.A07;
        Integer A04 = WF8.A04(this.A01, this.A02);
        if (A04 != null) {
            i = A04.intValue();
        } else {
            i = 16777215;
        }
        paint.setColor(i);
        invalidateSelf();
    }

    @Override // X.C5RU
    public final int A04() {
        return this.A02;
    }

    @Override // X.C5RU
    public final C66646URk A05() {
        return this.A00;
    }

    @Override // X.C5RU
    public final C6S5 A06() {
        return this.A01;
    }

    @Override // X.C5RU
    public final void A07(int i) {
        this.A02 = i;
        A02();
    }

    @Override // X.C5RR
    public final /* bridge */ /* synthetic */ C5NL C0T() {
        return this.A00;
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        this.A0J.A01(i);
        invalidateSelf();
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return this.A00.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f;
        if (this.A01 != C6S5.A06) {
            f = 2.0f * this.A04;
        } else {
            f = 0.0f;
        }
        return this.A0F + ((int) f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
