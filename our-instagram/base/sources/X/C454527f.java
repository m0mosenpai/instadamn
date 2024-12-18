package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.monetization.repository.MonetizationRepository;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.27f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C454527f {
    public final UserSession A00;

    public static final C1ON A00(final C454527f c454527f, List list, final InterfaceC16660sJ interfaceC16660sJ) {
        C25621Ms c25621Ms = new C25621Ms(c454527f.A00, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("business/eligibility/get_monetization_products_eligibility_data/");
        c25621Ms.A0P(null, C104204mi.class, C104214mj.class, false);
        c25621Ms.A9s("product_types", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list));
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C1P1() { // from class: X.4mk
            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(-419180308);
                C104204mi c104204mi = (C104204mi) obj;
                int A032 = C0f9.A03(1579222484);
                C14360o3.A0B(c104204mi, 0);
                C104424n8 c104424n8 = c104204mi.A00;
                if (c104424n8 == null) {
                    C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                    throw C00O.createAndThrow();
                }
                List list2 = c104424n8.A00;
                UserSession userSession = C454527f.this.A00;
                MonetizationRepository A00 = AbstractC63302u8.A00(userSession);
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C104404n6 c104404n6 = (C104404n6) ((InterfaceC104414n7) it.next());
                    UserMonetizationProductType userMonetizationProductType = c104404n6.A01;
                    boolean z = c104404n6.A04;
                    C14360o3.A0B(userMonetizationProductType, 0);
                    A00.A0D.put(userMonetizationProductType, Boolean.valueOf(z));
                    A00.A0B.put(userMonetizationProductType, Boolean.valueOf(c104404n6.A03));
                    boolean z2 = c104404n6.A02;
                    A00.A02(userMonetizationProductType, z2);
                    if (userMonetizationProductType == UserMonetizationProductType.A06) {
                        MonetizationEligibilityDecision monetizationEligibilityDecision = c104404n6.A00;
                        C14360o3.A0B(monetizationEligibilityDecision, 0);
                        A00.A09.A0s(monetizationEligibilityDecision.A00);
                        A002.A0U.Egi(A002, Boolean.valueOf(z2), C23031Ai.A8c[135]);
                    }
                    interfaceC16660sJ.invoke(c104404n6.A00);
                }
                C0f9.A0A(-1299240707, A032);
                C0f9.A0A(335568, A03);
            }
        };
        return A0N;
    }

    public final void A01(UserMonetizationProductType userMonetizationProductType, InterfaceC16660sJ interfaceC16660sJ) {
        C1ON A00;
        int ordinal = userMonetizationProductType.ordinal();
        if (ordinal != 11 && ordinal != 10 && ordinal != 13) {
            List singletonList = Collections.singletonList(userMonetizationProductType.A00);
            C14360o3.A07(singletonList);
            A00 = A00(this, singletonList, interfaceC16660sJ);
        } else {
            List singletonList2 = Collections.singletonList(userMonetizationProductType.A00);
            C14360o3.A07(singletonList2);
            UserSession userSession = this.A00;
            new MonetizationApi(userSession);
            A00 = MonetizationApi.A00(userSession, singletonList2);
            A00.A00 = new C104274mp(this, interfaceC16660sJ);
        }
        C1GJ.A03(A00);
    }

    public C454527f(UserSession userSession) {
        this.A00 = userSession;
    }
}
