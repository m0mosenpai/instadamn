package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8TQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TQ {
    public final UserSession A00;
    public final C8TP A01;
    public final C184328Fw A02;

    public C8TQ(UserSession userSession, C8TP c8tp, C184328Fw c184328Fw) {
        C14360o3.A0B(c184328Fw, 1);
        C14360o3.A0B(userSession, 3);
        this.A02 = c184328Fw;
        this.A01 = c8tp;
        this.A00 = userSession;
    }

    public final boolean A00() {
        int intValue;
        C8TP c8tp = this.A01;
        if (!c8tp.A03()) {
            C8TN c8tn = c8tp.A00;
            if (!c8tn.A0C.A0V() || ((intValue = c8tp.A01().intValue()) != 1 && intValue != 3)) {
                if (c8tp.A02().contains(C81W.A0C)) {
                    if (!c8tn.A01 && c8tn.A0B.A0D == null) {
                        return true;
                    }
                } else if (c8tp.A00() instanceof C81V) {
                    C8KA Aus = c8tn.A0O.Aus();
                    if (Aus.A00 == C8K8.A03 && Aus.A01 == C8K9.A03) {
                        return true;
                    }
                } else if (!c8tn.A0F.A3K && !c8tp.A03()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A01() {
        C55U A00;
        C8TP c8tp = this.A01;
        C8TN c8tn = c8tp.A00;
        if (!c8tn.A0F.A3Q || (A00 = c8tp.A00()) == C81S.A00 || A00 == C1811381p.A00 || A00 == C81R.A00) {
            return false;
        }
        if ((A00 instanceof C81V) && c8tn.A0O.Aus().A01 != C8K9.A03) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        int intValue;
        C8TP c8tp = this.A01;
        C8TN c8tn = c8tp.A00;
        if (!c8tn.A0C.A0V() ? !c8tp.A02().contains(C81W.A0C) || (c8tn.A0B.A0D == null && !c8tn.A01) : (intValue = c8tp.A01().intValue()) != 1 && intValue != 3) {
            if (!c8tp.A03()) {
                return true;
            }
        }
        return false;
    }
}
