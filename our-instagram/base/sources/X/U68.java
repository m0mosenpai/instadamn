package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes11.dex */
public final class U68 implements XCz {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ C102884kP A03;

    public U68(Context context, C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2) {
        this.A03 = c102884kP;
        this.A00 = context;
        this.A02 = c102884kP2;
        this.A01 = c6fg;
    }

    @Override // X.XCz
    public final void DnG() {
        C102884kP c102884kP = this.A03;
        InterfaceC103384lE A0B = c102884kP.A0B(42);
        if (A0B != null) {
            C102884kP c102884kP2 = this.A02;
            C6FX A0I = AbstractC31179DnN.A0I(c102884kP2);
            C6FG c6fg = this.A01;
            A0I.A02(c6fg);
            AbstractC65702TsY.A1Q(c6fg, c102884kP2, A0I, A0B);
            return;
        }
        InterfaceC103384lE A0A = c102884kP.A0A();
        if (A0A == null) {
            return;
        }
        C6FP.A03(this.A01, this.A02, new C6FX().A00(), A0A);
    }

    @Override // X.XCz
    public final void DnH(int i) {
        InterfaceC103384lE A0B = this.A03.A0B(38);
        if (A0B != null) {
            DisplayMetrics A0K = AbstractC167007dF.A0K(this.A00);
            C14360o3.A07(A0K);
            int i2 = (int) (i / A0K.density);
            C102884kP c102884kP = this.A02;
            C6FX A0I = AbstractC31179DnN.A0I(c102884kP);
            C6FG c6fg = this.A01;
            A0I.A02(c6fg);
            A0I.A03(Integer.valueOf(i2), 2);
            AbstractC65702TsY.A1Q(c6fg, c102884kP, A0I, A0B);
        }
    }

    @Override // X.XCz
    public final void DnI(int i) {
        C102884kP c102884kP = this.A03;
        InterfaceC103384lE A0B = c102884kP.A0B(43);
        if (A0B != null) {
            DisplayMetrics A0K = AbstractC167007dF.A0K(this.A00);
            C14360o3.A07(A0K);
            int i2 = (int) (i / A0K.density);
            C102884kP c102884kP2 = this.A02;
            C6FX A0I = AbstractC31179DnN.A0I(c102884kP2);
            C6FG c6fg = this.A01;
            A0I.A02(c6fg);
            A0I.A03(Integer.valueOf(i2), 2);
            AbstractC65702TsY.A1Q(c6fg, c102884kP2, A0I, A0B);
            return;
        }
        InterfaceC103384lE A09 = c102884kP.A09();
        if (A09 == null) {
            return;
        }
        C6FP.A03(this.A01, this.A02, new C6FX().A00(), A09);
    }
}
