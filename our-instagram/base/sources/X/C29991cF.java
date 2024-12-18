package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender;

/* renamed from: X.1cF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29991cF implements InterfaceC29301b7 {
    public static final C0KV A03 = new C0KV() { // from class: X.1cG
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(-1448606089);
            int A033 = C0f9.A03(661375500);
            C29991cF c29991cF = new C29991cF(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(194713106, A033);
            C0f9.A0A(322189399, A032);
            return c29991cF;
        }
    };
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        if (abstractC29011ae.C7R().size() > 1) {
            C0w9.A04("DirectSendStoryShareMessageMutation_withMultipleDirectThreadKeys", "Found DirectForwardVisualMessageMutation with multiple DirectThreadKeys", 1);
            return false;
        }
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x015f  */
    @Override // X.InterfaceC29301b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ENr(X.C19260xA r26, X.InterfaceC37261GbE r27, X.C1OW r28) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29991cF.ENr(X.0xA, X.GbE, X.1OW):void");
    }

    public C29991cF(final UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M90
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 1);
                return new ArmadilloExpressStorySender(userSession2);
            }
        });
    }
}
