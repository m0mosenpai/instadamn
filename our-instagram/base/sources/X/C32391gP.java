package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1gP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32391gP implements InterfaceC29301b7 {
    public static final C0KV A01 = C32401gQ.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C32371gN c32371gN = (C32371gN) c1ow;
        C14360o3.A0B(c32371gN, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        DirectThreadKey C7Q = c32371gN.C7Q();
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/end_group_chat/");
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C7Q.A00);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C32391gP(UserSession userSession) {
        this.A00 = userSession;
    }
}