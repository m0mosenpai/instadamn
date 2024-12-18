package X;

import android.location.Location;

/* loaded from: classes11.dex */
public final class WlJ implements XAv {
    public final /* synthetic */ V07 A00;

    public WlJ(V07 v07) {
        this.A00 = v07;
    }

    @Override // X.XAv
    public final Location AuZ(String str) {
        TFA tfa = this.A00.A01;
        if (tfa != null) {
            return tfa.A00(V07.__redex_internal_original_name);
        }
        C14360o3.A0F("locationManager");
        throw C00O.createAndThrow();
    }
}
