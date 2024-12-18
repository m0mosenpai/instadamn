package X;

/* renamed from: X.8dV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191268dV {
    public static final C191258dU A00(C85A c85a) {
        C14360o3.A0B(c85a, 0);
        int ordinal = c85a.ordinal();
        if (ordinal != 5 && ordinal != 4 && ordinal != 6 && ordinal != 8) {
            if (ordinal == 2) {
                c85a = C85A.DIRECT;
            }
        } else {
            c85a = C85A.STORIES;
        }
        return new C191258dU(c85a, "SAVED");
    }

    public final C191258dU A01(C85A c85a, String str) {
        C14360o3.A0B(c85a, 0);
        C14360o3.A0B(str, 1);
        if (str.equals("SAVED")) {
            return A00(c85a);
        }
        return new C191258dU(c85a, str);
    }
}
