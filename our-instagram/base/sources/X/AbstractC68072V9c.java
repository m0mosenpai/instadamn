package X;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.V9c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68072V9c extends AbstractC210529Sr {
    public List A00;
    public int A01;
    public int A02;
    public int A03;
    public final TextPaint A04;
    public final C69030Vg9 A05;
    public final W5A A06;
    public final C69307VlF A07;

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        if (this.A03 != rect.width() || this.A01 != rect.height()) {
            this.A03 = rect.width();
            this.A01 = rect.height();
            Rect bounds = getBounds();
            C14360o3.A07(bounds);
            int width = bounds.width();
            int height = bounds.height();
            C70993Wm9 c70993Wm9 = this.A08;
            this.A00 = new ArrayList(c70993Wm9.Bd3());
            int Bd3 = c70993Wm9.Bd3();
            for (int i = 0; i < Bd3; i++) {
                List list = this.A00;
                C69030Vg9 c69030Vg9 = this.A05;
                String Bd2 = c70993Wm9.Bd2(i);
                C14360o3.A0B(Bd2, 0);
                if (c69030Vg9.A00) {
                    Bd2 = AbstractC65702TsY.A0g(Bd2);
                }
                TextPaint textPaint = c69030Vg9.A01;
                int A00 = height / VW9.A00(textPaint);
                C14360o3.A0B(textPaint, 1);
                StaticLayout A002 = AbstractC70057W0r.A00(Layout.Alignment.ALIGN_CENTER, textPaint, Bd2, A00, width);
                int height2 = (height - A002.getHeight()) / 2;
                String substring = Bd2.substring(0, A002.getText().length());
                ArrayList A10 = AbstractC31174DnI.A10(substring);
                int lineCount = A002.getLineCount();
                for (int i2 = 0; i2 < lineCount; i2++) {
                    int lineStart = A002.getLineStart(i2);
                    String A0w = AbstractC25227BEk.A0w(substring, lineStart, (A002.getLineEnd(i2) - 1) + 1);
                    float primaryHorizontal = A002.getPrimaryHorizontal(lineStart);
                    A10.add(new C69594Vrx(A0w, A002.getLineBaseline(i2), primaryHorizontal, textPaint.measureText(A0w) + primaryHorizontal));
                }
                list.add(new C69579Vri(A002, A10, height2));
            }
        }
    }

    @Override // X.AbstractC210529Sr
    public final void A01(Canvas canvas, int i) {
        Integer num;
        float interpolation;
        float f;
        float f2;
        float A02;
        float f3;
        float f4;
        C14360o3.A07(getBounds());
        if (!this.A00.isEmpty()) {
            W5A w5a = this.A06;
            w5a.A02(i);
            C69579Vri c69579Vri = (C69579Vri) this.A00.get(w5a.A01);
            canvas.save();
            canvas.translate(r5.left, r5.top + c69579Vri.A00);
            C69307VlF c69307VlF = this.A07;
            Integer num2 = w5a.A02;
            if (num2 != null) {
                float f5 = w5a.A00;
                List list = c69579Vri.A02;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C69594Vrx c69594Vrx = (C69594Vrx) list.get(i2);
                    C68834Vcq c68834Vcq = c69307VlF.A03;
                    Integer num3 = C05F.A01;
                    if (num2 == num3) {
                        num = C05F.A00;
                        c68834Vcq.A00 = num;
                        num3 = num;
                        A02 = 1.0f;
                    } else {
                        float f6 = 1.0f / (((size - 1) * (1.0f - c69307VlF.A00)) + 1.0f);
                        num = C05F.A00;
                        if (num2 == num) {
                            interpolation = c69307VlF.A01.getInterpolation(f5);
                            f2 = i2 * (1.0f - c69307VlF.A00) * f6;
                            if (interpolation >= f2) {
                                c68834Vcq.A00 = num;
                                num3 = num;
                                f = f2 + f6;
                                A02 = AbstractC13600mm.A02(interpolation, f2, f, 0.0f, 1.0f);
                            }
                        } else {
                            interpolation = c69307VlF.A02.getInterpolation(f5);
                            f = 1.0f - (((size - i2) - 1) * ((1.0f - c69307VlF.A00) * f6));
                            if (interpolation <= f) {
                                c68834Vcq.A00 = num3;
                                f2 = f - f6;
                                A02 = AbstractC13600mm.A02(interpolation, f2, f, 0.0f, 1.0f);
                            }
                        }
                    }
                    C69149Vie c69149Vie = c69307VlF.A04;
                    C14360o3.A0B(c69594Vrx, 1);
                    if (num3 == num) {
                        f3 = A02;
                        f4 = 1.0f - A02;
                    } else {
                        f3 = 1.0f - A02;
                        f4 = -A02;
                    }
                    TextPaint textPaint = c69149Vie.A02;
                    textPaint.setAlpha((int) (255.0f * f3));
                    canvas.save();
                    Camera camera = c69149Vie.A00;
                    camera.save();
                    float abs = Math.abs(c69149Vie.A01.ascent);
                    float f7 = c69594Vrx.A02;
                    float f8 = c69594Vrx.A01 - f7;
                    float f9 = abs / 2.0f;
                    canvas.translate(f7 + (f8 / 2.0f), c69594Vrx.A00 - f9);
                    camera.translate(0.0f, 0.0f, (-abs) / 2.0f);
                    camera.rotateX(f4 * 90.0f);
                    camera.translate(0.0f, 0.0f, f9);
                    camera.applyToCanvas(canvas);
                    camera.restore();
                    canvas.drawText(c69594Vrx.A03, (-f8) / 2.0f, f9, textPaint);
                    canvas.restore();
                }
                canvas.restore();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.BEc
    public final int ApI() {
        return ((this.A02 & 255) << 24) | (this.A04.getColor() & 16777215);
    }

    @Override // X.C5RR
    public final /* bridge */ /* synthetic */ C5NL C0T() {
        EnumC138556Pl enumC138556Pl = this.A09;
        return new C24025AlH(this.A08.A00, super.A01, null, enumC138556Pl, this.A04.getColor());
    }

    @Override // X.BEc
    public final void ERe(int i) {
        this.A04.setColor(i);
        this.A02 = Color.alpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A02 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public AbstractC68072V9c(Context context, Typeface typeface, MusicOverlayStickerModel musicOverlayStickerModel, C70993Wm9 c70993Wm9, EnumC138556Pl enumC138556Pl, float f, int i) {
        super(context, musicOverlayStickerModel, c70993Wm9, enumC138556Pl, 0.8f);
        TextPaint textPaint = new TextPaint(1);
        this.A04 = textPaint;
        this.A00 = Collections.emptyList();
        this.A03 = -1;
        this.A01 = -1;
        this.A02 = 255;
        textPaint.setColor(i);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTextSize(f);
        textPaint.setTypeface(typeface);
        this.A06 = new W5A(c70993Wm9, 0, 900, 450);
        C69030Vg9 c69030Vg9 = new C69030Vg9(textPaint);
        c69030Vg9.A00 = true;
        this.A05 = c69030Vg9;
        C69307VlF c69307VlF = new C69307VlF(new C69149Vie(textPaint));
        c69307VlF.A00 = 0.5f;
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        c69307VlF.A01 = decelerateInterpolator;
        c69307VlF.A02 = accelerateInterpolator;
        this.A07 = c69307VlF;
    }
}
