package X;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
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
public final class V77 extends C5RU {
    public C66646URk A00;
    public int A01;
    public int A02;
    public C6S5 A03;
    public List A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final Camera A0A;
    public final Paint A0B;
    public final Typeface A0C;
    public final TextPaint A0D;
    public final C69770Vv7 A0E;
    public final C70076W1t A0F;
    public final ArrayList A0G;
    public final ArrayList A0H;

    public V77(Context context, C66646URk c66646URk, C70076W1t c70076W1t) {
        int A01;
        int intValue;
        int A00;
        int A002;
        this.A09 = context;
        int A003 = (int) AbstractC13880nE.A00(context, 300.0f);
        this.A08 = A003;
        this.A0E = new C69770Vv7();
        this.A0G = new ArrayList();
        this.A0H = new ArrayList();
        float A004 = AbstractC13880nE.A00(context, 29.0f);
        this.A06 = AbstractC13880nE.A00(context, 4.0f);
        this.A05 = AbstractC13880nE.A00(context, 8.0f);
        Typeface A02 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A10);
        this.A0C = A02;
        this.A03 = c66646URk.A03;
        this.A02 = c66646URk.A00;
        Integer num = c66646URk.A05;
        Integer num2 = c66646URk.A04;
        TextPaint textPaint = new TextPaint(1);
        if (num != null) {
            A01 = num.intValue();
        } else {
            A01 = WF8.A01(this.A03, this.A02);
        }
        textPaint.setColor(A01);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(A02);
        textPaint.setTextSize(A004);
        this.A0D = textPaint;
        Paint paint = new Paint();
        if (num2 == null && (num2 = WF8.A03(this.A03, this.A02)) == null) {
            intValue = 16777215;
        } else {
            intValue = num2.intValue();
        }
        paint.setColor(intValue);
        this.A0B = paint;
        if (c70076W1t != null) {
            A00 = c70076W1t.A00;
            A002 = c70076W1t.A01;
        } else {
            A00 = WF8.A00(A02, A004, A003, 3);
            A002 = WF8.A00(A02, A004, A003, 3);
        }
        this.A0F = new C70076W1t(A002, A00);
        Camera camera = new Camera();
        camera.setLocation(0.0f, 0.0f, 50.0f);
        this.A0A = camera;
        this.A07 = VW9.A00(textPaint) * 3;
        this.A01 = Color.alpha(textPaint.getColor());
        this.A04 = new ArrayList();
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
        this.A03 = c6s5;
        A02();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C69770Vv7 c69770Vv7;
        C69104Vhu A00;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        C14360o3.A0B(canvas, 0);
        ArrayList arrayList = this.A0G;
        if (arrayList != null && !arrayList.isEmpty() && (A00 = (c69770Vv7 = this.A0E).A00()) != null) {
            int i = A00.A01;
            C09530e4 c09530e4 = (C09530e4) AbstractC31173DnH.A0i(this.A0H, i);
            float A02 = AbstractC13600mm.A02(c69770Vv7.A00, ((Number) c09530e4.A00).intValue(), ((Number) c09530e4.A01).intValue(), 0.0f, 1.0f);
            TextPaint textPaint = this.A0D;
            if (A02 <= 0.75f) {
                textPaint.setAlpha(this.A01);
                f2 = 11.0f;
                f = 0.75f - 0.0f;
                f3 = (-11.0f) - 11.0f;
                f4 = 0.0f;
                if (f != 0.0f) {
                    f5 = A02 - 0.0f;
                    f4 = f5 / f;
                }
                A03(canvas, (f4 * f3) + f2, i);
            }
            float f6 = this.A01;
            f = 1.0f - 0.75f;
            float f7 = 0.0f - f6;
            float f8 = 0.0f;
            if (f != 0.0f) {
                f8 = (A02 - 0.75f) / f;
            }
            textPaint.setAlpha((int) ((f8 * f7) + f6));
            float f9 = (-79.0f) - (-11.0f);
            float f10 = 0.0f;
            if (f != 0.0f) {
                f10 = (A02 - 0.75f) / f;
            }
            A03(canvas, (f10 * f9) - 11.0f, i);
            Object A0i = AbstractC31173DnH.A0i(arrayList, i);
            do {
                i++;
                if (i >= arrayList.size()) {
                    break;
                }
            } while (C14360o3.A0K(arrayList.get(i), A0i));
            float f11 = this.A01 - 0.0f;
            float f12 = 0.0f;
            if (f != 0.0f) {
                f12 = (A02 - 0.75f) / f;
            }
            textPaint.setAlpha((int) ((f12 * f11) + 0.0f));
            f2 = 79.0f;
            f3 = 11.0f - 79.0f;
            f4 = 0.0f;
            if (f != 0.0f) {
                f5 = A02 - 0.75f;
                f4 = f5 / f;
            }
            A03(canvas, (f4 * f3) + f2, i);
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
        this.A0E.A02(this.A00.A07);
        this.A04 = new C69590Vrt(this.A0F, this.A00.A07).A00();
        A01();
    }

    private final void A01() {
        int size;
        ArrayList arrayList = this.A0G;
        arrayList.clear();
        ArrayList arrayList2 = this.A0H;
        arrayList2.clear();
        StringBuilder sb = new StringBuilder();
        int size2 = this.A04.size();
        int i = 0;
        while (i < size2) {
            sb.setLength(0);
            int A01 = AbstractC31176DnK.A01(this.A04, i);
            i++;
            Number number = (Number) AbstractC001800i.A0O(this.A04, i);
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
            TextPaint textPaint = this.A0D;
            String A19 = AbstractC166987dD.A19(sb);
            int intrinsicWidth = getIntrinsicWidth();
            C14360o3.A0B(textPaint, 1);
            StaticLayout A00 = AbstractC70057W0r.A00(AbstractC70057W0r.A00, textPaint, A19, 3, intrinsicWidth);
            while (A01 < size) {
                arrayList.add(A00);
                arrayList2.add(A0o);
                A01++;
            }
        }
    }

    private final void A02() {
        int i;
        TextPaint textPaint = this.A0D;
        textPaint.setColor(WF8.A01(this.A03, this.A02));
        Paint paint = this.A0B;
        Integer A03 = WF8.A03(this.A03, this.A02);
        if (A03 != null) {
            i = A03.intValue();
        } else {
            i = 16777215;
        }
        paint.setColor(i);
        this.A01 = Color.alpha(textPaint.getColor());
        invalidateSelf();
    }

    private final void A03(Canvas canvas, float f, int i) {
        if (i >= 0) {
            ArrayList arrayList = this.A0G;
            if (i < arrayList.size()) {
                float A01 = AbstractC65702TsY.A01(canvas, this);
                Camera camera = this.A0A;
                camera.save();
                int i2 = this.A07;
                camera.translate(0.0f, 0.0f, (-i2) / A01);
                camera.rotateX(f);
                camera.translate(0.0f, 0.0f, i2 / A01);
                camera.applyToCanvas(canvas);
                camera.restore();
                Layout layout = (Layout) AbstractC31173DnH.A0i(arrayList, i);
                canvas.translate(0.0f, (-layout.getHeight()) / A01);
                if (this.A03 != C6S5.A05) {
                    Paint paint = this.A0B;
                    paint.setAlpha(this.A0D.getAlpha());
                    int A00 = C6RE.A00(layout);
                    int A012 = C6RE.A01(layout);
                    float f2 = (A012 - A00) / A01;
                    float f3 = this.A05;
                    float f4 = A00 - f3;
                    float lineTop = layout.getLineTop(0);
                    float f5 = this.A06;
                    RectF rectF = new RectF(f4, lineTop - f5, A012 + f3, layout.getLineBottom(layout.getLineCount() - 1) + f5);
                    canvas.translate(-f2, 0.0f);
                    canvas.drawRect(rectF, paint);
                    canvas.translate(f2, 0.0f);
                }
                layout.draw(canvas);
                canvas.restore();
            }
        }
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
        return this.A03;
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
        this.A0E.A01(i);
        invalidateSelf();
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return this.A00.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        if (this.A03 != C6S5.A05) {
            i = (int) (this.A06 * 2.0f);
        } else {
            i = 0;
        }
        return ((int) (this.A07 * 1.35f)) + (i * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i;
        int i2 = 0;
        if (this.A03 != C6S5.A05) {
            i = (int) (this.A05 * 2.0f);
        } else {
            i = 0;
        }
        ArrayList arrayList = this.A0G;
        if (arrayList.isEmpty()) {
            i2 = this.A08;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i2 = Math.max(i2, C6RE.A02((Layout) it.next()));
            }
        }
        return i2 + i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
