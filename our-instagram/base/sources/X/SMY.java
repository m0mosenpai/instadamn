package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes10.dex */
public final class SMY {
    public ServiceConnection A00;
    public IBinder A01;
    public final C2GS A02;
    public final String A03;
    public final Context A04;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2GT, X.2GS] */
    public SMY(Context context, String str) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A04 = context;
        this.A02 = new C2GT(EnumC61134Rfo.A05);
        A00();
    }

    public final void A00() {
        EnumC61134Rfo enumC61134Rfo;
        C2GS c2gs = this.A02;
        EnumC61134Rfo enumC61134Rfo2 = (EnumC61134Rfo) c2gs.A02();
        this.A00 = new WIJ(this, 6);
        Intent A04 = AbstractC31171DnF.A04();
        AbstractC58319PtB.A19(A04, this.A03, "com.meta.trusteddevice.service.TrustedDeviceFoundationServiceImpl");
        ServiceConnection serviceConnection = this.A00;
        if (!C0b3.A00().A06().A04(this.A04, A04, serviceConnection, 1)) {
            this.A01 = null;
            this.A00 = null;
            if (enumC61134Rfo2 == null) {
                enumC61134Rfo2 = EnumC61134Rfo.A05;
            }
            int ordinal = enumC61134Rfo2.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                        if (ordinal == 1) {
                            enumC61134Rfo = EnumC61134Rfo.A02;
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        enumC61134Rfo = EnumC61134Rfo.A06;
                    }
                } else {
                    enumC61134Rfo = EnumC61134Rfo.A04;
                }
            } else {
                enumC61134Rfo = EnumC61134Rfo.A03;
            }
            c2gs.A0B(enumC61134Rfo);
        }
    }
}
