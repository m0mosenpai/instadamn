package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1cW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30161cW implements InterfaceC29301b7 {
    public static final C0KV A04 = new C0KV() { // from class: X.1cY
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-118953278);
            int A032 = C0f9.A03(542109352);
            C30161cW c30161cW = new C30161cW(userSession);
            C0f9.A0A(-1110279176, A032);
            C0f9.A0A(-175358746, A03);
            return c30161cW;
        }
    };
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C30141cU c30141cU = (C30141cU) c1ow;
        List C7R = c30141cU.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c30141cU.A06();
        String str = ((C1OW) c30141cU).A05;
        C1575375n c1575375n = c30141cU.A00;
        JTa jTa = ((C1OW) c30141cU).A02;
        boolean z2 = jTa.A09;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        String str2 = jTa.A04;
        boolean z3 = jTa.A07;
        boolean z4 = jTa.A0A;
        String str3 = jTa.A02;
        String str4 = c30141cU.A01;
        if (str4 == null) {
            str4 = null;
        }
        String str5 = c30141cU.A03;
        String str6 = c30141cU.A02;
        boolean z5 = c30141cU.A05;
        if (!c30141cU.A04 && AbstractC159387Cy.A07(this.A00, c30141cU, directThreadKey)) {
            if (str5 != null && str5.equals("LIKED_BY")) {
                C72688XlF c72688XlF = (C72688XlF) this.A03.getValue();
                C14360o3.A0B(interfaceC37261GbE, 1);
                EnumC46252KdU enumC46252KdU = EnumC46252KdU.SOCIAL_CONTEXT;
                C38321qM c38321qM = c30141cU.A00.A01;
                C14360o3.A07(c38321qM);
                C25983BeX c25983BeX = new C25983BeX(c38321qM, null);
                AbstractC46926Kp7.A00(c72688XlF.A00).A02(enumC46252KdU, EnumC46251KdT.REPLY, interfaceC37261GbE, c30141cU, c25983BeX, null);
            } else {
                C47410Kwz c47410Kwz = (C47410Kwz) this.A02.getValue();
                C14360o3.A0B(interfaceC37261GbE, 1);
                EnumC46252KdU enumC46252KdU2 = EnumC46252KdU.CLIP;
                C38321qM c38321qM2 = c30141cU.A00.A01;
                C14360o3.A07(c38321qM2);
                AbstractC46926Kp7.A00(c47410Kwz.A00).A02(enumC46252KdU2, EnumC46251KdT.SHARE, interfaceC37261GbE, c30141cU, c38321qM2, null);
            }
            C162337Ov.A0U(c19260xA);
            return;
        }
        UserSession userSession = this.A00;
        L1W l1w = ((C1OW) c30141cU).A02.A00;
        boolean z6 = c30141cU.A04;
        C1ON A0N = AbstractC47995LLh.A01(userSession, l1w, c1575375n.A01, directThreadKey, A06, str4, str5, str, str2, str3, str6, LCX.A00(c1575375n.A01, str5), z2, z3, z4, z6, z5).A0N();
        A0N.A00 = new EE4(userSession, c31281Dp3);
        C1GJ.A03(A0N);
    }

    public C30161cW(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8m
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C47410Kwz(UserSession.this);
            }
        });
        this.A03 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.YJK
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C72688XlF(UserSession.this);
            }
        });
    }
}
