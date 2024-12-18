package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WZa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70493WZa implements InterfaceC71998XEm {
    public static final ByteBuffer A0K = AbstractC65702TsY.A0j(0);
    public int A00;
    public MediaCodec A01;
    public MediaFormat A02;
    public InterfaceC72006XEu A03;
    public W4V A04;
    public C69751Vul A05;
    public ByteBuffer A06;
    public boolean A08;
    public ByteBuffer[] A09;
    public ByteBuffer[] A0A;
    public C69377VmN A0B;
    public final C69489VoC A0D;
    public final InterfaceC58019Po5 A0E;
    public final X9V A0F;
    public final InterfaceC58105PpU A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;
    public volatile long A0J;
    public final MediaCodec.BufferInfo A0C = new MediaCodec.BufferInfo();
    public ByteBuffer A07 = A0K;

    @Override // X.InterfaceC71998XEm
    public final C54837OLw BQe() {
        return null;
    }

    @Override // X.InterfaceC71998XEm
    public final void EMh(long j) {
        this.A0J = ((float) j) * A01(j);
        MediaCodec mediaCodec = this.A01;
        mediaCodec.getClass();
        mediaCodec.flush();
        this.A07 = A0K;
        this.A0I = false;
        this.A08 = false;
        InterfaceC72006XEu interfaceC72006XEu = this.A03;
        interfaceC72006XEu.getClass();
        interfaceC72006XEu.EMh(this.A0J);
    }

    @Override // X.InterfaceC71998XEm
    public final void FCj(C1125456i c1125456i) {
    }

    @Override // X.InterfaceC71998XEm
    public final void FDy() {
    }

    @Override // X.InterfaceC71998XEm
    public final void cancel() {
        this.A0H = true;
    }

    @Override // X.InterfaceC71998XEm
    public final void start() {
    }

    private float A00(long j) {
        C1125956n A04;
        C69489VoC c69489VoC = this.A0D;
        MediaComposition mediaComposition = c69489VoC.A08;
        if (mediaComposition != null && (A04 = mediaComposition.A04(EnumC1125356h.AUDIO, this.A00)) != null) {
            for (C69688VtY c69688VtY : A04.A05) {
                MediaEffect mediaEffect = c69688VtY.A01;
                if ((mediaEffect instanceof C23502AbI) && c69688VtY.A00.A06(TimeUnit.MICROSECONDS, j, c69489VoC.A0B.A1P())) {
                    return ((C23502AbI) mediaEffect).A00;
                }
            }
        }
        return 1.0f;
    }

    private float A01(long j) {
        C69489VoC c69489VoC = this.A0D;
        MediaComposition mediaComposition = c69489VoC.A08;
        if (mediaComposition != null) {
            C66042Tye c66042Tye = new C66042Tye(mediaComposition, c69489VoC.A0B.A1P());
            c66042Tye.A01(EnumC1125356h.AUDIO, this.A00);
            return c66042Tye.A00(TimeUnit.MICROSECONDS, j);
        }
        return 1.0f;
    }

    @Override // X.InterfaceC71998XEm
    public final void AJ6(int i) {
        this.A00 = i;
        C69377VmN c69377VmN = this.A0B;
        ByteBuffer[] byteBufferArr = c69377VmN.A06;
        ByteBuffer byteBuffer = byteBufferArr[i];
        if (byteBuffer == null) {
            byteBuffer = AbstractC65702TsY.A0j(c69377VmN.A05.A0C.A01 * 1024 * 2);
            byteBufferArr[i] = byteBuffer;
        } else {
            byteBuffer.clear();
        }
        this.A06 = byteBuffer;
        X9V x9v = this.A0F;
        InterfaceC58019Po5 interfaceC58019Po5 = this.A0E;
        InterfaceC58105PpU interfaceC58105PpU = this.A0G;
        C69489VoC c69489VoC = this.A0D;
        InterfaceC72006XEu ALH = x9v.ALH(interfaceC58019Po5, interfaceC58105PpU, c69489VoC.A0B);
        this.A03 = ALH;
        AbstractC69835VwL.A01(ALH, c69489VoC);
        this.A03.EMw(EnumC1125356h.AUDIO, this.A00);
        MediaFormat Bq7 = this.A03.Bq7();
        Bq7.getClass();
        String string = Bq7.getString("mime");
        string.getClass();
        this.A01 = C0fT.A01(string, 129937957);
        if (Bq7.containsKey("encoder-delay") && Bq7.getInteger("encoder-delay") > 10000) {
            Bq7.setInteger("encoder-delay", 0);
        }
        C0fT.A07(this.A01, null, Bq7, null, 0, -1492752540);
        C0fT.A05(this.A01, -1385643788);
        this.A09 = this.A01.getInputBuffers();
        this.A0A = this.A01.getOutputBuffers();
    }

    @Override // X.InterfaceC71998XEm
    public final long AO3() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [X.Vul, java.lang.Object] */
    @Override // X.InterfaceC71998XEm
    public final void AO4(long j) {
        W4V w4v;
        this.A06.getClass();
        this.A06.clear();
        while (this.A06.hasRemaining() && !this.A08) {
            int min = Math.min(this.A06.remaining(), this.A07.remaining());
            if (min > 0) {
                ByteBuffer duplicate = this.A07.duplicate();
                duplicate.limit(duplicate.position() + min);
                this.A06.put(duplicate);
                AbstractC58319PtB.A1L(this.A07, min);
            } else {
                if (!this.A08) {
                    this.A01.getClass();
                    MediaCodec mediaCodec = this.A01;
                    MediaCodec.BufferInfo bufferInfo = this.A0C;
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    if (dequeueOutputBuffer >= 0) {
                        if ((bufferInfo.flags & 4) != 0) {
                            this.A08 = true;
                            C69751Vul c69751Vul = this.A05;
                            if (c69751Vul != null) {
                                c69751Vul.A01();
                            }
                        } else {
                            ByteBuffer[] byteBufferArr = this.A0A;
                            byteBufferArr.getClass();
                            ByteBuffer byteBuffer = byteBufferArr[dequeueOutputBuffer];
                            AbstractC50522MSa.A0v(bufferInfo, byteBuffer);
                            C69751Vul c69751Vul2 = this.A05;
                            c69751Vul2.getClass();
                            c69751Vul2.A02(byteBuffer);
                            C69751Vul c69751Vul3 = this.A05;
                            c69751Vul3.getClass();
                            ByteBuffer A00 = c69751Vul3.A00();
                            W4V w4v2 = this.A04;
                            if (w4v2 != null) {
                                w4v2.A00(A00);
                                W4V w4v3 = this.A04;
                                A00 = w4v3.A02;
                                w4v3.A02 = w4v3.A00;
                            }
                            this.A07 = A00;
                            this.A01.releaseOutputBuffer(dequeueOutputBuffer, false);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.A0A = this.A01.getOutputBuffers();
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.A01.getOutputFormat();
                        this.A02 = outputFormat;
                        outputFormat.getClass();
                        int integer = outputFormat.getInteger("channel-count");
                        C70087W2j c70087W2j = this.A0D.A0C;
                        int i = c70087W2j.A01;
                        if (integer != i) {
                            w4v = new W4V(integer, i);
                        } else {
                            w4v = null;
                        }
                        this.A04 = w4v;
                        MediaFormat mediaFormat = this.A02;
                        mediaFormat.getClass();
                        int integer2 = mediaFormat.getInteger("sample-rate");
                        MediaFormat mediaFormat2 = this.A02;
                        mediaFormat2.getClass();
                        int integer3 = mediaFormat2.getInteger("channel-count");
                        int i2 = c70087W2j.A04;
                        ByteBuffer byteBuffer2 = C69751Vul.A02;
                        float A01 = A01(0L);
                        float A002 = A00(0L);
                        ?? obj = new Object();
                        obj.A01 = C69751Vul.A02;
                        obj.A00 = new C70192WFv(A01, A002, integer2, integer3, i2);
                        this.A05 = obj;
                    }
                }
                while (true) {
                    if (!this.A0I && !this.A0H) {
                        this.A01.getClass();
                        this.A03.getClass();
                        int dequeueInputBuffer = this.A01.dequeueInputBuffer(0L);
                        if (dequeueInputBuffer >= 0) {
                            ByteBuffer[] byteBufferArr2 = this.A09;
                            byteBufferArr2.getClass();
                            int E8N = this.A03.E8N(byteBufferArr2[dequeueInputBuffer]);
                            if (E8N <= 0) {
                                this.A01.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                this.A0I = true;
                                break;
                            } else {
                                int Bq6 = this.A03.Bq6();
                                this.A01.queueInputBuffer(dequeueInputBuffer, 0, E8N, this.A03.Bq8(), Bq6);
                                this.A03.AAz();
                            }
                        }
                    }
                }
            }
        }
        C69751Vul c69751Vul4 = this.A05;
        if (c69751Vul4 != null) {
            c69751Vul4.A00.A00 = A00(j);
        }
        while (true) {
            int position = this.A06.position();
            int limit = this.A06.limit();
            ByteBuffer byteBuffer3 = this.A06;
            if (position < limit) {
                byteBuffer3.put((byte) 0);
            } else {
                byteBuffer3.flip();
                return;
            }
        }
    }

    @Override // X.InterfaceC71998XEm
    public final long Aw1() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC71998XEm
    public final boolean CSP() {
        return this.A08;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.VIr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.VIr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Tyj, java.lang.Object] */
    @Override // X.InterfaceC71998XEm
    public final void release() {
        ?? obj = new Object();
        C67628Uti c67628Uti = new C67628Uti(this.A01, (C66046Tyj) obj);
        new Object().A00 = c67628Uti;
        c67628Uti.A00();
        C67628Uti c67628Uti2 = new C67628Uti((C66046Tyj) obj, this.A03);
        new Object().A00 = c67628Uti2;
        c67628Uti2.A00();
        obj.A01();
        this.A06 = null;
        this.A01 = null;
    }

    public C70493WZa(C69377VmN c69377VmN, InterfaceC58019Po5 interfaceC58019Po5, X9V x9v, InterfaceC58105PpU interfaceC58105PpU, C69489VoC c69489VoC) {
        this.A0D = c69489VoC;
        this.A0B = c69377VmN;
        this.A0F = x9v;
        this.A0E = interfaceC58019Po5;
        this.A0G = interfaceC58105PpU;
    }
}
