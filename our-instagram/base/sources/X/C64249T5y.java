package X;

/* renamed from: X.T5y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64249T5y implements InterfaceC65579TnE {
    public final S2R A00;
    public final InterfaceC65255Tgl A01;
    public final S2V A02;

    public C64249T5y(S2R s2r, InterfaceC65255Tgl interfaceC65255Tgl, S2V s2v) {
        this.A02 = s2v;
        this.A00 = s2r;
        this.A01 = interfaceC65255Tgl;
    }

    @Override // X.InterfaceC65579TnE
    public final int FFX(Object obj) {
        return ((RLJ) obj).zzc.hashCode();
    }

    @Override // X.InterfaceC65579TnE
    public final RLJ FG5() {
        if (this.A01 instanceof RLJ) {
            return new RLP();
        }
        RLI rli = new RLI(RLP.zzb);
        AbstractC64248T5x.A02(rli);
        return rli.A00;
    }

    @Override // X.InterfaceC65579TnE
    public final void FGG(Object obj) {
        C63300Sh4 c63300Sh4 = ((RLJ) obj).zzc;
        if (c63300Sh4.A01) {
            c63300Sh4.A01 = false;
        }
        throw AbstractC166987dD.A15("zzb");
    }

    @Override // X.InterfaceC65579TnE
    public final void FGT(C62904SWl c62904SWl, Object obj, byte[] bArr, int i, int i2) {
        RLJ rlj = (RLJ) obj;
        if (rlj.zzc == C63300Sh4.A04) {
            rlj.zzc = C63300Sh4.A00();
        }
        throw null;
    }

    @Override // X.InterfaceC65579TnE
    public final boolean FGZ(Object obj, Object obj2) {
        return AbstractC25230BEn.A1Q(((RLJ) obj).zzc.equals(((RLJ) obj2).zzc) ? 1 : 0);
    }

    @Override // X.InterfaceC65579TnE
    public final void FGN(Object obj, Object obj2) {
        AbstractC62873SUx.A00(obj, obj2);
    }
}
