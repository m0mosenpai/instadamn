package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Mf4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50935Mf4 extends AbstractC52922bZ {
    public final UserSession A00;
    public final C159407Da A01;
    public final List A02;
    public final List A03;
    public final InterfaceC06180Ui A04;
    public final InterfaceC15070pN A05;
    public final P8J A06;

    public C50935Mf4(UserSession userSession, C159407Da c159407Da, String str, String str2) {
        int A07 = AbstractC25230BEn.A07(1, userSession, str2);
        this.A00 = userSession;
        this.A01 = c159407Da;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 1, 0);
        this.A04 = A00;
        this.A05 = new C06160Ug(null, A00);
        this.A02 = AbstractC166987dD.A1E();
        this.A03 = AbstractC166987dD.A1E();
        P8J p8j = new P8J(this, A07);
        this.A06 = p8j;
        C141796aw A002 = AbstractC141776au.A00(this);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new PZB(this, (InterfaceC23621Ds) null, 19), A002);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(AbstractC111324zv.A00(943), RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        C82013lN A003 = AbstractC82003lM.A00(userSession);
        A003.A02(C3G5.A0I, str, str2, A1G);
        A003.A05(p8j, str, null, true);
    }
}
