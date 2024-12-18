package X;

import com.instagram.bugreporter.BugReportSevereSwitchView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes9.dex */
public final class PHZ implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public PHZ(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        if (this.A00 != 0 && this.A02) {
            ((APn) this.A01).A04();
        }
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        IgdsSwitch igdsSwitch;
        if (this.A00 == 0 && this.A02 && (igdsSwitch = ((BugReportSevereSwitchView) this.A01).A05) != null) {
            igdsSwitch.setChecked(false);
        }
    }
}
