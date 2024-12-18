package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Wov, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71160Wov implements MRH {
    public final int A00;
    public final W1W A02;
    public final C7GO A04;
    public final InterfaceC09390do A08;
    public final boolean A09;
    public final C7GO A03 = new C71159Wou(this);
    public final HandlerThread A01 = MSY.A0A("VoiceRecordControllerAsync");
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C57517Pfr(this, 41));
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final AbstractRunnableC14200nk A0A = new V6E(this);

    public C71160Wov(W1W w1w, C7GO c7go, MPO mpo, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = c7go;
        this.A02 = w1w;
        this.A00 = i;
        this.A09 = z;
        this.A08 = AbstractC09440dt.A01(new X3C(this, mpo, i2, i3, i4, i5, i6, z2, z4, z3));
    }

    @Override // X.MRH
    public final void release() {
        Eoe(true);
        this.A01.quit();
        ((C66055Tys) this.A08.getValue()).release();
    }

    @Override // X.MRH
    public final void AHz() {
        ((C66055Tys) this.A08.getValue()).A09 = null;
    }

    @Override // X.MRH
    public final L33 Auq() {
        return ((C66055Tys) this.A08.getValue()).A09;
    }

    @Override // X.MRH
    public final void Cov() {
        AtomicBoolean atomicBoolean = this.A06;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            ((Handler) this.A07.getValue()).post(this.A0A);
        }
    }

    @Override // X.MRH
    public final void Eoe(boolean z) {
        if (this.A06.get()) {
            this.A05.set(z);
            ((Handler) this.A07.getValue()).post(new C68013V6f(this, C05F.A00, C71787X4o.A00));
        }
    }

    @Override // X.MRH
    public final boolean isRecording() {
        return this.A06.get();
    }
}
