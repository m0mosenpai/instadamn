package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public final class JnA extends AbstractC52922bZ implements MR5 {
    public final long A00;
    public final C47407Kww A01;
    public final String A02;
    public final C05A A03;
    public final UserSession A04;
    public final C0UO A05;

    public JnA(UserSession userSession, C47407Kww c47407Kww, String str, long j) {
        int A07 = AbstractC25230BEn.A07(2, str, userSession);
        this.A00 = j;
        this.A02 = str;
        this.A04 = userSession;
        this.A01 = c47407Kww;
        C008002u A1H = AbstractC25225BEi.A1H(new C51761Mtk(23));
        this.A03 = A1H;
        this.A05 = AbstractC208910l.A02(A1H);
        MCO.A03(this, C12L.A00.CPG(480314591, A07), AbstractC141776au.A00(this), 45);
    }

    @Override // X.MR5
    public final void AJa(InterfaceC30826Dh1 interfaceC30826Dh1) {
        Object value;
        C51761Mtk c51761Mtk;
        C14360o3.A0B(interfaceC30826Dh1, 0);
        C05A c05a = this.A03;
        do {
            value = c05a.getValue();
            c51761Mtk = (C51761Mtk) value;
        } while (!c05a.AIi(value, C51761Mtk.A01((List) c51761Mtk.A00, AbstractC001800i.A0f((Iterable) c51761Mtk.A02, interfaceC30826Dh1))));
    }

    @Override // X.MR5
    public final void DOD(String str) {
        Object value;
        C51761Mtk c51761Mtk;
        C14360o3.A0B(str, 0);
        C05A c05a = this.A03;
        do {
            value = c05a.getValue();
            c51761Mtk = (C51761Mtk) value;
        } while (!c05a.AIi(value, C51761Mtk.A01((List) c51761Mtk.A00, AbstractC001800i.A0T(new E9P(str, 0), (Collection) c51761Mtk.A02))));
        InterfaceC02590Ai A0I = JQ0.A0I(this.A04);
        A0I.AAP(CacheBehaviorLogger.SOURCE, "key_details_page");
        AbstractC43594JPz.A1C(A0I, "security_alert_action", "key_copied_from_alert_details");
    }

    @Override // X.MR5
    public final C0UO CCF() {
        return this.A05;
    }

    @Override // X.MR5
    public final void DI5() {
        Object value;
        C51761Mtk c51761Mtk;
        C05A c05a = this.A03;
        do {
            value = c05a.getValue();
            c51761Mtk = (C51761Mtk) value;
        } while (!c05a.AIi(value, C51761Mtk.A01((List) c51761Mtk.A00, AbstractC001800i.A0T(new E9P("https://help.instagram.com/965762990800513/", 1), (Collection) c51761Mtk.A02))));
    }

    @Override // X.MR5
    public final void DtP() {
        Object value;
        C51761Mtk c51761Mtk;
        C05A c05a = this.A03;
        do {
            value = c05a.getValue();
            c51761Mtk = (C51761Mtk) value;
        } while (!c05a.AIi(value, C51761Mtk.A01((List) c51761Mtk.A00, AbstractC001800i.A0T(new E9P("https://help.instagram.com/491565145294150", 1), (Collection) c51761Mtk.A02))));
    }
}
