package X;

import com.facebook.rti.push.service.FbnsServiceDelegate;
import com.instagram.rtc.rsys.proxies.SignalingHttpSenderCallback;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class T1Q implements InterfaceC65545TmK {
    public final int A00;
    public final Object A01;

    public T1Q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65545TmK
    public final void DFv(int i, String str) {
        switch (this.A00) {
            case 0:
                C63367SiS.A02((C63367SiS) this.A01);
                return;
            case 1:
                SignalingHttpSenderCallback.CProxy.gotHttpResponseJson((SignalingHttpSenderCallback) this.A01, AnonymousClass001.A0g("{\"result\": \"", str, "\"}"), 500);
                return;
            case 2:
                AbstractC58323PtF.A1K(new RcG((SJW) this.A01, false));
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC65545TmK
    public final void DcP(int i) {
        switch (this.A00) {
            case 0:
                C63367SiS.A02((C63367SiS) this.A01);
                return;
            case 1:
                SignalingHttpSenderCallback.CProxy.gotHttpResponseJson((SignalingHttpSenderCallback) this.A01, "{\"result\": \"timeout\"}", 408);
                return;
            case 2:
                AbstractC58323PtF.A1K(new RcG((SJW) this.A01, false));
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC65545TmK
    public final void onSuccess(int i) {
        boolean z;
        switch (this.A00) {
            case 0:
                SVU svu = ((C63367SiS) this.A01).A0W;
                if (svu == null) {
                    return;
                }
                FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0E;
                C62912SWt c62912SWt = svu.A00.A0C;
                c62912SWt.A00 = 0;
                int i2 = c62912SWt.A01 + 1;
                c62912SWt.A01 = i2;
                if (i2 % 4 != 0) {
                    return;
                }
                AtomicInteger atomicInteger = c62912SWt.A03;
                int i3 = atomicInteger.get() + 1;
                synchronized (c62912SWt) {
                    if (i3 >= 0) {
                        if (i3 < C62912SWt.A05.size()) {
                            atomicInteger.set(i3);
                            z = true;
                        }
                    }
                    z = false;
                }
                if (!z) {
                    return;
                }
                SVU.A00(svu);
                return;
            case 1:
                SignalingHttpSenderCallback.CProxy.gotHttpResponseJson((SignalingHttpSenderCallback) this.A01, "{\"result\": \"success\"}", 200);
                return;
            case 2:
                AbstractC58323PtF.A1K(new RcG((SJW) this.A01, true));
                return;
            default:
                return;
        }
    }
}
