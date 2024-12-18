package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.U8p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnTouchListenerC66316U8p extends Drawable implements View.OnTouchListener, Drawable.Callback, InterfaceC55932he {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public W32 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final RectF A0J;
    public final C55982hj A0K;
    public final C55982hj A0L;
    public final C55982hj A0M;
    public final C68002V5u A0N;
    public final U8Q A0O;
    public final UserSession A0P;

    public final void A03(int i) {
        float f = i;
        this.A01 = f / 2.0f;
        this.A02 = f;
        invalidateSelf();
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
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

    public static void A00(Rect rect, ViewOnTouchListenerC66316U8p viewOnTouchListenerC66316U8p) {
        viewOnTouchListenerC66316U8p.A0I.setShader(new LinearGradient(0.0f, rect.exactCenterY(), rect.width(), rect.exactCenterY(), viewOnTouchListenerC66316U8p.A06, viewOnTouchListenerC66316U8p.A05, Shader.TileMode.CLAMP));
    }

    public final void A01(float f) {
        this.A00 = f;
        C68002V5u c68002V5u = this.A0N;
        int A02 = AbstractC13950nL.A02(f, this.A06, this.A05);
        U8Q u8q = c68002V5u.A04;
        u8q.A02 = A02;
        u8q.invalidateSelf();
        c68002V5u.invalidateSelf();
        invalidateSelf();
    }

    public final void A02(int i) {
        C68002V5u c68002V5u = this.A0N;
        float f = i;
        c68002V5u.A00 = f;
        c68002V5u.A06.A0A(f);
        U8Q u8q = c68002V5u.A04;
        u8q.A00 = c68002V5u.A00 / 2.0f;
        u8q.invalidateSelf();
        C66313U8m c66313U8m = c68002V5u.A05;
        c66313U8m.A00 = c68002V5u.A00;
        c66313U8m.invalidateSelf();
        c68002V5u.invalidateSelf();
    }

    public final void A04(Integer num) {
        C68002V5u c68002V5u = this.A0N;
        c68002V5u.A01 = num;
        c68002V5u.A02 = null;
        c68002V5u.A03.A02();
        c68002V5u.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.A04;
        if (i <= 0) {
            return (int) this.A0N.A00;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0N.setAlpha(i);
        this.A0H.setAlpha(i);
        this.A0I.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0N.setColorFilter(colorFilter);
        this.A0H.setColorFilter(colorFilter);
        this.A0I.setColorFilter(colorFilter);
    }

    public ViewOnTouchListenerC66316U8p(Context context, UserSession userSession) {
        Paint paint = new Paint(1);
        this.A0H = paint;
        this.A0I = new Paint(1);
        this.A0J = new RectF();
        C55952hg A00 = AbstractC13560mi.A00();
        this.A0P = userSession;
        C68002V5u c68002V5u = new C68002V5u(context);
        this.A0N = c68002V5u;
        c68002V5u.setCallback(this);
        C55982hj A02 = A00.A02();
        A02.A09(C55942hf.A02(10.0d));
        A02.A02();
        A02.A0A(this);
        this.A0K = A02;
        U8Q u8q = new U8Q(context);
        this.A0O = u8q;
        u8q.setCallback(this);
        C55982hj A022 = A00.A02();
        A022.A09(C55942hf.A02(10.0d));
        A022.A02();
        A022.A0A(this);
        this.A0M = A022;
        C55982hj A023 = A00.A02();
        A023.A0A(this);
        A023.A08(0.0d, true);
        A023.A09(C55942hf.A01());
        this.A0L = A023;
        int color = context.getColor(R.color.chat_sticker_button_divider_color);
        this.A0E = color;
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_pink);
        this.A0G = A09;
        int A092 = AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_pink);
        this.A0F = A092;
        this.A06 = A09;
        this.A05 = A092;
        paint.setColor(color);
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        C55982hj c55982hj;
        float f3;
        Rect bounds = getBounds();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        Rect bounds2 = getBounds();
        float height = bounds2.height() / 2.0f;
        RectF rectF = this.A0J;
        rectF.set(0.0f, height - (this.A02 / 2.0f), bounds2.width(), height + (this.A02 / 2.0f));
        float f4 = this.A01;
        canvas.drawRoundRect(rectF, f4, f4, this.A0H);
        Rect bounds3 = getBounds();
        C68002V5u c68002V5u = this.A0N;
        float f5 = (int) c68002V5u.A00;
        float height2 = bounds3.height() / 2.0f;
        boolean z = this.A09;
        float f6 = this.A00;
        float width = bounds3.width();
        if (z) {
            f = (f6 * (width - f5)) + (f5 / 2.0f);
        } else {
            f = f6 * width;
        }
        float f7 = this.A02 / 2.0f;
        rectF.set(0.0f, height2 - f7, f, height2 + f7);
        float f8 = this.A01;
        canvas.drawRoundRect(rectF, f8, f8, this.A0I);
        if (this.A0A) {
            int A02 = AbstractC13950nL.A02(this.A03, this.A06, this.A05);
            U8Q u8q = this.A0O;
            u8q.A02 = A02;
            u8q.invalidateSelf();
            if (this.A0B) {
                c55982hj = this.A0L;
            } else {
                c55982hj = this.A0M;
            }
            float f9 = (float) c55982hj.A09.A00;
            Rect bounds4 = getBounds();
            float intrinsicWidth = u8q.getIntrinsicWidth();
            float intrinsicHeight = u8q.getIntrinsicHeight();
            boolean z2 = this.A09;
            float f10 = this.A03;
            float width2 = bounds4.width();
            if (z2) {
                f3 = (f10 * (width2 - intrinsicWidth)) + (intrinsicWidth / 2.0f);
            } else {
                f3 = f10 * width2;
            }
            float height3 = bounds4.height() / 2;
            canvas.save();
            canvas.scale(f9, f9, f3, height3);
            float f11 = intrinsicWidth / 2.0f;
            float f12 = intrinsicHeight / 2.0f;
            u8q.setBounds((int) (f3 - f11), (int) (height3 - f12), (int) (f3 + f11), (int) (height3 + f12));
            u8q.draw(canvas);
            canvas.restore();
        }
        Rect bounds5 = getBounds();
        float f13 = (int) c68002V5u.A00;
        float f14 = (float) this.A0K.A09.A00;
        boolean z3 = this.A09;
        float f15 = this.A00;
        float width3 = bounds5.width();
        if (z3) {
            f2 = (f15 * (width3 - f13)) + (f13 / 2.0f);
        } else {
            f2 = f15 * width3;
        }
        float height4 = bounds5.height() / 2;
        canvas.save();
        canvas.scale(f14, f14, f2, height4);
        float f16 = f13 / 2.0f;
        c68002V5u.setBounds((int) (f2 - f16), (int) (height4 - f16), (int) (f2 + f16), (int) (height4 + f16));
        c68002V5u.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        A00(rect, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a2, code lost:
    
        if (r1 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r1 != 3) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, X.IJz] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r15, android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC66316U8p.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
