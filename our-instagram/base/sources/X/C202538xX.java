package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.8xX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202538xX extends Drawable implements InterfaceC133125ze, InterfaceC133135zf {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public String A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Resources A0D;
    public final Bitmap A0E;
    public final Bitmap A0F;
    public final Canvas A0G;
    public final Paint A0H;
    public final Rect A0I;
    public final RectF A0J;
    public final String A0K;
    public final Map A0L;
    public final int A0M;
    public final Context A0N;
    public final Typeface A0O;
    public final UserSession A0P;
    public final String[] A0Q;

    @Override // X.InterfaceC133135zf
    public final void AGx(EnumC222529rt enumC222529rt, int i) {
        C14360o3.A0B(enumC222529rt, 0);
        this.A02 = enumC222529rt.A00(i);
        invalidateSelf();
    }

    @Override // X.InterfaceC133135zf
    public final Drawable AKx(String str) {
        C14360o3.A0B(str, 0);
        return new C202538xX(this.A0N, this.A0P, str, this.A0M);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Paint paint = this.A0H;
        paint.setColor(this.A02);
        RectF rectF = this.A0J;
        rectF.set(getBounds().centerX(), getBounds().centerY(), getBounds().centerX(), getBounds().centerY());
        rectF.inset((-this.A07) / 2, (-this.A03) / 2);
        float f = this.A0C;
        canvas.drawRoundRect(rectF, f, f, paint);
        Map map = this.A0L;
        String str = this.A0K;
        Object obj = map.get(str);
        C6RQ c6rq = C6RQ.A0B;
        int i = -16777216;
        if (obj == c6rq) {
            i = -1;
        }
        paint.setColor(i);
        String str2 = this.A08;
        int i2 = getBounds().left;
        Bitmap bitmap = this.A0E;
        int width = i2 + bitmap.getWidth();
        int i3 = this.A05;
        canvas.drawText(str2, width + i3 + this.A0B, getBounds().centerY() + (this.A06 / 2), paint);
        Bitmap bitmap2 = this.A0F;
        bitmap2.eraseColor(0);
        Canvas canvas2 = this.A0G;
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        canvas2.save();
        float f2 = rectF.left + i3;
        if (map.get(str) == c6rq) {
            paint.setColor(-1);
        } else {
            paint.setColor(-16711936);
        }
        canvas2.translate(-f2, 0.0f);
        canvas2.drawPaint(paint);
        canvas2.restore();
        paint.setXfermode(null);
        canvas.drawBitmap(bitmap2, f2, getBounds().centerY() - (bitmap.getHeight() / 2), (Paint) null);
        paint.setShader(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c6, code lost:
    
        if (r0 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C202538xX(android.content.Context r21, com.instagram.common.session.UserSession r22, java.lang.String r23, int r24) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202538xX.<init>(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, int):void");
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A07;
    }
}
