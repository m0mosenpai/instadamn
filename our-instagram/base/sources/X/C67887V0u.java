package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.V0u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67887V0u extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ProfileWizardHostingFragment";
    public int A00;
    public int A01;
    public View A02;
    public ProgressBar A03;
    public InterfaceC56362iU A04;
    public UserSession A05;
    public final C69672VtH A07 = new Object();
    public final View.OnClickListener A06 = new WNU(this, 54);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        this.A04 = interfaceC56362iU;
        int i = requireArguments().getInt("extra_number_of_steps", -1);
        this.A01 = i;
        if (i != -1) {
            interfaceC56362iU.Efu(2131956549);
            interfaceC56362iU.EkS(true);
            C3LO c3lo = new C3LO();
            c3lo.A0K = getString(2131974123);
            this.A02 = AbstractC31177DnL.A0F(new WNU(this, 55), c3lo, interfaceC56362iU);
            View A7w = interfaceC56362iU.A7w(R.layout.layout_profile_wizard_progress);
            C14360o3.A0C(A7w, AbstractC111324zv.A00(1));
            ProgressBar progressBar = (ProgressBar) A7w.requireViewById(R.id.profile_wizard_progress);
            this.A03 = progressBar;
            if (progressBar != null) {
                progressBar.setMax(this.A01);
            }
            A00(this, this.A00);
            return;
        }
        throw new IllegalStateException("extra_number_of_steps must be provided as Fragment's arguments.");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C1V4 c1v4 = C1V4.A00;
        if (c1v4 != null) {
            Iterator it = c1v4.A03().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93")) {
                    bundle.putString("ProfileWizardPlugin_CurrentSavedStepName", c1v4.A02("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93"));
                    return;
                }
            }
            return;
        }
        C14360o3.A0F("instance");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        if (bundle == null) {
            C69672VtH c69672VtH = this.A07;
            if (requireArguments.getString("DynamicFlowPlugin.extraFlowId") != null) {
                c69672VtH.A01(requireArguments, null);
            }
        }
    }

    public static final void A00(C67887V0u c67887V0u, int i) {
        int i2;
        C3LO c3lo;
        int i3;
        c67887V0u.A00 = i;
        ProgressBar progressBar = c67887V0u.A03;
        if (progressBar != null) {
            progressBar.setProgress(i + 1);
            int i4 = c67887V0u.A00;
            int i5 = c67887V0u.A01 - 1;
            View view = c67887V0u.A02;
            if (i4 < i5) {
                if (view != null) {
                    i2 = 0;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (view != null) {
                i2 = 8;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
            view.setVisibility(i2);
            int i6 = c67887V0u.A00;
            InterfaceC56362iU interfaceC56362iU = c67887V0u.A04;
            if (i6 == 0) {
                if (interfaceC56362iU != null) {
                    c3lo = AbstractC31176DnK.A0I();
                    c3lo.A0G = c67887V0u.A06;
                    i3 = 2131956237;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (interfaceC56362iU != null) {
                c3lo = new C3LO();
                c3lo.A00();
                c3lo.A0G = c67887V0u.A06;
                i3 = 2131953583;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
            c3lo.A05 = i3;
            interfaceC56362iU.Ehd(new C3LY(c3lo));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_wizard";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A05;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Bundle requireArguments = requireArguments();
        Integer num = C05F.A0Y;
        UserSession userSession = this.A05;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        C69672VtH c69672VtH = this.A07;
        String string = requireArguments.getString("DynamicFlowPlugin.extraFlowId");
        C1V1 A01 = C1V1.A01();
        if (string == null) {
            string = "";
        }
        String A02 = A01.A02(string);
        C14360o3.A07(A02);
        AbstractC69975Vyq.A01(userSession, num, A02);
        InterfaceC08430c6 A0O = getChildFragmentManager().A0O(R.id.content_panel);
        if ((A0O instanceof InterfaceC60072op) && ((InterfaceC60072op) A0O).onBackPressed()) {
            return true;
        }
        if (requireArguments.getString("DynamicFlowPlugin.extraFlowId") != null) {
            c69672VtH.A00(requireArguments, null);
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FragmentActivity activity;
        int A02 = C0f9.A02(1963845605);
        super.onCreate(bundle);
        requireArguments();
        this.A05 = AbstractC31176DnK.A0S(this);
        if (bundle != null && (activity = getActivity()) != null) {
            C1V4 c1v4 = C1V4.A00;
            if (c1v4 != null) {
                UserSession A0S = AbstractC31176DnK.A0S(this);
                if (((C1V0) C1V1.A01()).A01.get("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93") == null) {
                    if (bundle.getString("ProfileWizardPlugin_CurrentSavedStepName") != null) {
                        new C140966Yy(activity, A0S).A0G(VHn.A06.toString(), 1);
                    }
                    c1v4.A07(activity, A0S);
                }
            } else {
                C14360o3.A0F("instance");
                throw C00O.createAndThrow();
            }
        }
        C0f9.A09(1872635083, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1760930034);
        C14360o3.A0B(layoutInflater, 0);
        requireArguments();
        View inflate = layoutInflater.inflate(R.layout.layout_profile_completion_wizard, viewGroup, false);
        C0f9.A09(-1068597409, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1807364512);
        super.onDestroyView();
        this.A03 = null;
        this.A02 = null;
        C0f9.A09(868683934, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1038449565);
        super.onPause();
        AbstractC31179DnN.A1J(this, 0);
        C0f9.A09(1445313194, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-79830542);
        super.onResume();
        AbstractC31179DnN.A1J(this, 8);
        C0f9.A09(738816178, A02);
    }
}
