package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.97s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2054597s {
    public static final C2054597s A00 = new Object();
    public static final List A01;
    public static final List A02;
    public static final List A03;
    public static final List A04;
    public static final List A05;
    public static final List A06;

    public static final Capabilities A00(UserSession userSession, int i) {
        Collection A0S;
        C14360o3.A0B(userSession, 0);
        C16930sl c16930sl = C16930sl.A00;
        if (i != 29) {
            switch (i) {
                case 1012:
                    A0S = A01;
                    break;
                case 1013:
                case 1014:
                    A0S = A03;
                    break;
                default:
                    return A00.createWithAdditionalCapabilities(c16930sl, c16930sl);
            }
        } else {
            A0S = AbstractC001800i.A0S(A02, A06);
        }
        return A01(AbstractC001800i.A0S(c16930sl, A0S));
    }

    public final Capabilities createWithAdditionalCapabilities(List list, List list2) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(list2, 1);
        return A01(AbstractC001800i.A0S(list2, AbstractC001800i.A0S(list, A06)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.97s, java.lang.Object] */
    static {
        List singletonList = Collections.singletonList(EnumC2054697t.A12);
        C14360o3.A07(singletonList);
        A05 = singletonList;
        List singletonList2 = Collections.singletonList(EnumC2054697t.A09);
        C14360o3.A07(singletonList2);
        A04 = singletonList2;
        List singletonList3 = Collections.singletonList(EnumC2054697t.A05);
        C14360o3.A07(singletonList3);
        A02 = singletonList3;
        EnumC2054697t enumC2054697t = EnumC2054697t.A0u;
        EnumC2054697t enumC2054697t2 = EnumC2054697t.A07;
        EnumC2054697t enumC2054697t3 = EnumC2054697t.A0K;
        EnumC2054697t enumC2054697t4 = EnumC2054697t.A0O;
        EnumC2054697t enumC2054697t5 = EnumC2054697t.A0G;
        EnumC2054697t enumC2054697t6 = EnumC2054697t.A0F;
        EnumC2054697t enumC2054697t7 = EnumC2054697t.A0H;
        EnumC2054697t enumC2054697t8 = EnumC2054697t.A16;
        EnumC2054697t enumC2054697t9 = EnumC2054697t.A0E;
        EnumC2054697t enumC2054697t10 = EnumC2054697t.A0M;
        EnumC2054697t enumC2054697t11 = EnumC2054697t.A0Q;
        EnumC2054697t enumC2054697t12 = EnumC2054697t.A1B;
        EnumC2054697t enumC2054697t13 = EnumC2054697t.A0i;
        EnumC2054697t enumC2054697t14 = EnumC2054697t.A0n;
        EnumC2054697t enumC2054697t15 = EnumC2054697t.A0c;
        EnumC2054697t enumC2054697t16 = EnumC2054697t.A0b;
        EnumC2054697t enumC2054697t17 = EnumC2054697t.A0f;
        EnumC2054697t enumC2054697t18 = EnumC2054697t.A0d;
        EnumC2054697t enumC2054697t19 = EnumC2054697t.A0k;
        EnumC2054697t enumC2054697t20 = EnumC2054697t.A0l;
        EnumC2054697t enumC2054697t21 = EnumC2054697t.A0W;
        EnumC2054697t enumC2054697t22 = EnumC2054697t.A0X;
        EnumC2054697t enumC2054697t23 = EnumC2054697t.A0Y;
        EnumC2054697t enumC2054697t24 = EnumC2054697t.A0r;
        EnumC2054697t enumC2054697t25 = EnumC2054697t.A0e;
        A01 = AbstractC16960so.A1Q(enumC2054697t, enumC2054697t2, enumC2054697t3, enumC2054697t4, enumC2054697t5, enumC2054697t6, enumC2054697t7, enumC2054697t8, enumC2054697t9, enumC2054697t10, enumC2054697t11, enumC2054697t12, enumC2054697t13, enumC2054697t14, enumC2054697t15, enumC2054697t16, enumC2054697t17, enumC2054697t18, enumC2054697t19, enumC2054697t20, enumC2054697t21, enumC2054697t22, enumC2054697t23, enumC2054697t24, enumC2054697t25);
        EnumC2054697t enumC2054697t26 = EnumC2054697t.A11;
        EnumC2054697t enumC2054697t27 = EnumC2054697t.A10;
        A03 = AbstractC16960so.A1Q(enumC2054697t, enumC2054697t2, enumC2054697t3, enumC2054697t4, enumC2054697t5, enumC2054697t6, enumC2054697t7, enumC2054697t8, enumC2054697t9, enumC2054697t10, enumC2054697t26, enumC2054697t27, enumC2054697t13, enumC2054697t14, enumC2054697t15, enumC2054697t16, enumC2054697t17, enumC2054697t18, enumC2054697t19, enumC2054697t20, enumC2054697t21, enumC2054697t22, enumC2054697t23, enumC2054697t24, enumC2054697t25);
        EnumC2054697t[] enumC2054697tArr = new EnumC2054697t[45];
        System.arraycopy(new EnumC2054697t[]{enumC2054697t27, enumC2054697t26, EnumC2054697t.A19, EnumC2054697t.A15, EnumC2054697t.A1F, EnumC2054697t.A1C, EnumC2054697t.A1E, EnumC2054697t.A1A, enumC2054697t12, EnumC2054697t.A06, EnumC2054697t.A0S, enumC2054697t3, EnumC2054697t.A04, EnumC2054697t.A0x, enumC2054697t4, enumC2054697t5, EnumC2054697t.A0A, enumC2054697t6, EnumC2054697t.A0L, enumC2054697t7, enumC2054697t8, EnumC2054697t.A13, EnumC2054697t.A17, enumC2054697t9, enumC2054697t10, enumC2054697t2, EnumC2054697t.A1D}, 0, enumC2054697tArr, 0, 27);
        System.arraycopy(new EnumC2054697t[]{EnumC2054697t.A08, EnumC2054697t.A0N, EnumC2054697t.A0D, EnumC2054697t.A03, EnumC2054697t.A1G, EnumC2054697t.A0B, EnumC2054697t.A18, EnumC2054697t.A0y, EnumC2054697t.A0z, EnumC2054697t.A0t, EnumC2054697t.A0R, EnumC2054697t.A0J, EnumC2054697t.A0P, EnumC2054697t.A0I, EnumC2054697t.A14, enumC2054697t11, EnumC2054697t.A0w, enumC2054697t}, 0, enumC2054697tArr, 27, 18);
        A06 = AbstractC16960so.A1Q(enumC2054697tArr);
    }

    public static final Capabilities A01(List list) {
        Parcelable.Creator creator = Capabilities.CREATOR;
        return AbstractC2054797v.A00(AbstractC001800i.A0S(AbstractC16960so.A1Q(EnumC2054697t.A0q, EnumC2054697t.A0i, EnumC2054697t.A0n, EnumC2054697t.A0j, EnumC2054697t.A0p, EnumC2054697t.A0c, EnumC2054697t.A0T, EnumC2054697t.A0b, EnumC2054697t.A0f, EnumC2054697t.A0g, EnumC2054697t.A0d, EnumC2054697t.A0s, EnumC2054697t.A0k, EnumC2054697t.A0m, EnumC2054697t.A0l, EnumC2054697t.A0W, EnumC2054697t.A0X, EnumC2054697t.A0Y, EnumC2054697t.A0a, EnumC2054697t.A0r, EnumC2054697t.A0Z, EnumC2054697t.A0V, EnumC2054697t.A0U, EnumC2054697t.A0h, EnumC2054697t.A0o, EnumC2054697t.A0e), list));
    }
}
