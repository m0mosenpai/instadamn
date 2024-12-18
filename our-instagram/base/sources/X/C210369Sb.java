package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.facebook.R;
import java.util.Locale;

/* renamed from: X.9Sb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210369Sb extends Drawable implements C5RQ {
    public float A00;
    public int A01;
    public int A02;
    public Integer A03;
    public int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final Context A0A;
    public final Resources A0B;
    public final Rect A0C;
    public final TextPaint A0D;
    public final AnonymousClass693 A0E;
    public final String A0F;
    public final String A0G;
    public final C09530e4 A0H;

    public C210369Sb(Context context, String str, int i, int i2, int i3, long j) {
        this.A0A = context;
        this.A0F = str;
        this.A07 = i;
        this.A06 = i2;
        this.A09 = j;
        this.A08 = i3;
        Resources resources = context.getResources();
        this.A0B = resources;
        int dimension = (int) resources.getDimension(R.dimen.album_preview_add_item_circle_size);
        this.A05 = dimension;
        int i4 = (i - dimension) / 2;
        int dimensionPixelSize = (((i2 - dimension) - resources.getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding)) - resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material)) / 2;
        int i5 = this.A05;
        Rect A0V = AbstractC166987dD.A0V(i4, dimensionPixelSize, i4 + i5, i5 + dimensionPixelSize);
        this.A0C = A0V;
        AnonymousClass693 A00 = C68U.A00(context, R.raw.clips_watermark);
        if (A00 != null) {
            A00.setBounds(A0V);
            A00.A01(255);
        } else {
            C0w9.A03("ClipsEndCardDrawable", "Failed to render clips end card when downloading video, because Keyframes drawable was null");
            A00 = null;
        }
        this.A0E = A00;
        this.A0G = AnonymousClass001.A0D(AbstractC166997dE.A10(Locale.ROOT, str), '@');
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAlpha(0);
        AbstractC166987dD.A1N(context, textPaint, R.color.audio_bar_action_color_enabled);
        textPaint.setShadowLayer(AbstractC166997dE.A0D(resources), 0.0f, 0.0f, AbstractC167007dF.A09(context, R.attr.igds_color_shadow_on_media));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AbstractC166987dD.A04(resources, R.dimen.abc_dialog_padding_top_material));
        textPaint.setTypeface(AbstractC167017dG.A0S(context));
        this.A0D = textPaint;
        this.A0H = AbstractC166987dD.A1L(Float.valueOf(i / 2), Float.valueOf(A0V.bottom + r7));
        this.A02 = (int) j;
        this.A03 = C05F.A00;
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        if (i > this.A09) {
            this.A04 = i;
            int i3 = i - this.A02;
            this.A01 = i3;
            if (i3 >= AbstractC225789xx.A00(this.A03)) {
                this.A03 = C05F.A00(5)[(this.A03.intValue() + 1) % C05F.A00(5).length];
                this.A02 = i;
                this.A01 = 0;
            }
            this.A00 = AbstractC13600mm.A00(this.A01 / AbstractC225789xx.A00(this.A03), 0.0f, 1.0f);
            invalidateSelf();
        }
    }

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        float f;
        C14360o3.A0B(canvas, 0);
        AnonymousClass693 anonymousClass693 = this.A0E;
        if (anonymousClass693 != null) {
            Matrix A0Q = AbstractC166987dD.A0Q();
            int intValue = this.A03.intValue();
            float f2 = 1.1f;
            if (intValue != 0) {
                if (intValue != 1) {
                    f2 = 0.85f;
                    if (intValue != 2) {
                        if (intValue != 3) {
                            i = C1H4.A01(248.0f);
                        }
                    } else {
                        i = C1H4.A01(248.0f);
                        f = ((0.85f - 1.0f) * this.A00) + 1.0f;
                        A0Q.setScale(f, f, this.A07 / 2.0f, this.A06 / 2.0f);
                        canvas.setMatrix(A0Q);
                    }
                }
                i = C1H4.A01(248.0f);
                f = f2 + ((1.0f - f2) * this.A00);
                A0Q.setScale(f, f, this.A07 / 2.0f, this.A06 / 2.0f);
                canvas.setMatrix(A0Q);
            } else {
                float f3 = 1.0f + ((1.1f - 1.0f) * this.A00);
                A0Q.setScale(f3, f3, this.A07 / 2.0f, this.A06 / 2.0f);
                canvas.setMatrix(A0Q);
                i = 0;
            }
            canvas.drawARGB(192, 0, 0, 0);
            TextPaint textPaint = this.A0D;
            textPaint.setAlpha(i);
            anonymousClass693.EMk(((float) ((this.A04 - this.A09) + 370)) / this.A08);
            anonymousClass693.draw(canvas);
            if (this.A03 != C05F.A00) {
                C09530e4 c09530e4 = this.A0H;
                canvas.drawText(this.A0G, AbstractC166987dD.A09(c09530e4.A00), AbstractC166987dD.A09(c09530e4.A01), textPaint);
            }
        }
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return -1;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        String str = this.A0F;
        int i = this.A07;
        int i2 = this.A06;
        long j = this.A09;
        int i3 = this.A08;
        C14360o3.A0B(str, 1);
        Al4 al4 = new Al4();
        al4.A05 = str;
        al4.A04 = null;
        al4.A01 = i;
        al4.A00 = i2;
        al4.A03 = j;
        al4.A02 = i3;
        return al4;
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
    public final int getOpacity() {
        AnonymousClass693 anonymousClass693 = this.A0E;
        if (anonymousClass693 != null) {
            return anonymousClass693.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AnonymousClass693 anonymousClass693 = this.A0E;
        if (anonymousClass693 != null) {
            anonymousClass693.A01(i);
        }
        this.A0D.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
