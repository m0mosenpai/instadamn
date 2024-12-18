package X;

import android.content.Intent;
import android.view.View;
import android.view.ViewStub;

/* loaded from: classes11.dex */
public final class WUF implements InterfaceC65594Tnc {
    public ViewStub A00;
    public ViewStub A01;
    public InterfaceC71996XEk A02;
    public InterfaceC172717mh A03;
    public InterfaceC172727mi A04;

    @Override // X.InterfaceC65594Tnc
    public final void AJL(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC71996XEk interfaceC71996XEk = this.A02;
        if (interfaceC71996XEk != null) {
            interfaceC71996XEk.AJL(z, i, i2, i3, 8);
        }
    }

    @Override // X.InterfaceC65594Tnc
    public final void CO4() {
        InterfaceC71996XEk interfaceC71996XEk = this.A02;
        if (interfaceC71996XEk != null) {
            interfaceC71996XEk.CO4();
        }
    }

    @Override // X.InterfaceC65594Tnc
    public final void Coq() {
        InterfaceC71996XEk interfaceC71996XEk = this.A02;
        if (interfaceC71996XEk != null) {
            interfaceC71996XEk.Coq();
        }
    }

    @Override // X.InterfaceC65594Tnc
    public final void DxY(String str) {
        InterfaceC71996XEk interfaceC71996XEk = this.A02;
        if (interfaceC71996XEk != null) {
            interfaceC71996XEk.DxY(str);
        }
    }

    @Override // X.InterfaceC65594Tnc
    public final void ETv(int i) {
        InterfaceC71996XEk interfaceC71996XEk = this.A02;
        if (interfaceC71996XEk != null) {
            interfaceC71996XEk.Ekr(i);
        }
    }

    @Override // X.InterfaceC65594Tnc
    public final void EbW(Intent intent, String str, int i) {
        ViewStub viewStub = this.A00;
        viewStub.setLayoutResource(i);
        InterfaceC71996XEk interfaceC71996XEk = (InterfaceC71996XEk) viewStub.inflate();
        this.A02 = interfaceC71996XEk;
        if (intent != null) {
            interfaceC71996XEk.setIntent(intent);
        }
        InterfaceC71996XEk interfaceC71996XEk2 = this.A02;
        interfaceC71996XEk2.setControllers(this.A03, this.A04);
        interfaceC71996XEk2.CNz();
        Object obj = this.A02;
        if (obj != null && str != null && str.equals("watch_and_browse")) {
            AbstractC31174DnI.A1C((View) obj, -16777216);
        }
        ((View) this.A02).bringToFront();
    }

    @Override // X.InterfaceC65594Tnc
    public final boolean Ell() {
        InterfaceC71996XEk interfaceC71996XEk = this.A02;
        if (interfaceC71996XEk == null) {
            return false;
        }
        return interfaceC71996XEk.Ell();
    }

    @Override // X.InterfaceC65594Tnc
    public final int getHeightPx() {
        InterfaceC71996XEk interfaceC71996XEk = this.A02;
        if (interfaceC71996XEk == null) {
            return 0;
        }
        return interfaceC71996XEk.getHeightPx();
    }

    @Override // X.InterfaceC65594Tnc
    public final void setProgress(int i) {
        InterfaceC71996XEk interfaceC71996XEk = this.A02;
        if (interfaceC71996XEk != null) {
            interfaceC71996XEk.setProgress(i);
        }
    }

    @Override // X.InterfaceC65594Tnc
    public final void setProgressBarVisibility(int i) {
        InterfaceC71996XEk interfaceC71996XEk = this.A02;
        if (interfaceC71996XEk != null) {
            interfaceC71996XEk.setProgressBarVisibility(i);
        }
    }
}
