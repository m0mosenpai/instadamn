package com.instagram.archive.fragment;

import X.AbstractC154146wP;
import X.AbstractC154166wR;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC37301Gc2;
import X.AbstractC50523MSb;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AbstractC68565VVs;
import X.C00O;
import X.C07S;
import X.C07X;
import X.C07Y;
import X.C0f9;
import X.C14360o3;
import X.C153156uj;
import X.C25671My;
import X.C29897DGl;
import X.C31424DrU;
import X.C38C;
import X.C38E;
import X.C38H;
import X.C3DH;
import X.C50361MLn;
import X.C50862Mdt;
import X.C55997OtU;
import X.C56035Ou7;
import X.C56113OvY;
import X.C56536P8i;
import X.C57112jm;
import X.C57508Pfi;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC41501vz;
import X.InterfaceC56362iU;
import X.InterfaceC57970PnG;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.InterfaceC62612t0;
import X.InterfaceC64002vL;
import X.MCQ;
import X.NS4;
import X.P2X;
import X.P90;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class ArchiveReelHighlightsFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC62612t0, InterfaceC60122ou, InterfaceC57970PnG {
    public P2X A00;
    public C38E A01;
    public InterfaceC64002vL A02;
    public final ReelViewerConfig A04;
    public final InterfaceC09390do A06;
    public final InterfaceC41501vz A07;
    public final InterfaceC41501vz A08;
    public final C57112jm A09;
    public GridLayoutManager layoutManager;
    public RecyclerView recyclerView;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public String A03 = "highlights_archive";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131953165);
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(AbstractC50523MSb.A01(this)));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.recycler_view);
        C14360o3.A0B(recyclerView, 0);
        this.recyclerView = recyclerView;
        C57112jm c57112jm = this.A09;
        AbstractC37301Gc2.A0v(view, c57112jm, this);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A05);
        InterfaceC64002vL interfaceC64002vL = this.A02;
        if (interfaceC64002vL == null) {
            str = "reelTrayItemDelegate";
        } else {
            this.A00 = new P2X(requireContext, this, A0r, c57112jm, this, interfaceC64002vL);
            FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext(), 3);
            this.layoutManager = fastScrollingGridLayoutManager;
            P2X p2x = this.A00;
            str = "adapter";
            if (p2x != null) {
                ((GridLayoutManager) fastScrollingGridLayoutManager).A01 = (AbstractC154146wP) p2x.A0B.getValue();
                RecyclerView recyclerView2 = this.recyclerView;
                if (recyclerView2 != null) {
                    P2X p2x2 = this.A00;
                    if (p2x2 != null) {
                        recyclerView2.setAdapter(p2x2.A05);
                        RecyclerView recyclerView3 = this.recyclerView;
                        if (recyclerView3 != null) {
                            recyclerView3.A10(AbstractC154166wR.A00(requireContext(), 1, true));
                            RecyclerView recyclerView4 = this.recyclerView;
                            if (recyclerView4 != null) {
                                GridLayoutManager gridLayoutManager = this.layoutManager;
                                if (gridLayoutManager != null) {
                                    recyclerView4.setLayoutManager(gridLayoutManager);
                                    RecyclerView recyclerView5 = this.recyclerView;
                                    if (recyclerView5 != null) {
                                        C153156uj A00 = AbstractC68565VVs.A00(recyclerView5.A0D, this);
                                        RecyclerView recyclerView6 = this.recyclerView;
                                        if (recyclerView6 != null) {
                                            recyclerView6.A14(A00);
                                            C07S c07s = C07S.STARTED;
                                            C07X viewLifecycleOwner = getViewLifecycleOwner();
                                            AbstractC166987dD.A1Z(new MCQ(viewLifecycleOwner, c07s, this, null, 19), C07Y.A00(viewLifecycleOwner));
                                            ((C50862Mdt) this.A06.getValue()).A0F();
                                            P2X p2x3 = this.A00;
                                            if (p2x3 != null) {
                                                p2x3.A01 = true;
                                                p2x3.A02();
                                                return;
                                            }
                                        }
                                    }
                                } else {
                                    str = "layoutManager";
                                }
                            }
                        }
                    }
                }
                str = "recyclerView";
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(ArchiveReelHighlightsFragment archiveReelHighlightsFragment, String str) {
        P2X p2x = archiveReelHighlightsFragment.A00;
        if (p2x == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        p2x.A0A.removeIf(new C31424DrU(0, new C50361MLn(str, 12)));
        p2x.A02();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        ((C50862Mdt) this.A06.getValue()).A0E();
    }

    @Override // X.InterfaceC57970PnG
    public final void AGS() {
        P2X p2x = this.A00;
        if (p2x == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        Iterator it = p2x.A0A.iterator();
        while (it.hasNext()) {
            ((C56113OvY) it.next()).A03 = false;
        }
        p2x.A05.notifyDataSetChanged();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public ArchiveReelHighlightsFragment() {
        C38H c38h = new C38H();
        c38h.A07 = true;
        this.A04 = new ReelViewerConfig(c38h);
        this.A09 = AbstractC37301Gc2.A0E();
        C57508Pfi c57508Pfi = new C57508Pfi(this, 16);
        InterfaceC09390do A00 = C57508Pfi.A00(new C57508Pfi(this, 13), EnumC09460dv.A02, 14);
        this.A06 = AbstractC25225BEi.A0a(new C57508Pfi(A00, 15), c57508Pfi, new C29897DGl(47, null, A00), AbstractC25225BEi.A1D(C50862Mdt.class));
        this.A08 = C56035Ou7.A00(this, 2);
        this.A07 = C56035Ou7.A00(this, 1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1561356826);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A05;
        C38E c38e = new C38E(this, AbstractC166987dD.A0r(interfaceC09390do), new C38C(this));
        c38e.A0C = AbstractC166997dE.A0n();
        setModuleNameV2(this.A03);
        c38e.A0F = true;
        c38e.A03 = this.A04;
        c38e.A06 = new C56536P8i(this, 0);
        c38e.A05 = new NS4(0);
        this.A01 = c38e;
        this.A02 = new P90(this);
        C25671My A0Q = AbstractC31176DnK.A0Q(interfaceC09390do);
        A0Q.A01(this.A08, C55997OtU.class);
        A0Q.A01(this.A07, C3DH.class);
        C0f9.A09(233618291, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(924399199);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_highlights, viewGroup, false);
        C0f9.A09(664662707, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1843522271);
        super.onDestroy();
        C25671My A0Q = AbstractC31176DnK.A0Q(this.A05);
        A0Q.A02(this.A08, C55997OtU.class);
        A0Q.A02(this.A07, C3DH.class);
        C0f9.A09(107623615, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-536631626);
        super.onDestroyView();
        ArchiveReelHighlightsFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-1590139709, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1901649663);
        super.onStart();
        AbstractC31179DnN.A1J(this, 8);
        C0f9.A09(-1876975961, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(494398711);
        super.onStop();
        AbstractC31179DnN.A1J(this, 0);
        C0f9.A09(-1168715613, A02);
    }
}
