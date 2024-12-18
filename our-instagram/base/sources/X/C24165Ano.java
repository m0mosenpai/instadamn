package X;

import android.view.ViewGroup;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Ano, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24165Ano implements C8I8 {
    public final /* synthetic */ AX0 A00;

    @Override // X.C8I8
    public final boolean COr() {
        return false;
    }

    @Override // X.C8I8
    public final void D1w(String str, String str2) {
    }

    @Override // X.C8I8
    public final void DmC() {
    }

    @Override // X.C8I8
    public final void DoI(boolean z) {
    }

    @Override // X.C8I8
    public final void Dzi(float f) {
    }

    public C24165Ano(AX0 ax0) {
        this.A00 = ax0;
    }

    @Override // X.C8I8
    public final void DoG(String str) {
        AX0 ax0 = this.A00;
        ShutterButton shutterButton = ax0.A03;
        if (shutterButton == null) {
            C14360o3.A0F("shutterButton");
            throw C00O.createAndThrow();
        }
        shutterButton.A03(C05F.A00);
        ax0.A08.A00();
        C23759AfW c23759AfW = ax0.A09;
        if (AbstractC167007dF.A1W(c23759AfW.A07)) {
            c23759AfW.E5s();
            c23759AfW.FBj(0.0f);
        }
        ViewGroup viewGroup = ax0.A07.A00;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    @Override // X.C8I8
    public final void Dp3(int i, String str) {
        AX0 ax0 = this.A00;
        ShutterButton shutterButton = ax0.A03;
        if (shutterButton == null) {
            C14360o3.A0F("shutterButton");
            throw C00O.createAndThrow();
        }
        shutterButton.Dp4(str);
        ax0.A08.A00.A01().A03.A09.A02();
        AbstractC167007dF.A0w(ax0.A07.A00);
    }
}
