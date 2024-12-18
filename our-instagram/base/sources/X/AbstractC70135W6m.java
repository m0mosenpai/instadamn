package X;

import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.W6m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70135W6m {
    public static void A01(C70394WTw c70394WTw, Collection collection, int i, int i2) {
        if (!collection.isEmpty()) {
            W52 w52 = new W52();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                MediaMapPin mediaMapPin = (MediaMapPin) it.next();
                w52.A02(new LatLng(mediaMapPin.A0A.doubleValue(), mediaMapPin.A0B.doubleValue()));
            }
            LatLngBounds A01 = w52.A01();
            LatLng latLng = A01.A01;
            double d = latLng.A00;
            LatLng latLng2 = A01.A00;
            double d2 = latLng2.A00;
            double d3 = latLng.A01;
            double d4 = latLng2.A01;
            MediaMapPin mediaMapPin2 = (MediaMapPin) collection.iterator().next();
            KYY kyy = new KYY(null, null, c70394WTw, mediaMapPin2.A00(), null, mediaMapPin2.A0D, AbstractC69973Vyo.A01(mediaMapPin2), null, mediaMapPin2.A0A.doubleValue(), mediaMapPin2.A0B.doubleValue(), Math.round(AbstractC13880nE.A04(c70394WTw.A0G, 64)), AbstractC167007dF.A1W(mediaMapPin2.A08), AbstractC167007dF.A1W(mediaMapPin2.A03), false);
            int intrinsicHeight = kyy.A03.getIntrinsicHeight();
            int intrinsicWidth = kyy.A03.getIntrinsicWidth();
            double d5 = ((intrinsicHeight * (d2 - d)) / i) + d2;
            double d6 = ((intrinsicWidth / 2) * (d4 - d3)) / i2;
            w52.A02(new LatLng(d5, d4 + d6));
            w52.A02(new LatLng(d5, d3 - d6));
            LatLngBounds A012 = w52.A01();
            C70109W4g c70109W4g = new C70109W4g();
            c70109W4g.A09 = A012;
            c70109W4g.A07 = 0;
            c70394WTw.A09(c70109W4g, null, 0);
        }
    }

    public static HashSet A00(C69305VlD c69305VlD, Collection collection) {
        HashSet hashSet = new HashSet();
        LatLngBounds latLngBounds = new LatLngBounds(c69305VlD.A04, c69305VlD.A01);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            MediaMapPin mediaMapPin = (MediaMapPin) it.next();
            if (latLngBounds.A01(mediaMapPin.Bea())) {
                hashSet.add(mediaMapPin);
            }
        }
        return hashSet;
    }

    public static void A02(C25621Ms c25621Ms, C69305VlD c69305VlD) {
        LatLng latLng = c69305VlD.A02;
        c25621Ms.A9s("left_lng", Double.toString(latLng.A01));
        c25621Ms.A9s("top_lat", Double.toString(latLng.A00));
        LatLng latLng2 = c69305VlD.A03;
        c25621Ms.A9s("right_lng", Double.toString(latLng2.A01));
        c25621Ms.A9s("bottom_lat", Double.toString(latLng2.A00));
        LatLng latLng3 = c69305VlD.A00;
        c25621Ms.A9s("center_lng", Double.toString(latLng3.A01));
        c25621Ms.A9s("center_lat", Double.toString(latLng3.A00));
    }
}
