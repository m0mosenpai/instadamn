package X;

import com.facebook.location.platform.api.Location;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9Jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC208329Jr {
    public static final String A00(C55U c55u) {
        C14360o3.A0B(c55u, 0);
        if (c55u.equals(C81U.A00)) {
            return "reels";
        }
        if (c55u.equals(C208509Kk.A00)) {
            return "stories";
        }
        if (c55u.equals(C128535rM.A00)) {
            return "posts";
        }
        return null;
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, RemoteMedia remoteMedia, UserSession userSession, String str, String str2) {
        String str3;
        String str4 = str2;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        C14360o3.A0B(remoteMedia, 3);
        if (remoteMedia.A09) {
            str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
        } else {
            str3 = "photo";
        }
        C09530e4 A1L = AbstractC166987dD.A1L("uri", remoteMedia.A04.CDP());
        if (str2 == null) {
            str4 = "";
        }
        A08(interfaceC11380iw, userSession, null, null, "error_logging", str, str3, null, null, AbstractC167017dG.A0u("is_network", "non_network", A1L, AbstractC166987dD.A1L("error_message", str4), AbstractC166987dD.A1L("error_type", "medium_creation")));
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, RemoteMedia remoteMedia, UserSession userSession, String str, String str2, List list) {
        String str3 = str2;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        C09530e4 A1L = AbstractC166987dD.A1L("uri", remoteMedia.A04.CDP());
        if (str2 == null) {
            str3 = "";
        }
        LinkedHashMap A0u = AbstractC167017dG.A0u("is_network", "non_network", A1L, AbstractC166987dD.A1L("error_message", str3), AbstractC166987dD.A1L("error_type", "medium_conversion"));
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RemoteMedia remoteMedia2 = ((GalleryItem) it.next()).A04;
            if (remoteMedia2 != null) {
                A1E.add(remoteMedia2);
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Medium medium = ((GalleryItem) it2.next()).A00;
            if (medium != null) {
                A1E2.add(medium);
            }
        }
        ArrayList A1E3 = AbstractC166987dD.A1E();
        Iterator it3 = A1E.iterator();
        while (it3.hasNext()) {
            Long l = ((RemoteMedia) it3.next()).A05;
            if (l != null) {
                A1E3.add(l);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E2);
        Iterator it4 = A1E2.iterator();
        while (it4.hasNext()) {
            AbstractC166997dE.A1X(A0q, AbstractC166987dD.A0l(it4).A0D);
        }
        A08(interfaceC11380iw, userSession, Long.valueOf(A1E.size()), Long.valueOf(A1E2.size()), "error_logging", str, A01(list), A1E3, A0q, A0u);
    }

    public static final void A05(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        A09(interfaceC11380iw, userSession, "horizon_worlds_cross_screen_tap", null, null);
    }

    public static final void A09(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, Map map) {
        A08(interfaceC11380iw, userSession, null, null, str, str2, null, null, null, map);
    }

    public static final void A06(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num) {
        String str;
        switch (num.intValue()) {
            case 0:
                str = "tooltip_shown";
                break;
            case 1:
                str = "tooltip_nav";
                break;
            case 2:
                str = "cta_nav";
                break;
            case 3:
                str = "cloud_album_nav_success";
                break;
            default:
                str = "cloud_album_nav_failed";
                break;
        }
        A09(interfaceC11380iw, userSession, "meta_galley_stories_netego", "stories", AbstractC167007dF.A0n("stories_netego_subevent", str));
    }

    public static final void A07(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, String str) {
        String str2;
        switch (num.intValue()) {
            case 0:
                str2 = "impression";
                break;
            case 1:
                str2 = "dismiss";
                break;
            case 2:
                str2 = "learn_more";
                break;
            default:
                str2 = "accept";
                break;
        }
        A09(interfaceC11380iw, userSession, "recents_nux_interaction", str, AbstractC167007dF.A0n("recents_nux_interaction_type", str2));
    }

    public static final String A01(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            if (((GalleryItem) it.next()).A06()) {
                z2 = true;
            } else {
                z = true;
            }
        }
        if (z) {
            if (z2) {
                return "photo_and_video";
            }
            return "photo";
        }
        if (z2) {
            return MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        return null;
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, RemoteMedia remoteMedia, UserSession userSession, Integer num, String str, List list, boolean z) {
        String str2;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RemoteMedia remoteMedia2 = ((GalleryItem) it.next()).A04;
            if (remoteMedia2 != null) {
                A1E.add(remoteMedia2);
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Medium medium = ((GalleryItem) it2.next()).A00;
            if (medium != null) {
                A1E2.add(medium);
            }
        }
        ArrayList A1E3 = AbstractC166987dD.A1E();
        Iterator it3 = A1E.iterator();
        while (it3.hasNext()) {
            Long l = ((RemoteMedia) it3.next()).A05;
            if (l != null) {
                A1E3.add(l);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E2);
        Iterator it4 = A1E2.iterator();
        while (it4.hasNext()) {
            AbstractC166997dE.A1X(A0q, AbstractC166987dD.A0l(it4).A0D);
        }
        String A01 = A01(list);
        String CDP = remoteMedia.A04.CDP();
        String A012 = A01(AbstractC166987dD.A1J(new GalleryItem(remoteMedia)));
        Long valueOf = Long.valueOf(A1E.size());
        Long valueOf2 = Long.valueOf(A1E2.size());
        C09530e4 A1L = AbstractC166987dD.A1L("uri", CDP);
        String A00 = AbstractC111324zv.A00(3063);
        if (A012 == null) {
            A012 = "";
        }
        C09530e4 A1L2 = AbstractC166987dD.A1L(A00, A012);
        if (num.intValue() != 0) {
            str2 = "long";
        } else {
            str2 = "short";
        }
        A08(interfaceC11380iw, userSession, valueOf, valueOf2, "cloud_media_selected", str, A01, A1E3, A0q, AbstractC167017dG.A0u("multiselect_enabled", String.valueOf(z), A1L, A1L2, AbstractC166987dD.A1L("tap_type", str2)));
    }

    public static final void A08(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, Long l2, String str, String str2, String str3, List list, List list2, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_meta_gallery");
        if (A0f.isSampled()) {
            A0f.AAP("event_name", str);
            A0f.AAP("surface", str2);
            A0f.A7v("in_meta_gallery_experiment", AbstractC166997dE.A0c(C06090Tz.A06, userSession, 36316645727146553L));
            A0f.AAP("media_type", str3);
            A0f.A9M(Location.EXTRAS, map);
            A0f.A9K("num_remote_media_selected", l);
            A0f.AAk("remote_media_created_timestamps", list);
            A0f.A9K("num_system_media_selected", l2);
            A0f.AAk("system_media_created_timestamps", list2);
            A0f.Cht();
        }
    }
}
