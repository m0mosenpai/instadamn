package X;

/* renamed from: X.4Yd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97184Yd implements InterfaceC97394Yz {
    public boolean A00;
    public final InterfaceC97394Yz A01;
    public final /* synthetic */ C97174Yc A02;

    public C97184Yd(C97174Yc c97174Yc, InterfaceC97394Yz interfaceC97394Yz) {
        this.A02 = c97174Yc;
        this.A01 = interfaceC97394Yz;
    }

    @Override // X.InterfaceC97394Yz
    public final long CAC(int i) {
        return this.A01.CAC(i);
    }

    @Override // X.InterfaceC97394Yz
    public final boolean CbZ() {
        if (this.A02.A01 == -9223372036854775807L && this.A01.CbZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC97394Yz
    public final void Coy() {
        this.A01.Coy();
    }

    @Override // X.InterfaceC97394Yz
    public final int E7y(C96084Tr c96084Tr, C96094Ts c96094Ts, int i) {
        C97174Yc c97174Yc = this.A02;
        boolean z = false;
        if (c97174Yc.A01 != -9223372036854775807L) {
            z = true;
        }
        if (z) {
            return -3;
        }
        if (this.A00) {
            ((AbstractC96104Tt) c96094Ts).A00 = 4;
            return -4;
        }
        int E7y = this.A01.E7y(c96084Tr, c96094Ts, i);
        if (E7y == -5) {
            C4B6 c4b6 = c96084Tr.A00;
            c4b6.getClass();
            int i2 = c4b6.A08;
            if (i2 != 0 || c4b6.A09 != 0) {
                int i3 = 0;
                if (c97174Yc.A02 != 0) {
                    i2 = 0;
                }
                if (c97174Yc.A00 == Long.MIN_VALUE) {
                    i3 = c4b6.A09;
                }
                C4B3 c4b3 = new C4B3(c4b6);
                c4b3.A06 = i2;
                c4b3.A07 = i3;
                c96084Tr.A00 = new C4B6(c4b3);
            }
            return -5;
        }
        long j = c97174Yc.A00;
        if (j == Long.MIN_VALUE || (E7y != -4 ? E7y != -3 || c97174Yc.Aik() != Long.MIN_VALUE || c96094Ts.A04 : c96094Ts.A01 < j)) {
            return E7y;
        }
        c96094Ts.clear();
        ((AbstractC96104Tt) c96094Ts).A00 = 4;
        this.A00 = true;
        return -4;
    }

    @Override // X.InterfaceC97394Yz
    public final int Em7(long j) {
        if (this.A02.A01 != -9223372036854775807L) {
            return -3;
        }
        return this.A01.Em7(j);
    }
}
