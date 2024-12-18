package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.7s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175937s8 {
    public volatile C176087sR A00;
    public volatile InterfaceC178407wE A01;

    public final void A00(C73493YFw c73493YFw, int i, int i2, int i3, long j, long j2) {
        C176087sR c176087sR = this.A00;
        if (c176087sR != null) {
            int i4 = (int) j;
            C176047sN c176047sN = c176087sR.A00;
            c176047sN.A01 = j2;
            C176047sN.A00(c176047sN);
            Handler handler = c176047sN.A0D;
            if (handler != null) {
                RunnableC24878Azd runnableC24878Azd = new RunnableC24878Azd(c73493YFw, c176087sR, i, i2, i3, i4);
                if (Looper.myLooper() == handler.getLooper()) {
                    runnableC24878Azd.run();
                } else {
                    handler.post(runnableC24878Azd);
                }
            }
        }
    }

    public final void A01(byte[] bArr, int i, int i2, int i3, long j, long j2) {
        C176087sR c176087sR = this.A00;
        if (c176087sR != null) {
            int i4 = (int) j;
            C176047sN c176047sN = c176087sR.A00;
            c176047sN.A01 = j2;
            C176047sN.A00(c176047sN);
            Handler handler = c176047sN.A0D;
            if (handler != null) {
                RunnableC24879Aze runnableC24879Aze = new RunnableC24879Aze(c176087sR, bArr, i, i2, i3, i4);
                if (Looper.myLooper() == handler.getLooper()) {
                    runnableC24879Aze.run();
                } else {
                    handler.post(runnableC24879Aze);
                }
            }
        }
    }
}
