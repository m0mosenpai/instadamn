package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9SJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SJ extends Drawable implements Drawable.Callback, InterfaceC133125ze {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final Paint A0A;
    public final Path A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final C6RB A0E;
    public final C6RB A0F;
    public final String A0G;

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

    public C9SJ(Context context, TargetViewSizeProvider targetViewSizeProvider) {
        Path A0T = AbstractC166987dD.A0T();
        this.A0B = A0T;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A09 = A0S;
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A0A = A0S2;
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        int width = interfaceC1812882f.getWidth();
        int height = interfaceC1812882f.getHeight() - AbstractC166987dD.A0C(context, 56);
        int i = (int) (width * 0.75f);
        this.A08 = i;
        float f = i;
        int i2 = (int) (f / 0.75f);
        this.A00 = i2;
        this.A03 = (width - i) / 2;
        this.A04 = (height - i2) / 2;
        int A0C = AbstractC166987dD.A0C(context, 16);
        this.A05 = A0C;
        this.A07 = AbstractC166987dD.A0C(context, 8);
        int A0C2 = AbstractC166987dD.A0C(context, 12);
        this.A01 = A0C2;
        this.A02 = AbstractC166987dD.A0C(context, 4);
        this.A06 = AbstractC166987dD.A0C(context, 2);
        float A04 = AbstractC13880nE.A04(context, 12);
        int argb = Color.argb(Math.round(38.25f), 0, 0, 0);
        float f2 = i2;
        RectF A0Y = AbstractC166987dD.A0Y(f, f2);
        float[] fArr = {A04, A04, A04, A04};
        AbstractC167017dG.A1X(fArr, A04);
        A0T.addRoundRect(A0Y, fArr, Path.Direction.CW);
        A0S.setShader(new LinearGradient(0.0f, f2, f, 0.0f, new int[]{context.getColor(R.color.voting_info_center_background_start), context.getColor(R.color.voting_info_center_background_center), context.getColor(R.color.voting_info_sticker_gradient_end)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        float A042 = AbstractC13880nE.A04(context, 16);
        int color = context.getColor(R.color.black_30_transparent);
        A0S2.setColor(color);
        A0S2.setShadowLayer(A042, 0.0f, 0.0f, color);
        Drawable drawable = context.getDrawable(R.drawable.instagram_election_pin_filled_24);
        this.A0D = drawable;
        C14360o3.A0A(drawable);
        drawable.setCallback(this);
        AbstractC167017dG.A14(drawable);
        AbstractC166997dE.A1F(drawable, context.getColor(R.color.design_dark_default_color_on_background));
        int i3 = i - (A0C * 2);
        C6RB A0z = AbstractC166987dD.A0z(context, i3);
        this.A0F = A0z;
        AbstractC167027dH.A0c(context, A0z, 26);
        A0z.A0B(AbstractC13880nE.A03(context, 2.0f), 1.0f);
        A0z.A0J(Typeface.SANS_SERIF, 1);
        A0z.A0F(-1);
        A0z.A0D(10.0f, 0.0f, 0.0f, argb);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0z.A0K(alignment);
        A0z.A0G(3, "…");
        AbstractC166997dE.A1C(context.getResources(), A0z, 2131976950);
        Drawable drawable2 = context.getDrawable(R.drawable.ig_logo);
        this.A0C = drawable2;
        C14360o3.A0A(drawable2);
        drawable2.setCallback(this);
        AbstractC166997dE.A1F(drawable2, context.getColor(R.color.design_dark_default_color_on_background));
        drawable2.setBounds(0, 0, A0C2, A0C2);
        Typeface A0R = AbstractC167017dG.A0R(context);
        C6RB A0z2 = AbstractC166987dD.A0z(context, i3);
        this.A0E = A0z2;
        AbstractC167027dH.A0c(context, A0z2, 14);
        A0z2.A0I(A0R);
        A0z2.A0F(-1);
        A0z2.A0D(10.0f, 0.0f, 0.0f, argb);
        A0z2.A0K(alignment);
        AbstractC166997dE.A1C(context.getResources(), A0z2, 2131976949);
        this.A0G = "voting_info_center_preview_sticker";
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0G;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        int i = this.A03;
        int i2 = this.A04;
        canvas.translate(i, i2);
        Path path = this.A0B;
        canvas.drawPath(path, this.A0A);
        canvas.drawPath(path, this.A09);
        int i3 = this.A05;
        float f = i3;
        canvas.translate(f, f);
        Drawable drawable = this.A0D;
        C14360o3.A0A(drawable);
        AbstractC167007dF.A0t(canvas, drawable);
        float f2 = i + i3;
        int i4 = (i2 + this.A00) - i3;
        int i5 = this.A01;
        canvas.translate(f2, i4 - i5);
        Drawable drawable2 = this.A0C;
        C14360o3.A0A(drawable2);
        drawable2.draw(canvas);
        canvas.translate(i5 + this.A02, -this.A06);
        C6RB c6rb = this.A0E;
        AbstractC167007dF.A0t(canvas, c6rb);
        int i6 = (i4 - c6rb.A06) - this.A07;
        AbstractC167007dF.A0u(canvas, this.A0F, f2, i6 - r1.A06);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
