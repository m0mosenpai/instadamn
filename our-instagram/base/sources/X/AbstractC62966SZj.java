package X;

import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.SZj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62966SZj {
    public int A00;
    public int A01;
    public int A02 = -1;
    public List A03;

    public abstract String A03();

    /* JADX WARN: Multi-variable type inference failed */
    public final void A04() {
        double d;
        Object valueOf;
        String valueOf2;
        C60528R2s c60528R2s;
        R2f r2f;
        if (this instanceof C60520R2c) {
            C60520R2c c60520R2c = (C60520R2c) this;
            C63347Si4 c63347Si4 = c60520R2c.A03;
            AbstractC62966SZj A00 = C63347Si4.A00(c63347Si4, c60520R2c.A01);
            if (A00 instanceof R2f) {
                r2f = (R2f) A00;
            } else {
                r2f = null;
            }
            T0G t0g = c60520R2c.A04;
            if (r2f != null) {
                t0g.putDouble("toValue", r2f.A05());
            } else {
                t0g.A00.put("toValue", null);
            }
            c63347Si4.A0I(null, t0g, c60520R2c.A00, c60520R2c.A02);
            return;
        }
        if (this instanceof C60531R2v) {
            C60531R2v c60531R2v = (C60531R2v) this;
            int[] iArr = c60531R2v.A01;
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                AbstractC62966SZj A002 = C63347Si4.A00(c60531R2v.A00, iArr[i]);
                if (A002 != null && (A002 instanceof R2f)) {
                    double A05 = ((R2f) A002).A05();
                    if (i == 0) {
                        ((R2f) c60531R2v).A00 = A05;
                    } else {
                        ((R2f) c60531R2v).A00 -= A05;
                    }
                } else {
                    throw new RuntimeException("Illegal node ID set as an input for Animated.subtract node");
                }
            }
            return;
        }
        if (this instanceof C60530R2u) {
            C60530R2u c60530R2u = (C60530R2u) this;
            ((R2f) c60530R2u).A00 = 1.0d;
            for (int i2 : c60530R2u.A00) {
                AbstractC62966SZj A003 = C63347Si4.A00(c60530R2u.A01, i2);
                if (A003 != null && (A003 instanceof R2f)) {
                    ((R2f) c60530R2u).A00 *= ((R2f) A003).A05();
                } else {
                    throw new RuntimeException("Illegal node ID set as an input for Animated.multiply node");
                }
            }
            return;
        }
        if (this instanceof R2w) {
            R2w r2w = (R2w) this;
            AbstractC62966SZj A004 = C63347Si4.A00(r2w.A02, r2w.A01);
            if (A004 instanceof R2f) {
                double A052 = ((R2f) A004).A05();
                double d2 = r2w.A00;
                d = ((A052 % d2) + d2) % d2;
                c60528R2s = r2w;
            } else {
                throw new RuntimeException("Illegal node ID set as an input for Animated.modulus node");
            }
        } else {
            if (this instanceof R2y) {
                R2y r2y = (R2y) this;
                R2f r2f2 = r2y.A00;
                if (r2f2 == null) {
                    return;
                }
                double A053 = r2f2.A05();
                int intValue = r2y.A01.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        String str = r2y.A04;
                        if (str == null) {
                            return;
                        }
                        double[] dArr = r2y.A07;
                        Object obj = r2y.A03;
                        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.DoubleArray>");
                        double[][] dArr2 = (double[][]) obj;
                        String str2 = r2y.A05;
                        String str3 = r2y.A06;
                        AbstractC167007dF.A1E(dArr, 2, dArr2);
                        int i3 = 1;
                        while (i3 < dArr.length - 1 && dArr[i3] < A053) {
                            i3++;
                        }
                        int i4 = i3 - 1;
                        StringBuffer stringBuffer = new StringBuffer(str.length());
                        Matcher matcher = R2y.A08.matcher(str);
                        int i5 = 0;
                        while (matcher.find()) {
                            double[] dArr3 = dArr2[i4];
                            if (i5 >= dArr3.length) {
                                break;
                            }
                            int i6 = i4 + 1;
                            double A005 = C62790SRk.A00(str2, str3, A053, dArr[i4], dArr[i6], dArr3[i5], dArr2[i6][i5]);
                            int i7 = (int) A005;
                            if (i7 == A005) {
                                valueOf2 = String.valueOf(i7);
                            } else {
                                valueOf2 = String.valueOf(A005);
                            }
                            matcher.appendReplacement(stringBuffer, valueOf2);
                            i5++;
                        }
                        matcher.appendTail(stringBuffer);
                        valueOf = AbstractC166987dD.A19(stringBuffer);
                    } else {
                        double[] dArr4 = r2y.A07;
                        Object obj2 = r2y.A03;
                        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.IntArray");
                        int[] iArr2 = (int[]) obj2;
                        AbstractC167007dF.A1D(dArr4, 1, iArr2);
                        int i8 = 1;
                        while (i8 < dArr4.length - 1 && dArr4[i8] < A053) {
                            i8++;
                        }
                        int i9 = i8 - 1;
                        int i10 = iArr2[i9];
                        int i11 = i9 + 1;
                        int i12 = iArr2[i11];
                        if (i10 != i12) {
                            double d3 = dArr4[i9];
                            double d4 = dArr4[i11];
                            if (d3 == d4) {
                                if (A053 > d3) {
                                    i10 = i12;
                                }
                            } else {
                                i10 = AbstractC56842jH.A03((float) ((A053 - d3) / (d4 - d3)), i10, i12);
                            }
                        }
                        valueOf = Integer.valueOf(i10);
                    }
                    r2y.A02 = valueOf;
                    return;
                }
                double[] dArr5 = r2y.A07;
                Object obj3 = r2y.A03;
                C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.DoubleArray");
                double[] dArr6 = (double[]) obj3;
                String str4 = r2y.A05;
                String str5 = r2y.A06;
                AbstractC167017dG.A1P(dArr5, dArr6);
                int i13 = 1;
                while (i13 < dArr5.length - 1 && dArr5[i13] < A053) {
                    i13++;
                }
                int i14 = i13 - 1;
                int i15 = i14 + 1;
                ((R2f) r2y).A00 = C62790SRk.A00(str4, str5, A053, dArr5[i14], dArr5[i15], dArr6[i14], dArr6[i15]);
                return;
            }
            if (this instanceof C60529R2t) {
                C60529R2t c60529R2t = (C60529R2t) this;
                int[] iArr3 = c60529R2t.A01;
                int length2 = iArr3.length;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length2) {
                    int i18 = i17 + 1;
                    AbstractC62966SZj A006 = C63347Si4.A00(c60529R2t.A00, iArr3[i16]);
                    if (A006 != null && (A006 instanceof R2f)) {
                        double d5 = ((R2f) A006).A00;
                        if (i17 == 0) {
                            ((R2f) c60529R2t).A00 = d5;
                        } else {
                            if (d5 == 0.0d) {
                                throw new RuntimeException(AnonymousClass001.A0O("Detected a division by zero in Animated.divide node with Animated ID ", ((AbstractC62966SZj) c60529R2t).A02));
                            }
                            ((R2f) c60529R2t).A00 /= d5;
                        }
                        i16++;
                        i17 = i18;
                    } else {
                        throw new RuntimeException(AnonymousClass001.A0O("Illegal node ID set as an input for Animated.divide node with Animated ID ", ((AbstractC62966SZj) c60529R2t).A02));
                    }
                }
                return;
            }
            if (this instanceof R2x) {
                R2x r2x = (R2x) this;
                AbstractC62966SZj A007 = C63347Si4.A00(r2x.A04, r2x.A03);
                if (A007 != null && (A007 instanceof R2f)) {
                    double A054 = ((R2f) A007).A05();
                    double d6 = A054 - r2x.A00;
                    r2x.A00 = A054;
                    d = Math.min(Math.max(((R2f) r2x).A00 + d6, r2x.A02), r2x.A01);
                    c60528R2s = r2x;
                } else {
                    throw new RuntimeException("Illegal node ID set as an input for Animated.DiffClamp node");
                }
            } else {
                if (!(this instanceof C60528R2s)) {
                    return;
                }
                C60528R2s c60528R2s2 = (C60528R2s) this;
                double d7 = 0.0d;
                ((R2f) c60528R2s2).A00 = 0.0d;
                for (int i19 : c60528R2s2.A01) {
                    AbstractC62966SZj A008 = C63347Si4.A00(c60528R2s2.A00, i19);
                    if (A008 instanceof R2f) {
                        d7 += ((R2f) A008).A05();
                    } else {
                        throw new RuntimeException("Illegal node ID set as an input for Animated.Add node");
                    }
                }
                d = 0.0d + d7;
                c60528R2s = c60528R2s2;
            }
        }
        ((R2f) c60528R2s).A00 = d;
    }

    public static void A02(AbstractC62966SZj abstractC62966SZj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(abstractC62966SZj.A02);
    }
}
