package X;

import java.util.Arrays;

/* renamed from: X.YFt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73490YFt implements InterfaceC42071wx, InterfaceC41801wU {
    public InterfaceC41801wU A00;
    public boolean A01;
    public final InterfaceC42071wx A02;
    public final C6DF A03;
    public final C6DF A04;
    public final C6DH A05;
    public final C6DH A06;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (!this.A01) {
            try {
                this.A06.accept(obj);
                this.A02.DVo(obj);
            } catch (Throwable th) {
                AbstractC62281S5a.A00(th);
                this.A00.dispose();
                onError(th);
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A02(this.A00, interfaceC41801wU)) {
            this.A00 = interfaceC41801wU;
            this.A02.Dpc(this);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A00.dispose();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A01) {
            try {
                this.A04.run();
                this.A01 = true;
                this.A02.onComplete();
                try {
                    this.A03.run();
                } catch (Throwable th) {
                    AbstractC62281S5a.A00(th);
                    AbstractC142886co.A02(th);
                }
            } catch (Throwable th2) {
                AbstractC62281S5a.A00(th2);
                onError(th2);
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (this.A01) {
            AbstractC142886co.A02(th);
            return;
        }
        this.A01 = true;
        try {
            this.A05.accept(th);
        } catch (Throwable th2) {
            AbstractC62281S5a.A00(th2);
            th = new C64866TXr(Arrays.asList(th, th2));
        }
        this.A02.onError(th);
        try {
            this.A03.run();
        } catch (Throwable th3) {
            AbstractC62281S5a.A00(th3);
            AbstractC142886co.A02(th3);
        }
    }

    public C73490YFt(InterfaceC42071wx interfaceC42071wx, C6DF c6df, C6DF c6df2, C6DH c6dh, C6DH c6dh2) {
        this.A02 = interfaceC42071wx;
        this.A06 = c6dh;
        this.A05 = c6dh2;
        this.A04 = c6df;
        this.A03 = c6df2;
    }
}
