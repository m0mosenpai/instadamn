package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes6.dex */
public final class EVM extends AbstractC60592pi {
    public BusinessNavBar A00;
    public InterfaceC37190Ga1 A01;
    public IgdsBottomButtonLayout A02;
    public boolean A03;
    public String A04;

    public EVM(InterfaceC37190Ga1 interfaceC37190Ga1, IgdsBottomButtonLayout igdsBottomButtonLayout, int i, int i2) {
        C14360o3.A0B(igdsBottomButtonLayout, 4);
        this.A01 = interfaceC37190Ga1;
        this.A02 = igdsBottomButtonLayout;
        Resources resources = igdsBottomButtonLayout.getResources();
        igdsBottomButtonLayout.setPrimaryActionText(resources.getString(i));
        boolean z = false;
        if (i2 != -1) {
            z = true;
            this.A04 = resources.getString(i2);
        }
        A02(z);
    }

    public final void A00() {
        this.A03 = false;
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.setShowProgressBarOnPrimaryButton(false);
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setPrimaryActionIsLoading(false);
            }
        }
        InterfaceC37190Ga1 interfaceC37190Ga1 = this.A01;
        if (interfaceC37190Ga1 != null) {
            interfaceC37190Ga1.ARU();
        }
    }

    public final void A01() {
        this.A03 = true;
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.setShowProgressBarOnPrimaryButton(true);
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setPrimaryActionIsLoading(true);
            }
        }
        InterfaceC37190Ga1 interfaceC37190Ga1 = this.A01;
        if (interfaceC37190Ga1 != null) {
            interfaceC37190Ga1.APP();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        ViewOnClickListenerC35690FpP A00 = ViewOnClickListenerC35690FpP.A00(this, 64);
        ViewOnClickListenerC35690FpP A002 = ViewOnClickListenerC35690FpP.A00(this, 65);
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.setPrimaryButtonOnclickListeners(A00);
            BusinessNavBar businessNavBar2 = this.A00;
            if (businessNavBar2 != null) {
                businessNavBar2.setSecondaryButtonOnclickListeners(A002);
                return;
            }
            return;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout == null) {
            return;
        }
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(A00);
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A02;
        if (igdsBottomButtonLayout2 == null) {
            return;
        }
        igdsBottomButtonLayout2.setSecondaryActionOnClickListener(A002);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
    }

    public final void A02(boolean z) {
        String str;
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.A02(z);
            return;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout == null) {
            return;
        }
        if (z) {
            str = this.A04;
        } else {
            str = null;
        }
        igdsBottomButtonLayout.setSecondaryActionText(str);
    }

    public EVM(BusinessNavBar businessNavBar, InterfaceC37190Ga1 interfaceC37190Ga1, int i, int i2) {
        this.A01 = interfaceC37190Ga1;
        this.A00 = businessNavBar;
        if (businessNavBar != null) {
            businessNavBar.setPrimaryButtonText(i);
        }
        BusinessNavBar businessNavBar2 = this.A00;
        if (i2 != -1) {
            if (businessNavBar2 != null) {
                businessNavBar2.setSecondaryButtonText(i2);
            }
        } else {
            if (businessNavBar2 == null) {
                return;
            }
            businessNavBar2.A02(false);
        }
    }
}
