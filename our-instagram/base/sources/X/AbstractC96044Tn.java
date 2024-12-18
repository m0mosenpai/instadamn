package X;

import android.os.SystemClock;
import com.google.android.exoplayer2.audio.DefaultAudioSink;

/* renamed from: X.4Tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC96044Tn implements InterfaceC96054To, InterfaceC96074Tq {
    public int A00;
    public int A01;
    public C4WD A03;
    public C4WZ A04;
    public InterfaceC97394Yz A05;
    public boolean A07;
    public C4B6[] A08;
    public long A09;
    public boolean A0A;
    public final int A0B;
    public Integer A06 = C05F.A00;
    public final C96084Tr A0C = new Object();
    public long A02 = Long.MIN_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4Y3 A0F(X.C4B6 r11, java.lang.Throwable r12, int r13, boolean r14) {
        /*
            r10 = this;
            r2 = r11
            if (r11 == 0) goto L1a
            boolean r0 = r10.A0A
            if (r0 != 0) goto L1a
            r0 = 1
            r10.A0A = r0
            r1 = 0
            int r0 = r10.EpR(r11)     // Catch: java.lang.Throwable -> L14 X.C4Y3 -> L18
            r8 = r0 & 7
            r10.A0A = r1
            goto L1b
        L14:
            r0 = move-exception
            r10.A0A = r1
            throw r0
        L18:
            r10.A0A = r1
        L1a:
            r8 = 4
        L1b:
            java.lang.String r3 = r10.getName()
            int r7 = r10.A00
            if (r11 != 0) goto L24
            r8 = 4
        L24:
            r5 = 1
            X.4Y3 r1 = new X.4Y3
            r4 = r12
            r6 = r13
            r9 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC96044Tn.A0F(X.4B6, java.lang.Throwable, int, boolean):X.4Y3");
    }

    public void A0I() {
    }

    public void A0J() {
    }

    public abstract void A0K();

    public abstract void A0L(long j, boolean z);

    public void A0M(boolean z, boolean z2) {
    }

    public abstract void A0N(C4B6[] c4b6Arr, long j, long j2);

    @Override // X.InterfaceC96064Tp
    public void CK0(int i, Object obj) {
    }

    @Override // X.InterfaceC96054To
    public final void EH4(InterfaceC97394Yz interfaceC97394Yz, C4B6[] c4b6Arr, long j, long j2) {
        C4B8.A04(!this.A07);
        this.A05 = interfaceC97394Yz;
        if (this.A02 == Long.MIN_VALUE) {
            this.A02 = j;
        }
        this.A08 = c4b6Arr;
        this.A09 = j2;
        A0N(c4b6Arr, j, j2);
    }

    @Override // X.InterfaceC96054To
    public final void EJq(long j) {
        this.A07 = false;
        this.A02 = j;
        A0L(j, false);
    }

    @Override // X.InterfaceC96054To
    public /* synthetic */ void Eb2(float f, float f2) {
    }

    public final int A0D(long j) {
        InterfaceC97394Yz interfaceC97394Yz = this.A05;
        interfaceC97394Yz.getClass();
        return interfaceC97394Yz.Em7(j - this.A09);
    }

    public final int A0E(C96084Tr c96084Tr, C96094Ts c96094Ts, int i) {
        InterfaceC97394Yz interfaceC97394Yz = this.A05;
        interfaceC97394Yz.getClass();
        int E7y = interfaceC97394Yz.E7y(c96084Tr, c96094Ts, i);
        if (E7y == -4) {
            if ((((AbstractC96104Tt) c96094Ts).A00 & 4) == 4) {
                this.A02 = Long.MIN_VALUE;
                if (this.A07) {
                    return -4;
                }
                return -3;
            }
            long j = c96094Ts.A01;
            c96094Ts.A00 = j;
            long j2 = j + this.A09;
            c96094Ts.A01 = j2;
            this.A02 = Math.max(this.A02, j2);
            return E7y;
        }
        if (E7y == -5) {
            C4B6 c4b6 = c96084Tr.A00;
            c4b6.getClass();
            long j3 = c4b6.A0M;
            if (j3 != Long.MAX_VALUE) {
                C4B3 c4b3 = new C4B3(c4b6);
                c4b3.A0K = j3 + this.A09;
                c96084Tr.A00 = new C4B6(c4b3);
            }
        }
        return E7y;
    }

    public void A0H() {
        C4UO c4uo;
        if (this instanceof C96024Tl) {
            C96024Tl c96024Tl = (C96024Tl) this;
            c96024Tl.A07 = 0;
            c96024Tl.A08 = 0;
            c96024Tl.A09 = 0;
            c96024Tl.A0F = SystemClock.elapsedRealtime();
            c96024Tl.A0J = SystemClock.elapsedRealtime() * 1000;
            if (c96024Tl.A0j) {
                c96024Tl.A0g.A03();
                return;
            }
            return;
        }
        if (this instanceof C4UB) {
            c4uo = ((C4UB) this).A0A;
        } else if (!(this instanceof C98174aw)) {
            return;
        } else {
            c4uo = ((C98174aw) this).A0A;
        }
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) c4uo;
        defaultAudioSink.A0Q = true;
        if (defaultAudioSink.A0B == null) {
            return;
        }
        C126345nV c126345nV = defaultAudioSink.A0c.A0L;
        c126345nV.getClass();
        c126345nV.A00();
        defaultAudioSink.A0B.play();
    }

    @Override // X.InterfaceC96054To
    public final void APM() {
        boolean z = true;
        if (this.A01 != 1) {
            z = false;
        }
        C4B8.A04(z);
        C96084Tr c96084Tr = this.A0C;
        c96084Tr.A01 = null;
        c96084Tr.A00 = null;
        this.A01 = 0;
        this.A05 = null;
        this.A08 = null;
        this.A07 = false;
        A0K();
    }

    @Override // X.InterfaceC96054To
    public final boolean CLd() {
        if (this.A02 != Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC96054To
    public final void Cp1() {
        InterfaceC97394Yz interfaceC97394Yz = this.A05;
        interfaceC97394Yz.getClass();
        interfaceC97394Yz.Coy();
    }

    @Override // X.InterfaceC96054To
    public final void reset() {
        boolean z = false;
        if (this.A01 == 0) {
            z = true;
        }
        C4B8.A04(z);
        C96084Tr c96084Tr = this.A0C;
        c96084Tr.A01 = null;
        c96084Tr.A00 = null;
        A0J();
    }

    @Override // X.InterfaceC96054To
    public final void start() {
        boolean z = true;
        if (this.A01 != 1) {
            z = false;
        }
        C4B8.A04(z);
        this.A01 = 2;
        A0H();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4Tr, java.lang.Object] */
    public AbstractC96044Tn(int i) {
        this.A0B = i;
    }

    public final boolean A0G() {
        if (CLd()) {
            return this.A07;
        }
        InterfaceC97394Yz interfaceC97394Yz = this.A05;
        interfaceC97394Yz.getClass();
        return interfaceC97394Yz.CbZ();
    }
}
