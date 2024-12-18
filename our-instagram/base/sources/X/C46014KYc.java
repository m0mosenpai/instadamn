package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KYc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46014KYc extends AbstractC44340Jif implements C1NJ, InterfaceC50406MNi {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public Bitmap A08;
    public Bitmap A09;
    public BitmapShader A0A;
    public ImageUrl A0B;
    public AbstractC44340Jif A0C;
    public Integer A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public final float A0H;
    public final int A0I;
    public final int A0J;
    public final Context A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Path A0N;
    public final Rect A0O;
    public final RectF A0P;
    public final AccelerateDecelerateInterpolator A0Q;
    public final GradientSpinner A0R;
    public final boolean A0S;
    public final float A0T;
    public final float A0U;
    public final Matrix A0V;
    public final Paint A0W;
    public final Paint A0X;
    public final RectF A0Y;
    public final RectF A0Z;
    public final List A0a;
    public final boolean A0b;
    public final boolean A0c;

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public static float A00(Context context, float f) {
        return (f / 1.0f) + Math.round(AbstractC13880nE.A00(context, AbstractC66077TzE.A00.height())) + (AbstractC13880nE.A00(context, 1.5f) * 2.0f) + (AbstractC13880nE.A04(context, 8) * 2.0f);
    }

    public static void A01(C46014KYc c46014KYc) {
        int i;
        float f = c46014KYc.A03;
        float f2 = c46014KYc.A0H * 2.0f;
        float f3 = f - f2;
        if (c46014KYc.A0F) {
            i = Math.round(AbstractC13880nE.A00(c46014KYc.A0K, AbstractC66077TzE.A00.height()));
        } else {
            i = 0;
        }
        c46014KYc.A0G = i;
        float f4 = c46014KYc.A0U * 2.0f;
        float f5 = ((f3 - f4) / c46014KYc.A0T) + i + f4 + f2;
        c46014KYc.A00 = f5;
        c46014KYc.setBounds(0, 0, Math.round(c46014KYc.A03), Math.round(f5));
        c46014KYc.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float A00;
        float f;
        int i;
        float A01;
        int i2;
        if (this.A08 != null) {
            Paint paint = this.A0X;
            paint.setColor(-1);
            Paint paint2 = this.A0W;
            paint2.setColor(-1);
            Paint paint3 = this.A0L;
            paint3.setColor(-1);
            long j = this.A05;
            if (j == 0) {
                A00 = 0.0f;
            } else {
                long min = Math.min(System.currentTimeMillis() - this.A07, j);
                if (min >= j) {
                    this.A07 = -1L;
                }
                A00 = AbstractC13600mm.A00(this.A0Q.getInterpolation(((float) min) / ((float) j)), 0.0f, 1.0f);
            }
            Rect bounds = getBounds();
            int A02 = A02();
            paint.setAlpha(A02);
            paint2.setAlpha(A02);
            paint3.setAlpha(A02);
            GradientSpinner gradientSpinner = this.A0R;
            if (A02 < 255) {
                gradientSpinner.A05 = A02;
            } else {
                gradientSpinner.A05 = -1;
            }
            RectF rectF = this.A0P;
            float width = rectF.width();
            float height = rectF.height();
            float max = Math.max(width / this.A08.getWidth(), height / this.A08.getHeight());
            Matrix matrix = this.A0V;
            matrix.setScale(max, max);
            matrix.postTranslate((width - (this.A08.getWidth() * max)) / 2.0f, (height - (this.A08.getHeight() * max)) / 2.0f);
            BitmapShader bitmapShader = this.A0A;
            bitmapShader.getClass();
            bitmapShader.setLocalMatrix(matrix);
            Rect bounds2 = getBounds();
            if (this.A09 == null) {
                Bitmap createBitmap = Bitmap.createBitmap(bounds2.width(), bounds2.height(), Bitmap.Config.ARGB_8888);
                this.A09 = createBitmap;
                AbstractC43592JPx.A06(createBitmap).drawPath(this.A0N, this.A0M);
            }
            float width2 = bounds.width();
            float f2 = this.A0H * 2.0f;
            this.A09.getClass();
            float width3 = (width2 - f2) / (r1.getWidth() - f2);
            canvas.save();
            canvas.scale(width3, width3, rectF.left, rectF.top);
            Bitmap bitmap = this.A09;
            bitmap.getClass();
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            canvas.restore();
            canvas.drawPath(this.A0N, paint);
            canvas.save();
            float f3 = rectF.left;
            float f4 = rectF.top;
            rectF.offsetTo(0.0f, 0.0f);
            canvas.translate(f3, f4);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint2);
            if (this.A0F) {
                AbstractC66077TzE.A00(canvas, this.A0Z, -1);
            }
            float width4 = rectF.width() / 2.0f;
            float f5 = this.A0U;
            float f6 = width4 - (f5 * 1.0f);
            if (this.A0b && !this.A0S) {
                canvas.save();
                canvas.translate(f5, f5);
                gradientSpinner.draw(canvas);
                canvas.restore();
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), ((rectF.width() / 2.0f) - (f5 * 2.5f)) - gradientSpinner.A00, paint3);
            } else {
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), f6, paint3);
            }
            if (this.A0c) {
                AbstractC44340Jif abstractC44340Jif = this.A0C;
                if (abstractC44340Jif == null) {
                    abstractC44340Jif = new C46012KYa(this.A0K);
                    this.A0C = abstractC44340Jif;
                }
                abstractC44340Jif.getClass();
                float centerX = rectF.centerX();
                double radians = Math.toRadians(45.0d);
                float round = centerX + ((float) Math.round((Math.cos(radians) * rectF.width()) / 2.0d));
                float centerY = rectF.centerY() - ((float) Math.round((Math.sin(radians) * rectF.width()) / 2.0d));
                Integer num = this.A0D;
                Integer num2 = C05F.A00;
                if (A00 == 0.0f) {
                    if (num == num2) {
                        i2 = this.A0I;
                    } else {
                        i2 = this.A0J;
                    }
                    A01 = i2;
                } else {
                    if (num == num2) {
                        f = this.A0J;
                        i = this.A0I;
                    } else {
                        f = this.A0I;
                        i = this.A0J;
                    }
                    A01 = AbstractC13600mm.A01(A00, 0.0f, 1.0f, f, i);
                }
                Rect rect = this.A0O;
                float f7 = A01 / 2.0f;
                rect.set(Math.round(round - f7), Math.round(centerY - f7), Math.round(round + f7), Math.round(centerY + f7));
                abstractC44340Jif.setBounds(rect);
                abstractC44340Jif.draw(canvas);
            }
            rectF.offsetTo(f3, f4);
            canvas.restore();
            if (A02() < 255) {
                invalidateSelf();
            }
            if (this.A05 != 0 && this.A07 != -1) {
                this.A03 = AbstractC13600mm.A01(A00, 0.0f, 1.0f, this.A01, this.A02);
                A01(this);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.round(this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.round(this.A03);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        RectF rectF = this.A0Y;
        rectF.set(rect);
        float f = this.A0H;
        rectF.inset(f, f);
        RectF rectF2 = this.A0P;
        rectF2.set(rectF);
        rectF2.bottom -= this.A0G;
        rectF2.set(rectF2);
        RectF rectF3 = AbstractC66077TzE.A00;
        float width = rectF3.width() * 3.0f;
        float width2 = (rectF2.width() / 2.0f) - (width / 2.0f);
        float height = rectF2.height();
        this.A0Z.set(width2, height, width + width2, (rectF3.height() * 3.0f) + height);
        Path path = this.A0N;
        path.reset();
        path.addCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, Path.Direction.CW);
        GradientSpinner gradientSpinner = this.A0R;
        float width3 = rectF2.width();
        float f2 = this.A0U;
        float f3 = f2 * 2.0f;
        gradientSpinner.measure(View.MeasureSpec.makeMeasureSpec(Math.round(width3 - f3), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(Math.round(rectF2.height() - f3), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        int round = Math.round(f2);
        gradientSpinner.layout(round, round, Math.round(rectF2.width() - f2), Math.round(rectF2.height() - f2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A04 = i;
        this.A0L.setAlpha(i);
        this.A0X.setAlpha(i);
        this.A0W.setAlpha(i);
        this.A0R.A05 = i;
        AbstractC44340Jif abstractC44340Jif = this.A0C;
        if (abstractC44340Jif != null) {
            abstractC44340Jif.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // X.AbstractC44340Jif, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0L.setColorFilter(colorFilter);
        this.A0X.setColorFilter(colorFilter);
    }

    public C46014KYc(Context context, Drawable drawable, ImageUrl imageUrl, String str, float f, int i, boolean z, boolean z2, boolean z3) {
        super(context);
        this.A0Q = new AccelerateDecelerateInterpolator();
        this.A0a = AbstractC166987dD.A1E();
        this.A0Z = AbstractC166987dD.A0X();
        this.A07 = -1L;
        this.A06 = -1L;
        this.A05 = 0L;
        this.A04 = 255;
        this.A0E = true;
        this.A0F = true;
        this.A0D = C05F.A01;
        this.A0K = context;
        this.A0Y = AbstractC166987dD.A0X();
        this.A0P = AbstractC166987dD.A0X();
        this.A0O = AbstractC166987dD.A0U();
        this.A0T = f;
        this.A0J = AbstractC43592JPx.A01(context, 20);
        this.A0I = AbstractC43592JPx.A01(context, 28);
        this.A0b = z;
        this.A0S = z2;
        this.A0c = z3;
        this.A0G = Math.round(AbstractC13880nE.A00(context, AbstractC66077TzE.A00.height()));
        float A00 = AbstractC13880nE.A00(context, 1.5f);
        this.A0U = A00;
        float A04 = AbstractC13880nE.A04(context, 8);
        this.A0H = A04;
        this.A0V = AbstractC166987dD.A0Q();
        float f2 = i;
        float f3 = A04 * 2.0f;
        float f4 = f3 + f2;
        this.A03 = f4;
        this.A02 = f4;
        float f5 = 2.0f * A00;
        this.A00 = ((f2 - f5) / f) + this.A0G + f5 + f3;
        Path A0T = AbstractC166987dD.A0T();
        this.A0N = A0T;
        A0T.setFillType(Path.FillType.WINDING);
        Paint A0S = AbstractC166987dD.A0S(3);
        this.A0L = A0S;
        Paint.Style style = Paint.Style.FILL;
        A0S.setStyle(style);
        AbstractC166987dD.A1N(context, A0S, R.color.grey_1);
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A0X = A0S2;
        A0S2.setStyle(style);
        AbstractC43594JPz.A14(context, A0S2, R.attr.igds_color_separator_or_stroke_on_media);
        Paint A0S3 = AbstractC166987dD.A0S(3);
        this.A0W = A0S3;
        A0S3.setStrokeWidth(A00);
        AbstractC43594JPz.A14(context, A0S3, R.attr.igds_color_separator_or_stroke_on_media);
        AbstractC43592JPx.A1E(A0S3);
        int color = context.getColor(R.color.black_20_transparent);
        Paint A0S4 = AbstractC166987dD.A0S(1);
        this.A0M = A0S4;
        A0S4.setColor(color);
        AbstractC166987dD.A1R(A0S4);
        A0S4.setShadowLayer(A04, 0.0f, 0.0f, color);
        GradientSpinner gradientSpinner = new GradientSpinner(context);
        this.A0R = gradientSpinner;
        gradientSpinner.setInactiveStrokeWidth(gradientSpinner.A00);
        gradientSpinner.setInvalidateListener(this);
        if (drawable != null) {
            this.A06 = System.currentTimeMillis();
            if (drawable instanceof BitmapDrawable) {
                this.A08 = ((BitmapDrawable) drawable).getBitmap();
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                this.A08 = createBitmap;
                Canvas A06 = AbstractC43592JPx.A06(createBitmap);
                drawable.setBounds(0, 0, A06.getWidth(), A06.getHeight());
                drawable.draw(A06);
            }
            Bitmap bitmap = this.A08;
            bitmap.getClass();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.A0A = bitmapShader;
            this.A0L.setShader(bitmapShader);
            invalidateSelf();
            return;
        }
        if (AbstractC50102Ry.A00(this.A0B, imageUrl)) {
            return;
        }
        this.A0B = imageUrl;
        if (imageUrl == null) {
            return;
        }
        AbstractC167017dG.A1K(this, C25821No.A00(), imageUrl, str);
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        this.A06 = System.currentTimeMillis();
        Bitmap bitmap = c73033Pe.A01;
        bitmap.getClass();
        this.A08 = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.A0A = bitmapShader;
        this.A0L.setShader(bitmapShader);
        invalidateSelf();
        Iterator it = this.A0a.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onImageLoad");
        }
    }
}
