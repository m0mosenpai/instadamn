package X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.AZm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23413AZm implements InterfaceC25203BDb {
    public final /* synthetic */ C179737yN A00;
    public final /* synthetic */ C23417AZq A01;
    public final /* synthetic */ Y1s A02;

    public C23413AZm(C179737yN c179737yN, C23417AZq c23417AZq, Y1s y1s) {
        this.A00 = c179737yN;
        this.A02 = y1s;
        this.A01 = c23417AZq;
    }

    @Override // X.InterfaceC25203BDb
    public final void D2K(C212409b9 c212409b9) {
        C179737yN c179737yN = this.A00;
        c179737yN.A0B.append("rcCF,");
        if (c179737yN.A0D != null) {
            c179737yN.A09.ClA(c212409b9, "recording_controller_error", "ArVideoCaptureCoordinator", "", "low", "duplicated onCaptureFailed", AbstractC166987dD.A0M(c179737yN));
        }
        c179737yN.A0D = c212409b9;
        CountDownLatch countDownLatch = c179737yN.A05;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // X.InterfaceC25203BDb
    public final void D2M() {
        C179737yN c179737yN = this.A00;
        c179737yN.A0B.append("rcCE,");
        CountDownLatch countDownLatch = c179737yN.A05;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // X.InterfaceC25203BDb
    public final void D2S(long j) {
        String str;
        C179737yN c179737yN = this.A00;
        c179737yN.A0B.append("rcCS,");
        try {
            Y1s y1s = this.A02;
            y1s.A02(Y1s.A0W, Long.valueOf(j));
            C23417AZq c23417AZq = this.A01;
            InterfaceC178407wE interfaceC178407wE = c179737yN.A09;
            interfaceC178407wE.Cwo(19, TraceFieldType.Bitrate, Float.toString(c23417AZq.A01.A00));
            interfaceC178407wE.Cwo(19, "encoder_profile", c23417AZq.A01.A06);
            interfaceC178407wE.Cwo(19, "encoder_width", Integer.toString(c23417AZq.A01.A05));
            interfaceC178407wE.Cwo(19, "encoder_height", Integer.toString(c23417AZq.A01.A04));
            Integer num = (Integer) y1s.A01(Y1s.A0Z);
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue != 4) {
                                    if (intValue == 5) {
                                        str = "VP8";
                                    } else {
                                        return;
                                    }
                                } else {
                                    str = "MPEG_4_SP";
                                }
                            } else {
                                str = "HEVC";
                            }
                        } else {
                            str = "H264";
                        }
                    } else {
                        str = "H263";
                    }
                } else {
                    str = "DEFAULT";
                }
                interfaceC178407wE.Cwo(19, "encoder", str);
            }
        } catch (RuntimeException e) {
            c179737yN.A09.ClA(new C212409b9(e), "recording_controller_error", "ArVideoCaptureCoordinator", "", "high", "onCaptureStarted", AbstractC166987dD.A0M(c179737yN));
        }
    }

    @Override // X.InterfaceC25203BDb
    public final long now() {
        return SystemClock.elapsedRealtime();
    }
}
