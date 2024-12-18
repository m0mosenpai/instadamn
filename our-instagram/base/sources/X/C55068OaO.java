package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.view.Surface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.OaO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55068OaO {
    public int A01;
    public MediaCodec.BufferInfo A03;
    public MediaCodec A04;
    public MediaMuxer A05;
    public UME A06;
    public C69722VuH A07;
    public boolean A08;
    public int A02 = 720;
    public int A00 = 1280;
    public final HandlerThread A09 = MSY.A0A("photo_video_transcode");

    public static final void A01(C55068OaO c55068OaO, String str, int i, int i2) {
        Surface surface;
        int A0A = AbstractC166987dD.A0A(i * i2 * 30 * 2, 0.07f);
        c55068OaO.A03 = new MediaCodec.BufferInfo();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", c55068OaO.A02, c55068OaO.A00);
        C14360o3.A07(createVideoFormat);
        AbstractC50522MSa.A0w(createVideoFormat, A0A, 30);
        createVideoFormat.setInteger("i-frame-interval", 10);
        createVideoFormat.toString();
        try {
            c55068OaO.A04 = C0fT.A02("video/avc", 1747943343);
        } catch (IOException e) {
            C0K8.A05(C55068OaO.class, "createEncoderByType", e);
        }
        MediaCodec mediaCodec = c55068OaO.A04;
        if (mediaCodec != null) {
            C0fT.A07(mediaCodec, null, createVideoFormat, null, 1, 298673247);
        }
        MediaCodec mediaCodec2 = c55068OaO.A04;
        if (mediaCodec2 != null) {
            surface = mediaCodec2.createInputSurface();
        } else {
            surface = null;
        }
        c55068OaO.A06 = new UME(surface);
        try {
            MediaMuxer mediaMuxer = new MediaMuxer(str, 0);
            c55068OaO.A05 = mediaMuxer;
            mediaMuxer.setOrientationHint(0);
            c55068OaO.A01 = -1;
            c55068OaO.A08 = false;
        } catch (IOException e2) {
            throw new RuntimeException("MediaMuxer creation failed", e2);
        }
    }

    public static final void A00(C55068OaO c55068OaO) {
        MediaCodec mediaCodec = c55068OaO.A04;
        if (mediaCodec != null) {
            try {
                C0fT.A06(mediaCodec, -620962105);
                MediaCodec mediaCodec2 = c55068OaO.A04;
                if (mediaCodec2 != null) {
                    C0fT.A03(mediaCodec2, -11211751);
                }
            } catch (IllegalStateException e) {
                C0K8.A05(C55068OaO.class, "encoder was not in the correct state", e);
            }
            c55068OaO.A04 = null;
        }
        C69722VuH c69722VuH = c55068OaO.A07;
        if (c69722VuH != null) {
            c69722VuH.A00();
            c55068OaO.A07 = null;
        }
        UME ume = c55068OaO.A06;
        if (ume != null) {
            ume.release();
            c55068OaO.A06 = null;
        }
        MediaMuxer mediaMuxer = c55068OaO.A05;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            MediaMuxer mediaMuxer2 = c55068OaO.A05;
            if (mediaMuxer2 != null) {
                mediaMuxer2.release();
            }
            c55068OaO.A05 = null;
        }
    }

    public final void A02(Bitmap bitmap, String str, float f, int i, int i2) {
        ArrayList A0z = AbstractC31174DnI.A0z(bitmap);
        this.A02 = i;
        this.A00 = i2;
        try {
            A01(this, str, i, i2);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicReference atomicReference = new AtomicReference();
            HandlerThread handlerThread = this.A09;
            handlerThread.start();
            Mb7 mb7 = new Mb7(this, countDownLatch, atomicReference);
            MediaCodec mediaCodec = this.A04;
            if (mediaCodec != null) {
                mediaCodec.setCallback(mb7, MSY.A09(handlerThread));
            }
            MediaCodec mediaCodec2 = this.A04;
            if (mediaCodec2 != null) {
                C0fT.A05(mediaCodec2, -725204566);
            }
            UME ume = this.A06;
            if (ume != null) {
                ume.A00();
            }
            this.A07 = new C69722VuH(this.A02, this.A00);
            int size = A0z.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Bitmap bitmap2 = (Bitmap) A0z.get(i4);
                if (bitmap2 != null && this.A07 != null) {
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                }
                int i5 = (int) (30.0f * f);
                for (int i6 = 0; i6 < i5; i6++) {
                    C69722VuH c69722VuH = this.A07;
                    if (c69722VuH != null) {
                        c69722VuH.A01();
                    }
                    UME ume2 = this.A06;
                    if (ume2 != null) {
                        EGLExt.eglPresentationTimeANDROID(ume2.A01, ume2.A02, ((i3 + i6) * 1000000000) / 30);
                    }
                    UME ume3 = this.A06;
                    if (ume3 != null) {
                        EGL14.eglSwapBuffers(ume3.A01, ume3.A02);
                    }
                }
                i3 += i5;
            }
            MediaCodec mediaCodec3 = this.A04;
            if (mediaCodec3 != null) {
                mediaCodec3.signalEndOfInputStream();
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                atomicReference.set(e);
            }
            if (atomicReference.get() == null) {
                handlerThread.quitSafely();
                A00(this);
                return;
            }
            throw new RuntimeException((Throwable) atomicReference.get());
        } catch (Throwable th) {
            this.A09.quitSafely();
            A00(this);
            throw th;
        }
    }
}
