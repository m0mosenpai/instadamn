package X;

import com.instagram.api.schemas.MusicProduct;

/* loaded from: classes9.dex */
public final class ODE {
    public final C2GT A00;
    public final C58252li A01;
    public final MusicProduct A02;
    public final OAX A03;
    public final OFB A04;

    public ODE(MusicProduct musicProduct, OAX oax, OFB ofb) {
        C14360o3.A0B(musicProduct, 3);
        this.A04 = ofb;
        this.A03 = oax;
        this.A02 = musicProduct;
        C58252li c58252li = new C58252li();
        this.A01 = c58252li;
        this.A00 = c58252li;
        C55562Olw.A00(this.A03.A00, c58252li, new C57752Pjf(this, 0), 65);
        OFB ofb2 = this.A04;
        C55562Olw.A00(ofb2.A01, c58252li, new C57752Pjf(this, 1), 65);
        C55562Olw.A00(ofb2.A02, c58252li, new C57752Pjf(this, 2), 65);
    }
}
