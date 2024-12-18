package X;

import com.facebook.R;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Bch, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25881Bch extends AbstractC52922bZ implements MR5 {
    public final long A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final C05A A04;
    public final C0UO A05;

    @Override // X.MR5
    public final void AJa(InterfaceC30826Dh1 interfaceC30826Dh1) {
        Object value;
        C51761Mtk c51761Mtk;
        C14360o3.A0B(interfaceC30826Dh1, 0);
        C05A c05a = this.A04;
        do {
            value = c05a.getValue();
            c51761Mtk = (C51761Mtk) value;
        } while (!c05a.AIi(value, C51761Mtk.A01((List) c51761Mtk.A00, AbstractC001800i.A0f((Iterable) c51761Mtk.A02, interfaceC30826Dh1))));
    }

    @Override // X.MR5
    public final void DOD(String str) {
    }

    @Override // X.MR5
    public final void DtP() {
    }

    public C25881Bch(UserSession userSession, String str, String str2, long j) {
        Object value;
        C51761Mtk c51761Mtk;
        C5QE A00;
        long j2;
        C5QE A002;
        AbstractC25234BEr.A1P(userSession, str, str2);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = j;
        this.A03 = str2;
        C008002u A1H = AbstractC25225BEi.A1H(new C51761Mtk(23));
        this.A04 = A1H;
        this.A05 = AbstractC208910l.A02(A1H);
        do {
            value = A1H.getValue();
            c51761Mtk = (C51761Mtk) value;
            if (AbstractC001900j.A0T(this.A02)) {
                A00 = BHS.A00(new Object[0], 2131973150);
            } else {
                A00 = MVZ.A00(this.A02);
            }
            j2 = this.A00;
            if (AbstractC001900j.A0T(this.A03)) {
                A002 = BHS.A00(new Object[0], 2131973151);
            } else {
                A002 = MVZ.A00(this.A03);
            }
        } while (!A1H.AIi(value, C51761Mtk.A01(AbstractC166987dD.A1J(new C26013Bf1(A00, A002, null, 2131965668, R.drawable.instagram_location_pano_outline_24, 2131977011, 2131972589, 2131965728, 2131976857, j2)), (List) c51761Mtk.A02)));
    }

    @Override // X.MR5
    public final void DI5() {
        Object value;
        C51761Mtk c51761Mtk;
        C05A c05a = this.A04;
        do {
            value = c05a.getValue();
            c51761Mtk = (C51761Mtk) value;
        } while (!c05a.AIi(value, C51761Mtk.A01((List) c51761Mtk.A00, AbstractC001800i.A0T(C29274CvV.A00, (Collection) c51761Mtk.A02))));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(new C19270xB("igd_security_alert"), this.A01), "igd_security_alerts");
        A0f.AAP(CacheBehaviorLogger.SOURCE, "login_details_page");
        A0f.AAP(AbstractC43591JPw.A00(1307), "open_login_activity_from_alert_details");
        if (A0f.isSampled()) {
            A0f.Cht();
        }
    }

    @Override // X.MR5
    public final C0UO CCF() {
        return this.A05;
    }
}
