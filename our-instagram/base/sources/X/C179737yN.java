package X;

import android.media.CamcorderProfile;
import java.io.FileDescriptor;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.7yN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179737yN extends AbstractC179687yI implements InterfaceC179747yO {
    public InterfaceC179627yC A00;
    public AGu A01;
    public C176117sU A02;
    public Boolean A03;
    public Integer A04;
    public CountDownLatch A05;
    public InterfaceC175797rt A06;
    public final InterfaceC175797rt A07;
    public final InterfaceC175797rt A08;
    public final InterfaceC178407wE A09;
    public final InterfaceC178337w7 A0A;
    public final StringBuffer A0B;
    public final AtomicBoolean A0C;
    public volatile C212409b9 A0D;
    public volatile Integer A0E;
    public volatile boolean A0F;

    public static C177527um A00(InterfaceC178337w7 interfaceC178337w7, AGu aGu, Integer num, Integer num2, boolean z) {
        Integer num3;
        int i = 44100;
        if (interfaceC178337w7.CUa(74)) {
            i = 48000;
        }
        Integer valueOf = Integer.valueOf(i);
        int i2 = 1;
        if (interfaceC178337w7.CUa(77)) {
            i2 = 2;
        }
        Integer valueOf2 = Integer.valueOf(i2);
        if (num2 != null && num != null) {
            num3 = Integer.valueOf(num2.intValue() * i2 * AMJ.A00(num.intValue()));
        } else {
            num3 = null;
        }
        if (z) {
            return new C177527um(interfaceC178337w7, aGu, valueOf, num, valueOf2, null, num3);
        }
        return new C177527um(interfaceC178337w7, aGu, valueOf, num, valueOf2, null, num3);
    }

    @Override // X.AbstractC178227vw
    public final void A09() {
        this.A0B.append("init,");
        InterfaceC175797rt interfaceC175797rt = this.A07;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC179687yI) this).A00;
        interfaceC175797rt.CNj(interfaceC178207vu);
        this.A08.CNj(interfaceC178207vu);
        this.A03 = (Boolean) interfaceC178207vu.AqF(C177267uM.A02);
        this.A00 = (InterfaceC179627yC) interfaceC178207vu.Aq0(InterfaceC179627yC.A00);
        InterfaceC178737wl interfaceC178737wl = (InterfaceC178737wl) interfaceC178207vu.Aq0(InterfaceC178737wl.A00);
        this.A02 = ((C179617yB) this.A00).A01;
        interfaceC178737wl.Egy(new InterfaceC176297sm() { // from class: X.7sl
            @Override // X.InterfaceC176297sm
            public final /* synthetic */ Y1s Eo8(CamcorderProfile camcorderProfile, C176587tG c176587tG, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2, boolean z3) {
                throw new UnsupportedOperationException(AbstractC111324zv.A00(669));
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
            
                if (r14.CUZ(113) != false) goto L11;
             */
            @Override // X.InterfaceC176297sm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final synchronized X.Y1s Eo9(android.media.CamcorderProfile r24, X.C176587tG r25, java.lang.String r26, java.lang.String r27, int r28, int r29, boolean r30, boolean r31, boolean r32) {
                /*
                    Method dump skipped, instructions count: 459
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C176287sl.Eo9(android.media.CamcorderProfile, X.7tG, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean):X.Y1s");
            }

            @Override // X.InterfaceC176297sm
            public final synchronized void Eom() {
                C179737yN c179737yN = C179737yN.this;
                c179737yN.A0B.append("oStop,");
                c179737yN.A04 = C05F.A0u;
                AtomicBoolean atomicBoolean = c179737yN.A0C;
                if (!atomicBoolean.get()) {
                    c179737yN.A09.ClA(new AbstractC223559ty(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Optics calls stop recording without start"), "recording_controller_error", "ArVideoCaptureCoordinator", "", "low", "handleOpticReadyToStopRecording", c179737yN.hashCode());
                } else {
                    InterfaceC178407wE interfaceC178407wE = c179737yN.A09;
                    interfaceC178407wE.DEZ(19, "recording_camera_stop_finished");
                    c179737yN.A05 = new CountDownLatch(1);
                    c179737yN.A02.A01();
                    try {
                        try {
                            c179737yN.A05.await(12L, TimeUnit.SECONDS);
                        } catch (InterruptedException unused) {
                            interfaceC178407wE.ClA(new AbstractC223559ty(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Stop recording timeout"), "recording_controller_error", "ArVideoCaptureCoordinator", "", "low", "handleOpticReadyToStopRecording", c179737yN.hashCode());
                        }
                        c179737yN.A05 = null;
                        c179737yN.A01 = null;
                        atomicBoolean.set(false);
                        C212409b9 c212409b9 = c179737yN.A0D;
                        c179737yN.A0D = null;
                        if (c212409b9 != null) {
                            throw c212409b9;
                        }
                    } catch (Throwable th) {
                        c179737yN.A05 = null;
                        c179737yN.A01 = null;
                        throw th;
                    }
                }
            }
        });
        this.A0F = true;
        this.A04 = C05F.A01;
    }

    @Override // X.InterfaceC179607yA
    public final C175767rq BKU() {
        return InterfaceC179747yO.A00;
    }

    @Override // X.InterfaceC179747yO
    public final String C06() {
        String str;
        StringBuilder sb = new StringBuilder();
        Integer num = this.A04;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "STOPPED";
                    break;
                case 2:
                    str = "STARTING";
                    break;
                case 3:
                    str = "STARTING_OPTIC_STARTED";
                    break;
                case 4:
                    str = "RECORDING";
                    break;
                case 5:
                    str = "STOPPING";
                    break;
                case 6:
                    str = "STOPPING_OPTIC_STOPPED";
                    break;
                case 7:
                    str = "RELEASING";
                    break;
                case 8:
                    str = "RELEASED";
                    break;
                default:
                    str = AbstractC43591JPw.A00(672);
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(" ");
        sb.append((Object) this.A0B);
        return sb.toString();
    }

    @Override // X.InterfaceC179747yO
    public final boolean Cbe() {
        if (!this.A0F) {
            return false;
        }
        return this.A06.Cbe();
    }

    @Override // X.InterfaceC179747yO
    public final void EoA(AGu aGu, C23106AGs c23106AGs, C22912A8i c22912A8i) {
        InterfaceC175797rt interfaceC175797rt;
        this.A0B.append("start,");
        InterfaceC178407wE interfaceC178407wE = this.A09;
        AbstractC225239wm.A00(interfaceC178407wE, "ArVideoCaptureCoordinator", hashCode());
        if (!this.A0F) {
            AbstractC223559ty abstractC223559ty = new AbstractC223559ty(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Video recording not initialized. Cannot start.");
            interfaceC178407wE.ClA(abstractC223559ty, "recording_controller_error", "ArVideoCaptureCoordinator", "", "high", "startVideoRecording", hashCode());
            c22912A8i.A01.A01(abstractC223559ty);
            return;
        }
        C23465Aac c23465Aac = new C23465Aac(this, c22912A8i, new boolean[]{false});
        if (this.A0C.compareAndSet(false, true)) {
            this.A04 = C05F.A0C;
            Boolean bool = aGu.A00;
            if (bool != null) {
                this.A06.ARf(bool.booleanValue());
            }
            this.A0D = null;
            this.A01 = aGu;
            Number number = (Number) c23106AGs.A00(C23106AGs.A0C);
            if (number != null && number.intValue() == 2) {
                interfaceC175797rt = this.A08;
            } else {
                interfaceC175797rt = this.A07;
            }
            this.A06 = interfaceC175797rt;
            interfaceC175797rt.EoB(c23465Aac, c23106AGs);
            return;
        }
        c23465Aac.Dyo(new AbstractC223559ty(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Duplicated request from product"));
    }

    @Override // X.InterfaceC179747yO
    public final void Eoo(Integer num) {
        Integer num2;
        this.A0B.append("stop,");
        if (this.A0F) {
            InterfaceC178407wE interfaceC178407wE = this.A09;
            long hashCode = hashCode();
            C14360o3.A0B(interfaceC178407wE, 0);
            interfaceC178407wE.ClB("recording_stop_requested", "ArVideoCaptureCoordinator", "", null, hashCode);
            interfaceC178407wE.DEZ(19, "recording_stop_requested");
            if (num.intValue() != 0) {
                num2 = C05F.A01;
            } else {
                num2 = C05F.A00;
            }
            this.A0E = num2;
            this.A04 = C05F.A0j;
            this.A06.Eom();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.7rt] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.7rt] */
    public C179737yN(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        StringBuffer stringBuffer = new StringBuffer();
        this.A0B = stringBuffer;
        ?? obj = new Object();
        this.A07 = obj;
        this.A08 = new Object();
        this.A0E = C05F.A0C;
        this.A06 = obj;
        this.A0F = false;
        this.A0C = new AtomicBoolean(false);
        this.A04 = C05F.A00;
        C178307w4 c178307w4 = InterfaceC178337w7.A00;
        InterfaceC178207vu interfaceC178207vu2 = ((AbstractC179687yI) this).A00;
        this.A0A = (InterfaceC178337w7) interfaceC178207vu2.Aq1(c178307w4);
        this.A09 = (InterfaceC178407wE) interfaceC178207vu2.Aq1(InterfaceC178407wE.A00);
        stringBuffer.append("ctor,");
    }
}
