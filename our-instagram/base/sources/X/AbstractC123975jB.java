package X;

/* renamed from: X.5jB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123975jB {
    public static final C22933A9d A02(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, Integer num, String str, boolean z) {
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(interfaceC11380iw, 4);
        return new C22933A9d(interfaceC11380iw, c38321qM, num, str, z);
    }

    public static final long A00(String str) {
        long j = 0;
        if (str != null) {
            String[] strArr = (String[]) new C11L("_").A03(str).toArray(new String[0]);
            if (strArr.length >= 2) {
                str = strArr[0];
            }
            C14360o3.A0B(str, 0);
            try {
                j = Long.parseLong(str);
                return j;
            } catch (NumberFormatException e) {
                C0K8.A0O("IgMutationHelper", "invalid id: %s", str, e);
            }
        }
        return j;
    }

    public static final long A01(String str) {
        long j = 0;
        if (str != null) {
            String[] strArr = (String[]) new C11L("_").A03(str).toArray(new String[0]);
            if (strArr.length >= 2) {
                String str2 = strArr[1];
                C14360o3.A0B(str2, 0);
                try {
                    j = Long.parseLong(str2);
                    return j;
                } catch (NumberFormatException e) {
                    C0K8.A0O("IgMutationHelper", "invalid id: %s", str2, e);
                }
            }
        }
        return j;
    }
}
