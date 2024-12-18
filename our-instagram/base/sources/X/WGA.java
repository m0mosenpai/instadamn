package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import com.instagram.model.venue.LocationDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WGA {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final MapEntryPoint A04;
    public final String A05;
    public final HashSet A06 = new HashSet();

    public static C25531Mh A01(WGA wga, String str) {
        return A02(wga, str, wga.A01.getModuleName());
    }

    public static C25531Mh A02(WGA wga, String str, String str2) {
        C18920wW c18920wW = wga.A02;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_discovery_map"), 217);
        c25531Mh.A0j(str);
        c25531Mh.A0R("container_module", str2);
        c25531Mh.A0R("map_session_id", wga.A05);
        return c25531Mh;
    }

    public static void A03(C25531Mh c25531Mh, MediaMapPin mediaMapPin) {
        String str;
        if (mediaMapPin != null) {
            AbstractC69973Vyo.A00(mediaMapPin.A09);
            String A01 = AbstractC69973Vyo.A01(mediaMapPin);
            if (A01 != null) {
                c25531Mh.A0R("location_id", A01);
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AbstractC69973Vyo.A01(mediaMapPin));
                c0Zx.A04("lat", mediaMapPin.A0A);
                c0Zx.A04("lng", mediaMapPin.A0B);
                LocationDict locationDict = mediaMapPin.A09;
                C14360o3.A0B(locationDict, 0);
                if (locationDict.getName() != null) {
                    LocationDict locationDict2 = mediaMapPin.A09;
                    C14360o3.A0B(locationDict2, 0);
                    str = locationDict2.getName();
                } else {
                    str = "";
                }
                c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                c25531Mh.A0N(c0Zx, "location_info");
            }
        }
    }

    public static void A04(C25531Mh c25531Mh, MediaMapPin mediaMapPin, boolean z) {
        String str = mediaMapPin.A0D;
        if (str != null) {
            c25531Mh.A0R("media_id", str);
        }
        if (z) {
            ArrayList arrayList = mediaMapPin.A0E;
            if (arrayList == null) {
                arrayList = new ArrayList();
                mediaMapPin.A0E = arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((MediaMapPinPreview) it.next()).A01);
            }
            c25531Mh.A0S("additional_media_ids", arrayList2);
        }
    }

    public static void A05(C25531Mh c25531Mh, Collection collection) {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            MediaMapPin mediaMapPin = (MediaMapPin) it.next();
            if (mediaMapPin != null) {
                AbstractC69973Vyo.A00(mediaMapPin.A09);
                String A01 = AbstractC69973Vyo.A01(mediaMapPin);
                if (A01 != null) {
                    arrayList2.add(A01);
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AbstractC69973Vyo.A01(mediaMapPin));
                    c0Zx.A04("lat", mediaMapPin.A0A);
                    c0Zx.A04("lng", mediaMapPin.A0B);
                    LocationDict locationDict = mediaMapPin.A09;
                    C14360o3.A0B(locationDict, 0);
                    if (locationDict.getName() != null) {
                        LocationDict locationDict2 = mediaMapPin.A09;
                        C14360o3.A0B(locationDict2, 0);
                        str = locationDict2.getName();
                    } else {
                        str = "";
                    }
                    c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                    arrayList.add(c0Zx);
                }
            }
        }
        if (!arrayList2.isEmpty() && !arrayList.isEmpty()) {
            c25531Mh.A0S("location_ids", arrayList2);
            c25531Mh.A0S("location_infos", arrayList);
        }
    }

    public final void A06(MediaMapQuery mediaMapQuery, MediaMapPin mediaMapPin, Integer num, String str, long j) {
        String str2;
        String str3;
        LocationPageInformation locationPageInformation;
        User A00;
        C25531Mh A02 = A02(this, "instagram_map_tap_location_page", str);
        AbstractC65702TsY.A1H(A02, mediaMapQuery);
        if (mediaMapPin != null) {
            AbstractC69973Vyo.A00(mediaMapPin.A09);
            str2 = AbstractC69973Vyo.A01(mediaMapPin);
        } else {
            str2 = null;
        }
        A02.A0R("location_id", str2);
        if (mediaMapPin != null && (locationPageInformation = mediaMapPin.A06) != null && (A00 = locationPageInformation.A00()) != null) {
            str3 = A00.getId();
        } else {
            str3 = null;
        }
        A02.A0R("location_account_owner_id", str3);
        A02.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A04.A00);
        A02.A0Q("result_position", Long.valueOf(j));
        A03(A02, mediaMapPin);
        A04(A02, mediaMapPin, AbstractC167007dF.A1X(num, C05F.A01));
        A02.Cht();
    }

    public final void A07(MediaMapQuery mediaMapQuery, MediaMapPin mediaMapPin, String str, boolean z) {
        C25531Mh A02 = A02(this, "instagram_map_tap_location_story", str);
        AbstractC65702TsY.A1H(A02, mediaMapQuery);
        A02.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A04.A00);
        if (mediaMapPin != null) {
            A04(A02, mediaMapPin, z);
            A02.A0R("location_id", AbstractC69973Vyo.A01(mediaMapPin));
        }
        A02.Cht();
    }

    public final void A08(MediaMapQuery mediaMapQuery, C69305VlD c69305VlD, Collection collection) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            MediaMapPin mediaMapPin = (MediaMapPin) it.next();
            arrayList.add(mediaMapPin);
            if (mediaMapPin.A08 != null) {
                j++;
            }
        }
        if (!this.A00) {
            str = "instagram_map_load_location_pins";
        } else {
            str = "instagram_map_reload_location_pins";
        }
        C25531Mh A01 = A01(this, str);
        if (c69305VlD != null) {
            C0Zx c0Zx = new C0Zx();
            LatLng latLng = c69305VlD.A01;
            c0Zx.A04("left_lng", Double.valueOf(latLng.A01));
            c0Zx.A04("top_lat", Double.valueOf(latLng.A00));
            LatLng latLng2 = c69305VlD.A04;
            c0Zx.A04("right_lng", Double.valueOf(latLng2.A01));
            c0Zx.A04("bot_lat", Double.valueOf(latLng2.A00));
            A01.A0N(c0Zx, "bounding_box_2");
        }
        AbstractC65702TsY.A1H(A01, mediaMapQuery);
        A01.A0Q("num_location_pins_returned", Long.valueOf(arrayList.size()));
        A01.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A04.A00);
        A01.A0Q("num_location_pins_with_stories_loaded", Long.valueOf(j));
        A05(A01, arrayList);
        A01.Cht();
        this.A00 = true;
    }

    public final void A09(MediaMapQuery mediaMapQuery, Collection collection, long j) {
        C25531Mh A01 = A01(this, "instagram_map_expand_bottom_sheet");
        AbstractC65702TsY.A1H(A01, mediaMapQuery);
        A01.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A04.A00);
        if (collection.size() == 1) {
            A03(A01, (MediaMapPin) collection.iterator().next());
        } else if (!collection.isEmpty()) {
            A05(A01, collection);
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                MediaMapPin mediaMapPin = (MediaMapPin) it.next();
                if (mediaMapPin != null) {
                    AbstractC69973Vyo.A00(mediaMapPin.A09);
                    String A012 = AbstractC69973Vyo.A01(mediaMapPin);
                    if (A012 != null) {
                        arrayList.add(A012);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                A01.A0S("location_ids", arrayList);
            }
        }
        if (j >= 0) {
            A01.A0Q("result_position", Long.valueOf(j));
        }
        A01.Cht();
    }

    public WGA(InterfaceC11380iw interfaceC11380iw, UserSession userSession, MapEntryPoint mapEntryPoint, String str) {
        this.A03 = userSession;
        this.A02 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A01 = interfaceC11380iw;
        this.A05 = str;
        this.A04 = mapEntryPoint;
    }

    public static C25531Mh A00(MediaMapQuery mediaMapQuery, WGA wga, MediaMapPin mediaMapPin, String str) {
        C25531Mh A01 = A01(wga, str);
        AbstractC65702TsY.A1H(A01, mediaMapQuery);
        A03(A01, mediaMapPin);
        return A01;
    }
}
