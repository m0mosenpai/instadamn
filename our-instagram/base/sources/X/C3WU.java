package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.3WU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WU {
    public Typeface A02;
    public C69182VjB A03;
    public C69182VjB A04;
    public C69182VjB A05;
    public C69182VjB A06;
    public C69182VjB A07;
    public C69182VjB A08;
    public C69182VjB A09;
    public boolean A0A;
    public final TextView A0B;
    public final C3WV A0C;
    public int A01 = 0;
    public int A00 = -1;

    private void A01(Context context, C53122bu c53122bu) {
        String string;
        Typeface create;
        Typeface A03;
        int i = this.A01;
        TypedArray typedArray = c53122bu.A02;
        this.A01 = typedArray.getInt(2, i);
        boolean z = false;
        int i2 = typedArray.getInt(11, -1);
        this.A00 = i2;
        if (i2 != -1) {
            this.A01 &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.A0A = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            create = Typeface.MONOSPACE;
                        } else {
                            return;
                        }
                    } else {
                        create = Typeface.SERIF;
                    }
                } else {
                    create = Typeface.SANS_SERIF;
                }
            } else {
                return;
            }
        } else {
            this.A02 = null;
            int i4 = 10;
            if (typedArray.hasValue(12)) {
                i4 = 12;
            }
            int i5 = this.A00;
            int i6 = this.A01;
            if (!context.isRestricted()) {
                C3WW c3ww = new C3WW(this, new WeakReference(this.A0B), i5, i6);
                try {
                    int i7 = this.A01;
                    int resourceId = typedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        TypedValue typedValue = c53122bu.A00;
                        if (typedValue == null) {
                            typedValue = new TypedValue();
                            c53122bu.A00 = typedValue;
                        }
                        Context context2 = c53122bu.A01;
                        if (!context2.isRestricted() && (A03 = C3WY.A03(context2, typedValue, c3ww, resourceId, i7, true, false)) != null) {
                            if (this.A00 != -1) {
                                Typeface create2 = Typeface.create(A03, 0);
                                int i8 = this.A00;
                                boolean z2 = false;
                                if ((this.A01 & 2) != 0) {
                                    z2 = true;
                                }
                                A03 = Typeface.create(create2, i8, z2);
                            }
                            this.A02 = A03;
                        }
                    }
                    boolean z3 = false;
                    if (this.A02 == null) {
                        z3 = true;
                    }
                    this.A0A = z3;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.A02 != null || (string = typedArray.getString(i4)) == null) {
                return;
            }
            if (this.A00 != -1) {
                Typeface create3 = Typeface.create(string, 0);
                int i9 = this.A00;
                if ((this.A01 & 2) != 0) {
                    z = true;
                }
                create = Typeface.create(create3, i9, z);
            } else {
                create = Typeface.create(string, this.A01);
            }
        }
        this.A02 = create;
    }

    private void A02(Drawable drawable, C69182VjB c69182VjB) {
        if (drawable != null && c69182VjB != null) {
            C52112aB.A03(drawable, c69182VjB, this.A0B.getDrawableState());
        }
    }

    public static final void A03(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            C05K.A00(editorInfo, textView.getText());
        }
    }

    public final void A04() {
        if (this.A05 != null || this.A09 != null || this.A06 != null || this.A03 != null) {
            Drawable[] compoundDrawables = this.A0B.getCompoundDrawables();
            A02(compoundDrawables[0], this.A05);
            A02(compoundDrawables[1], this.A09);
            A02(compoundDrawables[2], this.A06);
            A02(compoundDrawables[3], this.A03);
        }
        if (this.A07 != null || this.A04 != null) {
            Drawable[] compoundDrawablesRelative = this.A0B.getCompoundDrawablesRelative();
            A02(compoundDrawablesRelative[0], this.A07);
            A02(compoundDrawablesRelative[2], this.A04);
        }
    }

    public final void A05(Context context, int i) {
        String string;
        C53122bu c53122bu = new C53122bu(context, context.obtainStyledAttributes(i, AbstractC53402cO.A0N));
        TypedArray typedArray = c53122bu.A02;
        if (typedArray.hasValue(14)) {
            this.A0B.setAllCaps(typedArray.getBoolean(14, false));
        }
        if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0) {
            this.A0B.setTextSize(0, 0.0f);
        }
        A01(context, c53122bu);
        if (typedArray.hasValue(13) && (string = typedArray.getString(13)) != null) {
            this.A0B.setFontVariationSettings(string);
        }
        typedArray.recycle();
        Typeface typeface = this.A02;
        if (typeface != null) {
            this.A0B.setTypeface(typeface, this.A01);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.VjB, java.lang.Object] */
    public final void A06(ColorStateList colorStateList) {
        C69182VjB c69182VjB = this.A08;
        C69182VjB c69182VjB2 = c69182VjB;
        if (c69182VjB == null) {
            ?? obj = new Object();
            this.A08 = obj;
            c69182VjB2 = obj;
        }
        c69182VjB2.A00 = colorStateList;
        boolean z = false;
        if (colorStateList != null) {
            z = true;
        }
        c69182VjB2.A02 = z;
        this.A05 = c69182VjB2;
        this.A09 = c69182VjB2;
        this.A06 = c69182VjB2;
        this.A03 = c69182VjB2;
        this.A07 = c69182VjB2;
        this.A04 = c69182VjB2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.VjB, java.lang.Object] */
    public final void A07(PorterDuff.Mode mode) {
        C69182VjB c69182VjB = this.A08;
        C69182VjB c69182VjB2 = c69182VjB;
        if (c69182VjB == null) {
            ?? obj = new Object();
            this.A08 = obj;
            c69182VjB2 = obj;
        }
        c69182VjB2.A01 = mode;
        boolean z = false;
        if (mode != null) {
            z = true;
        }
        c69182VjB2.A03 = z;
        this.A05 = c69182VjB2;
        this.A09 = c69182VjB2;
        this.A06 = c69182VjB2;
        this.A03 = c69182VjB2;
        this.A07 = c69182VjB2;
        this.A04 = c69182VjB2;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(android.util.AttributeSet r27, int r28) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3WU.A08(android.util.AttributeSet, int):void");
    }

    public C3WU(TextView textView) {
        this.A0B = textView;
        this.A0C = new C3WV(textView);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.VjB, java.lang.Object] */
    public static C69182VjB A00(Context context, C52102aA c52102aA, int i) {
        ColorStateList A03 = c52102aA.A03(context, i);
        if (A03 != null) {
            ?? obj = new Object();
            obj.A02 = true;
            obj.A00 = A03;
            return obj;
        }
        return null;
    }
}
