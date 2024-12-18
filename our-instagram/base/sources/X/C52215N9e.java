package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.N9e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52215N9e extends C1P1 {
    public final /* synthetic */ InterfaceC1116050z A00;
    public final /* synthetic */ C111364zz A01;
    public final /* synthetic */ boolean A02;

    public C52215N9e(InterfaceC1116050z interfaceC1116050z, C111364zz c111364zz, boolean z) {
        this.A01 = c111364zz;
        this.A00 = interfaceC1116050z;
        this.A02 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1053307294);
        C14360o3.A0B(abstractC115105If, 0);
        C111364zz c111364zz = this.A01;
        c111364zz.A05.remove(EnumC2045493n.A0A);
        boolean z = this.A02;
        InterfaceC1116050z interfaceC1116050z = this.A00;
        if (z) {
            C55684Oo9 A00 = AbstractC54111Nw9.A00();
            UserSession userSession = c111364zz.A03;
            A00.A00(userSession.userId);
            C1Dk A002 = A00.A00();
            A002.setFreshCacheAgeMs(1036800000L);
            A002.setNetworkTimeoutSeconds(0);
            C111364zz.A01(interfaceC1116050z, AnonymousClass963.A00(AbstractC40691uc.A01(userSession).A03(A002)), c111364zz, false);
        } else {
            C111364zz.A02(interfaceC1116050z, c111364zz);
        }
        C111364zz.A04(c111364zz, "GraphQL", abstractC115105If.A01());
        C0f9.A0A(-1028492478, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-826062102);
        int A032 = C0f9.A03(-1911221561);
        C111364zz c111364zz = this.A01;
        AbstractC50522MSa.A0p(c111364zz).remove(EnumC2045493n.A0A);
        C111364zz.A02(this.A00, c111364zz);
        C0f9.A0A(1036897659, A032);
        C0f9.A0A(-1878687144, A03);
    }
}
