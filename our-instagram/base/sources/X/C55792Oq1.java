package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid;
import java.nio.ByteBuffer;

/* renamed from: X.Oq1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55792Oq1 implements InterfaceC58107PpW {
    public long A00;
    public final int A01;
    public final Object A02;

    public C55792Oq1(Object obj, int i) {
        this.A01 = i;
        this.A02 = obj;
    }

    @Override // X.InterfaceC58107PpW
    public final void D5h(ByteBuffer byteBuffer) {
        C54845OMq c54845OMq;
        if (this.A01 != 0) {
            C14360o3.A0B(byteBuffer, 0);
            C55139Oc7 c55139Oc7 = (C55139Oc7) this.A02;
            if (c55139Oc7.A0F == C05F.A0C) {
                c55139Oc7.A0K = true;
                c55139Oc7.A0P.compareAndSet(false, true);
                AndroidPlatformVideoEncoderHybrid androidPlatformVideoEncoderHybrid = c55139Oc7.A0N;
                int position = byteBuffer.position();
                int remaining = byteBuffer.remaining();
                MediaFormat mediaFormat = c55139Oc7.A07;
                if (mediaFormat == null) {
                    MediaCodec mediaCodec = c55139Oc7.A06;
                    if (mediaCodec != null) {
                        mediaFormat = mediaCodec.getOutputFormat();
                    } else {
                        mediaFormat = null;
                    }
                }
                androidPlatformVideoEncoderHybrid.onEncoded(byteBuffer, position, remaining, 0L, 0L, 2, mediaFormat, true, 0, 0, 0);
                return;
            }
            C54845OMq c54845OMq2 = c55139Oc7.A0D;
            if (c54845OMq2 == null) {
                return;
            }
            c54845OMq2.A0I = byteBuffer;
            return;
        }
        C14360o3.A0B(byteBuffer, 0);
        C55073OaT c55073OaT = (C55073OaT) this.A02;
        if (c55073OaT.A04 != null && (c54845OMq = c55073OaT.A07) != null && c54845OMq.A0B.Cfn()) {
            c55073OaT.A09 = true;
            C55073OaT.A01(c55073OaT, byteBuffer, 2, 0L);
        } else {
            C54845OMq c54845OMq3 = c55073OaT.A07;
            if (c54845OMq3 == null) {
                return;
            }
            c54845OMq3.A0H = byteBuffer;
        }
    }

    @Override // X.InterfaceC58107PpW
    public final void DIL(InterfaceC57803PkV interfaceC57803PkV) {
        C51769MuZ c51769MuZ;
        long A0L;
        ByteBuffer byteBuffer;
        C51770Mua c51770Mua;
        if (this.A01 != 0) {
            C55139Oc7 c55139Oc7 = (C55139Oc7) this.A02;
            if (c55139Oc7.A0F == C05F.A0C && c55139Oc7.A0K && (interfaceC57803PkV instanceof C51770Mua) && (c51770Mua = (C51770Mua) interfaceC57803PkV) != null) {
                A0L = c51770Mua.A04;
                if (A0L > this.A00 || c51770Mua.A00 != 0) {
                    C176537tB c176537tB = c55139Oc7.A0C;
                    if (c176537tB == null) {
                        c176537tB = new C176537tB();
                    }
                    c55139Oc7.A0C = c176537tB;
                    if (A0L > 0) {
                        if (c176537tB != null) {
                            A0L = c176537tB.A00(A0L);
                        }
                        A0L = AbstractC166987dD.A0L(A0L);
                    }
                    ByteBuffer byteBuffer2 = c51770Mua.A05;
                    int i = c51770Mua.A00;
                    int i2 = c51770Mua.A01;
                    int i3 = c51770Mua.A03;
                    int i4 = c51770Mua.A02;
                    AndroidPlatformVideoEncoderHybrid androidPlatformVideoEncoderHybrid = c55139Oc7.A0N;
                    int position = byteBuffer2.position();
                    int remaining = byteBuffer2.remaining();
                    MediaFormat mediaFormat = c55139Oc7.A07;
                    if (mediaFormat == null) {
                        MediaCodec mediaCodec = c55139Oc7.A06;
                        if (mediaCodec != null) {
                            mediaFormat = mediaCodec.getOutputFormat();
                        } else {
                            mediaFormat = null;
                        }
                    }
                    androidPlatformVideoEncoderHybrid.onEncoded(byteBuffer2, position, remaining, A0L, A0L, i, mediaFormat, true, i2, i3, i4);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            C55073OaT c55073OaT = (C55073OaT) this.A02;
            C54845OMq c54845OMq = c55073OaT.A07;
            if (c54845OMq == null || !c54845OMq.A0B.Cfn()) {
                return;
            }
            if (!c55073OaT.A09 && (byteBuffer = c54845OMq.A0H) != null) {
                D5h(byteBuffer);
            }
            if (!(interfaceC57803PkV instanceof C51769MuZ) || (c51769MuZ = (C51769MuZ) interfaceC57803PkV) == null || !c55073OaT.A09) {
                return;
            }
            long j = c51769MuZ.A00;
            if (j <= this.A00) {
                return;
            }
            ByteBuffer byteBuffer3 = c51769MuZ.A01;
            A0L = AbstractC166987dD.A0L(j);
            C55073OaT.A01(c55073OaT, byteBuffer3, 0, A0L);
        }
        this.A00 = A0L;
    }

    @Override // X.InterfaceC58107PpW
    public final void Dxc(InterfaceC16660sJ interfaceC16660sJ) {
    }
}
