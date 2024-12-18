package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.Feo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35147Feo {
    public long A00;
    public final UserSession A01;

    public static final void A00(C35147Feo c35147Feo, C59383Qdg c59383Qdg, String str) {
        Enum optionalEnumField;
        String obj;
        String A07;
        String obj2;
        C2JS A02 = c59383Qdg.A02(C59382Qdf.class, AbstractC58317Pt9.A00(1068), -788572440);
        if (A02 != null && (optionalEnumField = A02.getOptionalEnumField(1, "notice_type", EnumC33430Eq1.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null && (obj = optionalEnumField.toString()) != null && (A07 = A02.A07(AbstractC58317Pt9.A00(879))) != null) {
            Enum optionalEnumField2 = A02.getOptionalEnumField(2, AbstractC58317Pt9.A00(880), EnumC33431Eq2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            if (optionalEnumField2 != null && (obj2 = optionalEnumField2.toString()) != null) {
                new C31305DpR(c35147Feo.A01).A03(obj, A07, obj2, str);
            }
        }
    }

    public static final void A01(C35147Feo c35147Feo, String str, String str2, InterfaceC16660sJ interfaceC16660sJ) {
        UserSession userSession = c35147Feo.A01;
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("event_type", str);
        String str3 = userSession.userId;
        A0b.A04("business_ig_id", str3);
        boolean A1W = AbstractC167007dF.A1W(str3);
        A0b.A04("consumer_ig_id", str2);
        C1Dk ensureCacheWrite = new PandoGraphQLRequest(AbstractC25227BEk.A0U(A1W), "DetectedOutcomesAdsEventSharingQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59383Qdg.class, false, null, 0, null, "xfb_should_show_biig_ads_event_sharing_consent_at_thread_entry", AbstractC166987dD.A1E()).setMaxToleratedCacheAgeMs(0L).setEnsureCacheWrite(false);
        A01.ATV(C35811Frn.A00, new C31463Ds7(interfaceC16660sJ, 4), ensureCacheWrite);
    }

    public final boolean A02() {
        UserSession userSession = this.A01;
        if (!AbstractC31303DpP.A00(userSession, false)) {
            return false;
        }
        return AbstractC31177DnL.A1U(C06090Tz.A06, userSession, 36325192712270702L);
    }

    public C35147Feo(UserSession userSession, long j) {
        this.A01 = userSession;
        this.A00 = j;
    }
}
