package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.97P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C97P implements C97Q {
    public A9M A00;
    public final C97R A01;
    public final C97O A02;
    public final C25671My A03;
    public final UserSession A04;

    public C97P(C97O c97o, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = c97o;
        this.A01 = new C97R(userSession);
        this.A03 = AbstractC25651Mw.A00(userSession);
    }

    @Override // X.C97Q
    public final void AHf(C9CN c9cn) {
        C14360o3.A0B(c9cn, 0);
        if (C97Y.A00.A00(this.A04, c9cn.A02)) {
            this.A00 = null;
            C97R c97r = this.A01;
            AbstractC19590xm.A09(c97r.A00, new C206999Ee(c97r, 41));
            this.A03.E4s(C23613Ad8.A00);
        }
    }

    @Override // X.C97Q
    public final void AV3(final C9CN c9cn, final C97K c97k, final C97X c97x) {
        C14360o3.A0B(c9cn, 0);
        C14360o3.A0B(c97k, 1);
        C97Y c97y = C97Y.A00;
        UserSession userSession = this.A04;
        if (!c97y.A00(userSession, c9cn.A02)) {
            c97x.onError(X1z.A00);
            return;
        }
        User A01 = C17060sy.A01.A01(userSession);
        if (!A01.A1u() && !A01.A2I() && C18U.A06(C06090Tz.A05, userSession, 36323320106331291L)) {
            return;
        }
        String str = ((CallerContext) c9cn.A01).A02;
        C14360o3.A07(str);
        C2JO c2jo = new C2JO();
        c2jo.A09(str, "caller");
        c2jo.A09("function_credential", "function_credential");
        C0CA A02 = GraphQlCallInput.A02.A02();
        C0CA.A00(A02, "1L1D", "key");
        A02.A0E(c2jo.A02(), "caller_context");
        if (c97k instanceof C211799a6) {
            C2JO c2jo2 = new C2JO();
            C2JO c2jo3 = new C2JO();
            c2jo3.A09(((C211799a6) c97k).A00, AbstractC111324zv.A00(3071));
            c2jo2.A06(c2jo3, "facebook_token_auth_from_cal");
            c2jo2.A08("fallback_to_business_person", false);
            A02.A0E(c2jo2.A02(), "fb_token_auth");
        }
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A00.A02().A0E(A02, "input");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGOneLinkMiddlewareWhatsAppBusinessQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C212909cD.class, false, null, 0, null, "xfb_one_link_monoschema", new ArrayList()), new C1P1() { // from class: X.9gH
            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                C2JS optionalTreeField;
                C2JS optionalTreeField2;
                String str2;
                C208059Im c208059Im;
                int A03 = C0f9.A03(-1416198068);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A032 = C0f9.A03(-477226934);
                C14360o3.A0B(anonymousClass435, 0);
                C97P c97p = this;
                C97K c97k2 = c97k;
                C9CN c9cn2 = c9cn;
                C97X c97x2 = c97x;
                C2JS c2js = (C2JS) anonymousClass435.Bos();
                if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, AbstractC111324zv.A00(3321), C212899cC.class, -1189547960)) != null && (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "whatsapp_info", C212889cB.class, -1198104823)) != null) {
                    String A0A = optionalTreeField2.A0A("linked_whatsapp_phone_number");
                    EnumC223159su enumC223159su = (EnumC223159su) optionalTreeField2.getOptionalEnumField(4, "linked_whatsapp_account_type", EnumC223159su.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (enumC223159su != null) {
                        str2 = enumC223159su.name();
                    } else {
                        str2 = null;
                    }
                    WhatsAppBusinessCacheInfo whatsAppBusinessCacheInfo = new WhatsAppBusinessCacheInfo(A0A, str2, optionalTreeField2.getCoercedBooleanField(1, AbstractC111324zv.A00(1061)), optionalTreeField2.getCoercedBooleanField(0, "is_linked_whatsapp_number_banned"), optionalTreeField2.getCoercedBooleanField(2, AbstractC111324zv.A00(1034)));
                    String str3 = whatsAppBusinessCacheInfo.A01;
                    if (str3 != null) {
                        c208059Im = new C208059Im(str3);
                    } else {
                        c208059Im = null;
                    }
                    A9M a9m = new A9M(c208059Im, whatsAppBusinessCacheInfo.A00, whatsAppBusinessCacheInfo.A03, whatsAppBusinessCacheInfo.A04, whatsAppBusinessCacheInfo.A02);
                    if (c97k2 instanceof C97J) {
                        c97p.A00 = a9m;
                        C97R c97r = c97p.A01;
                        AbstractC19590xm.A09(c97r.A00, new C9F3(32, c97r, whatsAppBusinessCacheInfo));
                        c97p.A03.E4s(C23613Ad8.A00);
                    }
                    c97x2.onSuccess(a9m);
                } else {
                    if (c97k2 instanceof C97J) {
                        c97p.A00 = null;
                        C97R c97r2 = c97p.A01;
                        AbstractC19590xm.A09(c97r2.A00, new C206999Ee(c97r2, 41));
                        c97p.A03.E4s(C23613Ad8.A00);
                    }
                    c97p.A02.A00(c9cn2, c97k2);
                    c97x2.onError(new Throwable(AbstractC111324zv.A00(1864)));
                }
                C0f9.A0A(1691247388, A032);
                C0f9.A0A(-655073108, A03);
            }

            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A0N = AbstractC167017dG.A0N(abstractC115105If, 901623952);
                Throwable A012 = abstractC115105If.A01();
                if (A012 != null) {
                    C97P c97p = this;
                    C97K c97k2 = c97k;
                    C97X c97x2 = c97x;
                    c97p.A02.A01(c97k2, A012.getMessage());
                    c97x2.onError(A012);
                }
                C0f9.A0A(1735424740, A0N);
            }
        });
    }

    @Override // X.C97Q
    public final /* bridge */ /* synthetic */ Object AuS(C9CN c9cn) {
        WhatsAppBusinessCacheInfo whatsAppBusinessCacheInfo;
        C208059Im c208059Im;
        C14360o3.A0B(c9cn, 0);
        if (C97Y.A00.A00(this.A04, c9cn.A02)) {
            C97R c97r = this.A01;
            String string = c97r.A00.getString("whatsapp_business_info", null);
            if (string != null && (whatsAppBusinessCacheInfo = (WhatsAppBusinessCacheInfo) c97r.A01.A00(string, C57115PVe.A00)) != null) {
                String str = whatsAppBusinessCacheInfo.A01;
                if (str != null) {
                    c208059Im = new C208059Im(str);
                } else {
                    c208059Im = null;
                }
                return new A9M(c208059Im, whatsAppBusinessCacheInfo.A00, whatsAppBusinessCacheInfo.A03, whatsAppBusinessCacheInfo.A04, whatsAppBusinessCacheInfo.A02);
            }
            return null;
        }
        return null;
    }
}
