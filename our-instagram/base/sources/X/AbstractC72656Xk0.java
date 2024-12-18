package X;

/* renamed from: X.Xk0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72656Xk0 {
    public static final InterfaceC30852DhR A00(Boolean bool, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (!z2) {
            return C29540Czs.A00;
        }
        boolean A1Z = AbstractC166997dE.A1Z(bool, true);
        if (str == null) {
            if (A1Z) {
                return new C72323XbL();
            }
            if (str3 != null) {
                return new AbstractC29538Czq(null, C05F.A00, str3, 2131953869, 2131953868);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (z) {
            if (A1Z) {
                return z3 ? new C72325XbN() : new C72326XbO();
            }
            if (z3) {
                if (str3 != null) {
                    return new AbstractC29538Czq(2131953891, C05F.A0C, str3, 2131953892, 2131953888);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            if (str3 != null) {
                return new AbstractC29538Czq(null, C05F.A0N, str3, 2131953892, 2131953897);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (A1Z) {
            return new C72324XbM();
        }
        if (str2 == null) {
            return new C72327XbP();
        }
        return new AbstractC29538Czq(null, C05F.A01, str2, 2131953872, 2131953870);
    }
}
