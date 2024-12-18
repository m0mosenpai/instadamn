package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.DayOfTheWeek;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.16q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC223516q {
    public static C223616r parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            E8G e8g = null;
            ArrayList arrayList = null;
            String str2 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("daily_time_limit_without_extensions_seconds".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("fc_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("has_guardian".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("has_stated_age".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_blocked_list_enabled".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_daily_limit_non_blocking".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_eligible_for_supervision".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("is_guardian_of_viewer".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("is_guardian_user".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("is_modify_privacy_settings_enabled".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("is_quiet_time_feature_enabled".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("is_quiet_time_non_blocking".equals(A0q)) {
                    bool10 = Boolean.valueOf(c16l.A0d());
                } else if ("is_supervised_by_viewer".equals(A0q)) {
                    bool11 = Boolean.valueOf(c16l.A0d());
                } else if ("is_supervised_or_in_cooldown".equals(A0q)) {
                    bool12 = Boolean.valueOf(c16l.A0d());
                } else if ("is_supervised_user".equals(A0q)) {
                    bool13 = Boolean.valueOf(c16l.A0d());
                } else if ("latest_valid_time_limit_extension_request".equals(A0q)) {
                    e8g = AbstractC128115qf.parseFromJson(c16l);
                } else if ("quiet_time_intervals".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            URF parseFromJson = HsL.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("screen_time_daily_limit_description".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("screen_time_daily_limit_seconds".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C223616r(e8g, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, num, num2, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C223616r c223616r) {
        anonymousClass182.A0d();
        Integer num = c223616r.A0E;
        if (num != null) {
            anonymousClass182.A0Q("daily_time_limit_without_extensions_seconds", num.intValue());
        }
        String str = c223616r.A0G;
        if (str != null) {
            anonymousClass182.A0S("fc_url", str);
        }
        Boolean bool = c223616r.A01;
        if (bool != null) {
            anonymousClass182.A0T("has_guardian", bool.booleanValue());
        }
        Boolean bool2 = c223616r.A02;
        if (bool2 != null) {
            anonymousClass182.A0T("has_stated_age", bool2.booleanValue());
        }
        Boolean bool3 = c223616r.A03;
        if (bool3 != null) {
            anonymousClass182.A0T("is_blocked_list_enabled", bool3.booleanValue());
        }
        Boolean bool4 = c223616r.A04;
        if (bool4 != null) {
            anonymousClass182.A0T("is_daily_limit_non_blocking", bool4.booleanValue());
        }
        Boolean bool5 = c223616r.A05;
        if (bool5 != null) {
            anonymousClass182.A0T("is_eligible_for_supervision", bool5.booleanValue());
        }
        Boolean bool6 = c223616r.A06;
        if (bool6 != null) {
            anonymousClass182.A0T("is_guardian_of_viewer", bool6.booleanValue());
        }
        Boolean bool7 = c223616r.A07;
        if (bool7 != null) {
            anonymousClass182.A0T("is_guardian_user", bool7.booleanValue());
        }
        Boolean bool8 = c223616r.A08;
        if (bool8 != null) {
            anonymousClass182.A0T("is_modify_privacy_settings_enabled", bool8.booleanValue());
        }
        Boolean bool9 = c223616r.A09;
        if (bool9 != null) {
            anonymousClass182.A0T("is_quiet_time_feature_enabled", bool9.booleanValue());
        }
        Boolean bool10 = c223616r.A0A;
        if (bool10 != null) {
            anonymousClass182.A0T("is_quiet_time_non_blocking", bool10.booleanValue());
        }
        Boolean bool11 = c223616r.A0B;
        if (bool11 != null) {
            anonymousClass182.A0T("is_supervised_by_viewer", bool11.booleanValue());
        }
        Boolean bool12 = c223616r.A0C;
        if (bool12 != null) {
            anonymousClass182.A0T("is_supervised_or_in_cooldown", bool12.booleanValue());
        }
        Boolean bool13 = c223616r.A0D;
        if (bool13 != null) {
            anonymousClass182.A0T("is_supervised_user", bool13.booleanValue());
        }
        C5F2 c5f2 = c223616r.A00;
        if (c5f2 != null) {
            anonymousClass182.A0r("latest_valid_time_limit_extension_request");
            E8G F3N = c5f2.F3N();
            anonymousClass182.A0d();
            String str2 = F3N.A02;
            if (str2 != null) {
                anonymousClass182.A0S("decision_actor_username", str2);
            }
            Integer num2 = F3N.A01;
            if (num2 != null) {
                anonymousClass182.A0Q("granted_extension_time_seconds", num2.intValue());
            }
            String str3 = F3N.A03;
            if (str3 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3);
            }
            XFBYPRequestStatus xFBYPRequestStatus = F3N.A00;
            if (xFBYPRequestStatus != null) {
                anonymousClass182.A0S(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, xFBYPRequestStatus.A00);
            }
            anonymousClass182.A0a();
        }
        List<XG6> list = c223616r.A0I;
        if (list != null) {
            C16V.A03(anonymousClass182, "quiet_time_intervals");
            for (XG6 xg6 : list) {
                if (xg6 != null) {
                    URF Eyv = xg6.Eyv();
                    anonymousClass182.A0d();
                    List<DayOfTheWeek> list2 = Eyv.A03;
                    if (list2 != null) {
                        C16V.A03(anonymousClass182, "days");
                        for (DayOfTheWeek dayOfTheWeek : list2) {
                            if (dayOfTheWeek != null) {
                                anonymousClass182.A0u(dayOfTheWeek.A00);
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    Integer num3 = Eyv.A00;
                    if (num3 != null) {
                        anonymousClass182.A0Q("end_time", num3.intValue());
                    }
                    String str4 = Eyv.A02;
                    if (str4 != null) {
                        anonymousClass182.A0S("label", str4);
                    }
                    Integer num4 = Eyv.A01;
                    if (num4 != null) {
                        anonymousClass182.A0Q(TraceFieldType.StartTime, num4.intValue());
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        String str5 = c223616r.A0H;
        if (str5 != null) {
            anonymousClass182.A0S("screen_time_daily_limit_description", str5);
        }
        Integer num5 = c223616r.A0F;
        if (num5 != null) {
            anonymousClass182.A0Q("screen_time_daily_limit_seconds", num5.intValue());
        }
        anonymousClass182.A0a();
    }
}
