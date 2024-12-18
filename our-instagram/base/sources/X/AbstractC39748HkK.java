package X;

import java.io.IOException;

/* renamed from: X.HkK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39748HkK {
    public static C26121Bh6 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Integer num2 = null;
            Integer num3 = null;
            String str7 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str8 = null;
            Integer num4 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            C26122Bh7 c26122Bh7 = null;
            String str15 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("appId".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("appInstallObjectiveInvalidationBehavior".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("appName".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("callToActionTitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("canvasDocId".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("contentId".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("deeplinkUri".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("funnelId".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("funnelPurpose".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("igUserId".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("isAndroidAppLink".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("isSKOverlayEnabled".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("isUniversalLink".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("isVtOdirEligible".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("leadGenFormId".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("linkType".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("package".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("playableUri".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("productPageId".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("rawWebUri".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("redirectUri".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("referrerData".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("skAdNetworkMetadata".equals(A0s)) {
                    c26122Bh7 = AbstractC39749HkL.parseFromJson(c16l);
                } else if ("webUri".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str3 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("callToActionTitle", c16l, "AsyncAdLinkImpl");
                throw C00O.createAndThrow();
            }
            return new C26121Bh6(c26122Bh7, bool, bool2, bool3, bool4, num, num2, num3, num4, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
