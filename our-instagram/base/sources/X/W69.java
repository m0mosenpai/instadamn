package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes11.dex */
public final class W69 {
    public boolean A00;
    public boolean A01;
    public final C69619VsM A02;
    public final C69786VvR A03;
    public final WGA A04;
    public final Context A07;
    public final AbstractC018607g A08;
    public final UserSession A09;
    public final java.util.Set A05 = new HashSet();
    public final Map A0A = new HashMap();
    public final java.util.Set A06 = new CopyOnWriteArraySet();

    public static void A00(W69 w69, MediaMapQuery mediaMapQuery) {
        w69.A05.remove(mediaMapQuery);
        Iterator it = w69.A06.iterator();
        while (it.hasNext()) {
            ((XDN) it.next()).DHG(w69, mediaMapQuery);
        }
    }

    public final int A01(MediaMapQuery mediaMapQuery, MediaMapPin mediaMapPin) {
        if (mediaMapPin == null) {
            return -1;
        }
        return new ArrayList(A02(mediaMapQuery).A02).indexOf(AbstractC69973Vyo.A01(mediaMapPin));
    }

    public final C69591Vru A02(MediaMapQuery mediaMapQuery) {
        Map map = this.A0A;
        C69591Vru c69591Vru = (C69591Vru) map.get(mediaMapQuery);
        if (c69591Vru == null) {
            C69591Vru c69591Vru2 = new C69591Vru();
            map.put(mediaMapQuery, c69591Vru2);
            return c69591Vru2;
        }
        return c69591Vru;
    }

    public final void A03(Location location, MediaMapQuery mediaMapQuery, C69305VlD c69305VlD) {
        C1P1 tx4;
        C25621Ms A0M;
        if (!this.A05.contains(mediaMapQuery)) {
            mediaMapQuery.A05 = false;
            mediaMapQuery.A04 = false;
            VEZ vez = mediaMapQuery.A06;
            if (vez == VEZ.A07) {
                UserSession userSession = this.A09;
                tx4 = new C67954V3t(8, this, MediaMapQuery.A09);
                A0M = AbstractC31173DnH.A0N(userSession);
                A0M.A0B("map/all_saved_locations/");
                A0M.A0S(C67840UzD.class, C69941VyC.class);
            } else {
                if (c69305VlD == null) {
                    return;
                }
                UserSession userSession2 = this.A09;
                tx4 = new Tx4(5, c69305VlD, mediaMapQuery, this);
                A0M = AbstractC31173DnH.A0M(userSession2);
                A0M.A0B("map/map_region/");
                A0M.A0S(C67840UzD.class, C69941VyC.class);
                AbstractC70135W6m.A02(A0M, c69305VlD);
                if (vez != VEZ.A06) {
                    A0M.A9s("query_type", vez.toString());
                    A0M.A9s(AbstractC111324zv.A00(1200), mediaMapQuery.A07);
                }
                if (location != null) {
                    A0M.A9s("user_lat", String.valueOf(location.getLatitude()));
                    A0M.A9s("user_lng", String.valueOf(location.getLongitude()));
                }
            }
            A0M.A0R = true;
            C1ON A0N = A0M.A0N();
            A0N.A00 = tx4;
            C1GJ.A00(this.A07, this.A08, A0N);
        }
    }

    public final void A04(MediaMapQuery mediaMapQuery) {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            ((XDN) it.next()).DxF(this, A02(mediaMapQuery), mediaMapQuery);
        }
    }

    public final void A05(MediaMapQuery mediaMapQuery, C69305VlD c69305VlD, Integer num, List list, List list2) {
        int intValue;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaMapPin mediaMapPin = (MediaMapPin) it.next();
                this.A03.A02(this.A02, mediaMapPin);
                arrayList.add(AbstractC69973Vyo.A01(mediaMapPin));
            }
        }
        C69591Vru A02 = A02(mediaMapQuery);
        A02.A00 = c69305VlD;
        List list3 = A02.A02;
        list3.clear();
        list3.addAll(arrayList);
        List list4 = A02.A03;
        list4.clear();
        if (list2 != null) {
            list4.addAll(list2);
        }
        if (num != null && (intValue = num.intValue()) >= 0 && intValue <= arrayList.size() - 1) {
            A02.A01 = (String) arrayList.get(intValue);
        }
    }

    public W69(Context context, AbstractC018607g abstractC018607g, UserSession userSession, C69619VsM c69619VsM, C69786VvR c69786VvR, WGA wga) {
        this.A07 = context;
        this.A09 = userSession;
        this.A08 = abstractC018607g;
        this.A03 = c69786VvR;
        this.A02 = c69619VsM;
        this.A04 = wga;
    }
}
