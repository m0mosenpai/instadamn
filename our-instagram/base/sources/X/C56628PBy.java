package X;

import android.view.View;

/* renamed from: X.PBy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56628PBy implements InterfaceC57985PnV {
    public final OUZ A00;

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        C51895Mwd c51895Mwd = (C51895Mwd) interfaceC57856PlM;
        C14360o3.A0B(c51895Mwd, 0);
        OUZ ouz = this.A00;
        if (c51895Mwd.A06) {
            ouz.A01 = c51895Mwd.A00;
            View A0E = MSY.A0E(ouz.A08);
            boolean z = c51895Mwd.A09;
            int i = 8;
            A0E.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            MSY.A0E(ouz.A07).setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            View A0E2 = MSY.A0E(ouz.A0D);
            int i2 = !z ? 1 : 0;
            A0E2.setVisibility(AbstractC167007dF.A05(i2));
            MSY.A0E(ouz.A0C).setVisibility(AbstractC167007dF.A05(i2));
            View A0E3 = MSY.A0E(ouz.A03);
            if (c51895Mwd.A07) {
                i = 0;
            }
            A0E3.setVisibility(i);
            AbstractC43593JPy.A1W(ouz.A06, 0);
            InterfaceC09390do interfaceC09390do = ouz.A05;
            C54792OJk c54792OJk = (C54792OJk) interfaceC09390do.getValue();
            ((C32678Ea5) c54792OJk.A08.getValue()).A0J(c51895Mwd.A02, null, null, null, null, null, null, c51895Mwd.A03);
            C54792OJk c54792OJk2 = (C54792OJk) interfaceC09390do.getValue();
            boolean z2 = c51895Mwd.A08;
            boolean z3 = c51895Mwd.A05;
            String str = c51895Mwd.A01;
            C14360o3.A0B(str, 2);
            ((C32678Ea5) c54792OJk2.A08.getValue()).A0I(str, z2, z3);
        }
    }

    public C56628PBy(OUZ ouz) {
        this.A00 = ouz;
    }
}
