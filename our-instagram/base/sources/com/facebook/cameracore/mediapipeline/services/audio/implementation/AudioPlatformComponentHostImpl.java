package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import X.AH7;
import X.AbstractC111324zv;
import X.AbstractC116315Ok;
import X.AbstractC167007dF;
import X.AbstractC25228BEl;
import X.AbstractC43593JPy;
import X.AnonymousClass001;
import X.C0J8;
import X.C0K8;
import X.C14360o3;
import X.C54846OMr;
import X.C68680VaG;
import X.C68893Vdp;
import X.C69052Vgt;
import X.C69322VlU;
import X.C69625VsS;
import X.C70080W1x;
import X.InterfaceC189918bA;
import X.RunnableC71237WqS;
import X.UtH;
import X.VCS;
import X.W5m;
import android.content.Context;
import android.media.AudioManager;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import com.facebook.jni.HybridData;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import org.webrtc.MediaStreamTrack;

@Deprecated
/* loaded from: classes11.dex */
public class AudioPlatformComponentHostImpl extends AudioPlatformComponentHost {
    public String mAssetsDirectory;
    public C68893Vdp mAudioDecoder;
    public AudioInputPreview mAudioInputPreview;
    public C68680VaG mAudioLogger;
    public final AudioManager mAudioManager;
    public volatile W5m mAudioPlayer;
    public volatile AudioServiceController mAudioServiceController;
    public final int mDefaultSampleRate;
    public InterfaceC189918bA mExternalAudioProvider;
    public short[] mInputSamples;
    public MicrophoneSink mMicrophoneSink;
    public final Semaphore mMicrophoneSinkSemaphore;
    public byte[] mOutputBytes;
    public short[] mOutputSamples;
    public AudioRenderCallback mRenderCallback;
    public VCS mStreamType = VCS.MUSIC;
    public boolean mIsCaptureEnabled = true;
    public boolean mIsRecording = false;
    public boolean mIsEffectLoaded = false;
    public boolean mIsServiceCreated = false;
    public boolean mIsMuted = false;

    private native double getDefaultSampleRate();

    private native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public native void readAudioFileFinished(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void readAudioFileReady(String str, short[] sArr, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void readAudioFileStarted(String str, double d, boolean z);

    @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost
    public void startRecording(boolean z) {
        AH7 ah7;
        C68680VaG c68680VaG;
        this.mIsRecording = true;
        W5m w5m = this.mAudioPlayer;
        if (w5m != null && (ah7 = w5m.A02) != null) {
            float A01 = ah7.A01();
            float f = ((float) ah7.A0C) / 1000000.0f;
            long j = ah7.A0B;
            long j2 = ah7.A06;
            HashMap hashMap = new HashMap(6);
            if (j2 > 30 && (c68680VaG = w5m.A03) != null) {
                hashMap.put(AbstractC111324zv.A00(1225), String.valueOf(A01));
                long j3 = ah7.A01;
                if (j3 > -1) {
                    hashMap.put(AbstractC111324zv.A00(1227), String.valueOf(j3));
                }
                hashMap.put(AbstractC111324zv.A00(1230), String.valueOf(ah7.A0A));
                hashMap.put(AbstractC111324zv.A00(1226), String.valueOf(Math.round(f)));
                hashMap.put(AbstractC111324zv.A00(1228), String.valueOf(ah7.A06));
                hashMap.put(AbstractC111324zv.A00(1229), String.valueOf(j));
                c68680VaG.A00.CiR(w5m.hashCode(), AbstractC111324zv.A00(1958), "AudioPlayer", hashMap);
            }
            ah7.A02();
            ah7.A0A = true;
        }
        updateAudioState();
    }

    @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost
    public void stopRecording() {
        this.mIsRecording = false;
        updateAudioState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
    
        if (r3 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        if (r5.mIsMuted != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006b, code lost:
    
        if (r0 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1.isBluetoothA2dpOn() == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateAudioPreviewState() {
        /*
            r5 = this;
            com.facebook.cameracore.mediapipeline.services.audio.implementation.MicrophoneSink r0 = r5.mMicrophoneSink
            boolean r0 = X.AbstractC167007dF.A1W(r0)
            r2 = 0
            if (r0 == 0) goto L1b
            X.W5m r0 = r5.mAudioPlayer
            if (r0 == 0) goto L48
            android.media.AudioManager r1 = r0.A08
            boolean r0 = r1.isWiredHeadsetOn()
            if (r0 != 0) goto L1b
            boolean r0 = r1.isBluetoothA2dpOn()
            if (r0 == 0) goto L48
        L1b:
            r1 = 1
        L1c:
            boolean r0 = r5.mIsEffectLoaded
            if (r0 == 0) goto L27
            boolean r0 = r5.mIsRecording
            if (r0 == 0) goto L26
            if (r1 == 0) goto L27
        L26:
            r2 = 1
        L27:
            X.W5m r3 = r5.mAudioPlayer
            if (r2 == 0) goto L32
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r5.mAudioServiceController
            if (r0 == 0) goto L32
            r4 = 1
            if (r3 != 0) goto L33
        L32:
            r4 = 0
        L33:
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r5.mAudioServiceController
            if (r0 == 0) goto L3c
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r5.mAudioServiceController
            r0.setPreviewEnabled(r4)
        L3c:
            if (r3 == 0) goto L84
            if (r4 == 0) goto L46
            boolean r0 = r5.mIsMuted
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L4a
        L46:
            r1 = 0
            goto L4a
        L48:
            r1 = 0
            goto L1c
        L4a:
            android.media.AudioTrack r0 = r3.A00     // Catch: java.lang.IllegalStateException -> L50
            r0.setStereoVolume(r1, r1)     // Catch: java.lang.IllegalStateException -> L50
            goto L58
        L50:
            r2 = move-exception
            java.lang.String r1 = "AudioPlayer"
            java.lang.String r0 = "Failed to set volume for AudioPlayer"
            X.C0K8.A0G(r1, r0, r2)
        L58:
            boolean r0 = r3.A05
            if (r0 == r4) goto L84
            if (r4 == 0) goto L81
            android.media.AudioManager r1 = r3.A08     // Catch: java.lang.IllegalStateException -> L78
            boolean r0 = r1.isWiredHeadsetOn()     // Catch: java.lang.IllegalStateException -> L78
            if (r0 != 0) goto L6d
            boolean r0 = r1.isBluetoothA2dpOn()     // Catch: java.lang.IllegalStateException -> L78
            r1 = 0
            if (r0 == 0) goto L6e
        L6d:
            r1 = 1
        L6e:
            com.facebook.cameracore.mediapipeline.services.audio.implementation.MicrophoneSink r0 = r5.mMicrophoneSink     // Catch: java.lang.IllegalStateException -> L78
            boolean r0 = X.AbstractC167007dF.A1W(r0)
            r3.A03(r1, r0)     // Catch: java.lang.IllegalStateException -> L78
            return
        L78:
            r2 = move-exception
            java.lang.Class<com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl> r1 = com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl.class
            java.lang.String r0 = "Exception"
            X.C0K8.A05(r1, r0, r2)
            return
        L81:
            r3.A01()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl.updateAudioPreviewState():void");
    }

    public AudioServiceController createAudioServiceController() {
        if (this.mAudioServiceController == null) {
            this.mAudioServiceController = new AudioServiceController();
        }
        return this.mAudioServiceController;
    }

    public MicrophoneSink createMicrophoneSink() {
        MicrophoneSink microphoneSink = this.mMicrophoneSink;
        if (microphoneSink == null) {
            MicrophoneSink microphoneSink2 = new MicrophoneSink();
            this.mMicrophoneSink = microphoneSink2;
            return microphoneSink2;
        }
        return microphoneSink;
    }

    public void onEffectLoaded(String str, boolean z) {
        C0J8.A04(AudioPlatformComponentHostImpl.class, "%s > onEffectLoaded() > service is not created yet", this.mIsServiceCreated);
        C0J8.A04(AudioPlatformComponentHostImpl.class, "%s > onEffectLoaded() > effect is already loaded", !this.mIsEffectLoaded);
        this.mAudioDecoder = new C68893Vdp();
        C0J8.A04(AudioPlatformComponentHostImpl.class, "%s > isDirectoryPathExistsAndValid() > path is null or empty", !AbstractC116315Ok.A00(str));
        if (!new File(str).isDirectory()) {
            C0K8.A09(AudioPlatformComponentHostImpl.class, "Could not set asset directory, path does not exist or valid: %s", str);
        } else {
            String str2 = File.separator;
            if (!str.endsWith(str2)) {
                str = AnonymousClass001.A0R(str, str2);
            }
            this.mAssetsDirectory = str;
        }
        if (z) {
            this.mAudioInputPreview = new AudioInputPreview(this.mAudioServiceController, (int) getDefaultSampleRate());
            W5m w5m = this.mAudioPlayer;
            this.mAudioPlayer = null;
            if (w5m != null) {
                w5m.A02();
                w5m.A00.release();
            }
            C0J8.A05(this.mAudioInputPreview, "%s > createPreviewPlayer() > mAudioInputPreview is null", AudioPlatformComponentHostImpl.class);
            W5m w5m2 = new W5m(this.mAudioManager, this.mStreamType, this.mAudioLogger);
            AudioInputPreview audioInputPreview = this.mAudioInputPreview;
            int i = this.mDefaultSampleRate;
            audioInputPreview.getClass();
            w5m2.A01 = audioInputPreview;
            try {
                w5m2.A00.setPlaybackRate(i);
            } catch (IllegalStateException e) {
                C0K8.A0G("AudioPlayer", "Failed to set playback rate for AudioPlayer in load()", e);
            }
            this.mAudioPlayer = w5m2;
        }
        this.mIsEffectLoaded = true;
        updateAudioState();
    }

    public void onEffectReleased() {
        if (this.mIsEffectLoaded) {
            this.mIsEffectLoaded = false;
            this.mAssetsDirectory = null;
            updateAudioState();
            W5m w5m = this.mAudioPlayer;
            this.mAudioPlayer = null;
            if (w5m != null) {
                w5m.A02();
                w5m.A00.release();
            }
            C68893Vdp c68893Vdp = this.mAudioDecoder;
            if (c68893Vdp != null) {
                synchronized (c68893Vdp) {
                    c68893Vdp.A01.shutdown();
                }
                this.mAudioDecoder = null;
            }
            AudioInputPreview audioInputPreview = this.mAudioInputPreview;
            if (audioInputPreview != null) {
                audioInputPreview.close();
                this.mAudioInputPreview = null;
            }
            this.mMicrophoneSinkSemaphore.acquireUninterruptibly();
            MicrophoneSink microphoneSink = this.mMicrophoneSink;
            if (microphoneSink != null) {
                microphoneSink.mHybridData.resetNative();
                this.mMicrophoneSink = null;
            }
            this.mMicrophoneSinkSemaphore.release();
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost
    public boolean onInputDataAvailable(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int readCaptureSamples;
        C68680VaG c68680VaG;
        int i5;
        if (this.mIsRecording) {
            if (this.mAudioServiceController == null) {
                C0K8.A03(AudioPlatformComponentHostImpl.class, "Service is already destroyed but buffers are still being pumped through");
            } else {
                if (i4 < 0) {
                    C0K8.A09(AudioPlatformComponentHostImpl.class, "Negative buffer size for input data: %d", AbstractC25228BEl.A1Y(i4));
                    return false;
                }
                if (i4 % 2 > 0) {
                    C0K8.A09(AudioPlatformComponentHostImpl.class, "Odd buffer size for input data: %d", AbstractC25228BEl.A1Y(i4));
                }
                int i6 = (i4 / 2) / i3;
                if (this.mMicrophoneSink != null) {
                    int i7 = i6 * i3;
                    if (this.mInputSamples.length < i7) {
                        this.mInputSamples = new short[i6 * 2];
                    }
                    byteBuffer.order(ByteOrder.nativeOrder());
                    byteBuffer.position(0);
                    byteBuffer.asShortBuffer().get(this.mInputSamples, 0, i7);
                    if (i3 == 2) {
                        short[] sArr = this.mInputSamples;
                        int i8 = 0;
                        while (true) {
                            i5 = i7 / 2;
                            if (i8 >= i5) {
                                break;
                            }
                            sArr[i8] = sArr[i8 * 2];
                            i8++;
                        }
                        while (i5 < i7) {
                            sArr[i5] = 0;
                            i5++;
                        }
                    }
                    if (this.mMicrophoneSinkSemaphore.tryAcquire()) {
                        MicrophoneSink microphoneSink = this.mMicrophoneSink;
                        if (microphoneSink != null) {
                            microphoneSink.write(this.mInputSamples, i6, i);
                        }
                        this.mMicrophoneSinkSemaphore.release();
                    }
                }
                C0J8.A05(this.mRenderCallback, "%s > renderSamples() > mRenderCallback is null", AudioPlatformComponentHostImpl.class);
                if (this.mOutputSamples.length < i6 * i3) {
                    this.mOutputSamples = new short[i6 * 2 * i3];
                }
                if (this.mAudioServiceController != null && (readCaptureSamples = this.mAudioServiceController.readCaptureSamples(this.mOutputSamples, i6, i)) != 0) {
                    int i9 = readCaptureSamples * 2;
                    if (this.mOutputBytes.length < i9) {
                        this.mOutputBytes = new byte[i9 * 2];
                    }
                    if (i3 == 2) {
                        short[] sArr2 = this.mOutputSamples;
                        while (true) {
                            i9--;
                            if (i9 < 0) {
                                break;
                            }
                            sArr2[i9] = sArr2[i9 / 2];
                        }
                    }
                    byteBuffer.clear();
                    byteBuffer.order(ByteOrder.nativeOrder());
                    ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                    int min = Math.min(asShortBuffer.capacity(), readCaptureSamples * i3);
                    if (min > asShortBuffer.capacity() && (c68680VaG = this.mAudioLogger) != null) {
                        c68680VaG.A00.CiR(hashCode(), AbstractC111324zv.A00(4665), "AudioPlatformComponentHostImpl", new HashMap());
                    }
                    asShortBuffer.put(this.mOutputSamples, 0, min);
                    byteBuffer.flip();
                    this.mRenderCallback.onSamplesReady(null, i, i2, i3, min * 2);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void onServiceCreated() {
        C0J8.A04(AudioPlatformComponentHostImpl.class, "%s > onServiceCreated() > service is already created", !this.mIsServiceCreated);
        C0J8.A05(this.mAudioServiceController, "%s > onServiceCreated() > mAudioServiceController is null", AudioPlatformComponentHostImpl.class);
        this.mIsServiceCreated = true;
    }

    public void onServiceDestroyed() {
        if (this.mIsServiceCreated) {
            C0J8.A04(AudioPlatformComponentHostImpl.class, "%s > onServiceDestroyed() > effect is not released yet", !this.mIsEffectLoaded);
            if (this.mAudioServiceController != null) {
                this.mAudioServiceController.mHybridData.resetNative();
            }
            this.mAudioServiceController = null;
            this.mIsServiceCreated = false;
        }
    }

    public void readAudioFile(String str, String str2, String str3) {
        C0J8.A05(this.mAudioDecoder, "%s > readAudioFile() > mAudioDecoder is null", AudioPlatformComponentHostImpl.class);
        if ((str2 != null && !str2.isEmpty()) || (str2 = findAssetPath(str)) != null) {
            C68893Vdp c68893Vdp = this.mAudioDecoder;
            C69052Vgt c69052Vgt = new C69052Vgt(this, str3);
            synchronized (c68893Vdp) {
                ExecutorService executorService = c68893Vdp.A01;
                if (executorService.isShutdown()) {
                    C0K8.A09(AudioPlatformComponentHostImpl.class, "Fail to decode audio file: %s", AnonymousClass001.A0g("Cannot decode file ", str2, ": executor shut down"));
                } else {
                    C70080W1x c70080W1x = c68893Vdp.A00;
                    C69625VsS c69625VsS = new C69625VsS(c69052Vgt, str2);
                    synchronized (c70080W1x) {
                        c70080W1x.A01.add(c69625VsS);
                    }
                    executorService.execute(new RunnableC71237WqS(c68893Vdp));
                }
            }
            return;
        }
        C0K8.A09(AudioPlatformComponentHostImpl.class, "Failed to read audio file: %s", str);
    }

    @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost
    @Deprecated
    public void setMuted(boolean z) {
        this.mIsMuted = z;
        updateAudioPreviewState();
    }

    public AudioPlatformComponentHostImpl(Context context, C69322VlU c69322VlU) {
        HybridData initHybrid = initHybrid();
        this.mHybridData = initHybrid;
        C0J8.A05(initHybrid, "%s > mHybridData is null", AudioPlatformComponentHostImpl.class);
        this.mAudioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        int defaultSampleRate = (int) getDefaultSampleRate();
        this.mDefaultSampleRate = defaultSampleRate;
        this.mMicrophoneSinkSemaphore = new Semaphore(1, true);
        this.mInputSamples = new short[defaultSampleRate];
        this.mOutputSamples = new short[defaultSampleRate];
        this.mOutputBytes = new byte[defaultSampleRate * 2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r2.mIsCaptureEnabled == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateAudioState() {
        /*
            r2 = this;
            r2.updateAudioPreviewState()
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r2.mAudioServiceController
            if (r0 == 0) goto L1a
            boolean r0 = r2.mIsEffectLoaded
            if (r0 == 0) goto L14
            boolean r0 = r2.mIsRecording
            if (r0 == 0) goto L14
            boolean r0 = r2.mIsCaptureEnabled
            r1 = 1
            if (r0 != 0) goto L15
        L14:
            r1 = 0
        L15:
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r2.mAudioServiceController
            r0.setCaptureEnabled(r1)
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl.updateAudioState():void");
    }

    public String findAssetPath(String str) {
        String A0R;
        C0J8.A04(AudioPlatformComponentHostImpl.class, "%s > findAssetPath() > assetName is null or empty", !AbstractC116315Ok.A00(str));
        String str2 = this.mAssetsDirectory;
        C0J8.A05(str2, "%s > findAssetPath() > mAssetsDirectory is null", AudioPlatformComponentHostImpl.class);
        String A0R2 = AnonymousClass001.A0R(str2, str);
        try {
            UtH utH = new UtH(this, new File(str2).getCanonicalPath());
            try {
                C54846OMr c54846OMr = new C54846OMr();
                C14360o3.A0B(A0R2, 0);
                c54846OMr.A05(utH, A0R2);
                c54846OMr.A00();
                return A0R2;
            } catch (SecurityException e) {
                if (e.getMessage() != null) {
                    A0R = e.getMessage();
                } else {
                    A0R = AnonymousClass001.A0R("Asset path does not exist or is invalid: ", A0R2);
                }
                C0K8.A09(AudioPlatformComponentHostImpl.class, A0R, e.getCause(), e);
                return null;
            }
        } catch (IOException unused) {
            C0K8.A09(AudioPlatformComponentHostImpl.class, "Assets directory path does not exist or is invalid: %s", this.mAssetsDirectory);
            return null;
        }
    }

    public int readExternalAudioStream(String str, short[] sArr, int i) {
        C0J8.A04(AudioPlatformComponentHostImpl.class, "%s > readExternalAudioStream() > identifier is null or empty", !AbstractC116315Ok.A00(str));
        InterfaceC189918bA interfaceC189918bA = this.mExternalAudioProvider;
        if (interfaceC189918bA == null) {
            return 0;
        }
        return interfaceC189918bA.E8P(str, sArr, i);
    }

    @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost
    public boolean onInputDataAvailable(byte[] bArr, int i, int i2, int i3, int i4) {
        int readCaptureSamples;
        if (this.mIsRecording) {
            if (this.mAudioServiceController == null) {
                C0K8.A03(AudioPlatformComponentHostImpl.class, "Service is already destroyed but buffers are still being pumped through");
            } else {
                if (i4 < 0) {
                    C0K8.A09(AudioPlatformComponentHostImpl.class, "Negative buffer size for input data: %d", AbstractC25228BEl.A1Y(i4));
                    return false;
                }
                if (i4 % 2 > 0) {
                    C0K8.A09(AudioPlatformComponentHostImpl.class, "Odd buffer size for input data: %d", AbstractC25228BEl.A1Y(i4));
                }
                int i5 = (i4 / 2) / i3;
                if (this.mMicrophoneSink != null) {
                    short[] sArr = this.mInputSamples;
                    if (sArr.length < i5 * i3) {
                        sArr = new short[i5 * 2];
                        this.mInputSamples = sArr;
                    }
                    int i6 = i5 * 2 * i3;
                    C0J8.A06(AbstractC167007dF.A1N(i6 % 2));
                    int i7 = i6 / 2;
                    C0J8.A06(sArr.length >= i7);
                    ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).asShortBuffer().get(sArr, 0, i7);
                    if (i3 == 2) {
                        short[] sArr2 = this.mInputSamples;
                        for (int i8 = 0; i8 < i7; i8++) {
                            sArr2[i8] = sArr2[i8 * 2];
                        }
                        while (i7 < i6) {
                            sArr2[i7] = 0;
                            i7++;
                        }
                    }
                    if (this.mMicrophoneSinkSemaphore.tryAcquire()) {
                        MicrophoneSink microphoneSink = this.mMicrophoneSink;
                        if (microphoneSink != null) {
                            microphoneSink.write(this.mInputSamples, i5, i);
                        }
                        this.mMicrophoneSinkSemaphore.release();
                    }
                }
                C0J8.A05(this.mRenderCallback, "%s > renderSamples() > mRenderCallback is null", AudioPlatformComponentHostImpl.class);
                if (this.mOutputSamples.length < i5 * i3) {
                    this.mOutputSamples = new short[i5 * 2 * i3];
                }
                if (this.mAudioServiceController != null && (readCaptureSamples = this.mAudioServiceController.readCaptureSamples(this.mOutputSamples, i5, i)) != 0) {
                    int i9 = readCaptureSamples * 2;
                    int i10 = i9 * i3;
                    byte[] bArr2 = this.mOutputBytes;
                    if (bArr2.length < i10) {
                        bArr2 = new byte[i10 * 2];
                        this.mOutputBytes = bArr2;
                    }
                    if (i3 == 2) {
                        short[] sArr3 = this.mOutputSamples;
                        while (true) {
                            i9--;
                            if (i9 < 0) {
                                break;
                            }
                            sArr3[i9] = sArr3[i9 / 2];
                        }
                    }
                    short[] sArr4 = this.mOutputSamples;
                    int i11 = readCaptureSamples * i3;
                    C0J8.A06(AbstractC43593JPy.A1Z(bArr2.length, i11 * 2));
                    ByteBuffer.wrap(bArr2).order(ByteOrder.nativeOrder()).asShortBuffer().put(sArr4, 0, i11);
                    this.mRenderCallback.onSamplesReady(this.mOutputBytes, i, i2, i3, i10);
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
