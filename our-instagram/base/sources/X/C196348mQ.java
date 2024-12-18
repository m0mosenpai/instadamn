package X;

import com.facebook.common.callercontext.CallerContextable;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.8mQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196348mQ implements CallerContextable {
    public static final String __redex_internal_original_name = "XpostLinkageTypeFetcher";
    public final UserSession A00;

    public C196348mQ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(String str) {
        UserSession userSession = this.A00;
        EnumC222416a A01 = AbstractC08690cX.A01(userSession);
        if (A01 == EnumC222416a.A06 || (A01 == EnumC222416a.A05 && C18U.A06(C06090Tz.A05, userSession, 36326721720432689L))) {
            C9J8.A00(userSession, false, C05F.A0J, str, null, null);
            final C9K2 c9k2 = new C9K2(this, str);
            C40701ud A012 = AbstractC40691uc.A01(userSession);
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            C1Dk maxToleratedCacheAgeMs = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IgCreatorDestinationTypeQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C9JB.class, false, null, 0, null, "xcxp_ig_crossposting_linkage", new ArrayList()).setFreshCacheAgeMs(0L).setMaxToleratedCacheAgeMs(0L);
            A012.ATV(new InterfaceC48212Jk() { // from class: X.9K3
                @Override // X.InterfaceC48212Jk
                public final void invoke(Throwable th) {
                    C9K2 c9k22 = C9K2.this;
                    C9J8.A00(c9k22.A00.A00, AbstractC166997dE.A0a(), C05F.A0L, c9k22.A01, null, null);
                }
            }, new InterfaceC48192Ji() { // from class: X.9J9
                @Override // X.InterfaceC48192Ji
                public final void invoke(AnonymousClass436 anonymousClass436) {
                    Object Bos;
                    Enum r0;
                    EnumC223129sr enumC223129sr;
                    Integer num;
                    C2JS optionalTreeField;
                    if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                        C9K2 c9k22 = C9K2.this;
                        C2JS c2js = (C2JS) Bos;
                        String str2 = null;
                        if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, "xcxp_ig_crossposting_linkage", C9JA.class, -610967666)) != null) {
                            r0 = optionalTreeField.getOptionalEnumField(0, "linkage_type", EnumC223129sr.A02);
                        } else {
                            r0 = null;
                        }
                        if (r0 == null) {
                            C9J8.A00(c9k22.A00.A00, false, C05F.A0I, c9k22.A01, null, null);
                            return;
                        }
                        C2JS optionalTreeField2 = c2js.getOptionalTreeField(0, "xcxp_ig_crossposting_linkage", C9JA.class, -610967666);
                        if (optionalTreeField2 != null) {
                            enumC223129sr = (EnumC223129sr) optionalTreeField2.getOptionalEnumField(0, "linkage_type", EnumC223129sr.A02);
                        } else {
                            enumC223129sr = null;
                        }
                        UserSession userSession2 = c9k22.A00.A00;
                        Integer num2 = C05F.A0K;
                        String str3 = c9k22.A01;
                        if (enumC223129sr != null) {
                            str2 = enumC223129sr.name();
                        }
                        C9J8.A00(userSession2, false, num2, str3, str2, null);
                        C46552Bt A00 = AbstractC46542Bs.A00(userSession2);
                        if (enumC223129sr != null) {
                            int ordinal = enumC223129sr.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        num = C05F.A0C;
                                    }
                                } else {
                                    num = C05F.A01;
                                }
                            } else {
                                num = C05F.A00;
                            }
                            InterfaceC19610xo ARD = A00.A04.ARD();
                            ARD.E7K("PREFERENCE_CREATOR_DESTINATION_TYPE_STRING", C9H5.A00(num));
                            ARD.apply();
                        }
                        num = C05F.A0N;
                        InterfaceC19610xo ARD2 = A00.A04.ARD();
                        ARD2.E7K("PREFERENCE_CREATOR_DESTINATION_TYPE_STRING", C9H5.A00(num));
                        ARD2.apply();
                    }
                }
            }, maxToleratedCacheAgeMs);
        }
    }
}
