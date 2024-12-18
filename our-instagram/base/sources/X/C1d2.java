package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import kotlin.enums.EnumEntries;

/* renamed from: X.1d2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1d2 implements InterfaceC29301b7 {
    public static final C0KV A03 = C30451d3.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new MHR(this, 35));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C30441cz c30441cz = (C30441cz) c1ow;
        C14360o3.A0B(c30441cz, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        Object obj = c30441cz.C7R().get(0);
        C14360o3.A07(obj);
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A07(userSession, c30441cz, (DirectThreadKey) obj)) {
            AbstractC46926Kp7.A00(((C47414Kx3) this.A02.getValue()).A00).A04(interfaceC37261GbE, c30441cz);
            C162337Ov.A0U(c19260xA);
            return;
        }
        DirectThreadKey directThreadKey = c30441cz.A00;
        if (directThreadKey != null) {
            String A07 = c30441cz.A07();
            String A06 = c30441cz.A06();
            String str = c30441cz.A05;
            JTa jTa = ((C1OW) c30441cz).A02;
            boolean z = jTa.A09;
            L1W l1w = jTa.A00;
            boolean z2 = jTa.A07;
            boolean z3 = jTa.A0A;
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A05();
            EnumEntries enumEntries = C2EY.A0D;
            c25621Ms.A0B("direct_v2/threads/broadcast/location_share_xma/");
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
            AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, null, z, z2, z3);
            c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
            c25621Ms.A9s("location_id", A07);
            C1GJ.A03(c25621Ms.A0N());
            return;
        }
        C14360o3.A0F("threadKey");
        throw C00O.createAndThrow();
    }

    public C1d2(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
