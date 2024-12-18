package com.instagram.crossposting.feed.graphql;

import X.AbstractC46542Bs;
import X.C06090Tz;
import X.C130135uJ;
import X.C1338162p;
import X.C18U;
import X.C1Dk;
import X.C2JM;
import X.C2JS;
import X.C4OF;
import X.EnumC130115uH;
import X.EnumC130125uI;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl;

/* loaded from: classes3.dex */
public abstract class FetchFBToIGDefaultAudienceApi {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.common.session.UserSession r5, X.InterfaceC1338062l r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r0 = 5
            boolean r0 = X.MAK.A01(r8, r0)
            if (r0 == 0) goto L83
            r4 = r8
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A04
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L69
            if (r0 != r2) goto L8f
            java.lang.Object r6 = r4.A03
            X.62l r6 = (X.InterfaceC1338062l) r6
            java.lang.Object r7 = r4.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r4.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.AbstractC09560e7.A00(r1)
        L2f:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L5f
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.435 r0 = (X.AnonymousClass435) r0
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L4a
            com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl r0 = (com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl) r0
            X.5uJ r0 = A01(r5, r0, r7)
            r6.Dpt(r0)
        L4a:
            X.0eB r0 = X.C0eB.A00
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
        L51:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L5c
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L89
            r6.DFf()
        L5c:
            X.0eB r0 = X.C0eB.A00
            return r0
        L5f:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L51
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L69:
            X.AbstractC09560e7.A00(r1)
            X.1Dk r1 = A00(r5)
            X.1ud r0 = X.AbstractC40691uc.A01(r5)
            r4.A01 = r5
            r4.A02 = r7
            r4.A03 = r6
            r4.A00 = r2
            java.lang.Object r1 = r0.A04(r1, r4)
            if (r1 != r3) goto L2f
            return r3
        L83:
            X.MAK r4 = new X.MAK
            r4.<init>(r8)
            goto L15
        L89:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L8f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.crossposting.feed.graphql.FetchFBToIGDefaultAudienceApi.A02(com.instagram.common.session.UserSession, X.62l, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final C1Dk A00(UserSession userSession) {
        C1338162p c1338162p;
        if (C18U.A06(C06090Tz.A05, userSession, 36322950739143438L)) {
            c1338162p = new C1338162p();
            C2JM c2jm = c1338162p.A01;
            c2jm.A02("enable_default_audience_migration", false);
            c2jm.A02("is_opt_in_default_audience", false);
            c2jm.A02("is_opt_in_default_audience", Boolean.valueOf(AbstractC46542Bs.A00(userSession).A04.getBoolean("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", false)));
            c2jm.A02("enable_default_audience_migration", true);
        } else {
            c1338162p = new C1338162p();
            C2JM c2jm2 = c1338162p.A01;
            c2jm2.A02("enable_default_audience_migration", false);
            c2jm2.A02("is_opt_in_default_audience", false);
        }
        return c1338162p.A00().setFreshCacheAgeMs(0L).setMaxToleratedCacheAgeMs(0L);
    }

    public static final C130135uJ A01(UserSession userSession, FBToIGDefaultAudienceSettingQueryResponseImpl fBToIGDefaultAudienceSettingQueryResponseImpl, String str) {
        EnumC130115uH enumC130115uH;
        String optionalStringField;
        String optionalStringField2;
        boolean coercedBooleanField;
        boolean coercedBooleanField2;
        EnumC130125uI enumC130125uI;
        if (fBToIGDefaultAudienceSettingQueryResponseImpl != null) {
            C4OF c4of = C2JS.Companion;
            C2JS optionalTreeField = fBToIGDefaultAudienceSettingQueryResponseImpl.getOptionalTreeField(0, "xcxp_get_feed_crossposting_default_audience_status", FBToIGDefaultAudienceSettingQueryResponseImpl.XcxpGetFeedCrosspostingDefaultAudienceStatus.class, -1843243575);
            if (optionalTreeField != null) {
                if (C18U.A06(C06090Tz.A05, userSession, 36322950739143438L)) {
                    InterfaceC19630xq interfaceC19630xq = AbstractC46542Bs.A00(userSession).A04;
                    boolean z = interfaceC19630xq.getBoolean("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", false);
                    if (!z) {
                        boolean coercedBooleanField3 = optionalTreeField.getCoercedBooleanField(4, "is_old_crossposter");
                        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                        ARD.E77("PREFERENCE_IG_TO_FB_FEED_IS_OLD_CROSSPOSTER", coercedBooleanField3);
                        ARD.apply();
                        boolean coercedBooleanField4 = optionalTreeField.getCoercedBooleanField(0, "is_ig_user_opt_in_default_audience");
                        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                        ARD2.E77("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", coercedBooleanField4);
                        ARD2.apply();
                    }
                    coercedBooleanField = interfaceC19630xq.getBoolean("PREFERENCE_IG_TO_FB_FEED_IS_OLD_CROSSPOSTER", false);
                    coercedBooleanField2 = interfaceC19630xq.getBoolean("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", false);
                    if (z) {
                        enumC130125uI = EnumC130125uI.MATCHED;
                    } else {
                        enumC130125uI = (EnumC130125uI) optionalTreeField.getOptionalEnumField(5, "audience_cohort", EnumC130125uI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    }
                    optionalStringField = str;
                    if (str != null && enumC130125uI != null) {
                        enumC130115uH = EnumC130115uH.PHASE_3;
                        optionalStringField2 = "";
                    } else {
                        return null;
                    }
                } else {
                    enumC130115uH = (EnumC130115uH) optionalTreeField.getOptionalEnumField(1, "current_phase", EnumC130115uH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    optionalStringField = optionalTreeField.getOptionalStringField(2, "fb_feed_audience");
                    optionalStringField2 = optionalTreeField.getOptionalStringField(3, "consent_accept_deadline");
                    coercedBooleanField = optionalTreeField.getCoercedBooleanField(4, "is_old_crossposter");
                    coercedBooleanField2 = optionalTreeField.getCoercedBooleanField(0, "is_ig_user_opt_in_default_audience");
                    enumC130125uI = (EnumC130125uI) optionalTreeField.getOptionalEnumField(5, "audience_cohort", EnumC130125uI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (optionalStringField == null || enumC130115uH == null || optionalStringField2 == null || enumC130125uI == null) {
                        return null;
                    }
                }
                return new C130135uJ(enumC130125uI, enumC130115uH, optionalStringField, optionalStringField2, coercedBooleanField2, coercedBooleanField);
            }
            return null;
        }
        return null;
    }
}
