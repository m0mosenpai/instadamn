package com.instagram.archive.fragment;

import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25229BEm;
import X.AbstractC25651Mw;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC43594JPz;
import X.AbstractC50102Ry;
import X.C05F;
import X.C0f9;
import X.C13400mQ;
import X.C14360o3;
import X.C17060sy;
import X.C1H6;
import X.C1N9;
import X.C1NB;
import X.C1ON;
import X.C1VW;
import X.C25621Ms;
import X.C2TB;
import X.C38321qM;
import X.C38C;
import X.C38E;
import X.C38H;
import X.C3G2;
import X.C46014KYc;
import X.C53Z;
import X.C55014OWb;
import X.C55979OtC;
import X.C56035Ou7;
import X.C66081TzI;
import X.C66279U6z;
import X.C66356UBx;
import X.C67827Uz0;
import X.C67954V3t;
import X.C68071V9b;
import X.C69022Vfy;
import X.C69939VyA;
import X.C70109W4g;
import X.C70375WTd;
import X.C70394WTw;
import X.C70999WmG;
import X.C71192Wpe;
import X.C71196Wpl;
import X.C71659WyA;
import X.HAJ;
import X.IPY;
import X.InterfaceC41501vz;
import X.InterfaceC58108PpX;
import X.InterfaceC60072op;
import X.KYY;
import X.MQD;
import X.Ow3;
import X.U70;
import X.ULT;
import X.ULY;
import X.WFW;
import X.WXZ;
import X.Wi0;
import X.WlL;
import X.X90;
import android.app.Activity;
import android.graphics.RectF;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.instagram.archive.fragment.ArchiveReelMapFragment;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.reels.ReelViewerContextButtonType;
import com.instagram.model.venue.Venue;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public class ArchiveReelMapFragment extends C53Z implements InterfaceC60072op, InterfaceC58108PpX, MQD {
    public LatLng A00;
    public Ow3 A01;
    public C13400mQ A02;
    public C70375WTd A03;
    public C38E A04;
    public boolean A05;
    public ULY mClusterOverlay;
    public C70394WTw mFacebookMap;
    public C55014OWb mLoadingPillController;
    public WXZ mMapPrivacyMessageController;
    public C66356UBx mMapView;
    public final Set A09 = new HashSet();
    public final List A08 = new ArrayList();
    public final C2TB A0A = new Object();
    public final float[] A0C = {0.0f};
    public final List A07 = new ArrayList();
    public final InterfaceC41501vz A0B = new C56035Ou7(this, 3);
    public final C69022Vfy A06 = new C69022Vfy();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "location_map_archive";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    public static void A00(CameraPosition cameraPosition, ArchiveReelMapFragment archiveReelMapFragment) {
        LatLng latLng = cameraPosition.A03;
        double d = latLng.A00;
        double d2 = latLng.A01;
        C70394WTw c70394WTw = archiveReelMapFragment.mFacebookMap;
        c70394WTw.getClass();
        WFW wfw = c70394WTw.A0J;
        C2TB c2tb = archiveReelMapFragment.A0A;
        wfw.A05(c2tb);
        double A03 = WFW.A03(c2tb.A03);
        double A02 = WFW.A02(c2tb.A01);
        double A032 = WFW.A03(c2tb.A00);
        double A022 = WFW.A02(c2tb.A02);
        float[] fArr = archiveReelMapFragment.A0C;
        Location.distanceBetween(d, d2, A03, A02, fArr);
        double d3 = fArr[0];
        Location.distanceBetween(d, d2, A032, A022, fArr);
        double max = Math.max(d3, fArr[0]);
        UserSession session = archiveReelMapFragment.getSession();
        C14360o3.A0B(session, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(session);
        A0M.A0B("archive/reel/location_media/");
        A0M.A9s("lat", String.valueOf(d));
        A0M.A9s("lng", String.valueOf(d2));
        A0M.A9s("radius", String.valueOf(max));
        A0M.A0R(HAJ.class, IPY.class);
        C1ON A0N = A0M.A0N();
        C71192Wpe c71192Wpe = new C71192Wpe(d, d2, max);
        int i = 0;
        while (true) {
            List list = archiveReelMapFragment.A07;
            if (i >= list.size()) {
                break;
            }
            C71192Wpe c71192Wpe2 = (C71192Wpe) list.get(i);
            double d4 = c71192Wpe.A02;
            if (d4 > c71192Wpe2.A02) {
                break;
            }
            double d5 = c71192Wpe2.A02;
            if (d4 <= d5) {
                Location.distanceBetween(c71192Wpe2.A00, c71192Wpe2.A01, c71192Wpe.A00, c71192Wpe.A01, c71192Wpe2.A03);
                if (r11[0] + d4 <= d5) {
                    return;
                }
            }
            i++;
        }
        A0N.A00 = new C67954V3t(0, archiveReelMapFragment, c71192Wpe);
        archiveReelMapFragment.schedule(A0N);
    }

    private void A02(KYY kyy, String str, List list) {
        if (this.A04 == null) {
            this.A04 = new C38E(this, getSession(), new C38C(this));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC25229BEm.A0h(getSession(), (String) it.next()));
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new C71659WyA(this, 5));
            int i = 0;
            while (true) {
                if (i < arrayList.size()) {
                    if (AbstractC50102Ry.A00(str, ((C38321qM) arrayList.get(i)).getId())) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            String A0n = AbstractC166997dE.A0n();
            C1N9 c1n9 = new C1N9(C17060sy.A01.A01(getSession()));
            ReelType reelType = ReelType.A08;
            Reel reel = new Reel((C1NB) c1n9, A0n, true);
            reel.A1W = false;
            reel.A0P = reelType;
            reel.A0X(arrayList);
            ReelStore.A03(getSession()).A0X(reel);
            RectF A0G = AbstractC13880nE.A0G(this.mMapView);
            RectF rectF = new RectF(kyy.A0D);
            rectF.set(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY());
            rectF.offset(A0G.left, A0G.top);
            C38E c38e = this.A04;
            C38H c38h = new C38H();
            c38h.A00 = ReelViewerContextButtonType.A02;
            c38h.A06 = false;
            c38h.A04 = Ow3.A00(getSession()).A01;
            c38e.A03 = new ReelViewerConfig(c38h);
            c38e.A0C = AbstractC166997dE.A0n();
            c38e.A05 = new C68071V9b(rectF, this, kyy);
            c38e.A0D = getSession().userId;
            c38e.A07(reel, C3G2.A0A, new C70999WmG(rectF, this, kyy), Collections.singletonList(reel), Collections.singletonList(reel), i);
        }
    }

    @Override // X.InterfaceC58108PpX
    public final void DaM(String str, Integer num) {
        C38321qM A0h;
        if (num == C05F.A01 && (A0h = AbstractC25229BEm.A0h(getSession(), str)) != null) {
            Venue A28 = A0h.A28();
            this.A06.A00 = System.currentTimeMillis();
            C70394WTw c70394WTw = this.mFacebookMap;
            c70394WTw.getClass();
            A28.getClass();
            Double A00 = A28.A00();
            A00.getClass();
            double doubleValue = A00.doubleValue();
            Double A01 = A28.A01();
            A01.getClass();
            C70109W4g.A00(c70394WTw, new LatLng(doubleValue, A01.doubleValue()), 17.0f);
        }
    }

    public static void A01(ArchiveReelMapFragment archiveReelMapFragment) {
        Location location;
        LatLng latLng;
        FragmentActivity activity = archiveReelMapFragment.getActivity();
        if (archiveReelMapFragment.mFacebookMap != null && activity != null && !archiveReelMapFragment.A05) {
            WlL wlL = new WlL(activity, archiveReelMapFragment.mFacebookMap, archiveReelMapFragment.getSession());
            C70394WTw c70394WTw = wlL.A02;
            Activity activity2 = wlL.A01;
            C66279U6z c66279U6z = new C66279U6z(activity2, c70394WTw, wlL);
            c70394WTw.A0A(c66279U6z);
            U70 u70 = c66279U6z.A04;
            if (!u70.A0G) {
                u70.A05();
            }
            c70394WTw.A0A(new ULT(c70394WTw, wlL, Math.round(AbstractC13880nE.A04(activity2, 17))));
            C1VW c1vw = C1VW.A00;
            if (c1vw != null) {
                location = c1vw.getLastLocation(archiveReelMapFragment.getSession(), "ArchiveReelMapFragment");
            } else {
                location = null;
            }
            Location AuZ = wlL.AuZ("ArchiveReelMapFragment");
            if (AuZ != null) {
                location = AuZ;
            } else if (location == null) {
                latLng = archiveReelMapFragment.A00;
                if (latLng == null) {
                    return;
                }
                archiveReelMapFragment.A06.A00 = System.currentTimeMillis();
                C70109W4g.A00(archiveReelMapFragment.mFacebookMap, latLng, 11.0f);
                archiveReelMapFragment.A05 = true;
            }
            latLng = AbstractC43594JPz.A0L(location);
            archiveReelMapFragment.A06.A00 = System.currentTimeMillis();
            C70109W4g.A00(archiveReelMapFragment.mFacebookMap, latLng, 11.0f);
            archiveReelMapFragment.A05 = true;
        }
    }

    @Override // X.InterfaceC58108PpX
    public final void CzI(String str, Integer num) {
    }

    @Override // X.InterfaceC58108PpX
    public final void DH6(String str, Integer num) {
    }

    @Override // X.MQD
    public final boolean DYn(C71196Wpl c71196Wpl, KYY kyy, String str) {
        LinkedList A04 = c71196Wpl.A04();
        ArrayList arrayList = new ArrayList();
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaMapPin) it.next()).A0D);
        }
        A02(kyy, str, arrayList);
        return true;
    }

    @Override // X.MQD
    public final boolean DYo(KYY kyy, String str, String str2) {
        A02(kyy, str, Collections.singletonList(str));
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(179356874);
        super.onCreate(bundle);
        Ow3 A00 = Ow3.A00(getSession());
        this.A01 = A00;
        A00.A01.clear();
        C25621Ms A0N = AbstractC31173DnH.A0N(getSession());
        A0N.A0B("map/map_center_fallback/");
        C1ON A0S = AbstractC31172DnG.A0S(A0N, C67827Uz0.class, C69939VyA.class);
        A0S.A00 = new C66081TzI(this, 0);
        schedule(A0S);
        C0f9.A09(747585617, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1653794952);
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.layout_map, viewGroup, false);
        C66356UBx c66356UBx = (C66356UBx) frameLayout.requireViewById(R.id.map);
        this.mMapView = c66356UBx;
        boolean A03 = C1H6.A03();
        c66356UBx.A0N.A08 = A03;
        int i = -987675;
        if (A03) {
            i = -15789542;
        }
        c66356UBx.A0D = i;
        this.mMapView.D7y(bundle);
        this.A02 = new C13400mQ(AbstractC167007dF.A0J(), new Wi0(this, 0), 300L);
        this.mLoadingPillController = new C55014OWb(null, frameLayout, 80);
        this.mMapPrivacyMessageController = new WXZ(frameLayout.requireViewById(R.id.privacy_message), getSession());
        C0f9.A09(1066125167, A02);
        return frameLayout;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1270688320);
        super.onDestroyView();
        AbstractC25651Mw.A00(getSession()).A02(this.A0B, C55979OtC.class);
        this.A01.A04.remove(this);
        this.A09.clear();
        this.A08.clear();
        this.A07.clear();
        ULY uly = this.mClusterOverlay;
        if (uly != null) {
            uly.A08();
        }
        C13400mQ c13400mQ = this.A02;
        if (c13400mQ != null) {
            c13400mQ.A00();
        }
        ArchiveReelMapFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(2079229125, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int round = Math.round(AbstractC13880nE.A04(requireContext(), 55));
        final int round2 = Math.round(C46014KYc.A00(requireContext(), round / 2.0f));
        this.mMapView.A0F(new X90() { // from class: X.WTr
            @Override // X.X90
            public final void DR2(C70394WTw c70394WTw) {
                ArchiveReelMapFragment archiveReelMapFragment = ArchiveReelMapFragment.this;
                int i = round;
                int i2 = round2;
                archiveReelMapFragment.mFacebookMap = c70394WTw;
                archiveReelMapFragment.A03 = new C70375WTd(c70394WTw, archiveReelMapFragment.getSession(), archiveReelMapFragment, new ArrayList(), i, i2);
                archiveReelMapFragment.mFacebookMap.A08(3.0f);
                ArchiveReelMapFragment.A01(archiveReelMapFragment);
                C70394WTw c70394WTw2 = archiveReelMapFragment.mFacebookMap;
                c70394WTw2.A05 = new C70378WTg(archiveReelMapFragment, 0);
                ULY uly = new ULY(archiveReelMapFragment.A03, c70394WTw2);
                c70394WTw2.A0A(uly);
                archiveReelMapFragment.mClusterOverlay = uly;
                C69022Vfy c69022Vfy = archiveReelMapFragment.A06;
                C69321VlT c69321VlT = uly.A07;
                c69321VlT.A02 = c69022Vfy;
                c69321VlT.A04.A00 = c69022Vfy.A01;
                ArchiveReelMapFragment.A00(archiveReelMapFragment.mFacebookMap.A02(), archiveReelMapFragment);
            }
        });
        AbstractC25651Mw.A00(getSession()).A01(this.A0B, C55979OtC.class);
        this.A01.A04.add(this);
    }
}
