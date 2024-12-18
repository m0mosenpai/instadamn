package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.Venue;

/* loaded from: classes11.dex */
public final class WlO implements MQD {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ C67845UzJ A01;
    public final /* synthetic */ C68820Vcb A02;
    public final /* synthetic */ Venue A03;

    @Override // X.MQD
    public final boolean DYn(C71196Wpl c71196Wpl, KYY kyy, String str) {
        return false;
    }

    public WlO(ImageUrl imageUrl, C67845UzJ c67845UzJ, C68820Vcb c68820Vcb, Venue venue) {
        this.A02 = c68820Vcb;
        this.A03 = venue;
        this.A00 = imageUrl;
        this.A01 = c67845UzJ;
    }

    @Override // X.MQD
    public final boolean DYo(KYY kyy, String str, String str2) {
        C68820Vcb c68820Vcb = this.A02;
        if (c68820Vcb != null) {
            V1B.A01(this.A00, c68820Vcb.A00, this.A03, false);
        }
        return true;
    }
}
