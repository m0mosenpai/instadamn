package X;

import com.instagram.business.promote.model.AudienceGeoLocation;

/* renamed from: X.WeP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70644WeP implements XAA {
    public final /* synthetic */ V0H A00;

    public C70644WeP(V0H v0h) {
        this.A00 = v0h;
    }

    @Override // X.XAA
    public final void DNL(AudienceGeoLocation audienceGeoLocation) {
        V0H v0h = this.A00;
        XAB xab = v0h.A05;
        if (xab == null) {
            C14360o3.A0F("callback");
            throw C00O.createAndThrow();
        }
        xab.Cvr(audienceGeoLocation);
        AbstractC25226BEj.A1Q(v0h);
    }
}
