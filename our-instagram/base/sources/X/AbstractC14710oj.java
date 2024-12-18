package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.widget.TextView;
import com.facebook.systrace.Systrace;

/* renamed from: X.0oj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14710oj {
    public static Typeface A00;
    public static Typeface A01;
    public static Typeface A02;
    public static final Typeface A03;
    public static final Typeface A04;
    public static final Typeface A05;

    public static final Typeface A03(Context context, Typeface typeface, Integer num) {
        Typeface A022;
        C14360o3.A0B(num, 1);
        C14360o3.A0B(typeface, 2);
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgdsPrismFontHelper.setPrismFont", -1930369775);
        }
        if (A08()) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    A022 = A00(context);
                } else {
                    A022 = A01(context);
                }
            } else {
                A022 = A02(context);
            }
            if (A022 != null) {
                typeface = A022;
            }
        }
        if (Systrace.A0E(1L)) {
            C0fO.A00(298294162);
        }
        return typeface;
    }

    public static final void A06(Context context, Typeface typeface, TextPaint textPaint, Integer num) {
        Typeface A022;
        C14360o3.A0B(num, 1);
        if (A08()) {
            if (Systrace.A0E(1L)) {
                C0fO.A01("IgdsPrismFontHelper.setPrismFont", 1600637731);
            }
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    A022 = A00(context);
                } else {
                    A022 = A01(context);
                }
            } else {
                A022 = A02(context);
            }
            textPaint.setTypeface(A022);
            if (Systrace.A0E(1L)) {
                C0fO.A00(849790886);
                return;
            }
            return;
        }
        if (typeface == null) {
            return;
        }
        textPaint.setTypeface(typeface);
    }

    public static final void A07(Context context, Typeface typeface, TextView textView, Integer num) {
        Typeface A022;
        C14360o3.A0B(textView, 0);
        if (A08()) {
            if (Systrace.A0E(1L)) {
                C0fO.A01("IgdsPrismFontHelper.setPrismFont", 1820185072);
            }
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    A022 = A00(context);
                } else {
                    A022 = A01(context);
                }
            } else {
                A022 = A02(context);
            }
            textView.setTypeface(A022);
            if (Systrace.A0E(1L)) {
                C0fO.A00(391575339);
                return;
            }
            return;
        }
        if (typeface == null) {
            return;
        }
        textView.setTypeface(typeface);
    }

    public static final Typeface A00(Context context) {
        C15980qs c15980qs;
        Typeface typeface = A00;
        if (typeface == null) {
            if (context != null) {
                c15980qs = AbstractC15960qq.A00(context);
            } else {
                c15980qs = C15980qs.A03;
                if (c15980qs == null) {
                    typeface = null;
                    A00 = typeface;
                }
            }
            typeface = c15980qs.A02(EnumC15950qp.A0p);
            A00 = typeface;
        }
        return typeface;
    }

    public static final Typeface A01(Context context) {
        C15980qs c15980qs;
        Typeface typeface = A01;
        if (typeface == null) {
            if (context != null) {
                c15980qs = AbstractC15960qq.A00(context);
            } else {
                c15980qs = C15980qs.A03;
                if (c15980qs == null) {
                    typeface = null;
                    A01 = typeface;
                }
            }
            typeface = c15980qs.A02(EnumC15950qp.A0r);
            A01 = typeface;
        }
        return typeface;
    }

    public static final Typeface A02(Context context) {
        C15980qs c15980qs;
        Typeface typeface = A02;
        if (typeface == null) {
            if (context != null) {
                c15980qs = AbstractC15960qq.A00(context);
            } else {
                c15980qs = C15980qs.A03;
                if (c15980qs == null) {
                    typeface = null;
                    A02 = typeface;
                }
            }
            typeface = c15980qs.A02(EnumC15950qp.A0q);
            A02 = typeface;
        }
        return typeface;
    }

    public static final Integer A04(Typeface typeface, boolean z) {
        if (!z && !C14360o3.A0K(typeface, A04)) {
            if (!C14360o3.A0K(typeface, A05) && !C14360o3.A0K(typeface, A03)) {
                return C05F.A00;
            }
            return C05F.A01;
        }
        return C05F.A0C;
    }

    public static final Integer A05(String str, boolean z) {
        if (!z) {
            if (str != null) {
                if (!AbstractC001900j.A0a(str, "bold", false)) {
                    if (AbstractC001900j.A0a(str, "medium", false)) {
                        return C05F.A01;
                    }
                }
            }
            return C05F.A00;
        }
        return C05F.A0C;
    }

    public static final boolean A08() {
        if (C14650od.A03 == null) {
            C0w9.A03("IGDSPrismExperimentUtils_isNull", "You've tried gating Prism before it has been instantiated");
        }
        C14650od c14650od = C14650od.A03;
        if (c14650od != null) {
            Object value = c14650od.A01.getValue();
            C14360o3.A07(value);
            if (((Boolean) value).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    static {
        Typeface typeface;
        Typeface typeface2;
        Typeface create = Typeface.create("sans-serif-medium", 0);
        C14360o3.A07(create);
        A05 = create;
        Typeface create2 = Typeface.create("sans-serif-medium", 1);
        C14360o3.A07(create2);
        A03 = create2;
        Typeface create3 = Typeface.create("sans-serif", 1);
        C14360o3.A07(create3);
        A04 = create3;
        C15980qs c15980qs = C15980qs.A03;
        Typeface typeface3 = null;
        if (c15980qs != null) {
            typeface = c15980qs.A02(EnumC15950qp.A0p);
        } else {
            typeface = null;
        }
        A00 = typeface;
        C15980qs c15980qs2 = C15980qs.A03;
        if (c15980qs2 != null) {
            typeface2 = c15980qs2.A02(EnumC15950qp.A0r);
        } else {
            typeface2 = null;
        }
        A01 = typeface2;
        C15980qs c15980qs3 = C15980qs.A03;
        if (c15980qs3 != null) {
            typeface3 = c15980qs3.A02(EnumC15950qp.A0q);
        }
        A02 = typeface3;
    }
}
