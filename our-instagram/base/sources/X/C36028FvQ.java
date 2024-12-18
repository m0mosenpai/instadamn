package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.business.fragment.OnboardingCheckListFragment;

/* renamed from: X.FvQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36028FvQ implements XCT {
    public final int A00;
    public final Object A01;

    public C36028FvQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.XCT
    public final void onFailure(Throwable th) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                if (th != null) {
                    str2 = th.getMessage();
                } else {
                    str2 = "";
                }
                Fragment fragment = (Fragment) this.A01;
                if (fragment.getContext() == null) {
                    return;
                }
                C9GR.A03(fragment.getContext(), AbstractC13670mt.A06("An error occurred during the call: %s", str2), null, 1);
                return;
            case 2:
                EHR ehr = (EHR) this.A01;
                ehr.A02.invoke();
                ehr.A07();
                EHR.A01(ehr);
                return;
            case 7:
                AbstractC33631Eth abstractC33631Eth = (AbstractC33631Eth) this.A01;
                if (th == null || (str = th.getLocalizedMessage()) == null) {
                    str = "async controller launch failed";
                }
                abstractC33631Eth.A04(str);
                abstractC33631Eth.A02();
                return;
            default:
                return;
        }
    }

    @Override // X.XCT
    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                Fragment fragment = (Fragment) this.A01;
                if (fragment.getContext() == null) {
                    return;
                }
                C9GR.A03(fragment.getContext(), AbstractC13670mt.A06("The Async controller has been invoked!", new Object[0]), null, 1);
                return;
            case 1:
                OnboardingCheckListFragment onboardingCheckListFragment = (OnboardingCheckListFragment) this.A01;
                new C31500Dsk(onboardingCheckListFragment.A07, onboardingCheckListFragment).A01(new C32548EUy(this, 17), C05F.A04);
                return;
            case 2:
                EHR ehr = (EHR) this.A01;
                if (ehr.A03.get()) {
                    ehr.A02.invoke();
                }
                ehr.A07();
                EHR.A01(ehr);
                return;
            case 3:
            case 4:
            case 6:
            default:
                return;
            case 5:
                C146106i8 A0K = AbstractC31171DnF.A0K();
                ViewOnClickListenerC35610Fo1 viewOnClickListenerC35610Fo1 = (ViewOnClickListenerC35610Fo1) ((ViewOnClickListenerC35566FnI) this.A01).A02;
                AbstractC25226BEj.A1N((Context) viewOnClickListenerC35610Fo1.A02, A0K, 2131963399);
                AbstractC31178DnM.A1S(A0K);
                ((View) viewOnClickListenerC35610Fo1.A03).setEnabled(false);
                return;
            case 7:
                AbstractC33631Eth abstractC33631Eth = (AbstractC33631Eth) this.A01;
                abstractC33631Eth.A03();
                abstractC33631Eth.A02();
                return;
        }
    }
}
