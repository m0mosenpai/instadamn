package com.facebook.cameracore.audiograph;

import X.A4V;
import X.AH7;
import X.AM5;
import X.AMJ;
import X.AVE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC223559ty;
import X.AbstractC224539ve;
import X.BB0;
import X.C05F;
import X.C0K8;
import X.C175867s0;
import X.C175877s1;
import X.C175887s2;
import X.C175907s4;
import X.C175917s6;
import X.C175937s8;
import X.C176087sR;
import X.C177547uo;
import X.C211469Wv;
import X.C211479Ww;
import X.C212399b8;
import X.C23388AYm;
import X.C23395AYu;
import X.C73493YFw;
import X.C9PN;
import X.C9PO;
import X.C9PP;
import X.EnumC177557up;
import X.InterfaceC176077sQ;
import X.InterfaceC176157sY;
import X.InterfaceC178337w7;
import X.InterfaceC178407wE;
import X.InterfaceC25222BDw;
import X.RunnableC24537Atu;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media.AudioAttributesCompat;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class AudioPipelineImpl implements InterfaceC25222BDw {
    public static boolean sIsNativeLibLoaded;
    public final C9PO mAudioDebugCallback;
    public final C9PP mAudioMixingCallback;
    public C175937s8 mAudioOutputCallback;
    public final Handler mAudioPipelineHandler;
    public volatile Handler mAudioPlayerThread;
    public AM5 mAudioRecorder;
    public AVE mAudioRecorderCallback;
    public volatile Handler mAudioRecorderThread;
    public AH7 mAudioRenderPerfStats;
    public volatile AudioTrack mAudioTrack;
    public final int mBufferSizeInSamples;
    public final int mGraphSampleRate;
    public HybridData mHybridData;
    public boolean mIsManuallyProcessingGraph;
    public final InterfaceC178337w7 mMobileConfigComponent;
    public int mPlatformNumChannels;
    public final C9PN mPlatformOutputErrorCallback;
    public int mPlatformSampleType;
    public volatile InterfaceC176157sY mStartInputCallback;
    public volatile Handler mStartInputHandler;
    public volatile InterfaceC176157sY mStopInputCallback;
    public volatile Handler mStopInputHandler;
    public final C175877s1 mThreadPool;
    public final boolean mXplatControlsStartInput;
    public static final boolean IS_UNIT_TEST = "robolectric".equals(Build.FINGERPRINT);
    public static final C23388AYm sEmptyStateCallback = new Object();
    public static final InterfaceC176077sQ sEmptyAudioPerfStatsProvider = new InterfaceC176077sQ() { // from class: X.9RN
        @Override // X.InterfaceC176077sQ
        public final AH7 AXE() {
            return null;
        }
    };
    public final Object mAudioTrackLock = new Object();
    public final AtomicBoolean mDestructed = AbstractC166997dE.A17();
    public final AtomicBoolean mStopped = new AtomicBoolean(true);

    private native int createFbaProcessingGraphInternal(int i, int i2, boolean z);

    private native int createManualProcessingGraphInternal(int i, int i2);

    private native HybridData initHybrid(int i, float f, int i2, boolean z);

    private native int startInputInternal();

    /* JADX INFO: Access modifiers changed from: private */
    public native int stopInputInternal();

    @Override // X.InterfaceC25222BDw
    public native AudioGraphClientProvider getAudioGraphClientProvider();

    @Override // X.InterfaceC25222BDw
    public native String getDebugInfo();

    public native String getFBAProfileInfo(int i);

    @Override // X.InterfaceC25222BDw
    public native boolean isSubgraphInserted();

    @Override // X.InterfaceC25222BDw
    public native void onReceivedAudioMixingMode(int i);

    @Override // X.InterfaceC25222BDw
    public native int pause();

    @Override // X.InterfaceC25222BDw
    public synchronized void prepareRecorder(C177547uo c177547uo, InterfaceC176077sQ interfaceC176077sQ, Handler handler, InterfaceC176157sY interfaceC176157sY, Handler handler2) {
        AbstractC223559ty abstractC223559ty;
        if (c177547uo.A04 != this.mGraphSampleRate) {
            abstractC223559ty = new AbstractC223559ty(22002, "Requested sample rate does not match graph");
        } else {
            int i = c177547uo.A02;
            int i2 = this.mPlatformSampleType;
            if (i != i2) {
                abstractC223559ty = new AbstractC223559ty(22002, "Requested PCM encoding does not match graph callback");
            } else {
                int bitCount = Integer.bitCount(c177547uo.A01);
                int i3 = this.mPlatformNumChannels;
                if (bitCount != i3) {
                    abstractC223559ty = new AbstractC223559ty(22002, "Requested number of channels does not match graph callback");
                } else if (c177547uo.A03 != this.mBufferSizeInSamples * i3 * AMJ.A00(i2)) {
                    abstractC223559ty = new AbstractC223559ty(22002, "Requested samples per frame does not match graph");
                } else {
                    if (this.mIsManuallyProcessingGraph) {
                        if (this.mAudioRecorder == null) {
                            AVE ave = new AVE(this);
                            this.mAudioRecorderCallback = ave;
                            this.mAudioRecorder = new AM5(handler, interfaceC176077sQ, c177547uo, ave, 5, this.mMobileConfigComponent.ArS(1004), this.mMobileConfigComponent.B5H(21), this.mMobileConfigComponent.CUa(68));
                            if (!this.mMobileConfigComponent.CUa(65)) {
                                this.mMobileConfigComponent.CUZ(65);
                            }
                        } else {
                            c177547uo.toString();
                        }
                        if (this.mAudioRecorder.A0F == C05F.A00) {
                            this.mAudioRecorder.A04(interfaceC176157sY, handler2);
                        }
                    }
                    interfaceC176157sY.onSuccess();
                }
            }
        }
        interfaceC176157sY.DE8(abstractC223559ty);
    }

    public native int processAndPullSpeaker(byte[] bArr, int i);

    public native int processAndPullSpeakerWithByteBuffer(ByteBuffer byteBuffer, int i);

    public native int processByteBuffer(ByteBuffer byteBuffer, int i);

    public native int processData(byte[] bArr, int i);

    public native int pullCaptureSinkQueue(ByteBuffer byteBuffer, int i);

    @Override // X.InterfaceC25222BDw
    public native int resume();

    @Override // X.InterfaceC25222BDw
    public native void updateOutputRouteState(int i);

    public AudioPipelineImpl(int i, int i2, InterfaceC178337w7 interfaceC178337w7, int i3, C9PP c9pp, C9PO c9po, C9PN c9pn, BB0 bb0, Handler handler, C175877s1 c175877s1) {
        this.mBufferSizeInSamples = i;
        this.mThreadPool = c175877s1;
        this.mGraphSampleRate = i2;
        this.mAudioPipelineHandler = handler;
        this.mAudioMixingCallback = c9pp;
        this.mAudioDebugCallback = c9po;
        this.mMobileConfigComponent = interfaceC178337w7;
        this.mPlatformOutputErrorCallback = c9pn;
        this.mXplatControlsStartInput = interfaceC178337w7.CUZ(72);
        if (!IS_UNIT_TEST) {
            if (interfaceC178337w7.CUa(65)) {
                interfaceC178337w7.CUZ(65);
            }
            this.mHybridData = initHybrid(i, i2, 1000, true);
        }
    }

    private void createAudioTrack(int i) {
        int i2;
        if (this.mAudioTrack != null) {
            this.mAudioTrack.release();
        }
        int i3 = this.mGraphSampleRate;
        int i4 = this.mPlatformNumChannels;
        if (i4 != 1) {
            if (i4 == 2) {
                i2 = 12;
            } else {
                throw AbstractC166987dD.A18("Out channel count not supported");
            }
        } else {
            i2 = 4;
        }
        this.mAudioTrack = new AudioTrack(3, i3, i2, this.mPlatformSampleType, i, 1);
        if (!this.mMobileConfigComponent.CUa(65)) {
            this.mMobileConfigComponent.CUZ(65);
        }
    }

    public static void reportException(int i, String str, InterfaceC176157sY interfaceC176157sY) {
        C212399b8 c212399b8 = new C212399b8(str);
        c212399b8.A00("fba_error_code", AbstractC224539ve.A00(i));
        interfaceC176157sY.DE8(c212399b8);
    }

    @Override // X.InterfaceC25222BDw
    public int createFbaProcessingGraph(int i, int i2, C175937s8 c175937s8) {
        int i3;
        this.mPlatformSampleType = i;
        this.mPlatformNumChannels = i2;
        this.mIsManuallyProcessingGraph = false;
        this.mAudioOutputCallback = c175937s8;
        if (IS_UNIT_TEST) {
            return 0;
        }
        if (i != 2) {
            if (i == 4) {
                i3 = 8;
            } else {
                throw AbstractC166987dD.A18("Unsupported PCM Encoding");
            }
        } else {
            i3 = 3;
        }
        return createFbaProcessingGraphInternal(i3, i2, this.mMobileConfigComponent.CUa(68));
    }

    @Override // X.InterfaceC25222BDw
    public int createManualProcessingGraph(int i, int i2, C175937s8 c175937s8) {
        int i3;
        this.mPlatformSampleType = i;
        this.mPlatformNumChannels = i2;
        this.mIsManuallyProcessingGraph = true;
        this.mAudioOutputCallback = c175937s8;
        if (!IS_UNIT_TEST) {
            if (i != 2) {
                if (i == 4) {
                    i3 = 8;
                } else {
                    throw AbstractC166987dD.A18("Unsupported PCM Encoding");
                }
            } else {
                i3 = 3;
            }
            return createManualProcessingGraphInternal(i3, i2);
        }
        return 0;
    }

    @Override // X.InterfaceC25222BDw
    public int fillAudioBuffer(C73493YFw c73493YFw) {
        if (this.mIsManuallyProcessingGraph) {
            AM5 am5 = this.mAudioRecorder;
            if (am5 != null) {
                am5.A03(c73493YFw);
            }
        } else {
            int A00 = this.mBufferSizeInSamples * this.mPlatformNumChannels * AMJ.A00(this.mPlatformSampleType);
            ByteBuffer byteBuffer = c73493YFw.A02;
            if (byteBuffer.capacity() >= A00) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                int pullCaptureSinkQueue = pullCaptureSinkQueue(byteBuffer, A00);
                if (pullCaptureSinkQueue == 0) {
                    C175937s8 c175937s8 = this.mAudioOutputCallback;
                    if (c175937s8 != null) {
                        c175937s8.A00(c73493YFw, this.mGraphSampleRate, this.mPlatformSampleType, this.mPlatformNumChannels, A00, elapsedRealtimeNanos);
                    }
                    return 0;
                }
                if (pullCaptureSinkQueue != 20) {
                    C0K8.A0O("AudioPipeline", "Error when pulling capture queue sink = %s", AbstractC224539ve.A00(pullCaptureSinkQueue));
                    return 1;
                }
            } else {
                C0K8.A0C("AudioPipeline", "Error when filling capture buffer, not enough space in it");
                return 1;
            }
        }
        return 1;
    }

    public void handleAudioCallback(byte[] bArr, long j, long j2) {
        C175937s8 c175937s8 = this.mAudioOutputCallback;
        if (c175937s8 != null) {
            c175937s8.A01(bArr, this.mGraphSampleRate, this.mPlatformSampleType, this.mPlatformNumChannels, j, j2);
        }
    }

    public void handleDebugEvent(String str) {
        C175887s2 c175887s2 = this.mAudioDebugCallback.A00;
        HashMap A00 = C175917s6.A00(c175887s2.A0A, c175887s2.A0I, null);
        A00.put("AP_FBADebugInfo", str);
        c175887s2.A0L.CiR(AbstractC166987dD.A0M(c175887s2), "audio_pipeline_method_exceeded_time", "AudioPipelineController", A00);
    }

    public void onSubgraphInserted() {
        String str;
        C175867s0 c175867s0 = this.mAudioDebugCallback.A00.A0K;
        if (c175867s0 != null) {
            InterfaceC178407wE interfaceC178407wE = c175867s0.A00;
            List B1n = interfaceC178407wE.AkA().B1n();
            if (!B1n.isEmpty()) {
                str = (String) AbstractC166987dD.A16(B1n);
            } else {
                str = "";
            }
            interfaceC178407wE.BYr().updateAnnotation(str, "subgraph_inserted", String.valueOf(B1n.size()));
        }
    }

    @Override // X.InterfaceC25222BDw
    public void release() {
        if (this.mDestructed.compareAndSet(false, true)) {
            AM5 am5 = this.mAudioRecorder;
            if (am5 != null) {
                am5.A06(sEmptyStateCallback, this.mAudioPipelineHandler);
                this.mAudioRecorder = null;
            }
            stopPlatformOutput();
            HybridData hybridData = this.mHybridData;
            if (hybridData != null) {
                hybridData.resetNative();
                this.mHybridData = null;
            }
            this.mAudioRecorderCallback = null;
            this.mAudioOutputCallback = null;
        }
    }

    public boolean setAudioMixing(final int i) {
        final C9PP c9pp = this.mAudioMixingCallback;
        c9pp.A00.A0B.postDelayed(new Runnable() { // from class: X.8pq
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.9vC] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.9vC] */
            @Override // java.lang.Runnable
            public final void run() {
                C224289vC c224289vC;
                C175887s2 c175887s2 = C9PP.this.A00;
                int i2 = i;
                if (i2 == 0) {
                    AH6 ah6 = c175887s2.A00;
                    if (ah6 != null) {
                        c175887s2.A0J.A00(ah6);
                        c175887s2.A00 = null;
                        return;
                    }
                    return;
                }
                if (i2 == 3) {
                    return;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    }
                    ?? obj = new Object();
                    obj.A03 = AH6.A05;
                    obj.A00 = 3;
                    c224289vC = obj;
                } else {
                    ?? obj2 = new Object();
                    obj2.A03 = AH6.A05;
                    obj2.A00 = 2;
                    c224289vC = obj2;
                }
                AudioAttributesCompat audioAttributesCompat = c175887s2.A0D;
                if (audioAttributesCompat != null) {
                    c224289vC.A03 = audioAttributesCompat;
                    c224289vC.A01(c175887s2.A0H);
                    AH6 A00 = c224289vC.A00();
                    c175887s2.A00 = A00;
                    c175887s2.A0J.A01(A00);
                    return;
                }
                throw new NullPointerException("Illegal null AudioAttributes");
            }
        }, 500L);
        return true;
    }

    @Override // X.InterfaceC25222BDw
    public String snapshot() {
        AM5 am5 = this.mAudioRecorder;
        if (am5 != null) {
            return am5.A09.A00();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r4 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r0 != 12) goto L61;
     */
    @Override // X.InterfaceC25222BDw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startInput(X.InterfaceC176157sY r7, android.os.Handler r8) {
        /*
            r6 = this;
            X.AH7 r1 = r6.mAudioRenderPerfStats
            r5 = 0
            if (r1 == 0) goto L1d
            r0 = 5
            java.lang.String r0 = r6.getFBAProfileInfo(r0)
            r1.A08 = r0
            X.AH7 r2 = r6.mAudioRenderPerfStats
            r1 = 1
            X.9PO r0 = r6.mAudioDebugCallback
            if (r0 == 0) goto L16
            r0.A01(r2, r1)
        L16:
            X.AH7 r0 = r6.mAudioRenderPerfStats
            r0.A02()
            r0.A0A = r1
        L1d:
            boolean r0 = r6.mXplatControlsStartInput
            if (r0 == 0) goto L69
            r6.mStartInputCallback = r7
            r6.mStartInputHandler = r8
            X.7w7 r0 = r6.mMobileConfigComponent
            r1 = 65
            boolean r0 = r0.CUa(r1)
            if (r0 != 0) goto L34
            X.7w7 r0 = r6.mMobileConfigComponent
            r0.CUZ(r1)
        L34:
            X.7w7 r0 = r6.mMobileConfigComponent
            r1 = 66
            boolean r0 = r0.CUa(r1)
            if (r0 == 0) goto L43
            X.7w7 r0 = r6.mMobileConfigComponent
            r0.CUZ(r1)
        L43:
            boolean r0 = com.facebook.cameracore.audiograph.AudioPipelineImpl.IS_UNIT_TEST
            if (r0 == 0) goto L64
            r4 = 0
        L48:
            boolean r3 = r6.mIsManuallyProcessingGraph
            java.lang.String r2 = "startInputInternal failed"
            r1 = 12
            r0 = 0
            if (r3 == 0) goto L5d
            if (r4 == 0) goto L5c
            r6.mStartInputCallback = r0
            r6.mStartInputHandler = r0
        L57:
            if (r4 == r1) goto L7d
            reportException(r4, r2, r7)
        L5c:
            return
        L5d:
            r6.mStartInputCallback = r0
            r6.mStartInputHandler = r0
            if (r4 == 0) goto L7d
            goto L57
        L64:
            int r4 = r6.startInputInternal()
            goto L48
        L69:
            boolean r0 = r6.mIsManuallyProcessingGraph
            java.lang.String r4 = "startInputInternal failed"
            r3 = 12
            if (r0 != 0) goto L81
            boolean r0 = com.facebook.cameracore.audiograph.AudioPipelineImpl.IS_UNIT_TEST
            if (r0 != 0) goto L7d
            int r0 = r6.startInputInternal()
            if (r0 == 0) goto L7d
            if (r0 != r3) goto Lbd
        L7d:
            r7.onSuccess()
            return
        L81:
            X.AM5 r0 = r6.mAudioRecorder
            if (r0 == 0) goto Lc1
            X.AVE r0 = r6.mAudioRecorderCallback
            if (r0 == 0) goto Lc1
            X.7s8 r2 = r6.mAudioOutputCallback
            if (r2 == 0) goto L9e
            boolean r0 = com.facebook.cameracore.audiograph.AudioPipelineImpl.IS_UNIT_TEST
            if (r0 == 0) goto Lb8
            r1 = 0
        L92:
            X.7sR r0 = r2.A00
            if (r0 == 0) goto L9e
            X.7sN r0 = r0.A00
            X.AH7 r0 = r0.A0E
            if (r0 == 0) goto L9e
            r0.A09 = r1
        L9e:
            X.AVE.A00(r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.mStopped
            r0.set(r5)
            boolean r0 = com.facebook.cameracore.audiograph.AudioPipelineImpl.IS_UNIT_TEST
            if (r0 != 0) goto Lb2
            int r0 = r6.startInputInternal()
            if (r0 == 0) goto Lb2
            if (r0 != r3) goto Lbd
        Lb2:
            X.AM5 r0 = r6.mAudioRecorder
            r0.A05(r7, r8)
            return
        Lb8:
            boolean r1 = r6.isSubgraphInserted()
            goto L92
        Lbd:
            reportException(r0, r4, r7)
            return
        Lc1:
            java.lang.String r1 = "AudioRecorder not created. Cannot start input."
            X.9b8 r0 = new X.9b8
            r0.<init>(r1)
            r7.DE8(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.audiograph.AudioPipelineImpl.startInput(X.7sY, android.os.Handler):void");
    }

    public int startPlatformInput() {
        int i;
        boolean isSubgraphInserted;
        AH7 ah7;
        if (this.mXplatControlsStartInput) {
            InterfaceC176157sY interfaceC176157sY = this.mStartInputCallback;
            Handler handler = this.mStartInputHandler;
            this.mStartInputCallback = null;
            this.mStartInputHandler = null;
            if (interfaceC176157sY == null || handler == null) {
                EnumC177557up enumC177557up = C177547uo.A06;
                int i2 = this.mGraphSampleRate;
                int i3 = this.mPlatformSampleType;
                int i4 = this.mPlatformNumChannels;
                if (i4 != 1) {
                    if (i4 == 2) {
                        i = 12;
                    } else {
                        throw AbstractC166987dD.A18("Channel count not supported");
                    }
                } else {
                    i = 16;
                }
                C177547uo c177547uo = new C177547uo(enumC177557up, 64000, i, i3, this.mBufferSizeInSamples * i4 * AMJ.A00(i3), i2);
                Handler A00 = C175907s4.A00(null, C175907s4.A02, "audio_recorder", -19);
                prepareRecorder(c177547uo, sEmptyAudioPerfStatsProvider, A00, sEmptyStateCallback, this.mAudioPipelineHandler);
                this.mAudioRecorderThread = A00;
            }
            if (this.mAudioRecorder != null && this.mAudioRecorderCallback != null) {
                C175937s8 c175937s8 = this.mAudioOutputCallback;
                if (c175937s8 != null) {
                    if (IS_UNIT_TEST) {
                        isSubgraphInserted = false;
                    } else {
                        isSubgraphInserted = isSubgraphInserted();
                    }
                    C176087sR c176087sR = c175937s8.A00;
                    if (c176087sR != null && (ah7 = c176087sR.A00.A0E) != null) {
                        ah7.A09 = isSubgraphInserted;
                    }
                }
                AVE.A00(this);
                this.mStopped.set(false);
                AM5 am5 = this.mAudioRecorder;
                C23395AYu c23395AYu = new C23395AYu(1, this, interfaceC176157sY);
                if (handler == null) {
                    handler = this.mAudioPipelineHandler;
                }
                am5.A05(c23395AYu, handler);
            } else {
                if (interfaceC176157sY != null) {
                    interfaceC176157sY.DE8(new C212399b8("AudioRecorder not created. Cannot start input."));
                    return 0;
                }
                return 34;
            }
        }
        return 0;
    }

    public int startPlatformOutput() {
        A4V c211469Wv;
        int A00 = this.mBufferSizeInSamples * this.mPlatformNumChannels * AMJ.A00(this.mPlatformSampleType);
        if (this.mMobileConfigComponent.CUa(67)) {
            this.mMobileConfigComponent.CUZ(67);
        }
        if (this.mMobileConfigComponent.CUa(68)) {
            c211469Wv = new C211479Ww(this, A00);
        } else {
            c211469Wv = new C211469Wv(this, A00);
        }
        this.mAudioPlayerThread = C175907s4.A00(null, C175907s4.A02, "audio_player_thread", -19);
        int i = c211469Wv.A00;
        AH7 ah7 = new AH7(AMJ.A01(this.mPlatformSampleType, this.mPlatformNumChannels, i, this.mGraphSampleRate) * 1000, this.mBufferSizeInSamples);
        this.mAudioRenderPerfStats = ah7;
        ah7.A09 = true;
        synchronized (this.mAudioTrackLock) {
            createAudioTrack(i);
            try {
                this.mAudioTrack.play();
            } catch (IllegalStateException unused) {
                createAudioTrack(i);
                try {
                    try {
                        this.mAudioTrack.play();
                    } catch (Throwable th) {
                        this.mAudioTrack = null;
                        throw th;
                    }
                } catch (IllegalStateException unused2) {
                    if (this.mAudioTrack != null) {
                        this.mAudioTrack.release();
                    }
                    this.mAudioTrack = null;
                    this.mPlatformOutputErrorCallback.A00(new C212399b8("Error with AudioTrack constructor or play()"));
                    return 34;
                }
            }
        }
        this.mAudioPlayerThread.post(new RunnableC24537Atu(c211469Wv, this));
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r4 == 13) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r4 != 0) goto L11;
     */
    @Override // X.InterfaceC25222BDw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void stopInput(X.InterfaceC176157sY r6, android.os.Handler r7) {
        /*
            r5 = this;
            boolean r0 = r5.mXplatControlsStartInput
            if (r0 == 0) goto L2e
            r5.mStopInputCallback = r6
            r5.mStopInputHandler = r7
            boolean r0 = com.facebook.cameracore.audiograph.AudioPipelineImpl.IS_UNIT_TEST
            if (r0 == 0) goto L29
            r4 = 0
        Ld:
            boolean r3 = r5.mIsManuallyProcessingGraph
            java.lang.String r2 = "stopInputInternal failed"
            r1 = 13
            r0 = 0
            if (r3 == 0) goto L22
            if (r4 == 0) goto L21
            r5.mStopInputCallback = r0
            r5.mStopInputHandler = r0
        L1c:
            if (r4 != r1) goto L42
        L1e:
            r6.onSuccess()
        L21:
            return
        L22:
            r5.mStopInputCallback = r0
            r5.mStopInputHandler = r0
            if (r4 == 0) goto L1e
            goto L1c
        L29:
            int r4 = r5.stopInputInternal()
            goto Ld
        L2e:
            boolean r0 = r5.mIsManuallyProcessingGraph
            if (r0 != 0) goto L46
            boolean r0 = com.facebook.cameracore.audiograph.AudioPipelineImpl.IS_UNIT_TEST
            if (r0 != 0) goto L1e
            int r4 = r5.stopInputInternal()
            if (r4 == 0) goto L1e
            r0 = 13
            if (r4 == r0) goto L1e
            java.lang.String r2 = "stopInputInternal failed"
        L42:
            reportException(r4, r2, r6)
            return
        L46:
            X.AM5 r0 = r5.mAudioRecorder
            if (r0 != 0) goto L55
            java.lang.String r1 = "AudioRecorder not created. Cannot stop input."
            X.9b8 r0 = new X.9b8
            r0.<init>(r1)
            r6.DE8(r0)
            return
        L55:
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.mStopped
            r0 = 1
            r1.set(r0)
            X.AM5 r2 = r5.mAudioRecorder
            r1 = 0
            X.AYu r0 = new X.AYu
            r0.<init>(r1, r5, r6)
            r2.A06(r0, r7)
            X.AVE r0 = r5.mAudioRecorderCallback
            if (r0 == 0) goto L21
            X.9PO r3 = r5.mAudioDebugCallback
            java.util.HashMap r2 = r0.A01
            long r0 = r0.A00
            r3.A00(r0, r2)
            X.AVE.A00(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.audiograph.AudioPipelineImpl.stopInput(X.7sY, android.os.Handler):void");
    }

    public int stopPlatformInput() {
        if (this.mXplatControlsStartInput) {
            InterfaceC176157sY interfaceC176157sY = this.mStopInputCallback;
            Handler handler = this.mStopInputHandler;
            this.mStopInputCallback = null;
            this.mStopInputHandler = null;
            if (this.mAudioRecorder == null) {
                if (interfaceC176157sY != null) {
                    interfaceC176157sY.DE8(new C212399b8("AudioRecorder not created. Cannot stop input."));
                }
            } else {
                this.mStopped.set(true);
                AM5 am5 = this.mAudioRecorder;
                C23395AYu c23395AYu = new C23395AYu(2, this, interfaceC176157sY);
                if (handler == null) {
                    handler = this.mAudioPipelineHandler;
                }
                am5.A06(c23395AYu, handler);
                AVE ave = this.mAudioRecorderCallback;
                if (ave != null) {
                    this.mAudioDebugCallback.A00(ave.A00, ave.A01);
                    AVE.A00(this);
                    return 0;
                }
            }
        }
        return 0;
    }

    public int stopPlatformOutput() {
        String fBAProfileInfo;
        if (this.mAudioPlayerThread != null) {
            C175907s4.A02(this.mAudioPlayerThread, true, true);
            this.mAudioPlayerThread = null;
        }
        synchronized (this.mAudioTrackLock) {
            if (this.mAudioTrack != null) {
                AH7 ah7 = this.mAudioRenderPerfStats;
                if (ah7 != null) {
                    ah7.A01 = this.mAudioTrack.getUnderrunCount();
                }
                this.mAudioTrack.release();
                this.mAudioTrack = null;
            }
            AH7 ah72 = this.mAudioRenderPerfStats;
            if (ah72 != null) {
                if (IS_UNIT_TEST) {
                    fBAProfileInfo = "test";
                } else {
                    fBAProfileInfo = getFBAProfileInfo(5);
                }
                ah72.A08 = fBAProfileInfo;
                AH7 ah73 = this.mAudioRenderPerfStats;
                C9PO c9po = this.mAudioDebugCallback;
                if (c9po != null) {
                    c9po.A01(ah73, false);
                }
                this.mAudioRenderPerfStats = null;
            }
        }
        return 0;
    }
}
