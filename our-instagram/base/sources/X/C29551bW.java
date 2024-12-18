package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;

/* renamed from: X.1bW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29551bW implements InterfaceC29301b7 {
    public static final C0KV A03 = new C0KV() { // from class: X.1bX
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(850085447);
            int A033 = C0f9.A03(1545739190);
            C29551bW c29551bW = new C29551bW(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(1709873164, A033);
            C0f9.A0A(-271325448, A032);
            return c29551bW;
        }
    };
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x007c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011d  */
    @Override // X.InterfaceC29301b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ENr(X.C19260xA r30, X.InterfaceC37261GbE r31, X.C1OW r32) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29551bW.ENr(X.0xA, X.GbE, X.1OW):void");
    }

    public C29551bW(final UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8r
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new ArmadilloExpressLinkMessageSender(UserSession.this);
            }
        });
    }
}
