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
import android.view.animation.OvershootInterpolator;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.Jg4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44201Jg4 extends Drawable implements C1NJ, MQ8 {
    public float A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public Bitmap A04;
    public AbstractC44205Jg9 A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public final ValueAnimator A0C;
    public final Context A0D;
    public final C44200Jg3 A0E;
    public final String A0F;
    public final InterfaceC16820sZ A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final Matrix A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final RectF A0Q;
    public final RectF A0R;
    public final Drawable A0S;
    public final Drawable A0T;
    public final UserSession A0U;
    public final boolean A0V;
    public final int[] A0W;

    public C44201Jg4(Context context, UserSession userSession, C44200Jg3 c44200Jg3, AbstractC44205Jg9 abstractC44205Jg9, InterfaceC16820sZ interfaceC16820sZ) {
        Drawable drawable;
        Drawable drawable2;
        int A06 = AbstractC167007dF.A06(1, context, userSession);
        AbstractC167007dF.A1F(c44200Jg3, 3, abstractC44205Jg9);
        this.A0D = context;
        this.A0U = userSession;
        this.A0E = c44200Jg3;
        this.A05 = abstractC44205Jg9;
        this.A0G = interfaceC16820sZ;
        this.A0F = c44200Jg3.A01;
        float[] fArr = new float[A06];
        // fill-array-data instruction
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        C14360o3.A07(ofFloat);
        this.A0C = ofFloat;
        this.A0W = new int[]{0, 0, AbstractC167007dF.A09(context, R.attr.igds_color_primary_icon)};
        this.A0M = AbstractC166987dD.A0S(3);
        this.A0O = AbstractC166987dD.A0S(3);
        this.A0N = AbstractC166987dD.A0S(3);
        this.A0P = AbstractC166987dD.A0S(1);
        this.A0K = AbstractC167007dF.A09(context, R.attr.igds_color_primary_background);
        this.A0J = AbstractC167007dF.A09(context, R.attr.igds_color_elevated_separator);
        this.A0I = AbstractC167007dF.A09(context, R.attr.igds_color_highlight_background);
        this.A0R = AbstractC166987dD.A0X();
        this.A0Q = AbstractC166987dD.A0X();
        this.A0L = AbstractC166987dD.A0Q();
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_primary_text);
        Drawable drawable3 = context.getDrawable(R.drawable.instagram_flag_off_pano_outline_24);
        if (drawable3 != null && (drawable = drawable3.mutate()) != null) {
            drawable.setTint(A09);
        } else {
            drawable = null;
        }
        this.A0S = drawable;
        this.A0H = AbstractC166997dE.A04(context, R.dimen.abc_button_padding_horizontal_material);
        int A092 = AbstractC167007dF.A09(context, R.attr.igds_color_primary_text_on_media);
        Drawable drawable4 = context.getDrawable(R.drawable.instagram_lock_pano_filled_24);
        if (drawable4 != null && (drawable2 = drawable4.mutate()) != null) {
            drawable2.setTint(A092);
        } else {
            drawable2 = null;
        }
        this.A0T = drawable2;
        this.A0V = C14360o3.A0K(this.A05, C44206JgA.A00) && C18U.A06(C06090Tz.A05, userSession, 36321722382165779L);
        this.A02 = AbstractC44198Jg1.A03(this.A0D, this.A05.A04);
        A02(this);
        A03(this);
        AbstractC167017dG.A1K(this, C25821No.A00(), AbstractC25225BEi.A0t(c44200Jg3.A02), "friend_map");
        if (this.A0E.A04) {
            ValueAnimator valueAnimator = this.A0C;
            valueAnimator.setDuration(850L);
            LMA.A01(valueAnimator, this, 30);
            valueAnimator.setRepeatCount(-1);
            AbstractC43593JPy.A18(valueAnimator);
            valueAnimator.start();
        }
    }

    public final void A04(AbstractC44205Jg9 abstractC44205Jg9, Long l, boolean z) {
        long j;
        C14360o3.A0B(abstractC44205Jg9, 0);
        if (!C14360o3.A0K(this.A05, abstractC44205Jg9)) {
            this.A05 = abstractC44205Jg9;
            Context context = this.A0D;
            int i = abstractC44205Jg9.A04;
            if (z) {
                int A03 = AbstractC44198Jg1.A03(context, i);
                ValueAnimator valueAnimator = this.A03;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(this.A02, A03);
                if (this.A02 < A03) {
                    ofInt.setInterpolator(new OvershootInterpolator(1.6f));
                }
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 350;
                }
                ofInt.setDuration(j);
                LMA.A01(ofInt, this, 29);
                ofInt.start();
                this.A03 = ofInt;
                return;
            }
            this.A02 = AbstractC44198Jg1.A03(context, i);
            A02(this);
            A03(this);
        }
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            this.A04 = bitmap;
            A01(this);
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
        if (this.A04 == null && !this.A05.A0A) {
            return;
        }
        float centerX = this.A0R.centerX();
        canvas.save();
        AbstractC167017dG.A12(canvas, this);
        canvas.drawCircle(centerX, centerX, centerX, this.A0P);
        C44200Jg3 c44200Jg3 = this.A0E;
        if (c44200Jg3.A04) {
            canvas.save();
            canvas.rotate(this.A00, centerX, centerX);
            canvas.drawCircle(centerX, centerX, centerX, this.A0M);
            canvas.restore();
        }
        boolean z = this.A0V;
        if (!z) {
            canvas.drawCircle(centerX, centerX, centerX - this.A07, this.A0O);
        }
        if (this.A04 != null) {
            float f = (centerX - this.A07) - this.A09;
            canvas.save();
            float f2 = this.A07 + this.A09;
            canvas.translate(f2, f2);
            canvas.drawCircle(f, f, f, this.A0N);
            canvas.restore();
        }
        if (this.A05.A08) {
            canvas.save();
            float f3 = this.A07 + this.A09 + this.A0H;
            canvas.translate(f3, f3);
            Drawable drawable = this.A0S;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.restore();
        }
        if (c44200Jg3.A05) {
            AbstractC44205Jg9 abstractC44205Jg9 = this.A05;
            if ((abstractC44205Jg9 instanceof C45991KXf) || (abstractC44205Jg9 instanceof C44207JgB)) {
                canvas.save();
                canvas.translate(((this.A07 + this.A09) + (this.A08 / 2.0f)) - (A00() / 2.0f), ((this.A07 + this.A09) + (this.A08 / 2.0f)) - (A00() / 2.0f));
                Drawable drawable2 = this.A0T;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
                canvas.restore();
            }
        }
        if (!z) {
            AbstractC66077TzE.A00(canvas, this.A0Q, this.A0K);
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
        RectF rectF = this.A0R;
        int i = this.A02;
        rectF.set(new Rect(0, 0, i, i));
        float width = AbstractC66077TzE.A00.width() * 3.0f;
        float centerX = rectF.centerX() - (width / 2.0f);
        float f = rectF.bottom - this.A0B;
        this.A0Q.set(centerX, f, width + centerX, this.A0A + f);
    }

    private final int A00() {
        boolean A0K = C14360o3.A0K(this.A05, C44207JgB.A00);
        Context context = this.A0D;
        int i = R.dimen.abc_dialog_padding_material;
        if (A0K) {
            i = R.dimen.ai_sticker_creation_suggested_prompt_pill_height;
        }
        return AbstractC44198Jg1.A03(context, i);
    }

    public static final void A01(C44201Jg4 c44201Jg4) {
        Bitmap bitmap = c44201Jg4.A04;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            Bitmap bitmap2 = c44201Jg4.A04;
            if (bitmap2 != null) {
                Rect rect = new Rect(0, 0, width, bitmap2.getHeight());
                int i = c44201Jg4.A08;
                Rect rect2 = new Rect(0, 0, i, i);
                Matrix matrix = c44201Jg4.A0L;
                C3LQ.A0A(matrix, rect, rect2);
                int i2 = c44201Jg4.A08;
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                C14360o3.A07(createBitmap);
                Canvas A06 = AbstractC43592JPx.A06(createBitmap);
                Bitmap bitmap3 = c44201Jg4.A04;
                if (bitmap3 != null) {
                    Paint paint = c44201Jg4.A0N;
                    A06.drawBitmap(bitmap3, matrix, paint);
                    if (!c44201Jg4.A05.A08) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    }
                    c44201Jg4.invalidateSelf();
                    c44201Jg4.A0G.invoke();
                    return;
                }
            }
            C14360o3.A0F("bitmap");
            throw C00O.createAndThrow();
        }
    }

    public static final void A02(C44201Jg4 c44201Jg4) {
        int A03;
        int A032;
        boolean z = c44201Jg4.A0V;
        if (z) {
            A03 = 0;
        } else {
            A03 = AbstractC44198Jg1.A03(c44201Jg4.A0D, c44201Jg4.A05.A02);
        }
        c44201Jg4.A07 = A03;
        if (z) {
            A032 = 0;
        } else {
            A032 = AbstractC44198Jg1.A03(c44201Jg4.A0D, c44201Jg4.A05.A05);
        }
        c44201Jg4.A09 = A032;
        int A01 = C1H4.A01((c44201Jg4.A02 - (c44201Jg4.A07 * 2.0f)) - (A032 * 2.0f));
        c44201Jg4.A08 = A01;
        int A012 = C1H4.A01(A01 - (c44201Jg4.A0H * 2.0f));
        Drawable drawable = c44201Jg4.A0S;
        if (drawable != null) {
            drawable.setBounds(0, 0, A012, A012);
        }
        Drawable drawable2 = c44201Jg4.A0T;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, c44201Jg4.A00(), c44201Jg4.A00());
        }
        Context context = c44201Jg4.A0D;
        int A033 = AbstractC44198Jg1.A03(context, c44201Jg4.A05.A03);
        int i = 0;
        if (c44201Jg4.A05.A09) {
            i = A033;
        }
        c44201Jg4.A0A = i;
        int A034 = AbstractC44198Jg1.A03(context, R.dimen.annotation_hidden_location_pill_nub_padding);
        int i2 = 0;
        if (c44201Jg4.A05.A09) {
            i2 = A034;
        }
        c44201Jg4.A0B = i2;
        c44201Jg4.A01 = c44201Jg4.A02 + (c44201Jg4.A0A - i2);
        int A035 = AbstractC44198Jg1.A03(context, R.dimen.abc_edit_text_inset_top_material);
        int i3 = 0;
        if (!c44201Jg4.A05.A07) {
            i3 = A035;
        }
        c44201Jg4.A06 = i3;
        c44201Jg4.setBounds(new Rect(0, 0, c44201Jg4.A02, c44201Jg4.A01));
        A01(c44201Jg4);
        c44201Jg4.invalidateSelf();
        c44201Jg4.A0G.invoke();
    }

    public static final void A03(C44201Jg4 c44201Jg4) {
        int i;
        Paint paint = c44201Jg4.A0O;
        paint.setColor(c44201Jg4.A0J);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = c44201Jg4.A0N;
        paint2.setColor(c44201Jg4.A0I);
        paint2.setStyle(style);
        Paint paint3 = c44201Jg4.A0P;
        paint3.setColor(c44201Jg4.A0K);
        paint3.setStyle(style);
        float f = c44201Jg4.A06;
        AbstractC44205Jg9 abstractC44205Jg9 = c44201Jg4.A05;
        float f2 = f * abstractC44205Jg9.A01;
        float f3 = abstractC44205Jg9.A00;
        boolean z = abstractC44205Jg9 instanceof KXZ;
        Context context = c44201Jg4.A0D;
        if (z) {
            C14360o3.A0B(context, 0);
            i = R.color.background;
        } else {
            C14360o3.A0B(context, 0);
            i = R.color.black_30_transparent;
        }
        paint3.setShadowLayer(f2, 0.0f, f3, context.getColor(i));
        Paint paint4 = c44201Jg4.A0M;
        RectF rectF = c44201Jg4.A0R;
        paint4.setShader(new SweepGradient(rectF.centerX(), rectF.centerY(), c44201Jg4.A0W, (float[]) null));
    }

    @Override // X.MQ8
    public final boolean AkZ() {
        if (this.A0E.A00 != null && this.A05.A06) {
            return true;
        }
        return false;
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
    public final void setAlpha(int i) {
        this.A0N.setAlpha(i);
        this.A0O.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0N.setColorFilter(colorFilter);
        this.A0O.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
