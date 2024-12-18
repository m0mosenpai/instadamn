package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.model.InfoCenterFactShareInfo;

/* renamed from: X.JjA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44371JjA extends Drawable implements Drawable.Callback, C1NJ, InterfaceC133125ze {
    public Bitmap A00;
    public Bitmap A01;
    public C6RB A02;
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
    public final int A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final Path A0I;
    public final RectF A0J;
    public final RectF A0K;
    public final C6RB A0L;
    public final C6RB A0M;
    public final C6RB A0N;
    public final String A0O;

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A01 != null && this.A00 != null) {
            canvas.save();
            canvas.translate(this.A0A, this.A0B);
            Path path = this.A0I;
            canvas.drawPath(path, this.A0H);
            canvas.drawPath(path, this.A0F);
            canvas.clipPath(path);
            canvas.save();
            float f = this.A0C;
            float f2 = this.A06;
            RectF rectF = this.A0J;
            canvas.translate(f, AbstractC25227BEk.A00(f2, rectF.height()));
            Bitmap bitmap = this.A00;
            C14360o3.A0A(bitmap);
            Paint paint = this.A0G;
            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(f + rectF.width() + this.A08, f);
            this.A0N.draw(canvas);
            canvas.translate(0.0f, r0.A06 + this.A07);
            this.A0M.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(0.0f, f2);
            Bitmap bitmap2 = this.A01;
            C14360o3.A0A(bitmap2);
            RectF rectF2 = this.A0K;
            canvas.drawBitmap(bitmap2, (Rect) null, rectF2, paint);
            canvas.translate(f, rectF2.height() + this.A0D);
            C6RB c6rb = this.A02;
            if (c6rb != null) {
                c6rb.draw(canvas);
                canvas.translate(0.0f, c6rb.A06 + this.A05);
            }
            this.A0L.draw(canvas);
            canvas.restore();
            canvas.restore();
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

    public C44371JjA(Context context, TargetViewSizeProvider targetViewSizeProvider, InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf) {
        Path A0T = AbstractC166987dD.A0T();
        this.A0I = A0T;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0F = A0S;
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A0H = A0S2;
        this.A0G = AbstractC166987dD.A0S(3);
        RectF A0X = AbstractC166987dD.A0X();
        this.A0K = A0X;
        RectF A0X2 = AbstractC166987dD.A0X();
        this.A0J = A0X2;
        InfoCenterFactShareInfo infoCenterFactShareInfo = (InfoCenterFactShareInfo) infoCenterFactShareInfoIntf;
        this.A04 = infoCenterFactShareInfo.A02;
        this.A0O = infoCenterFactShareInfo.A0A;
        this.A03 = new M02(this);
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        int width = interfaceC1812882f.getWidth();
        int height = interfaceC1812882f.getHeight() - AbstractC166987dD.A0C(context, 56);
        int i = (int) (width * 0.72f);
        this.A0E = i;
        this.A0A = (width - i) / 2;
        int A0C = AbstractC166987dD.A0C(context, 16);
        this.A0C = A0C;
        int A0C2 = AbstractC166987dD.A0C(context, 16);
        this.A08 = A0C2;
        int A0C3 = AbstractC166987dD.A0C(context, 16);
        this.A0D = A0C3;
        int A0C4 = AbstractC166987dD.A0C(context, 4);
        this.A07 = A0C4;
        int A0C5 = AbstractC166987dD.A0C(context, 4);
        this.A05 = A0C5;
        float A01 = AbstractC43592JPx.A01(context, infoCenterFactShareInfoIntf.BDE().getWidth());
        A0X2.set(0.0f, 0.0f, A01, AbstractC43592JPx.A01(context, infoCenterFactShareInfoIntf.BDE().getHeight()));
        C1OG A0J = C25821No.A00().A0J(infoCenterFactShareInfoIntf.BDE(), null);
        A0J.A08 = "logo_image";
        A0J.A02(this);
        A0J.A01();
        Typeface A0R = AbstractC167017dG.A0R(context);
        int i2 = i - (A0C * 2);
        int i3 = (i2 - ((int) A01)) - A0C2;
        C6RB A0z = AbstractC166987dD.A0z(context, i3);
        this.A0N = A0z;
        AbstractC167027dH.A0c(context, A0z, 14);
        A0z.A0I(A0R);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0z.A0K(alignment);
        A0z.A0G(1, "…");
        A0z.A0M(infoCenterFactShareInfo.A0G);
        AbstractC167017dG.A10(context, A0z, R.attr.igds_color_text_on_white);
        C6RB A0z2 = AbstractC166987dD.A0z(context, i3);
        this.A0M = A0z2;
        AbstractC167027dH.A0c(context, A0z2, 14);
        Typeface typeface = Typeface.SANS_SERIF;
        A0z2.A0J(typeface, 0);
        A0z2.A0K(alignment);
        A0z.A0G(1, "…");
        A0z2.A0M(infoCenterFactShareInfo.A0F);
        A0z2.A0F(AbstractC31174DnI.A03(context));
        float f = i;
        float height2 = (f * infoCenterFactShareInfoIntf.Alv().getHeight()) / infoCenterFactShareInfoIntf.Alv().getWidth();
        A0X.set(0.0f, 0.0f, f, height2);
        C1OG A0J2 = C25821No.A00().A0J(infoCenterFactShareInfoIntf.Alv(), null);
        A0J2.A08 = "preview_image";
        A0J2.A02(this);
        A0J2.A01();
        String str = infoCenterFactShareInfo.A0B;
        if (str != null && str.length() != 0) {
            C6RB A0z3 = AbstractC166987dD.A0z(context, i2);
            this.A02 = A0z3;
            AbstractC167027dH.A0c(context, A0z3, 12);
            A0z3.A0B(AbstractC13880nE.A03(context, 2.0f), 1.0f);
            A0z3.A0I(A0R);
            A0z3.A0K(alignment);
            A0z3.A0G(2, "…");
            A0z3.A0M(str);
            AbstractC167017dG.A10(context, A0z3, R.attr.igds_color_text_on_white);
        }
        C6RB A0z4 = AbstractC166987dD.A0z(context, i2);
        this.A0L = A0z4;
        AbstractC167027dH.A0c(context, A0z4, 12);
        A0z4.A0B(AbstractC13880nE.A03(context, 2.0f), 1.0f);
        A0z4.A0K(alignment);
        A0z4.A0J(typeface, 0);
        A0z4.A0G(this.A02 == null ? 3 : 1, "…");
        A0z4.A0M(infoCenterFactShareInfo.A07);
        AbstractC167017dG.A10(context, A0z4, R.attr.igds_color_text_on_white);
        int i4 = A0z.A06 + A0C + A0C4 + A0z2.A06 + A0C3;
        this.A06 = i4;
        C6RB c6rb = this.A02;
        int i5 = i4 + ((int) height2) + A0C + (c6rb != null ? c6rb.A06 + A0C5 : 0) + A0z4.A06 + A0C3;
        this.A09 = i5;
        this.A0B = (height - i5) / 2;
        float A04 = AbstractC13880nE.A04(context, 12);
        RectF rectF = new RectF(0.0f, 0.0f, f, i5);
        float[] fArr = {A04, A04, A04, A04};
        AbstractC167017dG.A1X(fArr, A04);
        A0T.addRoundRect(rectF, fArr, Path.Direction.CW);
        AbstractC43594JPz.A14(context, A0S, R.attr.igds_color_sticker_background);
        AbstractC166987dD.A1R(A0S);
        float A042 = AbstractC13880nE.A04(context, 24);
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_shadow_on_media);
        A0S2.setColor(A09);
        A0S2.setShadowLayer(A042, 0.0f, 0.0f, A09);
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0O;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0E;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0H.setAlpha(i);
        this.A0G.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0H.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        AbstractC167017dG.A1N(interfaceC59502nt, c73033Pe);
        Object C4x = interfaceC59502nt.C4x();
        if ("preview_image".equals(C4x)) {
            this.A01 = c73033Pe.A01;
        } else if (!"logo_image".equals(C4x)) {
            return;
        } else {
            this.A00 = c73033Pe.A01;
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
