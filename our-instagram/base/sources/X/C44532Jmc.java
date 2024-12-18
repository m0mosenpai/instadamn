package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jmc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44532Jmc extends AbstractC52922bZ {
    public final UserSession A00;
    public final SecurityAlertLocalDataSource A01;
    public final C109494wb A02;
    public final C05A A03;
    public final C0UO A04;

    public static final void A00(InterfaceC37097GWh interfaceC37097GWh, C44532Jmc c44532Jmc) {
        Object value;
        C51760Mtj c51760Mtj;
        ArrayList A0T;
        C05A c05a = c44532Jmc.A03;
        do {
            value = c05a.getValue();
            c51760Mtj = (C51760Mtj) value;
            A0T = AbstractC001800i.A0T(interfaceC37097GWh, (Collection) c51760Mtj.A01);
        } while (!c05a.AIi(value, C51760Mtj.A00((C51748MtX) c51760Mtj.A00, (Integer) c51760Mtj.A02, A0T)));
    }

    public C44532Jmc(UserSession userSession, SecurityAlertLocalDataSource securityAlertLocalDataSource, C109494wb c109494wb) {
        AbstractC167017dG.A1R(c109494wb, securityAlertLocalDataSource);
        this.A00 = userSession;
        this.A02 = c109494wb;
        this.A01 = securityAlertLocalDataSource;
        C008002u A1H = AbstractC25225BEi.A1H(new C51760Mtj((C51748MtX) null, (Integer) null, (List) null, (DefaultConstructorMarker) null, 7, 33));
        this.A03 = A1H;
        this.A04 = AbstractC208910l.A02(A1H);
        AbstractC166987dD.A1Z(new PYe(this, null), AbstractC141776au.A00(this));
    }
}
