package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.65O, reason: invalid class name */
/* loaded from: classes3.dex */
public class C65O extends Drawable implements C65P {
    public static final Paint A0M = new Paint(1);
    public C65W A00;
    public C65Q A01;
    public boolean A02;
    public boolean A03;
    public PorterDuffColorFilter A04;
    public PorterDuffColorFilter A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;
    public final Path A09;
    public final RectF A0A;
    public final RectF A0B;
    public final RectF A0C;
    public final InterfaceC1343365c A0D;
    public final C65Z A0E;
    public final BitSet A0F;
    public final C65X[] A0G;
    public final C65X[] A0H;
    public final Matrix A0I;
    public final Region A0J;
    public final Region A0K;
    public final C65Y A0L;

    public final void A09() {
        C65W c65w = this.A00;
        if (c65w.A07 != 2) {
            c65w.A07 = 2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.A02 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.A02 = true;
        super.onBoundsChange(rect);
    }

    private float A00() {
        Paint.Style style = this.A00.A0G;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) {
            Paint paint = this.A07;
            if (paint.getStrokeWidth() > 0.0f) {
                return paint.getStrokeWidth() / 2.0f;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    private void A01(Canvas canvas) {
        if (this.A0F.cardinality() > 0) {
            android.util.Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.A00.A08 != 0) {
            canvas.drawPath(this.A08, this.A0L.A06);
        }
        int i = 0;
        do {
            C65X c65x = this.A0G[i];
            C65Y c65y = this.A0L;
            int i2 = this.A00.A09;
            Matrix matrix = C65X.A00;
            c65x.A00(canvas, matrix, c65y, i2);
            this.A0H[i].A00(canvas, matrix, c65y, this.A00.A09);
            i++;
        } while (i < 4);
        if (this.A03) {
            double d = this.A00.A08;
            double radians = Math.toRadians(r1.A0A);
            int sin = (int) (d * Math.sin(radians));
            int cos = (int) (d * Math.cos(radians));
            canvas.translate(-sin, -cos);
            canvas.drawPath(this.A08, A0M);
            canvas.translate(sin, cos);
        }
    }

    private void A02(Path path, RectF rectF) {
        C65Z c65z = this.A0E;
        C65W c65w = this.A00;
        c65z.A01(path, rectF, c65w.A0K, this.A0D, c65w.A01);
        if (this.A00.A03 != 1.0f) {
            Matrix matrix = this.A0I;
            matrix.reset();
            float f = this.A00.A03;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A0B, true);
    }

    public static void A03(C65O c65o) {
        C65W c65w = c65o.A00;
        float f = c65w.A00 + c65w.A05;
        c65w.A09 = (int) Math.ceil(0.75f * f);
        c65w.A08 = (int) Math.ceil(f * 0.25f);
        c65o.A04();
        super.invalidateSelf();
    }

    private boolean A04() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2;
        PorterDuffColorFilter porterDuffColorFilter3 = this.A05;
        PorterDuffColorFilter porterDuffColorFilter4 = this.A04;
        C65W c65w = this.A00;
        ColorStateList colorStateList = c65w.A0E;
        PorterDuff.Mode mode = c65w.A0H;
        Paint paint = this.A06;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = new PorterDuffColorFilter(A08(colorStateList.getColorForState(getState(), 0)), mode);
        } else {
            int color = paint.getColor();
            int A08 = A08(color);
            if (A08 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(A08, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.A05 = porterDuffColorFilter;
        C65W c65w2 = this.A00;
        ColorStateList colorStateList2 = c65w2.A0D;
        PorterDuff.Mode mode2 = c65w2.A0H;
        if (colorStateList2 != null && mode2 != null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(colorStateList2.getColorForState(getState(), 0), mode2);
        } else {
            porterDuffColorFilter2 = null;
        }
        this.A04 = porterDuffColorFilter2;
        C65W c65w3 = this.A00;
        if (c65w3.A0L) {
            this.A0L.A00(c65w3.A0E.getColorForState(getState(), 0));
        }
        if (!C02O.A00(porterDuffColorFilter3, this.A05) || !C02O.A00(porterDuffColorFilter4, this.A04)) {
            return true;
        }
        return false;
    }

    private boolean A05(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.A00.A0B != null && color2 != (colorForState2 = this.A00.A0B.getColorForState(iArr, (color2 = (paint2 = this.A06).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.A00.A0C != null && color != (colorForState = this.A00.A0C.getColorForState(iArr, (color = (paint = this.A07).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z;
    }

    public final float A07() {
        C65U c65u = this.A00.A0K.A02;
        RectF rectF = this.A0C;
        rectF.set(getBounds());
        return c65u.Art(rectF);
    }

    public final int A08(int i) {
        C65W c65w = this.A00;
        float f = c65w.A00 + c65w.A05 + c65w.A02;
        C1343465d c1343465d = c65w.A0J;
        if (c1343465d != null) {
            return c1343465d.A00(i, f);
        }
        return i;
    }

    public final void A0A(float f) {
        C65W c65w = this.A00;
        if (c65w.A00 != f) {
            c65w.A00 = f;
            A03(this);
        }
    }

    public final void A0B(float f) {
        C65W c65w = this.A00;
        if (c65w.A01 != f) {
            c65w.A01 = f;
            this.A02 = true;
            invalidateSelf();
        }
    }

    public final void A0C(int i) {
        this.A0L.A00(i);
        this.A00.A0L = false;
        super.invalidateSelf();
    }

    public final void A0D(int i) {
        C65W c65w = this.A00;
        if (c65w.A08 != i) {
            c65w.A08 = i;
            super.invalidateSelf();
        }
    }

    public final void A0E(Context context) {
        this.A00.A0J = new C1343465d(context);
        A03(this);
    }

    public final void A0F(ColorStateList colorStateList) {
        C65W c65w = this.A00;
        if (c65w.A0B != colorStateList) {
            c65w.A0B = colorStateList;
            onStateChange(getState());
        }
    }

    public final void A0G(ColorStateList colorStateList) {
        C65W c65w = this.A00;
        if (c65w.A0C != colorStateList) {
            c65w.A0C = colorStateList;
            onStateChange(getState());
        }
    }

    public final void A0H(ColorStateList colorStateList, float f) {
        this.A00.A04 = f;
        invalidateSelf();
        A0G(colorStateList);
    }

    public final boolean A0I() {
        C65Q c65q = this.A00.A0K;
        RectF rectF = this.A0C;
        rectF.set(getBounds());
        return c65q.A03(rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.A06;
        paint.setColorFilter(this.A05);
        int alpha = paint.getAlpha();
        int i = this.A00.A06;
        paint.setAlpha((alpha * (i + (i >>> 7))) >>> 8);
        Paint paint2 = this.A07;
        paint2.setColorFilter(this.A04);
        paint2.setStrokeWidth(this.A00.A04);
        int alpha2 = paint2.getAlpha();
        int i2 = this.A00.A06;
        paint2.setAlpha((alpha2 * (i2 + (i2 >>> 7))) >>> 8);
        if (this.A02) {
            final float f = -A00();
            C65W c65w = this.A00;
            C65Q c65q = c65w.A0K;
            C72G c72g = new C72G(c65q);
            final C65U c65u = c65q.A02;
            if (!(c65u instanceof C72H)) {
                c65u = new C65U(c65u, f) { // from class: X.72I
                    public final float A00;
                    public final C65U A01;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C72I)) {
                            return false;
                        }
                        C72I c72i = (C72I) obj;
                        return this.A01.equals(c72i.A01) && this.A00 == c72i.A00;
                    }

                    @Override // X.C65U
                    public final float Art(RectF rectF) {
                        return Math.max(0.0f, this.A01.Art(rectF) + this.A00);
                    }

                    public final int hashCode() {
                        return Arrays.hashCode(new Object[]{this.A01, Float.valueOf(this.A00)});
                    }

                    {
                        if (c65u instanceof C72I) {
                            throw new NullPointerException("adjustment");
                        }
                        this.A01 = c65u;
                        this.A00 = f;
                    }
                };
            }
            c72g.A02 = c65u;
            final C65U c65u2 = c65q.A03;
            if (!(c65u2 instanceof C72H)) {
                c65u2 = new C65U(c65u2, f) { // from class: X.72I
                    public final float A00;
                    public final C65U A01;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C72I)) {
                            return false;
                        }
                        C72I c72i = (C72I) obj;
                        return this.A01.equals(c72i.A01) && this.A00 == c72i.A00;
                    }

                    @Override // X.C65U
                    public final float Art(RectF rectF) {
                        return Math.max(0.0f, this.A01.Art(rectF) + this.A00);
                    }

                    public final int hashCode() {
                        return Arrays.hashCode(new Object[]{this.A01, Float.valueOf(this.A00)});
                    }

                    {
                        if (c65u2 instanceof C72I) {
                            throw new NullPointerException("adjustment");
                        }
                        this.A01 = c65u2;
                        this.A00 = f;
                    }
                };
            }
            c72g.A03 = c65u2;
            final C65U c65u3 = c65q.A00;
            if (!(c65u3 instanceof C72H)) {
                c65u3 = new C65U(c65u3, f) { // from class: X.72I
                    public final float A00;
                    public final C65U A01;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C72I)) {
                            return false;
                        }
                        C72I c72i = (C72I) obj;
                        return this.A01.equals(c72i.A01) && this.A00 == c72i.A00;
                    }

                    @Override // X.C65U
                    public final float Art(RectF rectF) {
                        return Math.max(0.0f, this.A01.Art(rectF) + this.A00);
                    }

                    public final int hashCode() {
                        return Arrays.hashCode(new Object[]{this.A01, Float.valueOf(this.A00)});
                    }

                    {
                        if (c65u3 instanceof C72I) {
                            throw new NullPointerException("adjustment");
                        }
                        this.A01 = c65u3;
                        this.A00 = f;
                    }
                };
            }
            c72g.A00 = c65u3;
            final C65U c65u4 = c65q.A01;
            if (!(c65u4 instanceof C72H)) {
                c65u4 = new C65U(c65u4, f) { // from class: X.72I
                    public final float A00;
                    public final C65U A01;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C72I)) {
                            return false;
                        }
                        C72I c72i = (C72I) obj;
                        return this.A01.equals(c72i.A01) && this.A00 == c72i.A00;
                    }

                    @Override // X.C65U
                    public final float Art(RectF rectF) {
                        return Math.max(0.0f, this.A01.Art(rectF) + this.A00);
                    }

                    public final int hashCode() {
                        return Arrays.hashCode(new Object[]{this.A01, Float.valueOf(this.A00)});
                    }

                    {
                        if (c65u4 instanceof C72I) {
                            throw new NullPointerException("adjustment");
                        }
                        this.A01 = c65u4;
                        this.A00 = f;
                    }
                };
            }
            c72g.A01 = c65u4;
            C65Q c65q2 = new C65Q(c72g);
            this.A01 = c65q2;
            C65Z c65z = this.A0E;
            float f2 = c65w.A01;
            RectF rectF = this.A0A;
            RectF rectF2 = this.A0C;
            rectF2.set(getBounds());
            rectF.set(rectF2);
            float A00 = A00();
            rectF.inset(A00, A00);
            c65z.A01(this.A09, rectF, c65q2, null, f2);
            rectF2.set(getBounds());
            A02(this.A08, rectF2);
            this.A02 = false;
        }
        C65W c65w2 = this.A00;
        int i3 = c65w2.A07;
        if (i3 != 1 && c65w2.A09 > 0 && (i3 == 2 || (!A0I() && !this.A08.isConvex() && Build.VERSION.SDK_INT < 29))) {
            canvas.save();
            double d = this.A00.A08;
            double radians = Math.toRadians(r1.A0A);
            canvas.translate((int) (d * Math.sin(radians)), (int) (d * Math.cos(radians)));
            if (!this.A03) {
                A01(canvas);
            } else {
                RectF rectF3 = this.A0B;
                int width = (int) (rectF3.width() - getBounds().width());
                int height = (int) (rectF3.height() - getBounds().height());
                if (width >= 0 && height >= 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(((int) rectF3.width()) + (this.A00.A09 * 2) + width, ((int) rectF3.height()) + (this.A00.A09 * 2) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f3 = (getBounds().left - this.A00.A09) - width;
                    float f4 = (getBounds().top - this.A00.A09) - height;
                    canvas2.translate(-f3, -f4);
                    A01(canvas2);
                    canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
                    createBitmap.recycle();
                } else {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
            }
            canvas.restore();
        }
        C65W c65w3 = this.A00;
        Paint.Style style = c65w3.A0G;
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        if (style == style2 || style == Paint.Style.FILL) {
            Path path = this.A08;
            C65Q c65q3 = c65w3.A0K;
            RectF rectF4 = this.A0C;
            rectF4.set(getBounds());
            if (c65q3.A03(rectF4)) {
                float Art = c65q3.A03.Art(rectF4) * this.A00.A01;
                canvas.drawRoundRect(rectF4, Art, Art, paint);
            } else {
                canvas.drawPath(path, paint);
            }
        }
        Paint.Style style3 = this.A00.A0G;
        if ((style3 == style2 || style3 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
            Path path2 = this.A09;
            C65Q c65q4 = this.A01;
            RectF rectF5 = this.A0A;
            RectF rectF6 = this.A0C;
            rectF6.set(getBounds());
            rectF5.set(rectF6);
            float A002 = A00();
            rectF5.inset(A002, A002);
            if (c65q4.A03(rectF5)) {
                float Art2 = c65q4.A03.Art(rectF5) * this.A00.A01;
                canvas.drawRoundRect(rectF5, Art2, Art2, paint2);
            } else {
                canvas.drawPath(path2, paint2);
            }
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.A00.A07 != 2) {
            if (A0I()) {
                outline.setRoundRect(getBounds(), A07() * this.A00.A01);
                return;
            }
            RectF rectF = this.A0C;
            rectF.set(getBounds());
            Path path = this.A08;
            A02(path, rectF);
            if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(path);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.A00.A0I;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // X.C65P
    public final C65Q getShapeAppearanceModel() {
        return this.A00.A0K;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.Drawable$ConstantState, X.65W] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        C65W c65w = this.A00;
        ?? constantState = new Drawable.ConstantState();
        constantState.A0B = null;
        constantState.A0C = null;
        constantState.A0D = null;
        constantState.A0E = null;
        constantState.A0H = PorterDuff.Mode.SRC_IN;
        constantState.A0I = null;
        constantState.A03 = 1.0f;
        constantState.A01 = 1.0f;
        constantState.A06 = 255;
        constantState.A02 = 0.0f;
        constantState.A00 = 0.0f;
        constantState.A05 = 0.0f;
        constantState.A07 = 0;
        constantState.A09 = 0;
        constantState.A08 = 0;
        constantState.A0A = 0;
        constantState.A0L = false;
        constantState.A0G = Paint.Style.FILL_AND_STROKE;
        constantState.A0K = c65w.A0K;
        constantState.A0J = c65w.A0J;
        constantState.A04 = c65w.A04;
        constantState.A0F = c65w.A0F;
        constantState.A0B = c65w.A0B;
        constantState.A0C = c65w.A0C;
        constantState.A0H = c65w.A0H;
        constantState.A0E = c65w.A0E;
        constantState.A06 = c65w.A06;
        constantState.A03 = c65w.A03;
        constantState.A08 = c65w.A08;
        constantState.A07 = c65w.A07;
        constantState.A0L = c65w.A0L;
        constantState.A01 = c65w.A01;
        constantState.A02 = c65w.A02;
        constantState.A00 = c65w.A00;
        constantState.A05 = c65w.A05;
        constantState.A09 = c65w.A09;
        constantState.A0A = c65w.A0A;
        constantState.A0D = c65w.A0D;
        constantState.A0G = c65w.A0G;
        Rect rect = c65w.A0I;
        if (rect != null) {
            constantState.A0I = new Rect(rect);
        }
        this.A00 = constantState;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C65W c65w = this.A00;
        if (c65w.A06 != i) {
            c65w.A06 = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A00.A0F = colorFilter;
        super.invalidateSelf();
    }

    @Override // X.C65P
    public final void setShapeAppearanceModel(C65Q c65q) {
        this.A00.A0K = c65q;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.A00.A0E = colorStateList;
        A04();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C65W c65w = this.A00;
        if (c65w.A0H != mode) {
            c65w.A0H = mode;
            A04();
            super.invalidateSelf();
        }
    }

    public C65O(C65W c65w) {
        C65Z c65z;
        this.A0G = new C65X[4];
        this.A0H = new C65X[4];
        this.A0F = new BitSet(8);
        this.A0I = new Matrix();
        this.A08 = new Path();
        this.A09 = new Path();
        this.A0C = new RectF();
        this.A0A = new RectF();
        this.A0K = new Region();
        this.A0J = new Region();
        Paint paint = new Paint(1);
        this.A06 = paint;
        Paint paint2 = new Paint(1);
        this.A07 = paint2;
        this.A0L = new C65Y();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c65z = AbstractC1567171t.A00;
        } else {
            c65z = new C65Z();
        }
        this.A0E = c65z;
        this.A0B = new RectF();
        this.A03 = true;
        this.A00 = c65w;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = A0M;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        A04();
        A05(getState());
        this.A0D = new C65b(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.A0K;
        region.set(bounds);
        RectF rectF = this.A0C;
        rectF.set(getBounds());
        Path path = this.A08;
        A02(path, rectF);
        Region region2 = this.A0J;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.A00.A0E;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = this.A00.A0D;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.A00.A0C;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        ColorStateList colorStateList4 = this.A00.A0B;
                        if (colorStateList4 != null && colorStateList4.isStateful()) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean A05 = A05(iArr);
        boolean A04 = A04();
        if (!A05 && !A04) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$ConstantState, X.65W] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C65O(X.C65Q r4) {
        /*
            r3 = this;
            r2 = 0
            X.65W r1 = new X.65W
            r1.<init>()
            r1.A0B = r2
            r1.A0C = r2
            r1.A0D = r2
            r1.A0E = r2
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.A0H = r0
            r1.A0I = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A03 = r0
            r1.A01 = r0
            r0 = 255(0xff, float:3.57E-43)
            r1.A06 = r0
            r0 = 0
            r1.A02 = r0
            r1.A00 = r0
            r1.A05 = r0
            r0 = 0
            r1.A07 = r0
            r1.A09 = r0
            r1.A08 = r0
            r1.A0A = r0
            r1.A0L = r0
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r1.A0G = r0
            r1.A0K = r4
            r1.A0J = r2
            r3.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65O.<init>(X.65Q):void");
    }

    public C65O() {
        this(new C65Q());
    }
}
