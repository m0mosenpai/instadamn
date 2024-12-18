package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7Cv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159357Cv extends C160477Hh {
    public final C7FJ A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public final boolean A05() {
        DirectThreadKey directThreadKey;
        InterfaceC160517Hl interfaceC160517Hl = (InterfaceC160517Hl) this.A05.invoke();
        UserSession userSession = super.A00;
        C2EE c2ee = super.A01;
        if (c2ee != null) {
            directThreadKey = JRE.A02(c2ee.BKb());
        } else {
            directThreadKey = null;
        }
        if (interfaceC160517Hl.CQO(userSession, directThreadKey)) {
            if (!A01() || A04(C05F.A09)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C159357Cv(C160477Hh c160477Hh) {
        super(c160477Hh);
        this.A00 = new C7FJ(super.A00);
        this.A02 = C1XM.A00(new C206819Dm(this, 44));
        this.A01 = C1XM.A00(new C206819Dm(this, 43));
    }
}
