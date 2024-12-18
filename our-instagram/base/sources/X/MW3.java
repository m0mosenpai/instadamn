package X;

import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class MW3 {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public static final Venue A00(String str) {
        if (str != null) {
            try {
                C16L A03 = AbstractC221915u.A00.A03(str);
                A03.A12();
                LocationDict parseFromJson = AbstractC84373pU.parseFromJson(A03);
                C14360o3.A07(parseFromJson);
                ?? obj = new Object();
                obj.A00 = parseFromJson;
                return obj;
            } catch (IOException e) {
                AbstractC12120kG.A06("VenueConverter", "Failed to deserialize Venue from ClipsDraft", e);
            }
        }
        return null;
    }
}
