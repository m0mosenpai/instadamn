package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V73 extends C5RU {
    public C66646URk A00;
    public int A01;
    public C6S5 A02;
    public final int A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final Context A07;
    public final Paint A08;
    public final Paint A09;
    public final Rect A0A;
    public final TextPaint A0B;
    public final DisplayMetrics A0C;
    public final SparseArray A0D;
    public final SparseArray A0E;
    public final C69770Vv7 A0F;

    public V73(Context context, C66646URk c66646URk) {
        int A01;
        int intValue;
        this.A07 = context;
        DisplayMetrics A0K = AbstractC167007dF.A0K(context);
        C14360o3.A07(A0K);
        this.A0C = A0K;
        this.A03 = (int) (A0K.widthPixels * 0.8d);
        this.A0F = new C69770Vv7();
        this.A0E = new SparseArray();
        this.A0D = new SparseArray();
        this.A0A = new Rect();
        float A00 = AbstractC13880nE.A00(context, 27.0f);
        this.A02 = c66646URk.A03;
        this.A01 = c66646URk.A00;
        Integer num = c66646URk.A05;
        Integer num2 = c66646URk.A04;
        TextPaint textPaint = new TextPaint(1);
        if (num != null) {
            A01 = num.intValue();
        } else {
            A01 = WF8.A01(this.A02, this.A01);
        }
        textPaint.setColor(A01);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A14));
        textPaint.setTextSize(A00);
        this.A0B = textPaint;
        Paint paint = new Paint();
        if (num2 == null && (num2 = WF8.A03(this.A02, this.A01)) == null) {
            intValue = 16777215;
        } else {
            intValue = num2.intValue();
        }
        paint.setColor(intValue);
        this.A08 = paint;
        this.A05 = A00 / 2.1818182f;
        this.A04 = textPaint.measureText(" ") * 0.2f;
        Paint paint2 = new Paint();
        paint2.setColor(textPaint.getColor());
        this.A09 = paint2;
        this.A06 = Color.alpha(textPaint.getColor());
        this.A00 = c66646URk;
    }

    @Override // X.C5RU
    public final void A08(C66646URk c66646URk) {
        C14360o3.A0B(c66646URk, 0);
        if (!C14360o3.A0K(this.A00, c66646URk)) {
            this.A00 = c66646URk;
            A01();
        }
    }

    @Override // X.C5RU
    public final void A09(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A02 = c6s5;
        A00();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Layout layout;
        String obj;
        float f;
        int keyAt;
        C14360o3.A0B(canvas, 0);
        canvas.save();
        AbstractC167017dG.A12(canvas, this);
        C69770Vv7 c69770Vv7 = this.A0F;
        C69104Vhu A00 = c69770Vv7.A00();
        if (A00 != null) {
            int i = A00.A01;
            SparseArray sparseArray = (SparseArray) this.A0E.get(i);
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size && i > (keyAt = sparseArray.keyAt(i2)); i2++) {
                Layout layout2 = (Layout) sparseArray.get(keyAt);
                canvas.drawRect(new Rect(C6RE.A00(layout2), layout2.getLineTop(0), C6RE.A01(layout2), layout2.getLineBottom(layout2.getLineCount() - 1)), this.A08);
                layout2.draw(canvas);
                canvas.translate(0.0f, layout2.getHeight());
            }
            int max = (int) (Math.max(((US9) this.A00.A07.get(i)).A06.length() - 1, 0) * A00.A00);
            SparseArray sparseArray2 = this.A0D;
            C09530e4 c09530e4 = (C09530e4) sparseArray2.get(i);
            Number number = null;
            if (c09530e4 != null) {
                layout = (Layout) c09530e4.A00;
            } else {
                layout = null;
            }
            C09530e4 c09530e42 = (C09530e4) sparseArray2.get(i);
            if (c09530e42 != null) {
                number = (Number) c09530e42.A01;
            }
            if (layout != null) {
                CharSequence text = layout.getText();
                C14360o3.A07(text);
                C14360o3.A0A(number);
                int intValue = number.intValue();
                int lineForOffset = layout.getLineForOffset(intValue);
                for (int i3 = 0; i3 < lineForOffset; i3++) {
                    String obj2 = text.subSequence(layout.getLineStart(i3), layout.getLineEnd(i3)).toString();
                    Rect rect = this.A0A;
                    float lineBounds = layout.getLineBounds(i3, rect);
                    canvas.drawRect(rect, this.A08);
                    canvas.drawText(obj2, rect.left, lineBounds, this.A0B);
                }
                Rect rect2 = this.A0A;
                float lineBounds2 = layout.getLineBounds(lineForOffset, rect2);
                if (!A00.A02) {
                    obj = "";
                } else {
                    int lineStart = layout.getLineStart(lineForOffset);
                    int length = text.length();
                    int i4 = new int[]{intValue + max + 2, length}[0];
                    if (length < i4) {
                        i4 = length;
                    }
                    obj = text.subSequence(lineStart, i4).toString();
                }
                if (obj.length() > 0) {
                    Rect rect3 = new Rect(rect2);
                    int i5 = rect2.left;
                    TextPaint textPaint = this.A0B;
                    rect3.right = i5 + ((int) textPaint.measureText(obj));
                    canvas.drawRect(rect3, this.A08);
                    canvas.drawText(obj, rect2.left, lineBounds2, textPaint);
                }
                Paint paint = this.A09;
                float f2 = this.A06;
                float f3 = c69770Vv7.A00 % 1000;
                if (f3 < 500.0f) {
                    f = f3 / 500.0f;
                } else {
                    f = (1000.0f - f3) / 500.0f;
                }
                paint.setAlpha((int) (f2 * f));
                float measureText = rect2.left + this.A0B.measureText(obj) + this.A04;
                canvas.drawRect(measureText, rect2.top, measureText + this.A05, lineBounds2 + ((rect2.bottom - lineBounds2) / 2.0f), paint);
            }
        }
        canvas.restore();
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
        int i;
        TextPaint textPaint = this.A0B;
        textPaint.setColor(WF8.A01(this.A02, this.A01));
        Paint paint = this.A08;
        Integer A03 = WF8.A03(this.A02, this.A01);
        if (A03 != null) {
            i = A03.intValue();
        } else {
            i = 16777215;
        }
        paint.setColor(i);
        this.A09.setColor(textPaint.getColor());
        invalidateSelf();
    }

    private final void A01() {
        this.A0F.A02(this.A00.A07);
        SparseArray sparseArray = this.A0E;
        sparseArray.clear();
        SparseArray sparseArray2 = this.A0D;
        sparseArray2.clear();
        int size = this.A00.A07.size();
        int i = (int) ((this.A03 - this.A04) - this.A05);
        int intrinsicHeight = getIntrinsicHeight();
        HashMap hashMap = new HashMap();
        SparseArray sparseArray3 = new SparseArray();
        int i2 = intrinsicHeight;
        int i3 = 0;
        while (i3 < size) {
            StringBuilder sb = new StringBuilder(AnonymousClass001.A0C(((US9) this.A00.A07.get(i3)).A06, ' '));
            int i4 = i3 + 1;
            hashMap.clear();
            AbstractC166997dE.A1U(Integer.valueOf(i3), hashMap, 0);
            boolean z = false;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                String A0C = AnonymousClass001.A0C(((US9) this.A00.A07.get(i4)).A06, ' ');
                TextPaint textPaint = this.A0B;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) sb);
                if (textPaint.measureText(AbstractC166997dE.A0x(A0C, sb2)) < i) {
                    AbstractC166997dE.A1U(Integer.valueOf(i4), hashMap, sb.length() - 1);
                    sb.append(A0C);
                    i4++;
                    z = true;
                } else {
                    i4--;
                    break;
                }
            }
            if (z) {
                i3 = i4;
            }
            TextPaint textPaint2 = this.A0B;
            C14360o3.A0B(textPaint2, 1);
            StaticLayout A00 = AbstractC70057W0r.A00(AbstractC70057W0r.A00, textPaint2, sb, -1, i);
            int height = A00.getHeight();
            sparseArray3.put(i3, A00);
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                Map.Entry entry = (Map.Entry) A14.next();
                int intValue = ((Number) entry.getKey()).intValue();
                sparseArray2.put(intValue, AbstractC167007dF.A0o(A00, AbstractC43593JPy.A04(entry)));
                sparseArray.put(intValue, sparseArray3.clone());
            }
            if (height <= i2) {
                i2 -= height;
            } else {
                sparseArray3.clear();
                i2 = intrinsicHeight;
            }
            i3++;
        }
    }

    @Override // X.C5RU
    public final int A04() {
        return this.A01;
    }

    @Override // X.C5RU
    public final C66646URk A05() {
        return this.A00;
    }

    @Override // X.C5RU
    public final C6S5 A06() {
        return this.A02;
    }

    @Override // X.C5RU
    public final void A07(int i) {
        this.A01 = i;
        A00();
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
        TextPaint textPaint = this.A0B;
        return ((int) (textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top)) * 7;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0B.setAlpha(i);
        if (this.A02 != C6S5.A05) {
            this.A08.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0B.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
