package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.3ez, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78333ez extends Drawable {
    public static boolean A05;
    public static final C78343f0 A06 = new Object();
    public static final InterfaceC09390do A07 = AbstractC09440dt.A01(C78353f1.A00);
    public static final InterfaceC09390do A08 = AbstractC09440dt.A01(C78363f2.A00);
    public final int A00;
    public final Paint A01;
    public final Paint A02;
    public final String A03;
    public final List A04;

    public C78333ez(List list) {
        int i;
        C14360o3.A0B(list, 1);
        this.A04 = list;
        Paint paint = new Paint();
        this.A02 = paint;
        this.A01 = new Paint();
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20.0f);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setAntiAlias(true);
        int size = list.size();
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(list.size());
            sb.append('x');
            this.A03 = sb.toString();
            i = 570490624;
            if (((Boolean) list.get(size - 1)).booleanValue()) {
                i = 587137024;
            }
        } else {
            this.A03 = "";
            i = 0;
        }
        this.A00 = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        Paint paint = this.A01;
        paint.setColor(this.A00);
        canvas.drawRect(bounds, paint);
        List list = this.A04;
        int size = list.size();
        int i = bounds.left + 4;
        int i2 = bounds.right;
        int i3 = bounds.top + 4;
        int i4 = i3 + 10;
        int min = Math.min(i4, bounds.bottom);
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (i5 * 12) + i;
            int i7 = i6 + 8;
            if (i7 >= i2) {
                break;
            }
            int i8 = -872349952;
            if (((Boolean) list.get(i5)).booleanValue()) {
                i8 = -855703552;
            }
            paint.setColor(i8);
            canvas.drawRect(i6, i3, i7, min, paint);
        }
        canvas.drawText(this.A03, i + 4.0f, i4 + 20.0f + 2.0f, this.A02);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
