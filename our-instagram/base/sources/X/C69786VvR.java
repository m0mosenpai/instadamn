package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.VvR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69786VvR {
    public final UserSession A05;
    public final java.util.Set A04 = new HashSet();
    public final HashMap A00 = new HashMap();
    public final Map A01 = new HashMap();
    public final java.util.Set A03 = new HashSet();
    public final Map A02 = new HashMap();

    public final MediaMapPin A00(String str) {
        Map map = this.A02;
        MediaMapPin mediaMapPin = (MediaMapPin) map.get(str);
        if (mediaMapPin == null) {
            Venue venue = new Venue();
            venue.A06(str);
            MediaMapPin mediaMapPin2 = new MediaMapPin(null, null, EnumC68146VDo.A07, venue, null, null, null, 0L);
            map.put(str, mediaMapPin2);
            return mediaMapPin2;
        }
        return mediaMapPin;
    }

    public final void A01(UserSession userSession, C1GL c1gl, C69619VsM c69619VsM, C68754VbX c68754VbX, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            MediaMapPin mediaMapPin = (MediaMapPin) this.A02.get(obj);
            if (mediaMapPin == null || mediaMapPin.A06 == null) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            C32541EUr c32541EUr = new C32541EUr(4, c68754VbX, this, userSession, c69619VsM);
            String A00 = AbstractC68490VSv.A00(arrayList);
            if (A00 != null) {
                C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
                A0M.A0B("map/hydrate_locations/");
                A0M.A9s("location_ids", A00);
                C1ON A0I = AbstractC31178DnM.A0I(A0M, C67816Uyp.class, C69943VyJ.class);
                A0I.A00 = c32541EUr;
                c1gl.schedule(A0I);
            }
        }
    }

    public final void A02(C69619VsM c69619VsM, MediaMapPin mediaMapPin) {
        C120985dq c120985dq;
        LocationPageInformation locationPageInformation;
        Map map = this.A02;
        MediaMapPin mediaMapPin2 = (MediaMapPin) map.get(AbstractC69973Vyo.A01(mediaMapPin));
        if (mediaMapPin2 != null) {
            LocationPageInformation locationPageInformation2 = mediaMapPin2.A06;
            if (locationPageInformation2 != null && ((locationPageInformation = mediaMapPin.A06) == null || locationPageInformation.A00() == null)) {
                mediaMapPin.A06 = locationPageInformation2;
            }
            C37771pE c37771pE = mediaMapPin2.A08;
            if (c37771pE != null && mediaMapPin.A08 == null) {
                mediaMapPin.A08 = c37771pE;
            }
            if (mediaMapPin2.A00() != null && mediaMapPin.A00() == null) {
                mediaMapPin.A04 = mediaMapPin2.A00();
            }
            C111034zF c111034zF = mediaMapPin2.A03;
            if (c111034zF != null) {
                AbstractC128065qa.A02(c111034zF);
                C111034zF c111034zF2 = mediaMapPin.A03;
                if (c111034zF2 != null) {
                    AbstractC128065qa.A02(c111034zF2);
                } else {
                    C111034zF c111034zF3 = mediaMapPin2.A03;
                    if (c111034zF3 != null) {
                        c120985dq = AbstractC128065qa.A02(c111034zF3);
                    } else {
                        c120985dq = null;
                    }
                    mediaMapPin.A03 = AbstractC128065qa.A00(c120985dq);
                }
            }
            String str = mediaMapPin2.A0D;
            if (str != null && mediaMapPin.A0D == null) {
                mediaMapPin.A0D = str;
            }
        }
        map.put(AbstractC69973Vyo.A01(mediaMapPin), mediaMapPin);
        mediaMapPin.A04 = (ImageUrl) this.A00.get(AbstractC69973Vyo.A01(mediaMapPin));
        C37771pE c37771pE2 = mediaMapPin.A08;
        if (c37771pE2 != null) {
            c69619VsM.A00(c37771pE2, AbstractC69973Vyo.A01(mediaMapPin));
        }
        if (mediaMapPin2 != null) {
            Collection collection = (Collection) this.A01.get(AbstractC69973Vyo.A01(mediaMapPin));
            if (collection != null) {
                Iterator A0n = AbstractC65702TsY.A0n(collection);
                while (A0n.hasNext()) {
                    ((InterfaceC71923XAh) A0n.next()).DYk(mediaMapPin);
                }
            }
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((InterfaceC71923XAh) it.next()).DYk(mediaMapPin);
            }
        }
    }

    public final void A03(InterfaceC71923XAh interfaceC71923XAh, String str) {
        Map map = this.A01;
        java.util.Set set = (java.util.Set) map.get(str);
        if (set == null) {
            set = Collections.newSetFromMap(new WeakHashMap());
            map.put(str, set);
        }
        set.add(interfaceC71923XAh);
    }

    public C69786VvR(UserSession userSession) {
        this.A05 = userSession;
    }
}
