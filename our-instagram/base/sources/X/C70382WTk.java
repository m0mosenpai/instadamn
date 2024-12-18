package X;

import com.facebook.android.maps.model.LatLng;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.Venue;

/* renamed from: X.WTk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70382WTk implements InterfaceC71890X8x {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ C67845UzJ A01;
    public final /* synthetic */ C68820Vcb A02;
    public final /* synthetic */ Venue A03;

    public C70382WTk(ImageUrl imageUrl, C67845UzJ c67845UzJ, C68820Vcb c68820Vcb, Venue venue) {
        this.A02 = c68820Vcb;
        this.A03 = venue;
        this.A00 = imageUrl;
        this.A01 = c67845UzJ;
    }

    @Override // X.InterfaceC71890X8x
    public final void DQz(LatLng latLng) {
        C68820Vcb c68820Vcb = this.A02;
        if (c68820Vcb != null) {
            V1B.A01(this.A00, c68820Vcb.A00, this.A03, false);
        }
    }
}
