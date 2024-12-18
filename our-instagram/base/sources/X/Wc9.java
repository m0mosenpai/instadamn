package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public final class Wc9 implements C4YW {
    public final /* synthetic */ C4XU A00;

    @Override // X.C4YW
    public final /* synthetic */ void DPv(InterfaceC98244b3 interfaceC98244b3, int i, long j, long j2) {
    }

    public Wc9(C4XU c4xu) {
        this.A00 = c4xu;
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPZ(InterfaceC98244b3 interfaceC98244b3, long j, long j2, boolean z) {
        this.A00.A0D((WcC) interfaceC98244b3);
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPd(InterfaceC98244b3 interfaceC98244b3, long j, long j2) {
        WcC wcC = (WcC) interfaceC98244b3;
        C4XU c4xu = this.A00;
        C4C7 c4c7 = wcC.A02;
        C98254b4 c98254b4 = wcC.A03;
        C98264b5 c98264b5 = new C98264b5(c98254b4.A01, c4c7, c98254b4.A02);
        c4xu.A0P.A05(null, c98264b5, null, wcC.A05, null, wcC.A00, -1, 0, -9223372036854775807L, -9223372036854775807L);
        C4XU.A01(c4xu, ((Number) wcC.A05).longValue() - j);
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ C98014ag DPf(InterfaceC98244b3 interfaceC98244b3, IOException iOException, int i, long j, long j2) {
        WcC wcC = (WcC) interfaceC98244b3;
        C4XU c4xu = this.A00;
        C4XX c4xx = c4xu.A0P;
        C4C7 c4c7 = wcC.A02;
        C98254b4 c98254b4 = wcC.A03;
        c4xx.A01(null, new C98264b5(c98254b4.A01, c4c7, c98254b4.A02), iOException, null, wcC.A00, -1, 0, -9223372036854775807L, -9223372036854775807L, true);
        C4XU.A03(c4xu, iOException);
        return C98004af.A04;
    }
}
