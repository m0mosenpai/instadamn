package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.facebook.R;
import java.util.Locale;

/* renamed from: X.9Sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210469Sl extends Drawable implements C5RR, BBE {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Context A05;
    public final Resources A06;
    public final Rect A07;
    public final TextPaint A08;
    public final AnonymousClass693 A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final C09530e4 A0D;

    public C210469Sl(Context context, Integer num, String str, int i, int i2, int i3, long j) {
        this.A05 = context;
        this.A0B = str;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = j;
        this.A03 = i3;
        this.A0A = num;
        Resources resources = context.getResources();
        this.A06 = resources;
        int dimension = (int) resources.getDimension(R.dimen.album_preview_add_item_circle_size);
        this.A00 = dimension;
        int i4 = (i - dimension) / 2;
        int dimensionPixelSize = (((i2 - dimension) - resources.getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding)) - resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material)) / 2;
        int i5 = this.A00;
        Rect A0V = AbstractC166987dD.A0V(i4, dimensionPixelSize, i4 + i5, i5 + dimensionPixelSize);
        this.A07 = A0V;
        AnonymousClass693 A00 = C68U.A00(context, R.raw.clips_watermark);
        if (A00 != null) {
            A00.setBounds(A0V);
            A00.A01(255);
        } else {
            C0w9.A03("ClipsEndCardDrawable", "Failed to render clips end card when downloading video, because Keyframes drawable was null");
            A00 = null;
        }
        this.A09 = A00;
        this.A0C = AnonymousClass001.A0D(AbstractC166997dE.A10(Locale.ROOT, str), '@');
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAlpha(0);
        AbstractC166987dD.A1N(context, textPaint, R.color.audio_bar_action_color_enabled);
        textPaint.setShadowLayer(AbstractC166997dE.A0D(resources), 0.0f, 0.0f, AbstractC167007dF.A09(context, R.attr.igds_color_shadow_on_media));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AbstractC166987dD.A04(resources, R.dimen.abc_dialog_padding_top_material));
        textPaint.setTypeface(AbstractC167017dG.A0S(context));
        this.A08 = textPaint;
        this.A0D = AbstractC166987dD.A1L(Float.valueOf(i / 2), Float.valueOf(A0V.bottom + r7));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        AnonymousClass693 anonymousClass693 = this.A09;
        if (anonymousClass693 != null) {
            if (this.A0A == C05F.A00) {
                canvas.drawARGB(192, 0, 0, 0);
            }
            anonymousClass693.EMk(0.75f);
            anonymousClass693.draw(canvas);
            TextPaint textPaint = this.A08;
            textPaint.setAlpha(C1H4.A01(248.0f));
            C09530e4 c09530e4 = this.A0D;
            canvas.drawText(this.A0C, AbstractC166987dD.A09(c09530e4.A00), AbstractC166987dD.A09(c09530e4.A01), textPaint);
        }
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        String str = this.A0B;
        int i = this.A02;
        int i2 = this.A01;
        long j = this.A04;
        int i3 = this.A03;
        Integer num = this.A0A;
        AbstractC167007dF.A1H(str, 1, num);
        Al5 al5 = new Al5();
        al5.A06 = str;
        al5.A05 = null;
        al5.A01 = i;
        al5.A00 = i2;
        al5.A03 = j;
        al5.A02 = i3;
        al5.A04 = num;
        return al5;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        AnonymousClass693 anonymousClass693 = this.A09;
        if (anonymousClass693 != null) {
            return anonymousClass693.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AnonymousClass693 anonymousClass693 = this.A09;
        if (anonymousClass693 != null) {
            anonymousClass693.A01(i);
        }
        this.A08.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
