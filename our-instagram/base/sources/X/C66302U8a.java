package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.U8a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66302U8a extends Drawable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final LinkedHashMap A07;
    public final int A08;
    public final Paint A09;
    public final String A0A;

    public final void A02(String str, String str2, int i) {
        C14360o3.A0B(str2, 1);
        this.A07.put(str, MSY.A0D(str2, i));
        this.A00 = Math.max(str2.length(), this.A00);
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        A00(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Paint paint = this.A09;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-26624);
        canvas.drawRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, paint);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(0);
        canvas.drawRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, paint);
        paint.setStyle(style);
        paint.setStrokeWidth(0.0f);
        paint.setColor(-1);
        this.A01 = this.A04;
        this.A02 = this.A05;
        if (this.A06) {
            A01(canvas, "Vito", this.A0A, this.A08);
        }
        Iterator A14 = AbstractC166997dE.A14(this.A07);
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            String str = (String) entry.getKey();
            Pair pair = (Pair) entry.getValue();
            Object obj = pair.first;
            C14360o3.A06(obj);
            Object obj2 = pair.second;
            C14360o3.A06(obj2);
            A01(canvas, str, (String) obj, ((Number) obj2).intValue());
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
        A00(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final void A00(Rect rect) {
        LinkedHashMap linkedHashMap = this.A07;
        if (!linkedHashMap.isEmpty() && this.A00 > 0) {
            int min = Math.min(72, Math.max(16, Math.min(rect.width() / this.A00, rect.height() / linkedHashMap.size())));
            this.A09.setTextSize(min);
            this.A03 = min + 8;
            this.A04 = rect.left + 10;
            this.A05 = rect.top + 10 + min;
        }
    }

    public C66302U8a(String str) {
        this.A0A = str;
        this.A08 = -16711936;
        this.A06 = true;
        this.A07 = new LinkedHashMap();
        this.A09 = new Paint(1);
        this.A00 = 4;
        this.A07.clear();
        this.A00 = 4;
        invalidateSelf();
    }

    public final void A01(Canvas canvas, String str, String str2, int i) {
        AbstractC167017dG.A1P(str, str2);
        String A0R = AnonymousClass001.A0R(str, ": ");
        Paint paint = this.A09;
        float measureText = paint.measureText(A0R);
        float measureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i2 = this.A01;
        int i3 = this.A02;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + measureText + measureText2 + 4.0f, (i3 - this.A03) + 8, paint);
        paint.setColor(-1);
        canvas.drawText(A0R, this.A01, this.A02, paint);
        paint.setColor(i);
        canvas.drawText(str2, this.A01 + measureText, this.A02, paint);
        this.A02 += this.A03;
    }

    public C66302U8a() {
        this("");
    }
}
