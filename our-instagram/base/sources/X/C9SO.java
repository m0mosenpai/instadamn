package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.Choreographer;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;

/* renamed from: X.9SO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SO extends Drawable implements Choreographer.FrameCallback {
    public final Drawable A00;
    public final ChoreographerFrameCallbackC13290mF A01;
    public final C190868ci A02;
    public final C190868ci A03;
    public final C190868ci A04;
    public final TextColors A05;
    public final TextColors A06 = TextColors.A02;
    public final C6RB A07;

    public C9SO(Context context, UserSession userSession, int i, int i2, int i3, int i4) {
        TextColors textColors = new TextColors(TextShadow.A03, 0);
        this.A05 = textColors;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        this.A01 = new ChoreographerFrameCallbackC13290mF(this, 700L);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  GIF");
        Paint paint = C3LQ.A00;
        Drawable A05 = C3LQ.A05(context, R.drawable.instagram_search_outline_12, context.getColor(R.color.design_dark_default_color_on_background));
        this.A00 = A05;
        A05.setBounds(0, 0, dimensionPixelSize, AbstractC166987dD.A0A(AbstractC166987dD.A06(A05), dimensionPixelSize / A05.getIntrinsicWidth()));
        C85973sR c85973sR = new C85973sR(A05);
        c85973sR.A02 = C05F.A01;
        spannableStringBuilder.setSpan(c85973sR, 0, 1, 33);
        spannableStringBuilder.setSpan(new C209849Pv(context.getColor(R.color.sticker_subtle_light_background), i4, i3, false, i3, i3), 0, spannableStringBuilder.length(), 33);
        C190868ci c190868ci = new C190868ci(context, textColors);
        this.A03 = c190868ci;
        C190868ci c190868ci2 = new C190868ci(context, textColors);
        this.A04 = c190868ci2;
        C190868ci c190868ci3 = new C190868ci(context, textColors);
        this.A02 = c190868ci3;
        spannableStringBuilder.setSpan(c190868ci, 2, 3, 33);
        spannableStringBuilder.setSpan(c190868ci2, 3, 4, 33);
        spannableStringBuilder.setSpan(c190868ci3, 4, 5, 33);
        C6RB A0z = AbstractC166987dD.A0z(context, i);
        this.A07 = A0z;
        float f = i3;
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, A0z);
        AbstractC167007dF.A1A(A0z, i2, f, f);
        A0z.A0L(spannableStringBuilder);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C190868ci c190868ci;
        TextColors textColors;
        C190868ci c190868ci2;
        C14360o3.A0B(canvas, 0);
        int currentTimeMillis = (int) ((System.currentTimeMillis() / 700) % 4);
        if (currentTimeMillis != 0) {
            if (currentTimeMillis != 1) {
                if (currentTimeMillis != 2) {
                    if (currentTimeMillis == 3) {
                        c190868ci = this.A03;
                        textColors = this.A06;
                    }
                } else {
                    C190868ci c190868ci3 = this.A03;
                    TextColors textColors2 = this.A06;
                    c190868ci3.A00(textColors2);
                    this.A04.A00(textColors2);
                    this.A02.A00(this.A05);
                }
                this.A07.draw(canvas);
            }
            this.A03.A00(this.A06);
            c190868ci2 = this.A04;
            textColors = this.A05;
            c190868ci2.A00(textColors);
            this.A02.A00(textColors);
            this.A07.draw(canvas);
        }
        c190868ci = this.A03;
        textColors = this.A05;
        c190868ci.A00(textColors);
        c190868ci2 = this.A04;
        c190868ci2.A00(textColors);
        this.A02.A00(textColors);
        this.A07.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A07.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A07.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        ChoreographerFrameCallbackC13290mF choreographerFrameCallbackC13290mF = this.A01;
        if (z) {
            choreographerFrameCallbackC13290mF.A00();
        } else {
            choreographerFrameCallbackC13290mF.A01();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        invalidateSelf();
    }
}
