package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.util.List;

@Deprecated
/* renamed from: X.1e9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31051e9 implements InterfaceC29301b7 {
    public static final C0KV A02 = C31061eA.A00;
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
        C1e7 c1e7 = (C1e7) c1ow;
        C14360o3.A0B(c1e7, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c1e7.C7R();
        C14360o3.A07(C7R);
        if (C7R.size() == 1) {
            JTa jTa = ((C1OW) c1e7).A02;
            UserSession userSession = this.A00;
            DirectThreadKey directThreadKey = (DirectThreadKey) c1e7.C7R().get(0);
            DirectAnimatedMedia directAnimatedMedia = c1e7.A02;
            String A06 = c1e7.A06();
            String str = c1e7.A05;
            boolean z = jTa.A09;
            String str2 = jTa.A04;
            C1ON A07 = AbstractC47995LLh.A07(userSession, jTa.A00, c1e7.A01, directThreadKey, directAnimatedMedia, A06, str, str2, z, jTa.A07, jTa.A0A);
            A07.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A03(A07);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public C31051e9(UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
    }
}
