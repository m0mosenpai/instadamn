package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.WordOffset;
import java.util.List;

/* renamed from: X.V9g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68076V9g extends AbstractC210529Sr implements InterfaceC133125ze {
    public int A00;
    public final TextPaint A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final Rect A05;
    public final SparseArray A06;
    public final SparseIntArray A07;
    public final W5A A08;

    public C68076V9g(Context context, MusicOverlayStickerModel musicOverlayStickerModel, C70993Wm9 c70993Wm9, int i) {
        super(context, musicOverlayStickerModel, c70993Wm9, EnumC138556Pl.A0C, 0.7f);
        this.A08 = new W5A(c70993Wm9, 0, 0, 500);
        this.A07 = new SparseIntArray();
        this.A06 = new SparseArray();
        this.A05 = new Rect();
        float A0A = ((AbstractC13880nE.A0A(context) * 44) / 1080.0f) * 1.2f;
        TextPaint textPaint = new TextPaint(1);
        this.A01 = textPaint;
        textPaint.setColor(i);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A14));
        textPaint.setTextSize(A0A);
        this.A03 = A0A / 2.1818182f;
        this.A02 = textPaint.measureText(" ") * 0.2f;
        Paint paint = new Paint();
        this.A04 = paint;
        paint.setColor(i);
        this.A00 = Color.alpha(i);
    }

    @Override // X.AbstractC210529Sr
    public final void A01(Canvas canvas, int i) {
        float f;
        int max;
        WordOffset wordOffset;
        C14360o3.A07(getBounds());
        canvas.save();
        canvas.translate(r2.left, r2.top);
        W5A w5a = this.A08;
        w5a.A02(i);
        int i2 = w5a.A01;
        for (int i3 = this.A07.get(i2); i3 < i2; i3++) {
            Layout layout = (Layout) this.A06.get(i3);
            if (layout != null) {
                layout.draw(canvas);
                canvas.translate(0.0f, layout.getHeight());
            }
        }
        C70993Wm9 c70993Wm9 = super.A08;
        String Bd2 = c70993Wm9.Bd2(i2);
        List A00 = c70993Wm9.A00(i2);
        if (A00 != null && !A00.isEmpty()) {
            int Bzm = i - c70993Wm9.Bzm(i2);
            int size = A00.size() - 1;
            while (true) {
                int i4 = size - 1;
                wordOffset = (WordOffset) A00.get(size);
                if (i4 < 0 || Bzm >= wordOffset.A03) {
                    break;
                } else {
                    size = i4;
                }
            }
            int i5 = wordOffset.A03;
            if (Bzm < i5) {
                max = 0;
            } else {
                int i6 = wordOffset.A01;
                if (Bzm > i6) {
                    max = wordOffset.A00 - (!wordOffset.A04 ? 1 : 0);
                } else {
                    int i7 = Bzm - i5;
                    int i8 = i6 - i5;
                    if (i7 == i8) {
                        max = wordOffset.A00 - 1;
                    } else {
                        float f2 = i7 / i8;
                        int i9 = wordOffset.A00;
                        max = ((int) (f2 * (i9 - r1))) + wordOffset.A02;
                    }
                }
            }
        } else {
            Integer num = w5a.A02;
            if (num != null) {
                if (num == C05F.A01) {
                    f = w5a.A00;
                    if (0.0f > f || f > 1.0f) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("TypewriterLyricsStickerDrawable: invalid progress ");
                        sb.append(f);
                        sb.append(" for frame time ");
                        sb.append(i);
                        throw AbstractC58320PtC.A0o(" in drawFrame()", sb);
                    }
                } else {
                    f = 1.0f;
                }
                max = (int) (Math.max(Bd2.length() - 1, 0) * f);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        Layout layout2 = (Layout) this.A06.get(i2);
        if (layout2 != null) {
            int lineForOffset = layout2.getLineForOffset(max);
            for (int i10 = 0; i10 < lineForOffset; i10++) {
                String A0w = AbstractC25227BEk.A0w(Bd2, layout2.getLineStart(i10), layout2.getLineEnd(i10));
                Rect rect = this.A05;
                canvas.drawText(A0w, rect.left, layout2.getLineBounds(i10, rect), this.A01);
            }
            Rect rect2 = this.A05;
            int lineBounds = layout2.getLineBounds(lineForOffset, rect2);
            String A0w2 = AbstractC25227BEk.A0w(Bd2, layout2.getLineStart(lineForOffset), Math.min(max + 1, Bd2.length()));
            float f3 = rect2.left;
            float f4 = lineBounds;
            TextPaint textPaint = this.A01;
            canvas.drawText(A0w2, f3, f4, textPaint);
            Paint paint = this.A04;
            float f5 = this.A00;
            int i11 = i % 1000;
            float f6 = i11;
            if (f6 >= 500.0f) {
                f6 = 1000 - i11;
            }
            paint.setAlpha((int) (f5 * (f6 / 500.0f)));
            float measureText = rect2.left + textPaint.measureText(A0w2) + this.A02;
            canvas.drawRect(measureText, rect2.top, measureText + this.A03, f4 + ((rect2.bottom - lineBounds) / 2.0f), paint);
            canvas.restore();
        }
    }

    @Override // X.AbstractC210529Sr, X.BEc
    public final void DUc(MusicOverlayStickerModel musicOverlayStickerModel) {
        C14360o3.A0B(musicOverlayStickerModel, 0);
        super.A01 = musicOverlayStickerModel;
        A00();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        A00();
    }

    private final void A00() {
        SparseIntArray sparseIntArray = this.A07;
        sparseIntArray.clear();
        SparseArray sparseArray = this.A06;
        sparseArray.clear();
        C70993Wm9 c70993Wm9 = super.A08;
        int Bd3 = c70993Wm9.Bd3();
        MusicOverlayStickerModel musicOverlayStickerModel = super.A01;
        int i = 0;
        int A0K = AbstractC167017dG.A0K(musicOverlayStickerModel.A0K);
        Integer num = musicOverlayStickerModel.A0O;
        if (num != null) {
            i = num.intValue();
        }
        int i2 = i + A0K;
        int AYr = c70993Wm9.AYr(A0K);
        int i3 = super.A06;
        int i4 = (int) ((i3 - this.A02) - this.A03);
        int i5 = AYr;
        int i6 = i3;
        while (AYr < Bd3 && c70993Wm9.Bzm(AYr) <= i2) {
            String Bd2 = c70993Wm9.Bd2(AYr);
            TextPaint textPaint = this.A01;
            AbstractC167017dG.A1P(textPaint, Bd2);
            StaticLayout A00 = AbstractC70057W0r.A00(AbstractC70057W0r.A00, textPaint, Bd2, -1, i4);
            sparseArray.put(AYr, A00);
            int height = A00.getHeight();
            if (height <= i6) {
                sparseIntArray.put(AYr, i5);
                i6 -= height;
            } else if (AYr == i5) {
                sparseIntArray.put(AYr, i5);
                i5++;
                i6 = i3;
            } else {
                sparseIntArray.put(AYr, AYr);
                i6 = i3 - height;
                i5 = AYr;
            }
            AYr++;
        }
    }

    @Override // X.BEc
    public final int ApI() {
        return this.A01.getColor();
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        EnumC138556Pl enumC138556Pl = this.A09;
        return new C24025AlH(super.A08.A00, super.A01, null, enumC138556Pl, this.A01.getColor());
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return AbstractC111324zv.A00(2735);
    }

    @Override // X.BEc
    public final void ERe(int i) {
        this.A01.setColor(i);
        this.A04.setColor(i);
        invalidateSelf();
    }

    @Override // X.AbstractC210529Sr, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return super.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        this.A00 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
