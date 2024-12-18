package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.Ttn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65772Ttn implements InterfaceC97394Yz, C4Z8 {
    public final int A00;
    public final /* synthetic */ C65771Ttm A01;

    public C65772Ttn(C65771Ttm c65771Ttm, int i) {
        this.A01 = c65771Ttm;
        this.A00 = i;
    }

    @Override // X.InterfaceC97394Yz
    public final long CAC(int i) {
        C65771Ttm c65771Ttm = this.A01;
        Map map = C65771Ttm.A0e;
        InterfaceC98454bO interfaceC98454bO = c65771Ttm.A05;
        if (interfaceC98454bO != null) {
            long CAK = interfaceC98454bO.CAK(i);
            UUID uuid = C4YL.A04;
            return Util.A08(CAK);
        }
        return -9223372036854775807L;
    }

    @Override // X.InterfaceC97394Yz
    public final boolean CbZ() {
        C65771Ttm c65771Ttm = this.A01;
        int i = this.A00;
        if (!c65771Ttm.A0C && !C65771Ttm.A05(c65771Ttm) && c65771Ttm.A0H[i].A0E(c65771Ttm.A0B)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC97394Yz
    public final void Coy() {
        C65771Ttm c65771Ttm = this.A01;
        c65771Ttm.A0H[this.A00].A07();
        c65771Ttm.A06();
    }

    @Override // X.InterfaceC97394Yz
    public final int E7y(C96084Tr c96084Tr, C96094Ts c96094Ts, int i) {
        C65771Ttm c65771Ttm = this.A01;
        int i2 = this.A00;
        if (!c65771Ttm.A0C && !C65771Ttm.A05(c65771Ttm)) {
            C65771Ttm.A03(c65771Ttm, i2);
            int A04 = c65771Ttm.A0H[i2].A04(c96084Tr, c96094Ts, i, c65771Ttm.A0B);
            if (A04 == -3) {
                C65771Ttm.A04(c65771Ttm, i2);
            }
            return A04;
        }
        return -3;
    }

    @Override // X.InterfaceC97394Yz
    public final int Em7(long j) {
        C65771Ttm c65771Ttm = this.A01;
        int i = this.A00;
        if (!c65771Ttm.A0C && !C65771Ttm.A05(c65771Ttm)) {
            C65771Ttm.A03(c65771Ttm, i);
            C98044aj c98044aj = c65771Ttm.A0H[i];
            int A03 = c98044aj.A03(j, c65771Ttm.A0B);
            c98044aj.A0A(A03);
            if (A03 == 0) {
                C65771Ttm.A04(c65771Ttm, i);
            }
            return A03;
        }
        return 0;
    }
}
