package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.2Yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51682Yq extends AbstractC50792Va {

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_OFFSET)
    public float A00;

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_TEXT)
    public float A01;

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_OFFSET)
    public float A02;

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_OFFSET)
    public float A03;

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_OFFSET)
    public float A04;

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_OFFSET)
    public float A05;

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.FLOAT)
    public float A06;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A07;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A08;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A09;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A0A;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A0B;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.INT)
    public int A0C;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.INT)
    public int A0D;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_SIZE)
    public int A0E;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.INT)
    public int A0F;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.INT)
    public int A0G;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_SIZE)
    public int A0H;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A0I;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A0J;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A0K;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_TEXT)
    public int A0L;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A0M;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public ColorStateList A0N;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public Typeface A0O;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public TextUtils.TruncateAt A0P;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public C2XI A0Q;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.STRING)
    public CharSequence A0R;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = false, resType = EnumC27347C5c.STRING)
    public CharSequence A0S;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public Integer A0T;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public Integer A0U;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.BOOL)
    public boolean A0V;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A0W;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.BOOL)
    public boolean A0X;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.BOOL)
    public boolean A0Y;
    public C2XI[] A0Z;

    @Override // X.AbstractC50812Vc
    public final boolean A0S() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0T() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final void A0o(C2XE c2xe) {
        TypedArray A02;
        TypedArray A022;
        int i;
        TypedArray obtainStyledAttributes;
        int i2;
        TextUtils.TruncateAt truncateAt = null;
        Float f = null;
        Boolean bool = null;
        Float f2 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Boolean bool2 = null;
        String str = null;
        ColorStateList colorStateList = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Float f3 = null;
        Float f4 = null;
        Float f5 = null;
        Integer num15 = null;
        Integer num16 = null;
        Typeface typeface = null;
        int i3 = AbstractC77713dv.A00;
        TextUtils.TruncateAt[] truncateAtArr = AbstractC23076AFi.A01;
        Resources.Theme theme = c2xe.A0C.getTheme();
        boolean z = C2V3.NEEDS_THEME_SYNCHRONIZATION;
        if (z) {
            synchronized (theme) {
                A02 = c2xe.A02(0, COC.A05);
            }
        } else {
            A02 = c2xe.A02(0, COC.A05);
        }
        int resourceId = A02.getResourceId(0, -1);
        A02.recycle();
        if (resourceId != -1) {
            if (z) {
                synchronized (theme) {
                    obtainStyledAttributes = theme.obtainStyledAttributes(resourceId, COC.A04);
                }
            } else {
                obtainStyledAttributes = theme.obtainStyledAttributes(resourceId, COC.A04);
            }
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i4 = 1;
            String str2 = null;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i2 = -1;
                if (i5 >= indexCount) {
                    break;
                }
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == 9) {
                    str = obtainStyledAttributes.getString(index);
                } else if (index == 2) {
                    colorStateList = obtainStyledAttributes.getColorStateList(index);
                } else if (index == 0) {
                    num9 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 5) {
                    int integer = obtainStyledAttributes.getInteger(index, 0);
                    if (integer > 0) {
                        truncateAt = AbstractC23076AFi.A01[integer - 1];
                    }
                } else if (index == 25) {
                    i4 = obtainStyledAttributes.getInt(index, -1);
                    num10 = AbstractC23076AFi.A00(i4, i6);
                } else if (index == 6) {
                    i6 = obtainStyledAttributes.getInt(index, -1);
                    num10 = AbstractC23076AFi.A00(i4, i6);
                    int i7 = i6 & 112;
                    if (i7 != 16) {
                        if (i7 != 48) {
                            if (i7 != 80) {
                                num16 = AbstractC77713dv.A06;
                            } else {
                                num16 = C05F.A0C;
                            }
                        } else {
                            num16 = C05F.A00;
                        }
                    } else {
                        num16 = C05F.A01;
                    }
                } else if (index == 15) {
                    bool = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                } else if (index == 11) {
                    num = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 10) {
                    num2 = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 14) {
                    bool2 = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                } else if (index == 4) {
                    num7 = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 3) {
                    num8 = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 1) {
                    num14 = Integer.valueOf(obtainStyledAttributes.getInteger(index, 0));
                } else if (index == 20) {
                    f = Float.valueOf(obtainStyledAttributes.getDimensionPixelOffset(index, 0));
                } else if (index == 21) {
                    f2 = Float.valueOf(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 17) {
                    f4 = Float.valueOf(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 18) {
                    f5 = Float.valueOf(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 19) {
                    f3 = Float.valueOf(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 16) {
                    num15 = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 13) {
                    num3 = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 12) {
                    num4 = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 8) {
                    num5 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 7) {
                    num6 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, Integer.MAX_VALUE));
                } else if (index == 24) {
                    str2 = obtainStyledAttributes.getString(index);
                } else if (index == 26) {
                    num11 = Integer.valueOf(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 27) {
                    num12 = Integer.valueOf(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 28) {
                    num13 = Integer.valueOf(obtainStyledAttributes.getInt(index, 0));
                }
                i5++;
            }
            if (str2 != null) {
                if (num14 != null) {
                    i2 = num14.intValue();
                }
                typeface = Typeface.create(str2, i2);
            }
            obtainStyledAttributes.recycle();
        }
        if (z) {
            synchronized (theme) {
                A022 = c2xe.A02(0, COC.A04);
            }
        } else {
            A022 = c2xe.A02(0, COC.A04);
        }
        int indexCount2 = A022.getIndexCount();
        int i8 = 1;
        String str3 = null;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i = -1;
            if (i9 >= indexCount2) {
                break;
            }
            int index2 = A022.getIndex(i9);
            if (index2 == 9) {
                str = A022.getString(index2);
            } else if (index2 == 2) {
                colorStateList = A022.getColorStateList(index2);
            } else if (index2 == 0) {
                num9 = Integer.valueOf(A022.getDimensionPixelSize(index2, 0));
            } else if (index2 == 5) {
                int integer2 = A022.getInteger(index2, 0);
                if (integer2 > 0) {
                    truncateAt = AbstractC23076AFi.A01[integer2 - 1];
                }
            } else if (index2 == 25) {
                i8 = A022.getInt(index2, -1);
                num10 = AbstractC23076AFi.A00(i8, i10);
            } else if (index2 == 6) {
                i10 = A022.getInt(index2, -1);
                num10 = AbstractC23076AFi.A00(i8, i10);
                int i11 = i10 & 112;
                if (i11 != 16) {
                    if (i11 != 48) {
                        if (i11 != 80) {
                            num16 = AbstractC77713dv.A06;
                        } else {
                            num16 = C05F.A0C;
                        }
                    } else {
                        num16 = C05F.A00;
                    }
                } else {
                    num16 = C05F.A01;
                }
            } else if (index2 == 15) {
                bool = Boolean.valueOf(A022.getBoolean(index2, false));
            } else if (index2 == 11) {
                num = Integer.valueOf(A022.getInteger(index2, -1));
            } else if (index2 == 10) {
                num2 = Integer.valueOf(A022.getInteger(index2, -1));
            } else if (index2 == 14) {
                bool2 = Boolean.valueOf(A022.getBoolean(index2, false));
            } else if (index2 == 4) {
                num7 = Integer.valueOf(A022.getColor(index2, 0));
            } else if (index2 == 3) {
                num8 = Integer.valueOf(A022.getColor(index2, 0));
            } else if (index2 == 1) {
                num14 = Integer.valueOf(A022.getInteger(index2, 0));
            } else if (index2 == 20) {
                f = Float.valueOf(A022.getDimensionPixelOffset(index2, 0));
            } else if (index2 == 21) {
                f2 = Float.valueOf(A022.getFloat(index2, 0.0f));
            } else if (index2 == 17) {
                f4 = Float.valueOf(A022.getFloat(index2, 0.0f));
            } else if (index2 == 18) {
                f5 = Float.valueOf(A022.getFloat(index2, 0.0f));
            } else if (index2 == 19) {
                f3 = Float.valueOf(A022.getFloat(index2, 0.0f));
            } else if (index2 == 16) {
                num15 = Integer.valueOf(A022.getColor(index2, 0));
            } else if (index2 == 13) {
                num3 = Integer.valueOf(A022.getInteger(index2, -1));
            } else if (index2 == 12) {
                num4 = Integer.valueOf(A022.getInteger(index2, -1));
            } else if (index2 == 8) {
                num5 = Integer.valueOf(A022.getDimensionPixelSize(index2, 0));
            } else if (index2 == 7) {
                num6 = Integer.valueOf(A022.getDimensionPixelSize(index2, Integer.MAX_VALUE));
            } else if (index2 == 24) {
                str3 = A022.getString(index2);
            } else if (index2 == 26) {
                num11 = Integer.valueOf(A022.getInt(index2, 0));
            } else if (index2 == 27) {
                num12 = Integer.valueOf(A022.getInt(index2, 0));
            } else if (index2 == 28) {
                num13 = Integer.valueOf(A022.getInt(index2, 0));
            }
            i9++;
        }
        if (str3 != null) {
            if (num14 != null) {
                i = num14.intValue();
            }
            typeface = Typeface.create(str3, i);
        }
        A022.recycle();
        if (truncateAt != null) {
            this.A0P = truncateAt;
        }
        if (f != null) {
            this.A00 = f.floatValue();
        }
        if (bool != null) {
            this.A0Y = bool.booleanValue();
        }
        if (f2 != null) {
            this.A06 = f2.floatValue();
        }
        if (num != null) {
            this.A0G = num.intValue();
        }
        if (num2 != null) {
            this.A0D = num2.intValue();
        }
        if (num3 != null) {
            this.A0F = num3.intValue();
        }
        if (num4 != null) {
            this.A0C = num4.intValue();
        }
        if (num5 != null) {
            this.A0H = num5.intValue();
        }
        if (num6 != null) {
            this.A0E = num6.intValue();
        }
        if (bool2 != null) {
            this.A0X = bool2.booleanValue();
        }
        if (str != null) {
            this.A0S = str;
        }
        if (colorStateList != null) {
            this.A0N = colorStateList;
        }
        if (num7 != null) {
            this.A0B = num7.intValue();
        }
        if (num8 != null) {
            this.A08 = num8.intValue();
        }
        if (num9 != null) {
            this.A0L = num9.intValue();
        }
        if (num10 != null) {
            this.A0T = num10;
        }
        if (num11 != null) {
            this.A07 = num11.intValue();
        }
        if (num12 != null) {
            this.A09 = num12.intValue();
        }
        if (num13 != null) {
            this.A0A = num13.intValue();
        }
        if (num14 != null) {
            this.A0M = num14.intValue();
        }
        if (f3 != null) {
            this.A05 = f3.floatValue();
        }
        if (f4 != null) {
            this.A03 = f4.floatValue();
        }
        if (f5 != null) {
            this.A04 = f5.floatValue();
        }
        if (num15 != null) {
            this.A0J = num15.intValue();
        }
        if (num16 != null) {
            this.A0U = num16;
        }
        if (typeface != null) {
            this.A0O = typeface;
        }
    }

    @Override // X.AbstractC50792Va
    public final boolean A13() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A14() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A15() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A16() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A17() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r1.equals(r0) == false) goto L14;
     */
    @Override // X.AbstractC50792Va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A19(X.AbstractC50812Vc r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51682Yq.A19(X.2Vc, boolean):boolean");
    }

    @Override // X.AbstractC50792Va, X.InterfaceC50822Vd
    public final boolean AFr() {
        return true;
    }

    @Override // X.AbstractC50792Va, X.InterfaceC50822Vd
    public final int E4c() {
        return 30;
    }

    public C51682Yq() {
        super("Text");
        this.A07 = 0;
        this.A0W = true;
        this.A09 = 0;
        this.A0A = 0;
        this.A01 = Float.MAX_VALUE;
        this.A0B = -16776961;
        this.A0C = -1;
        this.A0D = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0F = -1;
        this.A0G = Integer.MIN_VALUE;
        this.A0H = 0;
        this.A0I = 0;
        this.A02 = 0.0f;
        this.A0J = -7829368;
        this.A0Y = true;
        this.A06 = 1.0f;
        this.A0K = 0;
        this.A0N = AbstractC77713dv.A01;
        this.A0L = -1;
        this.A0M = AbstractC77713dv.A00;
        this.A0O = AbstractC77713dv.A05;
        this.A0U = AbstractC77713dv.A06;
    }

    public static C77723dw A03(C2XE c2xe, int i) {
        return new C77723dw(c2xe, new C51682Yq(), i);
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A01;
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        int i = AbstractC77713dv.A00;
        return new Drawable();
    }

    @Override // X.AbstractC50792Va
    public final int A0Y(C2XE c2xe, C2WI c2wi) {
        boolean z = this.A0V;
        ClickableSpan[] clickableSpanArr = ((C78593fR) c2wi).A08;
        int i = AbstractC77713dv.A00;
        if (z && clickableSpanArr != null) {
            return clickableSpanArr.length;
        }
        return 0;
    }

    @Override // X.AbstractC50792Va
    public final int A0Z(C2XE c2xe, C2WI c2wi, int i, int i2) {
        CharSequence charSequence = this.A0S;
        C78593fR c78593fR = (C78593fR) c2wi;
        Layout layout = c78593fR.A01;
        ClickableSpan[] clickableSpanArr = c78593fR.A08;
        int i3 = AbstractC77713dv.A00;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (int i4 = 0; i4 < clickableSpanArr.length; i4++) {
                ClickableSpan clickableSpan = clickableSpanArr[i4];
                int spanStart = spanned.getSpanStart(clickableSpan);
                int spanEnd = spanned.getSpanEnd(clickableSpan);
                Path path = AbstractC77713dv.A02;
                layout.getSelectionPath(spanStart, spanEnd, path);
                RectF rectF = AbstractC77713dv.A04;
                path.computeBounds(rectF, true);
                if (rectF.contains(i, i2)) {
                    return i4;
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2WI, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ C2WI A0e() {
        return new Object();
    }

    @Override // X.AbstractC50792Va
    public final void A0i(int i, Object obj, Object obj2) {
        Object obj3;
        if (i == 0) {
            C79793hU c79793hU = (C79793hU) obj2;
            C2XI c2xi = this.A0Q;
            if (c2xi != null) {
                obj3 = c2xi.A00;
            } else {
                obj3 = null;
            }
            Number number = (Number) obj3;
            int i2 = AbstractC77713dv.A00;
            if (number != null) {
                int intValue = number.intValue();
                c79793hU.A06 = intValue;
                Layout layout = c79793hU.A0A;
                if (layout != null) {
                    layout.getPaint().setColor(intValue);
                }
                c79793hU.invalidateSelf();
            }
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0j(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C2XE c2xe, C2WI c2wi) {
        CharSequence charSequence = this.A0S;
        boolean z = this.A0X;
        int i = AbstractC77713dv.A00;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        CharSequence contentDescription = accessibilityNodeInfoCompat.mInfo.getContentDescription();
        if ((charSequence instanceof Spanned) && ((AbstractC31743Dww[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AbstractC31743Dww.class)).length != 0) {
            new SpannableStringBuilder(charSequence);
            throw new NullPointerException("getContentDescription");
        }
        CharSequence charSequence2 = charSequence;
        if (contentDescription != null) {
            charSequence2 = contentDescription;
        }
        accessibilityNodeInfoCompat.mInfo.setText(charSequence2);
        if (contentDescription == null) {
            contentDescription = charSequence;
        }
        accessibilityNodeInfoCompat.setContentDescription(contentDescription);
        accessibilityNodeInfoCompat.addAction(256);
        accessibilityNodeInfoCompat.addAction(512);
        accessibilityNodeInfoCompat.mInfo.setMovementGranularities(11);
        if (!z) {
            accessibilityNodeInfoCompat.mInfo.setMultiLine(true);
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0l(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C2XE c2xe, C2WI c2wi, int i, int i2, int i3) {
        int lineVisibleEnd;
        CharSequence charSequence = this.A0S;
        C78593fR c78593fR = (C78593fR) c2wi;
        Layout layout = c78593fR.A01;
        ClickableSpan[] clickableSpanArr = c78593fR.A08;
        int i4 = AbstractC77713dv.A00;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            ClickableSpan clickableSpan = clickableSpanArr[i];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            if (lineForOffset == layout.getLineForOffset(spanEnd)) {
                lineVisibleEnd = spanEnd;
            } else {
                lineVisibleEnd = layout.getLineVisibleEnd(lineForOffset);
            }
            Path path = AbstractC77713dv.A02;
            layout.getSelectionPath(spanStart, lineVisibleEnd, path);
            RectF rectF = AbstractC77713dv.A04;
            path.computeBounds(rectF, true);
            Rect rect = AbstractC77713dv.A03;
            rect.set(((int) rectF.left) + i2, ((int) rectF.top) + i3, i2 + ((int) rectF.right), i3 + ((int) rectF.bottom));
            if (rect.isEmpty()) {
                rect.set(0, 0, 1, 1);
                accessibilityNodeInfoCompat.mInfo.setBoundsInParent(rect);
                accessibilityNodeInfoCompat.setContentDescription("");
                return;
            }
            accessibilityNodeInfoCompat.mInfo.setBoundsInParent(rect);
            accessibilityNodeInfoCompat.setClickable(true);
            accessibilityNodeInfoCompat.mInfo.setFocusable(true);
            accessibilityNodeInfoCompat.setEnabled(true);
            accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
            accessibilityNodeInfoCompat.mInfo.setText(spanned.subSequence(spanStart, spanEnd));
            accessibilityNodeInfoCompat.setClassName("android.widget.Button");
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0r(C2XE c2xe, C2WI c2wi, C2Vj c2Vj, C2W6 c2w6, int i, int i2) {
        Layout A00;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        CharSequence charSequence = this.A0S;
        TextUtils.TruncateAt truncateAt = this.A0P;
        boolean z = this.A0Y;
        int i3 = this.A0G;
        int i4 = this.A0D;
        int i5 = this.A0F;
        int i6 = this.A0C;
        int i7 = this.A0H;
        int i8 = this.A0E;
        float f = this.A05;
        float f2 = this.A03;
        float f3 = this.A04;
        int i9 = this.A0J;
        boolean z2 = this.A0X;
        int i10 = this.A0K;
        ColorStateList colorStateList = this.A0N;
        int i11 = this.A0B;
        int i12 = this.A0L;
        float f4 = this.A00;
        float f5 = this.A06;
        int i13 = this.A0M;
        Typeface typeface = this.A0O;
        Integer num4 = this.A0T;
        int i14 = this.A07;
        int i15 = this.A09;
        int i16 = this.A0A;
        float f6 = this.A01;
        int i17 = AbstractC77713dv.A00;
        if (TextUtils.isEmpty(charSequence)) {
            A00 = null;
            c2Vj.A01 = 0;
            c2Vj.A00 = 0;
        } else {
            if (num4 == null) {
                num4 = C05F.A00;
            }
            A00 = AbstractC77713dv.A00(colorStateList, typeface, truncateAt, c2xe, c2w6.A06(), charSequence, num4, f, f2, f3, f4, f5, c2xe.A0C.getResources().getDisplayMetrics().density, f6, i, i4, i9, i10, i11, i12, i13, i5, i6, i7, i8, i14, i15, i16, z, z2);
            num3 = Integer.valueOf(Math.max(0, C2XZ.A00(i, A00.getWidth())));
            c2Vj.A01 = C2XZ.A00(i, A00.getWidth());
            int height = A00.getHeight();
            int lineCount = A00.getLineCount();
            if (lineCount < i3) {
                height += Math.round((A00.getPaint().getFontMetricsInt(null) * f5) + f4) * (i3 - lineCount);
            }
            int A002 = C2XZ.A00(i2, height);
            c2Vj.A00 = A002;
            int i18 = c2Vj.A01;
            if (i18 < 0 || A002 < 0) {
                c2Vj.A01 = Math.max(i18, 0);
                c2Vj.A00 = Math.max(A002, 0);
                C2YE.A00("TextSpec:WrongTextSize", C05F.A01, "Text layout measured to less than 0 pixels");
            }
            num = Integer.valueOf(c2Vj.A01);
            num2 = Integer.valueOf(c2Vj.A00);
        }
        C78593fR c78593fR = (C78593fR) c2wi;
        c78593fR.A00 = A00;
        c78593fR.A07 = num;
        c78593fR.A06 = num2;
        c78593fR.A05 = num3;
    }

    @Override // X.AbstractC50792Va
    public final void A0s(C2XE c2xe, C2WI c2wi, C2W6 c2w6) {
        float f;
        InterfaceC78793fl interfaceC78793fl;
        Layout layout = null;
        Float f2 = null;
        Object[] objArr = null;
        Object[] objArr2 = null;
        CharSequence charSequence = this.A0S;
        TextUtils.TruncateAt truncateAt = this.A0P;
        boolean z = this.A0Y;
        int i = this.A0D;
        int i2 = this.A0F;
        int i3 = this.A0C;
        int i4 = this.A0H;
        int i5 = this.A0E;
        float f3 = this.A05;
        float f4 = this.A03;
        float f5 = this.A04;
        int i6 = this.A0J;
        boolean z2 = this.A0X;
        int i7 = this.A0K;
        ColorStateList colorStateList = this.A0N;
        int i8 = this.A0B;
        int i9 = this.A0L;
        float f6 = this.A00;
        float f7 = this.A06;
        Integer num = this.A0U;
        int i10 = this.A0M;
        Typeface typeface = this.A0O;
        Integer num2 = this.A0T;
        int i11 = this.A07;
        int i12 = this.A09;
        CharSequence charSequence2 = this.A0R;
        float f8 = this.A01;
        C78593fR c78593fR = (C78593fR) c2wi;
        Layout layout2 = c78593fR.A00;
        Integer num3 = c78593fR.A07;
        Integer num4 = c78593fR.A06;
        int i13 = AbstractC77713dv.A00;
        if (!TextUtils.isEmpty(charSequence)) {
            float A05 = (c2w6.A05() - c2w6.A02()) - c2w6.A03();
            float A00 = (c2w6.A00() - c2w6.A04()) - c2w6.A01();
            if (layout2 == null || num3.intValue() != A05 || num4.intValue() != A00) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) A05, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                Integer num5 = num2;
                if (num2 == null) {
                    num5 = C05F.A00;
                }
                layout2 = AbstractC77713dv.A00(colorStateList, typeface, truncateAt, c2xe, c2w6.A06(), charSequence, num5, f3, f4, f5, f6, f7, c2xe.A0C.getResources().getDisplayMetrics().density, f8, makeMeasureSpec, i, i6, i7, i8, i9, i10, i2, i3, i4, i5, i11, i12, 0, z, z2);
            }
            layout = layout2;
            int i14 = 0;
            if (layout2 != null) {
                i14 = layout2.getHeight();
            }
            float f9 = i14;
            AbstractC78843fq abstractC78843fq = AbstractC78843fq.$redex_init_class;
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    f = 0.0f;
                } else {
                    f = A00 - f9;
                }
            } else {
                f = (A00 - f9) / 2.0f;
            }
            f2 = Float.valueOf(f);
            if (charSequence2 != null && !charSequence2.equals("")) {
                int i15 = 0;
                while (true) {
                    if (i15 >= layout2.getLineCount()) {
                        break;
                    }
                    if (layout2.getEllipsisCount(i15) > 0) {
                        if (i15 != -1) {
                            int i16 = (int) A05;
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                            Integer num6 = num2;
                            if (num2 == null) {
                                num6 = C05F.A00;
                            }
                            EnumC78563fO A06 = c2w6.A06();
                            Context context = c2xe.A0C;
                            boolean z3 = true;
                            Layout A002 = AbstractC77713dv.A00(colorStateList, typeface, truncateAt, c2xe, A06, charSequence2, num6, f3, f4, f5, f6, f7, context.getResources().getDisplayMetrics().density, f8, makeMeasureSpec2, i, i6, i7, i8, i9, i10, i2, i3, i4, i5, i11, i12, 0, z, z2);
                            if (c2w6.A06() == EnumC78563fO.RTL) {
                                interfaceC78793fl = AbstractC78763fi.A02;
                            } else {
                                interfaceC78793fl = AbstractC78763fi.A01;
                            }
                            Layout.Alignment alignment = A002.getAlignment();
                            boolean CcD = interfaceC78793fl.CcD(charSequence, 0, charSequence.length());
                            if (alignment != Layout.Alignment.ALIGN_NORMAL) {
                                z3 = false;
                            }
                            charSequence = AbstractC77713dv.A01(layout2, A002, charSequence, charSequence2, A05, i15, CcD ^ z3, CcD);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i16, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                            if (num2 == null) {
                                num2 = C05F.A00;
                            }
                            layout = AbstractC77713dv.A00(colorStateList, typeface, truncateAt, c2xe, c2w6.A06(), charSequence, num2, f3, f4, f5, f6, f7, context.getResources().getDisplayMetrics().density, f8, makeMeasureSpec3, i, i6, i7, i8, i9, i10, i2, i3, i4, i5, i11, i12, 0, z, z2);
                        }
                    } else {
                        i15++;
                    }
                }
            }
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                objArr = spanned.getSpans(0, charSequence.length(), ClickableSpan.class);
                objArr2 = spanned.getSpans(0, charSequence.length(), ImageSpan.class);
            }
        }
        c78593fR.A02 = charSequence;
        c78593fR.A01 = layout;
        c78593fR.A03 = null;
        c78593fR.A04 = f2;
        c78593fR.A08 = (ClickableSpan[]) objArr;
        c78593fR.A09 = (ImageSpan[]) objArr2;
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        float floatValue;
        float floatValue2;
        C79793hU c79793hU = (C79793hU) obj;
        int i = this.A0K;
        int i2 = this.A08;
        float f = this.A02;
        int i3 = this.A0I;
        ColorStateList colorStateList = this.A0N;
        boolean z = this.A0W;
        C78593fR c78593fR = (C78593fR) c2wi;
        CharSequence charSequence = c78593fR.A02;
        Layout layout = c78593fR.A01;
        Float f2 = c78593fR.A03;
        Float f3 = c78593fR.A04;
        ClickableSpan[] clickableSpanArr = c78593fR.A08;
        ImageSpan[] imageSpanArr = c78593fR.A09;
        int i4 = AbstractC77713dv.A00;
        if (f2 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f2.floatValue();
        }
        if (f3 == null) {
            floatValue2 = 0.0f;
        } else {
            floatValue2 = f3.floatValue();
        }
        c79793hU.A06(colorStateList, layout, charSequence, c2xe.A02.A01.A07, clickableSpanArr, imageSpanArr, floatValue, floatValue2, f, i, i2, i3, z);
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        C79793hU c79793hU = (C79793hU) obj;
        int i = AbstractC77713dv.A00;
        c79793hU.A0B = null;
        c79793hU.A0A = null;
        c79793hU.A00 = 0.0f;
        c79793hU.A0D = null;
        c79793hU.A0I = null;
        c79793hU.A0H = false;
        c79793hU.A02 = 0;
        c79793hU.A07 = null;
        c79793hU.A06 = 0;
        ImageSpan[] imageSpanArr = c79793hU.A0J;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Drawable drawable = c79793hU.A0J[i2].getDrawable();
                drawable.setCallback(null);
                drawable.setVisible(false, false);
            }
            c79793hU.A0J = null;
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0y(C2WI c2wi, C2WI c2wi2) {
        C78593fR c78593fR = (C78593fR) c2wi;
        C78593fR c78593fR2 = (C78593fR) c2wi2;
        c78593fR.A08 = c78593fR2.A08;
        c78593fR.A05 = c78593fR2.A05;
        c78593fR.A09 = c78593fR2.A09;
        c78593fR.A00 = c78593fR2.A00;
        c78593fR.A06 = c78593fR2.A06;
        c78593fR.A07 = c78593fR2.A07;
        c78593fR.A02 = c78593fR2.A02;
        c78593fR.A01 = c78593fR2.A01;
        c78593fR.A03 = c78593fR2.A03;
        c78593fR.A04 = c78593fR2.A04;
    }

    @Override // X.AbstractC50792Va
    public final boolean A18(Bundle bundle, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C2XE c2xe, C2WI c2wi, int i, int i2) {
        ClickableSpan[] clickableSpanArr = ((C78593fR) c2wi).A08;
        int i3 = AbstractC77713dv.A00;
        if (i2 == 16) {
            clickableSpanArr[i].onClick(view);
            return true;
        }
        return false;
    }

    @Override // X.AbstractC50792Va
    public final C2XI[] A1A() {
        return this.A0Z;
    }

    @Override // X.AbstractC50812Vc
    public final /* bridge */ /* synthetic */ AbstractC50812Vc A0P() {
        return super.A0P();
    }

    @Override // X.AbstractC50792Va
    public final void A0k(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C2XE c2xe, C2WI c2wi, int i, boolean z) {
        int i2 = AbstractC77713dv.A00;
    }
}
