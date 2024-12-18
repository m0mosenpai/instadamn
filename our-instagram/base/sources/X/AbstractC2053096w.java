package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.96w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2053096w {
    public static final void A00(UserSession userSession, final C2052996v c2052996v, String str, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A04("caller_name", "fx_company_identity_switcher");
        c2jm.A04("family_device_id", str);
        c2jm.A02("should_force_badge_refresh", Boolean.valueOf(z));
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "FxIgXavSwitcherBadgingDataQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C2053196x.class, false, null, 0, null, "switcher_accounts_data", new ArrayList());
        pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0L);
        AbstractC40691uc.A01(userSession).ATW(new InterfaceC48212Jk() { // from class: X.96z
            @Override // X.InterfaceC48212Jk
            public final void invoke(Throwable th) {
                C2052996v c2052996v2 = C2052996v.this;
                C14360o3.A0A(th);
                C14360o3.A0B(th, 0);
                C41061vE c41061vE = c2052996v2.A01.A07;
                String str2 = c2052996v2.A03;
                String str3 = c2052996v2.A00.A02;
                C14360o3.A07(str3);
                c41061vE.A03(str2, str3, th.getMessage());
                InterfaceC196048lu interfaceC196048lu = c2052996v2.A02;
                if (interfaceC196048lu != null) {
                    interfaceC196048lu.onFailure();
                }
            }
        }, new InterfaceC48192Ji() { // from class: X.96y
            @Override // X.InterfaceC48192Ji
            public final void invoke(AnonymousClass436 anonymousClass436) {
                long currentTimeMillis;
                String str2;
                List list;
                if (anonymousClass436 != null) {
                    C2JS c2js = (C2JS) anonymousClass436.Bos();
                    C2052996v c2052996v2 = C2052996v.this;
                    if (c2js == null) {
                        currentTimeMillis = 0;
                        list = C16930sl.A00;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        C1LC it = c2js.getRequiredCompactedTreeListField(0, "switcher_accounts_data(account_types:[\"FACEBOOK\",\"INSTAGRAM\"],caller_name:$caller_name,family_device_id:$family_device_id,should_force_badge_refresh:$should_force_badge_refresh)", C130885vb.class, -735616906).iterator();
                        C14360o3.A07(it);
                        while (it.hasNext()) {
                            C2JS c2js2 = (C2JS) it.next();
                            C14360o3.A0A(c2js2);
                            C14360o3.A0B(c2js2, 0);
                            int coercedIntField = c2js2.getCoercedIntField(0, "badge_count");
                            int coercedIntField2 = c2js2.getCoercedIntField(1, "unfiltered_badge_count");
                            String optionalStringField = c2js2.getOptionalStringField(2, "unpacked_notifications");
                            boolean coercedBooleanField = c2js2.getCoercedBooleanField(3, "has_threads_account");
                            C2JS optionalTreeField = c2js2.getOptionalTreeField(4, "threads_profile_picture_info", C130895vc.class, -900062966);
                            if (optionalTreeField != null) {
                                str2 = optionalTreeField.getOptionalStringField(0, "url");
                            } else {
                                str2 = null;
                            }
                            arrayList.add(new FxCalAccountWithSwitcherInfo("", "", "", "", "", "", c2js2.getOptionalStringField(5, "obfuscated_id"), optionalStringField, str2, coercedIntField, coercedIntField2, 0, coercedBooleanField));
                        }
                        currentTimeMillis = System.currentTimeMillis();
                        list = arrayList;
                    }
                    FxCalAccountLinkageInfoForSwitcher fxCalAccountLinkageInfoForSwitcher = new FxCalAccountLinkageInfoForSwitcher(C05F.A00, list, currentTimeMillis);
                    C40921uz c40921uz = c2052996v2.A01;
                    C41061vE c41061vE = c40921uz.A07;
                    String str3 = c2052996v2.A03;
                    CallerContext callerContext = c2052996v2.A00;
                    String str4 = callerContext.A02;
                    C14360o3.A07(str4);
                    c41061vE.A02(str3, str4);
                    c40921uz.A0B(callerContext, fxCalAccountLinkageInfoForSwitcher);
                    InterfaceC196048lu interfaceC196048lu = c2052996v2.A02;
                    if (interfaceC196048lu != null) {
                        interfaceC196048lu.onSuccess();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }, pandoGraphQLRequest, new ExecutorC14110nb(1793449280));
    }
}
