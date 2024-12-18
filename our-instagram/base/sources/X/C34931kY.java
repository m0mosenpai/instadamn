package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.1kY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34931kY implements InterfaceC29301b7 {
    public static final C0KV A01 = C34941kZ.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C34911kW c34911kW = (C34911kW) c1ow;
        C14360o3.A0B(c34911kW, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        String str = c34911kW.C7Q().A00;
        if (str != null) {
            UserSession userSession = this.A00;
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A05();
            c25621Ms.A0B("direct_v2/dismiss_thread_in_preview/");
            c25621Ms.A0R(C40781ul.class, C55702hA.class);
            c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            c25621Ms.A9s("is_dismissed", "true");
            c25621Ms.A0R = true;
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C32225EDy(userSession, interfaceC37261GbE, str);
            C1GJ.A03(A0N);
        }
    }

    public C34931kY(UserSession userSession) {
        this.A00 = userSession;
    }
}
