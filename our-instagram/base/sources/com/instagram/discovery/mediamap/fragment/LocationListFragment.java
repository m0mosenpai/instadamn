package com.instagram.discovery.mediamap.fragment;

import X.AbstractC166997dE;
import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC50102Ry;
import X.AbstractC67879V0k;
import X.AbstractC69973Vyo;
import X.C02R;
import X.C0f9;
import X.C14360o3;
import X.C31559Dtj;
import X.C38C;
import X.C38E;
import X.C3G2;
import X.C3OO;
import X.C3Ow;
import X.C42540IsJ;
import X.C66362zD;
import X.C66392zG;
import X.C66490UJs;
import X.C67834Uz7;
import X.C68979VfH;
import X.C69305VlD;
import X.C69387VmX;
import X.C69591Vru;
import X.C69619VsM;
import X.C69786VvR;
import X.C69791VvW;
import X.C69800Vvm;
import X.C70787Wh0;
import X.C70788Wh1;
import X.C70846WiC;
import X.C70990Wm6;
import X.InterfaceC43403JFt;
import X.InterfaceC71921XAf;
import X.JQ0;
import X.V5V;
import X.VEZ;
import X.ViewOnLayoutChangeListenerC66124U0h;
import X.W69;
import X.WGA;
import X.WNU;
import X.Wi2;
import X.XDN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.refinement.model.QueryInformation;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.discovery.refinement.model.RefinementAttributes;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public class LocationListFragment extends AbstractC67879V0k implements XDN, InterfaceC71921XAf, InterfaceC43403JFt {
    public LocationListFragmentMode A00;
    public MediaMapQuery A01;
    public C68979VfH A02;
    public Reel A03;
    public Venue A04;
    public ArrayList A05;
    public boolean A06;
    public boolean A07;
    public LinearLayoutManager A08;
    public C38E A09;
    public String A0A;
    public C69791VvW mActionBarHelper;
    public C66362zD mAdapter;
    public View mEmptyStateView;
    public View mExploreAllLink;
    public RecyclerView mRecyclerView;
    public C42540IsJ mRefinementsController;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public final void A07(C67834Uz7 c67834Uz7) {
        Venue venue;
        Reel reel;
        if (c67834Uz7 == null) {
            venue = null;
        } else {
            LocationDict locationDict = c67834Uz7.A02;
            if (locationDict != null) {
                ?? obj = new Object();
                obj.A00 = locationDict;
                venue = obj;
            } else {
                venue = null;
            }
        }
        if (A05(this) && !AbstractC50102Ry.A00(this.A04, venue)) {
            this.A04 = venue;
            this.A02 = c67834Uz7 != null ? c67834Uz7.A00 : null;
            if (A05(this)) {
                if (this.A04 != null) {
                    Fragment fragment = this.mParentFragment;
                    fragment.getClass();
                    C69619VsM c69619VsM = ((MediaMapFragment) fragment).A05;
                    String A05 = this.A04.A05();
                    C14360o3.A0B(A05, 0);
                    reel = (Reel) c69619VsM.A03.get(A05);
                } else {
                    reel = null;
                }
                this.A03 = reel;
                A04(this, A01(this));
            }
        }
    }

    @Override // X.InterfaceC71921XAf
    public final float Bc9() {
        return 0.5f;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "discovery_map_location_list";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C69305VlD A02;
        MediaMapQuery mediaMapQuery;
        super.onViewCreated(view, bundle);
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        W69 w69 = ((MediaMapFragment) fragment).A06;
        Fragment fragment2 = this.mParentFragment;
        fragment2.getClass();
        Wi2 wi2 = ((MediaMapFragment) fragment2).A04;
        C66392zG A00 = C66362zD.A00(requireContext());
        UserSession session = getSession();
        Fragment fragment3 = this.mParentFragment;
        fragment3.getClass();
        C70846WiC c70846WiC = ((MediaMapFragment) fragment3).A0G;
        Fragment fragment4 = this.mParentFragment;
        fragment4.getClass();
        C69786VvR c69786VvR = ((MediaMapFragment) fragment4).A09;
        Fragment fragment5 = this.mParentFragment;
        fragment5.getClass();
        C69619VsM c69619VsM = ((MediaMapFragment) fragment5).A05;
        Fragment fragment6 = this.mParentFragment;
        fragment6.getClass();
        A00.A01(new V5V(this, session, c69619VsM, ((MediaMapFragment) fragment6).A07, c69786VvR, this, c70846WiC));
        A00.A01(new Object());
        this.mAdapter = A00.A00();
        A03();
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.mRecyclerView = A0F;
        boolean z = true;
        A0F.setNestedScrollingEnabled(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        this.A08 = linearLayoutManager;
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.setAdapter(this.mAdapter);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.refinements_list);
        recyclerView.setNestedScrollingEnabled(false);
        UserSession session2 = getSession();
        ArrayList A002 = A00();
        boolean z2 = true;
        if (!A05(this)) {
            z2 = false;
        }
        this.mRefinementsController = new C42540IsJ(recyclerView, this, session2, this, A002, z2);
        RecyclerView recyclerView2 = this.mRecyclerView;
        UserSession session3 = getSession();
        Fragment fragment7 = this.mParentFragment;
        fragment7.getClass();
        C69786VvR c69786VvR2 = ((MediaMapFragment) fragment7).A09;
        Fragment fragment8 = this.mParentFragment;
        fragment8.getClass();
        C69619VsM c69619VsM2 = ((MediaMapFragment) fragment8).A05;
        Fragment fragment9 = this.mParentFragment;
        fragment9.getClass();
        C69387VmX c69387VmX = ((MediaMapFragment) fragment9).A07;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0B(recyclerView2, 0);
        JQ0.A1O(session3, this, c69786VvR2, c69619VsM2, c69387VmX);
        new C66490UJs((ViewGroup) AbstractC31175DnJ.A07(AbstractC25228BEl.A0P(recyclerView2), recyclerView2, R.layout.layout_location_list_item, false), this, session3, c69619VsM2, c69387VmX, c69786VvR2, null).itemView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.mActionBarHelper = new C69791VvW(view.requireViewById(R.id.action_bar), getSession());
        this.mEmptyStateView = view.requireViewById(R.id.location_empty_state_view);
        View requireViewById = view.requireViewById(R.id.location_explore_all_link);
        this.mExploreAllLink = requireViewById;
        WNU.A00(requireViewById, 7, this);
        A02();
        w69.A06.add(this);
        wi2.A09.add(this);
        if (this.A00 != LocationListFragmentMode.A03 || (mediaMapQuery = this.A01) == null || !w69.A05.contains(mediaMapQuery)) {
            z = false;
        }
        this.A07 = z;
        A03();
        A02();
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC66124U0h(this, 5));
        Fragment fragment10 = this.mParentFragment;
        fragment10.getClass();
        C69800Vvm c69800Vvm = ((MediaMapFragment) fragment10).mMapViewController;
        if (c69800Vvm != null && (A02 = c69800Vvm.A02()) != null) {
            Fragment fragment11 = this.mParentFragment;
            fragment11.getClass();
            ((MediaMapFragment) fragment11).A04.A06.A01(A02);
        }
    }

    private ArrayList A00() {
        MediaMapQuery mediaMapQuery;
        LocationListFragmentMode locationListFragmentMode = this.A00;
        LocationListFragmentMode locationListFragmentMode2 = LocationListFragmentMode.A03;
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        W69 w69 = ((MediaMapFragment) fragment).A06;
        if (locationListFragmentMode == locationListFragmentMode2 && (mediaMapQuery = this.A01) != null) {
            ArrayList arrayList = new ArrayList(w69.A02(mediaMapQuery).A03);
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return new ArrayList(w69.A02(MediaMapQuery.A08).A03);
    }

    public static List A01(LocationListFragment locationListFragment) {
        ArrayList arrayList;
        if (locationListFragment.A00 == LocationListFragmentMode.A03) {
            Fragment fragment = locationListFragment.mParentFragment;
            fragment.getClass();
            W69 w69 = ((MediaMapFragment) fragment).A06;
            MediaMapQuery mediaMapQuery = locationListFragment.A01;
            C02R.A03(mediaMapQuery, "Query cannot be null when in QUERY_LIST mode");
            C69591Vru A02 = w69.A02(mediaMapQuery);
            Fragment fragment2 = locationListFragment.mParentFragment;
            fragment2.getClass();
            arrayList = A02.A00(((MediaMapFragment) fragment2).A09);
        } else {
            arrayList = locationListFragment.A05;
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(com.instagram.discovery.mediamap.fragment.LocationListFragment r15, java.util.Collection r16) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.LocationListFragment.A04(com.instagram.discovery.mediamap.fragment.LocationListFragment, java.util.Collection):void");
    }

    public static boolean A05(LocationListFragment locationListFragment) {
        if (!AbstractC50102Ry.A00(locationListFragment.A01, MediaMapQuery.A08)) {
            MediaMapQuery mediaMapQuery = locationListFragment.A01;
            if (mediaMapQuery != null && mediaMapQuery.A06 == VEZ.A05) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.XDN
    public final void DHG(W69 w69, MediaMapQuery mediaMapQuery) {
        if (AbstractC50102Ry.A00(mediaMapQuery, this.A01)) {
            this.A07 = false;
            A03();
            A02();
        }
    }

    @Override // X.InterfaceC43403JFt
    public final void DeL(Refinement refinement) {
        if (!this.A07) {
            QueryInformation queryInformation = refinement.A00.A00;
            queryInformation.getClass();
            String str = queryInformation.A00;
            for (VEZ vez : VEZ.values()) {
                if (vez.toString().equals(str)) {
                    Fragment fragment = this.mParentFragment;
                    fragment.getClass();
                    MediaMapFragment mediaMapFragment = (MediaMapFragment) fragment;
                    RefinementAttributes refinementAttributes = refinement.A00;
                    String str2 = refinementAttributes.A04;
                    if (str2 == null && (str2 = refinementAttributes.A03) == null) {
                        str2 = null;
                    }
                    MediaMapFragment.A08(mediaMapFragment, vez, str2, refinement.A01);
                    MediaMapFragment.A0A(mediaMapFragment, true);
                    mediaMapFragment.A0B.A05(null, mediaMapFragment.A0E, true);
                    return;
                }
            }
        }
    }

    @Override // X.XDN
    public final void Do7(W69 w69, MediaMapQuery mediaMapQuery) {
        if (AbstractC50102Ry.A00(mediaMapQuery, this.A01)) {
            this.A07 = true;
            A03();
            A02();
        }
    }

    @Override // X.XDN
    public final void DxF(W69 w69, C69591Vru c69591Vru, MediaMapQuery mediaMapQuery) {
        if (AbstractC50102Ry.A00(mediaMapQuery, this.A01)) {
            A03();
            this.mRefinementsController.A01(A00());
            A02();
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        ((MediaMapFragment) fragment).A0I(this.A00);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.LocationListFragment.A02():void");
    }

    private void A03() {
        ArrayList arrayList;
        List A01 = A01(this);
        if (A01 == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(A01);
        }
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        int i = 0;
        if (!this.A07) {
            while (i < arrayList.size()) {
                viewModelListUpdate.A00(new C70788Wh1(i, AbstractC69973Vyo.A01((MediaMapPin) arrayList.get(i))));
                i++;
            }
            this.mAdapter.A05(viewModelListUpdate);
        }
        do {
            viewModelListUpdate.A00(new C70787Wh0());
            i++;
        } while (i < 10);
        this.mAdapter.A05(viewModelListUpdate);
    }

    public final void A08(MediaMapPin mediaMapPin, Reel reel, C3Ow c3Ow, boolean z) {
        C3G2 c3g2;
        WGA A0V = AbstractC31173DnH.A0V(this);
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        A0V.A07(((MediaMapFragment) fragment).A0E, mediaMapPin, "discovery_map_location_list", true);
        C38E c38e = this.A09;
        c38e.A05 = new C31559Dtj(requireActivity(), c3Ow.Ahl(), new C70990Wm6(this, z));
        c38e.A0C = this.A0A;
        if (z) {
            c3g2 = C3G2.A1O;
        } else {
            c3g2 = C3G2.A1N;
        }
        c38e.A04(reel, c3g2, c3Ow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        MediaMapQuery mediaMapQuery;
        int A02 = C0f9.A02(-2130605310);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = (LocationListFragmentMode) requireArguments.getParcelable("arg_list_mode");
        this.A06 = requireArguments.getBoolean("arg_disallow_navigation_and_search");
        this.A0A = AbstractC166997dE.A0n();
        this.A09 = new C38E(this, getSession(), new C38C(this));
        this.A00.getClass();
        int ordinal = this.A00.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ArrayList parcelableArrayList = requireArguments.getParcelableArrayList("arg_map_pins");
                this.A05 = parcelableArrayList;
                mediaMapQuery = parcelableArrayList;
            }
            C0f9.A09(541415708, A02);
        }
        MediaMapQuery mediaMapQuery2 = (MediaMapQuery) requireArguments.getParcelable("arg_query");
        this.A01 = mediaMapQuery2;
        mediaMapQuery = mediaMapQuery2;
        mediaMapQuery.getClass();
        C0f9.A09(541415708, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1306612777);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_location_list);
        C0f9.A09(-1536268001, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(292312443);
        super.onDestroyView();
        Fragment fragment = this.mParentFragment;
        fragment.getClass();
        ((MediaMapFragment) fragment).A06.A06.remove(this);
        Fragment fragment2 = this.mParentFragment;
        fragment2.getClass();
        ((MediaMapFragment) fragment2).A04.A09.remove(this);
        LocationListFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(1719371519, A02);
    }
}
