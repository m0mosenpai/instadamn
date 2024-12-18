package X;

/* renamed from: X.0Dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03260Dj {
    public static final boolean A00(String str, String str2) {
        Object A0L;
        C14360o3.A0B(str2, 1);
        if (str == null) {
            return false;
        }
        if (AbstractC001900j.A0U(str, ':')) {
            return str.equals(str2);
        }
        Object A0L2 = AbstractC001800i.A0L(AbstractC001900j.A0Q(str, new char[]{':'}, 0));
        if (A0L2 == null || (A0L = AbstractC001800i.A0L(AbstractC001900j.A0Q(str2, new char[]{':'}, 0))) == null) {
            return false;
        }
        C0w9.A03("incorrect_usersession_token_format_error", AnonymousClass001.A0R(str, " passed in follows old format."));
        return A0L2.equals(A0L);
    }
}
