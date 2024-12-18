package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.FxB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36137FxB implements InterfaceC41501vz {
    public final /* synthetic */ EKE A00;

    public C36137FxB(EKE eke) {
        this.A00 = eke;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        RegFlowExtras regFlowExtras;
        C140966Yy A0r;
        Bundle A0b;
        Fragment abstractC32319ELj;
        int A03 = C0f9.A03(-2081279229);
        C36050Fvm c36050Fvm = (C36050Fvm) obj;
        int A032 = C0f9.A03(1319395224);
        EKE eke = this.A00;
        String A00 = AbstractC35259Fgt.A00(eke.A09, eke.A0B);
        String str = c36050Fvm.A02;
        if (!A00.equals(str)) {
            C0w9.A03("PhoneConfirmationFragment.PhoneConfirmedSuccessfullyEventListener", AbstractC13670mt.A06("Unexpected phone number got confirmed. Expected: %s Actual: %s", AbstractC35259Fgt.A00(eke.A09, eke.A0B), str));
            i = 620349918;
        } else {
            if (eke.A0E && (regFlowExtras = eke.A06) != null) {
                regFlowExtras.A0Q = str;
                regFlowExtras.A05 = c36050Fvm.A01;
                if (!regFlowExtras.A0u) {
                    AbstractC34902FZo.A01(eke, eke.A01, c36050Fvm, regFlowExtras, eke.C0Q());
                }
                if (eke.getActivity() != null) {
                    EnumC33445EqI enumC33445EqI = EnumC33445EqI.A07;
                    RegFlowExtras regFlowExtras2 = eke.A06;
                    if (enumC33445EqI == regFlowExtras2.A01()) {
                        if (regFlowExtras2.A0t) {
                            regFlowExtras2.A0u = false;
                            A0r = AbstractC25225BEi.A0r(eke.requireActivity(), eke.A01);
                            RegFlowExtras regFlowExtras3 = eke.A06;
                            A0b = AbstractC166987dD.A0b();
                            A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras3);
                            abstractC32319ELj = new AbstractC59962oe();
                        } else if (regFlowExtras2.A0u) {
                            regFlowExtras2.A0u = false;
                            eke.A0G = true;
                            AbstractC35794FrW.A02(AbstractC167007dF.A0J(), eke, eke, eke.A01, null, eke, regFlowExtras2, eke.A07, eke.C0Q(), regFlowExtras2.A0Z, null, false);
                        } else {
                            A0r = AbstractC25225BEi.A0r(eke.requireActivity(), eke.A01);
                            RegFlowExtras regFlowExtras4 = eke.A06;
                            A0b = AbstractC166987dD.A0b();
                            A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras4);
                            abstractC32319ELj = new AbstractC32319ELj();
                        }
                        AbstractC31175DnJ.A0u(A0b, abstractC32319ELj, A0r);
                        A0r.A04();
                    }
                }
                AbstractC167007dF.A0J().post(new RunnableC36946GPp(eke, eke.A01, eke.A06));
            }
            i = -2016232001;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(1648641595, A03);
    }
}
