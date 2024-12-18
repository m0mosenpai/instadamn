package X;

import android.location.Location;

/* renamed from: X.4lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C103804lz {
    public final Location A00;
    public final Boolean A01;

    public final Double A00() {
        Location location = this.A00;
        if (location.hasAltitude()) {
            return Double.valueOf(location.getAltitude());
        }
        return null;
    }

    public final Float A01() {
        Location location = this.A00;
        if (location.hasAccuracy()) {
            return Float.valueOf(location.getAccuracy());
        }
        return null;
    }

    public final Float A02() {
        Location location = this.A00;
        if (location.hasBearing()) {
            return Float.valueOf(location.getBearing());
        }
        return null;
    }

    public final Long A03() {
        long time = this.A00.getTime();
        if (time == 0) {
            return null;
        }
        return Long.valueOf(time);
    }

    public final String toString() {
        return this.A00.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r6.getLongitude() != 0.0d) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C103804lz(android.location.Location r6, java.lang.Boolean r7) {
        /*
            r5 = this;
            r5.<init>()
            double r1 = r6.getLatitude()
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L16
            double r1 = r6.getLongitude()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L17
        L16:
            r1 = 1
        L17:
            java.lang.String r0 = "location must have latitude/longitude"
            X.C18C.A0G(r1, r0)
            r5.A00 = r6
            r5.A01 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103804lz.<init>(android.location.Location, java.lang.Boolean):void");
    }
}
