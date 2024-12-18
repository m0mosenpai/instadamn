package X;

import com.google.android.gms.common.Feature;

/* loaded from: classes10.dex */
public final class SOh {
    public final Feature A00;
    public final C61c A01;

    public /* synthetic */ SOh(Feature feature, C61c c61c) {
        this.A01 = c61c;
        this.A00 = feature;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SOh)) {
            return false;
        }
        SOh sOh = (SOh) obj;
        if (SSI.A01(this.A01, sOh.A01)) {
            return SSI.A00(this.A00, sOh.A00);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A01, this.A00);
    }

    public final String toString() {
        C62715SNe c62715SNe = new C62715SNe(this);
        c62715SNe.A00(this.A01, "key");
        c62715SNe.A00(this.A00, AbstractC111324zv.A00(930));
        return c62715SNe.toString();
    }
}
