package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.service.common.ParsingSyncHttpService;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OU8 {
    public final C18920wW A00;
    public final UserSession A01;
    public final InterfaceC14020nS A02;
    public final C47Z A03;
    public final boolean A04;

    public static final void A00(OU8 ou8, List list, List list2) {
        int i;
        UserSession userSession = ou8.A01;
        C47Z c47z = ou8.A03;
        String str = c47z.A3t;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0R = true;
        StringBuilder A1C = AbstractC166987dD.A1C();
        EnumC53323Ni0.A0H.A00(A0c, userSession, A1C);
        A0c.A0E = AbstractC166987dD.A19(A1C);
        A0c.A9s("upload_id", str);
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C54599OAa c54599OAa = (C54599OAa) it.next();
            JSONObject A0q = AbstractC31171DnF.A0q();
            A0q.put("pdq_hash", c54599OAa.A00);
            A0q.put("frame_time", c54599OAa.A01);
            A0p.put(A0q);
        }
        A0c.A9s("pdq_hash_info", A0p.toString());
        if (AbstractC166987dD.A1b(list2)) {
            A0c.A9s("md5_hash_info", AbstractC25226BEj.A1H(":", list2, null));
        }
        C54600OAb A00 = ParsingSyncHttpService.A00(new C56150OwG(C52073N1y.A00, new C55927OsJ(1)), A0c.A0O());
        C18920wW c18920wW = ou8.A00;
        AbstractC54089Nvn.A00(c18920wW, C05F.A03, MSX.A0Y(c47z.A0x() ? 1 : 0), c47z.A3t, userSession.userId, null);
        C3JY c3jy = A00.A00;
        if (c3jy != null && (i = c3jy.A02) != 200) {
            String A06 = AbstractC13670mt.A06("Response status:%s Reason%s", Integer.valueOf(i), c3jy.A03);
            AbstractC54089Nvn.A00(c18920wW, C05F.A0C, MSX.A0Y(c47z.A0x() ? 1 : 0), c47z.A3t, userSession.userId, AnonymousClass001.A0R("network_error ", A06));
            C0w9.A03("video_pdq_report_network_error", A06);
        }
    }

    public OU8(UserSession userSession, InterfaceC14020nS interfaceC14020nS, C47Z c47z) {
        this.A01 = userSession;
        this.A03 = c47z;
        this.A02 = interfaceC14020nS;
        this.A04 = C18U.A06(C06090Tz.A05, userSession, 2342154707138511586L);
        this.A00 = AbstractC12220kQ.A02(userSession);
    }
}
