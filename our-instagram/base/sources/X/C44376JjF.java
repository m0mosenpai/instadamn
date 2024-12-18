package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.JjF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44376JjF extends Drawable implements C1NJ {
    public long A00;
    public Bitmap A01;
    public MOK A02;
    public C1342364l A03;
    public boolean A04;
    public boolean A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public long A0N;
    public BitmapShader A0O;
    public Matrix A0P;
    public Paint A0Q;
    public Paint A0R;
    public ImageUrl A0S;
    public String A0T;
    public final Paint A0U;
    public final Paint A0V;
    public final float A0W;
    public final float A0X;
    public final float A0Y;
    public final float A0Z;
    public final float A0a;
    public final float A0b;
    public final long A0c;
    public final Context A0d;
    public final Paint A0e;
    public final Paint A0f;
    public final Paint A0g;
    public final Paint A0h;
    public final Rect A0i;
    public final Rect A0j;
    public final RectF A0k;
    public final List A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;

    public C44376JjF(Context context, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        float f6;
        this.A0l = AbstractC166987dD.A1E();
        this.A06 = 0.5f;
        this.A07 = 0.5f;
        this.A09 = Float.MAX_VALUE;
        this.A0I = 1;
        this.A05 = true;
        this.A0H = 255;
        this.A0d = context;
        this.A08 = f3;
        this.A0m = z4;
        this.A0X = AbstractC13880nE.A04(context, 0);
        if (z) {
            f6 = AbstractC13880nE.A04(context, 3);
        } else {
            f6 = 0.0f;
        }
        this.A0Z = f6;
        this.A0a = z ? AbstractC13880nE.A04(context, 2) : 0.0f;
        this.A0b = f;
        this.A0W = f2;
        this.A0n = z2;
        this.A0o = z3;
        this.A0k = AbstractC166987dD.A0X();
        this.A0i = AbstractC166987dD.A0U();
        this.A0j = AbstractC166987dD.A0U();
        this.A0P = AbstractC166987dD.A0Q();
        this.A0B = Color.argb(AbstractC166987dD.A0A(f5, 255.0f), 0, 0, 0);
        this.A0M = Color.argb(AbstractC166987dD.A0A(255.0f, f4), 0, 0, 0);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0R = A0S;
        A0S.setColor(i);
        Paint paint = this.A0R;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.A0R.setStrokeWidth(f6);
        this.A0K = i2;
        this.A0e = AbstractC166987dD.A0S(3);
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A0U = A0S2;
        A0S2.setColor(i3);
        Paint A0S3 = AbstractC166987dD.A0S(1);
        this.A0V = A0S3;
        A0S3.setColor(0);
        A0S3.setStrokeWidth(AbstractC13880nE.A04(context, 2));
        A0S3.setStyle(style);
        this.A0f = AbstractC166987dD.A0S(5);
        this.A0h = AbstractC166987dD.A0S(5);
        Paint A0S4 = AbstractC166987dD.A0S(1);
        this.A0g = A0S4;
        A0S4.setStyle(style);
        float A04 = AbstractC13880nE.A04(context, 1);
        this.A0Y = A04;
        A0S4.setStrokeWidth(A04);
        A0S4.setColor(Color.argb(Math.round(25.5f), 255, 255, 255));
        this.A0Q = AbstractC166987dD.A0R();
        this.A0c = j;
    }

    public C44376JjF(Context context, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3, boolean z, boolean z2) {
        this(context, f4, f, f3, f5, f2, i2, i3, i, 300L, z2, z, true, false);
    }

    public final void A01() {
        this.A0S = null;
        this.A01 = null;
        this.A0O = null;
        this.A0e.setShader(null);
    }

    public final void A02(ImageUrl imageUrl, String str) {
        String str2;
        if (imageUrl != null) {
            str2 = imageUrl.getUrl();
        } else {
            str2 = null;
        }
        ImageUrl imageUrl2 = this.A0S;
        if (!AbstractC50102Ry.A00(str2, imageUrl2 != null ? imageUrl2.getUrl() : null)) {
            A01();
            this.A0S = imageUrl;
            imageUrl.getClass();
            this.A0T = imageUrl.getUrl();
            this.A00 = System.currentTimeMillis();
            ImageUrl imageUrl3 = this.A0S;
            if (imageUrl3 != null) {
                C1OG A0J = C25821No.A00().A0J(imageUrl3, str);
                A0J.A01 = this.A0I;
                A0J.A02(this);
                A0J.A08 = this.A0T;
                A0J.A01();
            }
            invalidateSelf();
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public static void A00(Bitmap bitmap, C44376JjF c44376JjF) {
        c44376JjF.A01 = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        c44376JjF.A0O = bitmapShader;
        c44376JjF.A0e.setShader(bitmapShader);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - c44376JjF.A00 < 1) {
            currentTimeMillis = -2;
        }
        c44376JjF.A0N = currentTimeMillis;
        MOK mok = c44376JjF.A02;
        if (mok != null) {
            mok.Cze(c44376JjF.A01, c44376JjF);
        }
        c44376JjF.invalidateSelf();
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        if (this.A0S != null && AbstractC50102Ry.A00(interfaceC59502nt.C4x(), this.A0T)) {
            Bitmap bitmap = c73033Pe.A01;
            bitmap.getClass();
            A00(bitmap, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44376JjF.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float f = rect.left;
        float f2 = this.A0X;
        int round = Math.round(f + f2);
        this.A0G = round;
        int round2 = Math.round(rect.top + f2);
        this.A0L = round2;
        int round3 = Math.round(rect.right - f2);
        this.A0J = round3;
        int round4 = Math.round(rect.bottom - f2);
        this.A0A = round4;
        float f3 = round;
        float f4 = this.A0a;
        int i = (int) (f3 + f4);
        this.A0D = i;
        int i2 = (int) (round2 + f4);
        this.A0E = i2;
        int round5 = Math.round(round3 - f4);
        int round6 = Math.round(round4 - f4);
        this.A0F = round5 - i;
        int i3 = round6 - i2;
        this.A0C = i3;
        if (this.A0m) {
            this.A08 = AbstractC166987dD.A02(i3);
        }
        float f5 = round6;
        float f6 = f5 - (i3 * this.A0W);
        int i4 = this.A0B;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A0f.setShader(new LinearGradient(0.0f, f5, 0.0f, f6, i4, 0, tileMode));
        float f7 = this.A0E;
        this.A0h.setShader(new LinearGradient(0.0f, f7, 0.0f, f7 + (this.A0C * this.A0b), this.A0M, 0, tileMode));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0H = i;
        this.A0e.setAlpha(i);
        this.A0R.setAlpha(i);
        this.A0h.setAlpha(i);
        this.A0f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0e.setColorFilter(colorFilter);
        this.A0R.setColorFilter(colorFilter);
        this.A0g.setColorFilter(colorFilter);
        this.A0h.setColorFilter(colorFilter);
        this.A0f.setColorFilter(colorFilter);
    }
}
