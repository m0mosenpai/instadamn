package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes10.dex */
public abstract class SSB {
    public static final boolean A01(Bundle bundle, Fragment fragment, boolean z) {
        InterfaceC08430c6 targetFragment = fragment.getTargetFragment();
        if (targetFragment instanceof InterfaceC65384TjH) {
            C07K.A02(fragment);
            if (((InterfaceC65384TjH) targetFragment).DIB(bundle, fragment.mTargetRequestCode, z)) {
                return true;
            }
        }
        InterfaceC08430c6 interfaceC08430c6 = fragment.mParentFragment;
        if (interfaceC08430c6 instanceof InterfaceC65384TjH) {
            C07K.A02(fragment);
            if (((InterfaceC65384TjH) interfaceC08430c6).DIB(bundle, fragment.mTargetRequestCode, z)) {
                return true;
            }
        }
        C1UC activity = fragment.getActivity();
        if (!(activity instanceof InterfaceC65384TjH)) {
            return false;
        }
        C07K.A02(fragment);
        return ((InterfaceC65384TjH) activity).DIB(bundle, fragment.mTargetRequestCode, z);
    }

    public static void A00(Bundle bundle, Fragment fragment, boolean z) {
        A01(bundle, fragment, z);
        C63307ShD A0E = C2FP.A0E();
        C62876SVa c62876SVa = A0E.A02;
        if (c62876SVa == null) {
            c62876SVa = new C62876SVa(A0E.A09);
            A0E.A02 = c62876SVa;
        }
        new C140966Yy(fragment.requireActivity(), c62876SVa.A00).A06();
    }
}
