package X;

import com.instagram.model.venue.Venue;

/* loaded from: classes11.dex */
public final class WlI implements InterfaceC71956XCi {
    public final /* synthetic */ V1B A00;

    public WlI(V1B v1b) {
        this.A00 = v1b;
    }

    @Override // X.InterfaceC71956XCi
    public final void Dyi(Venue venue) {
        V1B v1b = this.A00;
        v1b.A0G = venue;
        v1b.A07.A09(V1B.A00(v1b));
        V1B.A03(v1b);
    }

    @Override // X.InterfaceC71956XCi
    public final void onFinish() {
        C65823Tug c65823Tug = this.A00.A06;
        if (c65823Tug != null) {
            C65823Tug.A00(c65823Tug, false, true);
        }
    }
}
