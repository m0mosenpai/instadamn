package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.9SR, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9SR extends Drawable implements C5RP, Drawable.Callback, C1NJ, InterfaceC133125ze {
    public Bitmap A00;
    public Bitmap A01;
    public final int A02;
    public final int A03;
    public final RectF A06;
    public final Runnable A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final Path A0F;
    public final RectF A0G;
    public final Drawable A0H;
    public final C6RB A0I;
    public final C6RB A0J;
    public final C6RB A0K;
    public final boolean A0M;
    public final CopyOnWriteArraySet A0L = new CopyOnWriteArraySet();
    public final Paint A0E = AbstractC166987dD.A0S(3);
    public final Paint A05 = AbstractC166987dD.A0S(3);
    public final Paint A04 = AbstractC166987dD.A0S(1);

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A0L.add(interfaceC25177BCa);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0069 A[LOOP:0: B:8:0x0063->B:10:0x0069, LOOP_END] */
    @Override // X.C1NJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cza(X.InterfaceC59502nt r12, X.C73033Pe r13) {
        /*
            r11 = this;
            r3 = 0
            X.AbstractC167007dF.A1K(r12, r13)
            java.lang.Object r1 = r12.C4x()
            java.lang.String r0 = "media"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L73
            android.graphics.Bitmap r2 = r13.A01
            int r1 = r11.A03
            int r0 = r11.A02
            android.graphics.Bitmap r2 = android.media.ThumbnailUtils.extractThumbnail(r2, r1, r0)
            r11.A00 = r2
            android.graphics.Paint r1 = r11.A05
            if (r2 == 0) goto L87
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            r0.<init>(r2, r10, r10)
            r1.setShader(r0)
            android.graphics.RectF r0 = r11.A06
            float r4 = r0.width()
            float r7 = r0.height()
            android.graphics.Paint r2 = r11.A04
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            r5 = 0
            r1 = 4
            r0 = 1184197120(0x46956a00, float:19125.0)
            int r0 = java.lang.Math.round(r0)
            int r0 = android.graphics.Color.argb(r0, r3, r3, r3)
            int[] r8 = new int[]{r3, r3, r3, r0}
            float[] r9 = new float[r1]
            r9 = {x0092: FILL_ARRAY_DATA , data: [0, 1048576000, 1056964608, 1065353216} // fill-array
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.setShader(r3)
        L58:
            java.lang.Runnable r0 = r11.A07
            X.C11T.A02(r0)
        L5d:
            java.util.concurrent.CopyOnWriteArraySet r0 = r11.A0L
            java.util.Iterator r1 = X.AbstractC166997dE.A13(r0)
        L63:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r1.next()
            X.BCa r0 = (X.InterfaceC25177BCa) r0
            r0.DQ0()
            goto L63
        L73:
            java.lang.String r0 = "profile_pic"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5d
            android.graphics.Bitmap r0 = r13.A01
            if (r0 == 0) goto L8c
            android.graphics.Bitmap r0 = X.C1NC.A05(r0)
            r11.A01 = r0
            goto L58
        L86:
            return
        L87:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L8c:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9SR.Cza(X.2nt, X.3Pe):void");
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A0L.remove(interfaceC25177BCa);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        C14360o3.A0B(canvas, 0);
        if (!isLoading()) {
            float height = this.A06.height();
            RectF rectF = this.A0G;
            float height2 = rectF.height();
            float f2 = height2 / 2.0f;
            Rect A0W = AbstractC166987dD.A0W(this);
            Drawable drawable = this.A0H;
            C14360o3.A0A(drawable);
            drawable.draw(canvas);
            int save = canvas.save();
            AbstractC167007dF.A0s(canvas, A0W);
            canvas.save();
            Path path = this.A0F;
            canvas.drawPath(path, this.A05);
            canvas.drawPath(path, this.A04);
            canvas.save();
            int i = this.A09;
            float f3 = i;
            float f4 = (height - f3) - height2;
            boolean z = this.A0M;
            if (z) {
                f3 = this.A03 - i;
            }
            canvas.translate(f3, f4);
            canvas.save();
            if (z) {
                canvas.translate(-height2, 0.0f);
            }
            Bitmap bitmap = this.A01;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rectF, this.A0E);
            }
            C6RB c6rb = this.A0K;
            float f5 = f2 - (c6rb.A06 / 2.0f);
            int i2 = this.A0C;
            if (z) {
                f = (-i2) - c6rb.A0A;
            } else {
                f = height2 + i2;
            }
            AbstractC167007dF.A0u(canvas, c6rb, f, f5);
            int i3 = -this.A0B;
            C6RB c6rb2 = this.A0J;
            canvas.translate(0.0f, i3 - c6rb2.A06);
            canvas.save();
            if (z) {
                canvas.translate(-c6rb2.A0A, 0.0f);
            } else {
                canvas.translate(0.0f, 0.0f);
            }
            c6rb2.draw(canvas);
            canvas.restore();
            int i4 = -this.A08;
            C6RB c6rb3 = this.A0I;
            canvas.translate(0.0f, i4 - c6rb3.A06);
            if (z) {
                canvas.translate(-c6rb3.A0A, 0.0f);
            } else {
                canvas.translate(0.0f, 0.0f);
            }
            c6rb3.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public C9SR(Context context, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, int i, int i2) {
        this.A0D = context;
        this.A03 = i;
        this.A02 = i2;
        this.A0M = AbstractC13620mo.A02(context);
        Path A0T = AbstractC166987dD.A0T();
        this.A0F = A0T;
        RectF A0X = AbstractC166987dD.A0X();
        this.A0G = A0X;
        this.A07 = new RunnableC24308AqD(this);
        float A04 = AbstractC13880nE.A04(context, 8);
        float round = Math.round(AbstractC13880nE.A04(context, 24));
        this.A0A = AbstractC166987dD.A0C(context, 4);
        int round2 = Math.round(AbstractC13880nE.A04(context, 16));
        this.A09 = round2;
        AbstractC13880nE.A04(context, 8);
        this.A08 = Math.round(AbstractC13880nE.A04(context, 4));
        this.A0B = Math.round(AbstractC13880nE.A04(context, 8));
        int i3 = (int) (round2 / 2.0f);
        this.A0C = i3;
        AbstractC13880nE.A04(context, 2);
        RectF A0Y = AbstractC166987dD.A0Y(i, i2);
        this.A06 = A0Y;
        A0T.addRoundRect(A0Y, new float[]{A04, A04, A04, A04, A04, A04, A04, A04}, Path.Direction.CW);
        Drawable drawable = context.getDrawable(R.drawable.sticker_background_shadow);
        this.A0H = drawable;
        C14360o3.A0A(drawable);
        drawable.setCallback(this);
        A0X.set(0.0f, 0.0f, round, round);
        float f = i - (round2 * 2);
        int i4 = (int) (0.8f * f);
        int width = (int) ((f - A0X.width()) - i3);
        int argb = Color.argb(Math.round(38.25f), 0, 0, 0);
        C6RB A0z = AbstractC166987dD.A0z(context, width);
        this.A0K = A0z;
        AbstractC167027dH.A0c(context, A0z, 12);
        Typeface typeface = Typeface.SANS_SERIF;
        A0z.A0J(typeface, 1);
        A0z.A0F(-1);
        A0z.A0D(10.0f, 0.0f, 0.0f, argb);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0z.A0K(alignment);
        A0z.A0O = true;
        A0z.A0M(str2);
        C6RB A0z2 = AbstractC166987dD.A0z(context, i4);
        this.A0J = A0z2;
        AbstractC167027dH.A0c(context, A0z2, 24);
        A0z2.A0B(AbstractC13880nE.A03(context, 2.0f), 1.0f);
        A0z2.A0J(typeface, 1);
        A0z2.A0F(-1);
        A0z2.A0D(10.0f, 0.0f, 0.0f, argb);
        A0z2.A0K(alignment);
        A0z2.A0G(3, "…");
        A0z2.A0O = true;
        if (str != null) {
            A0z2.A0M(str);
        }
        C6RB A0z3 = AbstractC166987dD.A0z(context, i4);
        this.A0I = A0z3;
        AbstractC167027dH.A0c(context, A0z3, 12);
        A0z3.A0J(typeface, 1);
        A0z3.A0F(-1);
        A0z3.A0D(10.0f, 0.0f, 0.0f, argb);
        A0z3.A0K(alignment);
        A0z3.A0O = true;
        A0z3.A0M(str3);
        C1OG A0J = C25821No.A00().A0J(imageUrl2, null);
        A0J.A08 = "profile_pic";
        A0J.A02(this);
        A0J.A01();
        C25821No A00 = C25821No.A00();
        if (imageUrl != null) {
            C1OG A0J2 = A00.A0J(imageUrl, null);
            A0J2.A08 = "media";
            A0J2.A02(this);
            A0J2.A01();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C5RP
    public final void AHq() {
        this.A0L.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03;
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        if (this.A00 != null && this.A01 != null) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A0E.setAlpha(i);
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A0E.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0H;
        C14360o3.A0A(drawable);
        int i5 = this.A0A;
        drawable.setBounds(i - i5, i2 - i5, i3 + i5, i4 + i5);
    }
}
