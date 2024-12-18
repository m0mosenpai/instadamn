package X;

import android.content.Context;
import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes11.dex */
public final class U7Y implements InterfaceC72000XEo {
    public MYB A00;
    public final Context A01;
    public final MediaFormat A02;
    public final InterfaceC58019Po5 A03;
    public final C70129W5q A04;
    public final C66280U7a A05;
    public final C69489VoC A06;
    public final XCA A07;
    public final ExecutorService A08;
    public volatile InterfaceC72004XEs A09;
    public volatile boolean A0A;
    public volatile Future A0B;

    @Override // X.InterfaceC72000XEo
    public final void cancel() {
        this.A0A = true;
        if (this.A0B != null) {
            if (!this.A0B.isDone() && !this.A06.A0B.A0p()) {
                this.A0B.cancel(true);
            }
            try {
                this.A0B.get();
            } catch (Throwable unused) {
            }
        }
        release();
    }

    public static void A00(U7Y u7y) {
        if (u7y.A09 != null) {
            MediaFormat outputFormat = u7y.A09.getOutputFormat();
            C66280U7a c66280U7a = u7y.A05;
            c66280U7a.A04 = outputFormat;
            c66280U7a.A00 = u7y.A09.BaL();
            C70129W5q c70129W5q = u7y.A04;
            c70129W5q.A0P = true;
            c70129W5q.A0E = outputFormat;
        }
    }

    @Override // X.InterfaceC72000XEo
    public final void A8L(MediaEffect mediaEffect, int i) {
        InterfaceC72004XEs interfaceC72004XEs = this.A09;
        interfaceC72004XEs.getClass();
        interfaceC72004XEs.A8L(mediaEffect, i);
    }

    @Override // X.InterfaceC72000XEo
    public final void AAf(int i) {
        InterfaceC72004XEs interfaceC72004XEs = this.A09;
        interfaceC72004XEs.getClass();
        interfaceC72004XEs.AAf(i);
    }

    @Override // X.InterfaceC72000XEo
    public final void APt(long j) {
        if (j >= 0) {
            this.A09.APt(j);
        }
    }

    @Override // X.InterfaceC72000XEo
    public final boolean CRW() {
        if (this.A0B != null && this.A0B.isDone()) {
            this.A0B.get();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC72000XEo
    public final void EFF(MediaEffect mediaEffect, int i) {
        InterfaceC72004XEs interfaceC72004XEs = this.A09;
        interfaceC72004XEs.getClass();
        interfaceC72004XEs.EFF(mediaEffect, i);
    }

    @Override // X.InterfaceC72000XEo
    public final void EGU(int i) {
        InterfaceC72004XEs interfaceC72004XEs = this.A09;
        interfaceC72004XEs.getClass();
        interfaceC72004XEs.EGU(i);
    }

    @Override // X.InterfaceC72000XEo
    public final void EGl(long j) {
        if (j >= 0) {
            this.A09.EGl(j);
        }
    }

    @Override // X.InterfaceC72000XEo
    public final boolean Em0() {
        this.A09.Elz();
        return true;
    }

    @Override // X.InterfaceC72000XEo
    public final void Emv(AbstractC66037TyZ abstractC66037TyZ, int i) {
        if (this.A0A && this.A06.A0B.A0p()) {
            return;
        }
        EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
        this.A0B = this.A08.submit(new CallableC71669WyM(i, 1, AbstractC69835VwL.A00(this.A01, this.A03, enumC1125356h, this.A06), abstractC66037TyZ, this));
    }

    @Override // X.InterfaceC72000XEo
    public final void FDt() {
        if (this.A0B != null) {
            this.A0B.get();
        }
    }

    @Override // X.InterfaceC72000XEo
    public final void flush() {
        this.A09.flush();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Tyj, java.lang.Object] */
    @Override // X.InterfaceC72000XEo
    public final void release() {
        ?? obj = new Object();
        try {
            if (this.A09 != null) {
                this.A09.AVe();
                this.A09 = null;
            }
        } catch (Throwable th) {
            C66046Tyj.A00(obj, th);
        }
        obj.A01();
    }

    public U7Y(Context context, MediaFormat mediaFormat, MYB myb, InterfaceC58019Po5 interfaceC58019Po5, C70129W5q c70129W5q, C66280U7a c66280U7a, C69489VoC c69489VoC, XCA xca, ExecutorService executorService) {
        this.A04 = c70129W5q;
        this.A06 = c69489VoC;
        this.A02 = mediaFormat;
        this.A08 = executorService;
        this.A03 = interfaceC58019Po5;
        this.A01 = context;
        this.A05 = c66280U7a;
        this.A07 = xca;
        this.A00 = myb;
    }
}
