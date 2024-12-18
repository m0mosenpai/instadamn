package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Ld6 implements InterfaceC13000lm {
    public final UserSession A00;
    public final Map A01;
    public final Map A02;
    public final C99E A03;

    public Ld6(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = Collections.synchronizedMap(AbstractC166987dD.A1G());
        this.A02 = Collections.synchronizedMap(AbstractC166987dD.A1G());
        C99E c99e = C99C.A01;
        this.A03 = C99F.A00(userSession).A00(EnumC92794Ds.A04);
    }

    public final void A00(MsysThreadId msysThreadId, String str, String str2, String str3) {
        String str4;
        Map A07;
        AbstractC167017dG.A1N(msysThreadId, str);
        C99E c99e = this.A03;
        if (c99e == null || (str4 = c99e.ARy(str2)) == null) {
            str4 = str2;
        }
        UserSession userSession = this.A00;
        L53 l53 = new L53(null, str, str4, userSession.userId, AbstractC166997dE.A0Y(userSession).getUsername(), AbstractC43592JPx.A0w(AbstractC166997dE.A0Y(userSession).A0C()), str3, AbstractC25232BEp.A0t(AbstractC166997dE.A0Y(userSession).BTC()), System.currentTimeMillis());
        long j = msysThreadId.A00;
        Map map = this.A02;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            A07 = (Map) map.get(valueOf);
            if (A07 != null) {
                A07.put(str, l53);
            } else {
                return;
            }
        } else {
            A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b(str, l53));
        }
        map.put(valueOf, A07);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
        this.A02.clear();
    }
}
