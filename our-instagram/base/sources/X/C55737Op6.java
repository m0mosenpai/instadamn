package X;

import android.os.Handler;
import org.webrtc.EglBase;

/* renamed from: X.Op6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55737Op6 implements InterfaceC57907PmC {
    public final /* synthetic */ C54996OUf A00;

    public C55737Op6(C54996OUf c54996OUf) {
        this.A00 = c54996OUf;
    }

    @Override // X.InterfaceC57907PmC
    public final void Cy5() {
        C54996OUf c54996OUf = this.A00;
        EglBase.Context context = C54996OUf.A0m;
        C52708NTt c52708NTt = c54996OUf.A0W.A00.A0b;
        if (C18U.A06(C06090Tz.A05, c52708NTt.A04, 36311277018087910L)) {
            if (c52708NTt.A02 && c52708NTt.A00 > 1) {
                EnumC53121NeY enumC53121NeY = EnumC53121NeY.A03;
                Handler A09 = MSW.A09(c52708NTt.A06);
                A09.sendMessage(A09.obtainMessage(0, 6, -1, enumC53121NeY));
            } else {
                ((HandlerC50757MbN) c52708NTt.A06.getValue()).A00(8);
            }
            c52708NTt.A00 = 0;
            c52708NTt.A01 = false;
        }
    }
}
