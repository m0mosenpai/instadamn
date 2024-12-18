package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.1kG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34751kG implements InterfaceC29301b7 {
    public static final C0KV A01 = C34761kH.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C34731kE c34731kE = (C34731kE) c1ow;
        C14360o3.A0B(c34731kE, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        String str = c34731kE.C7Q().A00;
        if (str != null) {
            boolean z = c34731kE.A01;
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A0R = true;
            c25621Ms.A05();
            c25621Ms.A0L("direct_v2/hide_in_messages_primary_tab/", str);
            c25621Ms.A0R(C40781ul.class, C55702hA.class);
            c25621Ms.A0I("is_hiding", z);
            c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A03(A0N);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C34751kG(UserSession userSession) {
        this.A00 = userSession;
    }
}
