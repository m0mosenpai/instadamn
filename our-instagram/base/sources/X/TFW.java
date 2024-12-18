package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class TFW implements InterfaceC65592TnX {
    public int A00;
    public C61030Rdy A01;
    public boolean A02;
    public boolean A03;
    public final C26511Qg A04;
    public final C1QW A05;
    public final SQ7 A06;

    @Override // X.InterfaceC65592TnX
    public final void DED(C61030Rdy c61030Rdy) {
        short s;
        C14360o3.A0B(c61030Rdy, 0);
        if (this.A01 == null) {
            C26511Qg c26511Qg = this.A04;
            C1QW c1qw = this.A05;
            c26511Qg.A04(c1qw, c61030Rdy);
            this.A01 = c61030Rdy;
            SQ7 sq7 = this.A06;
            sq7.A01(c1qw, "dispatch_new_data_count", this.A00);
            String message = c61030Rdy.getMessage();
            if (message != null) {
                if (message.equals("Request was canceled.")) {
                    s = 4;
                    sq7.A06(c1qw, s);
                    return;
                }
            } else {
                message = "Null";
            }
            sq7.A04(c1qw, TraceFieldType.FailureReason, message);
            s = 3;
            sq7.A06(c1qw, s);
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.InterfaceC65592TnX
    public final void E22() {
    }

    @Override // X.InterfaceC65592TnX
    public final void DgD() {
        if (!this.A02) {
            this.A04.A02(this.A05);
            this.A02 = true;
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.InterfaceC65592TnX
    public final void Dgg(C3JQ c3jq) {
        if (this.A02) {
            if (!this.A03) {
                C26511Qg c26511Qg = this.A04;
                C1QW c1qw = this.A05;
                c26511Qg.A00(c3jq, c1qw);
                this.A03 = true;
                this.A06.A01(c1qw, TraceFieldType.StatusCode, c3jq.A01);
                return;
            }
            throw AbstractC166987dD.A14("Check failed.");
        }
        throw AbstractC166987dD.A14("Check failed.");
    }

    @Override // X.InterfaceC65592TnX
    public final void onBody(ByteBuffer byteBuffer) {
        if (this.A03) {
            this.A04.A05(this.A05, byteBuffer);
            this.A00++;
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.InterfaceC65592TnX
    public final void onEOM() {
        if (this.A03) {
            C26511Qg c26511Qg = this.A04;
            C1QW c1qw = this.A05;
            c26511Qg.A03(c1qw);
            SQ7 sq7 = this.A06;
            sq7.A01(c1qw, "dispatch_new_data_count", this.A00);
            sq7.A06(c1qw, (short) 2);
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.InterfaceC65592TnX
    public final void onFirstByteFlushed(long j) {
        SQ7 sq7 = this.A06;
        C1QW c1qw = this.A05;
        sq7.A00(c1qw, "request_body_first_byte_flushed");
        ArrayList arrayList = this.A04.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C19O) arrayList.get(size)).onFirstByteFlushed(c1qw, j);
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void onHeaderBytesReceived(long j, long j2) {
        SQ7 sq7 = this.A06;
        C1QW c1qw = this.A05;
        sq7.A00(c1qw, "response_headers_end");
        ArrayList arrayList = this.A04.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C19O) arrayList.get(size)).onHeaderBytesReceived(c1qw, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void onLastByteAcked(long j, long j2) {
        SQ7 sq7 = this.A06;
        C1QW c1qw = this.A05;
        sq7.A00(c1qw, "request_body_last_byte_acked");
        ArrayList arrayList = this.A04.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C19O) arrayList.get(size)).onLastByteAcked(c1qw, j, j2);
            } else {
                return;
            }
        }
    }

    public TFW(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, C26511Qg c26511Qg, C1QW c1qw) {
        AbstractC167017dG.A1R(c26511Qg, lightweightQuickPerformanceLogger);
        this.A05 = c1qw;
        this.A04 = c26511Qg;
        this.A06 = new SQ7(lightweightQuickPerformanceLogger);
    }
}
