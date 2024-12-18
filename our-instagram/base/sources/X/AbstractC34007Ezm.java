package X;

import java.util.Map;

/* renamed from: X.Ezm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34007Ezm {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        AbstractC12990ll A0J = AbstractC31175DnJ.A0J(c6fq);
        String A0d = AbstractC31177DnL.A0d(c6fw);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, AbstractC58317Pt9.A00(1));
        String A1A = AbstractC166987dD.A1A("setting_type", (Map) A02);
        if (A0d.equals("permissions_requested") && A1A != null && A1A.length() != 0) {
            AbstractC25651Mw.A00(A0J).E4s(new C36092FwS(A1A));
            return null;
        }
        return null;
    }
}
