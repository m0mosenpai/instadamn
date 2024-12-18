package X;

import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class XPm extends C5Ti {
    public static final XPm A00 = new XPm();

    public XPm() {
        super(1, 0);
    }

    @Override // X.C5Ti
    public final String A00(int i) {
        if (i == 0) {
            return "offset";
        }
        return super.A00(i);
    }

    @Override // X.C5Ti
    public final void A02(C5TZ c5tz, C5Z3 c5z3, C117565Tr c117565Tr, C5Z5 c5z5) {
        String str;
        C117595Tu c117595Tu;
        int A0H;
        C5Z4 c5z4 = (C5Z4) c5z5;
        int i = c5z4.A03.A05[c5z4.A00];
        if (c117565Tr.A06 == 0) {
            str = "Parameter offset is out of bounds";
            if (MSY.A1R(i)) {
                if (i != 0) {
                    int i2 = c117565Tr.A00;
                    int i3 = c117565Tr.A08;
                    int i4 = c117565Tr.A01;
                    int i5 = i2;
                    while (true) {
                        if (i > 0) {
                            i5 += c117565Tr.A0I[(C117565Tr.A00(c117565Tr, i5) * 5) + 3];
                            if (i5 > i4) {
                                break;
                            } else {
                                i--;
                            }
                        } else {
                            int[] iArr = c117565Tr.A0I;
                            int A002 = C117565Tr.A00(c117565Tr, i5);
                            int i6 = iArr[(A002 * 5) + 3];
                            int A01 = C117565Tr.A01(c117565Tr, iArr, C117565Tr.A00(c117565Tr, i2));
                            int A012 = C117565Tr.A01(c117565Tr, iArr, A002);
                            int i7 = i5 + i6;
                            int A013 = C117565Tr.A01(c117565Tr, iArr, C117565Tr.A00(c117565Tr, i7));
                            int i8 = A013 - A012;
                            C117565Tr.A09(c117565Tr, i8, Math.max(i2 - 1, 0));
                            C117565Tr.A05(c117565Tr, i6);
                            int[] iArr2 = c117565Tr.A0I;
                            int A003 = C117565Tr.A00(c117565Tr, i7) * 5;
                            AbstractC06960Yn.A0U(iArr2, iArr2, C117565Tr.A00(c117565Tr, i2) * 5, A003, (i6 * 5) + A003);
                            if (i8 > 0) {
                                Object[] objArr = c117565Tr.A0J;
                                int i9 = A012 + i8;
                                int i10 = c117565Tr.A0B;
                                if (i9 >= i10) {
                                    i9 += c117565Tr.A09;
                                }
                                int i11 = A013 + i8;
                                if (i11 >= i10) {
                                    i11 += c117565Tr.A09;
                                }
                                AbstractC06960Yn.A0W(objArr, objArr, A01, i9, i11);
                            }
                            int i12 = A012 + i8;
                            int i13 = i12 - A01;
                            int i14 = c117565Tr.A0B;
                            int i15 = c117565Tr.A09;
                            int length = c117565Tr.A0J.length;
                            int i16 = c117565Tr.A0A;
                            int i17 = i2 + i6;
                            for (int i18 = i2; i18 < i17; i18++) {
                                int A004 = C117565Tr.A00(c117565Tr, i18);
                                int A014 = C117565Tr.A01(c117565Tr, iArr2, A004) - i13;
                                int i19 = i14;
                                if (i16 < A004) {
                                    i19 = 0;
                                }
                                if (A014 > i19) {
                                    A014 = -(((length - i15) - A014) + 1);
                                }
                                if (A014 > i14) {
                                    A014 = -(((length - i15) - A014) + 1);
                                }
                                iArr2[(A004 * 5) + 4] = A014;
                            }
                            int i20 = i6 + i7;
                            int length2 = (c117565Tr.A0I.length / 5) - c117565Tr.A04;
                            ArrayList arrayList = c117565Tr.A0F;
                            int A015 = AbstractC117585Tt.A01(arrayList, i7, length2);
                            if (A015 < 0) {
                                A015 = -(A015 + 1);
                            }
                            ArrayList A1E = AbstractC166987dD.A1E();
                            if (A015 >= 0) {
                                while (A015 < arrayList.size() && (A0H = c117565Tr.A0H((c117595Tu = (C117595Tu) arrayList.get(A015)))) >= i7 && A0H < i20) {
                                    A1E.add(c117595Tu);
                                    arrayList = c117565Tr.A0F;
                                    arrayList.remove(A015);
                                }
                            }
                            int i21 = i2 - i7;
                            int size = A1E.size();
                            for (int i22 = 0; i22 < size; i22++) {
                                C117595Tu c117595Tu2 = (C117595Tu) A1E.get(i22);
                                int A0H2 = c117565Tr.A0H(c117595Tu2) + i21;
                                if (A0H2 >= c117565Tr.A05) {
                                    c117595Tu2.A00 = -(length2 - A0H2);
                                } else {
                                    c117595Tu2.A00 = A0H2;
                                }
                                ArrayList arrayList2 = c117565Tr.A0F;
                                int A016 = AbstractC117585Tt.A01(arrayList2, A0H2, length2);
                                if (A016 < 0) {
                                    A016 = -(A016 + 1);
                                }
                                arrayList2.add(A016, c117595Tu2);
                            }
                            if (!(!C117565Tr.A0F(c117565Tr, i7, i6))) {
                                str = "Unexpectedly removed anchors";
                            } else {
                                C117565Tr.A0B(c117565Tr, i3, c117565Tr.A01, i2);
                                if (i8 > 0) {
                                    C117565Tr.A0C(c117565Tr, i12, i8, i7 - 1);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            str = "Cannot move a group while inserting";
        }
        C5UC.A03(str);
        throw C00O.createAndThrow();
    }
}
