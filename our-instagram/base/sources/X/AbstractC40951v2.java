package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfo;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1v2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40951v2 {
    public Integer A00 = C05F.A00;

    public final String A01(CallerContext callerContext, String str, String str2) {
        Object obj;
        String str3;
        if (!A0I(callerContext, str)) {
            C41061vE c41061vE = ((C40921uz) this).A07;
            String str4 = callerContext.A02;
            C14360o3.A07(str4);
            c41061vE.A00(str, str4);
        } else {
            C40921uz c40921uz = (C40921uz) this;
            C41061vE c41061vE2 = c40921uz.A07;
            String str5 = callerContext.A02;
            C14360o3.A07(str5);
            c41061vE2.A01(str, str5);
            Iterator it = c40921uz.A01.A02.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((FxCalAccount) obj).A07, str2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            FxCalAccount fxCalAccount = (FxCalAccount) obj;
            if (fxCalAccount != null) {
                str3 = fxCalAccount.A04;
            } else {
                str3 = null;
            }
            if (C14360o3.A0K(str3, "INSTAGRAM")) {
                if (fxCalAccount != null) {
                    return fxCalAccount.A05;
                }
            } else if (fxCalAccount != null) {
                return fxCalAccount.A03;
            }
        }
        return null;
    }

    public final List A04(CallerContext callerContext, String str, java.util.Set set) {
        C40921uz c40921uz = (C40921uz) this;
        C41061vE c41061vE = c40921uz.A07;
        String str2 = callerContext.A02;
        C14360o3.A07(str2);
        c41061vE.A01(str, str2);
        if (!A0I(callerContext, str)) {
            c41061vE.A00(str, str2);
            return C16930sl.A00;
        }
        A07();
        A08();
        A09();
        boolean A0J = A0J(callerContext, str);
        A0H(str, A06());
        Map A06 = A06();
        boolean A02 = AbstractC41611wB.A02(c40921uz.A06);
        boolean A0C = A0C();
        c41061vE.A06(str, A06, A0F(), A0D(), A02, A0C);
        List list = c40921uz.A01.A02;
        ArrayList<FxCalAccount> arrayList = new ArrayList();
        for (Object obj : list) {
            FxCalAccount fxCalAccount = (FxCalAccount) obj;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AbstractC002300n.A0g((String) it.next(), fxCalAccount.A04, true)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        for (FxCalAccount fxCalAccount2 : arrayList) {
            String str3 = fxCalAccount2.A03;
            if (A0J) {
                str3 = "";
            }
            String str4 = fxCalAccount2.A05;
            if (A0J || str4 == null) {
                str4 = "";
            }
            arrayList2.add(new FxCalAccount(str3, str4, fxCalAccount2.A04, fxCalAccount2.A06, fxCalAccount2.A08, fxCalAccount2.A0A, fxCalAccount2.A07, fxCalAccount2.A09, fxCalAccount2.A00, fxCalAccount2.A02, fxCalAccount2.A01));
        }
        return arrayList2;
    }

    public final synchronized void A09() {
        Integer num;
        if (C05F.A00 != this.A00 || ((C40921uz) this).A01.A00 > 0) {
            if (A0C()) {
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
            this.A00 = num;
        }
    }

    public final void A0A(CallerContext callerContext, FxCalAccountLinkageInfo fxCalAccountLinkageInfo) {
        String str;
        long j;
        C40921uz c40921uz = (C40921uz) this;
        FxCalAccountLinkageInfo fxCalAccountLinkageInfo2 = c40921uz.A01;
        C14360o3.A0B(fxCalAccountLinkageInfo2, 0);
        FxCalAccountLinkageInfo fxCalAccountLinkageInfo3 = new FxCalAccountLinkageInfo(fxCalAccountLinkageInfo2.A01, fxCalAccountLinkageInfo2.A02, fxCalAccountLinkageInfo2.A00);
        C14360o3.A0B(fxCalAccountLinkageInfo, 0);
        A0G(fxCalAccountLinkageInfo3, new FxCalAccountLinkageInfo(fxCalAccountLinkageInfo.A01, fxCalAccountLinkageInfo.A02, fxCalAccountLinkageInfo.A00));
        synchronized (c40921uz.A01) {
            c40921uz.A01 = fxCalAccountLinkageInfo;
        }
        Integer num = fxCalAccountLinkageInfo.A01;
        int intValue = num.intValue();
        if (intValue != 3) {
            if (intValue != 1) {
                if (intValue == 9) {
                    num = C05F.A02;
                }
            } else {
                num = C05F.A0C;
            }
        } else {
            num = C05F.A0Y;
        }
        UserSession userSession = c40921uz.A06;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        try {
            List<FxCalAccount> list = fxCalAccountLinkageInfo.A02;
            if (fxCalAccountLinkageInfo.A01 == C05F.A0N) {
                C14360o3.A0B(userSession, 0);
                j = System.currentTimeMillis() - (86400000 - Math.min(((((int) C18U.A01(C06090Tz.A05, userSession, 36601290389721236L)) * ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS) * 1000) - (System.currentTimeMillis() - fxCalAccountLinkageInfo.A00), 86400000L));
            } else {
                j = fxCalAccountLinkageInfo.A00;
            }
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            C16V.A03(A0A, "accounts");
            for (FxCalAccount fxCalAccount : list) {
                if (fxCalAccount != null) {
                    A0A.A0d();
                    A0A.A0S("account_id", fxCalAccount.A03);
                    String str2 = fxCalAccount.A05;
                    if (str2 != null) {
                        A0A.A0S("instagram_id", str2);
                    }
                    A0A.A0S("account_type", fxCalAccount.A04);
                    String str3 = fxCalAccount.A06;
                    if (str3 != null) {
                        A0A.A0S("account_name", str3);
                    }
                    String str4 = fxCalAccount.A08;
                    if (str4 != null) {
                        A0A.A0S("profile_picture_url", str4);
                    }
                    String str5 = fxCalAccount.A0A;
                    if (str5 != null) {
                        A0A.A0S(AbstractC58346Ptm.A01(19, 8, 121), str5);
                    }
                    String str6 = fxCalAccount.A07;
                    if (str6 != null) {
                        A0A.A0S("obfuscated_id", str6);
                    }
                    A0A.A0Q("badge_count", fxCalAccount.A00);
                    A0A.A0Q("unfiltered_badge_count", fxCalAccount.A02);
                    A0A.A0Q("ig_l28", fxCalAccount.A01);
                    String str7 = fxCalAccount.A09;
                    if (str7 != null) {
                        A0A.A0S("unpacked_notifications", str7);
                    }
                    A0A.A0a();
                }
            }
            A0A.A0Z();
            A0A.A0R("last_update_time_ms", j);
            A0A.A0S("data_source", AbstractC41441vt.A01(num));
            A0A.A0a();
            A0A.close();
            str = stringWriter.toString();
        } catch (IOException unused) {
            str = "";
        }
        C14360o3.A0B(str, 0);
        A00.A1U.Egi(A00, str, C23031Ai.A8c[305]);
        A09();
        C41061vE c41061vE = c40921uz.A07;
        String str8 = callerContext.A02;
        C14360o3.A07(str8);
        c41061vE.A05("cache_write", "", null, AbstractC06930Yk.A02(new C09530e4("caller_class", str8)));
    }

    public final void A0B(CallerContext callerContext, FxCalAccountLinkageInfoForSwitcher fxCalAccountLinkageInfoForSwitcher) {
        String str;
        C40921uz c40921uz = (C40921uz) this;
        C23031Ai A00 = AbstractC23021Ah.A00(c40921uz.A06);
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            C16V.A03(A0A, "accounts");
            for (FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo : fxCalAccountLinkageInfoForSwitcher.A02) {
                if (fxCalAccountWithSwitcherInfo != null) {
                    A0A.A0d();
                    A0A.A0S("account_id", fxCalAccountWithSwitcherInfo.A03);
                    String str2 = fxCalAccountWithSwitcherInfo.A05;
                    if (str2 != null) {
                        A0A.A0S("instagram_id", str2);
                    }
                    A0A.A0S("account_type", fxCalAccountWithSwitcherInfo.A04);
                    String str3 = fxCalAccountWithSwitcherInfo.A06;
                    if (str3 != null) {
                        A0A.A0S("account_name", str3);
                    }
                    String str4 = fxCalAccountWithSwitcherInfo.A08;
                    if (str4 != null) {
                        A0A.A0S("profile_picture_url", str4);
                    }
                    String str5 = fxCalAccountWithSwitcherInfo.A0B;
                    if (str5 != null) {
                        A0A.A0S(AbstractC58346Ptm.A01(19, 8, 121), str5);
                    }
                    String str6 = fxCalAccountWithSwitcherInfo.A07;
                    if (str6 != null) {
                        A0A.A0S("obfuscated_id", str6);
                    }
                    A0A.A0Q("badge_count", fxCalAccountWithSwitcherInfo.A00);
                    A0A.A0Q("unfiltered_badge_count", fxCalAccountWithSwitcherInfo.A02);
                    A0A.A0Q("ig_l28", fxCalAccountWithSwitcherInfo.A01);
                    String str7 = fxCalAccountWithSwitcherInfo.A0A;
                    if (str7 != null) {
                        A0A.A0S("unpacked_notifications", str7);
                    }
                    A0A.A0T("has_threads_account", fxCalAccountWithSwitcherInfo.A0C);
                    String str8 = fxCalAccountWithSwitcherInfo.A09;
                    if (str8 != null) {
                        A0A.A0S("threads_profile_picture_url", str8);
                    }
                    A0A.A0a();
                }
            }
            A0A.A0Z();
            A0A.A0R("last_update_time_ms", fxCalAccountLinkageInfoForSwitcher.A00);
            A0A.A0S("data_source", AbstractC41441vt.A01(fxCalAccountLinkageInfoForSwitcher.A01));
            A0A.A0a();
            A0A.close();
            str = stringWriter.toString();
        } catch (IOException unused) {
            str = "";
        }
        C14360o3.A0B(str, 0);
        A00.A1W.Egi(A00, str, C23031Ai.A8c[306]);
        synchronized (c40921uz.A02) {
            c40921uz.A02 = A0E();
        }
        A09();
        C41061vE c41061vE = c40921uz.A07;
        String str9 = callerContext.A02;
        C14360o3.A07(str9);
        c41061vE.A05("cache_write", "", null, AbstractC06930Yk.A02(new C09530e4("caller_class", str9)));
    }

    public final boolean A0C() {
        long j;
        C40921uz c40921uz = (C40921uz) this;
        UserSession userSession = c40921uz.A06;
        if (AbstractC41611wB.A01(userSession)) {
            j = 518400000;
        } else if (AbstractC41611wB.A02(userSession) && c40921uz.A01.A01 == C05F.A0N) {
            C14360o3.A0B(userSession, 0);
            j = ((int) C18U.A01(C06090Tz.A05, userSession, 36601290389721236L)) * 60 * 60 * 1000;
        } else {
            j = 86400000;
        }
        if (System.currentTimeMillis() - c40921uz.A01.A00 <= j) {
            return false;
        }
        return true;
    }

    public abstract double A0D();

    public abstract FxCalAccountLinkageInfoForSwitcher A0E();

    public abstract LinkedHashMap A0F();

    public abstract void A0G(FxCalAccountLinkageInfo fxCalAccountLinkageInfo, FxCalAccountLinkageInfo fxCalAccountLinkageInfo2);

    public abstract void A0H(String str, Map map);

    public abstract boolean A0I(CallerContext callerContext, String str);

    public abstract boolean A0J(CallerContext callerContext, String str);

    public final List A02(CallerContext callerContext, String str) {
        Map map = (Map) AnonymousClass538.A01.getValue();
        String upperCase = str.toUpperCase(Locale.ROOT);
        C14360o3.A07(upperCase);
        Object obj = map.get(upperCase);
        if (obj == null) {
            return C16930sl.A00;
        }
        java.util.Set singleton = Collections.singleton(obj);
        C14360o3.A07(singleton);
        return A05(callerContext, singleton);
    }

    public final Map A06() {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((C40921uz) this).A01.A02.iterator();
        while (it.hasNext()) {
            String str = ((FxCalAccount) it.next()).A04;
            Number number = (Number) linkedHashMap.get(str);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            linkedHashMap.put(str, Integer.valueOf(i + 1));
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }

    public final List A03(CallerContext callerContext, String str, String str2) {
        java.util.Set singleton = Collections.singleton(str2);
        C14360o3.A07(singleton);
        return A04(callerContext, str, singleton);
    }

    public final List A05(CallerContext callerContext, java.util.Set set) {
        Object obj;
        int i;
        int i2;
        int i3;
        Object obj2;
        C40921uz c40921uz = (C40921uz) this;
        C41061vE c41061vE = c40921uz.A07;
        String str = callerContext.A02;
        C14360o3.A07(str);
        c41061vE.A01("fx_company_identity_switcher_linking_cache", str);
        if (!A0I(callerContext, "fx_company_identity_switcher_linking_cache")) {
            c41061vE.A00("fx_company_identity_switcher_linking_cache", str);
            return C16930sl.A00;
        }
        A07();
        A08();
        A09();
        A0H("fx_company_identity_switcher_linking_cache", A06());
        LinkedHashMap A0F = A0F();
        A0F.put("IsSwitcherRequestForBadgingUsecase", String.valueOf(false));
        c41061vE.A06("fx_company_identity_switcher_linking_cache", A06(), A0F, A0D(), AbstractC41611wB.A02(c40921uz.A06), A0C());
        boolean A0J = A0J(callerContext, "fx_company_identity_switcher_linking_cache");
        ArrayList arrayList = new ArrayList();
        for (FxCalAccount fxCalAccount : c40921uz.A01.A02) {
            String str2 = fxCalAccount.A04;
            Map map = (Map) AnonymousClass538.A01.getValue();
            String upperCase = str2.toUpperCase(Locale.ROOT);
            C14360o3.A07(upperCase);
            Object obj3 = map.get(upperCase);
            String str3 = "";
            String str4 = null;
            if (set.contains(AnonymousClass538.A06) && obj3 == AnonymousClass538.A05) {
                Iterator it = c40921uz.A02.A02.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (C14360o3.A0K(((FxCalAccountWithSwitcherInfo) obj2).A07, fxCalAccount.A07)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo = (FxCalAccountWithSwitcherInfo) obj2;
                if (fxCalAccountWithSwitcherInfo != null && fxCalAccountWithSwitcherInfo.A0C) {
                    String str5 = fxCalAccount.A03;
                    if (A0J) {
                        str5 = "";
                    }
                    String str6 = fxCalAccount.A05;
                    if (str6 == null) {
                        str6 = "";
                    }
                    if (A0J) {
                        str6 = "";
                    }
                    arrayList.add(new FxCalAccountWithSwitcherInfo(str5, str6, "THREADS", fxCalAccount.A06, fxCalAccountWithSwitcherInfo.A09, fxCalAccount.A0A, fxCalAccount.A07, "", "", 0, 0, fxCalAccountWithSwitcherInfo.A01, false));
                }
            }
            if (AbstractC001800i.A0u(set, obj3)) {
                Iterator it2 = c40921uz.A02.A02.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (C14360o3.A0K(((FxCalAccountWithSwitcherInfo) obj).A07, fxCalAccount.A07)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo2 = (FxCalAccountWithSwitcherInfo) obj;
                String str7 = fxCalAccount.A03;
                if (A0J) {
                    str7 = "";
                }
                String str8 = fxCalAccount.A05;
                if (str8 != null) {
                    str3 = str8;
                }
                if (A0J) {
                    str3 = "";
                }
                String str9 = fxCalAccount.A04;
                String str10 = fxCalAccount.A06;
                String str11 = fxCalAccount.A08;
                String str12 = fxCalAccount.A0A;
                String str13 = fxCalAccount.A07;
                if (fxCalAccountWithSwitcherInfo2 != null) {
                    i = fxCalAccountWithSwitcherInfo2.A00;
                    i2 = fxCalAccountWithSwitcherInfo2.A02;
                    i3 = fxCalAccountWithSwitcherInfo2.A01;
                    str4 = fxCalAccountWithSwitcherInfo2.A0A;
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                }
                arrayList.add(new FxCalAccountWithSwitcherInfo(str7, str3, str9, str10, str11, str12, str13, str4, "", i, i2, i3, false));
            }
        }
        return arrayList;
    }

    public final void A07() {
        if (A0C()) {
            C40921uz c40921uz = (C40921uz) this;
            c40921uz.A07.A05("cache_eviction", "ig_android_linking_cache_fx_internal", null, null);
            synchronized (c40921uz.A01) {
                c40921uz.A01 = new FxCalAccountLinkageInfo(C05F.A00, C16930sl.A00, 0L);
            }
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(c40921uz.A06).A01.ARD();
            ARD.EEj("fx_account_center_info");
            ARD.apply();
        }
    }

    public final void A08() {
        C40921uz c40921uz = (C40921uz) this;
        if (System.currentTimeMillis() - c40921uz.A02.A00 > 86400000) {
            c40921uz.A07.A05("cache_eviction", "ig_android_linking_cache_fx_internal", null, null);
            synchronized (c40921uz.A02) {
                c40921uz.A02 = new FxCalAccountLinkageInfoForSwitcher(C05F.A00, C16930sl.A00, 0L);
            }
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(c40921uz.A06).A01.ARD();
            ARD.EEj("fx_linkage_cache_switcher");
            ARD.apply();
        }
    }
}
