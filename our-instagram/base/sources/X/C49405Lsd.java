package X;

/* renamed from: X.Lsd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49405Lsd implements MP6 {
    public final /* synthetic */ JV2 A00;

    public C49405Lsd(JV2 jv2) {
        this.A00 = jv2;
    }

    @Override // X.MP6
    public final void DoP(Integer num) {
        MRJ mrj;
        int intValue = num.intValue();
        if (intValue != 3) {
            if (intValue == 4 && (mrj = this.A00.A01) != null) {
                mrj.DfR();
                return;
            }
            return;
        }
        MRJ mrj2 = this.A00.A01;
        if (mrj2 == null) {
            return;
        }
        mrj2.DfQ();
    }
}
