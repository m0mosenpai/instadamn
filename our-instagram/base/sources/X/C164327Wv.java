package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Wv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164327Wv {
    public final UserSession A00;
    public final InterfaceC08830cm A01;
    public final BizUserInboxState A02;
    public final InterfaceC08830cm A03;
    public final boolean A04;

    public final void A00() {
        C43777JXq A00;
        InterfaceC08830cm interfaceC08830cm = this.A01;
        Object obj = interfaceC08830cm.get();
        C14360o3.A07(obj);
        if (((C7U0) obj).C7r().CeQ()) {
            Object obj2 = this.A03.get();
            if (obj2 != null) {
                int A1c = ((LinearLayoutManager) obj2).A1c();
                if (A1c != -1) {
                    if (this.A02 == BizUserInboxState.A04) {
                        Object obj3 = interfaceC08830cm.get();
                        C14360o3.A07(obj3);
                        InterfaceC163837Ux C7r = ((C7U0) obj3).C7r();
                        UserSession userSession = this.A00;
                        if (C7r.C7E(C2E8.A07(userSession)) == 1 && AbstractC159067Bs.A00(userSession)) {
                            return;
                        }
                    }
                    Object obj4 = interfaceC08830cm.get();
                    C14360o3.A07(obj4);
                    if (((C7U0) obj4).C7r().CeQ()) {
                        Object obj5 = interfaceC08830cm.get();
                        C14360o3.A07(obj5);
                        InterfaceC83733oI CCa = ((C7U0) obj5).C7r().CCa();
                        Object obj6 = interfaceC08830cm.get();
                        C14360o3.A07(obj6);
                        if (((C7U0) obj6).C7r().CXl() || CCa == null) {
                            return;
                        }
                        Object obj7 = interfaceC08830cm.get();
                        C14360o3.A07(obj7);
                        boolean CWI = ((C7U0) obj7).C7r().CWI();
                        Object obj8 = interfaceC08830cm.get();
                        C14360o3.A07(obj8);
                        C7U0 c7u0 = (C7U0) obj8;
                        if (CWI) {
                            if (!c7u0.C7r().Cf6()) {
                                return;
                            }
                            Object obj9 = interfaceC08830cm.get();
                            C14360o3.A07(obj9);
                            if (((C7U0) obj9).C7r().CdS() && !AbstractC1337462f.A03(this.A00)) {
                                return;
                            }
                            Object obj10 = interfaceC08830cm.get();
                            C14360o3.A07(obj10);
                            ((C7U0) obj10).Cn4(CCa, A1c);
                            UserSession userSession2 = this.A00;
                            LA3 la3 = new LA3(userSession2);
                            C46922Dg c46922Dg = ((C2DU) AbstractC28761aE.A00(userSession2)).A0C;
                            Object obj11 = interfaceC08830cm.get();
                            C14360o3.A07(obj11);
                            c46922Dg.A0N(la3.A00(), 1, ((C7U0) obj11).C7r().CdS());
                            if (this.A04 || (A00 = JYM.A00(userSession2, EnumC132075xi.A0F)) == null) {
                                return;
                            }
                            String str = ((C83693oE) CCa).A00;
                            C14360o3.A0B(str, 0);
                            A00.A00(str);
                            return;
                        }
                        c7u0.Cn4(CCa, A1c);
                        return;
                    }
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C164327Wv(UserSession userSession, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, boolean z) {
        this.A00 = userSession;
        this.A04 = z;
        this.A01 = interfaceC08830cm;
        this.A03 = interfaceC08830cm2;
        this.A02 = AbstractC81043jY.A00(String.valueOf(AbstractC2056298m.A00(userSession).A02()));
    }
}
