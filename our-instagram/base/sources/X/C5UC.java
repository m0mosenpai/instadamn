package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.5UC, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5UC {
    public static final Object A00;
    public static final Object A01;
    public static final Object A02;
    public static final Object A03;
    public static final Object A04;
    public static final Comparator A05 = new Comparator() { // from class: X.5UE
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C14360o3.A00(((C128285qx) obj).A01, ((C128285qx) obj2).A01);
        }
    };

    static {
        final String str = "provider";
        A01 = new Object(str) { // from class: X.5UD
            public final String A00;

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C5UD) && C14360o3.A0K(this.A00, ((C5UD) obj).A00));
            }

            public final int hashCode() {
                return this.A00.hashCode();
            }

            public final String toString() {
                return AnonymousClass001.A0S("OpaqueKey(key=", this.A00, ')');
            }

            {
                this.A00 = str;
            }
        };
        A02 = new Object(str) { // from class: X.5UD
            public final String A00;

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C5UD) && C14360o3.A0K(this.A00, ((C5UD) obj).A00));
            }

            public final int hashCode() {
                return this.A00.hashCode();
            }

            public final String toString() {
                return AnonymousClass001.A0S("OpaqueKey(key=", this.A00, ')');
            }

            {
                this.A00 = str;
            }
        };
        final String str2 = "compositionLocalMap";
        A00 = new Object(str2) { // from class: X.5UD
            public final String A00;

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C5UD) && C14360o3.A0K(this.A00, ((C5UD) obj).A00));
            }

            public final int hashCode() {
                return this.A00.hashCode();
            }

            public final String toString() {
                return AnonymousClass001.A0S("OpaqueKey(key=", this.A00, ')');
            }

            {
                this.A00 = str2;
            }
        };
        final String str3 = "providers";
        A03 = new Object(str3) { // from class: X.5UD
            public final String A00;

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C5UD) && C14360o3.A0K(this.A00, ((C5UD) obj).A00));
            }

            public final int hashCode() {
                return this.A00.hashCode();
            }

            public final String toString() {
                return AnonymousClass001.A0S("OpaqueKey(key=", this.A00, ')');
            }

            {
                this.A00 = str3;
            }
        };
        final String str4 = "reference";
        A04 = new Object(str4) { // from class: X.5UD
            public final String A00;

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C5UD) && C14360o3.A0K(this.A00, ((C5UD) obj).A00));
            }

            public final int hashCode() {
                return this.A00.hashCode();
            }

            public final String toString() {
                return AnonymousClass001.A0S("OpaqueKey(key=", this.A00, ')');
            }

            {
                this.A00 = str4;
            }
        };
    }

    public static final void A01(C5Z3 c5z3, C117565Tr c117565Tr) {
        Object obj;
        int i;
        int i2;
        int i3 = c117565Tr.A00;
        int i4 = c117565Tr.A01;
        while (i3 < i4) {
            int A002 = C117565Tr.A00(c117565Tr, i3);
            int[] iArr = c117565Tr.A0I;
            if (AbstractC117585Tt.A03(iArr, A002)) {
                Object[] objArr = c117565Tr.A0J;
                int A012 = C117565Tr.A01(c117565Tr, iArr, A002);
                if (A012 >= c117565Tr.A0B) {
                    A012 += c117565Tr.A09;
                }
                obj = objArr[A012];
            } else {
                obj = null;
            }
            if (obj instanceof C59C) {
                C5Z2 c5z2 = (C5Z2) c5z3;
                C5Z2.A00(c5z2, (c117565Tr.A0J.length - c117565Tr.A09) - C117565Tr.A03(c117565Tr, iArr, C117565Tr.A00(c117565Tr, i3)));
                c5z2.A03.add(obj);
            }
            int A003 = C117565Tr.A00(c117565Tr, i3);
            int[] iArr2 = c117565Tr.A0I;
            int A032 = C117565Tr.A03(c117565Tr, iArr2, A003);
            int i5 = i3 + 1;
            int A013 = C117565Tr.A01(c117565Tr, iArr2, C117565Tr.A00(c117565Tr, i5));
            for (int i6 = A032; i6 < A013; i6++) {
                int i7 = i6 - A032;
                Object[] objArr2 = c117565Tr.A0J;
                int i8 = i6;
                if (i6 >= c117565Tr.A0B) {
                    i8 = i6 + c117565Tr.A09;
                }
                Object obj2 = objArr2[i8];
                if (obj2 instanceof C117675Uc) {
                    C117675Uc c117675Uc = (C117675Uc) obj2;
                    C2DD c2dd = c117675Uc.A01;
                    if (c2dd instanceof C6NL) {
                        continue;
                    } else {
                        Object obj3 = C5UI.A00;
                        int A0G = c117565Tr.A0G(i3, i7);
                        if (A0G >= c117565Tr.A0B) {
                            A0G += c117565Tr.A09;
                        }
                        Object[] objArr3 = c117565Tr.A0J;
                        Object obj4 = objArr3[A0G];
                        objArr3[A0G] = obj3;
                        if (obj2 == obj4) {
                            int length = objArr3.length - c117565Tr.A09;
                            int i9 = length - i7;
                            C117595Tu c117595Tu = c117675Uc.A00;
                            if (c117595Tu != null && c117595Tu.A00 != Integer.MIN_VALUE) {
                                i = c117565Tr.A0H(c117595Tu);
                                int[] iArr3 = c117565Tr.A0I;
                                i2 = length - C117565Tr.A01(c117565Tr, iArr3, C117565Tr.A00(c117565Tr, iArr3[(C117565Tr.A00(c117565Tr, i) * 5) + 3] + i));
                            } else {
                                i = -1;
                                i2 = -1;
                            }
                            c5z3.AWY(c2dd, i9, i, i2);
                        } else {
                            A03("Slot table is out of sync");
                            throw C00O.createAndThrow();
                        }
                    }
                } else {
                    if (obj2 instanceof C5UU) {
                        Object obj5 = C5UI.A00;
                        int A0G2 = c117565Tr.A0G(i3, i7);
                        if (A0G2 >= c117565Tr.A0B) {
                            A0G2 += c117565Tr.A09;
                        }
                        Object[] objArr4 = c117565Tr.A0J;
                        Object obj6 = objArr4[A0G2];
                        objArr4[A0G2] = obj5;
                        if (obj2 == obj6) {
                            ((C5UU) obj2).A00();
                        } else {
                            A03("Slot table is out of sync");
                            throw C00O.createAndThrow();
                        }
                    } else {
                        continue;
                    }
                }
            }
            i3 = i5;
        }
    }

    public static final void A02(C5Z3 c5z3, C117565Tr c117565Tr) {
        int i;
        int i2;
        int i3 = c117565Tr.A00;
        int A002 = C117565Tr.A00(c117565Tr, i3);
        int[] iArr = c117565Tr.A0I;
        int A012 = C117565Tr.A01(c117565Tr, iArr, C117565Tr.A00(c117565Tr, i3 + iArr[(A002 * 5) + 3]));
        for (int A013 = C117565Tr.A01(c117565Tr, iArr, A002); A013 < A012; A013++) {
            Object[] objArr = c117565Tr.A0J;
            int i4 = A013;
            if (A013 >= c117565Tr.A0B) {
                i4 = A013 + c117565Tr.A09;
            }
            Object obj = objArr[i4];
            int i5 = -1;
            if (obj instanceof C59C) {
                int length = (objArr.length - c117565Tr.A09) - A013;
                C5Z2 c5z2 = (C5Z2) c5z3;
                C18570vk c18570vk = c5z2.A00;
                if (c18570vk == null) {
                    C18570vk c18570vk2 = AbstractC004901o.A00;
                    c18570vk = new C18570vk(6);
                    c5z2.A00 = c18570vk;
                }
                c18570vk.A03[C18570vk.A01(c18570vk, obj)] = obj;
                C5Z2.A00(c5z2, length);
                c5z2.A03.add(obj);
            }
            if (obj instanceof C117675Uc) {
                int length2 = c117565Tr.A0J.length - c117565Tr.A09;
                int i6 = length2 - A013;
                C117675Uc c117675Uc = (C117675Uc) obj;
                C117595Tu c117595Tu = c117675Uc.A00;
                if (c117595Tu != null && c117595Tu.A00 != Integer.MIN_VALUE) {
                    i5 = c117565Tr.A0H(c117595Tu);
                    int[] iArr2 = c117565Tr.A0I;
                    i2 = length2 - C117565Tr.A01(c117565Tr, iArr2, C117565Tr.A00(c117565Tr, iArr2[(C117565Tr.A00(c117565Tr, i5) * 5) + 3] + i5));
                } else {
                    i2 = -1;
                }
                c5z3.AWY(c117675Uc.A01, i6, i5, i2);
            }
            if (obj instanceof C5UU) {
                ((C5UU) obj).A00();
            }
        }
        if (c117565Tr.A06 == 0) {
            int i7 = c117565Tr.A00;
            int i8 = c117565Tr.A02;
            int[] iArr3 = c117565Tr.A0I;
            int A003 = C117565Tr.A00(c117565Tr, i7);
            int A014 = C117565Tr.A01(c117565Tr, iArr3, A003);
            int i9 = A003 * 5;
            int i10 = iArr3[i9 + 3] + i7;
            c117565Tr.A00 = i10;
            c117565Tr.A02 = C117565Tr.A01(c117565Tr, iArr3, C117565Tr.A00(c117565Tr, i10));
            if (AbstractC117585Tt.A03(iArr3, A003)) {
                i = 1;
            } else {
                i = iArr3[i9 + 1] & 67108863;
            }
            C117565Tr.A07(c117565Tr, c117565Tr.A08);
            C6NJ c6nj = c117565Tr.A0E;
            if (c6nj != null) {
                while ((!c6nj.A00.isEmpty()) && ((Number) AbstractC001800i.A0I(c6nj.A00)).intValue() >= i7) {
                    c6nj.A00();
                }
            }
            C117565Tr.A0F(c117565Tr, i7, c117565Tr.A00 - i7);
            C117565Tr.A0C(c117565Tr, A014, c117565Tr.A02 - A014, i7 - 1);
            c117565Tr.A00 = i7;
            c117565Tr.A02 = i8;
            c117565Tr.A07 -= i;
            return;
        }
        A03("Cannot remove group while inserting");
        throw C00O.createAndThrow();
    }

    public static final void A03(String str) {
        throw new VIJ(AnonymousClass001.A0g("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void A04(String str) {
        throw new VIJ(AnonymousClass001.A0g("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void A06(boolean z) {
        if (!z) {
            A03("Check failed");
            throw C00O.createAndThrow();
        }
    }

    public static final int A00(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int A002 = C14360o3.A00(((C128285qx) list.get(i3)).A01, i);
            if (A002 < 0) {
                i2 = i3 + 1;
            } else if (A002 > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final void A05(List list, int i, int i2) {
        int A002 = A00(list, i);
        if (A002 < 0) {
            A002 = -(A002 + 1);
        }
        while (A002 < list.size() && ((C128285qx) list.get(A002)).A01 < i2) {
            list.remove(A002);
        }
    }
}
