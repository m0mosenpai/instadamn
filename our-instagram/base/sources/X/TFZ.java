package X;

import com.facebook.proxygen.HTTPRequestError;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.proxygen.utils.Preconditions;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TFZ implements InterfaceC65592TnX, InterfaceC65528Tlx {
    public C1QW A01;
    public InterfaceC65528Tlx A02;
    public final C1QY A07;
    public final InterfaceC65453TkP A08;
    public final InterfaceC65592TnX A09;
    public final SQ7 A0A;
    public final C18240vB A0B;
    public int A00 = 0;
    public boolean A06 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A03 = false;

    @Override // X.InterfaceC65592TnX
    public final void E22() {
        Preconditions.checkState(false, "onWillRetry should never happen on a LigeRetryResponseCallbacks");
        throw C00O.createAndThrow();
    }

    private void A00(String str) {
        C1QY c1qy = this.A07;
        if (c1qy.A09 == EnumC23341Bw.API) {
            C1QW c1qw = this.A01;
            c1qw.A00("X-Tigon-Is-Retry");
            c1qw.A01("X-Tigon-Is-Retry", "True");
        }
        if (str != null) {
            this.A0A.A04(this.A01, "retry_reason", str);
        }
        this.A09.E22();
        SQ7 sq7 = this.A0A;
        C1QW c1qw2 = this.A01;
        sq7.A00(c1qw2, AnonymousClass001.A0O("http_client_send_request_", this.A00));
        this.A02 = this.A08.Enq(c1qw2, c1qy, this, this.A0B);
        this.A03 = true;
    }

    @Override // X.InterfaceC65528Tlx
    public final void AGv(int i, boolean z) {
        InterfaceC65528Tlx interfaceC65528Tlx = this.A02;
        if (interfaceC65528Tlx != null) {
            interfaceC65528Tlx.AGv(i, z);
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void DED(C61030Rdy c61030Rdy) {
        HTTPRequestError.ProxygenError proxygenError;
        HTTPRequestError.HTTPRequestStage hTTPRequestStage;
        int i;
        if (!this.A06 && this.A01.A0C) {
            if (C63188Sen.A0m) {
                String message = c61030Rdy.getMessage();
                if (message != null) {
                    Iterator it = C63188Sen.A0h.iterator();
                    while (it.hasNext()) {
                        if (message.contains(AbstractC166987dD.A1B(it))) {
                        }
                    }
                }
            }
            HTTPRequestError hTTPRequestError = c61030Rdy.A00;
            if (hTTPRequestError == null || (proxygenError = hTTPRequestError.mErrCode) == null) {
                proxygenError = null;
            }
            if (proxygenError != HTTPRequestError.ProxygenError.Canceled && (((hTTPRequestStage = hTTPRequestError.mErrStage) == HTTPRequestError.HTTPRequestStage.ProcessRequest || hTTPRequestStage == HTTPRequestError.HTTPRequestStage.DNSResolution || hTTPRequestStage == HTTPRequestError.HTTPRequestStage.TCPConnection || hTTPRequestStage == HTTPRequestError.HTTPRequestStage.TLSSetup || hTTPRequestStage == HTTPRequestError.HTTPRequestStage.ZeroRttSent || hTTPRequestStage == HTTPRequestError.HTTPRequestStage.SendRequest) && (i = this.A00 + 1) < C63188Sen.A0X)) {
                this.A00 = i;
                String str = hTTPRequestError.mErrMsg;
                if (str == null) {
                    str = null;
                }
                A00(str);
                return;
            }
        }
        if (this.A04) {
            return;
        }
        this.A0A.A01(this.A01, TraceFieldType.RetryCount, this.A00);
        this.A09.DED(c61030Rdy);
        this.A04 = true;
    }

    @Override // X.InterfaceC65592TnX
    public final void DgD() {
        if (!this.A05) {
            this.A09.DgD();
            this.A05 = true;
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void Dgg(C3JQ c3jq) {
        int i;
        if (this.A01.A0C && C63188Sen.A0l && c3jq.A01 == 408 && (i = this.A00 + 1) < C63188Sen.A0X) {
            this.A00 = i;
            A00("Request failed with status code 408");
        } else {
            this.A03 = false;
            this.A06 = true;
            this.A09.Dgg(c3jq);
        }
    }

    @Override // X.InterfaceC65528Tlx
    public final void cancel() {
        InterfaceC65528Tlx interfaceC65528Tlx = this.A02;
        if (interfaceC65528Tlx != null) {
            interfaceC65528Tlx.cancel();
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void onBody(ByteBuffer byteBuffer) {
        if (!this.A03) {
            this.A06 = true;
            this.A09.onBody(byteBuffer);
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void onEOM() {
        if (!this.A03) {
            this.A06 = true;
            this.A0A.A01(this.A01, TraceFieldType.RetryCount, this.A00);
            this.A09.onEOM();
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void onFirstByteFlushed(long j) {
        this.A09.onFirstByteFlushed(j);
    }

    @Override // X.InterfaceC65592TnX
    public final void onHeaderBytesReceived(long j, long j2) {
        this.A09.onHeaderBytesReceived(j, j2);
    }

    @Override // X.InterfaceC65592TnX
    public final void onLastByteAcked(long j, long j2) {
        this.A09.onLastByteAcked(j, j2);
    }

    public TFZ(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, C1QW c1qw, C1QY c1qy, InterfaceC65453TkP interfaceC65453TkP, InterfaceC65592TnX interfaceC65592TnX, C18240vB c18240vB) {
        this.A08 = interfaceC65453TkP;
        this.A01 = c1qw;
        this.A07 = c1qy;
        this.A09 = interfaceC65592TnX;
        this.A0B = c18240vB;
        this.A0A = new SQ7(lightweightQuickPerformanceLogger);
    }
}
