package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.facebook.forker.Process;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.2hS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55862hS extends AbstractC55872hT {
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public Q2H A00;
    public boolean A01;
    public ColorFilter A02;
    public PorterDuffColorFilter A03;
    public boolean A04;
    public final Matrix A05;
    public final Rect A06;
    public final float[] A07;

    public final PorterDuffColorFilter A00(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.A06;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.A02;
        if (colorFilter == null) {
            colorFilter = this.A03;
        }
        Matrix matrix = this.A05;
        canvas.getMatrix(matrix);
        float[] fArr = this.A07;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(C3OO.FLAG_MOVED, (int) (rect.width() * abs));
        int min2 = Math.min(C3OO.FLAG_MOVED, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        Q2H q2h = this.A00;
        Bitmap bitmap = q2h.A04;
        if (bitmap == null || min != bitmap.getWidth() || min2 != q2h.A04.getHeight()) {
            q2h.A04 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            q2h.A0A = true;
        }
        boolean z = this.A01;
        Q2H q2h2 = this.A00;
        if (!z) {
            q2h2.A00(min, min2);
        } else if (q2h2.A0A || q2h2.A02 != q2h2.A03 || q2h2.A06 != q2h2.A07 || q2h2.A0B != q2h2.A09 || q2h2.A00 != q2h2.A08.A04) {
            q2h2.A00(min, min2);
            Q2H q2h3 = this.A00;
            q2h3.A02 = q2h3.A03;
            q2h3.A06 = q2h3.A07;
            q2h3.A00 = q2h3.A08.A04;
            q2h3.A0B = q2h3.A09;
            q2h3.A0A = false;
        }
        Q2H q2h4 = this.A00;
        if (q2h4.A08.A04 >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (q2h4.A05 == null) {
                Paint paint2 = new Paint();
                q2h4.A05 = paint2;
                paint2.setFilterBitmap(true);
            }
            q2h4.A05.setAlpha(q2h4.A08.A04);
            q2h4.A05.setColorFilter(colorFilter);
            paint = q2h4.A05;
        }
        canvas.drawBitmap(q2h4.A04, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.A00.A08.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.A00.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            final Drawable.ConstantState constantState = drawable.getConstantState();
            return new Drawable.ConstantState(constantState) { // from class: X.9Rc
                public final Drawable.ConstantState A00;

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final boolean canApplyTheme() {
                    return this.A00.canApplyTheme();
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public int getChangingConfigurations() {
                    return this.A00.getChangingConfigurations();
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final Drawable newDrawable(Resources resources) {
                    C55862hS c55862hS = new C55862hS();
                    ((AbstractC55872hT) c55862hS).A00 = this.A00.newDrawable(resources);
                    return c55862hS;
                }

                {
                    this.A00 = constantState;
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
                    C55862hS c55862hS = new C55862hS();
                    ((AbstractC55872hT) c55862hS).A00 = this.A00.newDrawable(resources, theme);
                    return c55862hS;
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final Drawable newDrawable() {
                    C55862hS c55862hS = new C55862hS();
                    ((AbstractC55872hT) c55862hS).A00 = this.A00.newDrawable();
                    return c55862hS;
                }
            };
        }
        this.A00.A01 = getChangingConfigurations();
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.A00.A08.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.A00.A08.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int i;
        TypedArray obtainStyledAttributes2;
        int i2;
        int i3;
        TypedArray obtainStyledAttributes3;
        int i4;
        Q9k q9k;
        TypedArray obtainStyledAttributes4;
        int i5;
        int i6;
        ColorStateList A01;
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        Q2H q2h = this.A00;
        q2h.A08 = new C63303Sh9();
        int[] iArr = A4E.A05;
        if (theme == null) {
            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
        } else {
            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        Q2H q2h2 = this.A00;
        C63303Sh9 c63303Sh9 = q2h2.A08;
        if (!AbstractC63040SbG.A02("tintMode", xmlPullParser)) {
            i = -1;
        } else {
            i = obtainStyledAttributes.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case Process.SIGTERM /* 15 */:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.ADD;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
            }
        } else {
            mode = PorterDuff.Mode.SRC_OVER;
        }
        q2h2.A07 = mode;
        if (AbstractC63040SbG.A02("tint", xmlPullParser)) {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 != 2) {
                if (i7 >= 28 && i7 <= 31) {
                    A01 = ColorStateList.valueOf(typedValue.data);
                } else {
                    Resources resources2 = obtainStyledAttributes.getResources();
                    try {
                        A01 = AbstractC110684yg.A01(theme, resources2, resources2.getXml(obtainStyledAttributes.getResourceId(1, 0)));
                    } catch (Exception e) {
                        android.util.Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    }
                }
                if (A01 != null) {
                    q2h2.A03 = A01;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to resolve attribute at index ");
                sb.append(1);
                sb.append(": ");
                sb.append(typedValue);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        boolean z = q2h2.A09;
        if (AbstractC63040SbG.A02("autoMirrored", xmlPullParser)) {
            z = obtainStyledAttributes.getBoolean(5, z);
        }
        q2h2.A09 = z;
        float f = c63303Sh9.A03;
        if (AbstractC63040SbG.A02("viewportWidth", xmlPullParser)) {
            f = obtainStyledAttributes.getFloat(7, f);
        }
        c63303Sh9.A03 = f;
        float f2 = c63303Sh9.A02;
        if (AbstractC63040SbG.A02("viewportHeight", xmlPullParser)) {
            f2 = obtainStyledAttributes.getFloat(8, f2);
        }
        c63303Sh9.A02 = f2;
        if (c63303Sh9.A03 > 0.0f) {
            if (f2 > 0.0f) {
                c63303Sh9.A01 = obtainStyledAttributes.getDimension(3, c63303Sh9.A01);
                float dimension = obtainStyledAttributes.getDimension(2, c63303Sh9.A00);
                c63303Sh9.A00 = dimension;
                if (c63303Sh9.A01 > 0.0f) {
                    if (dimension > 0.0f) {
                        float alpha = c63303Sh9.getAlpha();
                        if (AbstractC63040SbG.A02("alpha", xmlPullParser)) {
                            alpha = obtainStyledAttributes.getFloat(4, alpha);
                        }
                        c63303Sh9.setAlpha(alpha);
                        String string = obtainStyledAttributes.getString(0);
                        if (string != null) {
                            c63303Sh9.A09 = string;
                            c63303Sh9.A0E.put(string, c63303Sh9);
                        }
                        obtainStyledAttributes.recycle();
                        q2h.A01 = getChangingConfigurations();
                        q2h.A0A = true;
                        Q2H q2h3 = this.A00;
                        C63303Sh9 c63303Sh92 = q2h3.A08;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        arrayDeque.push(c63303Sh92.A0F);
                        int eventType = xmlPullParser.getEventType();
                        int depth = xmlPullParser.getDepth() + 1;
                        boolean z2 = true;
                        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                            if (eventType == 2) {
                                String name = xmlPullParser.getName();
                                Q9n q9n = (Q9n) arrayDeque.peek();
                                if (q9n != null) {
                                    if ("path".equals(name)) {
                                        Q9l q9l = new Q9l();
                                        int[] iArr2 = A4E.A04;
                                        if (theme == null) {
                                            obtainStyledAttributes4 = resources.obtainAttributes(attributeSet, iArr2);
                                        } else {
                                            obtainStyledAttributes4 = theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                                        }
                                        q9l.A0B = null;
                                        if (AbstractC63040SbG.A02("pathData", xmlPullParser)) {
                                            String string2 = obtainStyledAttributes4.getString(0);
                                            if (string2 != null) {
                                                ((AbstractC58791Q9m) q9l).A02 = string2;
                                            }
                                            String string3 = obtainStyledAttributes4.getString(2);
                                            if (string3 != null) {
                                                ((AbstractC58791Q9m) q9l).A03 = AbstractC63041SbH.A02(string3);
                                            }
                                            q9l.A09 = AbstractC63040SbG.A01(theme, obtainStyledAttributes4, "fillColor", xmlPullParser, 1);
                                            float f3 = q9l.A00;
                                            if (AbstractC63040SbG.A02("fillAlpha", xmlPullParser)) {
                                                f3 = obtainStyledAttributes4.getFloat(12, f3);
                                            }
                                            q9l.A00 = f3;
                                            if (!AbstractC63040SbG.A02("strokeLineCap", xmlPullParser)) {
                                                i5 = -1;
                                            } else {
                                                i5 = obtainStyledAttributes4.getInt(8, -1);
                                            }
                                            Paint.Cap cap = q9l.A07;
                                            if (i5 != 0) {
                                                if (i5 != 1) {
                                                    if (i5 == 2) {
                                                        cap = Paint.Cap.SQUARE;
                                                    }
                                                } else {
                                                    cap = Paint.Cap.ROUND;
                                                }
                                            } else {
                                                cap = Paint.Cap.BUTT;
                                            }
                                            q9l.A07 = cap;
                                            if (!AbstractC63040SbG.A02("strokeLineJoin", xmlPullParser)) {
                                                i6 = -1;
                                            } else {
                                                i6 = obtainStyledAttributes4.getInt(9, -1);
                                            }
                                            Paint.Join join = q9l.A08;
                                            if (i6 != 0) {
                                                if (i6 != 1) {
                                                    if (i6 == 2) {
                                                        join = Paint.Join.BEVEL;
                                                    }
                                                } else {
                                                    join = Paint.Join.ROUND;
                                                }
                                            } else {
                                                join = Paint.Join.MITER;
                                            }
                                            q9l.A08 = join;
                                            float f4 = q9l.A02;
                                            if (AbstractC63040SbG.A02("strokeMiterLimit", xmlPullParser)) {
                                                f4 = obtainStyledAttributes4.getFloat(10, f4);
                                            }
                                            q9l.A02 = f4;
                                            q9l.A0A = AbstractC63040SbG.A01(theme, obtainStyledAttributes4, "strokeColor", xmlPullParser, 3);
                                            float f5 = q9l.A01;
                                            if (AbstractC63040SbG.A02("strokeAlpha", xmlPullParser)) {
                                                f5 = obtainStyledAttributes4.getFloat(11, f5);
                                            }
                                            q9l.A01 = f5;
                                            float f6 = q9l.A03;
                                            if (AbstractC63040SbG.A02("strokeWidth", xmlPullParser)) {
                                                f6 = obtainStyledAttributes4.getFloat(4, f6);
                                            }
                                            q9l.A03 = f6;
                                            float f7 = q9l.A04;
                                            if (AbstractC63040SbG.A02("trimPathEnd", xmlPullParser)) {
                                                f7 = obtainStyledAttributes4.getFloat(6, f7);
                                            }
                                            q9l.A04 = f7;
                                            float f8 = q9l.A05;
                                            if (AbstractC63040SbG.A02("trimPathOffset", xmlPullParser)) {
                                                f8 = obtainStyledAttributes4.getFloat(7, f8);
                                            }
                                            q9l.A05 = f8;
                                            float f9 = q9l.A06;
                                            if (AbstractC63040SbG.A02("trimPathStart", xmlPullParser)) {
                                                f9 = obtainStyledAttributes4.getFloat(5, f9);
                                            }
                                            q9l.A06 = f9;
                                            int i8 = ((AbstractC58791Q9m) q9l).A01;
                                            if (AbstractC63040SbG.A02("fillType", xmlPullParser)) {
                                                i8 = obtainStyledAttributes4.getInt(13, i8);
                                            }
                                            ((AbstractC58791Q9m) q9l).A01 = i8;
                                        }
                                        obtainStyledAttributes4.recycle();
                                        q9n.A0C.add(q9l);
                                        Object obj = ((AbstractC58791Q9m) q9l).A02;
                                        if (obj != null) {
                                            c63303Sh92.A0E.put(obj, q9l);
                                        }
                                        z2 = false;
                                        q9k = q9l;
                                    } else if ("clip-path".equals(name)) {
                                        Q9k q9k2 = new Q9k();
                                        if (AbstractC63040SbG.A02("pathData", xmlPullParser)) {
                                            int[] iArr3 = A4E.A02;
                                            if (theme == null) {
                                                obtainStyledAttributes3 = resources.obtainAttributes(attributeSet, iArr3);
                                            } else {
                                                obtainStyledAttributes3 = theme.obtainStyledAttributes(attributeSet, iArr3, 0, 0);
                                            }
                                            String string4 = obtainStyledAttributes3.getString(0);
                                            if (string4 != null) {
                                                q9k2.A02 = string4;
                                            }
                                            String string5 = obtainStyledAttributes3.getString(1);
                                            if (string5 != null) {
                                                q9k2.A03 = AbstractC63041SbH.A02(string5);
                                            }
                                            if (!AbstractC63040SbG.A02("fillType", xmlPullParser)) {
                                                i4 = 0;
                                            } else {
                                                i4 = obtainStyledAttributes3.getInt(2, 0);
                                            }
                                            q9k2.A01 = i4;
                                            obtainStyledAttributes3.recycle();
                                        }
                                        q9n.A0C.add(q9k2);
                                        String str = q9k2.A02;
                                        q9k = q9k2;
                                        if (str != null) {
                                            c63303Sh92.A0E.put(str, q9k2);
                                            q9k = q9k2;
                                        }
                                    } else if ("group".equals(name)) {
                                        Q9n q9n2 = new Q9n();
                                        int[] iArr4 = A4E.A03;
                                        if (theme == null) {
                                            obtainStyledAttributes2 = resources.obtainAttributes(attributeSet, iArr4);
                                        } else {
                                            obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr4, 0, 0);
                                        }
                                        q9n2.A09 = null;
                                        float f10 = q9n2.A02;
                                        if (AbstractC63040SbG.A02("rotation", xmlPullParser)) {
                                            f10 = obtainStyledAttributes2.getFloat(5, f10);
                                        }
                                        q9n2.A02 = f10;
                                        q9n2.A00 = obtainStyledAttributes2.getFloat(1, q9n2.A00);
                                        q9n2.A01 = obtainStyledAttributes2.getFloat(2, q9n2.A01);
                                        float f11 = q9n2.A03;
                                        if (AbstractC63040SbG.A02("scaleX", xmlPullParser)) {
                                            f11 = obtainStyledAttributes2.getFloat(3, f11);
                                        }
                                        q9n2.A03 = f11;
                                        float f12 = q9n2.A04;
                                        if (AbstractC63040SbG.A02("scaleY", xmlPullParser)) {
                                            f12 = obtainStyledAttributes2.getFloat(4, f12);
                                        }
                                        q9n2.A04 = f12;
                                        float f13 = q9n2.A05;
                                        if (AbstractC63040SbG.A02("translateX", xmlPullParser)) {
                                            f13 = obtainStyledAttributes2.getFloat(6, f13);
                                        }
                                        q9n2.A05 = f13;
                                        float f14 = q9n2.A06;
                                        if (AbstractC63040SbG.A02("translateY", xmlPullParser)) {
                                            f14 = obtainStyledAttributes2.getFloat(7, f14);
                                        }
                                        q9n2.A06 = f14;
                                        String string6 = obtainStyledAttributes2.getString(0);
                                        if (string6 != null) {
                                            q9n2.A08 = string6;
                                        }
                                        Q9n.A00(q9n2);
                                        obtainStyledAttributes2.recycle();
                                        q9n.A0C.add(q9n2);
                                        arrayDeque.push(q9n2);
                                        String str2 = q9n2.A08;
                                        if (str2 != null) {
                                            c63303Sh92.A0E.put(str2, q9n2);
                                        }
                                        i2 = q2h3.A01;
                                        i3 = q9n2.A07;
                                        q2h3.A01 = i3 | i2;
                                    }
                                    i2 = q2h3.A01;
                                    i3 = q9k.A00;
                                    q2h3.A01 = i3 | i2;
                                }
                            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                arrayDeque.pop();
                            }
                            eventType = xmlPullParser.next();
                        }
                        if (!z2) {
                            this.A03 = A00(q2h.A03, q2h.A07);
                            return;
                        }
                        throw new XmlPullParserException("no path defined");
                    }
                    throw new XmlPullParserException(AnonymousClass001.A0R(obtainStyledAttributes.getPositionDescription(), "<vector> tag requires height > 0"));
                }
                throw new XmlPullParserException(AnonymousClass001.A0R(obtainStyledAttributes.getPositionDescription(), "<vector> tag requires width > 0"));
            }
            throw new XmlPullParserException(AnonymousClass001.A0R(obtainStyledAttributes.getPositionDescription(), "<vector> tag requires viewportHeight > 0"));
        }
        throw new XmlPullParserException(AnonymousClass001.A0R(obtainStyledAttributes.getPositionDescription(), "<vector> tag requires viewportWidth > 0"));
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.A00.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            Q2H q2h = this.A00;
            if (q2h != null) {
                C63303Sh9 c63303Sh9 = q2h.A08;
                Boolean bool = c63303Sh9.A08;
                if (bool == null) {
                    bool = Boolean.valueOf(c63303Sh9.A0F.A01());
                    c63303Sh9.A08 = bool;
                }
                if (!bool.booleanValue()) {
                    ColorStateList colorStateList = this.A00.A03;
                    if (colorStateList != null && colorStateList.isStateful()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.Drawable$ConstantState, X.Q2H] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.mutate();
        } else if (!this.A04 && super.mutate() == this) {
            Q2H q2h = this.A00;
            ?? constantState = new Drawable.ConstantState();
            constantState.A03 = null;
            constantState.A07 = A08;
            if (q2h != null) {
                constantState.A01 = q2h.A01;
                C63303Sh9 c63303Sh9 = new C63303Sh9(q2h.A08);
                constantState.A08 = c63303Sh9;
                Paint paint = q2h.A08.A05;
                if (paint != null) {
                    c63303Sh9.A05 = new Paint(paint);
                }
                Paint paint2 = q2h.A08.A06;
                if (paint2 != null) {
                    constantState.A08.A06 = new Paint(paint2);
                }
                constantState.A03 = q2h.A03;
                constantState.A07 = q2h.A07;
                constantState.A09 = q2h.A09;
            }
            this.A00 = constantState;
            this.A04 = true;
            return this;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        Q2H q2h = this.A00;
        ColorStateList colorStateList = q2h.A03;
        if (colorStateList != null && (mode = q2h.A07) != null) {
            this.A03 = A00(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C63303Sh9 c63303Sh9 = q2h.A08;
        Boolean bool = c63303Sh9.A08;
        if (bool == null) {
            bool = Boolean.valueOf(c63303Sh9.A0F.A01());
            c63303Sh9.A08 = bool;
        }
        if (bool.booleanValue()) {
            boolean A02 = q2h.A08.A0F.A02(iArr);
            q2h.A0A |= A02;
            if (A02) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        C63303Sh9 c63303Sh9 = this.A00.A08;
        if (c63303Sh9.A04 == i) {
            return;
        }
        c63303Sh9.A04 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.A00.A09 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.A02 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        Q2H q2h = this.A00;
        if (q2h.A03 == colorStateList) {
            return;
        }
        q2h.A03 = colorStateList;
        this.A03 = A00(colorStateList, q2h.A07);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        Q2H q2h = this.A00;
        if (q2h.A07 == mode) {
            return;
        }
        q2h.A07 = mode;
        this.A03 = A00(q2h.A03, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public C55862hS(Q2H q2h) {
        this.A01 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A00 = q2h;
        this.A03 = A00(q2h.A03, q2h.A07);
    }

    public C55862hS() {
        this.A01 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A00 = new Q2H();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
