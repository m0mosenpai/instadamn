package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class JX3 extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ModalFragment";
    public C56352iT A00;
    public C3DN A01;
    public boolean A03;
    public boolean A04;
    public boolean A02 = true;
    public final C06N A06 = new JZQ(this, 3);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("BUNDLE_KEY_IS_RIGHT_PANE_MODAL", this.A04);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (i = bundle2.getInt("MODAL_FRAGMENT_ARG_BACKGROUND_COLOR")) != -1) {
            view.setBackgroundColor(i);
        }
        this.A00 = C56342iS.A01(new ViewOnClickListenerC48073LPy(this, 12), AbstractC31176DnK.A0C(view, R.id.action_bar_container));
        if (this.A03) {
            this.A01 = C3DN.A00.A00(getRootActivity());
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C3DN c3dn = this.A01;
        if (c3dn != null && c3dn.A0Y()) {
            return true;
        }
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        InterfaceC08430c6 A0O = childFragmentManager.A0O(R.id.child_container_view);
        if ((A0O instanceof InterfaceC60072op) && ((InterfaceC60072op) A0O).onBackPressed()) {
            return true;
        }
        if (childFragmentManager.A0L() <= 0 || childFragmentManager.A11()) {
            return false;
        }
        C55772hI.A00(AbstractC166987dD.A0o(this.A05)).A0C((InterfaceC11380iw) A0O, "back", childFragmentManager.A0L());
        childFragmentManager.A12();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        if (r1 > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ca, code lost:
    
        if (r2 != 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r6 = this;
            X.0h2 r0 = r6.getChildFragmentManager()
            r3 = 2131429916(0x7f0b0a1c, float:1.8481518E38)
            androidx.fragment.app.Fragment r2 = r0.A0O(r3)
            X.2iT r0 = r6.A00
            if (r0 == 0) goto Lca
            if (r2 == 0) goto L29
            X.C3DM.A00(r2, r0)
        L14:
            X.2iT r1 = r6.A00
            boolean r0 = r2 instanceof X.InterfaceC60112ot
            if (r0 == 0) goto L23
            r0 = r2
            X.2ot r0 = (X.InterfaceC60112ot) r0
            boolean r0 = r0.CPM()
            if (r0 != 0) goto L29
        L23:
            if (r1 == 0) goto Lac
            boolean r0 = r1.A0A
            if (r0 != 0) goto Lac
        L29:
            android.view.View r5 = r6.mView
            if (r5 == 0) goto L7a
            boolean r0 = r6.A03
            if (r0 != 0) goto L7a
            boolean r0 = r6.A02
            if (r0 == 0) goto L7a
            boolean r0 = r6.isAdded()
            if (r0 == 0) goto Laa
            X.0h2 r0 = r6.getChildFragmentManager()
            androidx.fragment.app.Fragment r2 = r0.A0O(r3)
        L43:
            boolean r1 = r2 instanceof X.C3KA
            r0 = 0
            if (r1 == 0) goto La8
            X.3KA r2 = (X.C3KA) r2
        L4a:
            r4 = 0
            if (r2 == 0) goto La6
            boolean r3 = r2.Cdf()
        L51:
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            boolean r0 = r2 instanceof X.InterfaceC53972db
            if (r0 == 0) goto L9d
            X.2db r2 = (X.InterfaceC53972db) r2
            if (r2 == 0) goto L9d
            com.instagram.mainactivity.InstagramMainActivity r2 = (com.instagram.mainactivity.InstagramMainActivity) r2
            int r1 = r2.A00
            r0 = -1
            if (r1 != r0) goto L6b
            java.lang.String r1 = "MainActivity_getStatusBarHeightStable"
            java.lang.String r0 = "Status bar has invalid stable value. This is most likely because it has not been calculated yet."
            X.C0w9.A03(r1, r0)
        L6b:
            int r1 = r2.A00
            if (r1 <= 0) goto L9d
        L6f:
            if (r3 == 0) goto L9b
            boolean r0 = X.AbstractC13440mV.A07()
            if (r0 != 0) goto L9b
        L77:
            X.AbstractC13880nE.A0d(r5, r4)
        L7a:
            boolean r0 = r6.isAdded()
            if (r0 == 0) goto L9a
            boolean r0 = r6.A03
            if (r0 != 0) goto L9a
            int r2 = X.C30D.A01
            if (r2 <= 0) goto L9a
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            if (r1 == 0) goto L9a
            r0 = 2131436559(0x7f0b240f, float:1.8494992E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L9a
            X.AbstractC13880nE.A0U(r0, r2)
        L9a:
            return
        L9b:
            r4 = r1
            goto L77
        L9d:
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            int r1 = X.AbstractC56402iY.A01(r0)
            goto L6f
        La6:
            r3 = 0
            goto L51
        La8:
            r2 = r0
            goto L4a
        Laa:
            r2 = 0
            goto L43
        Lac:
            boolean r0 = r2 instanceof X.InterfaceC60122ou
            if (r0 == 0) goto L29
            int r0 = X.C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            boolean r0 = X.AbstractC60622pl.A01(r2)
            if (r0 != 0) goto L29
            android.view.View r2 = r2.mView
            if (r2 == 0) goto L29
            android.content.Context r0 = X.AbstractC166997dE.A0L(r2)
            int r1 = X.C3HB.A00(r0)
            r0 = 0
            r2.setPadding(r0, r1, r0, r0)
            goto L29
        Lca:
            if (r2 == 0) goto L29
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JX3.A00():void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        InterfaceC08430c6 interfaceC08430c6;
        InterfaceC11380iw interfaceC11380iw;
        String moduleName;
        if (isAdded()) {
            interfaceC08430c6 = getChildFragmentManager().A0O(R.id.child_container_view);
        } else {
            interfaceC08430c6 = null;
        }
        if (!(interfaceC08430c6 instanceof InterfaceC11380iw) || (interfaceC11380iw = (InterfaceC11380iw) interfaceC08430c6) == null || (moduleName = interfaceC11380iw.getModuleName()) == null) {
            return "modal_fragment_empty";
        }
        return moduleName;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A02 = C0f9.A02(117439828);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        if (!isAdded() || getChildFragmentManager().A0O(R.id.child_container_view) == null) {
            String A01 = AbstractC153636vY.A01(requireArguments, "MODAL_FRAGMENT_ARG_CHILD_FRAGMENT_NAME");
            Bundle bundle2 = requireArguments.getBundle("MODAL_FRAGMENT_ARG_CHILD_FRAGMENT_ARGS");
            if (bundle2 != null) {
                InterfaceC09390do interfaceC09390do = this.A05;
                AbstractC03240Dh.A00(bundle2, AbstractC166987dD.A0o(interfaceC09390do));
                Fragment A00 = C6XL.A00(bundle2, requireActivity(), AbstractC166987dD.A0n(interfaceC09390do), A01);
                if (A00 != null) {
                    C14240no A0F = AbstractC43593JPy.A0F(this);
                    A0F.A0A(A00, R.id.child_container_view);
                    A0F.A0K();
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(1450731163, A02);
                throw A0g;
            }
        }
        getChildFragmentManager().A0r(this.A06);
        if (bundle != null) {
            z = bundle.getBoolean("BUNDLE_KEY_IS_RIGHT_PANE_MODAL");
        } else {
            z = requireArguments.getBoolean("MODAL_FRAGMENT_ARG_IS_RIGHT_PANE_MODAL");
        }
        this.A04 = z;
        this.A03 = requireArguments.getBoolean("MODAL_FRAGMENT_ARG_IS_TWO_PANE_MODAL");
        this.A02 = requireArguments.getBoolean("ARG_ADJUST_STATUS_BAR_OFFSET");
        C0f9.A09(367988357, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1572700376);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.modal_fragment, viewGroup, false);
        C0f9.A09(-1182946552, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1500025760);
        super.onDestroy();
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        childFragmentManager.A0F.remove(this.A06);
        C0f9.A09(444243753, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-130678706);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(-600605240, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1137690854);
        super.onResume();
        A00();
        C0f9.A09(-608428850, A02);
    }
}
