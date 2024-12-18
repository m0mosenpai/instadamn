package X;

import com.instagram.zero.zbd.ZeroBalanceDetectionIg4aHttpRequest;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class TFG implements InterfaceC26491Qe {
    public Object A00;
    public final int A01 = 1;
    public final Object A02;

    public TFG(ZeroBalanceDetectionIg4aHttpRequest zeroBalanceDetectionIg4aHttpRequest, InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = interfaceC24901Jp;
        this.A02 = zeroBalanceDetectionIg4aHttpRequest;
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        if (this.A01 != 0) {
            AbstractC58323PtF.A1K(new RcJ(this, (SJW) this.A02));
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        InterfaceC23621Ds interfaceC23621Ds;
        Object c09540e5;
        if (this.A01 != 0) {
            AbstractC58323PtF.A1K(new RcK((SJW) this.A02, iOException));
            return;
        }
        boolean z = iOException instanceof SocketTimeoutException;
        String A00 = MSV.A00(887);
        if (z) {
            C0K8.A0F(A00, "call to AsyncHttpService failed with SocketTimeoutException", iOException);
        } else if (iOException != null) {
            C0K8.A0F(A00, "call to AsyncHttpService failed with exception", iOException);
            interfaceC23621Ds = (InterfaceC23621Ds) this.A00;
            c09540e5 = new C09540e5(iOException);
            interfaceC23621Ds.resumeWith(c09540e5);
        }
        interfaceC23621Ds = (InterfaceC23621Ds) this.A00;
        c09540e5 = new OLQ(-1);
        interfaceC23621Ds.resumeWith(c09540e5);
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        int i;
        if (this.A01 != 0) {
            this.A00 = c3jq;
            return;
        }
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A00;
        if (c3jq == null) {
            i = -1;
        } else {
            i = c3jq.A01;
        }
        interfaceC23621Ds.resumeWith(new OLQ(i));
    }

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
    }

    public TFG(SJW sjw) {
        this.A02 = sjw;
    }
}
