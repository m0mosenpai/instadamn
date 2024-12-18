package X;

/* renamed from: X.0jQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11670jQ {
    public static C11650jO parseFromJson(C16L c16l) {
        return (C11650jO) C16V.A01(c16l, new C1EH() { // from class: X.0jP
            @Override // X.C1EH
            public final /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                C11650jO c11650jO = new C11650jO();
                if (c16l2.A11() != C16R.A0D) {
                    c16l2.A0z();
                    return null;
                }
                while (c16l2.A1J() != C16R.A09) {
                    String A0q = c16l2.A0q();
                    c16l2.A1J();
                    String str = null;
                    if ("uid".equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        c11650jO.A01 = str;
                    } else if ("debug_token".equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        c11650jO.A00 = str;
                    }
                    c16l2.A0z();
                }
                return c11650jO;
            }
        });
    }
}
