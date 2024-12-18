package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* loaded from: classes8.dex */
public final class L66 {
    public final /* synthetic */ KBD A00;

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        C44454JlM c44454JlM = (C44454JlM) this.A00.A01.getValue();
        EnumC203578zI enumC203578zI = EnumC203578zI.MORE_OPTIONS;
        UserSession userSession = c44454JlM.A01;
        AnonymousClass229.A01(userSession).A1F(enumC203578zI, str);
        C47Z A0h = AbstractC43593JPy.A0h(userSession, str);
        if (A0h != null) {
            C40121td.A0G.A01(AbstractC166987dD.A0O(c44454JlM.A00), userSession).A05(A0h);
            C25A.A00(userSession).A0A();
            if (A0h.A0D() == ShareType.A09) {
                AnonymousClass229.A01(userSession).A1F(null, str);
                C43904JbF c43904JbF = c44454JlM.A02;
                AbstractC166987dD.A1Z(new PYc(c43904JbF, str, null, 3), AbstractC141776au.A00(c43904JbF));
            }
            if (A0h.A11() && A0h.A0w()) {
                Integer A0i = AbstractC003100w.A0i(str);
                if (A0i != null) {
                    int intValue = A0i.intValue();
                    MXI mxi = c44454JlM.A03;
                    AbstractC166987dD.A1Z(new C57155PYz(mxi, null, intValue, 23), AbstractC141776au.A00(mxi));
                } else {
                    return;
                }
            }
            AnonymousClass229.A01(userSession).A1p(str);
            c44454JlM.A0E();
        }
    }

    public L66(KBD kbd) {
        this.A00 = kbd;
    }
}
