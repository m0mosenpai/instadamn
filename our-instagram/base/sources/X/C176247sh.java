package X;

import android.os.Handler;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176247sh implements InterfaceC176187sb {
    public static final InterfaceC176157sY A0H = new InterfaceC176157sY() { // from class: X.7si
        @Override // X.InterfaceC176157sY
        public final void DE8(AbstractC223559ty abstractC223559ty) {
        }

        @Override // X.InterfaceC176157sY
        public final void onSuccess() {
        }
    };
    public Handler A00;
    public Surface A01;
    public ABV A02;
    public C176137sW A03;
    public AC9 A04;
    public C23417AZq A05;
    public BES A06;
    public Object A07;
    public boolean A08;
    public final Handler A0A;
    public final InterfaceC178337w7 A0B;
    public final C175877s1 A0C;
    public final InterfaceC176037sM A0D;
    public final WeakReference A0F;
    public volatile int A0G;
    public final C176267sj A0E = new C176267sj();
    public boolean A09 = true;

    @Override // X.InterfaceC176187sb
    public final Map Avv() {
        HashMap hashMap = new HashMap(2);
        String str = "True";
        hashMap.put("recording_video_received_data", "True");
        C176507t8 c176507t8 = (C176507t8) this.A07;
        if (c176507t8 == null || !c176507t8.A04()) {
            str = "False";
        }
        hashMap.put("recording_video_encoding_enabled", str);
        hashMap.put("recording_video_stop_progress", String.valueOf(this.A0G));
        return hashMap;
    }

    @Override // X.InterfaceC176187sb
    public final synchronized void Eg6(C176137sW c176137sW) {
        this.A03 = c176137sW;
    }

    @Override // X.InterfaceC176187sb
    public final void EoR(InterfaceC176157sY interfaceC176157sY) {
        Object obj;
        this.A0G = 0;
        if (!this.A09) {
            InterfaceC176037sM interfaceC176037sM = this.A0D;
            interfaceC176037sM.Ckz(19, "recording_stop_video_started");
            interfaceC176037sM.Cl9(null, "stop_recording_video_started", "AbstractVideoRecordingTrack", "", null, null, hashCode());
        }
        C176507t8 c176507t8 = (C176507t8) this.A07;
        if (c176507t8 != null) {
            c176507t8.A0D = false;
        }
        InterfaceC176007sJ interfaceC176007sJ = (InterfaceC176007sJ) this.A0F.get();
        if (interfaceC176007sJ != null && (obj = this.A07) != null) {
            interfaceC176007sJ.EG4(obj);
        }
        this.A01 = null;
        this.A07 = null;
        this.A0G = 1;
        BES bes = this.A06;
        if (bes != null) {
            bes.EoS(new C23392AYr(interfaceC176157sY, this), this.A0A);
            return;
        }
        AbstractC223559ty abstractC223559ty = null;
        if (!this.A09) {
            abstractC223559ty = new AbstractC223559ty(23000, "mVideoEncoder is null while stopping");
            this.A0D.Cl9(abstractC223559ty, "stop_recording_video_failed", "AbstractVideoRecordingTrack", "", "stop", null, hashCode());
        }
        release();
        if (abstractC223559ty != null) {
            interfaceC176157sY.DE8(abstractC223559ty);
        } else {
            interfaceC176157sY.onSuccess();
        }
    }

    @Override // X.InterfaceC176187sb
    public final void release() {
        Object obj;
        this.A0G = 3;
        this.A05 = null;
        this.A08 = false;
        InterfaceC176007sJ interfaceC176007sJ = (InterfaceC176007sJ) this.A0F.get();
        if (interfaceC176007sJ != null && (obj = this.A07) != null) {
            interfaceC176007sJ.EG4(obj);
        }
        this.A01 = null;
        this.A07 = null;
        if (this.A04 != null) {
            this.A04 = null;
        }
        BES bes = this.A06;
        if (bes != null) {
            bes.EoS(A0H, this.A0A);
            this.A06 = null;
        }
        this.A0G = 4;
        C175907s4.A02(this.A00, true, false);
        this.A00 = null;
        this.A09 = true;
        this.A0G = 5;
    }

    @Override // X.InterfaceC176187sb
    public final Map AqD() {
        C23417AZq c23417AZq = this.A05;
        if (c23417AZq != null) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("recording_video_encoder_config_bitrate", String.valueOf(c23417AZq.A01.A00));
            return hashMap;
        }
        return null;
    }

    @Override // X.InterfaceC176187sb
    public final InterfaceC25158BBd BaH() {
        return this.A06;
    }

    @Override // X.InterfaceC176187sb
    public final Map BjN() {
        HashMap hashMap = new HashMap();
        C176267sj c176267sj = this.A0E;
        hashMap.put("recording_video_encoder_mimetype", c176267sj.A08);
        hashMap.put("recording_video_encoder_config_bitrate", String.valueOf(c176267sj.A00));
        hashMap.put("perf_frame_count", String.valueOf(c176267sj.A03));
        hashMap.put("recording_video_avg_fps", String.valueOf((int) ((c176267sj.A03 * 1000) / (System.currentTimeMillis() - c176267sj.A04))));
        hashMap.put("frame_drop_count", String.valueOf(Long.valueOf(c176267sj.A05)));
        hashMap.put("frame_drop_count_per_bucket", c176267sj.A09.toString());
        return hashMap;
    }

    @Override // X.InterfaceC176187sb
    public final EnumC176237sg CBK() {
        return EnumC176237sg.VIDEO;
    }

    @Override // X.InterfaceC176187sb
    public final boolean CRb() {
        return this.A08;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        if (r7.CUZ(124) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        if ((X.C18U.A01(X.C06090Tz.A06, r4, 36593301750547548L) + X.C18U.A01(X.C06090Tz.A05, r4, 36593301750744157L)) > 100) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    @Override // X.InterfaceC176187sb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E5Y(X.InterfaceC176207sd r23, X.InterfaceC177537un r24) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176247sh.E5Y(X.7sd, X.7un):void");
    }

    @Override // X.InterfaceC176187sb
    public final void Emh(InterfaceC176157sY interfaceC176157sY, ABV abv) {
        InterfaceC176037sM interfaceC176037sM = this.A0D;
        interfaceC176037sM.Ckz(19, "recording_start_video_started");
        interfaceC176037sM.Cl9(null, "start_recording_video_started", "AbstractVideoRecordingTrack", "", null, null, hashCode());
        this.A02 = abv;
        BES bes = this.A06;
        if (bes != null) {
            bes.Emg(new C23398AYx(interfaceC176157sY, this), this.A0A);
            return;
        }
        AbstractC223559ty abstractC223559ty = new AbstractC223559ty(23000, "mVideoEncoder is null while starting");
        interfaceC176037sM.Cl9(abstractC223559ty, "start_recording_video_failed", "AbstractVideoRecordingTrack", "", "start", null, hashCode());
        release();
        interfaceC176157sY.DE8(abstractC223559ty);
    }

    @Override // X.InterfaceC176187sb
    public final void EnJ(C22823A4s c22823A4s) {
        AC9 ac9 = this.A04;
        if (ac9 != null) {
            ac9.A00 = c22823A4s;
        }
        C176507t8 c176507t8 = (C176507t8) this.A07;
        if (c176507t8 != null) {
            c176507t8.A0D = true;
        }
    }

    public C176247sh(Handler handler, InterfaceC176007sJ interfaceC176007sJ, InterfaceC178337w7 interfaceC178337w7, C175877s1 c175877s1, InterfaceC176037sM interfaceC176037sM) {
        this.A0A = handler;
        this.A0F = new WeakReference(interfaceC176007sJ);
        this.A0D = interfaceC176037sM;
        this.A0B = interfaceC178337w7;
        this.A0C = c175877s1;
    }
}
