package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class N7W extends C38K implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AccessibilitySettingsFragment";
    public UserSession A00;
    public C50802McJ A01;
    public C44565Jnm A02;
    public final LinkedHashMap A05 = AbstractC166987dD.A1I();
    public boolean A03 = false;
    public boolean A04 = false;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "accessibility_settings";
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A00;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ?? obj = new Object();
        obj.A02 = AbstractC166997dE.A0N(this).getString(2131952962);
        ActionButton A00 = C31722DwR.A00(new ViewOnClickListenerC55460OkF(this, 64), interfaceC56362iU, obj);
        A00.setVisibility(0);
        interfaceC56362iU.setIsLoading(false);
        A00.setEnabled(true);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C3DN A0r = AbstractC31172DnG.A0r(getActivity());
        if (A0r != null && A0r.A0Y()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        boolean z;
        boolean z2;
        int A02 = C0f9.A02(-1894914980);
        super.onCreate(bundle);
        ArrayList A1E = AbstractC166987dD.A1E();
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        LinkedHashMap A1I2 = AbstractC166987dD.A1I();
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A03 = requireArguments.getBoolean("is_edit_flow");
        boolean z3 = requireArguments.getBoolean("should_load_media_from_path");
        this.A04 = z3;
        if (!this.A03 && !z3) {
            FragmentActivity activity = getActivity();
            if ((activity instanceof InterfaceC189628ah) && (activity instanceof InterfaceC189598ae)) {
                AnonymousClass841 anonymousClass841 = ((InterfaceC189608af) activity).Ak4().A00;
                InterfaceC189598ae interfaceC189598ae = (InterfaceC189598ae) activity;
                if (anonymousClass841 != null && interfaceC189598ae != null) {
                    Iterator A0n = MSX.A0n(anonymousClass841);
                    while (A0n.hasNext()) {
                        String BcD = MSW.A0R(A0n).BcD();
                        C47Z BcC = interfaceC189598ae.BcC(BcD);
                        if (BcC != null && !BcC.A11()) {
                            A1E.add(BcC.A33);
                            this.A05.put(BcD, BcC.A2j);
                            A1I2.put(BcC.A33, BcD);
                            A1I.put(BcC.A33, Float.valueOf(BcC.A01()));
                        }
                    }
                }
                if (A1E.size() > 1) {
                    this.A02 = new C44565Jnm(activity, this.A00, A1I, this.A05, A1I2, A1E);
                }
                linkedHashMap = this.A05;
                z = this.A03;
                z2 = this.A04;
                linkedHashMap2 = null;
                this.A01 = new C50802McJ(this, this.A00, linkedHashMap, linkedHashMap2, z, z2);
            }
        } else {
            linkedHashMap = (LinkedHashMap) requireArguments.getSerializable("media_key_to_alt");
            linkedHashMap2 = (LinkedHashMap) requireArguments.getSerializable("media_key_to_path");
            if (linkedHashMap != null && linkedHashMap2 != null) {
                z = true;
                z2 = this.A04;
                this.A01 = new C50802McJ(this, this.A00, linkedHashMap, linkedHashMap2, z, z2);
            }
        }
        A0U(this.A01);
        C0f9.A09(-182834597, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1965773359);
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) getRootActivity()).EfL(8);
        }
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_alt_text);
        C0f9.A09(-1679375197, A02);
        return A0A;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1400807151);
        super.onDestroyView();
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) getRootActivity()).EfL(0);
        }
        C0f9.A09(1768741370, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1865034031);
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getWindow() != null) {
            activity.getWindow().setSoftInputMode(48);
        }
        C0f9.A09(1361410417, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-686550858);
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getWindow() != null) {
            activity.getWindow().setSoftInputMode(16);
        }
        C0f9.A09(744954672, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View A0I;
        super.onViewCreated(view, bundle);
        ListView A02 = AbstractC37300Gc1.A02(this);
        if (A02 != null) {
            A02.setRecyclerListener(new C55514Ol7(this));
            if (!this.A03 && !this.A04) {
                TextView A0T = AbstractC166997dE.A0T(view, R.id.alt_text_info_text_view);
                A0T.setVisibility(0);
                Resources A0N = AbstractC166997dE.A0N(this);
                int i = 1;
                if (this.A02 != null) {
                    i = 2;
                }
                A0T.setText(A0N.getQuantityString(R.plurals.alt_text_popup_description, i));
                TextView A0T2 = AbstractC166997dE.A0T(view, R.id.alt_text_link_text_view);
                String string = getString(2131952959);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(string);
                AnonymousClass773.A05(A0H, new NY0(AbstractC31174DnI.A0q(requireContext(), AbstractC53242c7.A0C(requireContext())), this, 3), string);
                A0T2.setMovementMethod(C6R6.A00);
                A0T2.setVisibility(0);
                A0T2.setText(A0H);
                if (AbstractC56862jK.A00(getContext())) {
                    C0fQ.A00(new ViewOnClickListenerC55460OkF(this, 62), A0T2);
                }
            }
            C44565Jnm c44565Jnm = this.A02;
            if (c44565Jnm != null) {
                A02.setVisibility(8);
                RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.alt_text_carousel_view);
                A0G.setVisibility(0);
                A0G.setAdapter(c44565Jnm);
            }
        }
        if (this.A03) {
            A02.addHeaderView(AbstractC31175DnJ.A06(this).inflate(R.layout.header_row_alt_text, (ViewGroup) A02, false));
        } else {
            if (this.A04 || (A0I = AbstractC50522MSa.A0I(requireActivity(), new ViewOnClickListenerC55460OkF(this, 63), C05F.A01, true)) == null) {
                return;
            }
            AbstractC31172DnG.A1E(AbstractC166997dE.A0N(this), A0I, 2131972699);
        }
    }
}
