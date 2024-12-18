package X;

import android.view.ViewGroup;

/* renamed from: X.Wmz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71044Wmz implements InterfaceC150976qx {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ ViewGroup A04;

    public C71044Wmz(ViewGroup viewGroup, float f, float f2, int i, int i2) {
        this.A02 = i;
        this.A00 = f;
        this.A03 = i2;
        this.A01 = f2;
        this.A04 = viewGroup;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        float f2 = this.A02;
        float f3 = this.A00;
        if (f2 != f3) {
            double d = f;
            AbstractC65702TsY.A11(this.A04, (float) AbstractC70163Da.A03(d, f2, f3), (float) AbstractC70163Da.A03(d, this.A03, this.A01));
        }
    }
}
