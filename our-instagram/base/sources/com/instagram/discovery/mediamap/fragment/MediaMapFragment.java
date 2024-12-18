package com.instagram.discovery.mediamap.fragment;

import X.AbstractC10360h2;
import X.AbstractC111324zv;
import X.AbstractC128065qa;
import X.AbstractC13600mm;
import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC25651Mw;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC43591JPw;
import X.AbstractC43594JPz;
import X.AbstractC44340Jif;
import X.AbstractC50102Ry;
import X.AbstractC54241NyM;
import X.AbstractC56402iY;
import X.AbstractC59962oe;
import X.AbstractC65702TsY;
import X.AbstractC66278U6y;
import X.AbstractC67879V0k;
import X.AbstractC68633VYo;
import X.AbstractC69973Vyo;
import X.AbstractC70135W6m;
import X.AbstractC86593tX;
import X.AnonymousClass001;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C111034zF;
import X.C116875Qr;
import X.C120985dq;
import X.C14240no;
import X.C14360o3;
import X.C169487hO;
import X.C18U;
import X.C1H6;
import X.C24029AlM;
import X.C25531Mh;
import X.C31727DwY;
import X.C35028Fc1;
import X.C38E;
import X.C3G2;
import X.C42684Iuf;
import X.C46014KYc;
import X.C48b;
import X.C4QW;
import X.C50674MYs;
import X.C55014OWb;
import X.C57112jm;
import X.C61972ry;
import X.C66305U8d;
import X.C68032V7a;
import X.C68070V9a;
import X.C68756VbZ;
import X.C69020Vfw;
import X.C69021Vfx;
import X.C69305VlD;
import X.C69387VmX;
import X.C69422Vn7;
import X.C69591Vru;
import X.C69619VsM;
import X.C69717VuC;
import X.C69786VvR;
import X.C69794Vvd;
import X.C69800Vvm;
import X.C6XJ;
import X.C70684Wf5;
import X.C70709WfY;
import X.C70723Wfo;
import X.C70846WiC;
import X.C71158Wot;
import X.C71163Hc;
import X.C71196Wpl;
import X.FpQ;
import X.InterfaceC08430c6;
import X.InterfaceC41501vz;
import X.InterfaceC60072op;
import X.InterfaceC71921XAf;
import X.InterfaceC71922XAg;
import X.InterfaceC71923XAh;
import X.InterfaceC71945XBu;
import X.InterfaceC71980XDp;
import X.InterfaceC71981XDq;
import X.InterfaceC71982XDr;
import X.InterfaceC72044XLa;
import X.KYY;
import X.MQD;
import X.NAp;
import X.RunnableC71354WsP;
import X.TFA;
import X.ULQ;
import X.ULR;
import X.VEZ;
import X.ViewOnClickListenerC35684FpJ;
import X.ViewOnLayoutChangeListenerC66124U0h;
import X.W5X;
import X.W69;
import X.WD0;
import X.WDY;
import X.WGA;
import X.WNU;
import X.WNX;
import X.WOK;
import X.WUY;
import X.Wi2;
import X.XDN;
import X.XEB;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.android.maps.model.LatLng;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.discovery.mediamap.fragment.bottomsheetbehavior.MapBottomSheetBehavior;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes11.dex */
public class MediaMapFragment extends AbstractC59962oe implements InterfaceC60072op, XEB, XDN, InterfaceC71980XDp, InterfaceC71981XDq, InterfaceC71982XDr, InterfaceC71923XAh, MQD, InterfaceC71922XAg {
    public static final float[] A0i = {0.0f, 0.0f};
    public int A00;
    public int A01;
    public UserSession A02;
    public TFA A03;
    public Wi2 A04;
    public C69619VsM A05;
    public W69 A06;
    public C69387VmX A07;
    public InterfaceC71923XAh A08;
    public C69786VvR A09;
    public MapBottomSheetController A0A;
    public WDY A0B;
    public W5X A0C;
    public WUY A0D;
    public MediaMapQuery A0E;
    public WGA A0F;
    public C70846WiC A0G;
    public MediaMapPin A0H;
    public MediaMapPinPreview A0I;
    public C38E A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public long A0O;
    public LatLng A0P;
    public LatLng A0Q;
    public LatLng A0R;
    public LatLng A0S;
    public C61972ry A0T;
    public C57112jm A0U;
    public MapEntryPoint A0V;
    public MediaMapPin A0W;
    public C69021Vfx A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public C71158Wot mClipsVideoPlayerManager;
    public C70684Wf5 mMapChromeController;
    public ViewGroup mMapContainer;
    public C69800Vvm mMapViewController;
    public final C169487hO A0f = new C169487hO();
    public final String A0g = AbstractC166997dE.A0n();
    public final Rect A0d = new Rect();
    public final InterfaceC41501vz A0h = new C70723Wfo(this, 14);
    public final C68756VbZ A0e = new Object();

    @Override // X.XEB
    public final void D0C(MapBottomSheetController mapBottomSheetController) {
        this.A0K = false;
    }

    @Override // X.InterfaceC71980XDp
    public final void D1Y(LatLng latLng, boolean z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "discovery_map";
    }

    public static ArrayList A01(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            MediaMapPin mediaMapPin = (MediaMapPin) it.next();
            arrayList.add(new C69020Vfw(mediaMapPin.A0A.doubleValue(), mediaMapPin.A0B.doubleValue()));
        }
        return arrayList;
    }

    public static LinkedHashSet A02(MediaMapFragment mediaMapFragment) {
        ArrayList A00 = mediaMapFragment.A06.A02(mediaMapFragment.A0E).A00(mediaMapFragment.A09);
        ArrayList A002 = mediaMapFragment.A06.A02(MediaMapQuery.A09).A00(mediaMapFragment.A09);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(A00);
        linkedHashSet.addAll(A002);
        return linkedHashSet;
    }

    private void A03() {
        C69305VlD c69305VlD;
        VEZ vez = VEZ.A05;
        MediaMapQuery mediaMapQuery = this.A0E;
        MediaMapQuery mediaMapQuery2 = new MediaMapQuery(vez, mediaMapQuery.A07, mediaMapQuery.A01);
        W69 w69 = this.A06;
        ArrayList arrayList = new ArrayList(w69.A02(mediaMapQuery).A00(this.A09));
        C69800Vvm c69800Vvm = this.mMapViewController;
        if (c69800Vvm != null) {
            c69305VlD = c69800Vvm.A02();
        } else {
            c69305VlD = null;
        }
        w69.A05(mediaMapQuery2, c69305VlD, 0, arrayList, null);
        this.A0E = mediaMapQuery2;
        A07(this);
        A0A(this, false);
    }

    private void A04() {
        C69305VlD A02;
        C69800Vvm c69800Vvm = this.mMapViewController;
        if (c69800Vvm != null && (A02 = c69800Vvm.A02()) != null && this.A0E.A06 == VEZ.A06) {
            this.A04.A06.A01(A02);
        }
    }

    public static void A05(RectF rectF, MediaMapFragment mediaMapFragment, MediaMapPin mediaMapPin, AbstractC44340Jif abstractC44340Jif) {
        Reel reel;
        C120985dq c120985dq;
        GradientSpinner gradientSpinner = null;
        if (AbstractC167007dF.A1W(mediaMapPin.A08)) {
            C69619VsM c69619VsM = mediaMapFragment.A05;
            String A01 = AbstractC69973Vyo.A01(mediaMapPin);
            C14360o3.A0B(A01, 0);
            reel = (Reel) c69619VsM.A03.get(A01);
        } else {
            reel = null;
        }
        if (abstractC44340Jif != null) {
            gradientSpinner = abstractC44340Jif.A04();
        }
        C111034zF c111034zF = mediaMapPin.A03;
        if (c111034zF != null) {
            AbstractC128065qa.A02(c111034zF);
            if (mediaMapFragment.mClipsVideoPlayerManager != null) {
                UserSession userSession = mediaMapFragment.A02;
                FragmentActivity requireActivity = mediaMapFragment.requireActivity();
                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1k, mediaMapFragment.A02);
                c116875Qr.A1C = AbstractC69973Vyo.A01(mediaMapPin);
                C111034zF c111034zF2 = mediaMapPin.A03;
                if (c111034zF2 != null) {
                    c120985dq = AbstractC128065qa.A02(c111034zF2);
                } else {
                    c120985dq = null;
                }
                c120985dq.getClass();
                c116875Qr.A1D = c120985dq.getId();
                c116875Qr.A1d = false;
                c116875Qr.A05 = mediaMapFragment.mClipsVideoPlayerManager.A00(AbstractC69973Vyo.A01(mediaMapPin));
                AbstractC86593tX.A0Y(requireActivity, c116875Qr.A00(), userSession);
                return;
            }
            return;
        }
        if (reel != null && abstractC44340Jif != null && gradientSpinner != null) {
            RectF rectF2 = new RectF(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY());
            mediaMapFragment.A0F.A07(mediaMapFragment.A0E, mediaMapPin, "discovery_map", false);
            C38E c38e = mediaMapFragment.A0J;
            c38e.A05 = new C68070V9a(rectF2, mediaMapFragment, gradientSpinner);
            c38e.A0C = mediaMapFragment.A0g;
            c38e.A04(reel, C3G2.A1M, new C24029AlM(rectF2, mediaMapFragment, gradientSpinner));
            return;
        }
        String str = mediaMapPin.A0D;
        if (str == null) {
            return;
        }
        UserSession userSession2 = mediaMapFragment.A02;
        IgFragmentFactoryImpl.A00();
        C35028Fc1 c35028Fc1 = new C35028Fc1();
        c35028Fc1.A0B = str;
        c35028Fc1.A0E = AnonymousClass001.A0R("discovery_map", "_single_media");
        c35028Fc1.A0N = true;
        C6XJ c6xj = new C6XJ(mediaMapFragment.requireActivity(), c35028Fc1.A01(), userSession2, ModalActivity.class, AbstractC111324zv.A00(525));
        c6xj.A08();
        c6xj.A0C(mediaMapFragment.requireActivity());
    }

    public static void A06(MediaMapFragment mediaMapFragment) {
        LatLng latLng;
        C55014OWb c55014OWb = mediaMapFragment.mMapChromeController.A0O;
        c55014OWb.A00 = c55014OWb.A05.getResources().getString(2131973061);
        int intValue = mediaMapFragment.A00().intValue();
        if (intValue != 3 && intValue != 1) {
            if (intValue != 0) {
                if (intValue == 2) {
                    mediaMapFragment.mMapContainer.setVisibility(0);
                    C70684Wf5 c70684Wf5 = mediaMapFragment.mMapChromeController;
                    MediaMapPin mediaMapPin = mediaMapFragment.A0H;
                    mediaMapPin.getClass();
                    Location A00 = mediaMapFragment.A03.A00("MediaMapFragment");
                    c70684Wf5.A0C.setVisibility(0);
                    FrameLayout frameLayout = c70684Wf5.A0E;
                    frameLayout.setVisibility(0);
                    if (A00 != null) {
                        latLng = AbstractC43594JPz.A0L(A00);
                    } else {
                        latLng = AbstractC68633VYo.A00;
                    }
                    C69800Vvm c69800Vvm = c70684Wf5.A0N;
                    c69800Vvm.A0A(latLng.A00, latLng.A01, 15.0f);
                    c69800Vvm.A0C((r6.mContainer.getHeight() / 2.0f) - (r6.A00 + c70684Wf5.A0J.A03));
                    Rect rect = new Rect();
                    ImageView imageView = c70684Wf5.A0F;
                    imageView.getWindowVisibleDisplayFrame(rect);
                    rect.top = 0;
                    C69422Vn7 c69422Vn7 = new C69422Vn7(imageView, C70684Wf5.__redex_internal_original_name, frameLayout);
                    c69422Vn7.A00 = 6;
                    c69422Vn7.A02 = 6;
                    c69422Vn7.A05 = rect;
                    C66305U8d c66305U8d = new C66305U8d(c69422Vn7);
                    c70684Wf5.A02 = c66305U8d;
                    imageView.setImageDrawable(c66305U8d);
                    WNU.A00(imageView, 18, c70684Wf5);
                    long currentTimeMillis = System.currentTimeMillis();
                    c70684Wf5.A00 = System.currentTimeMillis();
                    if (c70684Wf5.A01 == null) {
                        c70684Wf5.A01 = new WOK(c70684Wf5, currentTimeMillis);
                    }
                    frameLayout.getViewTreeObserver().addOnPreDrawListener(c70684Wf5.A01);
                    Activity activity = c70684Wf5.A08;
                    C46014KYc c46014KYc = new C46014KYc(activity, null, mediaMapPin.A00(), AbstractC43591JPw.A00(414), 1.0f, Math.round(AbstractC13880nE.A04(activity, 104)), AbstractC167007dF.A1W(mediaMapPin.A08), AbstractC167007dF.A1W(mediaMapPin.A03), AbstractC69973Vyo.A00(mediaMapPin.A09).CcN());
                    c46014KYc.A0F = false;
                    C46014KYc.A01(c46014KYc);
                    ImageView imageView2 = c70684Wf5.A0G;
                    imageView2.setImageDrawable(c46014KYc);
                    imageView2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC66124U0h(c70684Wf5, 7));
                    WNX.A00(imageView2, c70684Wf5, mediaMapPin, c46014KYc, 34);
                    C55014OWb c55014OWb2 = mediaMapFragment.mMapChromeController.A0O;
                    c55014OWb2.A00 = c55014OWb2.A05.getResources().getString(2131962019);
                    return;
                }
                return;
            }
            mediaMapFragment.mMapContainer.setVisibility(4);
        } else {
            mediaMapFragment.mMapContainer.setVisibility(0);
        }
        C70684Wf5 c70684Wf52 = mediaMapFragment.mMapChromeController;
        c70684Wf52.A0C.setVisibility(8);
        c70684Wf52.A02 = null;
    }

    public static void A07(MediaMapFragment mediaMapFragment) {
        MediaMapPin mediaMapPin;
        C69305VlD c69305VlD;
        if (mediaMapFragment.A0E != null && mediaMapFragment.mMapViewController != null) {
            mediaMapFragment.A04();
            mediaMapFragment.mMapViewController.A0F(new HashSet(A02(mediaMapFragment)));
            mediaMapFragment.mMapViewController.A08();
            ArrayList A01 = A01(mediaMapFragment.A06.A02(mediaMapFragment.A0E).A00(mediaMapFragment.A09));
            MediaMapQuery mediaMapQuery = mediaMapFragment.A0E;
            if (mediaMapQuery.A06 == VEZ.A05 && mediaMapQuery.A05 && !mediaMapQuery.A04) {
                C69591Vru A02 = mediaMapFragment.A06.A02(mediaMapQuery);
                ArrayList A00 = A02.A00(mediaMapFragment.A09);
                C69786VvR c69786VvR = mediaMapFragment.A09;
                C14360o3.A0B(c69786VvR, 0);
                String str = A02.A01;
                if (str != null && (mediaMapPin = (MediaMapPin) c69786VvR.A02.get(str)) != null) {
                    if (new ArrayList(A02.A03).isEmpty()) {
                        A02 = mediaMapFragment.A06.A02(MediaMapQuery.A08);
                    }
                    ArrayList arrayList = new ArrayList(A02.A03);
                    W69 w69 = mediaMapFragment.A06;
                    MediaMapQuery mediaMapQuery2 = MediaMapQuery.A08;
                    C69800Vvm c69800Vvm = mediaMapFragment.mMapViewController;
                    if (c69800Vvm != null) {
                        c69305VlD = c69800Vvm.A02();
                    } else {
                        c69305VlD = null;
                    }
                    w69.A05(mediaMapQuery2, c69305VlD, null, A00, arrayList);
                    mediaMapFragment.A0E = mediaMapQuery2;
                    mediaMapFragment.A0B.A04();
                    mediaMapFragment.A06.A04(mediaMapFragment.A0E);
                    mediaMapFragment.mMapViewController.A0A(mediaMapPin.A0A.doubleValue(), mediaMapPin.A0B.doubleValue(), 16.0f);
                    if (mediaMapFragment.A0A.A03()) {
                        mediaMapFragment.mMapViewController.A0C((r4.mContainer.getHeight() / 2.0f) - (r4.A00 + mediaMapFragment.A0A.A03));
                    }
                    if (mediaMapFragment.A0c) {
                        mediaMapFragment.A0C.A03(AbstractC69973Vyo.A01(mediaMapPin));
                    }
                } else {
                    if (mediaMapFragment.A0R == null) {
                        C69800Vvm c69800Vvm2 = mediaMapFragment.mMapViewController;
                        float f = mediaMapFragment.A00;
                        int i = mediaMapFragment.A01;
                        c69800Vvm2.A0E(A01, f, i, i, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, false);
                    }
                    mediaMapFragment.A0B.A05(null, mediaMapFragment.A0E, false);
                }
                mediaMapFragment.A0R = null;
            }
            MediaMapQuery mediaMapQuery3 = mediaMapFragment.A0E;
            if (mediaMapQuery3.A05) {
                mediaMapQuery3.A04 = true;
            }
        }
    }

    public static void A08(MediaMapFragment mediaMapFragment, VEZ vez, String str, String str2) {
        MediaMapQuery mediaMapQuery = MediaMapQuery.A08;
        if (!AbstractC50102Ry.A00(str, "17843767138059124")) {
            if (vez == VEZ.A07) {
                mediaMapQuery = MediaMapQuery.A09;
                mediaMapQuery.A01 = str2;
            } else {
                mediaMapQuery = new MediaMapQuery(vez, str, str2);
            }
        }
        mediaMapFragment.A0E = mediaMapQuery;
        A07(mediaMapFragment);
    }

    public static void A09(MediaMapFragment mediaMapFragment, MediaMapPin mediaMapPin) {
        C69786VvR c69786VvR = mediaMapFragment.A09;
        c69786VvR.A04.add(AbstractC69973Vyo.A01(mediaMapPin));
        mediaMapFragment.A09.A01(mediaMapFragment.A02, mediaMapFragment.A0T, mediaMapFragment.A05, null, AbstractC31174DnI.A0z(AbstractC69973Vyo.A01(mediaMapPin)));
    }

    public static void A0A(MediaMapFragment mediaMapFragment, boolean z) {
        Location location;
        C69305VlD A02;
        String str;
        W69 w69 = mediaMapFragment.A06;
        if (w69.A01 && !w69.A00) {
            w69.A03(null, MediaMapQuery.A09, null);
        }
        MediaMapQuery mediaMapQuery = mediaMapFragment.A0E;
        if (mediaMapQuery != null) {
            if (mediaMapQuery.A04 && mediaMapQuery.A06 == VEZ.A05) {
                mediaMapFragment.A0E = MediaMapQuery.A08;
                A07(mediaMapFragment);
                mediaMapFragment.A0B.A04();
            }
            if (AbstractC31178DnM.A1X(C06090Tz.A05, mediaMapFragment.A02, 36321456090785239L)) {
                location = mediaMapFragment.A03.A00("MediaMapFragment");
            } else {
                location = null;
            }
            C69800Vvm c69800Vvm = mediaMapFragment.mMapViewController;
            if (c69800Vvm != null && (A02 = c69800Vvm.A02()) != null) {
                WGA wga = mediaMapFragment.A0F;
                MediaMapQuery mediaMapQuery2 = mediaMapFragment.A0E;
                if (z) {
                    str = "instagram_map_query_request_from_user_interaction";
                } else {
                    str = "instagram_map_query_request_automatic";
                }
                C25531Mh A01 = WGA.A01(wga, str);
                AbstractC65702TsY.A1H(A01, mediaMapQuery2);
                A01.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, wga.A04.A00);
                A01.Cht();
                mediaMapFragment.A06.A03(location, mediaMapFragment.A0E, A02);
            }
        }
    }

    private boolean A0B() {
        MediaMapQuery mediaMapQuery = this.A0E;
        if (mediaMapQuery != null && mediaMapQuery.A06 == VEZ.A04) {
            return true;
        }
        return false;
    }

    public final void A0D() {
        TreeSet A02 = this.A0C.A02();
        WUY wuy = this.A0D;
        MediaMapPin mediaMapPin = (MediaMapPin) A02.iterator().next();
        LocationPageInformation locationPageInformation = mediaMapPin.A06;
        Venue A00 = AbstractC69973Vyo.A00(mediaMapPin.A09);
        MediaMapFragment mediaMapFragment = wuy.A02;
        FragmentActivity activity = mediaMapFragment.getActivity();
        if (locationPageInformation != null && mediaMapFragment.isAdded() && activity != null) {
            C50674MYs c50674MYs = new C50674MYs(activity, wuy.A01.A00);
            c50674MYs.A03 = new C42684Iuf(0);
            if (!locationPageInformation.A05.isEmpty()) {
                if (C18U.A06(C06090Tz.A05, wuy.A00, 36315692244405750L)) {
                    c50674MYs.A08(WD0.A00(locationPageInformation, false));
                }
            }
            c50674MYs.A01(new WNX(35, wuy, A00, activity), 2131972368);
            if ((mediaMapPin.A0A != null && mediaMapPin.A0B != null) || locationPageInformation.A05 != null || locationPageInformation.A07 != null || locationPageInformation.A0B != null) {
                c50674MYs.A03(new WNX(36, wuy, mediaMapPin, activity), 2131969214);
            }
            c50674MYs.A03(new WNX(37, wuy, locationPageInformation, activity), 2131956832);
            if (AbstractC54241NyM.A00(wuy.A00)) {
                c50674MYs.A03(new FpQ(62, A00, wuy), 2131971200);
            }
            c50674MYs.A03(new ViewOnClickListenerC35684FpJ(29, wuy, locationPageInformation, A00), 2131973727);
            new C31727DwY(c50674MYs).A07(mediaMapFragment.getContext());
        }
    }

    public final void A0E() {
        String str;
        WDY wdy = this.A0B;
        MediaMapQuery mediaMapQuery = this.A0E;
        if (mediaMapQuery.A06 == VEZ.A03) {
            str = mediaMapQuery.A01;
        } else {
            str = null;
        }
        AbstractC67879V0k abstractC67879V0k = new AbstractC67879V0k();
        Bundle bundle = new Bundle();
        AbstractC31173DnH.A1C(bundle, wdy.A05);
        if (str != null) {
            bundle.putString("arg_hashtag_name", str);
        }
        abstractC67879V0k.setArguments(bundle);
        WDY.A01(wdy);
        C14240no c14240no = new C14240no(wdy.A03);
        c14240no.A07(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
        c14240no.A0A(abstractC67879V0k, R.id.fragment_container);
        c14240no.A0I("SEARCH");
        c14240no.A0J(false);
    }

    public final void A0G() {
        float f;
        W69 w69 = this.A06;
        if (w69.A05.contains(this.A0E) && this.A0E.A06 == VEZ.A05) {
            return;
        }
        MapBottomSheetController mapBottomSheetController = this.A0A;
        InterfaceC08430c6 A02 = this.A0B.A02();
        if (A02 != null && (A02 instanceof InterfaceC71921XAf)) {
            f = ((InterfaceC71921XAf) A02).Bc9();
        } else {
            f = 0.5f;
        }
        mapBottomSheetController.mBottomSheetBehavior.A0R(true, f);
    }

    public final void A0H(AbstractC67879V0k abstractC67879V0k) {
        Integer num;
        MapBottomSheetBehavior mapBottomSheetBehavior;
        float max;
        String str;
        if (this.A0N) {
            this.A0N = false;
            MapBottomSheetController mapBottomSheetController = this.A0A;
            mapBottomSheetBehavior = mapBottomSheetController.mBottomSheetBehavior;
            max = mapBottomSheetController.A01();
        } else {
            if (abstractC67879V0k instanceof LocationDetailFragment) {
                num = C05F.A0N;
            } else if (abstractC67879V0k instanceof C68032V7a) {
                num = C05F.A0j;
            } else if (abstractC67879V0k instanceof LocationSearchFragment) {
                num = C05F.A0Y;
            } else {
                LocationListFragment locationListFragment = (LocationListFragment) abstractC67879V0k;
                if (locationListFragment.A00 == LocationListFragmentMode.A02) {
                    num = C05F.A01;
                } else if (LocationListFragment.A05(locationListFragment)) {
                    num = C05F.A00;
                } else {
                    num = C05F.A0C;
                }
            }
            int intValue = num.intValue();
            if (intValue != 0 && intValue != 1 && intValue != 2) {
                if (intValue != 4) {
                    if (intValue != 3) {
                        return;
                    }
                    String A01 = AbstractC69973Vyo.A01(((LocationDetailFragment) abstractC67879V0k).A03);
                    MediaMapPin mediaMapPin = this.A0H;
                    if (mediaMapPin != null) {
                        str = AbstractC69973Vyo.A01(mediaMapPin);
                    } else {
                        str = null;
                    }
                    if (AbstractC50102Ry.A00(A01, str) || A0B()) {
                        return;
                    }
                    MapBottomSheetController mapBottomSheetController2 = this.A0A;
                    mapBottomSheetBehavior = mapBottomSheetController2.mBottomSheetBehavior;
                    max = mapBottomSheetController2.A02();
                } else {
                    mapBottomSheetBehavior = this.A0A.mBottomSheetBehavior;
                    max = 1.0f;
                }
            } else {
                MapBottomSheetController mapBottomSheetController3 = this.A0A;
                mapBottomSheetBehavior = mapBottomSheetController3.mBottomSheetBehavior;
                max = Math.max((float) mapBottomSheetBehavior.A0F.A01, mapBottomSheetController3.A02());
            }
        }
        mapBottomSheetBehavior.A0R(true, max);
    }

    public final void A0J(C69794Vvd c69794Vvd) {
        VEZ vez = VEZ.A05;
        String A05 = c69794Vvd.A00().A05();
        C14360o3.A07(A05);
        A08(this, vez, A05, c69794Vvd.A01());
        A0A(this, true);
        AbstractC13880nE.A0O(this.mView);
        this.A0A.mBottomSheetBehavior.A0R(true, 0.0f);
    }

    public final void A0K(Map map) {
        String str;
        C69800Vvm c69800Vvm = this.mMapViewController;
        if (c69800Vvm.A00 != null && c69800Vvm.A01 != null) {
            Set<MediaMapPin> A06 = c69800Vvm.A06();
            HashMap hashMap = new HashMap();
            for (MediaMapPin mediaMapPin : A06) {
                Venue A00 = AbstractC69973Vyo.A00(mediaMapPin.A09);
                if (A00.A05() != null) {
                    hashMap.put(A00.A05(), mediaMapPin);
                }
            }
            WGA wga = this.A0F;
            MediaMapQuery mediaMapQuery = this.A0E;
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                String str2 = (String) entry.getKey();
                MediaMapPin mediaMapPin2 = (MediaMapPin) hashMap.get(str2);
                Long l = (Long) entry.getValue();
                HashSet hashSet = wga.A06;
                if (hashSet.contains(str2)) {
                    str = "instagram_map_location_pin_sub_impression";
                } else {
                    hashSet.add(str2);
                    str = "instagram_map_location_pin_impression";
                }
                C25531Mh A01 = WGA.A01(wga, str);
                A01.A0R("location_id", str2);
                A01.A0Q("session_duration", l);
                A01.A0R("query_token", mediaMapQuery.A02);
                if (mediaMapPin2 != null) {
                    WGA.A03(A01, mediaMapPin2);
                    WGA.A04(A01, mediaMapPin2, false);
                }
                A01.Cht();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    @Override // X.InterfaceC71982XDr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.ULQ ALe(X.C71196Wpl r20, X.InterfaceC72044XLa r21, X.C70394WTw r22) {
        /*
            r19 = this;
            r0 = r21
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = (com.instagram.discovery.mediamap.model.MediaMapPin) r0
            com.instagram.model.venue.LocationDict r1 = r0.A09
            com.instagram.model.venue.Venue r2 = X.AbstractC69973Vyo.A00(r1)
            com.instagram.model.venue.LocationDictIntf r1 = r2.A00
            java.lang.String r1 = r1.getShortName()
            if (r1 == 0) goto Lbc
            com.instagram.model.venue.LocationDictIntf r1 = r2.A00
            java.lang.String r10 = r1.getShortName()
        L18:
            r7 = r19
            X.VvR r1 = r7.A09
            java.lang.String r2 = X.AbstractC69973Vyo.A01(r0)
            java.util.Set r1 = r1.A04
            boolean r4 = r1.contains(r2)
            boolean r1 = r7.A0M
            if (r1 == 0) goto L7a
            r1 = r4 ^ 1
        L2c:
            r6 = 0
            if (r1 == 0) goto Lb4
            r8 = r6
        L30:
            r3 = 0
            java.lang.String r9 = X.AbstractC69973Vyo.A01(r0)
            r4 = r20
            com.facebook.android.maps.model.LatLng r1 = r4.A03()
            double r11 = r1.A00
            com.facebook.android.maps.model.LatLng r1 = r4.A03()
            double r13 = r1.A01
            r5 = r22
            android.content.Context r2 = r5.A0G
            r1 = 64
            X.AbstractC13880nE.A04(r2, r1)
            int r15 = r7.A01
            X.1pE r1 = r0.A08
            boolean r16 = X.AbstractC167007dF.A1W(r1)
            X.4zF r1 = r0.A03
            boolean r17 = X.AbstractC167007dF.A1W(r1)
            com.instagram.model.venue.LocationDict r1 = r0.A09
            com.instagram.model.venue.Venue r1 = X.AbstractC69973Vyo.A00(r1)
            boolean r18 = r1.CcN()
            X.KYY r2 = new X.KYY
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r18)
            X.W5X r1 = r7.A0C
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = r1.A01()
            boolean r0 = X.AbstractC50102Ry.A00(r1, r0)
            if (r0 == 0) goto L79
            X.VbZ r0 = r7.A0e
            r0.A00 = r2
        L79:
            return r2
        L7a:
            X.W69 r2 = r7.A06
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r7.A0E
            X.Vru r2 = r2.A02(r1)
            X.VvR r1 = r7.A09
            java.util.ArrayList r1 = r2.A00(r1)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        L91:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r2.next()
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = (com.instagram.discovery.mediamap.model.MediaMapPin) r1
            java.lang.String r1 = X.AbstractC69973Vyo.A01(r1)
            r3.add(r1)
            goto L91
        La5:
            java.lang.String r1 = X.AbstractC69973Vyo.A01(r0)
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto Lb4
            if (r4 != 0) goto Lb4
            r1 = 1
            goto L2c
        Lb4:
            java.lang.String r8 = r0.A0D
            com.instagram.common.typedurl.ImageUrl r6 = r0.A00()
            goto L30
        Lbc:
            com.instagram.model.venue.LocationDictIntf r1 = r2.A00
            java.lang.String r10 = r1.getName()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.MediaMapFragment.ALe(X.Wpl, X.XLa, X.WTw):X.ULQ");
    }

    @Override // X.InterfaceC71982XDr
    public final Map Aom() {
        String str;
        if (this.mMapViewController == null) {
            return Collections.emptyMap();
        }
        TreeSet A02 = this.A0C.A02();
        Set<MediaMapPin> A06 = this.mMapViewController.A06();
        HashMap hashMap = new HashMap();
        for (MediaMapPin mediaMapPin : A06) {
            if (AbstractC69973Vyo.A00(mediaMapPin.A09).CcN() && mediaMapPin.A00() == null) {
                str = "saved-cluster";
            } else if (A02.contains(mediaMapPin)) {
                str = "selected-cluster";
            } else {
                str = "default-cluster";
            }
            hashMap.put(mediaMapPin, str);
        }
        return hashMap;
    }

    @Override // X.InterfaceC71981XDq
    public final Location AuY(C69717VuC c69717VuC, String str) {
        return this.A03.A00(AnonymousClass001.A0R("MediaMapFragment:", "CurrentLocationDrawable"));
    }

    @Override // X.InterfaceC71982XDr
    public final int BPe(AbstractC66278U6y abstractC66278U6y) {
        AbstractC44340Jif abstractC44340Jif;
        if ((abstractC66278U6y instanceof KYY) && (abstractC44340Jif = ((KYY) abstractC66278U6y).A03) != null) {
            return abstractC44340Jif.A03();
        }
        return 0;
    }

    @Override // X.InterfaceC71981XDq
    public final /* bridge */ /* synthetic */ InterfaceC72044XLa BgP() {
        return this.A0C.A01();
    }

    @Override // X.XEB
    public final void D05(MapBottomSheetController mapBottomSheetController) {
        MapBottomSheetController mapBottomSheetController2 = this.A0A;
        if (mapBottomSheetController2 != null) {
            this.A0K = mapBottomSheetController2.A03();
        }
    }

    @Override // X.XEB
    public final void D07(MapBottomSheetController mapBottomSheetController) {
        MapBottomSheetBehavior mapBottomSheetBehavior;
        float A02;
        AbstractC67879V0k A022 = this.A0B.A02();
        if (A0B()) {
            mapBottomSheetBehavior = mapBottomSheetController.mBottomSheetBehavior;
            A02 = mapBottomSheetController.A00();
        } else if (A022 == null) {
            mapBottomSheetBehavior = mapBottomSheetController.mBottomSheetBehavior;
            A02 = mapBottomSheetController.A01();
        } else {
            boolean z = this.A0N;
            MapBottomSheetController mapBottomSheetController2 = this.A0A;
            if (z) {
                mapBottomSheetController2.mBottomSheetBehavior.A0R(true, mapBottomSheetController2.A01());
                this.A0N = false;
                return;
            } else {
                mapBottomSheetBehavior = mapBottomSheetController2.mBottomSheetBehavior;
                A02 = mapBottomSheetController2.A02();
            }
        }
        mapBottomSheetBehavior.A0R(false, A02);
    }

    @Override // X.XEB
    public final void D0A(MapBottomSheetController mapBottomSheetController, float f, float f2, float f3, float f4) {
        boolean z;
        TreeSet A02 = this.A0C.A02();
        float f5 = f4 - f3;
        if (this.A0K && f <= mapBottomSheetController.A00() && f >= 0.5d) {
            this.mMapViewController.A0C(f5);
            z = true;
        } else {
            z = false;
        }
        C69800Vvm c69800Vvm = this.mMapViewController;
        if (c69800Vvm.A00 != null && c69800Vvm.A01 != null && getActivity() != null && !A02.isEmpty()) {
            float A022 = AbstractC13600mm.A02(f, mapBottomSheetController.A01(), mapBottomSheetController.A02(), 0.0f, 1.0f);
            if (A02.size() != 0 && A02.size() > 1) {
                this.mMapChromeController.A0I.A04.A08(A022, true);
            }
            if (!z && f <= 0.5d) {
                Iterator it = this.mMapViewController.A05(this.A0C.A02()).iterator();
                while (it.hasNext()) {
                    LatLng Bea = ((AbstractC66278U6y) it.next()).Bea();
                    C69800Vvm c69800Vvm2 = this.mMapViewController;
                    double d = Bea.A00;
                    double d2 = Bea.A01;
                    float[] fArr = A0i;
                    c69800Vvm2.A0G(fArr, d, d2);
                    if (((fArr[1] - AbstractC56402iY.A01(requireActivity())) + (this.A00 / 2.0f)) - f3 > 0.0f) {
                        this.mMapViewController.A0C(f5);
                        return;
                    }
                }
            }
        }
    }

    @Override // X.XEB
    public final void D0B(MapBottomSheetController mapBottomSheetController, float f) {
        LocationListFragment locationListFragment;
        Bundle bundle;
        C4QW c4qw;
        MediaMapPin mediaMapPin;
        C69800Vvm c69800Vvm = this.mMapViewController;
        if (c69800Vvm != null && c69800Vvm.A00 != null && c69800Vvm.A01 != null) {
            if (f == 1.0f) {
                AbstractC67879V0k A02 = this.A0B.A02();
                AbstractCollection A022 = this.A0C.A02();
                if (A022.size() == 1 && (mediaMapPin = (MediaMapPin) A022.iterator().next()) != null) {
                    this.A0F.A09(this.A0E, A022, this.A06.A01(r2, mediaMapPin));
                } else if (!(A02 instanceof LocationListFragment) || (A022 = (locationListFragment = (LocationListFragment) A02).A05) != null || ((bundle = locationListFragment.mArguments) != null && (A022 = bundle.getParcelableArrayList("arg_map_pins")) != null)) {
                    this.A0F.A09(this.A0E, A022, -1L);
                }
                C71158Wot c71158Wot = this.mClipsVideoPlayerManager;
                if (c71158Wot != null && (c4qw = c71158Wot.A05) != null && c4qw.isPlaying()) {
                    c71158Wot.A02 = true;
                    c4qw.Eol("", true);
                }
            } else {
                C71158Wot c71158Wot2 = this.mClipsVideoPlayerManager;
                if (c71158Wot2 != null) {
                    c71158Wot2.A01();
                }
            }
            if (f == mapBottomSheetController.A01()) {
                this.mMapChromeController.A0I.A04.A04();
            } else if (this.A0C.A02().size() > 1) {
                this.mMapChromeController.A04();
            }
            int intValue = A00().intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    C70684Wf5 c70684Wf5 = this.mMapChromeController;
                    Handler handler = c70684Wf5.A09;
                    Runnable runnable = c70684Wf5.A0P;
                    handler.removeCallbacks(runnable);
                    runnable.run();
                    return;
                }
                return;
            }
            this.A0c = true;
            A03();
        }
    }

    @Override // X.XDN
    public final void DHG(W69 w69, MediaMapQuery mediaMapQuery) {
        C69305VlD A02;
        if (mediaMapQuery != MediaMapQuery.A09) {
            C70684Wf5 c70684Wf5 = this.mMapChromeController;
            c70684Wf5.A05 = false;
            C55014OWb c55014OWb = c70684Wf5.A0O;
            if (c55014OWb != null) {
                c55014OWb.A01();
            }
            if (!this.A0a) {
                this.A0c = true;
                this.A0a = true;
            }
            A06(this);
            MediaMapQuery mediaMapQuery2 = this.A0E;
            VEZ vez = mediaMapQuery2.A06;
            if (vez != VEZ.A05 && vez != VEZ.A04) {
                ArrayList A00 = this.A06.A02(mediaMapQuery2).A00(this.A09);
                ArrayList A01 = A01(A00);
                C69800Vvm c69800Vvm = this.mMapViewController;
                if (c69800Vvm != null && (A02 = c69800Vvm.A02()) != null && AbstractC70135W6m.A00(A02, A00).size() < A00.size()) {
                    C69800Vvm c69800Vvm2 = this.mMapViewController;
                    float f = this.A00;
                    int i = this.A01;
                    c69800Vvm2.A0E(A01, f, i, i, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, false);
                }
            }
        }
    }

    @Override // X.InterfaceC71922XAg
    public final void DQI(C69619VsM c69619VsM) {
        this.A06.A04(this.A0E);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    @Override // X.InterfaceC71980XDp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DR4(X.C69800Vvm r20) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.MediaMapFragment.DR4(X.Vvm):void");
    }

    @Override // X.MQD
    public final boolean DYo(KYY kyy, String str, String str2) {
        InterfaceC71945XBu interfaceC71945XBu;
        C71196Wpl c71196Wpl = kyy.A0E;
        c71196Wpl.getClass();
        C71196Wpl.A02(c71196Wpl);
        if (0 < c71196Wpl.A03) {
            interfaceC71945XBu = c71196Wpl.A07[0].A04;
        } else {
            interfaceC71945XBu = null;
        }
        MediaMapPin mediaMapPin = (MediaMapPin) interfaceC71945XBu;
        if (mediaMapPin != null) {
            WGA wga = this.A0F;
            Integer num = C05F.A00;
            wga.A06(this.A0E, mediaMapPin, num, "discovery_map", this.A06.A01(r5, mediaMapPin));
            A09(this, mediaMapPin);
            MediaMapPin A01 = this.A0C.A01();
            if (A01 != null && AbstractC50102Ry.A00(AbstractC69973Vyo.A01(A01), AbstractC69973Vyo.A01(mediaMapPin))) {
                A05(new RectF(kyy.A0D), this, mediaMapPin, kyy.A03);
            } else {
                this.A0C.A03(AbstractC69973Vyo.A01(mediaMapPin));
                return true;
            }
        }
        return true;
    }

    @Override // X.InterfaceC71980XDp
    public final void DZl(C69800Vvm c69800Vvm, C69021Vfx c69021Vfx) {
        MediaMapQuery mediaMapQuery = this.A0E;
        if (mediaMapQuery != null && mediaMapQuery.A06.ordinal() != 4) {
            C69021Vfx c69021Vfx2 = this.A0X;
            if (c69021Vfx2 != null) {
                float[] fArr = new float[3];
                C69020Vfw c69020Vfw = c69021Vfx2.A01;
                double d = c69020Vfw.A00;
                double d2 = c69020Vfw.A01;
                C69020Vfw c69020Vfw2 = c69021Vfx.A01;
                Location.distanceBetween(d, d2, c69020Vfw2.A00, c69020Vfw2.A01, fArr);
                if (fArr[0] < 300.0f && this.A0X.A00 == c69021Vfx.A00) {
                    return;
                }
            }
            if (this.A0A.A03()) {
                return;
            }
            this.A0X = c69021Vfx;
            C70684Wf5 c70684Wf5 = this.mMapChromeController;
            Handler handler = c70684Wf5.A09;
            Runnable runnable = c70684Wf5.A0P;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 300L);
            A04();
        }
    }

    @Override // X.XDN
    public final void Do7(W69 w69, MediaMapQuery mediaMapQuery) {
        W5X w5x;
        LinkedHashSet linkedHashSet;
        if (mediaMapQuery != MediaMapQuery.A09) {
            Set A06 = this.mMapViewController.A06();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            if (this.A0E.A06 == VEZ.A05) {
                Iterator it = A06.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MediaMapPin mediaMapPin = (MediaMapPin) it.next();
                    if (AbstractC50102Ry.A00(AbstractC69973Vyo.A01(mediaMapPin), this.A0E.A07)) {
                        linkedHashSet2.add(mediaMapPin);
                        break;
                    }
                }
            }
            if (!this.A0a && this.A0c && linkedHashSet2.size() == 1) {
                w5x = this.A0C;
                linkedHashSet = new LinkedHashSet();
                Iterator it2 = linkedHashSet2.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(AbstractC69973Vyo.A01((MediaMapPin) it2.next()));
                }
            } else {
                w5x = this.A0C;
                linkedHashSet = new LinkedHashSet();
            }
            W5X.A00(w5x, linkedHashSet);
            this.mMapViewController.A0F(linkedHashSet2);
            this.mMapViewController.A08();
            C70684Wf5 c70684Wf5 = this.mMapChromeController;
            c70684Wf5.A05 = true;
            C55014OWb c55014OWb = c70684Wf5.A0O;
            if (c55014OWb != null) {
                if (false != c55014OWb.A01) {
                    c55014OWb.A01 = false;
                    C55014OWb.A00(c55014OWb);
                }
                c55014OWb.A02();
            }
        }
    }

    @Override // X.InterfaceC71981XDq
    public final void EGg(C69717VuC c69717VuC, ULQ ulq) {
        ulq.A0L(C05F.A01, false);
    }

    @Override // X.InterfaceC71981XDq
    public final void EGh(C69717VuC c69717VuC, ULQ ulq) {
        ulq.A0L(C05F.A00, false);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC67879V0k A02 = this.A0B.A02();
        if (!(A02 instanceof LocationSearchFragment)) {
            boolean z = A02 instanceof LocationDetailFragment;
            if (z) {
                ((LocationDetailFragment) A02).onBackPressed();
            }
            if (!this.A0Z && (A02 instanceof LocationListFragment)) {
                LocationListFragmentMode locationListFragmentMode = ((LocationListFragment) A02).A00;
                if (locationListFragmentMode != LocationListFragmentMode.A03 || this.A0E != MediaMapQuery.A08) {
                    A0I(locationListFragmentMode);
                    return true;
                }
            } else if (z) {
                if (A0B() && this.A0A.A03()) {
                    AbstractC25227BEk.A1B(this);
                    return true;
                }
                A0C();
                return true;
            }
            if (!(A02 instanceof C68032V7a)) {
                return false;
            }
        }
        AbstractC10360h2 abstractC10360h2 = this.A0B.A03;
        if (abstractC10360h2.A0L() > 1) {
            abstractC10360h2.A0b();
            return true;
        }
        return true;
    }

    private Integer A00() {
        if (!A0B()) {
            return C05F.A0N;
        }
        MediaMapPin mediaMapPin = this.A0H;
        if (mediaMapPin != null) {
            if (this.A0L) {
                return C05F.A00;
            }
            LocationDict locationDict = mediaMapPin.A09;
            if (locationDict == null || locationDict.A02 == null || locationDict.A03 == null) {
                return C05F.A0C;
            }
        }
        return C05F.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r5.A0A.A03() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C() {
        /*
            r5 = this;
            java.lang.Integer r2 = r5.A00()
            X.W5X r1 = r5.A0C
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            X.W5X.A00(r1, r0)
            int r1 = r2.intValue()
            r4 = 1
            r3 = 0
            if (r1 == r4) goto L41
            r0 = 2
            if (r1 != r0) goto L3d
            X.WDY r0 = r5.A0B
            r0.A04()
            com.instagram.discovery.mediamap.intf.MediaMapQuery r0 = com.instagram.discovery.mediamap.intf.MediaMapQuery.A08
            r5.A0E = r0
            A07(r5)
            A0A(r5, r3)
            com.instagram.discovery.mediamap.fragment.MapBottomSheetController r0 = r5.A0A
            boolean r0 = r0.A03()
            if (r0 == 0) goto L3d
        L30:
            r5.A0K = r4
            com.instagram.discovery.mediamap.fragment.MapBottomSheetController r0 = r5.A0A
            com.instagram.discovery.mediamap.fragment.bottomsheetbehavior.MapBottomSheetBehavior r1 = r0.mBottomSheetBehavior
            float r0 = r0.A02()
            r1.A0R(r4, r0)
        L3d:
            A06(r5)
            return
        L41:
            r5.A0c = r3
            r5.A03()
            X.WDY r0 = r5.A0B
            r0.A04()
            X.WDY r2 = r5.A0B
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r5.A0E
            r0 = 0
            r2.A05(r0, r1, r3)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.MediaMapFragment.A0C():void");
    }

    public final void A0F() {
        if (A00() == C05F.A0C) {
            this.A0B.A04();
            this.A0E = MediaMapQuery.A08;
            A07(this);
            A0A(this, false);
            A06(this);
            return;
        }
        A0A(this, true);
    }

    public final void A0I(LocationListFragmentMode locationListFragmentMode) {
        C69800Vvm c69800Vvm;
        int ordinal = locationListFragmentMode.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (this.A0C.A02().isEmpty()) {
                    AbstractC10360h2 abstractC10360h2 = this.A0B.A03;
                    if (abstractC10360h2.A0L() > 1) {
                        abstractC10360h2.A0b();
                        return;
                    }
                    return;
                }
                W5X.A00(this.A0C, new LinkedHashSet());
                return;
            }
            return;
        }
        this.A0B.A04();
        this.A0E = MediaMapQuery.A08;
        A07(this);
        if (this.A0E == null || (c69800Vvm = this.mMapViewController) == null || c69800Vvm.A02() == null) {
            return;
        }
        W69 w69 = this.A06;
        if (!AbstractC70135W6m.A00(this.mMapViewController.A02(), w69.A02(this.A0E).A00(w69.A03)).isEmpty()) {
            return;
        }
        A0A(this, false);
    }

    @Override // X.InterfaceC71982XDr
    public final int Aol() {
        return Math.round(C46014KYc.A00(requireContext(), this.A01));
    }

    @Override // X.InterfaceC71980XDp
    public final void DR0(C69800Vvm c69800Vvm) {
        if (isResumed()) {
            if (A0B()) {
                this.A0K = true;
                MapBottomSheetController mapBottomSheetController = this.A0A;
                mapBottomSheetController.mBottomSheetBehavior.A0R(true, mapBottomSheetController.A02());
                return;
            }
            W5X.A00(this.A0C, new LinkedHashSet());
        }
    }

    @Override // X.InterfaceC71923XAh
    public final void DYk(MediaMapPin mediaMapPin) {
        this.mMapViewController.A0F(new HashSet(A02(this)));
        this.mMapViewController.A08();
    }

    @Override // X.MQD
    public final boolean DYn(C71196Wpl c71196Wpl, KYY kyy, String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(c71196Wpl.A04());
        W5X w5x = this.A0C;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            linkedHashSet2.add(AbstractC69973Vyo.A01((MediaMapPin) it.next()));
        }
        boolean A00 = W5X.A00(w5x, linkedHashSet2);
        MediaMapPin mediaMapPin = (MediaMapPin) linkedHashSet.iterator().next();
        A09(this, mediaMapPin);
        if (!A00) {
            A05(new RectF(kyy.A0D), this, (MediaMapPin) linkedHashSet.iterator().next(), kyy.A03);
            return true;
        }
        WGA wga = this.A0F;
        Integer num = C05F.A00;
        wga.A06(this.A0E, mediaMapPin, num, "discovery_map", this.A06.A01(r2, mediaMapPin));
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int A02 = C0f9.A02(522188302);
        super.onActivityCreated(bundle);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            ((IgFragmentActivity) requireActivity).registerOnActivityResultListener(new NAp(this, 2));
        }
        C0f9.A09(1817546682, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0150, code lost:
    
        if (r5 == r4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0165, code lost:
    
        if (X.AbstractC31178DnM.A1X(X.C06090Tz.A05, r11.A02, 36313669314808002L) != false) goto L18;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.MediaMapFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-915211685);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_media_map);
        this.mMapContainer = (ViewGroup) viewGroup2.requireViewById(R.id.map_container);
        C69800Vvm c69800Vvm = new C69800Vvm(requireContext(), this.mMapContainer, this.A02, this, this, this, "ig_mediamap", C1H6.A03());
        c69800Vvm.A0D(bundle);
        this.mMapViewController = c69800Vvm;
        this.mMapChromeController = new C70684Wf5(requireActivity(), viewGroup2, this.A02, this.A03, this.A0A, this, this.mMapViewController);
        this.A0A.A05.add(this);
        C0f9.A09(579044248, A02);
        return viewGroup2;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-674227802);
        super.onDestroy();
        WGA wga = this.A0F;
        long currentTimeMillis = System.currentTimeMillis() - this.A0O;
        C25531Mh A01 = WGA.A01(wga, "instagram_map_exit");
        A01.A0Q("session_duration", Long.valueOf(currentTimeMillis));
        A01.Cht();
        Wi2 wi2 = this.A04;
        wi2.A02 = true;
        wi2.A06.A00();
        C0f9.A09(-1954115993, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ULR ulr;
        int A02 = C0f9.A02(1104532377);
        super.onDestroyView();
        C70684Wf5 c70684Wf5 = this.mMapChromeController;
        c70684Wf5.A0J.A05.remove(c70684Wf5);
        if (c70684Wf5.A01 != null) {
            c70684Wf5.A0E.getViewTreeObserver().removeOnPreDrawListener(c70684Wf5.A01);
            c70684Wf5.A01 = null;
        }
        C69800Vvm c69800Vvm = this.mMapViewController;
        c69800Vvm.A04.A00();
        C69717VuC c69717VuC = c69800Vvm.A01;
        if (c69717VuC != null && (ulr = c69717VuC.A04) != null) {
            ulr.A08();
        }
        this.A0A.A05.remove(this.mMapChromeController);
        this.A0A.A05.remove(this);
        this.A0C.A00.remove(this);
        C70846WiC c70846WiC = this.A0G;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = c70846WiC.A07;
        map.clear();
        c70846WiC.A08.clear();
        Set set = c70846WiC.A09;
        set.clear();
        Map map2 = c70846WiC.A06;
        Iterator A15 = AbstractC166997dE.A15(map2);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            Object key = entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            if (!set.contains(key)) {
                map.put(key, Long.valueOf(currentTimeMillis - longValue));
            }
        }
        map2.clear();
        c70846WiC.A02.A0K(map);
        this.A05.A04.remove(this);
        C71158Wot c71158Wot = this.mClipsVideoPlayerManager;
        if (c71158Wot != null) {
            c71158Wot.A06.remove(this.A0e);
        }
        MediaMapFragmentLifecycleUtil.cleanupReferences(this);
        AbstractC25651Mw.A00(this.A02).A02(this.A0h, C70709WfY.class);
        this.A09.A03.remove(this);
        C0f9.A09(-1408054944, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C4QW c4qw;
        int A02 = C0f9.A02(-292363645);
        super.onPause();
        if (this.mMapViewController.A04.A01 != null) {
            MapboxTTRC.cancel(AbstractC43591JPw.A00(409));
        }
        TFA tfa = this.A03;
        if (tfa.A01) {
            tfa.A01 = false;
            tfa.A03.A06();
        }
        C71158Wot c71158Wot = this.mClipsVideoPlayerManager;
        if (c71158Wot != null && (c4qw = c71158Wot.A05) != null && c4qw.isPlaying()) {
            c71158Wot.A02 = true;
            c4qw.Eol("", true);
        }
        C0f9.A09(821873597, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1113225439);
        super.onResume();
        this.mMapViewController.A04.A01();
        this.A03.A01();
        float f = (float) this.A0A.mBottomSheetBehavior.A0F.A01;
        C71158Wot c71158Wot = this.mClipsVideoPlayerManager;
        if (c71158Wot != null && f < 1.0f) {
            c71158Wot.A01();
        }
        C0f9.A09(582761150, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1065954733);
        super.onStart();
        this.mMapViewController.A04.A02();
        C0f9.A09(-156426779, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1949176084);
        super.onStop();
        C0f9.A09(987901369, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0C.A00.add(this);
        this.A09.A03.add(this);
        C71158Wot c71158Wot = new C71158Wot(requireContext(), this, this.A02, AbstractC31177DnL.A0U(view, R.id.stub_map_video_player_container));
        this.mClipsVideoPlayerManager = c71158Wot;
        C68756VbZ c68756VbZ = this.A0e;
        List list = c71158Wot.A06;
        if (!list.contains(c68756VbZ)) {
            list.add(c68756VbZ);
        }
        if (this.A0H == null) {
            this.A0B.A03();
        }
        if (!AbstractC50102Ry.A00(this.A0E, MediaMapQuery.A08) && this.A0H == null) {
            Bundle bundle2 = new Bundle();
            if (this.A0Z) {
                bundle2.putBoolean("arg_disallow_navigation_and_search", true);
            }
            this.A0B.A05(bundle2, this.A0E, false);
        }
        this.A0U.A06(view, C71163Hc.A00(this));
        if (!C48b.A00(this.A02).A00.getBoolean("has_seen_main_nux", false)) {
            view.postDelayed(new RunnableC71354WsP(this), 500L);
        }
        AbstractC25651Mw.A00(this.A02).A01(this.A0h, C70709WfY.class);
    }

    @Override // X.XDN
    public final void DxF(W69 w69, C69591Vru c69591Vru, MediaMapQuery mediaMapQuery) {
        A07(this);
    }
}
