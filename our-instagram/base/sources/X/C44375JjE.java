package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.JjE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44375JjE extends Drawable implements C1NJ {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public AbstractC47564Kza A08;
    public Bitmap A09;
    public final int A0A;
    public final int A0B;
    public final ValueAnimator A0C;
    public final Context A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final RectF A0I;
    public final C47563KzZ A0J;
    public final InterfaceC16820sZ A0K;
    public final int[] A0L;
    public final Matrix A0M;
    public final RectF A0N;
    public final UserSession A0O;

    public C44375JjE(Context context, UserSession userSession, C47563KzZ c47563KzZ, AbstractC47564Kza abstractC47564Kza, InterfaceC16820sZ interfaceC16820sZ) {
        int A06 = AbstractC167007dF.A06(1, context, userSession);
        AbstractC167007dF.A1F(c47563KzZ, 3, abstractC47564Kza);
        this.A0D = context;
        this.A0O = userSession;
        this.A0J = c47563KzZ;
        this.A08 = abstractC47564Kza;
        this.A0K = interfaceC16820sZ;
        float[] fArr = new float[A06];
        // fill-array-data instruction
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        C14360o3.A07(ofFloat);
        this.A0C = ofFloat;
        this.A0L = new int[]{0, 0, context.getColor(AbstractC53242c7.A08(context))};
        this.A0E = AbstractC166987dD.A0S(3);
        this.A0G = AbstractC166987dD.A0S(3);
        this.A0F = AbstractC166987dD.A0S(3);
        this.A0H = AbstractC166987dD.A0S(1);
        this.A0B = AbstractC167007dF.A09(context, R.attr.igds_color_elevated_highlight_background);
        this.A0A = AbstractC167007dF.A09(context, R.attr.igds_color_elevated_separator);
        this.A0I = AbstractC166987dD.A0X();
        this.A0N = AbstractC166987dD.A0X();
        this.A0M = AbstractC166987dD.A0Q();
        Context context2 = this.A0D;
        C14360o3.A0B(context2, 0);
        this.A07 = AbstractC166997dE.A04(context2, R.dimen.album_preview_add_item_margin);
        Context context3 = this.A0D;
        int i = this.A08.A00;
        C14360o3.A0B(context3, 0);
        this.A01 = AbstractC166997dE.A04(context3, i);
        int A04 = AbstractC166997dE.A04(context3, R.dimen.account_recs_header_image_margin);
        this.A04 = A04;
        this.A03 = C1H4.A01((this.A07 - (this.A01 * 2.0f)) - (A04 * 2.0f));
        this.A05 = AbstractC166997dE.A04(context3, R.dimen.afi_margin_top);
        int A042 = AbstractC166997dE.A04(context3, R.dimen.annotation_hidden_location_pill_nub_padding);
        this.A06 = A042;
        this.A02 = this.A07 + (this.A05 - A042);
        this.A00 = AbstractC166997dE.A04(context3, R.dimen.abc_edit_text_inset_top_material);
        setBounds(new Rect(0, 0, this.A07, this.A02));
        A00();
        invalidateSelf();
        this.A0K.invoke();
        Paint paint = this.A0G;
        paint.setColor(this.A0A);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = this.A0F;
        int i2 = this.A0B;
        paint2.setColor(i2);
        paint2.setStyle(style);
        Paint paint3 = this.A0H;
        paint3.setColor(i2);
        paint3.setStyle(style);
        float f = this.A00;
        Context context4 = this.A0D;
        C14360o3.A0B(context4, 0);
        paint3.setShadowLayer(f, 0.0f, 0.0f, context4.getColor(R.color.black_30_transparent));
        Paint paint4 = this.A0E;
        RectF rectF = this.A0I;
        paint4.setShader(new SweepGradient(rectF.centerX(), rectF.centerY(), this.A0L, (float[]) null));
        AbstractC167017dG.A1K(this, C25821No.A00(), AbstractC25225BEi.A0t(c47563KzZ.A01), "media_note_stack");
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            this.A09 = bitmap;
            A00();
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        float centerX = this.A0I.centerX();
        canvas.save();
        AbstractC167017dG.A12(canvas, this);
        canvas.drawCircle(centerX, centerX, centerX, this.A0H);
        int i = this.A01;
        float f = centerX - i;
        canvas.drawCircle(centerX, centerX, f, this.A0G);
        if (this.A09 != null) {
            int i2 = this.A04;
            float f2 = f - i2;
            canvas.save();
            float f3 = i + i2;
            canvas.translate(f3, f3);
            canvas.drawCircle(f2, f2, f2, this.A0F);
            canvas.restore();
        }
        if (this.A08.A01) {
            AbstractC66077TzE.A00(canvas, this.A0N, this.A0B);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "This method is no longer used in graphics optimizations", replaceWith = @ReplaceWith(expression = "Not Applicable", imports = {}))
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A0I;
        int i = this.A07;
        rectF.set(new Rect(0, 0, i, i));
        float width = AbstractC66077TzE.A00.width() * 3.0f;
        float centerX = rectF.centerX() - (width / 2.0f);
        float f = rectF.bottom - this.A06;
        this.A0N.set(centerX, f, width + centerX, this.A05 + f);
    }

    private final void A00() {
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            Bitmap bitmap2 = this.A09;
            if (bitmap2 != null) {
                Rect rect = new Rect(0, 0, width, bitmap2.getHeight());
                int i = this.A03;
                Rect rect2 = new Rect(0, 0, i, i);
                Matrix matrix = this.A0M;
                C3LQ.A0A(matrix, rect, rect2);
                Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                C14360o3.A07(createBitmap);
                Canvas A06 = AbstractC43592JPx.A06(createBitmap);
                Bitmap bitmap3 = this.A09;
                if (bitmap3 != null) {
                    Paint paint = this.A0F;
                    A06.drawBitmap(bitmap3, matrix, paint);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    invalidateSelf();
                    this.A0K.invoke();
                    return;
                }
            }
            C14360o3.A0F("bitmap");
            throw C00O.createAndThrow();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0F.setAlpha(i);
        this.A0G.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0F.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
