package X;

/* renamed from: X.0u1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17660u1 {
    public static C17640tz parseFromJson(C16L c16l) {
        return (C17640tz) C16V.A01(c16l, new C1EH() { // from class: X.0u0
            @Override // X.C1EH
            public final /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                C17640tz c17640tz = new C17640tz();
                if (c16l2.A11() != C16R.A0D) {
                    c16l2.A0z();
                    return null;
                }
                while (c16l2.A1J() != C16R.A09) {
                    String A0q = c16l2.A0q();
                    c16l2.A1J();
                    if ("10".equals(A0q)) {
                        c17640tz.A00 = c16l2.A0y();
                    } else if ("25".equals(A0q)) {
                        c17640tz.A01 = c16l2.A0y();
                    } else if ("50".equals(A0q)) {
                        c17640tz.A02 = c16l2.A0y();
                    } else if ("75".equals(A0q)) {
                        c17640tz.A03 = c16l2.A0y();
                    }
                    c16l2.A0z();
                }
                return c17640tz;
            }
        });
    }
}
