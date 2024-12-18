package X;

import java.util.Map;

/* renamed from: X.35q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC682835q implements InterfaceC43071ya {
    public final Map A00;

    public final C5Ln A02(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A00;
        C5Ln c5Ln = (C5Ln) map.get(c38321qM.getId());
        if (c5Ln == null) {
            C5Ln c5Ln2 = new C5Ln(c38321qM);
            map.put(c38321qM.getId(), c5Ln2);
            return c5Ln2;
        }
        return c5Ln;
    }

    public AbstractC682835q(Map map) {
        this.A00 = map;
    }
}
