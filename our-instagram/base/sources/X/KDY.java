package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* loaded from: classes8.dex */
public final class KDY extends AbstractC59962oe implements InterfaceC1119153d, InterfaceC60152ox, InterfaceC30947Dj4, InterfaceC31150Dmu {
    public static final String __redex_internal_original_name = "FriendMapPresenceReplyFragment";
    public C45128JyU A00;
    public QuickSnapReactionEmitterView A01;
    public Long A02;
    public boolean A03;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final String A0L = "friend_map_presence_reply_fragment";
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);
    public final L8P A05 = new L8P();
    public final C3I9 A0J = C3I7.A01(this, false, true);
    public final C57112jm A0K = C57112jm.A00();
    public final C48766LhZ A04 = new C48766LhZ(this, 2);
    public final InterfaceC09390do A09 = MHN.A00(this, 1);
    public final InterfaceC09390do A08 = MHN.A00(this, 0);

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (i > 0) {
            this.A03 = true;
        } else {
            if (!this.A03) {
                return;
            }
            this.A03 = false;
            AbstractC25233BEq.A14(this);
        }
    }

    @Override // X.InterfaceC31150Dmu
    public final void Dd5(C45128JyU c45128JyU, String str) {
        C14360o3.A0B(str, 0);
        C45996KXk c45996KXk = (C45996KXk) this.A0B.getValue();
        EnumC152186t3 enumC152186t3 = (EnumC152186t3) this.A08.getValue();
        C14360o3.A0B(enumC152186t3, 1);
        C45996KXk.A00(enumC152186t3, c45996KXk, str);
        c45996KXk.A0M(C49424Lsy.A00);
        new LLR(this, AbstractC31175DnJ.A0K(this.A0C, 0)).A0E(str, false);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A0E;
        ((C148396m9) interfaceC09390do.getValue()).A00(AbstractC167007dF.A09(requireContext(), R.attr.igds_color_gradient_blue), false);
        ((C148396m9) interfaceC09390do.getValue()).A01(null, false, true);
        LO2.A00((TextView) this.A0A.getValue(), this, 15);
        ViewOnClickListenerC48074LPz.A01(AbstractC166987dD.A0d(this.A0D), 61, this);
        this.A05.A01(null, (IgBouncyUfiButtonImageView) this.A07.getValue());
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A0C, 0), 36321722382493464L)) {
            View rootView = view.getRootView();
            if ((rootView instanceof ViewGroup) && (viewGroup = (ViewGroup) rootView) != null) {
                QuickSnapReactionEmitterView quickSnapReactionEmitterView = new QuickSnapReactionEmitterView(AbstractC166997dE.A0L(view), null, 0);
                this.A01 = quickSnapReactionEmitterView;
                viewGroup.addView(quickSnapReactionEmitterView);
                InterfaceC09390do interfaceC09390do2 = this.A06;
                AbstractC43593JPy.A1W(interfaceC09390do2, 0);
                AbstractC47888LDi.A01(requireContext(), (ViewGroup) interfaceC09390do2.getValue(), this, this);
            }
        }
        C48769Lhc c48769Lhc = new C48769Lhc(this);
        C48771Lhe c48771Lhe = new C48771Lhe(this);
        C57112jm c57112jm = this.A0K;
        AbstractC37301Gc2.A0v(view, c57112jm, this);
        InterfaceC09390do interfaceC09390do3 = this.A09;
        C59072n8 A00 = C59062n7.A00(Long.valueOf(AbstractC167027dH.A03(((FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) interfaceC09390do3.getValue()).A02)), C0eB.A00, ((FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) interfaceC09390do3.getValue()).A02);
        A00.A00(new C48564Le1(c48769Lhc));
        A00.A00(new C45735KMn(c48771Lhe));
        AbstractC25227BEk.A10(view, A00, c57112jm);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A002 = C07Y.A00(viewLifecycleOwner);
        MCL mcl = new MCL(viewLifecycleOwner, c07s, this, null, 44);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, mcl, A002);
        AbstractC23641Du.A05(anonymousClass191, new MCL(A0K, c07s, this, null, 45), C07Y.A00(A0K));
    }

    @Override // X.InterfaceC30947Dj4
    public final C45128JyU B8i() {
        return this.A00;
    }

    @Override // X.InterfaceC58270PsO
    public final QuickSnapReactionEmitterView Bkf() {
        return this.A01;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        ((FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) this.A09.getValue()).A04.invoke();
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        InterfaceC09390do interfaceC09390do = this.A0A;
        AbstractC166987dD.A0d(interfaceC09390do).clearFocus();
        AbstractC13880nE.A0O(AbstractC166987dD.A0d(interfaceC09390do));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0L;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public KDY() {
        MHN mhn = new MHN(this, 3);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new MHN(new MHN(this, 6), 7));
        this.A0B = AbstractC25225BEi.A0a(new MHN(A00, 8), mhn, new ME1(40, null, A00), AbstractC25225BEi.A1D(C45996KXk.class));
        this.A0G = MHN.A00(this, 10);
        this.A0I = MHN.A00(this, 12);
        this.A0H = MHN.A00(this, 11);
        this.A0A = MHN.A00(this, 2);
        this.A06 = C50248MHd.A00(this, 48);
        this.A0F = MHN.A00(this, 9);
        this.A0D = MHN.A00(this, 4);
        this.A0E = MHN.A00(this, 5);
        this.A07 = C50248MHd.A00(this, 49);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2050225432);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.friend_map_presence_reply_sheet, false);
        C0f9.A09(824070945, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewGroup viewGroup;
        int A02 = C0f9.A02(491247396);
        this.A0K.A04(this.mView);
        super.onDestroyView();
        QuickSnapReactionEmitterView quickSnapReactionEmitterView = this.A01;
        if (quickSnapReactionEmitterView != null) {
            quickSnapReactionEmitterView.A01();
        }
        QuickSnapReactionEmitterView quickSnapReactionEmitterView2 = this.A01;
        ViewParent viewParent = null;
        if (quickSnapReactionEmitterView2 != null) {
            viewParent = quickSnapReactionEmitterView2.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            viewGroup.removeView(this.A01);
        }
        C0f9.A09(-606031957, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1246228352);
        super.onPause();
        C3I9 c3i9 = this.A0J;
        c3i9.onStop();
        c3i9.EFx(this);
        C0f9.A09(-1682122122, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1556359948);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A0A;
        AbstractC166987dD.A0d(interfaceC09390do).requestFocus();
        AbstractC13880nE.A0T(AbstractC166987dD.A0d(interfaceC09390do));
        C3I9 c3i9 = this.A0J;
        c3i9.Dnr(requireActivity());
        c3i9.A9e(this);
        C0f9.A09(-1695963805, A02);
    }
}
