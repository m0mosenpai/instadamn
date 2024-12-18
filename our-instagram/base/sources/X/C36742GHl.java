package X;

import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.GHl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36742GHl implements InterfaceC37212GaN {
    public final /* synthetic */ EK3 A00;

    @Override // X.InterfaceC37212GaN
    public final void CxI() {
    }

    @Override // X.InterfaceC37212GaN
    public final boolean DCu(int i) {
        boolean z = false;
        if (i == 2) {
            z = true;
            EK3 ek3 = this.A00;
            ProgressButton progressButton = ek3.A01;
            if (progressButton == null) {
                C14360o3.A0F("nextButton");
                throw C00O.createAndThrow();
            }
            if (progressButton.isEnabled()) {
                EK3.A00(ek3);
            }
        }
        return z;
    }

    @Override // X.InterfaceC37212GaN
    public final void DYO() {
    }

    @Override // X.InterfaceC37212GaN
    public final void Dx4() {
    }

    @Override // X.InterfaceC37212GaN
    public final void DyV() {
    }

    public C36742GHl(EK3 ek3) {
        this.A00 = ek3;
    }
}
