package X;

import com.facebook.android.maps.model.LatLng;

/* renamed from: X.Wpi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71193Wpi implements Comparable, InterfaceC71891X8y {
    public double A00;
    public double A01;
    public C71196Wpl A02;
    public LatLng A03;
    public final InterfaceC71945XBu A04;

    private void A00() {
        LatLng Bea = this.A04.Bea();
        if (!Bea.equals(this.A03)) {
            this.A03 = Bea;
            this.A00 = C71196Wpl.A00(WFW.A01(Bea.A01));
            this.A01 = WFW.A00(Bea.A00);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C71193Wpi c71193Wpi = (C71193Wpi) obj;
        InterfaceC71945XBu interfaceC71945XBu = this.A04;
        if (interfaceC71945XBu instanceof Comparable) {
            return ((Comparable) interfaceC71945XBu).compareTo(c71193Wpi.A04);
        }
        A00();
        c71193Wpi.A00();
        double d = this.A00;
        double d2 = c71193Wpi.A00;
        if (d == d2) {
            d = this.A01;
            d2 = c71193Wpi.A01;
            if (d == d2) {
                if (hashCode() != c71193Wpi.hashCode()) {
                    if (hashCode() > c71193Wpi.hashCode()) {
                        return 1;
                    }
                    return -1;
                }
                return 0;
            }
        }
        if (d > d2) {
            return 1;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71193Wpi)) {
            return false;
        }
        return this.A04.equals(((C71193Wpi) obj).A04);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public C71193Wpi(InterfaceC71945XBu interfaceC71945XBu) {
        this.A04 = interfaceC71945XBu;
    }

    @Override // X.InterfaceC71891X8y
    public final void Amj(double[] dArr) {
        A00();
        dArr[0] = this.A00;
        dArr[1] = this.A01;
    }
}
