package X;

import android.os.Build;
import androidx.biometric.BiometricFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import java.util.concurrent.Executor;

/* renamed from: X.SXe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62922SXe {
    public AbstractC10360h2 A00;

    public static void A00(C63291Sgr c63291Sgr, SH3 sh3, C62922SXe c62922SXe) {
        String str;
        AbstractC10360h2 abstractC10360h2 = c62922SXe.A00;
        if (abstractC10360h2 == null) {
            str = "Unable to start authentication. Client fragment manager was null.";
        } else if (abstractC10360h2.A11()) {
            str = "Unable to start authentication. Called after onSaveInstanceState().";
        } else {
            BiometricFragment biometricFragment = (BiometricFragment) abstractC10360h2.A0Q("androidx.biometric.BiometricFragment");
            if (biometricFragment == null) {
                biometricFragment = new BiometricFragment();
                C14240no c14240no = new C14240no(abstractC10360h2);
                c14240no.A0B(biometricFragment, "androidx.biometric.BiometricFragment");
                c14240no.A01();
                abstractC10360h2.A0Z();
            }
            biometricFragment.A09(c63291Sgr, sh3);
            return;
        }
        android.util.Log.e("BiometricPromptCompat", str);
    }

    public final void A01(C63291Sgr c63291Sgr, SH3 sh3) {
        int i = sh3.A00;
        if (i != 0) {
            if ((i & 255) == 255) {
                throw AbstractC166987dD.A12("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
        } else {
            i = 15;
        }
        if (Build.VERSION.SDK_INT < 30 && (i & Constants.LOAD_RESULT_PGO) != 0) {
            throw AbstractC166987dD.A12("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        A00(c63291Sgr, sh3, this);
    }

    public C62922SXe(AbstractC61269Rkf abstractC61269Rkf, Fragment fragment, Executor executor) {
        C58772Q8e c58772Q8e;
        if (executor != null) {
            FragmentActivity activity = fragment.getActivity();
            AbstractC10360h2 childFragmentManager = fragment.getChildFragmentManager();
            if (activity != null) {
                c58772Q8e = AbstractC58320PtC.A0H(activity);
                if (c58772Q8e != null) {
                    fragment.mLifecycleRegistry.A09(new C63611SqJ(c58772Q8e));
                }
            } else {
                c58772Q8e = null;
            }
            this.A00 = childFragmentManager;
            if (c58772Q8e != null) {
                c58772Q8e.A0H = executor;
                c58772Q8e.A04 = abstractC61269Rkf;
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12("Executor must not be null.");
    }
}
