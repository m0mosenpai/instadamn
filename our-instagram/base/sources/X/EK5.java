package X;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;

/* loaded from: classes6.dex */
public final class EK5 extends AbstractC59962oe implements InterfaceC60112ot {
    public static final String __redex_internal_original_name = "MessageSearchScrimScreenFragment";
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public SearchEditText A07;
    public boolean A08;
    public final InterfaceC09390do A09 = AbstractC09440dt.A01(new C50153MDg(this, 21));
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        C35026Fbz c35026Fbz = new C35026Fbz(C05F.A00);
        c35026Fbz.A0A = ViewOnClickListenerC35691FpR.A00(this, 24);
        if (this.A08) {
            c35026Fbz.A04 = 0;
            c35026Fbz.A0B = AbstractC53242c7.A0L(requireContext(), R.attr.windowLightStatusBar, true);
        }
        C35026Fbz.A00(interfaceC56362iU, c35026Fbz);
        SearchEditText Ehl = interfaceC56362iU.Ehl();
        Ehl.setSearchIconEnabled(false);
        Ehl.requestFocus();
        Ehl.A06();
        Ehl.setHint("Search");
        C31703Dw8.A00(Ehl, this, 3);
        this.A07 = Ehl;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "message_search_scrim_screen_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A08) {
            View requireViewById = view.requireViewById(com.facebook.R.id.search_in_chat_scrim_action_bar);
            ViewGroup viewGroup = (ViewGroup) requireViewById;
            viewGroup.setVisibility(0);
            C14360o3.A07(requireViewById);
            new C56352iT(ViewOnClickListenerC35691FpR.A00(this, 25), viewGroup).A0X(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r0 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r5 = this;
            X.3DO r1 = X.C3DN.A00
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            X.3DN r3 = r1.A00(r0)
            X.8aR r2 = X.F86.A00(r3)
            r1 = 1
            if (r2 == 0) goto L32
            boolean r0 = r2.A0S()
            if (r0 == 0) goto L32
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = r2.A03
            androidx.fragment.app.Fragment r0 = r0.A0M()
            if (r0 == 0) goto L32
            boolean r0 = r0.equals(r5)
            if (r0 != r1) goto L32
            if (r3 == 0) goto L2a
            r3.A0Y()
        L2a:
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r5.A07
            if (r0 == 0) goto L31
            r0.A04()
        L31:
            return
        L32:
            X.0do r4 = r5.A0A
            X.0ll r2 = X.AbstractC166987dD.A0o(r4)
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36311560486191708(0x81012c0005025c, double:3.0269152941611327E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 != 0) goto L64
            X.0ll r2 = X.AbstractC166987dD.A0o(r4)
            r0 = 36311560487174763(0x81012c0014026b, double:3.0269152947828206E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 != 0) goto L64
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L2a
            X.0h2 r0 = r0.getSupportFragmentManager()
            if (r0 == 0) goto L2a
        L60:
            r0.A0b()
            goto L2a
        L64:
            X.0h2 r0 = r5.getParentFragmentManager()
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EK5.A00():void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return this.A08;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(1301698269);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (string != null) {
            this.A03 = string;
            String string2 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_NAME");
            if (string2 != null) {
                this.A04 = string2;
                String string3 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TYPE");
                if (string3 != null) {
                    this.A05 = string3;
                    this.A08 = requireArguments.getBoolean("FRAGMENT_ARGUMENT_SHOULD_RENDER_ACTION_BAR", false);
                    String string4 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CATEGORY");
                    if (string4 != null) {
                        this.A01 = string4;
                        this.A00 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CUTOVER_OPEN_THREAD_ID", null);
                        this.A06 = requireArguments.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_PENDING_RECIPIENTS");
                        this.A02 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_FBID", null);
                        C0f9.A09(-529533182, A02);
                        return;
                    }
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = -1951376686;
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = 1663870124;
                }
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = 2030786519;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -2086583198;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1850996508);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(com.facebook.R.layout.search_in_chat_scrim_screen, viewGroup, false);
        C0f9.A09(614393050, A02);
        return inflate;
    }
}
