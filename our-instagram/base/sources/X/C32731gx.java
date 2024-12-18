package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.1gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32731gx implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1gy
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1110452780);
            int A032 = C0f9.A03(-1757686688);
            C32731gx c32731gx = new C32731gx(userSession);
            C0f9.A0A(740500399, A032);
            C0f9.A0A(588413077, A03);
            return c32731gx;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C32711gv c32711gv = (C32711gv) c1ow;
        UserSession userSession = this.A00;
        String str = c32711gv.A01.A00;
        String str2 = c32711gv.A03;
        int i = c32711gv.A00;
        String str3 = c32711gv.A02;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/threads/broadcast/poll_vote/");
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        c25621Ms.A9s("item_id", str2);
        c25621Ms.A9s("option_id", Integer.toString(i));
        c25621Ms.A9s("client_context", str3);
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A0R = true;
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new K8V(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C32731gx(UserSession userSession) {
        this.A00 = userSession;
    }
}
