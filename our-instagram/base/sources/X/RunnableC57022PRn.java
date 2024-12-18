package X;

import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.PRn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57022PRn implements Runnable {
    public final /* synthetic */ EnumC53145Nez A00;
    public final /* synthetic */ C53021Nct A01;

    public RunnableC57022PRn(EnumC53145Nez enumC53145Nez, C53021Nct c53021Nct) {
        this.A01 = c53021Nct;
        this.A00 = enumC53145Nez;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PJC pjc = this.A01.A0E;
        if (pjc != null) {
            EnumC53145Nez enumC53145Nez = this.A00;
            C14360o3.A0B(enumC53145Nez, 0);
            if (enumC53145Nez != EnumC53145Nez.A03 && pjc.A00 > StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS && pjc.A05 != EnumC53324Ni1.A09) {
                pjc.A0S.A01();
            }
            pjc.A0W.A02().A0T.Egh(enumC53145Nez);
        }
    }
}
