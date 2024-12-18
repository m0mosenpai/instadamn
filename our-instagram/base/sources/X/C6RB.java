package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Random;

/* renamed from: X.6RB, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6RB extends Drawable {
    public static final Spannable A0d = new SpannableString("");
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public ColorStateList A0B;
    public Bitmap A0C;
    public PorterDuffColorFilter A0D;
    public Layout.Alignment A0E;
    public Spannable A0F;
    public StaticLayout A0G;
    public StaticLayout A0H;
    public C6RC A0I;
    public C6RD A0J;
    public C1572374d A0K;
    public CharSequence A0L;
    public Integer A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public PorterDuff.Mode A0V;
    public CharSequence A0W;
    public Object A0X;
    public boolean A0Y;
    public final Context A0Z;
    public final Rect A0a = new Rect();
    public final TextPaint A0b;
    public final SparseArray A0c;

    public final void A09() {
        if (!this.A0R) {
            this.A0R = true;
            A02();
            invalidateSelf();
        }
    }

    public final void A0G(int i, CharSequence charSequence) {
        A0N(charSequence, i, false);
    }

    public final void A0J(Typeface typeface, int i) {
        Typeface create;
        int i2;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            TextPaint textPaint = this.A0b;
            textPaint.setTypeface(create);
            if (create != null) {
                i2 = create.getStyle();
            } else {
                i2 = 0;
            }
            int i3 = (i2 ^ (-1)) & 1;
            if ((i3 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        } else {
            TextPaint textPaint2 = this.A0b;
            textPaint2.setFakeBoldText(false);
            textPaint2.setTextSkewX(0.0f);
            textPaint2.setTypeface(typeface);
        }
        A0R();
    }

    public final boolean A0Q(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return false;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        SparseArray sparseArray = this.A0c;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) sparseArray.get(colorForState);
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(colorForState, mode);
            sparseArray.put(colorForState, porterDuffColorFilter);
        }
        PorterDuffColorFilter porterDuffColorFilter2 = this.A0D;
        this.A0D = porterDuffColorFilter;
        this.A0b.setColorFilter(porterDuffColorFilter);
        return porterDuffColorFilter2 == null || !porterDuffColorFilter2.equals(this.A0D);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private void A00() {
        boolean z;
        int i;
        C9ZQ c9zq;
        int i2;
        int lastIndexOf;
        CharSequence charSequence = this.A0F;
        if (charSequence != null) {
            int i3 = this.A0U;
            if (i3 > 0) {
                charSequence = AbstractC85253rG.A01(A08(), "", charSequence, this.A0W, i3, this.A0Y);
                if (!charSequence.equals(this.A0F)) {
                    charSequence = TextUtils.concat(charSequence, this.A0W);
                }
                if (this.A0Q && (lastIndexOf = charSequence.toString().lastIndexOf(32)) != -1) {
                    charSequence = TextUtils.concat(TextUtils.concat(charSequence.subSequence(0, lastIndexOf), " "), charSequence.subSequence(lastIndexOf + 1, charSequence.length()));
                }
            }
            TextPaint textPaint = this.A0b;
            textPaint.setColorFilter(this.A0D);
            this.A0G = new StaticLayout(charSequence, textPaint, this.A07, this.A0E, this.A03, this.A02, false);
            this.A0L = charSequence;
            if (!TextUtils.isEmpty(this.A0F)) {
                z = AbstractC13670mt.A0A(this.A0F);
            } else {
                z = false;
            }
            int i4 = 0;
            if (z) {
                String obj = this.A0F.toString();
                int length = this.A0F.length();
                Rect rect = this.A0a;
                textPaint.getTextBounds(obj, 0, length, rect);
                int height = rect.height();
                StaticLayout staticLayout = this.A0G;
                if (staticLayout != null) {
                    i2 = staticLayout.getLineBottom(0);
                } else {
                    i2 = 0;
                }
                i4 = Math.max(0, height - i2);
            }
            this.A08 = i4;
            this.A0A = C6RE.A02(this.A0G) + Math.round(this.A00 * 2.0f);
            StaticLayout staticLayout2 = this.A0G;
            if (staticLayout2 != null) {
                i = staticLayout2.getHeight();
            } else {
                i = 0;
            }
            this.A06 = i + Math.round(this.A01 * 2.0f) + this.A08;
            this.A0H = null;
            A02();
            if (this.A0I == C6RC.A08) {
                ArrayList arrayList = new ArrayList();
                if (this.A0G != null) {
                    Path path = new Path();
                    float f = this.A00;
                    if (A0P()) {
                        f -= C6RE.A00(this.A0G);
                    }
                    float f2 = this.A01 + this.A08;
                    float f3 = 0.0f;
                    for (int i5 = 0; i5 < this.A0G.getLineCount(); i5++) {
                        Path path2 = new Path();
                        float lineLeft = f + this.A0G.getLineLeft(i5);
                        float lineBaseline = f2 + this.A0G.getLineBaseline(i5);
                        int lineStart = this.A0G.getLineStart(i5);
                        int lineEnd = this.A0G.getLineEnd(i5);
                        textPaint.getTextPath(this.A0F.toString(), lineStart, lineEnd, lineLeft, lineBaseline, path2);
                        path.addPath(path2);
                        PathMeasure pathMeasure = new PathMeasure(path2, false);
                        float length2 = pathMeasure.getLength();
                        float f4 = 0.0f;
                        while (true) {
                            length2 += f4;
                            if (!pathMeasure.nextContour()) {
                                break;
                            } else {
                                f4 = pathMeasure.getLength();
                            }
                        }
                        f3 += length2;
                        ArrayList A07 = AbstractC13670mt.A07(this.A0F.subSequence(lineStart, lineEnd));
                        for (int i6 = 0; i6 < A07.size(); i6++) {
                            int intValue = lineStart + ((Number) A07.get(i6)).intValue();
                            if (intValue >= 0) {
                                Rect rect2 = new Rect();
                                float measureText = textPaint.measureText(this.A0F, lineStart, intValue);
                                textPaint.getTextBounds(this.A0F.toString(), intValue, Math.min(intValue + 2, this.A0F.length()), rect2);
                                RectF rectF = new RectF(rect2);
                                rectF.offset(lineLeft + measureText, lineBaseline);
                                Path path3 = new Path();
                                path3.addRect(rectF, Path.Direction.CW);
                                PathMeasure pathMeasure2 = new PathMeasure(path3, false);
                                float length3 = pathMeasure2.getLength();
                                float f5 = 0.0f;
                                while (true) {
                                    length3 += f5;
                                    if (!pathMeasure2.nextContour()) {
                                        break;
                                    } else {
                                        f5 = pathMeasure2.getLength();
                                    }
                                }
                                f3 += length3;
                                path.addPath(path3);
                            }
                        }
                    }
                    if (f3 > 0.0f) {
                        Random random = new Random();
                        String replaceAll = this.A0F.toString().replaceAll("\\s+", "");
                        for (int i7 = 0; i7 < Math.min(16, ((int) Math.floor(replaceAll.length() / 3.0f)) + 3); i7++) {
                            float nextFloat = random.nextFloat() * f3;
                            PathMeasure pathMeasure3 = new PathMeasure(path, false);
                            while (pathMeasure3.getLength() < nextFloat) {
                                nextFloat -= pathMeasure3.getLength();
                                if (!pathMeasure3.nextContour()) {
                                    break;
                                }
                            }
                            float[] fArr = new float[2];
                            pathMeasure3.getPosTan(nextFloat, fArr, null);
                            arrayList.add(Float.valueOf(fArr[0]));
                            arrayList.add(Float.valueOf(fArr[1]));
                            arrayList.add(Float.valueOf(1.0f));
                        }
                    }
                }
                c9zq = new C9ZQ(arrayList);
            } else {
                this.A0J = null;
                c9zq = null;
            }
            C6RC c6rc = this.A0I;
            if (c6rc != null) {
                this.A0J = new C6RD(textPaint.getTypeface(), c6rc, c9zq, null, 1.0f, 1.0f, 0.0f, AbstractC13880nE.A02(this.A0Z, textPaint.getTextSize()) / this.A04, this.A05, this.A09, this.A0P);
            }
        }
    }

    private void A01() {
        if (!TextUtils.isEmpty(this.A0F)) {
            for (ViewTreeObserver.OnPreDrawListener onPreDrawListener : (ViewTreeObserver.OnPreDrawListener[]) C4GL.A06(this.A0F, ViewTreeObserver.OnPreDrawListener.class)) {
                onPreDrawListener.onPreDraw();
            }
        }
    }

    private void A02() {
        Bitmap bitmap = this.A0C;
        if (bitmap != null) {
            bitmap.recycle();
            this.A0C = null;
        }
        if (this.A0A > 0 && this.A06 > 0) {
            if ((this.A0R && !TextUtils.isEmpty(this.A0F) && AbstractC13670mt.A0A(this.A0F)) || this.A0B != null) {
                TextPaint textPaint = this.A0b;
                Bitmap createBitmap = Bitmap.createBitmap(this.A0A, this.A06 + Math.round((textPaint.getFontMetricsInt(null) * (this.A03 - 1.0f)) + this.A02), Bitmap.Config.ARGB_8888);
                this.A0C = createBitmap;
                Canvas canvas = new Canvas(createBitmap);
                textPaint.setColorFilter(null);
                A03(canvas);
                textPaint.setColorFilter(this.A0D);
            }
        }
    }

    public final C57482kN A08() {
        TextPaint textPaint = this.A0b;
        int i = this.A07;
        return new C57482kN(Layout.Alignment.ALIGN_NORMAL, textPaint, null, this.A02, this.A03, i, false);
    }

    public void A0A(float f) {
        this.A0b.setTextSize(f);
        A0R();
    }

    public final void A0B(float f, float f2) {
        this.A02 = f;
        this.A03 = f2;
        A0R();
    }

    public final void A0C(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        A0R();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.74d] */
    public final void A0D(float f, float f2, float f3, int i) {
        ?? obj = new Object();
        obj.A02 = f;
        obj.A00 = f2;
        obj.A01 = f3;
        obj.A03 = i;
        this.A0K = obj;
        this.A0b.setShadowLayer(f, f2, f3, i);
        A0R();
    }

    public final void A0E(int i) {
        this.A07 = i;
        A0R();
    }

    public final void A0F(int i) {
        TextPaint textPaint = this.A0b;
        if (textPaint.getColor() != i) {
            textPaint.setColor(i);
            A0R();
        }
    }

    public final void A0H(Canvas canvas) {
        canvas.translate(this.A00, this.A01 + this.A08);
        if (A0P()) {
            canvas.translate(-C6RE.A00(this.A0G), 0.0f);
        }
    }

    public final void A0I(Typeface typeface) {
        this.A0b.setTypeface(typeface);
        A0R();
    }

    public final void A0K(Layout.Alignment alignment) {
        if (this.A0E != alignment) {
            this.A0E = alignment;
            A0R();
        }
    }

    public void A0L(Spannable spannable) {
        Spannable spannable2 = this.A0F;
        if (spannable2 == A0d || !spannable2.equals(spannable)) {
            this.A0F = spannable;
            if (spannable != null) {
                C2UX.A00().A8N(spannable, -1);
            }
            A0R();
        }
    }

    public void A0M(CharSequence charSequence) {
        A0L(new SpannableString(charSequence));
    }

    public final void A0N(CharSequence charSequence, int i, boolean z) {
        this.A0U = i;
        this.A0W = charSequence;
        this.A0Y = z;
        A0R();
    }

    public final boolean A0O() {
        StaticLayout staticLayout = this.A0G;
        if (staticLayout == null) {
            return false;
        }
        return C6H7.A02().A04(staticLayout.getText().toString());
    }

    public final boolean A0P() {
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        if (!this.A0O) {
            alignment = this.A0E;
            alignment2 = Layout.Alignment.ALIGN_NORMAL;
        } else {
            boolean A0O = A0O();
            alignment = this.A0E;
            if (A0O) {
                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                if (alignment == Layout.Alignment.ALIGN_NORMAL) {
                    return false;
                }
                return true;
            }
        }
        if (alignment == alignment2) {
            return false;
        }
        return true;
    }

    public void A0T(Canvas canvas) {
        if (this.A0H == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0L);
            ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = (ViewTreeObserver.OnPreDrawListener[]) C4GL.A06(spannableStringBuilder, ViewTreeObserver.OnPreDrawListener.class);
            for (int i = 0; i < onPreDrawListenerArr.length; i++) {
                ViewTreeObserver.OnPreDrawListener onPreDrawListener = onPreDrawListenerArr[i];
                if ((onPreDrawListener instanceof C6S1) && ((C6S1) onPreDrawListener).Bz4() == C05F.A00) {
                    spannableStringBuilder.removeSpan(onPreDrawListenerArr[i]);
                }
            }
            this.A0H = new StaticLayout(spannableStringBuilder, this.A0b, this.A07, this.A0E, this.A03, this.A02, false);
        }
        canvas.save();
        canvas.translate(this.A0S, this.A0T);
        A0H(canvas);
        StaticLayout staticLayout = this.A0H;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A0b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (this.A0B == null) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.A0S = rect.left;
        this.A0T = rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return A0Q(this.A0B, this.A0V);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C1572374d c1572374d;
        this.A0b.setAlpha(i);
        Spannable spannable = this.A0F;
        if (spannable != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) spannable.getSpans(0, spannable.length(), ImageSpan.class)) {
                Drawable drawable = imageSpan.getDrawable();
                if (drawable != null) {
                    drawable.mutate().setAlpha(i);
                }
            }
            for (InterfaceC190878cj interfaceC190878cj : (InterfaceC190878cj[]) spannable.getSpans(0, spannable.length(), InterfaceC190878cj.class)) {
                ((C190868ci) interfaceC190878cj).A03 = Integer.valueOf(i);
            }
        }
        if (this.A0N && (c1572374d = this.A0K) != null) {
            A0D(c1572374d.A02, c1572374d.A00, c1572374d.A01, AbstractC56842jH.A06(c1572374d.A03, (int) (i * 0.8f)));
        }
        A0R();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0b.setColorFilter(colorFilter);
        A0R();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.A0B = colorStateList;
        A00();
        A0Q(colorStateList, this.A0V);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.A0V = mode;
        this.A0c.clear();
        A0Q(this.A0B, this.A0V);
    }

    public C6RB(Context context, int i) {
        Spannable spannable = A0d;
        this.A0F = spannable;
        this.A0L = spannable;
        this.A0H = null;
        this.A0X = "TextDrawable";
        this.A0E = Layout.Alignment.ALIGN_CENTER;
        this.A0W = "";
        this.A02 = 0.0f;
        this.A03 = 1.0f;
        this.A0V = PorterDuff.Mode.SRC_IN;
        this.A0c = new SparseArray();
        this.A0N = false;
        this.A0Q = false;
        this.A0I = null;
        this.A0J = null;
        this.A04 = 1.0f;
        this.A05 = 0.5f;
        this.A09 = -1;
        this.A0P = false;
        this.A07 = i;
        this.A0Z = context;
        TextPaint textPaint = new TextPaint();
        this.A0b = textPaint;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setFilterBitmap(true);
        textPaint.setColor(-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A03(android.graphics.Canvas r3) {
        /*
            r2 = this;
            r2.A01()
            r3.save()
            r2.A0H(r3)
            android.text.StaticLayout r0 = r2.A0G     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L11 java.lang.NullPointerException -> L1d
            if (r0 == 0) goto L2a
            r0.draw(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L11 java.lang.NullPointerException -> L1d
            goto L2a
        L11:
            android.text.Spannable r1 = r2.A0F
            java.lang.Class<android.view.ViewTreeObserver$OnPreDrawListener> r0 = android.view.ViewTreeObserver.OnPreDrawListener.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            X.C4GL.A05(r1, r0)
            goto L23
        L1d:
            android.text.Spannable r1 = r2.A0F
            r0 = 0
            r1.removeSpan(r0)
        L23:
            android.text.StaticLayout r0 = r2.A0G
            if (r0 == 0) goto L2a
            r0.draw(r3)
        L2a:
            r3.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6RB.A03(android.graphics.Canvas):void");
    }

    public void A0R() {
        A00();
        invalidateSelf();
    }

    public void A0S(Canvas canvas) {
        canvas.save();
        canvas.translate(this.A0S, this.A0T);
        A01();
        A0H(canvas);
        for (ViewTreeObserver.OnPreDrawListener onPreDrawListener : (ViewTreeObserver.OnPreDrawListener[]) C4GL.A06((Spanned) this.A0L, ViewTreeObserver.OnPreDrawListener.class)) {
            if (onPreDrawListener instanceof C6S1) {
                C6S1 c6s1 = (C6S1) onPreDrawListener;
                if (c6s1.Bz4() == C05F.A00) {
                    ((C6S0) c6s1).AQP(canvas);
                }
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.A0S, this.A0T);
        Bitmap bitmap = this.A0C;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A0b);
        } else {
            A03(canvas);
        }
        canvas.restore();
    }
}
