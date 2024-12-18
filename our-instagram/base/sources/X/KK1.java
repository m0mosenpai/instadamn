package X;

import java.io.File;
import java.util.List;

/* loaded from: classes8.dex */
public final class KK1 extends C2AG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C43871Jab A02;
    public final /* synthetic */ C47Z A03;
    public final /* synthetic */ C47Z A04;
    public final /* synthetic */ List A05;

    @Override // X.C11R
    public final int getRunnableId() {
        return 542;
    }

    public KK1(C43871Jab c43871Jab, C47Z c47z, C47Z c47z2, List list, int i, int i2) {
        this.A02 = c43871Jab;
        this.A01 = i;
        this.A04 = c47z;
        this.A00 = i2;
        this.A03 = c47z2;
        this.A05 = list;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        File A01 = AbstractC916948n.A01();
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, this.A02.A09, 36609287619352441L);
        if (A07 == 0) {
            A07 = C55187Ods.A00(this.A01);
        }
        C47Z c47z = this.A04;
        C55201OeB.A02(c47z, A01, this.A01, this.A00, A07);
        c47z.A33 = A01.getAbsolutePath();
        return null;
    }

    @Override // X.C2AG, X.C2AH, X.C11R
    public final void onFinish() {
        super.onFinish();
        C43871Jab.A04(this.A02, this.A03, this.A05);
    }
}
