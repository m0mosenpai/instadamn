package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes12.dex */
public final class Y9T implements BET {
    public MediaCodec.BufferInfo A00;
    public MediaCodec A01;
    public MediaFormat A02;
    public final Handler A03;
    public final C175927s7 A04;
    public final C177567uq A05;
    public final InterfaceC178337w7 A06;
    public final C72680Xl1 A07;
    public final AC8 A08;
    public final Runnable A09;
    public final boolean A0A;
    public volatile Integer A0B;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d1, code lost:
    
        r3.A01("pcoAErob");
        r10.A01.releaseOutputBuffer(r6, false);
        r3.A01("pcoAErobs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010f, code lost:
    
        if (r11 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0114, code lost:
    
        r3.A01("pcoAEe4");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011f, code lost:
    
        throw X.AbstractC166987dD.A14("Codec not in End-Of-Stream stage when stopping");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e1, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e2, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0102, code lost:
    
        r3 = r10.A04;
        r3.A01("pcoAEe3");
        r10.A08.A01(r1);
        r9 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.Y9T r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y9T.A00(X.Y9T, boolean):void");
    }

    @Override // X.BET
    public final void COY(byte[] bArr, int i, long j) {
        C175927s7 c175927s7;
        int i2 = i;
        if (Looper.myLooper() == this.A03.getLooper()) {
            if (this.A0B == C05F.A0C) {
                try {
                    c175927s7 = this.A04;
                    c175927s7.A01("idAE");
                    e = null;
                    if (i < 0) {
                        e = AbstractC72046XLm.A0R(AbstractC111324zv.A00(636), new Object[]{Integer.valueOf(i)});
                        i2 = 0;
                    }
                    ByteBuffer[] inputBuffers = this.A01.getInputBuffers();
                    c175927s7.A01("idAEdqb");
                    int dequeueInputBuffer = this.A01.dequeueInputBuffer(this.A05.A04);
                    c175927s7.A01("idAEdqbs");
                    if (dequeueInputBuffer >= 0) {
                        ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                        byteBuffer.clear();
                        byteBuffer.put(bArr, 0, i2);
                        c175927s7.A01("idAEqb");
                        this.A01.queueInputBuffer(dequeueInputBuffer, 0, i2, j, 0);
                        c175927s7.A01("idAEqbs");
                    }
                    A00(this, false);
                    c175927s7.A01("idAEs");
                    if (e == null) {
                        return;
                    }
                } catch (Exception e) {
                    e = e;
                    c175927s7 = this.A04;
                    c175927s7.A01("idAEs");
                } catch (Throwable th) {
                    this.A04.A01("idAEs");
                    throw th;
                }
                c175927s7.A01("idAEe2");
                this.A08.A01(e);
                return;
            }
            return;
        }
        this.A04.A01("idAEe1");
        throw AbstractC166987dD.A14("inputData must be invoked on the same thread as the other methods");
    }

    @Override // X.BET
    public final void Avw(Map map) {
        String A00 = this.A04.A00();
        if (A00 != null) {
            map.put("recording_audio_encoder_calls", A00);
        }
    }

    @Override // X.BET
    public final void E5X(Handler handler, InterfaceC176207sd interfaceC176207sd) {
        this.A04.A01("pAE");
        this.A00 = new MediaCodec.BufferInfo();
        this.A03.post(new YI2(handler, this, interfaceC176207sd));
    }

    @Override // X.BET
    public final void Emt(Handler handler, InterfaceC176207sd interfaceC176207sd) {
        this.A04.A01("stAE");
        this.A03.post(new YI3(handler, this, interfaceC176207sd));
    }

    @Override // X.BET
    public final void EoU(Handler handler, InterfaceC176207sd interfaceC176207sd) {
        this.A04.A01("sAE");
        this.A03.post(new YI4(handler, this, interfaceC176207sd));
    }

    public Y9T(Handler handler, C177567uq c177567uq, InterfaceC178337w7 interfaceC178337w7, C72680Xl1 c72680Xl1, AC8 ac8, boolean z) {
        C175927s7 c175927s7 = new C175927s7();
        this.A04 = c175927s7;
        this.A09 = new YG8(this);
        this.A05 = c177567uq;
        this.A08 = ac8;
        this.A03 = handler;
        this.A06 = interfaceC178337w7;
        this.A0B = C05F.A00;
        this.A07 = c72680Xl1;
        this.A0A = z;
        c175927s7.A01("c");
    }

    @Override // X.InterfaceC25158BBd
    public final MediaFormat BaG() {
        return this.A02;
    }

    @Override // X.BET
    public final void COX(C73493YFw c73493YFw, int i, long j) {
        if (Looper.myLooper() == this.A03.getLooper()) {
            if (this.A0B == C05F.A0C) {
                try {
                    c73493YFw.A00 = i;
                    c73493YFw.A01 = j;
                    c73493YFw.A00();
                    A00(this, false);
                    return;
                } catch (Exception e) {
                    this.A04.A01("idAEe2");
                    this.A08.A01(e);
                    return;
                }
            }
            return;
        }
        this.A04.A01("idAEe1");
        throw AbstractC166987dD.A14("inputData must be invoked on the same thread as the other methods");
    }
}
