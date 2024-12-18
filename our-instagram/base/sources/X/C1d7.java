package X;

import com.facebook.location.platform.api.Location;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import kotlin.enums.EnumEntries;

/* renamed from: X.1d7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1d7 implements InterfaceC29301b7 {
    public static final C0KV A02 = C30481d8.A00;
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C30461d4 c30461d4 = (C30461d4) c1ow;
        C14360o3.A0B(c30461d4, 0);
        UserSession userSession = this.A00;
        DirectThreadKey directThreadKey = c30461d4.A02;
        if (directThreadKey != null) {
            Float valueOf = Float.valueOf((float) c30461d4.A00);
            Float valueOf2 = Float.valueOf((float) c30461d4.A01);
            String A06 = c30461d4.A06();
            String str = c30461d4.A05;
            JTa jTa = ((C1OW) c30461d4).A02;
            boolean z = jTa.A09;
            L1W l1w = jTa.A00;
            boolean z2 = jTa.A07;
            boolean z3 = jTa.A0A;
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A05();
            EnumEntries enumEntries = C2EY.A0D;
            c25621Ms.A0B("direct_v2/threads/broadcast/pinned_location/");
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
            AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, null, z, z2, z3);
            c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
            c25621Ms.A0C(Location.LATITUDE, valueOf.floatValue());
            c25621Ms.A0C("longitude", valueOf2.floatValue());
            C1GJ.A03(c25621Ms.A0N());
            return;
        }
        C14360o3.A0F("threadKey");
        throw C00O.createAndThrow();
    }

    public C1d7(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
