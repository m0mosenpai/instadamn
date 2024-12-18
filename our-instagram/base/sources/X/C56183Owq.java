package X;

import android.view.View;

/* renamed from: X.Owq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56183Owq implements InterfaceC62892tS {
    public final int A00;
    public final Object A01;

    public C56183Owq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        InterfaceC16660sJ interfaceC16660sJ;
        C50559MTq c50559MTq;
        switch (this.A00) {
            case 0:
                interfaceC16660sJ = ((C26618BpF) this.A01).A04;
                AbstractC43592JPx.A19(i, interfaceC16660sJ);
                return;
            case 1:
                C50561MTs c50561MTs = (C50561MTs) this.A01;
                if (!c50561MTs.A03) {
                    return;
                }
                C55982hj c55982hj = c50561MTs.A07;
                if (!c55982hj.A0C() || c55982hj.A01 != 1.0d || (c50559MTq = (C50559MTq) AbstractC001800i.A0O(((C50564MTv) c50561MTs.A0E.getValue()).A01, i)) == null) {
                    return;
                }
                C2UY.A01.A04();
                c50561MTs.A0A.DpS(c50559MTq, c50561MTs, i);
                c50561MTs.A09.A00(c50559MTq.A01, i);
                return;
            case 2:
                interfaceC16660sJ = ((C26639Bpa) this.A01).A05;
                AbstractC43592JPx.A19(i, interfaceC16660sJ);
                return;
            default:
                interfaceC16660sJ = ((C26649Bpk) this.A01).A0D;
                AbstractC43592JPx.A19(i, interfaceC16660sJ);
                return;
        }
    }

    @Override // X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
        if (this.A00 == 0) {
            ((C26618BpF) this.A01).A05.invoke(Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void E0r(View view) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diq(C3VZ c3vz, float f, float f2) {
    }
}
