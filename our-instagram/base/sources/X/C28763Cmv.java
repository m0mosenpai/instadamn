package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Cmv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28763Cmv implements InterfaceC137016Ie {
    public final int A00;
    public final InterfaceC31143Dmi A01;
    public final InterfaceC138146Ns A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ LazyGridState A06;
    public final /* synthetic */ InterfaceC138146Ns A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    @Override // X.InterfaceC137016Ie
    public final /* bridge */ /* synthetic */ C6Ih Abg(int i, int i2, int i3, long j) {
        return A00(i, i2, i3, this.A00, j);
    }

    public C28763Cmv(InterfaceC31143Dmi interfaceC31143Dmi, LazyGridState lazyGridState, InterfaceC138146Ns interfaceC138146Ns, int i, int i2, int i3, long j, boolean z, boolean z2) {
        this.A07 = interfaceC138146Ns;
        this.A06 = lazyGridState;
        this.A08 = z;
        this.A09 = z2;
        this.A04 = i2;
        this.A03 = i3;
        this.A05 = j;
        this.A01 = interfaceC31143Dmi;
        this.A02 = interfaceC138146Ns;
        this.A00 = i;
    }

    public final C28760Cms A00(int i, int i2, int i3, int i4, long j) {
        int A02;
        InterfaceC31143Dmi interfaceC31143Dmi = this.A01;
        Object BKc = interfaceC31143Dmi.BKc(i);
        Object ArA = interfaceC31143Dmi.ArA(i);
        List CpC = this.A02.CpC(i, j);
        if (Constraints.A09(j)) {
            A02 = Constraints.A03(j);
        } else if (Constraints.A08(j)) {
            A02 = Constraints.A02(j);
        } else {
            throw AbstractC166987dD.A12("does not have fixed height");
        }
        AnonymousClass583 layoutDirection = this.A07.getLayoutDirection();
        return new C28760Cms(this.A06.A0C, layoutDirection, BKc, ArA, CpC, i, A02, i4, this.A04, this.A03, i2, i3, this.A05, j, this.A08, this.A09);
    }
}
