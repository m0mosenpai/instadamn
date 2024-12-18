package X;

import android.media.MediaFormat;
import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.7sW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C176137sW {
    public static final InterfaceC176157sY A0I = new InterfaceC176157sY() { // from class: X.7sX
        @Override // X.InterfaceC176157sY
        public final void DE8(AbstractC223559ty abstractC223559ty) {
        }

        @Override // X.InterfaceC176157sY
        public final void onSuccess() {
        }
    };
    public C22862A6i A00;
    public HashMap A01;
    public MediaFormat A03;
    public InterfaceC176157sY A04;
    public C22938A9i A05;
    public boolean A06;
    public AGI A07;
    public final Handler A08;
    public final InterfaceC178337w7 A09;
    public final InterfaceC176037sM A0A;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public volatile long A0G;
    public volatile boolean A0H;
    public volatile int[] A0F = new int[1];
    public final Runnable A0B = new Runnable() { // from class: X.7sZ
        /* JADX WARN: Type inference failed for: r4v0, types: [X.9ty, X.9b9] */
        @Override // java.lang.Runnable
        public final void run() {
            AbstractC1808580n.A03("checkIfAnySamplesReceived");
            C176137sW c176137sW = C176137sW.this;
            C22862A6i c22862A6i = c176137sW.A00;
            if (c176137sW.A0E && c176137sW.A02.compareAndSet(false, true)) {
                c176137sW.A0E = false;
                if (c22862A6i != null) {
                    ?? abstractC223559ty = new AbstractC223559ty("Timeout while waiting for first samples for muxing", null, 21003);
                    abstractC223559ty.A00("muxer_first_samples_written", AnonymousClass001.A1C("v", "_a", c176137sW.A0D, c176137sW.A0C));
                    abstractC223559ty.A00("muxer_has_started", String.valueOf(true));
                    c176137sW.A08.post(new RunnableC24734AxI(abstractC223559ty, c22862A6i, c176137sW));
                }
            }
        }
    };
    public AtomicBoolean A02 = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r3v0, types: [X.9ty, X.9b9] */
    private void A00(InterfaceC176157sY interfaceC176157sY, Exception exc, String str, int i) {
        ?? abstractC223559ty = new AbstractC223559ty(str, exc, i);
        abstractC223559ty.A00("muxer_first_samples_written", AnonymousClass001.A1C("v", "_a", this.A0D, this.A0C));
        abstractC223559ty.A00("muxer_has_started", String.valueOf(this.A0E));
        if (interfaceC176157sY != null) {
            this.A08.post(new RunnableC24735AxJ(interfaceC176157sY, abstractC223559ty, this));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.9ty, X.9b9] */
    private void A01(InterfaceC176157sY interfaceC176157sY, Exception exc, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        ?? abstractC223559ty = new AbstractC223559ty(str, exc, i);
        abstractC223559ty.A00 = str2;
        abstractC223559ty.A00("muxer_first_samples_written", AnonymousClass001.A1C("v", "_a", z2, z3));
        abstractC223559ty.A00("muxer_has_started", String.valueOf(z));
        abstractC223559ty.A00("muxer_detailed_error_code", String.valueOf(i2));
        AD8.A00(this.A08, abstractC223559ty, interfaceC176157sY);
    }

    public final void A02() {
        C22938A9i c22938A9i;
        if (!this.A06 && (c22938A9i = this.A05) != null) {
            AGR agr = c22938A9i.A05;
            if (!agr.A01) {
                agr.A03.ASg();
                agr.A01 = true;
            }
            this.A06 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A03(android.media.MediaCodec.BufferInfo r22, X.EnumC176237sg r23, java.nio.ByteBuffer r24) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176137sW.A03(android.media.MediaCodec$BufferInfo, X.7sg, java.nio.ByteBuffer):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A04(InterfaceC176157sY interfaceC176157sY) {
        int i;
        this.A0F[0] = 0;
        HashMap hashMap = new HashMap();
        MediaFormat mediaFormat = this.A03;
        if (mediaFormat != null) {
            hashMap.put(AbstractC111324zv.A00(1211), mediaFormat.toString());
        }
        InterfaceC176037sM interfaceC176037sM = this.A0A;
        interfaceC176037sM.Cl9(null, "stop_recording_muxer_started", "AvRecordingTrackMuxer", "", null, hashMap, hashCode());
        Handler handler = this.A08;
        handler.removeCallbacks(this.A0B);
        boolean z = this.A0E;
        boolean z2 = this.A0D;
        boolean z3 = this.A0C;
        this.A0E = false;
        try {
            C22938A9i c22938A9i = this.A05;
            if (c22938A9i != null) {
                int[] iArr = this.A0F;
                AGR agr = c22938A9i.A05;
                synchronized (agr) {
                    try {
                        if (agr.A09) {
                            i = agr.A03.EoQ(iArr);
                        } else {
                            i = 90;
                            if (agr.A08) {
                                i = 190;
                            }
                            if (agr.A0B) {
                                i += 200;
                            }
                            if (agr.A0C) {
                                i += ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                            }
                        }
                    } finally {
                        agr.A09 = false;
                        agr.A0A = true;
                        agr.A08 = false;
                        agr.A0B = false;
                        agr.A0C = false;
                    }
                }
                this.A0F[0] = 4;
            } else {
                i = 1000;
            }
            if (i != 0 && z) {
                A01(interfaceC176157sY, null, "Muxer output is empty", "low", 21001, i, z, z2, z3);
                return;
            }
            interfaceC176037sM.Cl9(null, "stop_recording_muxer_finished", "AvRecordingTrackMuxer", "", null, null, hashCode());
            this.A0F[0] = 5;
            AD8.A01(interfaceC176157sY, handler);
        } catch (Exception e) {
            C22938A9i c22938A9i2 = this.A05;
            long j = -1;
            if (c22938A9i2.A02 != -1) {
                if (c22938A9i2.A00 != -1) {
                    j = (long) ((r4 - r1) * 1.0d);
                }
            }
            long j2 = -1;
            if (c22938A9i2.A03 != -1) {
                if (c22938A9i2.A01 != -1) {
                    j2 = (long) ((r4 - r8) * 1.0d);
                }
            }
            if ((j <= -1 || j >= 10000) && (j2 <= -1 || j2 >= 10000)) {
                A01("stop_recording_muxer_started", e, "Error while stopping", "medium", 21000, 0, z, z2, z3);
            }
            A01("stop_recording_muxer_started", e, "Muxer output is empty - not enough data written", "low", 21001, 0, z, z2, z3);
        } finally {
            this.A05 = null;
            this.A04 = null;
            this.A00 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.BDt] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public void A05(InterfaceC176157sY interfaceC176157sY, AGI agi, C22862A6i c22862A6i) {
        ?? r8;
        this.A04 = interfaceC176157sY;
        this.A00 = c22862A6i;
        this.A07 = agi;
        HashMap hashMap = this.A01;
        EnumC176237sg enumC176237sg = EnumC176237sg.AUDIO;
        if (hashMap.get(enumC176237sg) != null) {
            r8 = new Object();
        } else {
            r8 = new Object();
        }
        if (!this.A09.B5M(3).isEmpty()) {
            File parentFile = agi.A02.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            } else {
                A00(interfaceC176157sY, null, "Muxer has video output file directory null", 21004);
            }
        }
        String absolutePath = agi.A02.getAbsolutePath();
        InterfaceC25158BBd interfaceC25158BBd = (InterfaceC25158BBd) this.A01.get(enumC176237sg);
        InterfaceC25158BBd interfaceC25158BBd2 = (InterfaceC25158BBd) this.A01.get(EnumC176237sg.VIDEO);
        InterfaceC176037sM interfaceC176037sM = this.A0A;
        this.A05 = new C22938A9i(agi, new AGR(interfaceC25158BBd, interfaceC25158BBd2, interfaceC176037sM, r8, agi.A04, absolutePath));
        this.A0C = false;
        this.A0D = false;
        this.A0H = false;
        this.A0G = 0L;
        this.A02.set(false);
        interfaceC176037sM.Cl9(null, "start_recording_muxer_prepared", "AvRecordingTrackMuxer", "", null, null, hashCode());
        this.A04.onSuccess();
    }

    public C176137sW(Handler handler, InterfaceC178337w7 interfaceC178337w7, InterfaceC176037sM interfaceC176037sM) {
        this.A08 = handler;
        this.A0A = interfaceC176037sM;
        this.A09 = interfaceC178337w7;
    }
}
