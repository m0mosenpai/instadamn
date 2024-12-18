package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.9ST, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ST extends Drawable implements InterfaceC202708xo {
    public String A00;
    public String A01;
    public String A02;
    public final boolean A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Paint A09;

    @Override // X.InterfaceC202708xo
    public final void EVu(String str) {
        C14360o3.A0B(str, 0);
        this.A00 = str;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Paint paint = this.A09;
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTextSize(this.A05);
        String str = this.A02;
        C14360o3.A0A(str);
        C14360o3.A0A(str);
        canvas.drawText(str, 0, str.length(), AbstractC166987dD.A0E(this), getBounds().centerY() + (this.A08 / 2), paint);
        String str2 = this.A01;
        if (str2 != null) {
            paint.setTextAlign(Paint.Align.RIGHT);
            paint.setTextSize(this.A04);
            canvas.drawText(str2, 0, str2.length(), getBounds().right, AbstractC166987dD.A0D(this), paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9ST(android.content.Context r12, android.content.res.Resources r13, long r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9ST.<init>(android.content.Context, android.content.res.Resources, long):void");
    }

    @Override // X.InterfaceC202708xo
    public final String getId() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
    }
}
