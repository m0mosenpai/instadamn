package X;

/* renamed from: X.5o7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5o7 implements InterfaceC97394Yz {
    public int A00;
    public boolean A01;
    public final /* synthetic */ C5T8 A02;

    public C5o7(C5T8 c5t8) {
        this.A02 = c5t8;
    }

    private void A00() {
        if (!this.A01) {
            C5T8 c5t8 = this.A02;
            C4XX c4xx = c5t8.A05;
            C4B6 c4b6 = c5t8.A04;
            c4xx.A06(c4b6, null, C2IH.A00(c4b6.A0W), 0, 0L);
            this.A01 = true;
        }
    }

    @Override // X.InterfaceC97394Yz
    public final boolean CbZ() {
        return this.A02.A01;
    }

    @Override // X.InterfaceC97394Yz
    public final void Coy() {
    }

    @Override // X.InterfaceC97394Yz
    public final int E7y(C96084Tr c96084Tr, C96094Ts c96094Ts, int i) {
        A00();
        C5T8 c5t8 = this.A02;
        boolean z = c5t8.A01;
        if (z && c5t8.A02 == null) {
            this.A00 = 2;
        }
        int i2 = this.A00;
        if (i2 == 2) {
            ((AbstractC96104Tt) c96094Ts).A00 |= 4;
        } else if ((i & 2) == 0 && i2 != 0) {
            if (!z) {
                return -3;
            }
            c5t8.A02.getClass();
            ((AbstractC96104Tt) c96094Ts).A00 |= 1;
            c96094Ts.A01 = 0L;
            if ((i & 4) == 0) {
                c96094Ts.A01(c5t8.A00);
                c96094Ts.A02.put(c5t8.A02, 0, c5t8.A00);
            }
            if ((i & 1) == 0) {
                this.A00 = 2;
                return -4;
            }
        } else {
            c96084Tr.A00 = c5t8.A04;
            this.A00 = 1;
            return -5;
        }
        return -4;
    }

    @Override // X.InterfaceC97394Yz
    public final int Em7(long j) {
        A00();
        if (j > 0 && this.A00 != 2) {
            this.A00 = 2;
            return 1;
        }
        return 0;
    }

    @Override // X.InterfaceC97394Yz
    public final /* synthetic */ long CAC(int i) {
        return -9223372036854775807L;
    }
}
