package X;

import com.instagram.business.promote.model.AudienceGeoLocation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WeV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70649WeV implements XAC {
    public final /* synthetic */ V04 A00;

    public C70649WeV(V04 v04) {
        this.A00 = v04;
    }

    @Override // X.XAC
    public final void DNL(AudienceGeoLocation audienceGeoLocation) {
        UFT uft = (UFT) this.A00.A0B.getValue();
        List list = uft.A06().A05;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AbstractC25228BEl.A1Q(obj, arrayList, C14360o3.A0K(((AudienceGeoLocation) obj).A06, audienceGeoLocation.A06) ? 1 : 0);
        }
        UFT.A02(uft, AbstractC001800i.A0U(arrayList));
    }
}
