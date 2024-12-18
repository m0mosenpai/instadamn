package X;

import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.venue.LocationDictIntf;
import com.instagram.model.venue.Venue;

/* renamed from: X.Vyo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69973Vyo {
    /* JADX WARN: Type inference failed for: r0v1, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public static final Venue A00(LocationDictIntf locationDictIntf) {
        C14360o3.A0B(locationDictIntf, 0);
        ?? obj = new Object();
        obj.A00 = locationDictIntf;
        return obj;
    }

    public static String A01(MediaMapPin mediaMapPin) {
        return A00(mediaMapPin.A09).A05();
    }
}
