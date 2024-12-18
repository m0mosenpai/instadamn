package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* renamed from: X.Rb7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60893Rb7 extends C53Z implements InterfaceC60072op, InterfaceC65384TjH, InterfaceC60452pT {
    public static final String __redex_internal_original_name = "FBPayIg4aContainerFragment";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Fragment A04;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        if (childFragmentManager.A0O(R.id.container_fragment) == null) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                String string = bundle2.getString("CHILD_FRAGMENT_IDENTIFIER");
                if (string != null) {
                    Bundle bundle3 = this.mArguments;
                    if (bundle3 != null) {
                        Bundle bundle4 = bundle3.getBundle("CHILD_FRAGMENT_BUNDLE");
                        if (this instanceof C60958Rcg) {
                            A04 = C2FP.A0E().A04(bundle4, string);
                        } else if (this instanceof C60956Rce) {
                            A04 = C2FP.A03().A04.A01(bundle4, string);
                            C14360o3.A07(A04);
                        } else {
                            A04 = C2FP.A02().A04(bundle4, string);
                        }
                        C07K.A02(this);
                        A04.setTargetFragment(null, this.mTargetRequestCode);
                        C14240no c14240no = new C14240no(childFragmentManager);
                        c14240no.A0A(A04, R.id.container_fragment);
                        c14240no.A00();
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.InterfaceC65384TjH
    public final boolean DIB(Bundle bundle, int i, boolean z) {
        if (this instanceof C60958Rcg) {
            if (SSB.A01(bundle, this, z) || ((getChildFragmentManager().A0O(R.id.container_fragment) instanceof InterfaceC65384TjH) && ((InterfaceC65384TjH) getChildFragmentManager().A0O(R.id.container_fragment)).DIB(bundle, i, z))) {
                return true;
            }
            return false;
        }
        return SSB.A01(bundle, this, z);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "FBPAY_CONTAINER_FRAGMENT";
    }

    @Override // X.InterfaceC60452pT
    public final boolean CJv(int i, KeyEvent keyEvent) {
        getChildFragmentManager().A0O(R.id.container_fragment);
        return false;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC08430c6 A0O = getChildFragmentManager().A0O(R.id.container_fragment);
        if (A0O instanceof InterfaceC65382TjF) {
            return ((InterfaceC65382TjF) A0O).onBackPressed();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(334316684);
        super.onCreate(bundle);
        C0f9.A09(1138514474, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1809668870);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fbpay_container_fragment, viewGroup, false);
        C0f9.A09(1920660584, A02);
        return inflate;
    }
}
