package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bs6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC26782Bs6 extends AbstractC59962oe implements InterfaceC60122ou, InterfaceC114475Er {
    public static final String __redex_internal_original_name = "OpalBaseFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final C29154CtL A01 = new C29154CtL(this);

    public void A08(boolean z) {
        FragmentActivity requireActivity = requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(this.A00);
        if (z) {
            AbstractC145016gM.A03(requireActivity, this, A0r, true, false);
        } else {
            AbstractC145016gM.A02(requireActivity, this, A0r, true, false);
        }
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        boolean A07 = C14640oc.A07();
        Context requireContext = requireContext();
        int i = R.color.black;
        if (A07) {
            i = R.color.igds_prism_black;
        }
        Drawable drawable = requireContext.getDrawable(i);
        if (drawable != null) {
            interfaceC56362iU.EPD(drawable);
        }
        A08(true);
    }

    public final UserSession A07() {
        return AbstractC166987dD.A0r(this.A00);
    }

    @Override // X.InterfaceC114475Er
    public final boolean EpU() {
        if (this instanceof C0O) {
            C0O c0o = (C0O) this;
            InterfaceC09390do interfaceC09390do = ((AbstractC26782Bs6) c0o).A00;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            if (C18U.A06(AbstractC166997dE.A0U(A0r), A0r, 36321043774841955L) && C2TN.A05(AbstractC166987dD.A0r(interfaceC09390do), c0o.A05)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1103621507);
        super.onCreate(bundle);
        addFragmentVisibilityListener(this.A01);
        A08(true);
        C0f9.A09(1603707508, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroy() {
        int A02 = C0f9.A02(-1799972432);
        super.onDestroy();
        removeFragmentVisibilityListener(this.A01);
        C0f9.A09(-1269920532, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        boolean z;
        int A02 = C0f9.A02(1830172168);
        super.onPause();
        if (!(this instanceof C0L) && !(this instanceof C0K)) {
            if (this instanceof C0O) {
                z = ((C0O) this).A09;
            } else if (!(this instanceof C0N)) {
                z = ((C0M) this).A00;
            }
            if (z) {
                A08(false);
            }
        }
        C0f9.A09(1995773103, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(1330730282);
        super.onResume();
        A08(true);
        C0f9.A09(-2075290763, A02);
    }
}
