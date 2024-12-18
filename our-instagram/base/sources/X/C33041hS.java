package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1hS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33041hS implements InterfaceC29301b7 {
    public static final C0KV A02 = C33051hT.A00;
    public final UserSession A00;
    public final C2DS A01;

    public C33041hS(UserSession userSession, C2DS c2ds) {
        C14360o3.A0B(c2ds, 2);
        this.A00 = userSession;
        this.A01 = c2ds;
    }

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
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = abstractC29011ae.C7R();
        C14360o3.A07(C7R);
        if (C7R.size() == 1) {
            DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
            String A06 = abstractC29011ae.A06();
            JTa jTa = ((C1OW) abstractC29011ae).A02;
            UserSession userSession = this.A00;
            String str = abstractC29011ae.A05;
            boolean z = jTa.A09;
            C1ON A05 = AbstractC47995LLh.A05(userSession, jTa.A00, null, directThreadKey, A06, str, jTa.A04, z, jTa.A07, jTa.A0A);
            A05.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A03(A05);
            C162337Ov.A0Y(c19260xA, C05F.A00);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
