package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.1gZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32491gZ implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1ga
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1992486683);
            int A032 = C0f9.A03(1136946638);
            C32491gZ c32491gZ = new C32491gZ(userSession);
            C0f9.A0A(1572209091, A032);
            C0f9.A0A(-1354147251, A03);
            return c32491gZ;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C32471gX c32471gX = (C32471gX) c1ow;
        UserSession userSession = this.A00;
        DirectThreadKey directThreadKey = c32471gX.A00;
        boolean z = c32471gX.A01;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(directThreadKey, 1);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        String str2 = directThreadKey.A00;
        if (z) {
            str = "label";
        } else {
            str = "unlabel";
        }
        c25621Ms.A0L("direct_v2/threads/%s/%s/", str2, str);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        if (z) {
            c25621Ms.A9s("thread_label", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C32491gZ(UserSession userSession) {
        this.A00 = userSession;
    }
}
