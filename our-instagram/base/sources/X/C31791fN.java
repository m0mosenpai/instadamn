package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.1fN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31791fN implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1fO
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1943220337);
            int A032 = C0f9.A03(-1409834129);
            C31791fN c31791fN = new C31791fN(userSession);
            C0f9.A0A(1016029901, A032);
            C0f9.A0A(-1130737120, A03);
            return c31791fN;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C31771fL c31771fL = (C31771fL) c1ow;
        KVY kvy = c31771fL.A00;
        UserSession userSession = this.A00;
        String str = kvy.A04;
        String str2 = kvy.A02;
        String str3 = kvy.A03;
        String str4 = c31771fL.A05;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A0R = true;
        c25621Ms.A05();
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A0L("direct_v2/visual_threads/%s/visual_items/%s/seen/", str, str2);
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        c25621Ms.A9s("item_id", str2);
        c25621Ms.A9s("mutation_token", str4);
        c25621Ms.A0H("client_context", str3);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
        C162337Ov.A0Y(c19260xA, C05F.A00);
    }

    public C31791fN(UserSession userSession) {
        this.A00 = userSession;
    }
}
