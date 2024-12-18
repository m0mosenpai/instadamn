package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class ELx extends AbstractC59962oe implements InterfaceC37197Ga8, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ThreadDetailsPrivacyAndSafetyFragment";
    public Context A00;
    public RecyclerView A01;
    public InterfaceC37169GZg A02;
    public EQ1 A03;
    public E70 A04;
    public C18920wW A05;
    public Capabilities A06;
    public C31539DtP A07;
    public InterfaceC83733oI A08;
    public boolean A09;
    public final C41761wQ A0D = AbstractC31173DnH.A0S();
    public final InterfaceC190658cN A0E = new G9H(this, 15);
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);
    public final InterfaceC41501vz A0C = C31650DvG.A00(this, 29);
    public final InterfaceC42271xH A0B = C31728DwZ.A00(this, 6);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC31180DnO.A08(view);
        this.A03 = new EQ1(requireContext());
        if (this.A01 == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "ThreadDetailsPrivacyAndSafetyFragment - recycler view is null", 20134884);
        }
        RecyclerView recyclerView = this.A01;
        String str = "recyclerView";
        if (recyclerView != null) {
            AbstractC31177DnL.A0s(getContext(), recyclerView);
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.A03);
                C41761wQ c41761wQ = this.A0D;
                InterfaceC37169GZg interfaceC37169GZg = this.A02;
                if (interfaceC37169GZg != null) {
                    GKK.A00(interfaceC37169GZg.BOE().APK(), c41761wQ, this, 16);
                    InterfaceC37169GZg interfaceC37169GZg2 = this.A02;
                    if (interfaceC37169GZg2 != null) {
                        InterfaceC37279GbW.A00(interfaceC37169GZg2);
                        return;
                    }
                }
                str = "clientInfra";
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x036c, code lost:
    
        if (r4 != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0266, code lost:
    
        if (X.C18U.A06(r8, X.AbstractC166987dD.A0o(r15), 36324990848610950L) == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.ELx r38) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELx.A00(X.ELx):void");
    }

    @Override // X.InterfaceC37197Ga8
    public final void ChP() {
        InterfaceC37169GZg interfaceC37169GZg = this.A02;
        if (interfaceC37169GZg == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        InterfaceC37279GbW.A00(interfaceC37169GZg);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    public static final void A01(C31335Dq0 c31335Dq0, ArrayList arrayList, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC37156GYt interfaceC37156GYt = (InterfaceC37156GYt) it.next();
            if (interfaceC37156GYt.isEnabled()) {
                A1E.addAll(interfaceC37156GYt.getItems());
            }
        }
        if (AbstractC25226BEj.A1b(A1E)) {
            arrayList.add(c31335Dq0);
            arrayList.addAll(A1E);
        }
    }

    @Override // X.InterfaceC37197Ga8
    public final void APy() {
        A00(this);
    }

    @Override // X.InterfaceC37197Ga8
    public final void Ch3() {
        AbstractC25231BEo.A16(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131959133);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException A12;
        int i;
        Context context;
        String str;
        int A02 = C0f9.A02(1155096157);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Context requireContext = requireContext();
        Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        if (capabilities != null) {
            this.A06 = capabilities;
            InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            if (A00 != null) {
                this.A08 = A00;
                this.A09 = requireArguments.getBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_ELIGIBLE_FOR_DMM", false);
                int i2 = requireArguments.getInt(AbstractC111324zv.A00(18), 0);
                if (i2 != 0) {
                    context = new ContextThemeWrapper(requireContext, i2);
                } else {
                    context = requireContext;
                }
                this.A00 = context;
                InterfaceC09390do interfaceC09390do = this.A0A;
                this.A05 = AbstractC31176DnK.A0O(AbstractC166987dD.A0o(interfaceC09390do), __redex_internal_original_name);
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                InterfaceC83733oI interfaceC83733oI = this.A08;
                if (interfaceC83733oI == null) {
                    str = "threadId";
                } else {
                    Capabilities capabilities2 = this.A06;
                    if (capabilities2 == null) {
                        str = "threadCapabilities";
                    } else {
                        this.A02 = C7KH.A01(requireContext, A0r, capabilities2, interfaceC83733oI);
                        C31539DtP c31539DtP = new C31539DtP(AbstractC166987dD.A0r(interfaceC09390do), this, null);
                        this.A07 = c31539DtP;
                        registerLifecycleListener(c31539DtP);
                        InterfaceC37169GZg interfaceC37169GZg = this.A02;
                        if (interfaceC37169GZg == null) {
                            str = "clientInfra";
                        } else {
                            InterfaceC37279GbW.A01(interfaceC37169GZg);
                            C0f9.A09(1126365759, A02);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A12 = AbstractC31172DnG.A0t();
            i = 105514340;
        } else {
            A12 = AbstractC166987dD.A12("threadCapabilities can't be null");
            i = 1490756647;
        }
        C0f9.A09(i, A02);
        throw A12;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-580150304);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_privacy_safety_fragment, viewGroup, false);
        C0f9.A09(-2091044266, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(131745429);
        super.onDestroy();
        C31539DtP c31539DtP = this.A07;
        if (c31539DtP == null) {
            C14360o3.A0F("restrictController");
            throw C00O.createAndThrow();
        }
        unregisterLifecycleListener(c31539DtP);
        C0f9.A09(-1066806462, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2015308316);
        super.onDestroyView();
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(null);
        this.A03 = null;
        C0f9.A09(734064262, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1716684091);
        super.onPause();
        C25671My A0Q = AbstractC31176DnK.A0Q(this.A0A);
        A0Q.A02(this.A0C, C48032Iq.class);
        A0Q.A02(this.A0B, C42281xI.class);
        C0f9.A09(-442409296, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(703484576);
        super.onResume();
        C25671My A0Q = AbstractC31176DnK.A0Q(this.A0A);
        A0Q.A01(this.A0C, C48032Iq.class);
        A0Q.A01(this.A0B, C42281xI.class);
        C0f9.A09(-991577570, A02);
    }
}
