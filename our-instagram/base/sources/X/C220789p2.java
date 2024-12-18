package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import com.facebook.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9p2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220789p2 extends AbstractC130945vi implements InterfaceC55932he, C5RR, InterfaceC133125ze, BCB {
    public static final C55942hf A1B = C55942hf.A03(5.0d, 10.0d);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Shader A0A;
    public Shader A0B;
    public C6RB A0C;
    public C6RB A0D;
    public Integer A0E;
    public Runnable A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public float A0K;
    public float A0L;
    public float A0M;
    public float A0N;
    public float A0O;
    public float A0P;
    public float A0Q;
    public float A0R;
    public float A0S;
    public float A0T;
    public float A0U;
    public float A0V;
    public Bitmap A0W;
    public Canvas A0X;
    public int[] A0Y;
    public final int A0Z;
    public final int A0a;
    public final int A0b;
    public final int A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final Context A0h;
    public final C55982hj A0i;
    public final C22914A8k A0j;
    public final C6RB A0k;
    public final C6RB A0l;
    public final String A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final int[] A0p;
    public final int[] A0q;
    public final float A0r;
    public final int A0s;
    public final int A0t;
    public final int A0u;
    public final int A0v;
    public final int A0w;
    public final int A0x;
    public final int A0y;
    public final int A0z;
    public final int A10;
    public final Paint A11;
    public final PorterDuffXfermode A12;
    public final RectF A13;
    public final RectF A14;
    public final Typeface A15;
    public final Drawable.Callback A16;
    public final Drawable A17;
    public final C6RB A18;
    public final int[] A19;
    public final int[] A1A;

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "polling_sticker_vibrant";
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    private float A00(String str, int i) {
        boolean A06;
        Context context = this.A0h;
        C6RB A0X = AbstractC167007dF.A0X(context, this.A0c, this.A0f);
        int dimension = (int) context.getResources().getDimension(R.dimen.audition_flow_picker_subtitle_margin_bottom);
        int i2 = dimension / 2;
        for (int i3 = 1; i3 <= i; i3++) {
            int i4 = ((dimension - i2) / 2) + i2;
            int i5 = dimension;
            int i6 = i2;
            while (true) {
                A06 = A06(A0X, str, i4, i3);
                if (i6 >= i4) {
                    break;
                }
                if (A06) {
                    i6 = i4;
                } else {
                    i5 = i4;
                }
                i4 = ((i5 - i6) / 2) + i6;
            }
            if (A06) {
                return i4;
            }
        }
        return i2;
    }

    public static SpannableString A01(String str, int[] iArr) {
        C9T8 c9t8 = new C9T8(str, C6QG.A00, iArr);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(c9t8, 0, spannableString.length(), 33);
        return spannableString;
    }

    private C6RB A02(int i) {
        Context context = this.A0h;
        Resources resources = context.getResources();
        float A04 = AbstractC166987dD.A04(resources, R.dimen.direct_composer_redesign_background_height);
        C6RB A0X = AbstractC167007dF.A0X(context, this.A0c, this.A0f);
        A0X.A0I(this.A15);
        AbstractC167007dF.A19(A0X, A04, 0.0f);
        A0X.A0F(this.A0x);
        A0X.A0M(AbstractC166997dE.A0r(resources, Integer.valueOf(i), 2131969744));
        return A0X;
    }

    private Integer A03() {
        if (this.A0o) {
            int[] iArr = this.A0Y;
            iArr.getClass();
            int i = iArr[0];
            int[] iArr2 = this.A0Y;
            int i2 = iArr2[1];
            if (i <= i2) {
                if (iArr2[0] < i2) {
                    return C05F.A0Y;
                }
                if (!Arrays.equals(this.A0p, this.A0q)) {
                    return C05F.A0j;
                }
            }
            return C05F.A0N;
        }
        Integer num = this.A0E;
        if (num != null) {
            if (num.intValue() == 0) {
                return C05F.A01;
            }
            return C05F.A0C;
        }
        return C05F.A00;
    }

    private void A04(int i, int i2) {
        this.A0k.A0F(i);
        C6RB c6rb = this.A0C;
        if (c6rb != null) {
            c6rb.A0F(i);
        }
        this.A0l.A0F(i2);
        C6RB c6rb2 = this.A0D;
        if (c6rb2 != null) {
            c6rb2.A0F(i2);
        }
    }

    private boolean A06(C6RB c6rb, String str, int i, int i2) {
        StaticLayout staticLayout;
        c6rb.A0I(this.A15);
        AbstractC167007dF.A19(c6rb, i, 0.0f);
        CharSequence charSequence = str;
        if (!this.A0o) {
            charSequence = A01(str, C6QG.A05);
        }
        c6rb.A0M(charSequence);
        if (c6rb.A06 <= this.A0b && (staticLayout = c6rb.A0G) != null && staticLayout.getLineCount() <= i2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC130945vi
    public final Integer A08() {
        return C05F.A0C;
    }

    @Override // X.AbstractC130945vi
    public final boolean A0A() {
        return !this.A0o;
    }

    public final void A0B(String str) {
        C22914A8k c22914A8k = this.A0j;
        if (c22914A8k != null) {
            if (str != null && c22914A8k.A03.isEmpty()) {
                C6RB c6rb = this.A18;
                c6rb.getClass();
                AbstractC166997dE.A1A(this.A0h, c6rb, R.color.fds_white_alpha60);
                c6rb.A0K = null;
                c6rb.A0b.clearShadowLayer();
                c6rb.A0R();
                c6rb.A0M(str);
            } else {
                Context context = this.A0h;
                C6RB c6rb2 = this.A18;
                c6rb2.getClass();
                AMr.A07(context, c6rb2, c22914A8k.A00, 0.0f);
                c6rb2.A0M(c22914A8k.A03);
            }
            invalidateSelf();
        }
    }

    public final void A0C(int[] iArr) {
        int i;
        Context context;
        C6RB c6rb;
        this.A0Y = iArr;
        C6RB A02 = A02(iArr[0]);
        this.A0C = A02;
        Drawable.Callback callback = this.A16;
        A02.setCallback(callback);
        C6RB c6rb2 = this.A0C;
        this.A04 = c6rb2.A0A;
        this.A03 = c6rb2.A06;
        C6RB A022 = A02(iArr[1]);
        this.A0D = A022;
        A022.setCallback(callback);
        C6RB c6rb3 = this.A0D;
        int i2 = c6rb3.A0A;
        this.A08 = i2;
        this.A07 = c6rb3.A06;
        int i3 = iArr[0];
        if (i3 == 0 && iArr[1] == 0) {
            return;
        }
        int i4 = this.A0f;
        int i5 = i4 * 2;
        int A0A = AbstractC166987dD.A0A(i3 / 100.0f, i5);
        if (A0A > 0) {
            i = Math.max(A0A, Math.max(this.A05, this.A04) + (this.A0w * 2));
        } else {
            i = A0A;
        }
        int i6 = i5 - A0A;
        int i7 = i5 - i;
        if (i7 > 0) {
            i7 = Math.max(i7, Math.max(this.A09, i2) + (this.A0w * 2));
        }
        float f = A0A;
        float f2 = i4;
        this.A0L = f / f2;
        this.A0T = i6 / f2;
        this.A0H = A0A - i4;
        float f3 = f2 / 2.0f;
        this.A0M = ((i5 - i7) / 2.0f) - f3;
        float f4 = this.A10;
        float f5 = f4 - (i7 / 2.0f);
        float f6 = f4 - f3;
        this.A0U = f5 - f6;
        if (i3 == 0) {
            int i8 = this.A0Z;
            this.A0H = (-i8) - i4;
            this.A0M = ((-Math.max(this.A05, this.A04)) / 2.0f) - f3;
            this.A0T = AbstractC166987dD.A03(i8, i6, f2);
        } else if (iArr[1] == 0) {
            this.A0H = r10 - i4;
            this.A0U = (f4 + (Math.max(this.A09, i2) / 2.0f)) - f6;
            this.A0L = AbstractC166987dD.A03(this.A0Z, A0A, f2);
        }
        if (this.A0o) {
            float f7 = this.A0b;
            int[] iArr2 = this.A0p;
            float[] fArr = C6QG.A00;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.A0A = new LinearGradient(0.0f, 0.0f, f, f7, iArr2, fArr, tileMode);
            this.A0B = new LinearGradient(A0A + this.A0Z, 0.0f, r3 + i6, f7, this.A0q, fArr, tileMode);
            int intValue = A03().intValue();
            if (intValue != 3) {
                if (intValue != 4) {
                    if (intValue == 5) {
                        int i9 = this.A0a;
                        A04(i9, i9);
                    }
                } else {
                    A04(this.A0g, this.A0a);
                    if (this.A0n) {
                        context = this.A0h;
                        c6rb = this.A0l;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c6rb.A0F);
                        int length = spannableStringBuilder.length();
                        Drawable mutate = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24).mutate();
                        AbstractC166997dE.A1F(mutate, -1);
                        float textSize = c6rb.A0b.getTextSize() / context.getResources().getDimensionPixelSize(R.dimen.audition_flow_picker_subtitle_margin_bottom);
                        int A0A2 = AbstractC166987dD.A0A(mutate.getIntrinsicWidth(), textSize);
                        mutate.setBounds(0, 0, A0A2, AbstractC166987dD.A0A(AbstractC166987dD.A06(mutate), textSize));
                        int A0D = AbstractC166997dE.A0D(context.getResources());
                        C85973sR c85973sR = new C85973sR(mutate);
                        c85973sR.A02 = C05F.A01;
                        c85973sR.A00 = A0D;
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(c85973sR, length, length + 1, 33);
                        c6rb.A0E((i4 - (this.A0c * 2)) + A0A2 + (A0D * 2));
                        c6rb.A0L(spannableStringBuilder);
                    }
                }
            } else {
                A04(this.A0a, this.A0g);
                if (this.A0n) {
                    context = this.A0h;
                    c6rb = this.A0k;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(c6rb.A0F);
                    int length2 = spannableStringBuilder2.length();
                    Drawable mutate2 = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24).mutate();
                    AbstractC166997dE.A1F(mutate2, -1);
                    float textSize2 = c6rb.A0b.getTextSize() / context.getResources().getDimensionPixelSize(R.dimen.audition_flow_picker_subtitle_margin_bottom);
                    int A0A22 = AbstractC166987dD.A0A(mutate2.getIntrinsicWidth(), textSize2);
                    mutate2.setBounds(0, 0, A0A22, AbstractC166987dD.A0A(AbstractC166987dD.A06(mutate2), textSize2));
                    int A0D2 = AbstractC166997dE.A0D(context.getResources());
                    C85973sR c85973sR2 = new C85973sR(mutate2);
                    c85973sR2.A02 = C05F.A01;
                    c85973sR2.A00 = A0D2;
                    spannableStringBuilder2.append((CharSequence) " ");
                    spannableStringBuilder2.setSpan(c85973sR2, length2, length2 + 1, 33);
                    c6rb.A0E((i4 - (this.A0c * 2)) + A0A22 + (A0D2 * 2));
                    c6rb.A0L(spannableStringBuilder2);
                }
            }
        }
        invalidateSelf();
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        String str;
        float f;
        int i;
        int i2;
        C22914A8k c22914A8k = this.A0j;
        if (c22914A8k != null) {
            f = c22914A8k.A00;
            i = c22914A8k.A01;
            i2 = c22914A8k.A02;
            str = c22914A8k.A03;
        } else {
            str = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        }
        C6RB c6rb = this.A0k;
        String obj = c6rb.A0F.toString();
        C6RB c6rb2 = this.A0l;
        String obj2 = c6rb2.A0F.toString();
        float textSize = c6rb.A0b.getTextSize();
        float textSize2 = c6rb2.A0b.getTextSize();
        AbstractC167017dG.A1P(obj, obj2);
        Al7 al7 = new Al7();
        al7.A05 = obj;
        al7.A07 = obj2;
        al7.A00 = textSize;
        al7.A02 = textSize2;
        al7.A06 = str;
        al7.A01 = f;
        al7.A03 = i;
        al7.A04 = i2;
        return al7;
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        Runnable runnable;
        double d = c55982hj.A01;
        if (d == 1.0d) {
            c55982hj.A06(2.0d);
        } else {
            if (d != 2.0d || (runnable = this.A0F) == null) {
                return;
            }
            runnable.run();
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f = (float) c55982hj.A09.A00;
        float min = Math.min(f, 1.0f);
        double d = min;
        float f2 = this.A00;
        int i = this.A0b;
        int i2 = (i - this.A0d) - this.A03;
        int i3 = this.A0e * 2;
        this.A0J = ((float) AbstractC70163Da.A03(d, f2, (i2 - i3) / this.A02)) - f2;
        float f3 = this.A01;
        this.A0R = ((float) AbstractC70163Da.A03(d, f3, ((r5 - this.A07) - i3) / this.A06)) - f3;
        float f4 = i2 / 2.0f;
        float f5 = i / 2.0f;
        this.A0Q = (float) AbstractC70163Da.A01(d, f4 - f5);
        this.A0P = (float) AbstractC70163Da.A01(d, (r5 - (r10 / 2.0f)) - f5);
        this.A0O = min;
        this.A0G = min * this.A0r;
        if (f > 1.0f) {
            double d2 = f - 1.0f;
            this.A0K = (float) AbstractC70163Da.A03(d2, 1.0d, this.A0L);
            this.A0S = (float) AbstractC70163Da.A03(d2, 1.0d, this.A0T);
            this.A0N = (float) AbstractC70163Da.A01(d2, this.A0M);
            this.A0V = (float) AbstractC70163Da.A01(d2, this.A0U);
            this.A0I = (float) AbstractC70163Da.A01(d2, this.A0H);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        AbstractC167007dF.A0s(canvas, bounds);
        if (this.A0j != null) {
            canvas.save();
            int i = this.A10;
            C6RB c6rb = this.A18;
            c6rb.getClass();
            AbstractC167007dF.A0u(canvas, c6rb, (i - c6rb.A0A) / 2, 0.0f);
            canvas.translate(0.0f, c6rb.A06 + r5.A02);
        }
        Drawable drawable = this.A17;
        if (drawable != null) {
            RectF rectF = this.A13;
            int i2 = (int) rectF.left;
            int i3 = this.A0z;
            drawable.setBounds(i2 - i3, ((int) rectF.top) - i3, ((int) rectF.right) + i3, ((int) rectF.bottom) + i3);
            drawable.draw(canvas);
        }
        RectF rectF2 = this.A13;
        canvas.clipRect(rectF2);
        Integer A03 = A03();
        if (A03 == C05F.A00) {
            Paint paint = this.A11;
            paint.setColor(this.A0s);
            float f = this.A0t;
            canvas.drawRoundRect(rectF2, f, f, paint);
            paint.setColor(this.A0u);
            float f2 = this.A0f + this.A0I;
            canvas.drawRect(f2, 0.0f, f2 + this.A0Z, this.A0b, paint);
        } else {
            if (this.A0W == null) {
                Bitmap createBitmap = Bitmap.createBitmap(this.A10, this.A0b, Bitmap.Config.ARGB_8888);
                this.A0W = createBitmap;
                this.A0X = new Canvas(createBitmap);
            }
            this.A0W.eraseColor(0);
            Canvas canvas2 = this.A0X;
            canvas2.getClass();
            canvas2.save();
            Paint paint2 = this.A11;
            paint2.setColor(this.A0s);
            Canvas canvas3 = this.A0X;
            float f3 = this.A0t;
            canvas3.drawRoundRect(rectF2, f3, f3, paint2);
            paint2.setXfermode(this.A12);
            switch (A03.intValue()) {
                case 0:
                case 1:
                case 2:
                    paint2.setColor(this.A0u);
                    Canvas canvas4 = this.A0X;
                    float f4 = this.A0f + this.A0I;
                    canvas4.drawRect(f4, 0.0f, f4 + this.A0Z, this.A0b, paint2);
                    break;
            }
            int intValue = A03.intValue();
            if (intValue != 3) {
                if (intValue != 4) {
                    if (intValue != 5) {
                        if (intValue != 1) {
                            if (intValue == 2) {
                                paint2.setColor(this.A0y);
                                A05(this.A0X, 1);
                            }
                            paint2.setShader(null);
                            paint2.setXfermode(null);
                            this.A0X.restore();
                            canvas.drawBitmap(this.A0W, 0.0f, 0.0f, paint2);
                        } else {
                            paint2.setColor(this.A0y);
                        }
                    } else {
                        paint2.setShader(this.A0A);
                        A05(this.A0X, 0);
                    }
                }
                paint2.setShader(this.A0B);
                A05(this.A0X, 1);
                paint2.setShader(null);
                paint2.setXfermode(null);
                this.A0X.restore();
                canvas.drawBitmap(this.A0W, 0.0f, 0.0f, paint2);
            } else {
                paint2.setShader(this.A0A);
            }
            A05(this.A0X, 0);
            paint2.setShader(null);
            paint2.setXfermode(null);
            this.A0X.restore();
            canvas.drawBitmap(this.A0W, 0.0f, 0.0f, paint2);
        }
        if (this.A0C != null) {
            canvas.save();
            canvas.translate((this.A0f - this.A04) / 2.0f, (this.A0b - this.A03) / 2.0f);
            canvas.translate(this.A0N, this.A0P);
            float f5 = this.A0O;
            canvas.scale(f5, f5, this.A04 / 2.0f, this.A03 / 2.0f);
            this.A0C.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        int i4 = this.A0f;
        int i5 = this.A0b;
        canvas.translate((i4 - this.A05) / 2.0f, ((i5 - this.A02) + 0.0f) / 2.0f);
        canvas.translate(this.A0N, this.A0Q);
        float f6 = this.A00 + this.A0J;
        canvas.scale(f6, f6, this.A05 / 2.0f, this.A02 / 2.0f);
        this.A0k.draw(canvas);
        canvas.restore();
        if (this.A0D != null) {
            canvas.save();
            canvas.translate(this.A0Z + i4, 0.0f);
            canvas.translate((i4 - this.A08) / 2.0f, (i5 - this.A07) / 2.0f);
            canvas.translate(this.A0V, this.A0P);
            float f7 = this.A0O;
            canvas.scale(f7, f7, this.A08 / 2.0f, this.A07 / 2.0f);
            this.A0D.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(this.A0Z + i4, 0.0f);
        canvas.translate((i4 - this.A09) / 2.0f, ((i5 - this.A06) + 0.0f) / 2.0f);
        canvas.translate(this.A0V, this.A0Q);
        float f8 = this.A01 + this.A0R;
        canvas.scale(f8, f8, this.A09 / 2.0f, this.A06 / 2.0f);
        this.A0l.draw(canvas);
        canvas.restore();
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0v;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A10;
    }

    private void A05(Canvas canvas, int i) {
        boolean z;
        float A02;
        canvas.save();
        switch (A03().intValue()) {
            case 0:
            case 1:
            case 2:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            A02 = 0.0f;
        } else {
            A02 = AbstractC166987dD.A02(this.A0Z) + 1.0f;
        }
        RectF rectF = this.A14;
        if (i == 0) {
            rectF.set(0.0f, 0.0f, (this.A0f * this.A0K) + A02, this.A0b);
        } else {
            float f = this.A10;
            rectF.set((f - (this.A0f * this.A0S)) - A02, 0.0f, f, this.A0b);
        }
        canvas.clipRect(rectF);
        if (this.A0G < this.A0r) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.A0G, this.A11);
        } else {
            canvas.drawRect(rectF, this.A11);
        }
        canvas.restore();
    }

    @Override // X.C5RN
    public final List A07() {
        return Collections.emptyList();
    }

    @Override // X.BCB
    public final Rect BIv() {
        Rect rect = new Rect(getBounds());
        C22914A8k c22914A8k = this.A0j;
        if (c22914A8k != null) {
            int i = rect.top;
            C6RB c6rb = this.A18;
            c6rb.getClass();
            rect.top = i + c6rb.A06 + c22914A8k.A02;
        }
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0190, code lost:
    
        if (r41 != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C220789p2(android.content.Context r20, android.graphics.Typeface r21, X.C22914A8k r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int[] r26, int[] r27, int[] r28, int[] r29, float r30, float r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220789p2.<init>(android.content.Context, android.graphics.Typeface, X.A8k, java.lang.String, java.lang.String, java.lang.String, int[], int[], int[], int[], float, float, int, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
