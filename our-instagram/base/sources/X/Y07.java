package X;

import com.facebook.zero.sdk.staticdeps.json.JsonProvider;

/* loaded from: classes12.dex */
public final class Y07 {
    public final long A00;
    public final C72681Xl8 A01;
    public final boolean A02;
    public final boolean A03;

    public Y07(C72681Xl8 c72681Xl8, long j, boolean z, boolean z2) {
        this.A01 = c72681Xl8;
        this.A00 = j;
        this.A02 = z;
        this.A03 = z2;
    }

    public static final void A00() {
        JsonProvider.get();
        throw AbstractC166987dD.A15("getBuilder");
    }
}
