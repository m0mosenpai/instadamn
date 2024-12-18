package X;

import android.content.res.Resources;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.3qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84963qk {
    public static final C84963qk A00 = new Object();
    public static final java.util.Set A02 = AbstractC16830sb.A07(Locale.CHINA, Locale.TAIWAN, Locale.JAPAN, Locale.KOREA);
    public static final ThreadLocal A01 = new ThreadLocal();

    public static final int A00(Integer num, double d) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 1;
        while (true) {
            int intValue = num.intValue();
            if (intValue != 0) {
                i = 3;
            } else {
                i = 4;
            }
            int i5 = i + i3;
            if (intValue != 0) {
                i2 = 9;
            } else {
                i2 = 8;
            }
            if (i5 > i2) {
                break;
            }
            i4 *= (int) Math.pow(10.0d, i);
            if (i4 > d) {
                break;
            }
            i3 += i;
        }
        return i3;
    }

    public static final String A02(Resources resources, Integer num) {
        C14360o3.A0B(resources, 1);
        return A04(resources, num, 10000, true, false);
    }

    public static final String A04(Resources resources, Integer num, int i, boolean z, boolean z2) {
        Integer num2;
        String A05;
        String str;
        int i2;
        String string;
        NumberFormat integerInstance;
        C14360o3.A0B(resources, 1);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue < i) {
                Locale A022 = C1Q2.A02();
                ThreadLocal threadLocal = A01;
                C09530e4 c09530e4 = (C09530e4) threadLocal.get();
                if (c09530e4 != null && c09530e4.A00 == A022) {
                    integerInstance = (NumberFormat) c09530e4.A01;
                } else {
                    integerInstance = NumberFormat.getIntegerInstance(A022);
                    threadLocal.set(new C09530e4(A022, integerInstance));
                    C14360o3.A0A(integerInstance);
                }
                string = integerInstance.format(intValue);
            } else {
                Locale A023 = C1Q2.A02();
                C84963qk c84963qk = A00;
                if (A02.contains(A023)) {
                    num2 = C05F.A00;
                } else {
                    num2 = C05F.A01;
                }
                if (c84963qk.A06(A023, intValue, i)) {
                    A05 = String.format(A023, "%d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (intValue / Math.pow(10.0d, 3.0d)))}, 1));
                    C14360o3.A07(A05);
                    str = "%s";
                } else {
                    A05 = c84963qk.A05(z2, intValue, A023);
                    int A002 = A00(num2, intValue);
                    str = "%s";
                    if (A002 != 3) {
                        if (A002 != 4) {
                            if (A002 != 6) {
                                if (A002 != 8) {
                                    if (A002 == 9) {
                                        i2 = 2131974048;
                                        if (z) {
                                            i2 = 2131974049;
                                        }
                                    } else {
                                        throw new RuntimeException(AnonymousClass001.A0O(AbstractC43591JPw.A00(261), A002));
                                    }
                                } else {
                                    i2 = 2131974050;
                                }
                            } else {
                                i2 = 2131974051;
                                if (z) {
                                    i2 = 2131974052;
                                }
                            }
                        } else {
                            i2 = 2131974053;
                        }
                        string = resources.getString(i2, AbstractC13670mt.A06(str, A05));
                    }
                }
                i2 = 2131974054;
                if (z) {
                    i2 = 2131974055;
                }
                string = resources.getString(i2, AbstractC13670mt.A06(str, A05));
            }
            C14360o3.A07(string);
            return string;
        }
        return "";
    }

    public static final C5QE A01(int i) {
        Integer num;
        int i2;
        Object[] objArr;
        if (i < 10000) {
            return MVZ.A00(String.valueOf(i));
        }
        Locale A022 = C1Q2.A02();
        C84963qk c84963qk = A00;
        if (A02.contains(A022)) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        if (c84963qk.A06(A022, i, 10000)) {
            String format = String.format(A022, "%d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (i / Math.pow(10.0d, 3.0d)))}, 1));
            C14360o3.A07(format);
            i2 = 2131974054;
            objArr = new Object[]{format};
        } else {
            String A05 = c84963qk.A05(false, i, A022);
            int A002 = A00(num, i);
            if (A002 != 3) {
                if (A002 != 4) {
                    if (A002 != 6) {
                        if (A002 != 8) {
                            if (A002 == 9) {
                                i2 = 2131974048;
                            } else {
                                throw new RuntimeException(AnonymousClass001.A0O(AbstractC43591JPw.A00(261), A002));
                            }
                        } else {
                            i2 = 2131974050;
                        }
                    } else {
                        i2 = 2131974051;
                    }
                } else {
                    i2 = 2131974053;
                }
            } else {
                i2 = 2131974054;
            }
            objArr = new Object[]{A05};
        }
        return new BHS(new Object[]{AbstractC13670mt.A06("%s", objArr)}, i2);
    }

    public static final String A03(Resources resources, Integer num) {
        return A04(resources, num, 10000, true, false);
    }

    private final String A05(boolean z, int i, Locale locale) {
        Integer num;
        int i2;
        double floor;
        double d;
        String str;
        if (A02.contains(locale)) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        double d2 = i;
        if (num.intValue() != 0) {
            i2 = 3;
        } else {
            i2 = 4;
        }
        double d3 = i2;
        double pow = d2 / Math.pow(Math.pow(10.0d, d3), Math.floor(Math.floor(Math.log10(d2)) / d3));
        if (pow >= Math.pow(10.0d, i2 - 1)) {
            d = Math.floor(pow);
        } else {
            double d4 = pow * 10.0d;
            if (z) {
                floor = Math.round(d4);
            } else {
                floor = Math.floor(d4);
            }
            d = floor / 10.0d;
        }
        if (((int) Math.floor(10.0d * d)) % 10 == 0) {
            str = "%.0f";
        } else {
            str = "%.1f";
        }
        String format = String.format(locale, str, Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        C14360o3.A07(format);
        return format;
    }

    private final boolean A06(Locale locale, int i, int i2) {
        Integer num;
        if (A02.contains(locale)) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        if (num == C05F.A00) {
            double d = i2;
            double pow = Math.pow(10.0d, 4.0d);
            if (d < pow) {
                double d2 = i;
                if (d2 >= Math.pow(10.0d, 3.0d) && d2 < pow) {
                    return true;
                }
            }
        }
        return false;
    }
}
