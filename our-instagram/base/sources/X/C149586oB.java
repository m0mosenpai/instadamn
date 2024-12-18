package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.endtoend.EndToEnd;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.6oB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149586oB implements InterfaceC13000lm {
    public List A00;
    public boolean A01;
    public final UserSession A02;
    public final Map A03;
    public final Map A04;

    public C149586oB(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = new HashMap();
        this.A04 = new HashMap();
        this.A00 = C16930sl.A00;
    }

    public final void A09(final Context context, UserSession userSession, final InterfaceC58049Poa interfaceC58049Poa, final String str, final String str2, boolean z, final boolean z2) {
        String str3;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        if (AbstractC49092Nc.A00(this.A02).A00(CallerContext.A01("FxMultiNativeAuthTokenVerifier"), "ig_android_linking_cache_fx_ac_eligibility_linkage_check")) {
            if (interfaceC58049Poa != null) {
                interfaceC58049Poa.onFail("Prefetch failed: Already linked account");
                return;
            }
            return;
        }
        if (this.A03.containsKey(str) && !z2) {
            return;
        }
        if (!z) {
            Boolean bool = (Boolean) ((C36265FzI) userSession.A01(C36265FzI.class, new C36986GRd(userSession))).A01.get("FACEBOOK");
            if (bool != null && bool.booleanValue()) {
                return;
            }
            C36265FzI c36265FzI = (C36265FzI) userSession.A01(C36265FzI.class, new C36986GRd(userSession));
            C203158yX c203158yX = C36007Fv5.A00().A01;
            if (c203158yX != null) {
                str3 = c203158yX.A02;
            } else {
                str3 = null;
            }
            C14120nc.A00().ATO(new C32664EZo(context, c36265FzI, str3));
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("FACEBOOK");
        hashSet.add("MESSENGER");
        A05(this, "native auth fetch start");
        AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.6Xl
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("MultiNativeAuthVerification", 1206645857, 3, true, true);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r6.A02, 36319716629421672L) == false) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
            
                if (r2 != false) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
            
                r5.A02("use_fx_upsell_eligibility_checker", true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r6.A02, 36319716629552746L) != false) goto L20;
             */
            @Override // X.AbstractC18280vF
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void loggedRun() {
                /*
                    Method dump skipped, instructions count: 355
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C140576Xl.loggedRun():void");
            }
        });
    }

    public final boolean A0B(UserSession userSession, String str, boolean z) {
        Object obj;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        if (z) {
            obj = this.A03.get(str);
        } else {
            obj = ((C36265FzI) userSession.A01(C36265FzI.class, new C36986GRd(userSession))).A01.get("FACEBOOK");
        }
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public static final ArrayList A01(Context context, UserSession userSession, java.util.Set set) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = AMd.A02(context, userSession, "ig_android_access_library_fx_fetch_active_msgr_token", "FxMultiNativeAuthTokenVerifier", null).iterator();
        while (it.hasNext()) {
            C203128yU c203128yU = ((C203148yW) it.next()).A01;
            String str2 = c203128yU.A00;
            C14360o3.A07(str2);
            if (str2.length() != 0) {
                C2JO c2jo = new C2JO();
                C2JO c2jo2 = new C2JO();
                c2jo2.A09(str2, "sensitive_string_value");
                c2jo.A06(c2jo2, "access_token");
                c2jo.A09("ACTIVE_ACCOUNT", "account_source");
                c2jo.A09("MESSENGER", "app_source");
                c2jo.A09("FACEBOOK", "account_type");
                C203118yT c203118yT = c203128yU.A01;
                if (c203118yT == null || (str = c203118yT.A02) == null) {
                    str = "";
                }
                set.add(str);
                arrayList.add(c2jo);
            }
        }
        return arrayList;
    }

    @Deprecated(message = "This method is using SsoLoginUtil which is a privacy unsafe legacy API")
    public static final ArrayList A02(Context context, UserSession userSession, java.util.Set set) {
        C203168yY c203168yY;
        String str;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        C203158yX A00 = AbstractC200748uH.A00(context, userSession, false, userSession.userId);
        if (A00 != null && (c203168yY = A00.A00) != null && (str = c203168yY.A01) != null && str.length() > 0 && (str2 = A00.A02) != null && str2.length() > 0) {
            C2JO c2jo = new C2JO();
            C2JO c2jo2 = new C2JO();
            c2jo2.A09(str2, "sensitive_string_value");
            c2jo.A06(c2jo2, "access_token");
            c2jo.A09("ACTIVE_ACCOUNT", "account_source");
            c2jo.A09("FACEBOOK", "app_source");
            c2jo.A09("FACEBOOK", "account_type");
            C203168yY c203168yY2 = A00.A00;
            if (c203168yY2 == null || (str3 = c203168yY2.A01) == null) {
                str3 = "";
            }
            set.add(str3);
            arrayList.add(c2jo);
        }
        return arrayList;
    }

    public static final ArrayList A03(Context context, UserSession userSession, java.util.Set set) {
        ArrayList arrayList = new ArrayList();
        C200758uI c200758uI = new C200758uI();
        c200758uI.A03 = new C200898uW(userSession, null);
        C200918uY c200918uY = new C200918uY(c200758uI);
        List singletonList = Collections.singletonList(EnumC200798uM.FACEBOOK);
        C14360o3.A07(singletonList);
        Iterator it = C200918uY.A01(context, null, singletonList, c200918uY).iterator();
        while (it.hasNext()) {
            C203128yU c203128yU = ((C203148yW) it.next()).A01;
            String str = c203128yU.A00;
            C14360o3.A07(str);
            if (str.length() != 0 && !set.contains(c203128yU.A01.A02)) {
                C2JO c2jo = new C2JO();
                C2JO c2jo2 = new C2JO();
                c2jo2.A09(str, "sensitive_string_value");
                c2jo.A06(c2jo2, "access_token");
                c2jo.A09("INACTIVE_LOGGED_IN_ACCOUNTS", "account_source");
                c2jo.A09("FACEBOOK", "app_source");
                c2jo.A09("FACEBOOK", "account_type");
                arrayList.add(c2jo);
            }
        }
        return arrayList;
    }

    public static final void A04(ImmutableList immutableList, ImmutableList immutableList2, C149586oB c149586oB, String str) {
        String str2;
        String str3;
        String str4;
        String A05;
        String str5;
        String str6;
        String str7;
        String str8;
        String A052;
        UserSession userSession = c149586oB.A02;
        if (!C18U.A06(C06090Tz.A06, userSession, 36319716630208114L)) {
            if (C14360o3.A0K(str, "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
                if (immutableList != null && !immutableList.isEmpty()) {
                    PKA pka = (PKA) userSession.A01(PKA.class, new C50152MDf(userSession, 20));
                    C1LC it = immutableList.iterator();
                    C14360o3.A07(it);
                    while (it.hasNext()) {
                        AbstractC907342m abstractC907342m = (AbstractC907342m) it.next();
                        if (abstractC907342m.A00(C211549Yo.class, "prescreen_content") != null) {
                            String str9 = "";
                            AbstractC907342m A00 = abstractC907342m.A00(C211549Yo.class, "prescreen_content");
                            if (A00 == null || (str5 = A00.A05("title_text")) == null) {
                                str5 = "";
                            }
                            pka.A02 = str5;
                            AbstractC907342m A002 = abstractC907342m.A00(C211549Yo.class, "prescreen_content");
                            if (A002 == null || (str6 = A002.A05("body_text")) == null) {
                                str6 = "";
                            }
                            pka.A00 = str6;
                            AbstractC907342m A003 = abstractC907342m.A00(C211549Yo.class, "prescreen_content");
                            if (A003 == null || (str7 = A003.A05("primary_cta_text")) == null) {
                                str7 = "";
                            }
                            pka.A03 = str7;
                            AbstractC907342m A004 = abstractC907342m.A00(C211549Yo.class, "prescreen_content");
                            if (A004 == null || (str8 = A004.A05("secondary_cta_text")) == null) {
                                str8 = "";
                            }
                            pka.A04 = str8;
                            AbstractC907342m A005 = abstractC907342m.A00(C211549Yo.class, "prescreen_content");
                            if (A005 != null && (A052 = A005.A05("footer_text")) != null) {
                                str9 = A052;
                            }
                            pka.A01 = str9;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (!C14360o3.A0K(str, "IG_LOGOUT_UPSELL") || immutableList2 == null || immutableList2.isEmpty()) {
                return;
            }
            PK9 pk9 = (PK9) userSession.A01(PK9.class, new C50152MDf(userSession, 22));
            C1LC it2 = immutableList2.iterator();
            C14360o3.A07(it2);
            while (it2.hasNext()) {
                AbstractC907342m abstractC907342m2 = (AbstractC907342m) it2.next();
                if (abstractC907342m2.A00(C211569Yq.class, "prescreen_content") != null) {
                    String str10 = "";
                    AbstractC907342m A006 = abstractC907342m2.A00(C211569Yq.class, "prescreen_content");
                    if (A006 == null || (str2 = A006.A05("title_text")) == null) {
                        str2 = "";
                    }
                    pk9.A01 = str2;
                    AbstractC907342m A007 = abstractC907342m2.A00(C211569Yq.class, "prescreen_content");
                    if (A007 == null || (str3 = A007.A05("body_text")) == null) {
                        str3 = "";
                    }
                    pk9.A00 = str3;
                    AbstractC907342m A008 = abstractC907342m2.A00(C211569Yq.class, "prescreen_content");
                    if (A008 == null || (str4 = A008.A05("primary_cta_text")) == null) {
                        str4 = "";
                    }
                    pk9.A02 = str4;
                    AbstractC907342m A009 = abstractC907342m2.A00(C211569Yq.class, "prescreen_content");
                    if (A009 != null && (A05 = A009.A05("secondary_cta_text")) != null) {
                        str10 = A05;
                    }
                    pk9.A03 = str10;
                    return;
                }
            }
        }
    }

    public static final void A05(C149586oB c149586oB, String str) {
        UserSession userSession = c149586oB.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36319716630273651L)) {
            if (EndToEnd.isRunningEndToEndTest() || EndToEnd.A03()) {
                C9GR.A09(userSession.deviceSession.A06(), str);
            }
        }
    }

    @Deprecated(message = "This is using a legacy API without proper callername input")
    public final ImmutableList A06(Context context) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A06, userSession, 36316546945061380L)) {
            try {
                arrayList.addAll(A02(context, userSession, hashSet));
                arrayList.addAll(A03(context, userSession, hashSet));
            } catch (Exception e) {
                AbstractC35174FfR.A01(EnumC72435Xdf.A0O, userSession, "upsell_multi_native_auth_prefetch_exception", AbstractC06930Yk.A06(new C09530e4("getAllFacebookAccessTokens exception:", e.toString()), new C09530e4("getAllFacebookAccessTokens trace:", C2Ql.A00(e))));
            }
        } else {
            arrayList.addAll(A02(context, userSession, hashSet));
            arrayList.addAll(A03(context, userSession, hashSet));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
        C14360o3.A07(copyOf);
        return copyOf;
    }

    public final ImmutableList A07(Context context) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A06, userSession, 36316546945061380L)) {
            try {
                arrayList.addAll(A01(context, userSession, hashSet));
            } catch (Exception e) {
                AbstractC35174FfR.A01(EnumC72435Xdf.A0O, userSession, "upsell_multi_native_auth_prefetch_exception", AbstractC06930Yk.A06(new C09530e4("getAllMsgrAccessTokens exception:", e.toString()), new C09530e4("getAllMsgrTokens trace:", C2Ql.A00(e))));
            }
        } else {
            arrayList.addAll(A01(context, userSession, hashSet));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
        C14360o3.A07(copyOf);
        return copyOf;
    }

    public final List A08(String str) {
        if (C18U.A06(C06090Tz.A05, this.A02, 36322078860912628L)) {
            return (List) this.A04.get(str);
        }
        return null;
    }

    public final void A0A(boolean z) {
        final Context A06 = this.A02.deviceSession.A06();
        InterfaceC24811Iz interfaceC24811Iz = AbstractC24641Ih.A02;
        final int i = 3;
        if (z) {
            i = 2;
        }
        interfaceC24811Iz.Ep8(new AbstractC18280vF(i) { // from class: X.9jl
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
            
                if (r2.A07(r1).size() > 0) goto L6;
             */
            @Override // X.AbstractC18280vF
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void loggedRun() {
                /*
                    r3 = this;
                    X.6oB r2 = r8
                    android.content.Context r1 = r7
                    com.google.common.collect.ImmutableList r0 = r2.A06(r1)
                    int r0 = r0.size()
                    if (r0 > 0) goto L19
                    com.google.common.collect.ImmutableList r0 = r2.A07(r1)
                    int r1 = r0.size()
                    r0 = 0
                    if (r1 <= 0) goto L1a
                L19:
                    r0 = 1
                L1a:
                    r2.A01 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C217529jl.loggedRun():void");
            }
        });
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A03(C149586oB.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static final EnumC72435Xdf A00(String str) {
        switch (str.hashCode()) {
            case -1599767705:
                if (str.equals("IG_FB_PROFILE_LINK_INTEGRATION")) {
                    return EnumC72435Xdf.A07;
                }
                return EnumC72435Xdf.A0O;
            case -1574224499:
                if (str.equals("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
                    return EnumC72435Xdf.A06;
                }
                return EnumC72435Xdf.A0O;
            case -773734548:
                if (str.equals("IG_PROFILE_PHOTO_CHANGE_CHAINING")) {
                    return EnumC72435Xdf.A0K;
                }
                return EnumC72435Xdf.A0O;
            case -664343167:
                if (str.equals("IG_FB_REEL_STORY_VIEWERS_DASHBOARD_BOTTOM")) {
                    return EnumC72435Xdf.A09;
                }
                return EnumC72435Xdf.A0O;
            case 1949671265:
                if (str.equals("IG_LOGOUT_UPSELL")) {
                    return EnumC72435Xdf.A0G;
                }
                return EnumC72435Xdf.A0O;
            default:
                return EnumC72435Xdf.A0O;
        }
    }
}
