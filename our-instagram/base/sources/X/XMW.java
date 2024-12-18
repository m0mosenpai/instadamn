package X;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class XMW extends AtomicInteger implements InterfaceC42071wx, InterfaceC41801wU, YOC {
    public int A00;
    public int A01;
    public InterfaceC41801wU A02;
    public InterfaceC136016Dg A03;
    public XMX A04;
    public final int A05;
    public final int A06;
    public final InterfaceC42071wx A07;
    public final C6D4 A08;
    public final Integer A0A;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public final C6JD A09 = new AtomicReference();
    public final ArrayDeque A0B = new ArrayDeque();

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A0C = true;
        if (getAndIncrement() == 0) {
            this.A03.clear();
            A00();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        this.A0D = true;
        AQN();
    }

    public final void A00() {
        XMX xmx = this.A04;
        if (xmx != null) {
            C6KP.A01(xmx);
        }
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.A0B.poll();
            if (atomicReference != null) {
                C6KP.A01(atomicReference);
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (this.A01 == 0) {
            this.A03.offer(obj);
        }
        AQN();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C137416Km c137416Km;
        if (C6KP.A02(this.A02, interfaceC41801wU)) {
            this.A02 = interfaceC41801wU;
            if (interfaceC41801wU instanceof InterfaceC135996De) {
                InterfaceC136006Df interfaceC136006Df = (InterfaceC136006Df) interfaceC41801wU;
                int EJ7 = interfaceC136006Df.EJ7(3);
                if (EJ7 == 1) {
                    this.A01 = EJ7;
                    this.A03 = interfaceC136006Df;
                    this.A0D = true;
                    this.A07.Dpc(this);
                    AQN();
                    return;
                }
                if (EJ7 == 2) {
                    this.A01 = EJ7;
                    c137416Km = interfaceC136006Df;
                    this.A03 = c137416Km;
                    this.A07.Dpc(this);
                }
            }
            c137416Km = new C137416Km(this.A06);
            this.A03 = c137416Km;
            this.A07.Dpc(this);
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (Y4X.A02(th, this.A09)) {
            this.A0D = true;
            AQN();
        } else {
            AbstractC142886co.A02(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6JD, java.util.concurrent.atomic.AtomicReference] */
    public XMW(InterfaceC42071wx interfaceC42071wx, C6D4 c6d4, Integer num, int i, int i2) {
        this.A07 = interfaceC42071wx;
        this.A08 = c6d4;
        this.A05 = i;
        this.A06 = i2;
        this.A0A = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        if (r0 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        r5.clear();
        A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0109, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0010 A[SYNTHETIC] */
    @Override // X.YOC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQN() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XMW.AQN():void");
    }
}
