package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.ELv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32327ELv extends AbstractC59962oe implements InterfaceC37157GYu, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ThreadDetailsChatControlsFragment";
    public C32424EPz A01;
    public InterfaceC37169GZg A02;
    public C35737FqK A03;
    public E70 A04;
    public C2056398n A05;
    public boolean A06;
    public boolean A07;
    public RecyclerView A08;
    public Capabilities A09;
    public InterfaceC83733oI A0A;
    public final C41761wQ A0E = AbstractC31173DnH.A0S();
    public int A00 = -1;
    public final InterfaceC190658cN A0B = new G9H(this, 11);
    public final C31728DwZ A0D = C31728DwZ.A00(this, 3);
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC37157GYu
    public final void AHL() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A08 = AbstractC31180DnO.A08(view);
        C32424EPz c32424EPz = new C32424EPz(requireContext());
        this.A01 = c32424EPz;
        RecyclerView recyclerView = this.A08;
        String str = "recyclerView";
        if (recyclerView != null) {
            recyclerView.setAdapter(c32424EPz);
            RecyclerView recyclerView2 = this.A08;
            if (recyclerView2 != null) {
                AbstractC31177DnL.A0s(getContext(), recyclerView2);
                C41761wQ c41761wQ = this.A0E;
                InterfaceC37169GZg interfaceC37169GZg = this.A02;
                if (interfaceC37169GZg != null) {
                    GKK.A00(interfaceC37169GZg.BOE().APK(), c41761wQ, this, 6);
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    @Override // X.InterfaceC37157GYu
    public final void Ch3() {
        FragmentActivity requireActivity = requireActivity();
        if (!AbstractC46763KmK.A00(requireActivity)) {
            this.A0E.A01();
            requireActivity.finish();
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131959079);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException A12;
        int i;
        String str;
        int A02 = C0f9.A02(-237986753);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        if (capabilities != null) {
            this.A09 = capabilities;
            InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            if (A00 != null) {
                this.A0A = A00;
                this.A00 = requireArguments.getInt("DirectFragment.DIRECT_FRAGMENT_THREAD_POSITION", -1);
                this.A07 = requireArguments.getBoolean("DirectThreadDetailFragment.TRANSLATION_FROM_BANNER", false);
                InterfaceC09390do interfaceC09390do = this.A0C;
                this.A05 = AbstractC2056298m.A00(AbstractC166987dD.A0r(interfaceC09390do));
                Context requireContext = requireContext();
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                InterfaceC83733oI interfaceC83733oI = this.A0A;
                if (interfaceC83733oI == null) {
                    str = "threadId";
                } else {
                    Capabilities capabilities2 = this.A09;
                    if (capabilities2 == null) {
                        str = "threadCapabilities";
                    } else {
                        InterfaceC37169GZg A01 = C7KH.A01(requireContext, A0r, capabilities2, interfaceC83733oI);
                        this.A02 = A01;
                        C41761wQ c41761wQ = this.A0E;
                        str = "clientInfra";
                        if (A01 != null) {
                            C2056398n c2056398n = this.A05;
                            if (c2056398n == null) {
                                str = "preferences";
                            } else {
                                this.A03 = new C35737FqK(AbstractC31176DnK.A0O(AbstractC166987dD.A0o(interfaceC09390do), __redex_internal_original_name), c41761wQ, A01, c2056398n);
                                InterfaceC37169GZg interfaceC37169GZg = this.A02;
                                if (interfaceC37169GZg != null) {
                                    InterfaceC37279GbW.A01(interfaceC37169GZg);
                                    C0f9.A09(-1600964822, A02);
                                    return;
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A12 = AbstractC31172DnG.A0t();
            i = -897989294;
        } else {
            A12 = AbstractC166987dD.A12("threadCapabilities can't be null");
            i = 566785506;
        }
        C0f9.A09(i, A02);
        throw A12;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1564747576);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_chat_controls_fragment, viewGroup, false);
        C0f9.A09(-1253760941, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(262379311);
        super.onPause();
        AbstractC31176DnK.A0Q(this.A0C).A02(this.A0D, C2Io.class);
        C0f9.A09(-746005184, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-889786814);
        super.onResume();
        AbstractC31176DnK.A0Q(this.A0C).A01(this.A0D, C2Io.class);
        C0f9.A09(1427009387, A02);
    }
}
