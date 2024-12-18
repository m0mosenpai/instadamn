package X;

import com.instagram.common.session.UserSession;
import org.json.JSONObject;

/* renamed from: X.RbE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60899RbE extends C1P1 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C2JJ A01;

    public C60899RbE(UserSession userSession, C2JJ c2jj) {
        this.A01 = c2jj;
        this.A00 = userSession;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1837110651);
        super.onFail(abstractC115105If);
        C0f5 AEp = C18950wb.A01.AEp("IAB maybeSendQueryUserConsentRequest GraphQL result failed.", 817903741);
        AEp.ERI(abstractC115105If.A01());
        AEp.report();
        C0f9.A0A(-480445804, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AbstractC907342m A00;
        int A03 = C0f9.A03(-1428912911);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A0N = AbstractC167017dG.A0N(anonymousClass435, 712209234);
        AbstractC907342m abstractC907342m = (AbstractC907342m) anonymousClass435.A01;
        if (abstractC907342m != null && (A00 = abstractC907342m.A00(C58895QHf.class, "ig_user_consent")) != null) {
            JSONObject jSONObject = A00.A00;
            if ((!jSONObject.isNull("has_consent_choices")) && A00.A06("has_consent_choices")) {
                boolean z = !jSONObject.isNull("third_party_tracking_opt_in");
                boolean z2 = true;
                if (z && A00.A06("third_party_tracking_opt_in")) {
                    z2 = false;
                }
                C2JJ.A00 = z2;
            }
        }
        C0f9.A0A(-1284207060, A0N);
        C0f9.A0A(220304041, A03);
    }
}
