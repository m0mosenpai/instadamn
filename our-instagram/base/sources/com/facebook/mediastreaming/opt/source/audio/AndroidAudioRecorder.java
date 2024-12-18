package com.facebook.mediastreaming.opt.source.audio;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25228BEl;
import X.C09170dP;
import X.C0JO;
import X.C14360o3;
import X.C3OO;
import X.C53701Noq;
import X.C55219Oei;
import X.EnumC53246Ngk;
import X.InterfaceC57794PkM;
import X.MSY;
import X.O16;
import X.PPQ;
import X.RunnableC56851PKv;
import android.media.AudioRecord;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class AndroidAudioRecorder implements AndroidAudioInput {
    public static final C53701Noq Companion = new Object();
    public Pair audioRecorderWithSize;
    public final int audioThreadPriority;
    public final boolean enableStereo;
    public final Executor executor;
    public volatile AndroidAudioInputHost host;
    public final C0JO monotonicClock;
    public ByteBuffer muteData;
    public final boolean retryOnRecorderPrepareFail;
    public final int sampleRate;
    public Thread thread;
    public final int audioSource = 5;
    public final int bufferSize = C3OO.FLAG_MOVED;
    public final AtomicBoolean isRecordingAudioData = new AtomicBoolean(false);
    public final AtomicBoolean isStreamingAudioData = new AtomicBoolean(false);
    public final AtomicBoolean muteOn = new AtomicBoolean(false);
    public final int startRecordingRetries = 2;

    public AndroidAudioRecorder(C0JO c0jo, int i, int i2, boolean z, int i3, int i4, InterfaceC57794PkM interfaceC57794PkM, boolean z2) {
        this.monotonicClock = c0jo;
        this.audioThreadPriority = i2;
        this.enableStereo = z;
        this.sampleRate = i3;
        this.retryOnRecorderPrepareFail = z2;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: X.0J4
            public final String A00;
            public final ThreadGroup A01;
            public final AtomicInteger A02 = new AtomicInteger(1);

            {
                ThreadGroup threadGroup;
                SecurityManager securityManager = System.getSecurityManager();
                if (securityManager != null) {
                    threadGroup = securityManager.getThreadGroup();
                } else {
                    threadGroup = Thread.currentThread().getThreadGroup();
                }
                this.A01 = threadGroup;
                this.A00 = AnonymousClass001.A0R("AudioRecorder", "-");
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(this.A01, runnable, AnonymousClass001.A0O(this.A00, this.A02.getAndIncrement()), 0L);
                if (thread.isDaemon()) {
                    thread.setDaemon(false);
                }
                if (thread.getPriority() != 5) {
                    thread.setPriority(5);
                }
                return thread;
            }
        });
        C14360o3.A07(newSingleThreadExecutor);
        this.executor = newSingleThreadExecutor;
    }

    public static final /* synthetic */ void access$startAudioRecordingInternal(AndroidAudioRecorder androidAudioRecorder) {
        AudioRecord audioRecord;
        C55219Oei.A03("mss:AndroidAudioRecorder", "startAudioRecording", new Object[0]);
        if (androidAudioRecorder.isRecordingAudioData.compareAndSet(false, true)) {
            androidAudioRecorder.prepare();
            int i = androidAudioRecorder.startRecordingRetries;
            for (int i2 = 0; i2 < i; i2++) {
                if (androidAudioRecorder.audioRecorderWithSize == null || i2 != 0) {
                    androidAudioRecorder.release();
                    androidAudioRecorder.isRecordingAudioData.set(true);
                    androidAudioRecorder.prepare();
                }
                try {
                    Pair pair = androidAudioRecorder.audioRecorderWithSize;
                    if (pair == null) {
                        if (!androidAudioRecorder.retryOnRecorderPrepareFail || i2 == androidAudioRecorder.startRecordingRetries - 1) {
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            A1C.append("AudioRecorder could not be opened, is stereo = ");
                            A1C.append(androidAudioRecorder);
                            throw AbstractC166987dD.A14(AbstractC166997dE.A0x(".enableStereo", A1C));
                        }
                    } else {
                        AudioRecord audioRecord2 = (AudioRecord) pair.first;
                        if (audioRecord2 != null) {
                            audioRecord2.startRecording();
                        }
                    }
                    Pair pair2 = androidAudioRecorder.audioRecorderWithSize;
                    if (pair2 != null && (audioRecord = (AudioRecord) pair2.first) != null && audioRecord.getRecordingState() == 3) {
                        break;
                    }
                    try {
                        C55219Oei.A02("mss:AndroidAudioRecorder", "AndroidAudioRecorder.startRecording sleep %d ms for retry, attempt %d", null, Arrays.copyOf(new Object[]{100, Integer.valueOf(i2)}, 2));
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                } catch (IllegalStateException e) {
                    androidAudioRecorder.release();
                    AndroidAudioInputHost androidAudioInputHost = androidAudioRecorder.host;
                    if (androidAudioInputHost != null) {
                        androidAudioInputHost.fireError(EnumC53246Ngk.AudioSourceError, "Audio recording failed", e);
                    }
                }
            }
            Pair pair3 = androidAudioRecorder.audioRecorderWithSize;
            if (pair3 != null) {
                Thread thread = new Thread(new PPQ(pair3, androidAudioRecorder), "live_audio_recording");
                androidAudioRecorder.thread = thread;
                thread.start();
            }
        }
    }

    public static final native double calculateVolume(Object obj, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepare() {
        String str;
        Pair pair;
        AudioRecord audioRecord;
        AtomicInteger atomicInteger = O16.A01;
        C55219Oei.A03("mss:AndroidAudioRecorder", "prepare refCount %d", Integer.valueOf(atomicInteger.get()));
        if (this.audioRecorderWithSize == null) {
            try {
                boolean z = this.enableStereo;
                int i = this.sampleRate;
                int i2 = this.audioSource;
                int i3 = 16;
                if (z) {
                    i3 = 12;
                }
                AtomicInteger atomicInteger2 = O16.A02;
                int i4 = atomicInteger2.get();
                int minBufferSize = AudioRecord.getMinBufferSize(i, i3, 2);
                if (minBufferSize <= 0) {
                    minBufferSize = 4096;
                }
                int[] iArr = {i4, i4 / 10, minBufferSize * 2, minBufferSize};
                int i5 = 0;
                do {
                    int max = Math.max(iArr[i5], minBufferSize);
                    try {
                        str = O16.A00;
                        C55219Oei.A05(str, "New AudioRecord: buffer size: %d, channel type: %d, sample rate: %d, audio source: %d", Integer.valueOf(max), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2));
                        audioRecord = new AudioRecord(i2, i, i3, 2, max);
                    } catch (IllegalArgumentException e) {
                        str = O16.A00;
                        C55219Oei.A04(str, "Failed attempt to create audio record", e);
                    }
                    if (audioRecord.getState() != 1) {
                        C55219Oei.A04(str, "Unexpected new audio recorder state: %d", Integer.valueOf(audioRecord.getState()));
                        audioRecord.release();
                        if (max == minBufferSize) {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        atomicInteger2.set(max);
                        atomicInteger.addAndGet(1);
                        C55219Oei.A05(str, "Successfully opened mic for LiveStreaming", new Object[0]);
                        pair = MSY.A0D(audioRecord, max);
                        break;
                    }
                } while (i5 < 4);
                C55219Oei.A04(str, "Failed to opened Mic for LiveStreaming", new Object[0]);
                pair = null;
                this.audioRecorderWithSize = pair;
            } catch (IllegalArgumentException e2) {
                C55219Oei.A01("mss:AndroidAudioRecorder", "MicrophoneSetup.openMic failed refCount %d", e2, AbstractC25228BEl.A1Y(atomicInteger.get()));
            }
        }
    }

    @Override // com.facebook.mediastreaming.opt.source.audio.AndroidAudioInput
    public void startAudioStreaming() {
        C55219Oei.A03("mss:AndroidAudioRecorder", "startAudioStreaming", new Object[0]);
        this.isStreamingAudioData.set(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Noq, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming");
    }

    public static final /* synthetic */ void access$restartRecorder(AndroidAudioRecorder androidAudioRecorder) {
        if (androidAudioRecorder.isRecordingAudioData.get()) {
            androidAudioRecorder.release();
            androidAudioRecorder.prepare();
            C55219Oei.A03("mss:AndroidAudioRecorder", "startAudioRecording", new Object[0]);
            androidAudioRecorder.executor.execute(new RunnableC56851PKv(androidAudioRecorder));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void release() {
        AtomicInteger atomicInteger = O16.A01;
        C55219Oei.A03("mss:AndroidAudioRecorder", "release refCount %d", Integer.valueOf(atomicInteger.get()));
        this.isRecordingAudioData.set(false);
        try {
            Thread thread = this.thread;
            if (thread != null) {
                thread.join();
            }
        } catch (InterruptedException e) {
            C55219Oei.A01("mss:AndroidAudioRecorder", "Ran into an exception while draining audio", e, new Object[0]);
        }
        this.thread = null;
        Pair pair = this.audioRecorderWithSize;
        if (pair != null) {
            AudioRecord audioRecord = (AudioRecord) pair.first;
            if (audioRecord != null) {
                audioRecord.release();
                atomicInteger.addAndGet(-1);
            }
            this.audioRecorderWithSize = null;
        }
        C55219Oei.A03("mss:AndroidAudioRecorder", "release done refCount %d", AbstractC25228BEl.A1Y(atomicInteger.get()));
    }

    @Override // com.facebook.mediastreaming.opt.source.audio.AndroidAudioInput
    public boolean isMuted() {
        return this.muteOn.get();
    }

    @Override // com.facebook.mediastreaming.opt.source.audio.AndroidAudioInput
    public void setMute(boolean z) {
        this.muteOn.set(z);
    }

    @Override // com.facebook.mediastreaming.opt.source.audio.AndroidAudioInput
    public void stopAudioStreaming() {
        this.isStreamingAudioData.set(false);
    }

    @Override // com.facebook.mediastreaming.opt.source.audio.AndroidAudioInput
    public void setHost(AndroidAudioInputHost androidAudioInputHost) {
        this.host = androidAudioInputHost;
    }
}
