package X;

import com.google.android.exoplayer2.util.Util;
import java.util.UUID;

/* renamed from: X.4Yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97304Yp implements InterfaceC97394Yz {
    public boolean A00;
    public final int A01;
    public final C4YV A02;
    public final C98044aj A03;
    public final /* synthetic */ C4YV A04;

    @Override // X.InterfaceC97394Yz
    public final void Coy() {
    }

    public C97304Yp(C98044aj c98044aj, C4YV c4yv, C4YV c4yv2, int i) {
        this.A04 = c4yv;
        this.A02 = c4yv2;
        this.A03 = c98044aj;
        this.A01 = i;
    }

    private void A00() {
        if (!this.A00) {
            C4YV c4yv = this.A04;
            C4XX c4xx = c4yv.A0H;
            int[] iArr = c4yv.A0S;
            int i = this.A01;
            c4xx.A06(c4yv.A0T[i], null, iArr[i], 0, c4yv.A01);
            this.A00 = true;
        }
    }

    @Override // X.InterfaceC97394Yz
    public final long CAC(int i) {
        long j = ((C97894aU) this.A04.A0K).A07;
        UUID uuid = C4YL.A04;
        return Util.A08(j);
    }

    @Override // X.InterfaceC97394Yz
    public final boolean CbZ() {
        C4YV c4yv = this.A04;
        if (!c4yv.A04() && this.A03.A0E(c4yv.A0B)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC97394Yz
    public final int E7y(C96084Tr c96084Tr, C96094Ts c96094Ts, int i) {
        C4YV c4yv = this.A04;
        if (c4yv.A04()) {
            return -3;
        }
        A00();
        return this.A03.A04(c96084Tr, c96094Ts, i, c4yv.A0B);
    }

    @Override // X.InterfaceC97394Yz
    public final int Em7(long j) {
        C4YV c4yv = this.A04;
        if (c4yv.A04()) {
            return 0;
        }
        C98044aj c98044aj = this.A03;
        int A03 = c98044aj.A03(j, c4yv.A0B);
        c98044aj.A0A(A03);
        if (A03 <= 0) {
            return A03;
        }
        A00();
        return A03;
    }
}
