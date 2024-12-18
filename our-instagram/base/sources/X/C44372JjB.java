package X;

import android.content.Context;
import android.graphics.Bitmap;
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
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.infocenter.model.ShareInfo;

/* renamed from: X.JjB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44372JjB extends Drawable implements Drawable.Callback, C1NJ, InterfaceC133125ze {
    public Bitmap A00;
    public Bitmap A01;
    public Bitmap A02;
    public final Runnable A03;
    public final String A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Path A0H;
    public final RectF A0I;
    public final RectF A0J;
    public final RectF A0K;
    public final Drawable A0L;
    public final C6RB A0M;
    public final C6RB A0N;
    public final String A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        C14360o3.A0B(canvas, 0);
        if (!this.A0Q || this.A01 != null) {
            if (!this.A0P || this.A00 != null) {
                boolean z = this.A0R;
                if (z && this.A02 == null) {
                    return;
                }
                canvas.save();
                int i2 = this.A08;
                int i3 = this.A09;
                canvas.translate(i2, i3);
                Path path = this.A0H;
                canvas.drawPath(path, this.A0G);
                canvas.clipPath(path);
                Bitmap bitmap = this.A00;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, this.A0I, this.A0F);
                } else {
                    canvas.drawPath(path, this.A0E);
                }
                int i4 = this.A0A;
                float f = i4;
                canvas.translate(f, f);
                Bitmap bitmap2 = this.A01;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, (Rect) null, this.A0J, this.A0F);
                }
                canvas.restore();
                canvas.save();
                Bitmap bitmap3 = this.A02;
                float f2 = i2 + i4;
                int i5 = (i3 + this.A05) - i4;
                if (bitmap3 != null) {
                    float f3 = (i5 - this.A0N.A06) - this.A0C;
                    RectF rectF = this.A0K;
                    canvas.translate(f2, f3 - rectF.height());
                    Bitmap bitmap4 = this.A02;
                    C14360o3.A0A(bitmap4);
                    canvas.drawBitmap(bitmap4, (Rect) null, rectF, this.A0F);
                } else {
                    C6RB c6rb = this.A0M;
                    canvas.translate(f2, i5 - c6rb.A06);
                    Drawable drawable = this.A0L;
                    C14360o3.A0A(drawable);
                    drawable.draw(canvas);
                    canvas.translate(this.A06 + this.A07, -this.A0B);
                    c6rb.draw(canvas);
                }
                canvas.restore();
                canvas.save();
                int i6 = 0;
                if (z) {
                    i = 0;
                } else {
                    i = this.A0M.A06;
                }
                int i7 = i5 - i;
                if (!z) {
                    i6 = this.A0C;
                }
                int i8 = i7 - i6;
                AbstractC167007dF.A0u(canvas, this.A0N, f2, i8 - r1.A06);
            }
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

    public C44372JjB(Context context, TargetViewSizeProvider targetViewSizeProvider, InfoCenterShareInfoIntf infoCenterShareInfoIntf) {
        Path A0T = AbstractC166987dD.A0T();
        this.A0H = A0T;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0E = A0S;
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A0G = A0S2;
        this.A0F = AbstractC166987dD.A0S(3);
        ShareInfo shareInfo = (ShareInfo) infoCenterShareInfoIntf;
        boolean A1W = AbstractC167007dF.A1W(shareInfo.A00);
        this.A0Q = A1W;
        RectF A0X = AbstractC166987dD.A0X();
        this.A0J = A0X;
        boolean A1W2 = AbstractC167007dF.A1W(shareInfo.A01);
        this.A0P = A1W2;
        RectF A0X2 = AbstractC166987dD.A0X();
        this.A0I = A0X2;
        boolean A1W3 = AbstractC167007dF.A1W(shareInfo.A02);
        this.A0R = A1W3;
        RectF A0X3 = AbstractC166987dD.A0X();
        this.A0K = A0X3;
        this.A04 = shareInfo.A06;
        this.A03 = new M03(this);
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        int width = interfaceC1812882f.getWidth();
        int height = interfaceC1812882f.getHeight() - AbstractC166987dD.A0C(context, 56);
        int i = (int) (width * 0.75f);
        this.A0D = i;
        float width2 = shareInfo.A01 != null ? r2.getWidth() / r2.getHeight() : 0.75f;
        float f = i;
        int i2 = (int) (f / width2);
        this.A05 = i2;
        this.A08 = (width - i) / 2;
        this.A09 = (height - i2) / 2;
        int A0C = AbstractC166987dD.A0C(context, 16);
        this.A0A = A0C;
        this.A0C = AbstractC166987dD.A0C(context, 8);
        int A0C2 = AbstractC166987dD.A0C(context, 12);
        this.A06 = A0C2;
        this.A07 = AbstractC166987dD.A0C(context, 4);
        this.A0B = AbstractC166987dD.A0C(context, 2);
        float f2 = i2;
        A0X2.set(0.0f, 0.0f, f, f2);
        if (A1W2) {
            C1OG A0J = C25821No.A00().A0J(shareInfo.A01, null);
            A0J.A08 = "background_image";
            A0J.A02(this);
            A0J.A01();
        }
        float A04 = AbstractC13880nE.A04(context, 12);
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        float[] fArr = {A04, A04, A04, A04};
        AbstractC167017dG.A1X(fArr, A04);
        A0T.addRoundRect(rectF, fArr, Path.Direction.CW);
        int intValue = shareInfo.A04.intValue();
        int[] iArr = {0, 0, 0, 1};
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    // fill-array-data instruction
                    iArr[0] = 0;
                    iArr[1] = 1;
                    iArr[2] = 1;
                    iArr[3] = 0;
                } else {
                    // fill-array-data instruction
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 1;
                    iArr[3] = 1;
                }
            } else {
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 0;
            }
        }
        if (shareInfo.A01 == null && infoCenterShareInfoIntf.Alw() == null) {
            AbstractC12120kG.A07("InfoCenterPreviewDrawable", "No card background provided! Need image url or gardient colors.", null);
        }
        if (infoCenterShareInfoIntf.Alw() != null) {
            float f3 = iArr[0] * i;
            float f4 = iArr[1] * i2;
            float f5 = iArr[2] * i;
            float f6 = iArr[3] * i2;
            int[] Alw = infoCenterShareInfoIntf.Alw();
            C14360o3.A0A(Alw);
            A0S.setShader(new LinearGradient(f3, f4, f5, f6, Alw, (float[]) null, Shader.TileMode.CLAMP));
        }
        float A042 = AbstractC13880nE.A04(context, 24);
        int color = context.getColor(R.color.black_20_transparent);
        A0S2.setColor(color);
        A0S2.setShadowLayer(A042, 0.0f, 0.0f, color);
        int argb = Color.argb(Math.round(38.25f), 0, 0, 0);
        int i3 = i - (A0C * 2);
        C6RB A0z = AbstractC166987dD.A0z(context, i3);
        this.A0N = A0z;
        AbstractC167027dH.A0c(context, A0z, 26);
        A0z.A0B(AbstractC13880nE.A03(context, 2.0f), 1.0f);
        A0z.A0J(Typeface.SANS_SERIF, 1);
        A0z.A0F(Color.parseColor(shareInfo.A09));
        A0z.A0D(10.0f, 0.0f, 0.0f, argb);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0z.A0K(alignment);
        A0z.A0G(3, "…");
        A0z.A0M(shareInfo.A0A);
        if (A1W3) {
            A0X3.set(0.0f, 0.0f, AbstractC43592JPx.A01(context, shareInfo.A02.getWidth()), AbstractC43592JPx.A01(context, shareInfo.A02.getHeight()));
            C1OG A0J2 = C25821No.A00().A0J(shareInfo.A02, null);
            A0J2.A08 = "logo_image";
            A0J2.A02(this);
            A0J2.A01();
        }
        Drawable drawable = context.getDrawable(R.drawable.ig_logo);
        this.A0L = drawable;
        C14360o3.A0A(drawable);
        drawable.setCallback(this);
        AbstractC166997dE.A1F(drawable, Color.parseColor(shareInfo.A09));
        drawable.setBounds(0, 0, A0C2, A0C2);
        Typeface A0R = AbstractC167017dG.A0R(context);
        C6RB A0z2 = AbstractC166987dD.A0z(context, i3);
        this.A0M = A0z2;
        AbstractC167027dH.A0c(context, A0z2, 14);
        A0z2.A0I(A0R);
        A0z2.A0F(Color.parseColor(shareInfo.A09));
        A0z2.A0D(10.0f, 0.0f, 0.0f, argb);
        A0z2.A0K(alignment);
        A0z2.A0M(shareInfo.A08);
        float A01 = AbstractC43592JPx.A01(context, 24);
        A0X.set(0.0f, 0.0f, A01, A01);
        if (A1W) {
            C1OG A0J3 = C25821No.A00().A0J(shareInfo.A00, null);
            A0J3.A08 = "icon_image";
            A0J3.A02(this);
            A0J3.A01();
        }
        this.A0O = "info_center_preview_sticker";
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0O;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0D;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0E.setAlpha(i);
        this.A0G.setAlpha(i);
        this.A0F.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0E.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        this.A0F.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        AbstractC167017dG.A1N(interfaceC59502nt, c73033Pe);
        Object C4x = interfaceC59502nt.C4x();
        if ("icon_image".equals(C4x)) {
            this.A01 = c73033Pe.A01;
        } else if ("background_image".equals(C4x)) {
            this.A00 = c73033Pe.A01;
        } else if (!"logo_image".equals(C4x)) {
            return;
        } else {
            this.A02 = c73033Pe.A01;
        }
        C11T.A02(this.A03);
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
