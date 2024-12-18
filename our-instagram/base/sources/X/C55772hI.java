package X;

/* renamed from: X.2hI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55772hI {
    public static final C55782hJ A00(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        C55782hJ c55782hJ = (C55782hJ) abstractC12990ll.A01(C55782hJ.class, new C9EI(abstractC12990ll, 9));
        c55782hJ.A0F = true;
        return c55782hJ;
    }

    public final String A01(AbstractC12990ll abstractC12990ll) {
        C55782hJ A00 = A00(abstractC12990ll);
        String str = A00.A0C;
        String str2 = A00.A0B;
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                return AnonymousClass001.A0T(str2, str, ':');
            }
            return str;
        }
        return str2;
    }
}
