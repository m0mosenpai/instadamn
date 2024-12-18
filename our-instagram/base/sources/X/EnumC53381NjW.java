package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NjW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class EnumC53381NjW implements CallerContextable {
    public static final CallerContext A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53381NjW[] A03;
    public static final EnumC53381NjW A04;
    public static final EnumC53381NjW A05;
    public static final EnumC53381NjW A06;
    public static final EnumC53381NjW A07;
    public static final EnumC53381NjW A08;
    public static final EnumC53381NjW A09;
    public static final EnumC53381NjW A0A;
    public static final EnumC53381NjW A0B;
    public static final EnumC53381NjW A0C;
    public static final EnumC53381NjW A0D;
    public static final EnumC53381NjW A0E;
    public static final EnumC53381NjW A0F;
    public static final EnumC53381NjW A0G;
    public static final EnumC53381NjW A0H;
    public static final EnumC53381NjW A0I;
    public static final EnumC53381NjW A0J;
    public static final EnumC53381NjW A0K;
    public static final EnumC53381NjW A0L;
    public static final EnumC53381NjW A0M;
    public static final EnumC53381NjW A0N;
    public static final EnumC53381NjW A0O;
    public static final EnumC53381NjW A0P;
    public static final String __redex_internal_original_name = "NoticeEligibilityRule";
    public final EnumC53322Nhz A00;

    static {
        C52749NVz c52749NVz = new C52749NVz();
        A0G = c52749NVz;
        NW7 nw7 = new NW7();
        A0N = nw7;
        NW5 nw5 = new NW5();
        A0L = nw5;
        C52741NVp c52741NVp = new C52741NVp();
        A06 = c52741NVp;
        NVn nVn = new NVn();
        A04 = nVn;
        C52747NVx c52747NVx = new C52747NVx();
        A0E = c52747NVx;
        C52748NVy c52748NVy = new C52748NVy();
        A0F = c52748NVy;
        NVo nVo = new NVo();
        A05 = nVo;
        NW6 nw6 = new NW6();
        A0M = nw6;
        NW2 nw2 = new NW2();
        A0J = nw2;
        NVq nVq = new NVq();
        A07 = nVq;
        NW8 nw8 = new NW8();
        A0O = nw8;
        NW9 nw9 = new NW9();
        A0P = nw9;
        NW0 nw0 = new NW0();
        A0H = nw0;
        NW1 nw1 = new NW1();
        A0I = nw1;
        NVt nVt = new NVt();
        A0A = nVt;
        C52744NVu c52744NVu = new C52744NVu();
        A0B = c52744NVu;
        C52746NVw c52746NVw = new C52746NVw();
        A0D = c52746NVw;
        C52742NVr c52742NVr = new C52742NVr();
        A08 = c52742NVr;
        C52743NVs c52743NVs = new C52743NVs();
        A09 = c52743NVs;
        C52745NVv c52745NVv = new C52745NVv();
        A0C = c52745NVv;
        NW3 nw3 = new NW3();
        A0K = nw3;
        EnumC53381NjW[] enumC53381NjWArr = {c52749NVz, nw7, nw5, c52741NVp, nVn, c52747NVx, c52748NVy, nVo, nw6, nw2, nVq, nw8, nw9, nw0, nw1, nVt, c52744NVu, c52746NVw, c52742NVr, c52743NVs, c52745NVv, nw3, new NW4()};
        A03 = enumC53381NjWArr;
        A02 = AbstractC12190kN.A00(enumC53381NjWArr);
        A01 = CallerContext.A00(EnumC53381NjW.class);
    }

    public static EnumC53381NjW valueOf(String str) {
        return (EnumC53381NjW) Enum.valueOf(EnumC53381NjW.class, str);
    }

    public static EnumC53381NjW[] values() {
        return (EnumC53381NjW[]) A03.clone();
    }

    public final String A02(C206319Bo c206319Bo, UserSession userSession) {
        if (this instanceof NW8) {
            if (c206319Bo != null) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("reelCcpVisible=");
                A1C.append(c206319Bo.A06);
                A1C.append(",reelXarVisible=");
                A1C.append(c206319Bo.A08);
                A1C.append(",LauncherEnabledXAR=");
                return A01(c206319Bo, userSession, A0F, A1C);
            }
            return null;
        }
        if (this instanceof NW7) {
            return A00(c206319Bo, userSession);
        }
        if (this instanceof NW5) {
            return A00(c206319Bo, userSession);
        }
        if (this instanceof NVq) {
            if (c206319Bo != null) {
                StringBuilder A1C2 = AbstractC166987dD.A1C();
                A1C2.append("reelCcpVisible=");
                A1C2.append(c206319Bo.A06);
                A1C2.append(",reelXarVisible=");
                A1C2.append(c206319Bo.A08);
                A1C2.append(",LauncherEnabledCCP=");
                return A01(c206319Bo, userSession, A0E, A1C2);
            }
            return null;
        }
        if (this instanceof C52741NVp) {
            return A00(c206319Bo, userSession);
        }
        if (this instanceof NVn) {
            return A00(c206319Bo, userSession);
        }
        return null;
    }

    public final boolean A03(C206319Bo c206319Bo, UserSession userSession) {
        C82H c82h;
        EnumC201098ur enumC201098ur;
        C82I A0H2;
        String str;
        if (this instanceof NW9) {
            C82G c82g = C82G.A0N;
            C46552Bt A00 = AbstractC46542Bs.A00(userSession);
            long A002 = C200108tF.A00(userSession);
            InterfaceC19630xq interfaceC19630xq = A00.A04;
            long j = interfaceC19630xq.getLong("PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", 0L);
            long j2 = interfaceC19630xq.getLong("PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_LAST_SEEN_TIME_MS", 0L);
            long j3 = interfaceC19630xq.getLong("PREFERENCE_REELS_XAR_UPSELL_LAST_SEEN_MS", 0L);
            long j4 = interfaceC19630xq.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_UPSELL_LAST_SEEN", 0L);
            long j5 = interfaceC19630xq.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_V_1_5_UPSELL_LAST_SEEN", 0L);
            long currentTimeMillis = System.currentTimeMillis();
            C06090Tz c06090Tz = C06090Tz.A05;
            long j6 = currentTimeMillis - j;
            if (C18U.A01(c06090Tz, userSession, 36599834396200589L) * 86400000 > j6) {
                if (AbstractC166997dE.A0c(c06090Tz, userSession, 2342161368633317486L).booleanValue()) {
                    c82h = C82H.A0T;
                    enumC201098ur = EnumC201098ur.SUPPRESS;
                    A0H2 = MSW.A0H();
                    str = "custom_cooldown:xar_setting_change";
                    A0H2.A06("suppress_reason", str);
                    AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H2, userSession);
                }
            } else if (C18U.A01(c06090Tz, userSession, 36599834396135052L) * 86400000 > currentTimeMillis - A002) {
                if (AbstractC166997dE.A0c(c06090Tz, userSession, 2342161368633317486L).booleanValue()) {
                    c82h = C82H.A0T;
                    enumC201098ur = EnumC201098ur.SUPPRESS;
                    A0H2 = MSW.A0H();
                    str = "custom_cooldown:ccp_setting_change";
                    A0H2.A06("suppress_reason", str);
                    AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H2, userSession);
                }
            } else if (C18U.A01(c06090Tz, userSession, 36599834395872904L) * 86400000 <= currentTimeMillis - j3 && C18U.A01(c06090Tz, userSession, 36599834395872904L) * 86400000 <= j6) {
                if (C18U.A01(c06090Tz, userSession, 36599834396069515L) * 86400000 > currentTimeMillis - j2) {
                    if (AbstractC166997dE.A0c(c06090Tz, userSession, 2342161368633317486L).booleanValue()) {
                        c82h = C82H.A0T;
                        enumC201098ur = EnumC201098ur.SUPPRESS;
                        A0H2 = MSW.A0H();
                        str = "custom_cooldown:ccp_upsell_view";
                        A0H2.A06("suppress_reason", str);
                        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H2, userSession);
                    }
                } else if (C18U.A01(c06090Tz, userSession, 36599834396069515L) * 86400000 > currentTimeMillis - j4) {
                    if (AbstractC166997dE.A0c(c06090Tz, userSession, 2342161368633317486L).booleanValue()) {
                        c82h = C82H.A0T;
                        enumC201098ur = EnumC201098ur.SUPPRESS;
                        A0H2 = MSW.A0H();
                        str = "custom_cooldown:simplification_upsell_view";
                        A0H2.A06("suppress_reason", str);
                        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H2, userSession);
                    }
                } else if (C18U.A01(c06090Tz, userSession, 36599834396069515L) * 86400000 > currentTimeMillis - j5) {
                    if (AbstractC166997dE.A0c(c06090Tz, userSession, 2342161368633317486L).booleanValue()) {
                        c82h = C82H.A0T;
                        enumC201098ur = EnumC201098ur.SUPPRESS;
                        A0H2 = MSW.A0H();
                        str = "custom_cooldown:simplification_upsell_v15_view";
                        A0H2.A06("suppress_reason", str);
                        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H2, userSession);
                    }
                } else {
                    return true;
                }
            } else if (AbstractC166997dE.A0c(c06090Tz, userSession, 2342161368633317486L).booleanValue()) {
                c82h = C82H.A0T;
                enumC201098ur = EnumC201098ur.SUPPRESS;
                A0H2 = MSW.A0H();
                str = "custom_cooldown:xar_upsell_view";
                A0H2.A06("suppress_reason", str);
                AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H2, userSession);
            }
        } else if (this instanceof NW8) {
            if (c206319Bo != null) {
                return AbstractC31177DnL.A1b(c206319Bo.A08);
            }
        } else if (this instanceof NW7) {
            if (AbstractC46542Bs.A00(userSession).A0C() && c206319Bo != null && AbstractC166997dE.A1Z(c206319Bo.A01, true)) {
                return true;
            }
        } else if (this instanceof NW6) {
            if (c206319Bo != null) {
                return AbstractC31177DnL.A1b(c206319Bo.A07);
            }
        } else {
            if (this instanceof NW5) {
                if (AbstractC46542Bs.A00(userSession).A0C() || c206319Bo == null || !AbstractC166997dE.A1Z(c206319Bo.A01, false)) {
                    return false;
                }
                return true;
            }
            if (this instanceof NW4) {
                return AbstractC167007dF.A1X(AbstractC31178DnM.A0T(userSession).A0M(), C05F.A01);
            }
            if (this instanceof NW3) {
                return A08.A03(c206319Bo, userSession);
            }
            if (this instanceof NW2) {
                if (c206319Bo != null) {
                    return AbstractC31177DnL.A1b(c206319Bo.A02);
                }
            } else {
                if (this instanceof NW1) {
                    return C196008lp.A00(userSession);
                }
                if (this instanceof NW0) {
                    return !C196008lp.A00(userSession);
                }
                if (!(this instanceof C52749NVz)) {
                    if (this instanceof C52748NVy) {
                        return C173057nJ.A00.A00(userSession, true);
                    }
                    if (this instanceof C52747NVx) {
                        C06090Tz c06090Tz2 = C06090Tz.A05;
                        if (!C18U.A06(c06090Tz2, userSession, 36315687949831668L) && C18U.A06(c06090Tz2, userSession, 36314554078071485L)) {
                            return true;
                        }
                        return false;
                    }
                    if (this instanceof C52746NVw) {
                        return A0I.A03(c206319Bo, userSession) ^ A0B.A03(c206319Bo, userSession);
                    }
                    if (this instanceof C52745NVv) {
                        if (c206319Bo != null) {
                            return AbstractC31177DnL.A1b(c206319Bo.A04);
                        }
                    } else {
                        if (this instanceof C52744NVu) {
                            return C196218mC.A00(userSession);
                        }
                        if (this instanceof NVt) {
                            return !C196218mC.A00(userSession);
                        }
                        if (this instanceof C52743NVs) {
                            return !C196058lv.A08.A04(A01, userSession);
                        }
                        if (this instanceof C52742NVr) {
                            return C180377zR.A07(userSession);
                        }
                        if (this instanceof NVq) {
                            if (c206319Bo != null) {
                                return AbstractC31177DnL.A1b(c206319Bo.A06);
                            }
                        } else if (this instanceof C52741NVp) {
                            if (C200108tF.A06(userSession) && c206319Bo != null && AbstractC166997dE.A1Z(c206319Bo.A00, true)) {
                                return true;
                            }
                        } else if (this instanceof NVo) {
                            if (c206319Bo != null) {
                                return AbstractC31177DnL.A1b(c206319Bo.A05);
                            }
                        } else {
                            if (!C200108tF.A06(userSession) && c206319Bo != null && AbstractC166997dE.A1Z(c206319Bo.A00, false)) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public EnumC53381NjW(EnumC53322Nhz enumC53322Nhz, String str, int i) {
        this.A00 = enumC53322Nhz;
    }

    public static String A00(C206319Bo c206319Bo, UserSession userSession) {
        boolean A062 = C200108tF.A06(userSession);
        boolean A0C2 = AbstractC46542Bs.A00(userSession).A0C();
        if (c206319Bo != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("reelCcpIsOnForCurrentReel=");
            sb.append(c206319Bo.A00);
            sb.append(",reelCcpIsOnForAllReel=");
            sb.append(A062);
            sb.append(",reelXarIsOnForCurrentReel=");
            sb.append(c206319Bo.A01);
            sb.append(",reelXarIsOnForAllReel=");
            sb.append(A0C2);
            return sb.toString();
        }
        return null;
    }

    public static String A01(C206319Bo c206319Bo, UserSession userSession, EnumC53381NjW enumC53381NjW, StringBuilder sb) {
        sb.append(enumC53381NjW.A03(c206319Bo, userSession));
        sb.append(",FBAccountLinked=");
        sb.append(A08.A03(c206319Bo, userSession));
        sb.append(",isCCPMoreRecentThanXAR=");
        sb.append(C200108tF.A01.A0E(userSession));
        return sb.toString();
    }
}
