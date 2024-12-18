package X;

/* renamed from: X.NwQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54128NwQ {
    public static final Long A00(C41181vS c41181vS) {
        EnumC40111tc enumC40111tc;
        C38321qM c38321qM = c41181vS.A0b;
        C105824pt c105824pt = c41181vS.A0c;
        if (c38321qM != null) {
            enumC40111tc = c38321qM.BRp();
        } else if (c105824pt != null) {
            EnumC109104va enumC109104va = c105824pt.A06;
            if (enumC109104va == null) {
                enumC109104va = EnumC109104va.A0E;
            }
            if (enumC109104va.A01()) {
                enumC40111tc = EnumC40111tc.A0M;
            } else {
                enumC40111tc = EnumC40111tc.A0L;
            }
        } else {
            return null;
        }
        return AbstractC31171DnF.A0V(enumC40111tc.A00);
    }
}
