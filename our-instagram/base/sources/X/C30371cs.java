package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30371cs implements InterfaceC29301b7 {
    public static final C0KV A02 = C30391cu.A00;
    public final UserSession A00;
    public final C2DS A01;

    public C30371cs(UserSession userSession, C2DS c2ds) {
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
        String str;
        C30351cq c30351cq = (C30351cq) c1ow;
        C14360o3.A0B(c30351cq, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c30351cq.C7R();
        C14360o3.A07(C7R);
        if (C7R.size() == 1) {
            DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
            String A06 = c30351cq.A06();
            String str2 = c30351cq.A05;
            C1575375n c1575375n = c30351cq.A00;
            if (c1575375n != null) {
                JTa jTa = ((C1OW) c30351cq).A02;
                boolean z = jTa.A09;
                C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
                String str3 = jTa.A04;
                boolean z2 = jTa.A07;
                String str4 = c30351cq.A01;
                if (str4 != null) {
                    String str5 = c30351cq.A02;
                    L1W l1w = jTa.A00;
                    UserSession userSession = this.A00;
                    String str6 = jTa.A02;
                    C38321qM c38321qM = c1575375n.A01;
                    C14360o3.A07(c38321qM);
                    C25621Ms A01 = AbstractC47995LLh.A01(userSession, l1w, c1575375n.A01, directThreadKey, A06, null, str5, str2, str3, str6, null, LCX.A00(c38321qM, str5), z, z2, false, false, false);
                    A01.A9s("emoji_reaction", str4);
                    C1ON A0N = A01.A0N();
                    A0N.A00 = new EE4(userSession, c31281Dp3);
                    C1GJ.A03(A0N);
                    return;
                }
                str = "emojiReaction";
            } else {
                str = "clipsShare";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
