package X;

import android.graphics.drawable.Drawable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2nS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2nS implements InterfaceC59212nM {
    public C5GH A00;
    public InterfaceC59212nM A01;
    public C5GG A02;
    public C2nU A03;

    @Override // X.InterfaceC59212nM
    public final void DGC(Drawable drawable, C59392ni c59392ni, C2nP c2nP, Throwable th, long j) {
        InterfaceC59212nM interfaceC59212nM = this.A01;
        if (interfaceC59212nM != null) {
            interfaceC59212nM.DGC(drawable, c59392ni, c2nP, th, j);
        }
        C5GG c5gg = this.A02;
        if (c5gg != null) {
            c5gg.DGB(drawable, th, j);
        }
        AtomicLong atomicLong = AbstractC59362nf.A00;
    }

    @Override // X.InterfaceC59212nM
    public final void DH2(Drawable drawable, C59392ni c59392ni, C2nP c2nP, C3QB c3qb, int i, long j) {
        InterfaceC59212nM interfaceC59212nM = this.A01;
        if (interfaceC59212nM != null) {
            interfaceC59212nM.DH2(drawable, c59392ni, c2nP, c3qb, i, j);
        }
        C5GG c5gg = this.A02;
        if (c5gg != null) {
            c5gg.DH1(drawable, c3qb, i, j);
        }
        AtomicLong atomicLong = AbstractC59362nf.A00;
    }

    @Override // X.InterfaceC59212nM
    public final void DMt(C2nP c2nP, Throwable th, long j) {
        InterfaceC59212nM interfaceC59212nM = this.A01;
        if (interfaceC59212nM != null) {
            interfaceC59212nM.DMt(c2nP, th, j);
        }
        C5GG c5gg = this.A02;
        if (c5gg != null) {
            c5gg.DMs(j, th);
        }
        AtomicLong atomicLong = AbstractC59362nf.A00;
    }

    @Override // X.InterfaceC59212nM
    public final void DMv(C2nP c2nP, C3QB c3qb, long j) {
        InterfaceC59212nM interfaceC59212nM = this.A01;
        if (interfaceC59212nM != null) {
            interfaceC59212nM.DMv(c2nP, c3qb, j);
        }
        C5GG c5gg = this.A02;
        if (c5gg != null) {
            c5gg.DMu(c3qb, j);
        }
        AtomicLong atomicLong = AbstractC59362nf.A00;
    }

    @Override // X.InterfaceC59212nM
    public final void DYr(Drawable drawable, C2nP c2nP, long j) {
        InterfaceC59212nM interfaceC59212nM = this.A01;
        if (interfaceC59212nM != null) {
            interfaceC59212nM.DYr(drawable, c2nP, j);
        }
        C5GG c5gg = this.A02;
        if (c5gg != null) {
            c5gg.DYq(drawable, j);
        }
    }

    @Override // X.InterfaceC59212nM
    public final void Dec(C59392ni c59392ni, C2nP c2nP, long j) {
        InterfaceC59212nM interfaceC59212nM = this.A01;
        if (interfaceC59212nM != null) {
            interfaceC59212nM.Dec(c59392ni, c2nP, j);
        }
        C5GG c5gg = this.A02;
        if (c5gg != null) {
            c5gg.DeX(j);
        }
        AtomicLong atomicLong = AbstractC59362nf.A00;
    }

    @Override // X.InterfaceC59212nM
    public final void DpX(C59392ni c59392ni, C2nP c2nP, Object obj, long j) {
        InterfaceC59212nM interfaceC59212nM = this.A01;
        if (interfaceC59212nM != null) {
            interfaceC59212nM.DpX(c59392ni, c2nP, obj, j);
        }
        C5GG c5gg = this.A02;
        if (c5gg != null) {
            c5gg.DpW(j, obj);
        }
        AtomicLong atomicLong = AbstractC59362nf.A00;
    }

    public C2nS() {
        C2nU c2nU = C59262nT.A00;
        C14360o3.A0C(c2nU, "null cannot be cast to non-null type com.facebook.fresco.ui.common.ControllerListener2<I of com.facebook.fresco.ui.common.BaseControllerListener2.Companion.getNoOpListener>");
        this.A03 = c2nU;
    }
}
