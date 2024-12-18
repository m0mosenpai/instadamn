package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9pJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220959pJ extends AbstractC130945vi implements C5RR, InterfaceC133125ze, InterfaceC133135zf, InterfaceC202998yH {
    public int A00;
    public int A01;
    public int A02;
    public LinearGradient A03;
    public LinearGradient A04;
    public String A05;
    public int[] A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Bitmap A0A;
    public final Bitmap A0B;
    public final Canvas A0C;
    public final Paint A0D;
    public final RectF A0E;
    public final C217829kF A0F;
    public final C6RL A0G;
    public final String A0H;
    public final String[] A0I;
    public final int A0J;
    public final Context A0K;
    public final Resources A0L;
    public final Rect A0M;
    public final UserSession A0N;
    public final boolean A0O;

    @Override // X.InterfaceC133135zf
    public final void AGx(EnumC222529rt enumC222529rt, int i) {
        C14360o3.A0B(enumC222529rt, 0);
        int A01 = enumC222529rt.A01(i);
        this.A06 = new int[]{A01, A01};
        int A0F = AbstractC166997dE.A0F(this);
        int i2 = this.A02 / 2;
        this.A03 = new LinearGradient(A0F - i2, 0.0f, AbstractC166997dE.A0F(this) + i2, 0.0f, this.A06, (float[]) null, Shader.TileMode.REPEAT);
        invalidateSelf();
        this.A00 = enumC222529rt.A00(i);
        invalidateSelf();
    }

    @Override // X.InterfaceC133135zf
    public final Drawable AKx(String str) {
        C14360o3.A0B(str, 0);
        C217829kF c217829kF = this.A0F;
        return new C220959pJ(this.A0K, this.A0N, c217829kF, str, this.A0J, this.A0O);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Paint paint = this.A0D;
        paint.setColor(this.A00);
        RectF rectF = this.A0E;
        rectF.set(AbstractC166997dE.A0F(this), AbstractC167007dF.A00(this), AbstractC166997dE.A0F(this), AbstractC167007dF.A00(this));
        rectF.inset((-this.A02) / 2, (-this.A01) / 2);
        float f = this.A09;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setColor(-1);
        paint.setShader(this.A03);
        String str = this.A05;
        int A0E = AbstractC166987dD.A0E(this);
        Bitmap bitmap = this.A0A;
        int width = A0E + bitmap.getWidth();
        int i = this.A08;
        canvas.drawText(str, width + i + this.A07, AbstractC167007dF.A00(this) - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        Bitmap bitmap2 = this.A0B;
        bitmap2.eraseColor(0);
        Canvas canvas2 = this.A0C;
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.SRC_ATOP);
        canvas2.save();
        float f2 = rectF.left + i;
        if (AbstractC009903n.A0O(this.A0H, this.A0I)) {
            paint.setColor(-1);
            paint.setShader(this.A04);
        } else {
            canvas2.translate(-f2, 0.0f);
        }
        canvas2.drawPaint(paint);
        canvas2.restore();
        paint.setXfermode(null);
        canvas.drawBitmap(bitmap2, f2, getBounds().centerY() - (bitmap.getHeight() / 2), paint);
        paint.setShader(null);
        if (this.A0O) {
            this.A0G.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        int A0F = AbstractC166997dE.A0F(this);
        int i = this.A02 / 2;
        this.A03 = new LinearGradient(A0F - i, 0.0f, AbstractC166997dE.A0F(this) + i, 0.0f, this.A06, (float[]) null, Shader.TileMode.REPEAT);
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x00a5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C220959pJ(android.content.Context r20, com.instagram.common.session.UserSession r21, X.C217829kF r22, java.lang.String r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220959pJ.<init>(android.content.Context, com.instagram.common.session.UserSession, X.9kF, java.lang.String, int, boolean):void");
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC166987dD.A1J(this.A0G);
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A0F;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0H;
    }

    @Override // X.InterfaceC202998yH
    public final void DtF(int i, int i2) {
        C217829kF c217829kF = this.A0F;
        c217829kF.A01 = i;
        c217829kF.A00 = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A02;
    }
}
