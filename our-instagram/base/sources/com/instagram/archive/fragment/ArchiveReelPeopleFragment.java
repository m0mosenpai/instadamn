package com.instagram.archive.fragment;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25227BEk;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31179DnN;
import X.AbstractC50523MSb;
import X.C0f9;
import X.C14360o3;
import X.C1ON;
import X.C25621Ms;
import X.C38C;
import X.C38E;
import X.C38H;
import X.C3G2;
import X.C50689MZh;
import X.C51377Mmc;
import X.C52080N2g;
import X.C53Z;
import X.C54857ONi;
import X.C66362zD;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.NEN;
import X.NS9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public class ArchiveReelPeopleFragment extends C53Z implements InterfaceC60072op, InterfaceC60122ou {
    public C66362zD A00;
    public boolean A01;
    public boolean A02;
    public C38E A03;
    public String A04;
    public GridLayoutManager mLayoutManager;
    public View mLoadingSpinner;
    public RecyclerView mRecyclerView;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "calendar_archive";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    public static void A00(ArchiveReelPeopleFragment archiveReelPeopleFragment) {
        View view = archiveReelPeopleFragment.mLoadingSpinner;
        if (view != null && archiveReelPeopleFragment.mRecyclerView != null) {
            if (archiveReelPeopleFragment.A01) {
                view.setVisibility(0);
                archiveReelPeopleFragment.mRecyclerView.setVisibility(8);
            } else {
                view.setVisibility(8);
                archiveReelPeopleFragment.mRecyclerView.setVisibility(0);
            }
        }
    }

    public static void A01(ArchiveReelPeopleFragment archiveReelPeopleFragment, C51377Mmc c51377Mmc, Reel reel) {
        if (archiveReelPeopleFragment.A03 == null) {
            archiveReelPeopleFragment.A03 = new C38E(archiveReelPeopleFragment, archiveReelPeopleFragment.getSession(), new C38C(archiveReelPeopleFragment));
        }
        List singletonList = Collections.singletonList(reel);
        C38E c38e = archiveReelPeopleFragment.A03;
        c38e.A0C = archiveReelPeopleFragment.A04;
        C38H c38h = new C38H();
        c38h.A06 = false;
        c38e.A03 = new ReelViewerConfig(c38h);
        c38e.A0D = archiveReelPeopleFragment.getSession().userId;
        c38e.A05 = new NS9(archiveReelPeopleFragment, 0);
        c38e.A07(reel, C3G2.A0O, c51377Mmc, singletonList, singletonList, 0);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131969511);
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(AbstractC50523MSb.A01(this)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1520477185);
        super.onCreate(bundle);
        this.A04 = AbstractC166997dE.A0n();
        this.A00 = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new NEN(this, this));
        UserSession session = getSession();
        C14360o3.A0B(session, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(session);
        A0M.A0B("archive/reel/friends_with_history/");
        C1ON A0e = AbstractC25227BEk.A0e(A0M, C52080N2g.class, C54857ONi.class);
        C50689MZh.A00(A0e, this, 0);
        schedule(A0e);
        C0f9.A09(1466135547, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1108266523);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_people);
        C0f9.A09(566371820, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(671410285);
        super.onDestroyView();
        this.mRecyclerView.setAdapter(null);
        ArchiveReelPeopleFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(895487777, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(925330512);
        super.onStart();
        AbstractC31179DnN.A1K(this, 8);
        C0f9.A09(-1497138575, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-2008998280);
        super.onStop();
        AbstractC31179DnN.A1K(this, 0);
        C0f9.A09(-699461300, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLoadingSpinner = view.requireViewById(R.id.loading_spinner);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.mRecyclerView = A0F;
        A0F.setAdapter(this.A00);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        this.mLayoutManager = gridLayoutManager;
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        A00(this);
    }
}
