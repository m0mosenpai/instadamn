package X;

import android.os.Bundle;

/* renamed from: X.1VP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VP implements C1VQ {
    @Override // X.C1VQ
    public final V1B CsU(String str) {
        C14360o3.A0B(str, 0);
        V1B v1b = new V1B();
        Bundle bundle = new Bundle();
        bundle.putString("LocationFeedFragment.ARGUMENT_LOCATION_VENUE_ID", str);
        v1b.setArguments(bundle);
        return v1b;
    }
}
