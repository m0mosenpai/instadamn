package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0o8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0o8 extends C12T implements InterfaceC214312v {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C13920nI A03;
    public final Object A04;
    public final AtomicInteger A05;
    public final C12T A06;
    public final C12T A07;
    public final C213512n A08;
    public final C213512n A09;
    public volatile int A0A;
    public volatile int A0B;
    public volatile int A0C;
    public final /* synthetic */ InterfaceC214312v A0D;

    @Override // X.C12T
    public final C12T A03(int i) {
        if (i >= 1) {
            if (i >= this.A01) {
                return this;
            }
            return new C214212u(this, i);
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Expected positive parallelism level, but got ", i));
    }

    @Override // X.C12T
    public final void A04(Runnable runnable, C12W c12w) {
        C14360o3.A0B(c12w, 0);
        C14360o3.A0B(runnable, 1);
        if (!A01(runnable, c12w)) {
            synchronized (this.A04) {
                int i = this.A0B;
                int i2 = this.A01;
                if (i < i2 && !A00(this)) {
                    this.A0B++;
                    C12T c12t = this.A07;
                    c12t.A04(new C0o7(this, c12t, false), this);
                } else if ((this.A0B - this.A0C) + this.A0A < i2 && !A00(this)) {
                    this.A0A++;
                    C0o7 c0o7 = new C0o7(this, this.A06, true);
                    c0o7.A00.A05(c0o7, c0o7.A03);
                }
            }
        }
    }

    @Override // X.C12T
    public final void A05(Runnable runnable, C12W c12w) {
        C14360o3.A0B(c12w, 0);
        C14360o3.A0B(runnable, 1);
        if (!A01(runnable, c12w)) {
            synchronized (this.A04) {
                int i = this.A0B;
                int i2 = this.A01;
                if (i < i2 && !A00(this)) {
                    this.A0B++;
                    C12T c12t = this.A07;
                    c12t.A05(new C0o7(this, c12t, false), this);
                } else if ((this.A0B - this.A0C) + this.A0A < i2 && !A00(this)) {
                    this.A0A++;
                    C0o7 c0o7 = new C0o7(this, this.A06, true);
                    c0o7.A00.A05(c0o7, c0o7.A03);
                }
            }
        }
    }

    @Override // X.InterfaceC214312v
    public final C19D CPF(Runnable runnable, C12W c12w, long j) {
        C14360o3.A0B(runnable, 1);
        C14360o3.A0B(c12w, 2);
        return this.A0D.CPF(runnable, c12w, j);
    }

    @Override // X.InterfaceC214312v
    public final void EM7(InterfaceC24901Jp interfaceC24901Jp, long j) {
        C14360o3.A0B(interfaceC24901Jp, 1);
        this.A0D.EM7(interfaceC24901Jp, j);
    }

    public static final boolean A00(C0o8 c0o8) {
        int i = c0o8.A00;
        if (i >= 0 && i < c0o8.A05.get()) {
            return true;
        }
        return false;
    }

    private final boolean A01(Runnable runnable, C12W c12w) {
        int i;
        int i2;
        C0SJ c0sj;
        if (!runnable.equals(AbstractC14390oB.A00)) {
            C13990nP c13990nP = (C13990nP) c12w.get(C13990nP.A01);
            if (c13990nP != null) {
                i = c13990nP.A00;
            } else {
                i = -18;
            }
            C14010nR c14010nR = (C14010nR) c12w.get(C14010nR.A01);
            if (c14010nR != null) {
                i2 = c14010nR.A00;
            } else {
                i2 = 3;
            }
            C13970nN c13970nN = (C13970nN) c12w.get(C13970nN.A01);
            if (c13970nN != null) {
                c0sj = c13970nN.A00;
            } else {
                c0sj = null;
            }
            this.A09.A02(new C0v8(c0sj, this, runnable, i, i2));
        }
        if ((this.A0B - this.A0C) + this.A0A < this.A01) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0o8(C13920nI c13920nI, AtomicInteger atomicInteger, C12T c12t, C12T c12t2, C213512n c213512n, int i, int i2, long j) {
        InterfaceC214312v interfaceC214312v;
        this.A0D = (!(c12t instanceof InterfaceC214312v) || (interfaceC214312v = (InterfaceC214312v) c12t) == null) ? AbstractC214412w.A00 : interfaceC214312v;
        this.A07 = c12t;
        this.A06 = c12t2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A03 = c13920nI;
        this.A08 = c213512n;
        this.A05 = atomicInteger;
        this.A04 = new Object();
        this.A09 = new C213512n(false);
    }
}
