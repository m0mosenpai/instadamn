package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8xL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202418xL extends Drawable implements C1NJ, InterfaceC133125ze {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final int A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Path A0G;
    public final Path A0H;
    public final Path A0I;
    public final Runnable A0K;
    public final boolean A0L;
    public final Paint[] A0M;
    public final int A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final Paint A0Q;
    public final int A0R;
    public final int A0S;
    public final int A0T;
    public final Path A0U;
    public final Drawable A0V;
    public final C6RB A0W;
    public final List A0X;
    public final Shader.TileMode A0J = Shader.TileMode.CLAMP;
    public final Paint A0F = new Paint(3);

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Bitmap bitmap;
        Bitmap A00;
        Paint paint;
        C14360o3.A0B(interfaceC59502nt, 0);
        C14360o3.A0B(c73033Pe, 1);
        String str = (String) interfaceC59502nt.C4x();
        if (str != null) {
            if (AbstractC002300n.A0h(str, "product_image", false)) {
                String substring = str.substring(str.length() - 1);
                C14360o3.A07(substring);
                int parseInt = Integer.parseInt(substring);
                Bitmap bitmap2 = c73033Pe.A01;
                if (bitmap2 != null) {
                    int round = Math.round(this.A08);
                    A00 = C0fK.A00(bitmap2, round, round, true);
                    C14360o3.A07(A00);
                    paint = this.A0M[parseInt];
                    C14360o3.A0A(paint);
                } else {
                    return;
                }
            } else {
                if (!AbstractC002300n.A0h(str, "profile_pic", false) || (bitmap = c73033Pe.A01) == null) {
                    return;
                }
                int round2 = Math.round(this.A01);
                A00 = C0fK.A00(bitmap, round2, round2, true);
                C14360o3.A07(A00);
                this.A04 = true;
                paint = this.A0F;
            }
            Shader.TileMode tileMode = this.A0J;
            paint.setShader(new BitmapShader(A00, tileMode, tileMode));
            C11T.A02(this.A0K);
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
        float f;
        Paint paint;
        float f2;
        float f3;
        C14360o3.A0B(canvas, 0);
        C14360o3.A07(getBounds());
        int save = canvas.save();
        canvas.translate(r4.left, r4.top);
        canvas.drawPath(this.A0U, this.A0Q);
        canvas.save();
        List list = this.A0X;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float f4 = this.A08;
            canvas.translate(0.0f, i * f4);
            List list2 = (List) list.get(i);
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                float f5 = 0.0f;
                if (i2 > 0) {
                    f5 = f4;
                }
                canvas.translate(f5, 0.0f);
                Path path = (Path) list2.get(i2);
                Paint paint2 = this.A0M[(this.A0B * i) + i2];
                C14360o3.A0A(paint2);
                canvas.drawPath(path, paint2);
            }
            canvas.restore();
            canvas.save();
        }
        int i3 = this.A0B;
        for (int i4 = 1; i4 < i3; i4++) {
            float f6 = this.A08;
            float f7 = i4 * f6;
            canvas.drawLine(f7, 0.0f, f7, f6 * this.A0N, this.A0O);
        }
        int i5 = this.A0N;
        for (int i6 = 1; i6 < i5; i6++) {
            float f8 = this.A08;
            float f9 = i6 * f8;
            canvas.drawLine(0.0f, f9, i3 * f8, f9, this.A0O);
        }
        canvas.translate(0.0f, this.A05);
        canvas.drawPath(this.A0G, this.A0C);
        float f10 = this.A00 - this.A02;
        float f11 = this.A07;
        float f12 = f10 - f11;
        if (this.A0L) {
            f = (this.A06 - this.A03) - f11;
        } else {
            f = this.A03;
        }
        canvas.translate(f, f12);
        canvas.save();
        canvas.drawPath(this.A0H, this.A0D);
        canvas.restore();
        canvas.save();
        float f13 = this.A09;
        canvas.translate(f13, f13);
        Path path2 = this.A0I;
        if (this.A04) {
            paint = this.A0F;
        } else {
            paint = this.A0E;
        }
        canvas.drawPath(path2, paint);
        canvas.save();
        A00(canvas);
        if (this instanceof C217739k6) {
            C217739k6 c217739k6 = (C217739k6) this;
            int i7 = -c217739k6.A01;
            C6RB c6rb = c217739k6.A03;
            canvas.translate(0.0f, i7 - c6rb.A06);
            canvas.save();
            boolean z = c217739k6.A0L;
            if (z) {
                f2 = ((AbstractC202418xL) c217739k6).A07 - c6rb.A0A;
            } else {
                f2 = 0.0f;
            }
            canvas.translate(f2, 0.0f);
            c6rb.draw(canvas);
            canvas.restore();
            int i8 = -c217739k6.A00;
            C6RB c6rb2 = c217739k6.A02;
            canvas.translate(0.0f, i8 - c6rb2.A06);
            if (z) {
                f3 = ((AbstractC202418xL) c217739k6).A07 - c6rb2.A0A;
            } else {
                f3 = 0.0f;
            }
            canvas.translate(f3, 0.0f);
            c6rb2.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public AbstractC202418xL(Context context, ImageUrl imageUrl, String str, List list, float f, int i, int i2) {
        int i3;
        int i4;
        this.A0N = i;
        this.A0B = i2;
        Paint paint = new Paint(3);
        this.A0C = paint;
        Paint paint2 = new Paint(3);
        this.A0Q = paint2;
        Paint paint3 = new Paint(3);
        this.A0P = paint3;
        Paint paint4 = new Paint(3);
        this.A0E = paint4;
        Paint paint5 = new Paint(3);
        this.A0D = paint5;
        Paint paint6 = new Paint(3);
        this.A0O = paint6;
        this.A0X = new ArrayList();
        this.A0I = new Path();
        this.A0H = new Path();
        this.A0G = new Path();
        this.A0U = new Path();
        this.A0K = new RunnableC24310AqF(this);
        int i5 = i * i2;
        AbstractC13880nE.A04(context, 2);
        this.A0M = new Paint[i5];
        int color = context.getColor(AbstractC53242c7.A0A(context));
        this.A0T = color;
        int color2 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_text_on_white));
        this.A0R = color2;
        this.A0S = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_05));
        int color3 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_shadow_on_media));
        int color4 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_02));
        int color5 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_list_badge));
        this.A0L = AbstractC13620mo.A02(context);
        paint.setColor(color);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(color);
        paint2.setShadowLayer(14.0f, 0.0f, 0.0f, color3);
        paint3.setColor(color2);
        paint4.setColor(context.getColor(AbstractC53242c7.A04(context)));
        paint4.setStyle(style);
        paint5.setColor(color4);
        paint5.setStyle(style);
        paint6.setColor(color);
        paint6.setStyle(style);
        paint6.setStrokeWidth(AbstractC13880nE.A04(context, 1));
        for (int i6 = 0; i6 < i5; i6++) {
            this.A0M[i6] = new Paint(3);
            Paint paint7 = this.A0M[i6];
            C14360o3.A0A(paint7);
            paint7.setColor(this.A0T);
        }
        this.A06 = f;
        float f2 = f / this.A0B;
        this.A08 = f2;
        this.A05 = f2 * this.A0N;
        boolean z = this instanceof C202408xK;
        if (z) {
            this.A00 = f / 6.0f;
            i3 = 10;
        } else {
            this.A00 = f / 3.0f;
            i3 = 16;
        }
        this.A03 = Math.round(AbstractC13880nE.A04(context, i3));
        this.A02 = Math.round(AbstractC13880nE.A04(context, 14));
        if (z) {
            i4 = 28;
        } else {
            i4 = 24;
        }
        this.A01 = AbstractC13880nE.A04(context, i4);
        float A04 = AbstractC13880nE.A04(context, 12);
        int i7 = this.A0N;
        int i8 = 0;
        while (i8 < i7) {
            List list2 = this.A0X;
            float f3 = i8 == 0 ? A04 : 0.0f;
            ArrayList arrayList = new ArrayList();
            int i9 = this.A0B;
            int i10 = 0;
            while (i10 < i9) {
                float[] fArr = new float[8];
                fArr[0] = i10 == 0 ? f3 : 0.0f;
                fArr[1] = i10 == 0 ? f3 : 0.0f;
                int i11 = i9 - 1;
                fArr[2] = i10 == i11 ? f3 : 0.0f;
                float f4 = 0.0f;
                if (i10 == i11) {
                    f4 = f3;
                }
                fArr[3] = f4;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = 0.0f;
                fArr[7] = 0.0f;
                Path path = new Path();
                float f5 = this.A08;
                path.addRoundRect(new RectF(0.0f, 0.0f, f5, f5), fArr, Path.Direction.CW);
                arrayList.add(path);
                i10++;
            }
            list2.add(arrayList);
            i8++;
        }
        float A00 = AbstractC13880nE.A00(context, 0.5f);
        this.A09 = A00;
        float f6 = this.A01 / 2.0f;
        Path path2 = this.A0I;
        Path.Direction direction = Path.Direction.CW;
        path2.addCircle(f6, f6, f6, direction);
        float f7 = this.A01 + (A00 * 2.0f);
        this.A07 = f7;
        float f8 = f7 / 2.0f;
        this.A0H.addCircle(f8, f8, f8, direction);
        this.A0G.addRoundRect(new RectF(0.0f, 0.0f, this.A06, this.A00), new float[]{0.0f, 0.0f, 0.0f, 0.0f, A04, A04, A04, A04}, direction);
        this.A0U.addRoundRect(new RectF(0.0f, 0.0f, this.A06, this.A05 + this.A00), A04, A04, direction);
        int i12 = (int) (this.A03 / 2.0f);
        this.A0A = i12;
        C6RB c6rb = new C6RB(context, (int) (((this.A06 - (r4 * 2)) - this.A01) - i12));
        this.A0W = c6rb;
        c6rb.A0A(AbstractC13880nE.A04(context, 14));
        c6rb.A0J(Typeface.SANS_SERIF, 1);
        c6rb.A0F(this.A0R);
        c6rb.A0K(Layout.Alignment.ALIGN_NORMAL);
        c6rb.A0O = true;
        c6rb.A0M(str);
        Drawable drawable = context.getDrawable(R.drawable.verified_profile);
        if (drawable != null) {
            this.A0V = drawable;
            drawable.setColorFilter(C3DY.A00(color5));
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            for (int i13 = 0; i13 < i5; i13++) {
                C25821No A002 = C25821No.A00();
                Object obj = list.get(i13);
                C14360o3.A0A(obj);
                C1OG A0J = A002.A0J((ImageUrl) obj, null);
                A0J.A08 = AnonymousClass001.A0O("product_image", i13);
                A0J.A02(this);
                A0J.A01();
            }
            if (imageUrl != null) {
                C1OG A0J2 = C25821No.A00().A0J(imageUrl, null);
                A0J2.A08 = "profile_pic";
                A0J2.A02(this);
                A0J2.A01();
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public void A00(Canvas canvas) {
        float f;
        float f2 = this.A07;
        C6RB c6rb = this.A0W;
        float f3 = (f2 / 2.0f) - (c6rb.A06 / 2.0f);
        if (this.A0L) {
            f = (-this.A0A) - c6rb.A0A;
        } else {
            f = f2 + this.A0A;
        }
        canvas.translate(f, f3);
        c6rb.draw(canvas);
        canvas.restore();
        canvas.save();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.round(this.A05 + this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.round(this.A06);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.A0F.setAlpha(i);
        for (Paint paint : this.A0M) {
            C14360o3.A0A(paint);
            paint.setAlpha(i);
        }
        this.A0C.setAlpha(i);
        this.A0P.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A0F.setColorFilter(colorFilter);
        for (Paint paint : this.A0M) {
            C14360o3.A0A(paint);
            paint.setColorFilter(colorFilter);
        }
        this.A0C.setColorFilter(colorFilter);
        this.A0P.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
