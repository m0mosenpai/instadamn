package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public final class AVF implements BDY {
    public final Handler A02;
    public final C177547uo A03;
    public final /* synthetic */ AVC A06;
    public final AudioRenderCallback A04 = new AudioRenderCallback() { // from class: X.9Y7
        @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback
        public final void onSamplesReady(byte[] bArr, int i, int i2, int i3, int i4) {
            AVF avf = AVF.this;
            if (!avf.A05 && Looper.myLooper() == avf.A02.getLooper()) {
                AVC avc = avf.A06;
                AH7 ah7 = avc.A0B;
                if (ah7 != null) {
                    ah7.A09 = true;
                }
                AC7 ac7 = avc.A0C;
                if (ac7 != null) {
                    ac7.A01(bArr, i4);
                }
                avf.A01();
                int length = avc.A01.length;
                if (i4 > length) {
                    ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).limit(i4);
                    while (byteBuffer.position() < i4) {
                        int min = Math.min(i4 - byteBuffer.position(), length);
                        byteBuffer.get(avc.A01, 0, min);
                        AVF.A00(avf, avc.A01, i, min);
                    }
                    return;
                }
                AVF.A00(avf, bArr, i, i4);
            }
        }
    };
    public volatile boolean A05 = false;
    public long A00 = 0;
    public long A01 = 0;

    public AVF(Handler handler, C177547uo c177547uo, AVC avc) {
        this.A06 = avc;
        this.A03 = c177547uo;
        this.A02 = handler;
    }

    public static void A00(AVF avf, byte[] bArr, int i, int i2) {
        if (!avf.A05) {
            C176217se c176217se = avf.A06.A0D;
            if (c176217se != null) {
                c176217se.A02(bArr, i2, avf.A00);
            }
            if (i2 > 0) {
                C177547uo c177547uo = avf.A03;
                avf.A00 += AMJ.A01(c177547uo.A02, Integer.bitCount(c177547uo.A01), i2, i);
            }
        }
    }

    public final void A01() {
        AH7 ah7 = this.A06.A0B;
        if (ah7 != null && this.A01 > 0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - this.A01;
            ah7.A07 += elapsedRealtimeNanos;
            if (elapsedRealtimeNanos > ah7.A0C) {
                ah7.A01++;
            }
        }
    }

    public final void A02(C73493YFw c73493YFw, int i) {
        if (!this.A05) {
            C176217se c176217se = this.A06.A0D;
            if (c176217se != null) {
                c176217se.A01(c73493YFw, i, this.A00);
            }
            if (i > 0) {
                C177547uo c177547uo = this.A03;
                this.A00 += AMJ.A01(c177547uo.A02, Integer.bitCount(c177547uo.A01), i, c177547uo.A04);
            }
        }
    }

    @Override // X.BDY
    public final void D9B(final C73493YFw c73493YFw, int i) {
        AudioPlatformComponentHost A00;
        Boolean bool;
        if (!this.A05) {
            AVC avc = this.A06;
            AH7 ah7 = avc.A0B;
            if (ah7 != null) {
                AH7.A00(ah7);
            }
            this.A01 = SystemClock.elapsedRealtimeNanos();
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A02;
            if (myLooper == handler.getLooper()) {
                C179537y3 c179537y3 = (C179537y3) avc.A05.get();
                if (c179537y3 != null && (A00 = c179537y3.A00()) != null && (((bool = (Boolean) avc.A06.get(A00)) != null && bool.booleanValue()) || AVC.A00(avc))) {
                    ByteBuffer byteBuffer = c73493YFw.A02;
                    if (avc.A02.length != byteBuffer.capacity()) {
                        avc.A02 = new byte[byteBuffer.capacity()];
                    }
                    byteBuffer.get(avc.A02);
                    ((AudioPlatformComponentHostImpl) A00).mRenderCallback = new AudioRenderCallback(c73493YFw, this) { // from class: X.9Y9
                        public final C73493YFw A00;
                        public final /* synthetic */ AVF A01;

                        {
                            this.A01 = this;
                            this.A00 = c73493YFw;
                        }

                        @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback
                        public final void onSamplesReady(byte[] bArr, int i2, int i3, int i4, int i5) {
                            AVF avf = this.A01;
                            if (!avf.A05 && Looper.myLooper() == avf.A02.getLooper()) {
                                AVC avc2 = avf.A06;
                                AH7 ah72 = avc2.A0B;
                                if (ah72 != null) {
                                    ah72.A09 = true;
                                }
                                AC7 ac7 = avc2.A0C;
                                if (ac7 != null) {
                                    ac7.A01(bArr, i5);
                                }
                                avf.A01();
                                C73493YFw c73493YFw2 = this.A00;
                                ByteBuffer byteBuffer2 = c73493YFw2.A02;
                                byteBuffer2.clear();
                                int min = Math.min(byteBuffer2.capacity(), i5);
                                if (i5 > min) {
                                    avc2.A04.ClA(new C212399b8(AnonymousClass001.A0g("Received too many bytes from AR Engine; dropped ", Integer.toString(i5 - min), "bytes")), "inprogress_recording_audio_failure", "LegacyAudioPipeline", "", "high", "onSamplesReady", AbstractC166987dD.A0M(avc2));
                                }
                                byteBuffer2.put(bArr, 0, min);
                                byteBuffer2.flip();
                                avf.A02(c73493YFw2, i5);
                            }
                        }
                    };
                    byte[] bArr = avc.A02;
                    C177547uo c177547uo = this.A03;
                    if (A00.onInputDataAvailable(bArr, c177547uo.A04, c177547uo.A02, Integer.bitCount(c177547uo.A01), i)) {
                        return;
                    }
                }
                A01();
                A02(c73493YFw, i);
                return;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("onDataAvailable() must be invoked on the same thread as the other methods. Looper: ");
            A1C.append(Looper.myLooper());
            A1C.append(" Expected: ");
            throw AbstractC166987dD.A14(AbstractC166997dE.A0v(handler.getLooper(), A1C));
        }
    }

    @Override // X.BDY
    public final void D9C(byte[] bArr, int i) {
        AudioPlatformComponentHost A00;
        Boolean bool;
        if (!this.A05) {
            AVC avc = this.A06;
            AH7 ah7 = avc.A0B;
            if (ah7 != null) {
                AH7.A00(ah7);
            }
            this.A01 = SystemClock.elapsedRealtimeNanos();
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A02;
            if (myLooper == handler.getLooper()) {
                C179537y3 c179537y3 = (C179537y3) avc.A05.get();
                if (c179537y3 != null && (A00 = c179537y3.A00()) != null && (((bool = (Boolean) avc.A06.get(A00)) != null && bool.booleanValue()) || AVC.A00(avc))) {
                    ((AudioPlatformComponentHostImpl) A00).mRenderCallback = this.A04;
                    C177547uo c177547uo = this.A03;
                    if (A00.onInputDataAvailable(bArr, c177547uo.A04, c177547uo.A02, Integer.bitCount(c177547uo.A01), i)) {
                        return;
                    }
                }
                AC7 ac7 = avc.A0C;
                if (ac7 != null) {
                    ac7.A01(bArr, i);
                }
                A01();
                A00(this, bArr, this.A03.A04, i);
                return;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("onDataAvailable() must be invoked on the same thread as the other methods. Looper: ");
            A1C.append(Looper.myLooper());
            A1C.append(" Expected: ");
            throw AbstractC166987dD.A14(AbstractC166997dE.A0v(handler.getLooper(), A1C));
        }
    }

    @Override // X.BDY
    public final void DE6(C212399b8 c212399b8) {
        C176217se c176217se = this.A06.A0D;
        if (c176217se != null) {
            c176217se.A00(c212399b8);
        }
    }

    @Override // X.BDY
    public final void DHP() {
        this.A06.A04.Ckz(19, "recording_start_audio_first_received");
    }
}
