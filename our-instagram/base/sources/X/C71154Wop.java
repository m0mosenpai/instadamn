package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Pair;
import com.facebook.cameracore.audio.fbaaudiopostprocessing.AudioPostProcessor;
import com.facebook.jni.HybridData;
import com.facebook.proxygen.TraceFieldType;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Wop, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71154Wop implements InterfaceC71985XDw, InterfaceC71947XBy {
    public long A00;
    public long A01;
    public MediaCodec A02;
    public Exception A03;
    public MediaFormat A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C69267Vkb A09;
    public final C69795Vve A0A;
    public final CountDownLatch A0B = new CountDownLatch(1);
    public final Handler A0C;

    @Override // X.InterfaceC71985XDw
    public final void cancel() {
        this.A05 = true;
    }

    @Override // X.InterfaceC71985XDw
    public final void CqO(long j, long j2) {
        HybridData hybridData;
        this.A00 = 0L;
        this.A01 = j2;
        C69267Vkb c69267Vkb = this.A09;
        if (c69267Vkb.A04) {
            c69267Vkb.A03.processNext();
        }
        try {
            this.A0B.await();
            c69267Vkb.A04 = false;
            AudioPostProcessor audioPostProcessor = c69267Vkb.A03;
            if (audioPostProcessor.mDestructed.compareAndSet(false, true) && (hybridData = audioPostProcessor.mHybridData) != null) {
                hybridData.resetNative();
                audioPostProcessor.mHybridData = null;
            }
            c69267Vkb.A00 = null;
            C0fT.A03(this.A02, -315954667);
            this.A0C.getLooper().quitSafely();
            Exception exc = this.A03;
            if (exc == null) {
            } else {
                throw new RuntimeException(exc);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.InterfaceC71947XBy
    public final void DX8(ByteBuffer byteBuffer, int i, long j) {
        if (!this.A05) {
            this.A0C.post(new RunnableC71580WwX(this, i, j));
        }
    }

    @Override // X.InterfaceC71985XDw
    public final void E5e() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/mp4a-latm");
        mediaFormat.setInteger("aac-profile", 2);
        mediaFormat.setInteger("sample-rate", this.A08);
        mediaFormat.setInteger("channel-count", this.A07);
        mediaFormat.setInteger(TraceFieldType.Bitrate, 64000);
        this.A04 = mediaFormat;
        MediaCodec A02 = C0fT.A02("audio/mp4a-latm", 107985677);
        this.A02 = A02;
        C0fT.A07(A02, null, this.A04, null, 1, 1682380050);
        C0fT.A05(this.A02, 2110769142);
    }

    @Override // X.InterfaceC71947XBy
    public final Pair EJD() {
        ByteBuffer byteBuffer;
        int dequeueInputBuffer = this.A02.dequeueInputBuffer(10000L);
        if (dequeueInputBuffer >= 0) {
            byteBuffer = this.A02.getInputBuffer(dequeueInputBuffer);
        } else {
            this.A03 = new RuntimeException("dequeueInputBuffer timeout");
            this.A0B.countDown();
            byteBuffer = null;
            dequeueInputBuffer = -1;
        }
        return MSY.A0D(byteBuffer, dequeueInputBuffer);
    }

    @Override // X.InterfaceC71985XDw
    public final void EnZ() {
        this.A0A.A02(this.A04);
    }

    public C71154Wop(C69795Vve c69795Vve, float[] fArr, int[] iArr, String[] strArr, int i, int i2) {
        this.A0A = c69795Vve;
        int i3 = i * C3OO.FLAG_MOVED;
        this.A06 = i3;
        this.A07 = i;
        this.A08 = i2;
        C69267Vkb c69267Vkb = new C69267Vkb(i2, 1, i3, i);
        this.A09 = c69267Vkb;
        c69267Vkb.A00 = this;
        int createGraph2 = c69267Vkb.A03.createGraph2(1, strArr, fArr, iArr, new WUJ(c69267Vkb));
        if (createGraph2 != 0 && createGraph2 != 4) {
            c69267Vkb.A04 = false;
        } else {
            c69267Vkb.A04 = true;
        }
        this.A0C = new Handler(AbstractC65702TsY.A0G("video_resize_audio_encoder_thread"));
    }
}
