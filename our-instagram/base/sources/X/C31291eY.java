package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;
import kotlin.enums.EnumEntries;

/* renamed from: X.1eY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31291eY implements InterfaceC29301b7, InterfaceC31091eE {
    public static final C0KV A04 = C31301eZ.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    public C31291eY(UserSession userSession, C2DS c2ds, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2) {
        C14360o3.A0B(c2ds, 2);
        this.A00 = userSession;
        this.A01 = c2ds;
        this.A02 = interfaceC09390do;
        this.A03 = interfaceC09390do2;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C14360o3.A0B(c1ow, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        C19K A02 = AnonymousClass194.A02(C12L.A00.CPG(319, 3));
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZ3(c1ow, this, interfaceC37261GbE, c19260xA, (InterfaceC23621Ds) null, 23), A02);
    }

    @Override // X.InterfaceC31091eE
    public final /* bridge */ /* synthetic */ void AJE(InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C47Z c47z) {
        Long l;
        C31271eW c31271eW = (C31271eW) c1ow;
        C14360o3.A0B(c31271eW, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        N9X n9x = new N9X(this, c31271eW);
        JTa jTa = ((C1OW) c31271eW).A02;
        C47Z A03 = ((PendingMediaStore) this.A02.getValue()).A03(c31271eW.A02);
        UserSession userSession = this.A00;
        DirectThreadKey A07 = c31271eW.A07();
        if (A03 != null) {
            l = A03.A2I;
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        String str = jTa.A03;
        String str2 = jTa.A04;
        boolean z = jTa.A07;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        EnumEntries enumEntries = C2EY.A0D;
        c25621Ms.A0B("direct_v2/threads/broadcast/file_attachment/");
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        String str3 = C1QM.A00.A02.A02;
        c25621Ms.A9s("attachment_fbid", valueOf);
        c25621Ms.A9s("mutation_token", str);
        c25621Ms.A9s("nav_chain", str3);
        c25621Ms.A0I("is_shh_mode", z);
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A07.A00);
        c25621Ms.A9s("send_attribution", str2);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C32226EDz(n9x, userSession, interfaceC37261GbE);
        C1GJ.A06(A0N, 319, 3, true, true);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }
}
