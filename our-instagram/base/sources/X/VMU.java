package X;

import com.facebook.locationsharing.core.models.Location;

/* loaded from: classes11.dex */
public abstract class VMU {
    public static double A00(Location location, Location location2) {
        double d = location.A00;
        double d2 = location.A01;
        double d3 = location2.A00;
        double d4 = location2.A01;
        return Math.sqrt(Math.pow(d - d3, 2.0d) + Math.pow((d2 - d4) * Math.cos(Math.toRadians(d4)), 2.0d)) * 110250.0d;
    }
}
