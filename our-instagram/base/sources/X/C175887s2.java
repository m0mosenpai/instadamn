package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.audiograph.AudioPipelineImpl;
import com.facebook.cameracore.audiograph.CameraAudioManager;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.7s2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175887s2 {
    public AH6 A00;
    public C9PP A01;
    public C9PO A02;
    public InterfaceC25222BDw A03;
    public C210059Qt A04;
    public AudioServiceConfigurationAnnouncer A05;
    public Object A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final AudioManager A0A;
    public final Handler A0B;
    public final Handler A0C;
    public final AudioAttributesCompat A0D;
    public final InterfaceC175967sB A0E;
    public final C175897s3 A0F;
    public final C175937s8 A0G;
    public final C175947s9 A0H;
    public final C175917s6 A0I;
    public final C4RG A0J;
    public final C175867s0 A0K;
    public final InterfaceC178407wE A0L;
    public final InterfaceC178337w7 A0M;
    public final C175877s1 A0N;
    public final boolean A0O;
    public volatile AudioGraphClientProvider A0P;

    public static void A01(Handler handler, AbstractC223559ty abstractC223559ty, InterfaceC176157sY interfaceC176157sY, String str) {
        handler.post(new RunnableC24723Ax4(abstractC223559ty, interfaceC176157sY, String.format(null, "%s error: %s", str, abstractC223559ty.getMessage())));
    }

    public final synchronized HashMap A03() {
        return C175917s6.A00(this.A0A, this.A0I, this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.7s9] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.media.AudioAttributesImpl, java.lang.Object, androidx.media.AudioAttributesImplApi21] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.7s8] */
    public C175887s2(Context context, C175867s0 c175867s0, InterfaceC178407wE interfaceC178407wE, InterfaceC178337w7 interfaceC178337w7, C175877s1 c175877s1, boolean z) {
        C175897s3 c175897s3 = new C175897s3(c175877s1);
        Handler A01 = C175907s4.A01("audiopipeline_thread");
        C175917s6 c175917s6 = new C175917s6();
        ?? obj = new Object();
        this.A0G = obj;
        this.A0H = new Object();
        this.A08 = false;
        this.A0E = new InterfaceC175967sB() { // from class: X.7sA
            @Override // X.InterfaceC175967sB
            public final int DMG(C73493YFw c73493YFw) {
                C175887s2 c175887s2 = C175887s2.this;
                InterfaceC25222BDw interfaceC25222BDw = c175887s2.A03;
                if (interfaceC25222BDw != null) {
                    return interfaceC25222BDw.fillAudioBuffer(c73493YFw);
                }
                c175887s2.A0L.ClA(new C212399b8("Attempted to fill audio buffer with no audio pipeline present"), "inprogress_recording_audio_failure", "AudioPipelineController", "", "high", "onInputBufferReady", c175887s2.hashCode());
                return 1;
            }
        };
        Context applicationContext = context.getApplicationContext();
        this.A09 = applicationContext;
        this.A0M = interfaceC178337w7;
        this.A0L = interfaceC178407wE;
        this.A0N = c175877s1;
        this.A0I = c175917s6;
        this.A0F = c175897s3;
        this.A08 = interfaceC178337w7.CUZ(69);
        this.A0C = new Handler(Looper.getMainLooper());
        this.A0K = c175867s0;
        this.A06 = new AudioDeviceCallback() { // from class: X.7sC
            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    audioDeviceInfo.getType();
                    C175917s6 c175917s62 = C175887s2.this.A0I;
                    c175917s62.A02 = Integer.valueOf(audioDeviceInfo.getType());
                    c175917s62.A04 = true;
                    c175917s62.A00 = SystemClock.elapsedRealtime();
                }
            }

            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    audioDeviceInfo.getType();
                    C175917s6 c175917s62 = C175887s2.this.A0I;
                    c175917s62.A02 = Integer.valueOf(audioDeviceInfo.getType());
                    c175917s62.A04 = false;
                    c175917s62.A00 = SystemClock.elapsedRealtime();
                }
            }
        };
        this.A0B = A01;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager != null) {
            this.A0A = audioManager;
            this.A0J = new C4RG(audioManager);
            SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(3);
            builder.setUsage(1);
            builder.setContentType(2);
            AudioAttributes build = builder.build();
            ?? obj2 = new Object();
            obj2.A01 = build;
            obj2.A00 = -1;
            ?? obj3 = new Object();
            obj3.A00 = obj2;
            this.A0D = obj3;
            obj.A01 = interfaceC178407wE;
            this.A0O = z;
            c175917s6.A05.A01("c");
            return;
        }
        throw new RuntimeException("Cannot obtain AUDIO_SERVICE");
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [X.AVG, java.lang.Object] */
    public static synchronized int A00(C175887s2 c175887s2) {
        String str;
        int i;
        AudioPipelineImpl audioPipelineImpl;
        synchronized (c175887s2) {
            if (c175887s2.A03 == null) {
                InterfaceC178407wE interfaceC178407wE = c175887s2.A0L;
                interfaceC178407wE.DEb(20);
                if (AudioPipelineImpl.sIsNativeLibLoaded) {
                    str = "True";
                } else {
                    str = "False";
                }
                interfaceC178407wE.Cwo(20, "isNativeLibAlreadyLoaded", str);
                c175887s2.A01 = new C9PP(c175887s2);
                c175887s2.A02 = new C9PO(c175887s2);
                C9PN c9pn = new C9PN(c175887s2);
                interfaceC178407wE.DEZ(20, "audiopipeline_init_native_lib_start");
                synchronized (AudioPipelineImpl.class) {
                    if (!AudioPipelineImpl.sIsNativeLibLoaded) {
                        C09170dP.A0C("audiograph-native");
                        AudioPipelineImpl.sIsNativeLibLoaded = true;
                    }
                }
                interfaceC178407wE.DEZ(20, "audiopipeline_init_native_lib_end");
                try {
                    C175897s3 c175897s3 = c175887s2.A0F;
                    InterfaceC178337w7 interfaceC178337w7 = c175887s2.A0M;
                    int B5H = (int) interfaceC178337w7.B5H(22);
                    if (B5H <= 0) {
                        B5H = C3OO.FLAG_MOVED;
                    }
                    int i2 = 44100;
                    if (interfaceC178337w7.CUa(74)) {
                        i2 = 48000;
                    }
                    C9PP c9pp = c175887s2.A01;
                    C9PO c9po = c175887s2.A02;
                    Handler handler = c175887s2.A0B;
                    C175877s1 c175877s1 = c175897s3.A00;
                    if (interfaceC178337w7.CUZ(69)) {
                        ?? obj = new Object();
                        CameraAudioManager cameraAudioManager = new CameraAudioManager(i2);
                        obj.A00 = cameraAudioManager;
                        cameraAudioManager.getSampleRate();
                        audioPipelineImpl = obj;
                    } else {
                        audioPipelineImpl = new AudioPipelineImpl(B5H, i2, interfaceC178337w7, 1000, c9pp, c9po, c9pn, null, handler, c175877s1);
                    }
                    c175887s2.A03 = audioPipelineImpl;
                    C175947s9 c175947s9 = c175887s2.A0H;
                    C175917s6 c175917s6 = c175887s2.A0I;
                    c175947s9.A00 = handler;
                    c175947s9.A02 = audioPipelineImpl;
                    c175947s9.A01 = c175917s6;
                    interfaceC178407wE.DEZ(20, "audiopipeline_init_ctor_end");
                    if (!c175887s2.A08 && !c175887s2.A0O) {
                        InterfaceC25222BDw interfaceC25222BDw = c175887s2.A03;
                        int i3 = 2;
                        if (interfaceC178337w7.CUa(76)) {
                            i3 = 4;
                        }
                        int i4 = 1;
                        if (interfaceC178337w7.CUa(77)) {
                            i4 = 2;
                        }
                        i = interfaceC25222BDw.createManualProcessingGraph(i3, i4, c175887s2.A0G);
                    } else {
                        InterfaceC25222BDw interfaceC25222BDw2 = c175887s2.A03;
                        int i5 = 2;
                        if (interfaceC178337w7.CUa(76)) {
                            i5 = 4;
                        }
                        int i6 = 1;
                        if (interfaceC178337w7.CUa(77)) {
                            i6 = 2;
                        }
                        i = interfaceC25222BDw2.createFbaProcessingGraph(i5, i6, c175887s2.A0G);
                    }
                    interfaceC178407wE.DEZ(20, "audiopipeline_init_create_graph_end");
                    Context context = c175887s2.A09;
                    AudioManager audioManager = c175887s2.A0A;
                    c175887s2.A04 = new C210059Qt(context, audioManager, handler, new C9RA(c175887s2));
                    Object obj2 = c175887s2.A06;
                    if (obj2 != null) {
                        audioManager.registerAudioDeviceCallback((AudioDeviceCallback) obj2, handler);
                    }
                    interfaceC178407wE.DEW(20);
                } catch (Exception e) {
                    C0K8.A0F("AudioPipelineController", "Error creating AudioPipeline", e);
                    long hashCode = c175887s2.hashCode();
                    AbstractC223559ty abstractC223559ty = new AbstractC223559ty(40000, e);
                    i = 34;
                    interfaceC178407wE.CiQ(abstractC223559ty, "audio_pipeline_error", "AudioPipelineController", "high", "init", "fba_error", hashCode);
                }
            } else {
                i = 0;
            }
        }
        return i;
    }

    public final AudioGraphClientProvider A02() {
        InterfaceC25222BDw interfaceC25222BDw;
        this.A0I.A05.A01("getAGCP");
        int A00 = A00(this);
        if (A00 != 0 && A00 != 4) {
            this.A0L.CiQ(new C212399b8("Failed to init when requesting Audio Graph Client Provider"), "audio_pipeline_error", "AudioPipelineController", "debug", "getAudioGraphClientProvider", String.valueOf(A00), hashCode());
        } else if (this.A0P == null && (interfaceC25222BDw = this.A03) != null) {
            this.A0P = interfaceC25222BDw.getAudioGraphClientProvider();
        }
        return this.A0P;
    }

    public final void A04() {
        this.A0I.A05.A01("d");
        this.A0B.post(new Runnable() { // from class: X.9LX
            @Override // java.lang.Runnable
            public final void run() {
                C175887s2 c175887s2 = C175887s2.this;
                synchronized (c175887s2) {
                    C175917s6 c175917s6 = c175887s2.A0I;
                    C175927s7 c175927s7 = c175917s6.A05;
                    c175927s7.A01("dAS");
                    InterfaceC178407wE interfaceC178407wE = c175887s2.A0L;
                    interfaceC178407wE.CiR(AbstractC166987dD.A0M(c175887s2), "audio_pipeline_destroying", "AudioPipelineController", null);
                    C210059Qt c210059Qt = c175887s2.A04;
                    if (c210059Qt != null) {
                        c210059Qt.A00();
                        c175887s2.A04 = null;
                    }
                    C175937s8 c175937s8 = c175887s2.A0G;
                    c175937s8.A00 = null;
                    c175937s8.A01 = null;
                    C175947s9 c175947s9 = c175887s2.A0H;
                    c175947s9.A00 = null;
                    c175947s9.A02 = null;
                    c175947s9.A01 = null;
                    AH6 ah6 = c175887s2.A00;
                    if (ah6 != null) {
                        c175887s2.A0J.A00(ah6);
                        c175887s2.A00 = null;
                    }
                    c175887s2.A00 = null;
                    c175887s2.A0P = null;
                    if (c175887s2.A05 != null) {
                        c175887s2.A05 = null;
                    }
                    InterfaceC25222BDw interfaceC25222BDw = c175887s2.A03;
                    if (interfaceC25222BDw != null) {
                        interfaceC25222BDw.release();
                        c175887s2.A03 = null;
                    }
                    if (c175887s2.A01 != null) {
                        c175887s2.A01 = null;
                    }
                    if (c175887s2.A02 != null) {
                        c175887s2.A02 = null;
                    }
                    Object obj = c175887s2.A06;
                    if (obj != null) {
                        c175887s2.A0A.unregisterAudioDeviceCallback((AudioDeviceCallback) obj);
                    }
                    c175887s2.A07 = false;
                    c175927s7.A01("dAE");
                    C175907s4.A02(c175887s2.A0B, false, true);
                    interfaceC178407wE.CiR(AbstractC166987dD.A0M(c175887s2), "audio_pipeline_destroyed", "AudioPipelineController", C175917s6.A00(c175887s2.A0A, c175917s6, c175887s2.A03));
                }
            }
        });
    }

    public final void A05() {
        this.A0I.A05.A01("p");
        final InterfaceC176157sY interfaceC176157sY = new InterfaceC176157sY() { // from class: X.8md
            @Override // X.InterfaceC176157sY
            public final void onSuccess() {
            }

            @Override // X.InterfaceC176157sY
            public final void DE8(AbstractC223559ty abstractC223559ty) {
                String str;
                C175887s2 c175887s2 = C175887s2.this;
                InterfaceC178407wE interfaceC178407wE = c175887s2.A0L;
                long hashCode = c175887s2.hashCode();
                Map map = abstractC223559ty.A00;
                if (map != null) {
                    str = (String) map.get("fba_error_code");
                } else {
                    str = null;
                }
                interfaceC178407wE.CiQ(abstractC223559ty, "audio_pipeline_pause_failed", "AudioPipelineController", "low", "AudioPipelineController", str, hashCode);
            }
        };
        this.A0B.post(new Runnable() { // from class: X.8me
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC196508mg runnableC196508mg;
                C175887s2 c175887s2 = C175887s2.this;
                InterfaceC176157sY interfaceC176157sY2 = interfaceC176157sY;
                Handler handler = c175887s2.A0C;
                C175927s7 c175927s7 = c175887s2.A0I.A05;
                c175927s7.A01("pAS");
                if (c175887s2.A04 != null && c175887s2.A03 != null && c175887s2.A07) {
                    c175887s2.A0L.CiR(c175887s2.hashCode(), "audio_pipeline_pausing", "AudioPipelineController", null);
                    int pause = c175887s2.A03.pause();
                    c175887s2.A07 = false;
                    c175887s2.A04.A00();
                    AH6 ah6 = c175887s2.A00;
                    if (ah6 != null) {
                        c175887s2.A0J.A00(ah6);
                        c175887s2.A00 = null;
                    }
                    c175927s7.A01("pAE");
                    runnableC196508mg = new RunnableC196508mg(pause, "Failed to pause audio pipeline.", interfaceC176157sY2);
                } else {
                    runnableC196508mg = new RunnableC196508mg(0, "", interfaceC176157sY2);
                }
                handler.post(runnableC196508mg);
            }
        });
    }

    public final void A06(final InterfaceC176157sY interfaceC176157sY, final Handler handler) {
        this.A0I.A05.A01("r");
        if (!this.A0B.post(new Runnable() { // from class: X.9P8
            /* JADX WARN: Code restructure failed: missing block: B:37:0x003e, code lost:
            
                if (r7 == 4) goto L16;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C9P8.run():void");
            }
        }) && interfaceC176157sY != null && handler != null) {
            handler.post(new RunnableC24533Atq(this, interfaceC176157sY));
        }
    }
}
