package X;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.V9f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68075V9f extends AbstractC210529Sr implements InterfaceC133125ze {
    public StaticLayout[] A00;
    public int A01;
    public final TextPaint A02;
    public final int A03;
    public final Camera A04;
    public final W5A A05;
    public final WOX A06;

    public C68075V9f(Context context, MusicOverlayStickerModel musicOverlayStickerModel, C70993Wm9 c70993Wm9, int i) {
        super(context, musicOverlayStickerModel, c70993Wm9, EnumC138556Pl.A08, 0.8f);
        this.A06 = new WOX();
        this.A05 = new W5A(c70993Wm9, 500, 0, 500);
        TextPaint textPaint = new TextPaint(1);
        this.A02 = textPaint;
        textPaint.setColor(i);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(((AbstractC13880nE.A0A(context) * 62) / 1080.0f) * 1.2f);
        textPaint.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A10));
        this.A01 = Color.alpha(i);
        Camera camera = new Camera();
        this.A04 = camera;
        camera.setLocation(0.0f, 0.0f, 50.0f);
        this.A03 = VW9.A00(textPaint) * 4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        int A0H = AbstractC166997dE.A0H(this);
        C70993Wm9 c70993Wm9 = this.A08;
        this.A00 = new StaticLayout[c70993Wm9.Bd3()];
        int Bd3 = c70993Wm9.Bd3();
        for (int i = 0; i < Bd3; i++) {
            String Bd2 = c70993Wm9.Bd2(i);
            StaticLayout[] staticLayoutArr = this.A00;
            if (staticLayoutArr != null) {
                TextPaint textPaint = this.A02;
                AbstractC167017dG.A1P(textPaint, Bd2);
                staticLayoutArr[i] = AbstractC70057W0r.A00(AbstractC70057W0r.A00, textPaint, Bd2, 4, A0H);
            }
        }
    }

    private final void A00(Canvas canvas, float f, int i) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout[] staticLayoutArr = this.A00;
        if (staticLayoutArr != null) {
            if (i >= 0 && i < staticLayoutArr.length) {
                canvas.save();
                Camera camera = this.A04;
                camera.save();
                int i2 = this.A03;
                camera.translate(0.0f, 0.0f, (-i2) / 2.0f);
                camera.rotateX(f);
                camera.translate(0.0f, 0.0f, i2 / 2.0f);
                camera.applyToCanvas(canvas);
                camera.restore();
                StaticLayout[] staticLayoutArr2 = this.A00;
                if (staticLayoutArr2 != null) {
                    staticLayout = staticLayoutArr2[i];
                } else {
                    staticLayout = null;
                }
                int i3 = 0;
                if (staticLayout != null) {
                    i3 = staticLayout.getHeight();
                }
                canvas.translate(0.0f, (-i3) / 2.0f);
                StaticLayout[] staticLayoutArr3 = this.A00;
                if (staticLayoutArr3 != null && (staticLayout2 = staticLayoutArr3[i]) != null) {
                    staticLayout2.draw(canvas);
                }
                canvas.restore();
                return;
            }
            return;
        }
        throw new IllegalStateException("runLayout() has not run yet");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r3 > 1.0f) goto L14;
     */
    @Override // X.AbstractC210529Sr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.graphics.Canvas r12, int r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68075V9f.A01(android.graphics.Canvas, int):void");
    }

    @Override // X.BEc
    public final int ApI() {
        return ((this.A01 & 255) << 24) | (this.A02.getColor() & 16777215);
    }

    @Override // X.C5RR
    public final /* bridge */ /* synthetic */ C5NL C0T() {
        EnumC138556Pl enumC138556Pl = this.A09;
        return new C24025AlH(this.A08.A00, super.A01, null, enumC138556Pl, ApI());
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return AbstractC111324zv.A00(2731);
    }

    @Override // X.BEc
    public final void ERe(int i) {
        this.A02.setColor(i);
        this.A01 = Color.alpha(i);
        invalidateSelf();
    }

    @Override // X.AbstractC210529Sr, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) (this.A03 * 1.35f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
