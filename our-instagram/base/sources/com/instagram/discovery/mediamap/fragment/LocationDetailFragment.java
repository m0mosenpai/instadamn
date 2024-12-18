package com.instagram.discovery.mediamap.fragment;

import X.AbstractC018607g;
import X.AbstractC111324zv;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25651Mw;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31402Dr6;
import X.AbstractC37303Gc4;
import X.AbstractC40691uc;
import X.AbstractC65702TsY;
import X.AbstractC67879V0k;
import X.AbstractC68490VSv;
import X.AbstractC69958VyZ;
import X.AbstractC69973Vyo;
import X.C00O;
import X.C06090Tz;
import X.C08790ch;
import X.C0f9;
import X.C14360o3;
import X.C18U;
import X.C1ON;
import X.C1OU;
import X.C1P1;
import X.C1VW;
import X.C25531Mh;
import X.C25621Ms;
import X.C25671My;
import X.C31368DqX;
import X.C31559Dtj;
import X.C38C;
import X.C38E;
import X.C3G2;
import X.C3MC;
import X.C3Ow;
import X.C40701ud;
import X.C42251Inb;
import X.C57112jm;
import X.C61972ry;
import X.C63994SxR;
import X.C66081TzI;
import X.C66095TzW;
import X.C67817Uyq;
import X.C67973V4n;
import X.C68755VbY;
import X.C68978VfG;
import X.C69113Vi3;
import X.C69531Vqv;
import X.C69619VsM;
import X.C69786VvR;
import X.C69944VyK;
import X.C70709WfY;
import X.C70717Wfi;
import X.C70723Wfo;
import X.C70995WmB;
import X.C71163Hc;
import X.InterfaceC1570173f;
import X.InterfaceC41501vz;
import X.InterfaceC60442pS;
import X.InterfaceC71921XAf;
import X.InterfaceC71922XAg;
import X.InterfaceC71923XAh;
import X.InterfaceC71953XCf;
import X.TFA;
import X.Tx4;
import X.ViewOnLayoutChangeListenerC66124U0h;
import X.WGA;
import X.WW5;
import X.Wm5;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public class LocationDetailFragment extends AbstractC67879V0k implements InterfaceC60442pS, InterfaceC1570173f, InterfaceC71921XAf, InterfaceC71923XAh, InterfaceC71922XAg {
    public float A00;
    public C67973V4n A01;
    public MediaMapQuery A02;
    public MediaMapPin A03;
    public boolean A04;
    public boolean A05;
    public long A06;
    public C38E A07;
    public String A08;
    public C69113Vi3 mDirectionsBottomSheetController;
    public C68978VfG mLocationDetailRedesignExperimentHelper;
    public final C69531Vqv A0D = new C69531Vqv(this);
    public final C68755VbY A0E = new C68755VbY(this);
    public final InterfaceC41501vz A0B = new C70717Wfi(this, 0);
    public final InterfaceC41501vz A0C = new C70723Wfo(this, 12);
    public final C1P1 A09 = new C66081TzI(this, 29);
    public final InterfaceC41501vz A0A = new C70723Wfo(this, 13);

    @Override // X.InterfaceC1570173f
    public final void DT1(User user) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(111);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    private void A00() {
        LocationPageInformation locationPageInformation;
        User A00;
        MediaMapPin mediaMapPin = this.A03;
        if (mediaMapPin != null && (locationPageInformation = mediaMapPin.A06) != null && (A00 = locationPageInformation.A00()) != null) {
            if (C1OU.A04(getSession()).A0M(A00.getId()) == null || !this.A04) {
                C1ON A002 = C1OU.A00(getSession(), A00.getId());
                A002.A00 = this.A09;
                schedule(A002);
            }
        }
    }

    public static void A01(LocationDetailFragment locationDetailFragment) {
        C68978VfG c68978VfG = locationDetailFragment.mLocationDetailRedesignExperimentHelper;
        if (c68978VfG != null) {
            InterfaceC71953XCf interfaceC71953XCf = c68978VfG.A00;
            if (interfaceC71953XCf == null) {
                C14360o3.A0F("locationDetailActionBarHelper");
                throw C00O.createAndThrow();
            }
            interfaceC71953XCf.ADa();
        }
    }

    @Override // X.InterfaceC71921XAf
    public final float Bc9() {
        return this.A00;
    }

    @Override // X.InterfaceC1570173f
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        A07(reel, C3G2.A1N, new C70995WmB(gradientSpinnerAvatarView.A0K, gradientSpinnerAvatarView.A0O));
    }

    @Override // X.InterfaceC71923XAh
    public final void DYk(MediaMapPin mediaMapPin) {
        this.A03 = mediaMapPin;
        this.A01.A02 = mediaMapPin;
        InterfaceC71953XCf interfaceC71953XCf = this.mLocationDetailRedesignExperimentHelper.A00;
        if (interfaceC71953XCf == null) {
            C14360o3.A0F("locationDetailActionBarHelper");
            throw C00O.createAndThrow();
        }
        C14360o3.A0A(mediaMapPin);
        interfaceC71953XCf.EYu(mediaMapPin);
        if (isResumed()) {
            A01(this);
            C67973V4n c67973V4n = this.A01;
            LocationPageInformation locationPageInformation = c67973V4n.A02.A06;
            if (locationPageInformation != null && locationPageInformation.A00() != null) {
                if (C18U.A06(C06090Tz.A05, c67973V4n.A0I, 36315799618588218L)) {
                    C67973V4n c67973V4n2 = this.A01;
                    C67973V4n.A00(c67973V4n2.A00, c67973V4n2, c67973V4n2.A0A);
                }
            }
            C66095TzW.A00(this.A01.A03);
            A00();
        }
    }

    @Override // X.InterfaceC1570173f
    public final void Dy8(User user, int i) {
        User A00;
        LocationPageInformation locationPageInformation = this.A03.A06;
        if (locationPageInformation != null && (A00 = locationPageInformation.A00()) != null && getActivity() != null) {
            String id = A00.getId();
            UserSession session = getSession();
            FragmentActivity activity = getActivity();
            String A002 = AbstractC111324zv.A00(111);
            AbstractC167017dG.A1P(session, activity);
            C31368DqX A01 = AbstractC31402Dr6.A01(session, id, "hashtag_map", A002);
            A01.A0O = null;
            AbstractC31177DnL.A0o(activity, AbstractC37303Gc4.A02(session, A01), session, "profile");
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        this.A01.A04.A03();
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C57112jm.A00().A06(view, C71163Hc.A00(this));
        TFA tfa = ((MediaMapFragment) requireParentFragment()).A03;
        FragmentActivity requireActivity = requireActivity();
        UserSession session = getSession();
        C08790ch A00 = AbstractC018607g.A00(this);
        MediaMapPin mediaMapPin = this.A03;
        boolean isLocationPermitted = C1VW.isLocationPermitted(tfa.A02, tfa.A04, "MEDIA_MAP");
        this.A01 = new C67973V4n(tfa.A00("LocationDetailFragment"), requireActivity, A00, this, session, this.A0D, this, this, this, ((MediaMapFragment) requireParentFragment()).A0G, mediaMapPin, this, isLocationPermitted, this.A05);
        A00();
        this.A07 = new C38E(this, getSession(), new C38C(this));
        this.mLocationDetailRedesignExperimentHelper = new C68978VfG(view, getSession(), this, (MediaMapFragment) requireParentFragment(), (MediaMapFragment) requireParentFragment(), this.A03, this.A05);
        this.mDirectionsBottomSheetController = new C69113Vi3(getSession(), this.A0E);
        A01(this);
        ((MediaMapFragment) requireParentFragment()).A09.A03(this, AbstractC69973Vyo.A01(this.A03));
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC66124U0h(this, 4));
        C25671My A002 = AbstractC25651Mw.A00(getSession());
        A002.A01(this.A0C, C70709WfY.class);
        A002.A01(this.A0A, C42251Inb.class);
        if (this.A05) {
            AbstractC25651Mw.A00(getSession()).A01(this.A0B, C3MC.class);
        }
    }

    public final void A07(Reel reel, C3G2 c3g2, C3Ow c3Ow) {
        AbstractC31173DnH.A0V(this).A07(this.A02, this.A03, AbstractC111324zv.A00(111), false);
        C38E c38e = this.A07;
        c38e.A05 = new C31559Dtj(requireActivity(), c3Ow.Ahl(), new Wm5(this, 0));
        c38e.A0C = this.A08;
        c38e.A04(reel, c3g2, c3Ow);
    }

    @Override // X.InterfaceC1570173f
    public final void DHp(User user, int i) {
        if (user.B7L() == FollowStatus.A05) {
            AbstractC31173DnH.A1W(this.A02, AbstractC31173DnH.A0V(this), this.A03, AbstractC111324zv.A00(2561));
        }
        C66095TzW.A00(this.A01.A03);
    }

    @Override // X.InterfaceC71922XAg
    public final void DQI(C69619VsM c69619VsM) {
        A01(this);
    }

    @Override // X.InterfaceC1570173f
    public final void Dy9(View view, User user, int i) {
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1854753781);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A08 = AbstractC166997dE.A0n();
        Parcelable parcelable = requireArguments.getParcelable("arg_map_pins");
        parcelable.getClass();
        this.A03 = (MediaMapPin) parcelable;
        this.A05 = C18U.A06(C06090Tz.A06, getSession(), 36315017934539728L);
        C69786VvR c69786VvR = ((MediaMapFragment) requireParentFragment()).A09;
        C69619VsM c69619VsM = ((MediaMapFragment) requireParentFragment()).A05;
        if (this.A03.A0F && c69786VvR != null && c69619VsM != null) {
            UserSession session = getSession();
            C61972ry A0L = AbstractC31178DnM.A0L(this);
            MediaMapPin mediaMapPin = this.A03;
            if (C18U.A06(C06090Tz.A05, session, 36319604959616567L)) {
                C40701ud A01 = AbstractC40691uc.A01(session);
                PandoGraphQLRequest A00 = AbstractC69958VyZ.A00(AbstractC69973Vyo.A01(mediaMapPin));
                A01.ATV(new C63994SxR(4), new WW5(1, c69619VsM, mediaMapPin, c69786VvR), A00);
            } else {
                List singletonList = Collections.singletonList(AbstractC69973Vyo.A01(mediaMapPin));
                Tx4 tx4 = new Tx4(6, c69786VvR, mediaMapPin, c69619VsM);
                String A002 = AbstractC68490VSv.A00(singletonList);
                if (A002 != null) {
                    C25621Ms A0M = AbstractC31173DnH.A0M(session);
                    A0M.A0B("map/location_details_many/");
                    A0M.A9s("location_ids", A002);
                    C1ON A0I = AbstractC31178DnM.A0I(A0M, C67817Uyq.class, C69944VyK.class);
                    A0I.A00 = tx4;
                    A0L.schedule(A0I);
                }
            }
        }
        Parcelable parcelable2 = requireArguments.getParcelable("arg_query");
        parcelable2.getClass();
        this.A02 = (MediaMapQuery) parcelable2;
        this.A06 = System.currentTimeMillis();
        C0f9.A09(-296278886, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-83398273);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_location_detail);
        C0f9.A09(1449250355, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1544231551);
        super.onDestroy();
        WGA A0V = AbstractC31173DnH.A0V(this);
        MediaMapPin mediaMapPin = this.A03;
        MediaMapQuery mediaMapQuery = this.A02;
        long currentTimeMillis = System.currentTimeMillis() - this.A06;
        C25531Mh A01 = WGA.A01(A0V, "instagram_map_exit_location_page");
        AbstractC65702TsY.A1H(A01, mediaMapQuery);
        A01.A0Q("session_duration", Long.valueOf(currentTimeMillis));
        WGA.A03(A01, mediaMapPin);
        A01.Cht();
        C0f9.A09(-699201212, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-380904075);
        super.onDestroyView();
        ((MediaMapFragment) requireParentFragment()).A05.A04.remove(this);
        C69786VvR c69786VvR = ((MediaMapFragment) requireParentFragment()).A09;
        Set set = (Set) c69786VvR.A01.get(AbstractC69973Vyo.A01(this.A03));
        if (set != null) {
            set.remove(this);
        }
        LocationDetailFragmentLifecycleUtil.cleanupReferences(this);
        C25671My A00 = AbstractC25651Mw.A00(getSession());
        A00.A02(this.A0C, C70709WfY.class);
        A00.A02(this.A0A, C42251Inb.class);
        if (this.A05) {
            AbstractC25651Mw.A00(getSession()).A02(this.A0B, C3MC.class);
        }
        C0f9.A09(-1238405944, A02);
    }
}
