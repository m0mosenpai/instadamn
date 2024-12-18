package X;

import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;

/* renamed from: X.Vvd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69794Vvd {
    public C67820Uyt A00;
    public LocationDict A01;
    public String A02;
    public String A03;
    public String A04;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public final Venue A00() {
        LocationDict locationDict = this.A01;
        if (locationDict != null) {
            ?? obj = new Object();
            obj.A00 = locationDict;
            return obj;
        }
        throw AbstractC166997dE.A0g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69794Vvd)) {
            return false;
        }
        return C14360o3.A0K(A00(), ((C69794Vvd) obj).A00());
    }

    public final String A01() {
        String name = A00().A00.getName();
        if (name != null) {
            return name;
        }
        throw AbstractC166997dE.A0g();
    }

    public final int hashCode() {
        return A00().hashCode();
    }

    public final String toString() {
        String A04 = A00().A04();
        if (A04 != null) {
            return A04;
        }
        throw AbstractC166997dE.A0g();
    }
}
