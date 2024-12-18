package X;

import com.instagram.business.promote.model.AudienceInterest;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vqp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69525Vqp {
    public final /* synthetic */ V0P A00;

    public final void A00(AudienceInterest audienceInterest) {
        V0P v0p = this.A00;
        C66424UGt c66424UGt = v0p.A06;
        if (c66424UGt == null) {
            C14360o3.A0F("selectedAndSuggestedInterestsAdapter");
            throw C00O.createAndThrow();
        }
        List list = c66424UGt.A06;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (C14360o3.A0K(((AudienceInterest) it.next()).A00(), audienceInterest.A00())) {
                it.remove();
                c66424UGt.A01();
                c66424UGt.A01.A05((C1P1) c66424UGt.A07.getValue(), c66424UGt.A03.A1S, AbstractC92144Au.A02(new C70557Wcn(5, C71814X5s.A00), list), false);
                break;
            }
        }
        V0P.A01(v0p);
    }

    public C69525Vqp(V0P v0p) {
        this.A00 = v0p;
    }
}
