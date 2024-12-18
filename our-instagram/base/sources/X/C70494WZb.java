package X;

import android.content.Context;
import android.media.MediaCodec;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.WZb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70494WZb implements InterfaceC72000XEo {
    public final Context A00;
    public final MediaCodec.BufferInfo A01;
    public final InterfaceC58019Po5 A02;
    public final C70129W5q A03;
    public final InterfaceC71993XEh A04;
    public final C69489VoC A05;
    public final ByteBuffer A06;
    public final ExecutorService A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A = new byte[7];
    public volatile C69521Vqk A0B;
    public volatile boolean A0C;
    public volatile Future A0D;

    @Override // X.InterfaceC72000XEo
    public final void A8L(MediaEffect mediaEffect, int i) {
    }

    @Override // X.InterfaceC72000XEo
    public final void AAf(int i) {
    }

    @Override // X.InterfaceC72000XEo
    public final void APt(long j) {
    }

    @Override // X.InterfaceC72000XEo
    public final void EFF(MediaEffect mediaEffect, int i) {
    }

    @Override // X.InterfaceC72000XEo
    public final void EGU(int i) {
    }

    @Override // X.InterfaceC72000XEo
    public final void EGl(long j) {
    }

    @Override // X.InterfaceC72000XEo
    public final void cancel() {
        this.A0C = true;
        if (this.A0D != null) {
            if (!this.A0D.isDone() && !this.A05.A0B.A0p()) {
                this.A0D.cancel(true);
            }
            try {
                this.A0D.get();
            } catch (Throwable unused) {
            }
        }
        release();
    }

    @Override // X.InterfaceC72000XEo
    public final boolean CRW() {
        if (this.A0D != null && this.A0D.isDone()) {
            this.A0D.get();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC72000XEo
    public final boolean Em0() {
        C66029TyR A00 = this.A0B.A00.A00(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        if (A00 != null) {
            A00.EQc(0, 0, 0L, 4);
            this.A0B.A00.A03(A00);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC72000XEo
    public final void Emv(AbstractC66037TyZ abstractC66037TyZ, int i) {
        if (this.A0C && this.A05.A0B.A0p()) {
            return;
        }
        EnumC1125356h enumC1125356h = EnumC1125356h.AUDIO;
        this.A0D = this.A07.submit(new CallableC71669WyM(i, 0, AbstractC69835VwL.A00(this.A00, this.A02, enumC1125356h, this.A05), abstractC66037TyZ, this));
    }

    @Override // X.InterfaceC72000XEo
    public final void FDt() {
        if (this.A0D != null) {
            this.A0D.get();
        }
    }

    @Override // X.InterfaceC72000XEo
    public final void flush() {
        C65831Tuo c65831Tuo = this.A0B.A00;
        StringBuilder sb = c65831Tuo.A08;
        sb.append("flushB,");
        c65831Tuo.A05.flush();
        sb.append("flushE,");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Tyj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Tyj, java.lang.Object] */
    @Override // X.InterfaceC72000XEo
    public final void release() {
        ?? obj = new Object();
        try {
            C69521Vqk c69521Vqk = this.A0B;
            ?? obj2 = new Object();
            new C67628Uti((C66046Tyj) obj2, c69521Vqk.A00).A00();
            obj2.A01();
        } catch (Throwable th) {
            C66046Tyj.A00(obj, th);
        }
        obj.A01();
    }

    public C70494WZb(Context context, InterfaceC58019Po5 interfaceC58019Po5, C70129W5q c70129W5q, InterfaceC71972XDf interfaceC71972XDf, C69199VjS c69199VjS, C69489VoC c69489VoC, String str, ExecutorService executorService) {
        MediaCodec.BufferInfo bufferInfo;
        this.A03 = c70129W5q;
        this.A05 = c69489VoC;
        this.A07 = executorService;
        this.A02 = interfaceC58019Po5;
        this.A00 = context;
        boolean Ei3 = interfaceC71972XDf.Ei3();
        this.A08 = Ei3;
        boolean endsWith = str.endsWith(".aac");
        this.A09 = endsWith;
        if (!endsWith && !Ei3) {
            bufferInfo = null;
        } else {
            this.A06 = ByteBuffer.allocateDirect(1048576);
            bufferInfo = new MediaCodec.BufferInfo();
        }
        this.A01 = bufferInfo;
        InterfaceC71993XEh AMZ = interfaceC71972XDf.AMZ(c69199VjS);
        this.A04 = AMZ;
        AMZ.AJA(str);
    }
}
