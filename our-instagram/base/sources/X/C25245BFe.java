package X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* renamed from: X.BFe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25245BFe implements InterfaceC31139Dme {
    public final int A00;
    public final int A01;
    public final InterfaceC30898DiB A02;

    public static C25245BFe A00(int i, int i2) {
        return new C25245BFe(AbstractC25328BIx.A01, i, i2);
    }

    public static C25245BFe A01(InterfaceC30898DiB interfaceC30898DiB, int i, int i2) {
        return new C25245BFe(interfaceC30898DiB, i, i2);
    }

    @Override // X.C5Y6
    /* renamed from: FDZ */
    public final /* bridge */ /* synthetic */ C62F FDa(InterfaceC118485Xk interfaceC118485Xk) {
        return new C72067XMl(this.A02, this.A01, this.A00);
    }

    @Override // X.InterfaceC31139Dme
    public final /* bridge */ /* synthetic */ InterfaceC31140Dmf FDa(InterfaceC118485Xk interfaceC118485Xk) {
        return new C72067XMl(this.A02, this.A01, this.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25245BFe)) {
            return false;
        }
        C25245BFe c25245BFe = (C25245BFe) obj;
        if (c25245BFe.A01 != this.A01 || c25245BFe.A00 != this.A00) {
            return false;
        }
        return AbstractC25231BEo.A1Z(c25245BFe.A02, this.A02, false);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, this.A01 * 31) + this.A00;
    }

    public C25245BFe(InterfaceC30898DiB interfaceC30898DiB, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = interfaceC30898DiB;
    }

    public C25245BFe() {
        this(AbstractC25328BIx.A01, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 0);
    }
}
