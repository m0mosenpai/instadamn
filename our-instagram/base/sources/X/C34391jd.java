package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.json.JSONObject;

/* renamed from: X.1jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34391jd implements InterfaceC29301b7 {
    public static final C0KV A02 = C34401je.A00;
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
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        JTa jTa = ((C1OW) abstractC29011ae).A02;
        List C7R = abstractC29011ae.C7R();
        C14360o3.A07(C7R);
        if (C7R.size() == 1) {
            UserSession userSession = this.A00;
            DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
            C25621Ms A00 = LLX.A00(userSession, AbstractC47211Ktk.A0G, AbstractC46912Kot.A00(jTa), directThreadKey, new JSONObject());
            A00.A05();
            EnumEntries enumEntries = C2EY.A0D;
            A00.A0B("direct_v2/threads/broadcast/generic_share/");
            A00.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
            A00.A0S(C40781ul.class, C55702hA.class);
            C1ON A0N = A00.A0N();
            A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A06(A0N, -5, 3, false, false);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public C34391jd(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
