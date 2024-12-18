package X;

import com.facebook.locationsharing.core.models.LocationSharingPresenterState;
import com.google.common.collect.ImmutableList;

/* renamed from: X.VJt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68256VJt {
    public final Object A00(Object obj) {
        Object locationSharingPresenterState;
        if (this instanceof C66538ULt) {
            C69726VuL c69726VuL = (C69726VuL) obj;
            c69726VuL.getClass();
            double d = c69726VuL.A00;
            double d2 = c69726VuL.A01;
            int i = c69726VuL.A04;
            String str = c69726VuL.A08;
            boolean z = c69726VuL.A0B;
            double d3 = c69726VuL.A02;
            double d4 = c69726VuL.A03;
            ImmutableList immutableList = c69726VuL.A06;
            int i2 = c69726VuL.A05;
            locationSharingPresenterState = new C69726VuL(immutableList, c69726VuL.A07, str, c69726VuL.A09, c69726VuL.A0A, d, d2, d3, d4, i, i2, z);
        } else {
            locationSharingPresenterState = new LocationSharingPresenterState(new W3K((LocationSharingPresenterState) obj));
        }
        if (locationSharingPresenterState != obj && locationSharingPresenterState.equals(obj)) {
            return locationSharingPresenterState;
        }
        return obj;
    }
}
