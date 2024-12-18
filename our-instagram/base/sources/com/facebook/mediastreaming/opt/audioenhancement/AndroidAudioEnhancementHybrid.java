package com.facebook.mediastreaming.opt.audioenhancement;

import X.C00O;
import X.C09170dP;
import X.C0K8;
import X.C14360o3;
import X.C3OO;
import X.C72554XgR;
import X.C72679Xkz;
import X.C72815Xne;
import X.MSV;
import X.Xnb;
import X.YGJ;
import X.YGK;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioTrack;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class AndroidAudioEnhancementHybrid extends StreamingHybridClassBase {
    public static final C72554XgR Companion = new Object();
    public final Xnb playbackImpl;
    public final C72815Xne recordingImpl;
    public final C72679Xkz tempFileManager;

    public native void onPlaybackData(ByteBuffer byteBuffer, int i, boolean z);

    public native void onPlaybackPlayCompleted();

    public native void onRecordingCompleted();

    public final void playbackPlay(ByteBuffer byteBuffer, int i, boolean z) {
        AudioTrack audioTrack;
        C14360o3.A0B(byteBuffer, 0);
        Xnb xnb = this.playbackImpl;
        AudioTrack audioTrack2 = xnb.A02;
        if (audioTrack2 != null) {
            audioTrack2.write(byteBuffer, i, 0);
        }
        if (z && (audioTrack = xnb.A02) != null) {
            audioTrack.stop();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XgR, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming");
    }

    public final void playbackReset() {
        ByteBuffer byteBuffer = this.playbackImpl.A04;
        if (byteBuffer == null) {
            C14360o3.A0F("fileData");
            throw C00O.createAndThrow();
        }
        byteBuffer.position(0);
    }

    public final void playbackSetup(int i, boolean z) {
        Xnb xnb = this.playbackImpl;
        xnb.A01 = i;
        int i2 = 1;
        if (z) {
            i2 = 2;
        }
        xnb.A00 = i2;
        try {
            AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
            AudioFormat.Builder encoding = new AudioFormat.Builder().setSampleRate(xnb.A01).setEncoding(2);
            int i3 = 4;
            if (z) {
                i3 = 12;
            }
            xnb.A02 = new AudioTrack(build, encoding.setChannelMask(i3).build(), C3OO.FLAG_MOVED, 1, 0);
        } catch (IllegalArgumentException e) {
            C0K8.A0G("mss:AndroidAudioEnhancementPlaybackImpl", "AudioTrack creation fails", e);
        }
        try {
            File file = xnb.A07.A00;
            if (file != null) {
                byte[] bArr = new byte[(int) file.length()];
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(bArr);
                fileInputStream.close();
                xnb.A04 = ByteBuffer.wrap(bArr);
                return;
            }
            throw new IOException();
        } catch (FileNotFoundException e2) {
            C0K8.A0G("mss:AndroidAudioEnhancementPlaybackImpl", "File not found", e2);
        } catch (IOException | NullPointerException e3) {
            C0K8.A0G("mss:AndroidAudioEnhancementPlaybackImpl", "File does not exist", e3);
        }
    }

    public final void playbackStart() {
        Xnb xnb = this.playbackImpl;
        if (xnb.A04 == null) {
            C0K8.A0C("mss:AndroidAudioEnhancementPlaybackImpl", "File data buffer is not initialized");
            return;
        }
        if (!xnb.A09.compareAndSet(false, true)) {
            return;
        }
        AudioTrack audioTrack = xnb.A02;
        if (audioTrack != null) {
            audioTrack.play();
        }
        Thread thread = new Thread(new YGJ(xnb), "prelive_audio_file_reading");
        xnb.A03 = thread;
        thread.start();
    }

    public final void playbackStop() {
        Xnb xnb = this.playbackImpl;
        xnb.A09.set(false);
        Thread thread = xnb.A03;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                C0K8.A0G("mss:AndroidAudioEnhancementPlaybackImpl", MSV.A00(827), e);
            }
        }
        xnb.A03 = null;
        AudioTrack audioTrack = xnb.A02;
        if (audioTrack != null) {
            audioTrack.stop();
        }
    }

    public final void recordingReset() {
        C72679Xkz c72679Xkz = this.tempFileManager;
        try {
            File file = c72679Xkz.A00;
            if (file != null) {
                file.delete();
            }
        } catch (SecurityException e) {
            C0K8.A0G("mss:AudioEnhancementTempFileManager", "Security manager does not allow a file to be deleted", e);
        }
        c72679Xkz.A00 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[Catch: IOException -> 0x0056, TRY_LEAVE, TryCatch #1 {IOException -> 0x0056, blocks: (B:6:0x0019, B:8:0x001d, B:9:0x0032, B:11:0x0036, B:21:0x0050, B:22:0x0055, B:26:0x002f), top: B:5:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: IOException -> 0x0056, TRY_ENTER, TryCatch #1 {IOException -> 0x0056, blocks: (B:6:0x0019, B:8:0x001d, B:9:0x0032, B:11:0x0036, B:21:0x0050, B:22:0x0055, B:26:0x002f), top: B:5:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void recordingSetup(int r11, boolean r12, double r13) {
        /*
            r10 = this;
            X.Xne r3 = r10.recordingImpl
            java.lang.String r2 = "mss:AndroidAudioEnhancementRecordingImpl"
            r3.A03 = r11
            r0 = 16
            if (r12 == 0) goto Lc
            r0 = 12
        Lc:
            r3.A02 = r0
            r8 = 2
            int r0 = android.media.AudioRecord.getMinBufferSize(r11, r0, r8)
            int r0 = r0 * 2
            r3.A01 = r0
            r3.A00 = r13
            X.Xkz r5 = r3.A09     // Catch: java.io.IOException -> L56
            java.lang.String r4 = "mss:AudioEnhancementTempFileManager"
            java.lang.String r1 = ".ae_pre_live_rec_"
            java.lang.String r0 = ".pcm"
            java.io.File r0 = java.io.File.createTempFile(r1, r0)     // Catch: java.io.IOException -> L28 java.lang.SecurityException -> L2c java.io.IOException -> L56
            r5.A00 = r0     // Catch: java.io.IOException -> L28 java.lang.SecurityException -> L2c java.io.IOException -> L56
            goto L32
        L28:
            r1 = move-exception
            java.lang.String r0 = "File could not be created"
            goto L2f
        L2c:
            r1 = move-exception
            java.lang.String r0 = "Security manager does not allow a file to be created"
        L2f:
            X.C0K8.A0G(r4, r0, r1)     // Catch: java.io.IOException -> L56
        L32:
            java.io.File r1 = r5.A00     // Catch: java.io.IOException -> L56
            if (r1 == 0) goto L50
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L56
            r0.<init>(r1)     // Catch: java.io.IOException -> L56
            r3.A05 = r0     // Catch: java.io.IOException -> L56
            r5 = 1
            int r6 = r3.A03     // Catch: java.lang.IllegalArgumentException -> L4c
            int r7 = r3.A02     // Catch: java.lang.IllegalArgumentException -> L4c
            int r9 = r3.A01     // Catch: java.lang.IllegalArgumentException -> L4c
            android.media.AudioRecord r4 = new android.media.AudioRecord     // Catch: java.lang.IllegalArgumentException -> L4c
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalArgumentException -> L4c
            r3.A04 = r4     // Catch: java.lang.IllegalArgumentException -> L4c
            return
        L4c:
            r1 = move-exception
            java.lang.String r0 = "Audio Record setup illegal argument exception"
            goto L59
        L50:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L56
            r0.<init>()     // Catch: java.io.IOException -> L56
            throw r0     // Catch: java.io.IOException -> L56
        L56:
            r1 = move-exception
            java.lang.String r0 = "File is not created"
        L59:
            X.C0K8.A0G(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.audioenhancement.AndroidAudioEnhancementHybrid.recordingSetup(int, boolean, double):void");
    }

    public final void recordingStart() {
        C72815Xne c72815Xne = this.recordingImpl;
        if (c72815Xne.A05 == null) {
            C0K8.A0C("mss:AndroidAudioEnhancementRecordingImpl", "Output stream is not initialized");
        } else {
            if (!c72815Xne.A0A.compareAndSet(false, true)) {
                return;
            }
            Thread thread = new Thread(new YGK(c72815Xne), "prelive_audio_recording");
            c72815Xne.A06 = thread;
            thread.start();
        }
    }

    public final void recordingStop() {
        C72815Xne c72815Xne = this.recordingImpl;
        AudioRecord audioRecord = c72815Xne.A04;
        if (audioRecord != null) {
            audioRecord.release();
        }
        c72815Xne.A0A.set(false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.Xkz] */
    public AndroidAudioEnhancementHybrid(HybridData hybridData) {
        super(hybridData);
        ?? obj = new Object();
        this.tempFileManager = obj;
        this.playbackImpl = new Xnb(this, obj);
        this.recordingImpl = new C72815Xne(this, obj);
    }
}
