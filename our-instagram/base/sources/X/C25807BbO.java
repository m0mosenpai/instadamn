package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.BbO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25807BbO extends C193578hc {
    public final OpalAudienceSelectorRepository A00;
    public final Map A01;
    public final C05A A02;
    public final C0UO A03;
    public final UserSession A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25807BbO(Application application, UserSession userSession, OpalAudienceSelectorRepository opalAudienceSelectorRepository) {
        super(application);
        AbstractC167017dG.A1Q(userSession, application);
        this.A04 = userSession;
        this.A00 = opalAudienceSelectorRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C26058Bfl());
        this.A02 = A1H;
        this.A03 = A1H;
        this.A01 = AbstractC166987dD.A1I();
        AbstractC166987dD.A1Z(new PZG(this, (InterfaceC23621Ds) null, 16), AbstractC141776au.A00(this));
    }

    public static final List A00(C25807BbO c25807BbO, Integer num, List list) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        boolean z = true;
        if (num != C05F.A00) {
            z = false;
            Map map = c25807BbO.A01;
            if ((!map.isEmpty()) || !(AbstractC001800i.A0J(list) instanceof C26225Bip)) {
                C26225Bip c26225Bip = new C26225Bip(C05F.A01, false);
                A1I.put(c26225Bip.getId(), c26225Bip);
            }
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                A1I.put(A1K.getKey(), new C26224Bio((OpalAudienceSelectorRepository.OpalAudience) A1K.getValue()));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC30950Dj7 interfaceC30950Dj7 = (InterfaceC30950Dj7) it.next();
            if (interfaceC30950Dj7 instanceof C26225Bip) {
                C26225Bip c26225Bip2 = (C26225Bip) interfaceC30950Dj7;
                if (c26225Bip2.A01) {
                    A1I.put(c26225Bip2.getId(), interfaceC30950Dj7);
                }
            } else if (interfaceC30950Dj7 instanceof C26224Bio) {
                if (z || !c25807BbO.A01.containsKey(((C26224Bio) interfaceC30950Dj7).A00.A01)) {
                    OpalAudienceSelectorRepository.OpalAudience opalAudience = ((C26224Bio) interfaceC30950Dj7).A00;
                    Map map2 = c25807BbO.A01;
                    String str = opalAudience.A01;
                    OpalAudienceSelectorRepository.OpalAudience opalAudience2 = (OpalAudienceSelectorRepository.OpalAudience) map2.get(str);
                    if (opalAudience2 == null) {
                        opalAudience2 = opalAudience;
                    }
                    boolean z2 = opalAudience2.A05;
                    String str2 = opalAudience.A03;
                    boolean z3 = opalAudience.A06;
                    String str3 = opalAudience.A00;
                    String str4 = opalAudience.A02;
                    boolean z4 = opalAudience.A04;
                    AbstractC167017dG.A1N(str, str2);
                    A1I.put(str, new C26224Bio(new OpalAudienceSelectorRepository.OpalAudience(str, str2, str3, str4, z2, z3, z4)));
                }
            } else {
                throw B4Z.A00();
            }
        }
        InterfaceC30950Dj7 interfaceC30950Dj72 = (InterfaceC30950Dj7) AbstractC001800i.A0C(A1I.values());
        if (interfaceC30950Dj72 instanceof C26225Bip) {
            A1I.remove(((C26225Bip) interfaceC30950Dj72).getId());
        }
        return AbstractC001800i.A0a(A1I.values());
    }
}
