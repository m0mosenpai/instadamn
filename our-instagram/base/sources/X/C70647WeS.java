package X;

import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.WeS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70647WeS implements XAB {
    public final /* synthetic */ C67876V0h A00;

    public C70647WeS(C67876V0h c67876V0h) {
        this.A00 = c67876V0h;
    }

    @Override // X.XAB
    public final void Cvr(AudienceGeoLocation audienceGeoLocation) {
        C67876V0h c67876V0h = this.A00;
        PromoteData promoteData = c67876V0h.A05;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        promoteData.A0o.A02 = audienceGeoLocation;
        C67876V0h.A03(c67876V0h);
        C67876V0h.A02(c67876V0h);
    }
}
