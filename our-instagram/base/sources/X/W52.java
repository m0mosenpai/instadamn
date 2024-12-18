package X;

import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;

/* loaded from: classes11.dex */
public final class W52 {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public boolean A04 = false;

    public static LatLngBounds A00(double d, double d2, double d3, double d4) {
        if (d3 == d2 && d4 == d) {
            double d5 = d + 2.0E-4d;
            if (d5 < 180.0d) {
                d = d5;
            }
            double d6 = d4 - 2.0E-4d;
            if (d6 > -180.0d) {
                d4 = d6;
            }
        }
        return new LatLngBounds(new LatLng(d3, d4), new LatLng(d2, d));
    }

    public final LatLngBounds A01() {
        double d = this.A03;
        double d2 = this.A00;
        double d3 = this.A02;
        double d4 = this.A01;
        if (d3 == d4 && d == d2) {
            double d5 = d2 + 2.0E-4d;
            if (d5 < 180.0d) {
                d2 = d5;
            }
            double d6 = d - 2.0E-4d;
            if (d6 > -180.0d) {
                d = d6;
            }
        }
        return new LatLngBounds(new LatLng(d3, d), new LatLng(d4, d2));
    }

    public final void A02(LatLng latLng) {
        if (!this.A04) {
            double d = latLng.A00;
            this.A02 = d;
            this.A01 = d;
            double d2 = latLng.A01;
            this.A00 = d2;
            this.A03 = d2;
            this.A04 = true;
        }
        double d3 = latLng.A00;
        if (d3 > this.A01) {
            this.A01 = d3;
        } else if (d3 < this.A02) {
            this.A02 = d3;
        }
        double d4 = this.A00;
        double d5 = this.A03;
        double A00 = LatLngBounds.A00(d4, d5);
        double d6 = latLng.A01;
        double A002 = LatLngBounds.A00(d6, d5);
        double A003 = LatLngBounds.A00(d4, d6);
        if (Double.compare(A002, A00) <= 0 && Double.compare(A003, A00) <= 0) {
            return;
        }
        if (A002 <= A003) {
            this.A00 = d6;
        } else {
            this.A03 = d6;
        }
    }
}
