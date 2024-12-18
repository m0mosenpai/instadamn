package X;

import android.view.View;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Ank, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24161Ank implements InterfaceC195198kL {
    public final int A00;
    public final Object A01;

    public C24161Ank(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        InterfaceC1810081c interfaceC1810081c;
        switch (this.A00) {
            case 0:
                interfaceC1810081c = ((C23709Aei) this.A01).A0K;
                break;
            case 1:
                C70861WiR c70861WiR = (C70861WiR) this.A01;
                C70861WiR.A00(c70861WiR);
                interfaceC1810081c = c70861WiR.A0M;
                break;
            case 2:
                C70860WiQ c70860WiQ = (C70860WiQ) this.A01;
                C70860WiQ.A01(c70860WiQ);
                interfaceC1810081c = c70860WiQ.A0D;
                break;
            default:
                C23853Ah5 c23853Ah5 = (C23853Ah5) this.A01;
                IgEditText igEditText = c23853Ah5.A02;
                if (igEditText == null) {
                    C14360o3.A0F("stickerEditText");
                    throw C00O.createAndThrow();
                }
                igEditText.clearFocus();
                interfaceC1810081c = c23853Ah5.A0I;
                break;
        }
        InterfaceC1810081c.A00(interfaceC1810081c);
    }

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
        View view;
        int i3;
        switch (this.A00) {
            case 1:
                C70861WiR c70861WiR = (C70861WiR) this.A01;
                view = c70861WiR.A07;
                if (view == null) {
                    return;
                }
                i3 = ((C88W) c70861WiR.A0S.getValue()).A03.A01;
                break;
            case 2:
            default:
                return;
            case 3:
                C23853Ah5 c23853Ah5 = (C23853Ah5) this.A01;
                IgSimpleImageView igSimpleImageView = c23853Ah5.A03;
                if (igSimpleImageView == null) {
                    C14360o3.A0F("colorButton");
                    throw C00O.createAndThrow();
                }
                igSimpleImageView.setTranslationY(-i);
                view = AbstractC166987dD.A0d(c23853Ah5.A0N);
                i3 = AbstractC167017dG.A03(c23853Ah5.A0F) + c23853Ah5.A0J.A03.A01;
                break;
        }
        AbstractC13880nE.A0U(view, (i3 + i) - C1812982h.A00);
    }
}
