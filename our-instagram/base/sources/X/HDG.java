package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HDG extends C38K implements InterfaceC62602sz, InterfaceC60442pS, AbsListView.OnScrollListener {
    public static final String __redex_internal_original_name = "BakeoffAdCardFragment";
    public C33P A00;
    public C38977HEf A01;
    public C3CO A02;
    public final InterfaceC09390do A03;
    public final C61372qz A05 = new C61372qz();
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(1896);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC37300Gc1.A02(this).setOnScrollListener(this);
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A04);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        C38977HEf c38977HEf = this.A01;
        if (c38977HEf == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return AbstractC166987dD.A1b(((AbstractC65332xV) c38977HEf.A04).A01);
    }

    public HDG() {
        C43203J8a c43203J8a = new C43203J8a(this, 28);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43203J8a(new C43203J8a(this, 29), 30));
        this.A03 = AbstractC25225BEi.A0a(new C43203J8a(A00, 31), c43203J8a, new D8I(32, null, A00), AbstractC25225BEi.A1D(Object.class));
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [X.36e, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-743415178);
        super.onCreate(bundle);
        String string = requireArguments().getString("BakeoffAdCardFragment.ARGUMENTS_MEDIA_ID");
        InterfaceC09390do interfaceC09390do = this.A04;
        C38321qM A0F = AbstractC37304Gc5.A0F(string, interfaceC09390do);
        if (A0F == null) {
            AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
            if (abstractC10360h2 != null) {
                abstractC10360h2.A0b();
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = 1243591912;
                C0f9.A09(i, A02);
                throw A14;
            }
        }
        C155376yQ c155376yQ = new C155376yQ(AbstractC166987dD.A0r(interfaceC09390do));
        C1M0 A01 = C1M0.A01.A01(requireArguments().getString(AbstractC111324zv.A00(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD)));
        C60972qL c60972qL = new C60972qL(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), this);
        FragmentActivity requireActivity = requireActivity();
        C61142qc c61142qc = (C61142qc) this.A03.getValue();
        C38U c38u = C38U.A00;
        AbstractC25229BEm.A1J(c61142qc, 3, c38u);
        this.A01 = new C38977HEf(this, requireActivity, null, c61142qc, c155376yQ, c60972qL, null, null, null, c38u, this, A01, null, 0, false, false, false, false);
        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C38977HEf c38977HEf = this.A01;
        String str = "adapter";
        if (c38977HEf != null) {
            this.A00 = new C33P(requireContext, A0r, this, c38977HEf);
            ?? obj = new Object();
            AbstractC10360h2 abstractC10360h22 = requireParentFragment().mFragmentManager;
            C38977HEf c38977HEf2 = this.A01;
            if (c38977HEf2 != null) {
                AnonymousClass391 anonymousClass391 = new AnonymousClass391(this, abstractC10360h22, c38977HEf2, c60972qL);
                C33P c33p = this.A00;
                if (c33p == null) {
                    str = "feedVideoModule";
                } else {
                    anonymousClass391.A0G = c33p;
                    anonymousClass391.A0N = obj;
                    anonymousClass391.A0R = A01;
                    AnonymousClass396 A00 = anonymousClass391.A00();
                    InterfaceC60602pj c675132q = new C675132q(this, AbstractC166987dD.A0r(interfaceC09390do), this);
                    this.A02 = new C3CO(AbstractC166987dD.A0r(interfaceC09390do), new C38287GsW(this, 12), false, false);
                    C60462pV c60462pV = new C60462pV();
                    c60462pV.A0E(A00);
                    c60462pV.A0E(c675132q);
                    InterfaceC60602pj interfaceC60602pj = this.A02;
                    if (interfaceC60602pj == null) {
                        str = "mediaUpdateListener";
                    } else {
                        c60462pV.A0E(interfaceC60602pj);
                        A0a(c60462pV);
                        C61372qz c61372qz = this.A05;
                        C14360o3.A0A(A00);
                        c61372qz.A01(A00);
                        C38977HEf c38977HEf3 = this.A01;
                        if (c38977HEf3 != null) {
                            if (A0F != null) {
                                C75113Zb BRZ = c38977HEf3.BRZ(A0F);
                                AnonymousClass341 anonymousClass341 = AnonymousClass341.A0J;
                                C14360o3.A0B(anonymousClass341, 0);
                                BRZ.A0o = anonymousClass341;
                                BRZ.A2a = requireArguments().getBoolean("BakeoffAdCardFragment.ARGUMENTS_IS_EXPLORE_STORY");
                                BRZ.A27 = false;
                                C38977HEf c38977HEf4 = this.A01;
                                if (c38977HEf4 != null) {
                                    c38977HEf4.A04.A0B(AbstractC166987dD.A1J(A0F));
                                    C38977HEf.A00(c38977HEf4);
                                    ListAdapter listAdapter = this.A01;
                                    if (listAdapter != null) {
                                        A0U(listAdapter);
                                        C0f9.A09(-174874164, A02);
                                        return;
                                    }
                                }
                            } else {
                                A14 = AbstractC166987dD.A14("Required value was null.");
                                i = -1029035372;
                                C0f9.A09(i, A02);
                                throw A14;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-48187469);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_ad_card, viewGroup, false);
        C0f9.A09(1695637843, A02);
        return inflate;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0N = AbstractC167017dG.A0N(absListView, 1780582975);
        this.A05.onScroll(absListView, i, i2, i3);
        C0f9.A0A(144028912, A0N);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, -569950034);
        this.A05.onScrollStateChanged(absListView, i);
        C0f9.A0A(69259155, A0N);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(88970101);
        super.onStart();
        AbstractC37300Gc1.A02(this).setSelectionFromTop(0, 0);
        C0f9.A09(92462875, A02);
    }
}
