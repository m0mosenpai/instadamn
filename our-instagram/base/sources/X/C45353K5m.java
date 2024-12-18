package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.K5m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45353K5m extends AbstractC44367Jj6 {
    public float A00;
    public float A01;
    public AnonymousClass693 A02;
    public final float A04;
    public boolean A03 = true;
    public final Path A05 = AbstractC166987dD.A0T();
    public final RectF A06 = AbstractC166987dD.A0X();

    public C45353K5m(C161227Kh c161227Kh, float f) {
        this.A04 = f;
        c161227Kh.A02(new C50358MLk(this, 35), new EnumC46207Kcj[]{EnumC46207Kcj.A05, EnumC46207Kcj.A07, EnumC46207Kcj.A06});
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AnonymousClass693 anonymousClass693;
        C14360o3.A0B(canvas, 0);
        if (this.A03 && (anonymousClass693 = this.A02) != null) {
            int A0H = AbstractC166997dE.A0H(this);
            int i = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
            if (400 < A0H) {
                i = A0H;
            }
            int intrinsicHeight = (anonymousClass693.getIntrinsicHeight() * i) / anonymousClass693.getIntrinsicWidth();
            this.A00 = AbstractC166997dE.A0F(this) - (i / 2);
            this.A01 = AbstractC166997dE.A0G(this) - ((i * 30) / ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
            anonymousClass693.setBounds(0, 0, i, intrinsicHeight);
            anonymousClass693.E4S();
        }
        this.A03 = false;
        Path path = this.A05;
        path.rewind();
        RectF rectF = this.A06;
        float f = this.A04;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            float f2 = this.A00;
            float f3 = this.A01;
            save = canvas.save();
            canvas.translate(f2, f3);
            AnonymousClass693 anonymousClass6932 = this.A02;
            if (anonymousClass6932 != null) {
                anonymousClass6932.draw(canvas);
            }
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        } finally {
            canvas.restoreToCount(save);
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
        this.A03 = true;
        AbstractC44367Jj6.A01(rect, this.A06);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
