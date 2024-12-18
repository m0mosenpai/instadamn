package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LLi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47996LLi {
    public static final C910143t A03(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, ExtendedImageUrl extendedImageUrl3, Integer num, String str, String str2, String str3, String str4, List list, int i, int i2) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, extendedImageUrl, extendedImageUrl2, extendedImageUrl3, bool, bool, null, null, num, null, null, null, null, null, null, null, str, null, str2, str3, null, null, str4, null, null, null, list, i, i2, 0, false);
    }

    public static final C910143t A04(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, ExtendedImageUrl extendedImageUrl3, String str, String str2, String str3, String str4, int i, int i2) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, extendedImageUrl, extendedImageUrl2, extendedImageUrl3, bool, bool, null, null, null, null, null, null, null, null, null, null, str, null, str2, str3, null, null, str4, null, null, null, null, i, i2, 0, false);
    }

    public static final C910143t A05(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, Boolean bool, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, List list, int i) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool2 = Boolean.FALSE;
        return A02(enumC910243u, extendedImageUrl, extendedImageUrl2, null, bool2, bool2, bool, null, num, num2, null, null, null, null, l, str, str2, null, str3, str4, null, null, str5, null, null, null, list, i, 0, 0, false);
    }

    public static final C910143t A09(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, null, extendedImageUrl, extendedImageUrl2, bool, bool, null, null, null, null, null, null, null, null, null, null, str, str2, str3, null, str4, null, str5, null, null, null, null, i, i2, 0, false);
    }

    public static final C910143t A0B(ExtendedImageUrl extendedImageUrl, String str, int i) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, null, extendedImageUrl, null, bool, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, i, 0, 0, false);
    }

    public static final C910143t A0E(ExtendedImageUrl extendedImageUrl, String str, String str2, String str3) {
        return A09(extendedImageUrl, null, str, str2, null, str3, null, 0, 0);
    }

    public static final C910143t A0G(Long l, String str, String str2, String str3) {
        C14360o3.A0B(str2, 2);
        List A1J = AbstractC166987dD.A1J(new C9CP(str2, "web_url", null));
        return A02(EnumC910243u.SINGLE, null, null, null, false, false, null, 1, null, null, 0, null, null, AbstractC37302Gc3.A0V(str3), l, null, null, null, str, null, null, null, null, null, null, null, A1J, 8, 0, 0, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r6.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C910143t A0J(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r2 = 1
            if (r6 == 0) goto La
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto Lb
        La:
            r0 = 1
        Lb:
            java.lang.String r1 = ""
            com.instagram.model.mediasize.ExtendedImageUrl r3 = new com.instagram.model.mediasize.ExtendedImageUrl
            if (r0 == 0) goto L47
            r3.<init>(r1, r2, r2)
        L14:
            if (r7 == 0) goto L1c
            int r0 = r7.length()
            if (r0 != 0) goto L1d
        L1c:
            r7 = r1
        L1d:
            if (r8 == 0) goto L25
            int r0 = r8.length()
            if (r0 != 0) goto L26
        L25:
            r8 = r1
        L26:
            if (r4 == 0) goto L42
            int r0 = r4.length()
            if (r0 == 0) goto L42
            java.util.Locale r2 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r4}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "https://www.instagram.com/_n/product_display_page?business_user_id=%s&merchant_name=shop&product_id=%s&entry_point=direct_hscroll_xma"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            X.C14360o3.A07(r1)
        L42:
            X.43t r0 = A0D(r3, r7, r8, r1)
            return r0
        L47:
            r3.<init>(r6, r2, r2)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC47996LLi.A0J(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):X.43t");
    }

    public static final C910143t A0K(String str, String str2, String str3, String str4, List list) {
        ExtendedImageUrl extendedImageUrl;
        if (str4 == null) {
            extendedImageUrl = null;
        } else {
            extendedImageUrl = new ExtendedImageUrl(str4, -1, -1);
        }
        C910143t A02 = A02(EnumC910243u.GRID_VIEW_3X2, extendedImageUrl, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, str, str2, null, null, str3, null, null, null, null, 0, 0, 0, false);
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                String str5 = (String) obj;
                if (str5 != null && str5.length() != 0) {
                    A1E.add(obj);
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                A0q.add(new ExtendedImageUrl(AbstractC166987dD.A1B(it), -1, -1));
            }
            if (A0q.size() == 6) {
                A02.A1g = A0q;
            }
        }
        return A02;
    }

    public static final C910143t A00() {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, null, null, null, bool, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false);
    }

    public static final C910143t A06(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, String str, String str2) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, null, extendedImageUrl, extendedImageUrl2, bool, bool, null, null, null, null, null, null, null, null, null, null, null, null, str, str2, null, null, null, null, null, null, null, 0, 0, 0, false);
    }

    public static final C910143t A07(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, String str, String str2, String str3) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, extendedImageUrl, extendedImageUrl2, null, bool, bool, null, null, null, null, null, null, null, null, null, null, null, null, str, str2, null, null, str3, null, null, null, null, 0, 0, 0, false);
    }

    public static final C910143t A08(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, String str, String str2, String str3, String str4, String str5) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, extendedImageUrl, extendedImageUrl2, null, bool, bool, null, null, null, null, null, null, null, null, null, null, str, str2, str3, str4, null, null, str5, null, null, null, null, 0, 0, 0, false);
    }

    public static final C910143t A0A(ExtendedImageUrl extendedImageUrl, String str) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.TRUE;
        return A02(enumC910243u, null, extendedImageUrl, null, bool, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, 0, 0, 0, false);
    }

    public static final C910143t A0C(ExtendedImageUrl extendedImageUrl, String str, String str2) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, null, null, extendedImageUrl, bool, bool, null, null, null, null, null, null, null, null, null, null, null, null, str, str2, null, null, null, null, null, null, null, 0, 0, 0, false);
    }

    public static final C910143t A0D(ExtendedImageUrl extendedImageUrl, String str, String str2, String str3) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, null, extendedImageUrl, null, bool, bool, null, null, null, null, null, null, null, null, null, null, null, null, str, str2, null, null, str3, null, null, null, null, 0, 0, 0, false);
    }

    public static final C910143t A0F(ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, String str4) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, null, extendedImageUrl, null, bool, bool, null, null, null, null, null, null, null, null, null, null, str, null, str2, str3, null, null, str4, null, null, null, null, 0, 0, 0, false);
    }

    public static final C910143t A0H(String str, String str2, String str3) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, null, null, null, bool, bool, null, null, null, null, null, null, null, null, null, null, str, str2, null, null, null, null, str3, null, null, null, null, 0, 0, 0, false);
    }

    public static final C910143t A0I(String str, String str2, String str3) {
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(enumC910243u, null, null, null, bool, bool, null, null, null, null, null, null, null, null, null, null, null, null, str, str2, null, null, str3, null, null, null, null, 0, 0, 0, false);
    }

    public static final C910143t A01() {
        return A00();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.43t, java.lang.Object] */
    public static final C910143t A02(EnumC910243u enumC910243u, ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, ExtendedImageUrl extendedImageUrl3, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, int i, int i2, int i3, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        ?? obj = new Object();
        obj.A0Q = EnumC910243u.SINGLE;
        obj.A08 = 0;
        obj.A09 = 0;
        obj.A1l = false;
        obj.A1h = false;
        obj.A1i = false;
        obj.A0C = 0L;
        obj.A02 = i;
        obj.A0U = extendedImageUrl;
        if (num != null) {
            obj.A00 = num.intValue();
        }
        obj.A13 = str2;
        obj.A12 = str3;
        obj.A0X = extendedImageUrl2;
        obj.A08 = i2;
        obj.A09 = i3;
        obj.A0T = extendedImageUrl3;
        obj.A1Q = str4;
        if (num2 != null) {
            obj.A07 = num2.intValue();
        }
        obj.A1O = str5;
        if (num3 != null) {
            obj.A06 = num3.intValue();
        }
        obj.A0v = str6;
        obj.A1H = str7;
        obj.A0n = null;
        obj.A0m = null;
        obj.A0w = str8;
        obj.A0e = bool;
        obj.A0b = bool2;
        obj.A0c = valueOf;
        obj.A1g = null;
        obj.A0Q = enumC910243u;
        if (num4 != null) {
            obj.A01 = num4.intValue();
        }
        obj.A1Y = list;
        obj.A0o = l;
        obj.A1X = list2;
        obj.A1I = null;
        obj.A1K = null;
        obj.A1L = null;
        obj.A1M = null;
        obj.A0Y = null;
        if (bool3 != null) {
            obj.A1j = bool3.booleanValue();
        }
        obj.A0f = num6;
        obj.A0h = null;
        obj.A0g = null;
        obj.A1G = str9;
        obj.A0i = num5;
        obj.A0j = null;
        obj.A1F = str10;
        obj.A0p = l2;
        obj.A0u = str;
        return obj;
    }
}
