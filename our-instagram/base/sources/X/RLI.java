package X;

/* loaded from: classes10.dex */
public final class RLI extends TIS {
    public RLJ A00;
    public final RLJ A01;

    @Override // X.TIS
    public final /* bridge */ /* synthetic */ Object clone() {
        RLI rli = new RLI(RLP.zzb);
        AbstractC64248T5x.A02(this);
        rli.A00 = this.A00;
        return rli;
    }

    public RLI(RLJ rlj) {
        this.A01 = rlj;
        if ((rlj.zzd & Integer.MIN_VALUE) != 0) {
            throw AbstractC166987dD.A12("Default instance must be immutable.");
        }
        this.A00 = (RLJ) rlj.A02(4);
    }

    public RLI() {
        this(RLP.zzb);
    }
}
