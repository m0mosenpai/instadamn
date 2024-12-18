package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;

/* renamed from: X.9Sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210459Sk extends Drawable implements C5RR, InterfaceC202998yH {
    public int A00;
    public int A01;
    public final Bitmap A02;
    public final SharePlatformStickerClientModel A03;
    public final EnumC222859sQ A04;
    public final String A05;
    public final Paint A06;
    public final RectF A07;

    public C210459Sk(SharePlatformStickerClientModel sharePlatformStickerClientModel) {
        C14360o3.A0B(sharePlatformStickerClientModel, 1);
        this.A03 = sharePlatformStickerClientModel;
        Bitmap A0G = C1NC.A0G(sharePlatformStickerClientModel.A0A, sharePlatformStickerClientModel.A03, sharePlatformStickerClientModel.A02, sharePlatformStickerClientModel.A06, sharePlatformStickerClientModel.A05, sharePlatformStickerClientModel.A04, false);
        this.A02 = A0G;
        this.A04 = sharePlatformStickerClientModel.A08;
        this.A05 = sharePlatformStickerClientModel.A0A;
        Paint A0Q = AbstractC166997dE.A0Q();
        this.A06 = A0Q;
        if (A0G != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            A0Q.setShader(new BitmapShader(A0G, tileMode, tileMode));
            this.A01 = A0G.getWidth();
            this.A00 = A0G.getHeight();
        }
        this.A07 = AbstractC166987dD.A0Y(this.A01, this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A03;
    }

    @Override // X.InterfaceC202998yH
    public final void DtF(int i, int i2) {
        SharePlatformStickerClientModel sharePlatformStickerClientModel = this.A03;
        sharePlatformStickerClientModel.A01 = i;
        sharePlatformStickerClientModel.A00 = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        AbstractC167017dG.A12(canvas, this);
        canvas.drawRect(this.A07, this.A06);
        canvas.restore();
    }
}
