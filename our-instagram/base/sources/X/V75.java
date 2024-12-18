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
public final class V75 extends C5RU {
    public C66646URk A00;
    public C6S5 A01;
    public int A02;
    public List A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final Paint A07;
    public final ArrayList A08;
    public final ArrayList A09;
    public final int A0A;
    public final int A0B;
    public final Typeface A0C;
    public final TextPaint A0D;
    public final TextPaint A0E;
    public final C69770Vv7 A0F;
    public final C70076W1t A0G;
    public final ArrayList A0H;

    public V75(Context context, C66646URk c66646URk, C70076W1t c70076W1t) {
        int i;
        int intValue;
        int A00;
        int A002;
        this.A06 = context;
        int A003 = (int) AbstractC13880nE.A00(context, 350.0f);
        this.A0B = A003;
        this.A0A = (int) AbstractC13880nE.A00(context, 55.0f);
        Typeface A02 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A0U);
        this.A0C = A02;
        this.A0F = new C69770Vv7();
        this.A09 = new ArrayList();
        this.A08 = new ArrayList();
        this.A0H = new ArrayList();
        float A004 = AbstractC13880nE.A00(context, 26.0f);
        this.A05 = AbstractC13880nE.A00(context, 8.0f);
        this.A04 = AbstractC13880nE.A00(context, 8.0f);
        this.A01 = c66646URk.A03;
        this.A02 = c66646URk.A00;
        Integer num = c66646URk.A05;
        Integer num2 = c66646URk.A04;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(WF8.A02(this.A01, num, this.A02));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint.setTypeface(A02);
        textPaint.setTextSize(A004);
        this.A0E = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.A02;
        }
        textPaint2.setColor(i);
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(A02);
        textPaint2.setTextSize(A004);
        textPaint2.setStyle(Paint.Style.STROKE);
        textPaint2.setStrokeWidth(textPaint.getTextSize() * 0.11363637f);
        textPaint2.setStrokeJoin(Paint.Join.ROUND);
        this.A0D = textPaint2;
        Paint paint = new Paint();
        if (num2 == null && (num2 = WF8.A04(this.A01, this.A02)) == null) {
            intValue = 16777215;
        } else {
            intValue = num2.intValue();
        }
        paint.setColor(intValue);
        paint.setAlpha(196);
        this.A07 = paint;
        if (c70076W1t != null) {
            A00 = c70076W1t.A00;
            A002 = c70076W1t.A01;
        } else {
            A00 = WF8.A00(A02, A004, A003, 1);
            A002 = WF8.A00(A02, A004, A003, 1);
        }
        this.A0G = new C70076W1t(A002, A00);
        this.A03 = new ArrayList();
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
        ArrayList arrayList = this.A09;
        if (arrayList != null && !arrayList.isEmpty() && (A00 = this.A0F.A00()) != null && (i = A00.A01) >= 0 && i < arrayList.size()) {
            float A01 = AbstractC65702TsY.A01(canvas, this);
            Layout layout = (Layout) AbstractC31173DnH.A0i(arrayList, i);
            canvas.translate(0.0f, (-layout.getHeight()) / A01);
            if (this.A01 != C6S5.A06) {
                int A002 = C6RE.A00(layout);
                int A012 = C6RE.A01(layout);
                int lineBottom = layout.getLineBottom(layout.getLineCount() - 1);
                int lineTop = layout.getLineTop(0);
                float f = (A012 - A002) / A01;
                float f2 = this.A04;
                float f3 = A002 - f2;
                float f4 = this.A05;
                RectF rectF = new RectF(f3, lineTop - f4, A012 + f2, lineBottom + f4);
                canvas.translate(-f, -0.0f);
                float A003 = AbstractC13880nE.A00(this.A06, 4.0f);
                canvas.drawRoundRect(rectF, A003, A003, this.A07);
                canvas.translate(f, 0.0f);
            } else {
                ((Layout) AbstractC31173DnH.A0i(this.A08, i)).draw(canvas);
            }
            layout.draw(canvas);
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

    private final void A00() {
        this.A0F.A02(this.A00.A07);
        this.A03 = new C69590Vrt(this.A0G, this.A00.A07).A00();
        A01();
    }

    private final void A01() {
        int size;
        ArrayList arrayList = this.A09;
        arrayList.clear();
        ArrayList arrayList2 = this.A08;
        arrayList2.clear();
        ArrayList arrayList3 = this.A0H;
        arrayList3.clear();
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
            }
            Integer valueOf = Integer.valueOf(((US9) this.A00.A07.get(A01)).A00());
            US9 us9 = (US9) this.A00.A07.get(size - 1);
            C09530e4 A0o = AbstractC167007dF.A0o(valueOf, ((int) (us9.A02 / us9.A01)) + us9.A03);
            TextPaint textPaint = this.A0E;
            String A19 = AbstractC166987dD.A19(sb);
            int intrinsicWidth = getIntrinsicWidth();
            C14360o3.A0B(textPaint, 1);
            Layout.Alignment alignment = AbstractC70057W0r.A00;
            StaticLayout A00 = AbstractC70057W0r.A00(alignment, textPaint, A19, -1, intrinsicWidth);
            TextPaint textPaint2 = this.A0D;
            String A192 = AbstractC166987dD.A19(sb);
            int intrinsicWidth2 = getIntrinsicWidth();
            C14360o3.A0B(textPaint2, 1);
            StaticLayout A002 = AbstractC70057W0r.A00(alignment, textPaint2, A192, -1, intrinsicWidth2);
            while (A01 < size) {
                arrayList.add(A00);
                arrayList2.add(A002);
                arrayList3.add(A0o);
                A01++;
            }
        }
    }

    private final void A02() {
        int i;
        this.A0E.setColor(WF8.A02(this.A01, null, this.A02));
        this.A0D.setColor(this.A02);
        Paint paint = this.A07;
        Integer A04 = WF8.A04(this.A01, this.A02);
        if (A04 != null) {
            i = A04.intValue();
        } else {
            i = 16777215;
        }
        paint.setColor(i);
        paint.setAlpha(196);
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
        this.A0F.A01(i);
        invalidateSelf();
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return this.A00.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f;
        if (this.A01 != C6S5.A06) {
            f = 2.0f * this.A04;
        } else {
            f = 0.0f;
        }
        return this.A0B + ((int) f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0E.setAlpha(i);
        this.A0D.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0E.setColorFilter(colorFilter);
        this.A0D.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
