package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HY9 extends AbstractC82033lP {
    public final /* synthetic */ InterfaceC1116050z A00;
    public final /* synthetic */ C111354zy A01;
    public final /* synthetic */ List A02;

    public HY9(InterfaceC1116050z interfaceC1116050z, C111354zy c111354zy, List list) {
        this.A02 = list;
        this.A01 = c111354zy;
        this.A00 = interfaceC1116050z;
    }

    @Override // X.AbstractC82033lP
    public final void A02(Map map) {
        List list = this.A02;
        list.addAll(map.values());
        C111354zy c111354zy = this.A01;
        UserSession userSession = c111354zy.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36315322877480086L)) {
            List<Reel> A0a = AbstractC001800i.A0a(map.values());
            HashMap A1G = AbstractC166987dD.A1G();
            for (Reel reel : A0a) {
                if (reel.A1A(userSession)) {
                    java.util.Set A0Q = reel.A0Q();
                    C14360o3.A07(A0Q);
                    if (AbstractC31171DnF.A1b(A0Q)) {
                        A1G.put(reel.getId(), A0Q);
                    }
                }
            }
            C82103lW.A02.A01(userSession, A1G);
        }
        C111354zy.A01(this.A00, c111354zy, list);
    }
}
