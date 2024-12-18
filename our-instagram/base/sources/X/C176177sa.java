package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.7sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176177sa implements InterfaceC176187sb {
    public static final InterfaceC176207sd A0K = new InterfaceC176207sd() { // from class: X.7sc
        @Override // X.InterfaceC176207sd
        public final void onError(Throwable th) {
        }

        @Override // X.InterfaceC176207sd
        public final void onSuccess() {
        }
    };
    public Handler A00;
    public AH7 A01;
    public A9H A02;
    public BET A03;
    public AC8 A04;
    public C177527um A05;
    public ABV A06;
    public C176137sW A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A;
    public final InterfaceC176057sO A0B;
    public final C175927s7 A0C;
    public final InterfaceC178337w7 A0D;
    public final C176217se A0E;
    public final InterfaceC176037sM A0F;
    public final C175877s1 A0G;
    public final Runnable A0H;
    public volatile int A0I;
    public volatile boolean A0J;

    @Override // X.InterfaceC176187sb
    public final Map AqD() {
        return null;
    }

    @Override // X.InterfaceC176187sb
    public final Map BjN() {
        HashMap hashMap = new HashMap(5);
        AH7 ah7 = this.A01;
        if (ah7 != null) {
            if (ah7.A06 > 10) {
                hashMap.put("recording_audio_avg_processing_time_ms", String.valueOf(ah7.A01()));
                hashMap.put("recording_audio_num_deadline_missed", String.valueOf(this.A01.A01));
            }
            hashMap.put("recording_audio_was_effect_on", String.valueOf(this.A01.A09));
            hashMap.put("recording_audio_frame_size_ms", String.valueOf(Math.round(((float) this.A01.A0C) / 1000000.0f)));
            hashMap.put("recording_audio_num_frames", String.valueOf(this.A01.A06));
            hashMap.put("recording_audio_samples_per_frame", String.valueOf(this.A01.A0B));
            hashMap.put("recording_audio_num_empty_reads", String.valueOf(this.A01.A02));
            hashMap.put("recording_audio_num_nonempty_reads", String.valueOf(this.A01.A03));
            hashMap.put("recording_audio_num_read_errors", String.valueOf(this.A01.A04));
            hashMap.put("recording_audio_total_bytes_read", String.valueOf(this.A01.A05));
            hashMap.put("recording_audio_bitrate", String.valueOf(this.A01.A00));
        }
        A9H a9h = this.A02;
        if (a9h != null) {
            hashMap.put("recording_audio_zero_frames", String.valueOf(a9h.A04));
            hashMap.put("recording_audio_quiet_frames", String.valueOf(this.A02.A02));
            hashMap.put("recording_audio_saturated_samples", String.valueOf(this.A02.A03));
            hashMap.put("recording_audio_num_clicks", String.valueOf(this.A02.A00));
        }
        this.A01 = null;
        this.A02 = null;
        return hashMap;
    }

    @Override // X.InterfaceC176187sb
    public final synchronized void Eg6(C176137sW c176137sW) {
        this.A07 = c176137sW;
    }

    @Override // X.InterfaceC176187sb
    public final void EoR(InterfaceC176157sY interfaceC176157sY) {
        this.A0I = 0;
        if (!this.A09) {
            InterfaceC176037sM interfaceC176037sM = this.A0F;
            interfaceC176037sM.Ckz(19, "recording_stop_audio_started");
            interfaceC176037sM.Cl9(null, "stop_recording_audio_started", "AudioRecordingTrack", "", null, null, hashCode());
        }
        this.A0J = false;
        C175927s7 c175927s7 = this.A0C;
        c175927s7.A01("sAT");
        C73396YBi c73396YBi = new C73396YBi(this.A0A, new AbstractC223559ty(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Timeout while removeOutput from AudioPipelineRecorder"), new C23390AYo(interfaceC176157sY, this), this.A0D.ArS(1008));
        c175927s7.A01("roAP");
        this.A0B.EG5(c73396YBi.A00(), c73396YBi, this.A0E);
    }

    @Override // X.InterfaceC176187sb
    public final Map Avv() {
        Map Avx = this.A0B.Avx();
        if (Avx == null) {
            Avx = new HashMap(4);
        }
        String str = "True";
        Object obj = "False";
        if (this.A06 == null) {
            obj = "True";
        }
        Avx.put("recording_audio_received_data", obj);
        if (!this.A0J) {
            str = "False";
        }
        Avx.put("recording_audio_encoding_enabled", str);
        String A00 = this.A0C.A00();
        if (A00 != null) {
            Avx.put("recording_audio_encoding_calls", A00);
        }
        Avx.put("recording_audio_stop_progress", String.valueOf(this.A0I));
        BET bet = this.A03;
        if (bet != null) {
            bet.Avw(Avx);
        }
        return Avx;
    }

    @Override // X.InterfaceC176187sb
    public final InterfaceC25158BBd BaH() {
        return this.A03;
    }

    @Override // X.InterfaceC176187sb
    public final EnumC176237sg CBK() {
        return EnumC176237sg.AUDIO;
    }

    @Override // X.InterfaceC176187sb
    public final boolean CRb() {
        return this.A08;
    }

    @Override // X.InterfaceC176187sb
    public final void E5Y(InterfaceC176207sd interfaceC176207sd, InterfaceC177537un interfaceC177537un) {
        String str;
        BET y9t;
        HashMap hashMap = new HashMap();
        if (interfaceC177537un.equals(this.A05)) {
            str = "true";
        } else {
            str = "false";
        }
        hashMap.put("recording_prepare_with_same_config", str);
        InterfaceC176037sM interfaceC176037sM = this.A0F;
        interfaceC176037sM.Cl9(null, "prepare_recording_audio_started", "AudioRecordingTrack", "", null, hashMap, hashCode());
        if (interfaceC177537un.equals(this.A05)) {
            AbstractC72880XqE.A00(this.A0A, interfaceC176207sd);
            return;
        }
        interfaceC176037sM.Ckz(19, "recording_prepare_audio_started");
        release();
        this.A09 = false;
        C177527um c177527um = (C177527um) interfaceC177537un;
        this.A05 = c177527um;
        C177547uo c177547uo = c177527um.A00;
        int i = c177547uo.A03;
        int i2 = c177547uo.A02;
        C177567uq c177567uq = c177527um.A01;
        AH7 ah7 = new AH7(AMJ.A01(i2, c177567uq.A03, i, c177567uq.A08) * 1000, (i / AMJ.A00(i2)) / Integer.bitCount(c177547uo.A01));
        this.A01 = ah7;
        ah7.A00 = c177567uq.A01;
        ah7.A0A = true;
        this.A02 = new A9H();
        this.A00 = C175907s4.A01("AudioRecordingThread");
        C175927s7 c175927s7 = this.A0C;
        c175927s7.A01("pAT");
        AVR avr = new AVR(interfaceC176207sd, this, hashMap);
        Handler handler = this.A0A;
        ACL acl = new ACL(handler, avr);
        C177527um c177527um2 = this.A05;
        Runnable runnable = this.A0H;
        AVS A00 = acl.A00(runnable);
        if (c177527um2 != null) {
            c175927s7.A01("pAP");
            this.A0B.E5W(this.A00, handler, c177527um2.A00, new C23389AYn(A00, this));
        }
        C177527um c177527um3 = this.A05;
        AVS A002 = acl.A00(runnable);
        if (c177527um3 != null) {
            AC8 ac8 = new AC8(this);
            this.A04 = ac8;
            C177567uq c177567uq2 = c177527um3.A01;
            Handler handler2 = this.A00;
            InterfaceC178337w7 interfaceC178337w7 = this.A0D;
            boolean CUZ = interfaceC178337w7.CUZ(68);
            boolean CUZ2 = interfaceC178337w7.CUZ(70);
            C72680Xl1 c72680Xl1 = new C72680Xl1(this.A0E);
            boolean CUZ3 = interfaceC178337w7.CUZ(138);
            if (CUZ) {
                if (CUZ2) {
                    y9t = new Y9S(handler2, c177567uq2, interfaceC178337w7, c72680Xl1, ac8);
                } else {
                    y9t = new C72169XRd(handler2, c177567uq2, interfaceC178337w7, c72680Xl1, ac8);
                }
            } else {
                y9t = new Y9T(handler2, c177567uq2, interfaceC178337w7, c72680Xl1, ac8, CUZ3);
            }
            this.A03 = y9t;
            c175927s7.A01("pAE");
            this.A03.E5X(handler, new AVN(A002, this));
        }
        acl.A01();
        this.A0J = false;
    }

    @Override // X.InterfaceC176187sb
    public final void Emh(InterfaceC176157sY interfaceC176157sY, ABV abv) {
        C175927s7 c175927s7 = this.A0C;
        c175927s7.A01("stAT");
        InterfaceC176037sM interfaceC176037sM = this.A0F;
        interfaceC176037sM.Ckz(19, "recording_start_audio_started");
        interfaceC176037sM.Cl9(null, "start_recording_audio_started", "AudioRecordingTrack", "", null, null, hashCode());
        this.A06 = abv;
        this.A0J = false;
        if (this.A03 != null) {
            c175927s7.A01("stAE");
            this.A03.Emt(this.A0A, new AVO(interfaceC176157sY, this));
            return;
        }
        c175927s7.A01("stAEn");
        release();
        AbstractC223559ty abstractC223559ty = new AbstractC223559ty(22000, "mAudioEncoder is null while starting");
        interfaceC176037sM.Cl9(abstractC223559ty, "start_recording_audio_failed", "AudioRecordingTrack", "", "start", null, hashCode());
        interfaceC176157sY.DE8(abstractC223559ty);
    }

    @Override // X.InterfaceC176187sb
    public final void EnJ(C22823A4s c22823A4s) {
        AC8 ac8 = this.A04;
        if (ac8 != null) {
            ac8.A00 = c22823A4s;
        }
        this.A0J = true;
    }

    @Override // X.InterfaceC176187sb
    public final void release() {
        C175927s7 c175927s7 = this.A0C;
        c175927s7.A01("rAT");
        this.A05 = null;
        this.A08 = false;
        c175927s7.A01("rAP");
        this.A0B.release();
        this.A0I = 3;
        if (this.A04 != null) {
            this.A04 = null;
        }
        if (this.A03 != null) {
            c175927s7.A01("rAE");
            this.A03.EoU(this.A0A, A0K);
            this.A03 = null;
        }
        this.A0I = 4;
        C175907s4.A02(this.A00, true, false);
        this.A00 = null;
        this.A09 = true;
        this.A0I = 5;
    }

    public C176177sa(Handler handler, InterfaceC176057sO interfaceC176057sO, InterfaceC178337w7 interfaceC178337w7, C175877s1 c175877s1, InterfaceC176037sM interfaceC176037sM) {
        C175927s7 c175927s7 = new C175927s7();
        this.A0C = c175927s7;
        this.A0E = new C176217se(this);
        this.A0H = new Runnable() { // from class: X.7sf
            @Override // java.lang.Runnable
            public final void run() {
                C176177sa.this.release();
            }
        };
        this.A0A = handler;
        this.A0B = interfaceC176057sO;
        this.A0F = interfaceC176037sM;
        this.A0D = interfaceC178337w7;
        this.A0G = c175877s1;
        this.A09 = true;
        c175927s7.A01("c");
    }
}
