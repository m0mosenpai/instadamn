package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;
import java.util.List;

/* loaded from: classes4.dex */
public final class ACO {
    public float A00;
    public final float A01;
    public final Paint A02;
    public final Paint A03;
    public final RectF A04;
    public final RectF A05;
    public final RectF A06;
    public final C8DD A07;
    public final boolean A08;
    public final int A09;
    public final int A0A;
    public final /* synthetic */ ColorPalette A0B;

    public ACO(C8DD c8dd, ColorPalette colorPalette, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, boolean z, boolean z2) {
        float width;
        RectF rectF;
        this.A0B = colorPalette;
        this.A08 = z;
        RectF rectF2 = new RectF(f, 0.0f, f2, f3);
        this.A04 = rectF2;
        RectF rectF3 = new RectF(f4, f5, f6, f7);
        this.A06 = rectF3;
        if (z2) {
            width = colorPalette.getContext().getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
        } else {
            width = rectF3.width() / 2.0f;
        }
        this.A01 = width;
        float f8 = colorPalette.A02 / 2.0f;
        rectF3.inset(f8, f8);
        Paint A0P = AbstractC166997dE.A0P();
        this.A02 = A0P;
        AbstractC166987dD.A1R(A0P);
        List list = c8dd.A02;
        if (list.isEmpty()) {
            A0P.setColor(c8dd.A00);
        } else {
            float f9 = (f5 + f7) / 2.0f;
            float f10 = (f4 + f6) / 2.0f;
            switch (O01.A00[c8dd.A01.ordinal()]) {
                case 1:
                    rectF = new RectF(f10, f5, f10, f7);
                    break;
                case 2:
                    rectF = new RectF(f6, f5, f4, f7);
                    break;
                case 3:
                    rectF = new RectF(f6, f9, f4, f9);
                    break;
                case 4:
                    rectF = new RectF(f6, f7, f4, f5);
                    break;
                case 5:
                    rectF = new RectF(f10, f7, f10, f5);
                    break;
                case 6:
                    rectF = new RectF(f4, f7, f4, f7);
                    break;
                case 7:
                    rectF = new RectF(f4, f9, f6, f9);
                    break;
                case 8:
                    rectF = new RectF(f4, f5, f6, f7);
                    break;
                default:
                    throw B4Z.A00();
            }
            A0P.setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, AbstractC001800i.A0x(list), (float[]) null, Shader.TileMode.REPEAT));
        }
        this.A07 = c8dd;
        this.A09 = i;
        this.A0A = i2;
        this.A05 = new RectF(rectF3);
        this.A00 = width;
        int i3 = c8dd.A00;
        float height = rectF2.height();
        int[] iArr = {ColorPalette.A0L, ColorPalette.A0M};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, 0.0f, 0.0f, height, iArr, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, rectF2.width(), 0.0f, new int[]{i, i3, i2}, (float[]) null, tileMode), PorterDuff.Mode.OVERLAY);
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setShader(composeShader);
        Bitmap A0F = AbstractC167007dF.A0F((int) rectF2.width(), (int) rectF2.height());
        new Canvas(A0F).drawRect(0.0f, 0.0f, rectF2.width(), rectF2.height(), A0R);
        BitmapShader bitmapShader = new BitmapShader(A0F, tileMode, Shader.TileMode.REPEAT);
        Matrix A0Q = AbstractC166987dD.A0Q();
        bitmapShader.getLocalMatrix(A0Q);
        A0Q.setTranslate(rectF2.left, 0.0f);
        bitmapShader.setLocalMatrix(A0Q);
        Paint A0R2 = AbstractC166987dD.A0R();
        this.A03 = A0R2;
        A0R2.setShader(bitmapShader);
    }

    public final int A00(float f, float f2) {
        float width;
        int i;
        if (this.A0B.A06 == C8DF.A03) {
            return this.A07.A00;
        }
        RectF rectF = this.A04;
        if (f < rectF.centerX()) {
            width = (f - rectF.left) / (rectF.width() / 2.0f);
            i = this.A09;
        } else {
            width = (rectF.right - f) / (rectF.width() / 2.0f);
            i = this.A0A;
        }
        int A00 = AbstractC22759A2d.A00(width, i, this.A07.A00);
        int A002 = AbstractC22759A2d.A00((f2 - rectF.top) / rectF.height(), ColorPalette.A0L, ColorPalette.A0M);
        int red = Color.red(A00);
        int green = Color.green(A00);
        int blue = Color.blue(A00);
        return Color.rgb(AbstractC13950nL.A09(Color.red(A002), red), AbstractC13950nL.A09(Color.green(A002), green), AbstractC13950nL.A09(Color.blue(A002), blue));
    }

    public final boolean A01(float f, float f2) {
        RectF rectF = this.A05;
        if (f >= rectF.left && f <= rectF.right && f2 >= rectF.top && f2 <= rectF.bottom) {
            return true;
        }
        return false;
    }
}
