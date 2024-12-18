package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.2oc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59942oc {
    public static final Integer A00(C120985dq c120985dq, UserSession userSession) {
        C14360o3.A0B(c120985dq, 0);
        if (c120985dq.CdW() && !c120985dq.A0I()) {
            int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36596054826223925L);
            Integer valueOf = Integer.valueOf(A01);
            if (A01 > 0) {
                return valueOf;
            }
        }
        return null;
    }

    public static final C09530e4 A01(C120985dq c120985dq, UserSession userSession) {
        if (c120985dq.CdW() && !c120985dq.A0I()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            return new C09530e4(Integer.valueOf((int) C18U.A01(c06090Tz, userSession, 36609656986212298L)), Integer.valueOf((int) C18U.A01(c06090Tz, userSession, 36609656986277835L)));
        }
        return new C09530e4(0, 0);
    }

    public static final boolean A02(ClipsViewerSource clipsViewerSource, C37644Ghd c37644Ghd, UserSession userSession) {
        C14360o3.A0B(c37644Ghd, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(clipsViewerSource, 2);
        if (c37644Ghd.A0W) {
            if (C18U.A06(C06090Tz.A06, userSession, 36324436797894824L) || clipsViewerSource == ClipsViewerSource.A1Q || clipsViewerSource == ClipsViewerSource.A1R) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (X.C14360o3.A0I(r1, 0.5625f) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A06(X.C120985dq r5) {
        /*
            r4 = 0
            X.1qM r0 = r5.A02
            if (r0 == 0) goto L4f
            float r0 = r0.A0m()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        Ld:
            r3 = 1
            if (r1 == 0) goto L19
            r0 = 1058013184(0x3f100000, float:0.5625)
            boolean r0 = X.C14360o3.A0I(r1, r0)
            r2 = 1
            if (r0 != 0) goto L1a
        L19:
            r2 = 0
        L1a:
            X.5t1 r0 = r5.A01
            boolean r0 = X.AbstractC37647Ghg.A01(r0)
            if (r0 == 0) goto L51
            X.1qM r0 = r5.A02
            if (r0 == 0) goto L4d
            X.GjA r1 = X.AbstractC37655Gho.A00(r0)
            X.GjA r0 = X.EnumC37735GjA.A07
            boolean r0 = r1.equals(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L34:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L51
            boolean r0 = r5.A0F()
            if (r0 != 0) goto L51
            boolean r0 = r5.A0I()
            if (r0 != 0) goto L51
            if (r2 == 0) goto L51
            return r3
        L4d:
            r1 = 0
            goto L34
        L4f:
            r1 = 0
            goto Ld
        L51:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59942oc.A06(X.5dq):boolean");
    }

    public static final boolean A07(C120985dq c120985dq, UserSession userSession) {
        User CDj;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36317517606032682L) || (c120985dq.CdW() && (CDj = c120985dq.A06().A0K.A0C.CDj()) != null && !CDj.A2N() && C5Hu.A00(c120985dq.A06().A0K.A0C.AqQ(), userSession))) {
            return true;
        }
        return false;
    }

    public static final boolean A08(C120985dq c120985dq, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36319939968900970L)) {
            if ((c120985dq != null && c120985dq.CdW()) || C18U.A06(c06090Tz, userSession, 36319939969687403L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A09(C120985dq c120985dq, UserSession userSession) {
        if (!c120985dq.CdW() || (c120985dq.A0I() && !C18U.A06(C06090Tz.A05, userSession, 36318531217987871L))) {
            return false;
        }
        return C18U.A06(C06090Tz.A05, userSession, 36318531217791260L);
    }

    public static final boolean A0A(C120985dq c120985dq, UserSession userSession) {
        if (!c120985dq.CdW() || (c120985dq.A0I() && !C18U.A06(C06090Tz.A05, userSession, 36318531217987871L))) {
            return false;
        }
        return C18U.A06(C06090Tz.A05, userSession, 36318531217856797L);
    }

    public static final boolean A0C(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 2342160526819333417L);
    }

    public static final boolean A0D(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str2, 2);
        if (str != null && ((str2.equals("clips_viewer_clips_profile") || str2.equals("clips_viewer_feed_contextual_profile")) && C18U.A06(C06090Tz.A06, userSession, 36320695881311029L))) {
            return true;
        }
        return false;
    }

    public final long A0E(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession) {
        long j;
        long j2;
        int intValue;
        Integer num;
        C14360o3.A0B(c37644Ghd, 1);
        Integer num2 = null;
        C40971v4 A07 = c120985dq.A07();
        if (A07 != null && AbstractC37587Ggi.A00(userSession)) {
            C5G3 c5g3 = A07.A0F;
            if (c5g3 == null || (num = c5g3.A0F) == null) {
                return 0L;
            }
            intValue = num.intValue();
        } else {
            if (!c120985dq.CdW() || c37644Ghd.A0W) {
                return 0L;
            }
            boolean A00 = new BKG().A00(c120985dq);
            InterfaceC104814nm interfaceC104814nm = c120985dq.A06().A04;
            if (interfaceC104814nm != null) {
                num2 = interfaceC104814nm.AwZ();
            }
            boolean A03 = A03(c120985dq);
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                if (A0B(c120985dq, userSession)) {
                    return 0L;
                }
                C06090Tz c06090Tz = C06090Tz.A05;
                if (A03) {
                    if (A00) {
                        j2 = 36315748079504896L;
                    } else {
                        j2 = 36314579848792799L;
                    }
                    if (!C18U.A06(c06090Tz, userSession, j2)) {
                        return 0L;
                    }
                    if (A00) {
                        j = 36597223056018168L;
                    } else {
                        j = 36596054825371954L;
                    }
                } else if (A00) {
                    j = 36597223055690487L;
                } else {
                    j = 36596054824847665L;
                }
                return C18U.A01(c06090Tz, userSession, j);
            }
        }
        return intValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        if (r7.CdW() == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0F(X.C120985dq r7, X.C37644Ghd r8, com.instagram.common.session.UserSession r9) {
        /*
            r6 = this;
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L1e
            X.1v4 r1 = r7.A07()
            if (r1 == 0) goto L20
            boolean r0 = X.AbstractC37587Ggi.A00(r9)
            if (r0 == 0) goto L20
            X.5G3 r0 = r1.A0F
            if (r0 == 0) goto L6c
            java.lang.Integer r4 = r0.A0G
            if (r4 == 0) goto L6c
        L18:
            int r0 = r4.intValue()
            long r0 = (long) r0
        L1d:
            return r0
        L1e:
            r2 = 0
            goto L27
        L20:
            r2 = 1
            boolean r0 = r7.CdW()
            if (r0 != r3) goto L1e
        L27:
            r0 = 0
            if (r2 == 0) goto L1d
            boolean r2 = r8.A0W
            if (r2 != 0) goto L1d
            r2 = 0
            X.C14360o3.A0B(r7, r2)
            X.BKG r2 = new X.BKG
            r2.<init>()
            boolean r5 = r2.A00(r7)
            X.1v4 r2 = r7.A06()
            X.4nm r2 = r2.A04
            if (r2 == 0) goto L48
            java.lang.Integer r4 = r2.BE8()
        L48:
            boolean r3 = A03(r7)
            if (r4 != 0) goto L18
            boolean r2 = A0B(r7, r9)
            if (r2 != 0) goto L83
            if (r3 == 0) goto L6f
            X.0Tz r4 = X.C06090Tz.A05
            if (r5 == 0) goto L66
            r2 = 36315748079504896(0x8104fb00080e00, double:3.0295635450344776E-306)
        L5f:
            boolean r2 = X.C18U.A06(r4, r9, r2)
            if (r2 == 0) goto L83
            return r0
        L66:
            r2 = 36314579848792799(0x8103eb000e0adf, double:3.02882475122806E-306)
            goto L5f
        L6c:
            r0 = 2000(0x7d0, double:9.88E-321)
            return r0
        L6f:
            X.0Tz r2 = X.C06090Tz.A05
            if (r5 == 0) goto L7d
            r0 = 36597223056083705(0x8204fb00060af9, double:3.207569453631673E-306)
        L78:
            long r0 = X.C18U.A01(r2, r9, r0)
            return r0
        L7d:
            r0 = 36596054824782128(0x8203eb00030930, double:3.206830659452466E-306)
            goto L78
        L83:
            r0 = 4000(0xfa0, double:1.9763E-320)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59942oc.A0F(X.5dq, X.Ghd, com.instagram.common.session.UserSession):long");
    }

    public final long A0H(C120985dq c120985dq, UserSession userSession) {
        Long valueOf;
        C06090Tz c06090Tz;
        long j;
        if (c120985dq.CdW()) {
            if (new BKG().A00(c120985dq)) {
                if (A0I(c120985dq, userSession)) {
                    c06090Tz = C06090Tz.A06;
                    j = 36605452213097733L;
                } else {
                    boolean A0N = A0N(c120985dq, userSession, false);
                    c06090Tz = C06090Tz.A06;
                    if (A0N) {
                        j = 36607204559820338L;
                    } else {
                        j = 36597223056542459L;
                    }
                }
                valueOf = Long.valueOf(C18U.A01(c06090Tz, userSession, j));
                C14360o3.A0A(valueOf);
            } else {
                valueOf = Long.valueOf(C18U.A01(C06090Tz.A05, userSession, 36596054826027316L));
            }
            return valueOf.longValue();
        }
        return Long.MAX_VALUE;
    }

    public final boolean A0I(C120985dq c120985dq, UserSession userSession) {
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(userSession, 1);
        C38321qM c38321qM = c120985dq.A06().A0K;
        InterfaceC104914o3 interfaceC104914o3 = c120985dq.A06().A0B;
        if (interfaceC104914o3 == null || interfaceC104914o3.B6f() == null || AbstractC75103Za.A0H(userSession, AbstractC41071vF.A07(userSession, c38321qM))) {
            return false;
        }
        C38321qM c38321qM2 = c120985dq.A06().A0K;
        EnumC41021v9 enumC41021v9 = c120985dq.A06().A0L;
        if (enumC41021v9 == null) {
            return false;
        }
        CFP cfp = CFP.$redex_init_class;
        int ordinal = enumC41021v9.ordinal();
        if (ordinal != 4) {
            if (ordinal != 1) {
                if (ordinal == 2 && !c38321qM2.A5v() && !c38321qM2.A5m()) {
                    c06090Tz = C06090Tz.A05;
                    j = 36330999507862635L;
                } else {
                    return false;
                }
            } else {
                if (!c38321qM2.A5w()) {
                    if (c38321qM2.A5v()) {
                        return C18U.A06(C06090Tz.A05, userSession, 36330471226884990L);
                    }
                    return true;
                }
                return false;
            }
        } else if (!c38321qM2.A5v() && !c38321qM2.A5m()) {
            c06090Tz = C06090Tz.A05;
            j = 36330037435187850L;
        } else {
            return false;
        }
        if (C18U.A06(c06090Tz, userSession, j)) {
            return true;
        }
        return false;
    }

    public final boolean A0J(C120985dq c120985dq, UserSession userSession) {
        List CF8;
        C14360o3.A0B(c120985dq, 0);
        C14360o3.A0B(userSession, 1);
        if (C18U.A06(C06090Tz.A06, userSession, 36325622209131735L) && AbstractC37647Ghg.A01(c120985dq.A01) && !c120985dq.A0I() && (CF8 = c120985dq.A06().A0K.A0C.CF8()) != null && !CF8.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A0K(C120985dq c120985dq, UserSession userSession) {
        long j;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c120985dq, 1);
        if (c120985dq.A01 == EnumC129395t1.A02 && c120985dq.A0J == EnumC40111tc.A0a) {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                j = (long) c38321qM.A0l();
            } else {
                j = -1;
            }
            if (j >= C18U.A01(C06090Tz.A06, userSession, 36607097185637929L) && !c120985dq.A0I()) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36325622208804051L)) {
                    if (C18U.A06(c06090Tz, userSession, 36325622209066198L)) {
                        C38321qM c38321qM2 = c120985dq.A02;
                        if (c38321qM2 != null && c38321qM2.A1v() != null) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean A0L(C120985dq c120985dq, UserSession userSession) {
        C06090Tz c06090Tz;
        long j;
        Boolean bool;
        if (!A0M(c120985dq, userSession, false)) {
            return false;
        }
        if (A03(c120985dq)) {
            if (A0I(c120985dq, userSession)) {
                if (c120985dq.A06().A0v) {
                    return true;
                }
                boolean A67 = c120985dq.A06().A0K.A67();
                c06090Tz = C06090Tz.A05;
                if (A67) {
                    j = 36330471226884990L;
                } else {
                    bool = Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36323977236524796L));
                    return bool.booleanValue();
                }
            } else {
                boolean A0N = A0N(c120985dq, userSession, false);
                c06090Tz = C06090Tz.A06;
                if (A0N) {
                    j = 36325729582986552L;
                } else {
                    j = 36315541921926545L;
                }
            }
        } else {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && c38321qM.A1C() == 0) {
                return false;
            }
            c06090Tz = C06090Tz.A06;
            j = 36315541921861008L;
        }
        bool = Boolean.valueOf(C18U.A06(c06090Tz, userSession, j));
        C14360o3.A0A(bool);
        return bool.booleanValue();
    }

    public final boolean A0M(C120985dq c120985dq, UserSession userSession, boolean z) {
        List A04;
        C06090Tz c06090Tz;
        long j;
        List B22;
        C14360o3.A0B(userSession, 1);
        if (c120985dq.CdW() && !c120985dq.A06().A0K.A5w() && (((A04 = c120985dq.A06().A04()) == null || !A04.isEmpty()) && c120985dq.A06().A0q)) {
            if (!A0I(c120985dq, userSession)) {
                if (!c120985dq.A06().A0K.A5v()) {
                    if (!A0N(c120985dq, userSession, z)) {
                        InterfaceC104774nh interfaceC104774nh = c120985dq.A06().A02;
                        if (interfaceC104774nh != null && (B22 = interfaceC104774nh.B22()) != null && (!B22.isEmpty())) {
                            c06090Tz = C06090Tz.A05;
                            j = 36318226275113026L;
                        } else if (new BKG().A00(c120985dq)) {
                            if (z) {
                                c06090Tz = C06090Tz.A05;
                            } else {
                                c06090Tz = C06090Tz.A06;
                            }
                            j = 36315748081864222L;
                        } else {
                            c06090Tz = C06090Tz.A05;
                            j = 36315541920615808L;
                        }
                        return C18U.A06(c06090Tz, userSession, j);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A0N(C120985dq c120985dq, UserSession userSession, boolean z) {
        boolean z2;
        OnFeedMessagesIntf onFeedMessagesIntf;
        C06090Tz c06090Tz;
        OnFeedMessagesIntf BUJ;
        List BEf;
        C14360o3.A0B(userSession, 1);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && !c38321qM.A5v()) {
            IGCTMessagingAdsInfoDictIntf A00 = AbstractC41071vF.A00(userSession, c38321qM);
            if (A00 != null && (BUJ = A00.BUJ()) != null && (BEf = BUJ.BEf()) != null) {
                z2 = !BEf.isEmpty();
            } else {
                z2 = false;
            }
            IGCTMessagingAdsInfoDictIntf A002 = AbstractC41071vF.A00(userSession, c38321qM);
            if (A002 != null) {
                onFeedMessagesIntf = A002.BUJ();
            } else {
                onFeedMessagesIntf = null;
            }
            int A003 = AbstractC76673cF.A00(onFeedMessagesIntf);
            boolean z3 = false;
            if (A003 == 3) {
                z3 = true;
            }
            if (z2 && z3) {
                if (z) {
                    c06090Tz = C06090Tz.A05;
                } else {
                    c06090Tz = C06090Tz.A06;
                }
                boolean A06 = C18U.A06(c06090Tz, userSession, 36325729582986552L);
                C14360o3.A0A(Boolean.valueOf(A06));
                return A06;
            }
            return false;
        }
        return false;
    }

    public static final boolean A03(C120985dq c120985dq) {
        EnumC40111tc enumC40111tc;
        EnumC40111tc enumC40111tc2 = c120985dq.A0J;
        if (enumC40111tc2 != EnumC40111tc.A0Q && enumC40111tc2 != EnumC40111tc.A0V) {
            if (enumC40111tc2 == EnumC40111tc.A0B) {
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null) {
                    enumC40111tc = c38321qM.A1d().BRp();
                } else {
                    enumC40111tc = null;
                }
                if (enumC40111tc == EnumC40111tc.A0a) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static final boolean A04(C120985dq c120985dq) {
        MoreInfoProductTagType moreInfoProductTagType;
        InterfaceC87803vo BUx;
        InterfaceC107114sH BTf;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (BUx = c38321qM.A0C.BUx()) != null && (BTf = BUx.BTf()) != null) {
            moreInfoProductTagType = BTf.BhL();
        } else {
            moreInfoProductTagType = null;
        }
        if (moreInfoProductTagType != MoreInfoProductTagType.A05) {
            return false;
        }
        return true;
    }

    public static final boolean A05(C120985dq c120985dq) {
        MoreInfoProductTagType moreInfoProductTagType;
        InterfaceC87803vo BUx;
        InterfaceC107114sH BTf;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (BUx = c38321qM.A0C.BUx()) != null && (BTf = BUx.BTf()) != null) {
            moreInfoProductTagType = BTf.BhL();
        } else {
            moreInfoProductTagType = null;
        }
        if (moreInfoProductTagType != MoreInfoProductTagType.A06) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (X.CLN.A00(r9).A00(r7) == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0G(X.C120985dq r7, X.C37644Ghd r8, com.instagram.common.session.UserSession r9, boolean r10) {
        /*
            r6 = this;
            if (r10 == 0) goto Ld
            X.CUI r0 = X.CLN.A00(r9)
            boolean r0 = r0.A00(r7)
            r3 = 1
            if (r0 != 0) goto Le
        Ld:
            r3 = 0
        Le:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317517608064306(0x81069700271532, double:3.030682602020768E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 == 0) goto L50
            r4 = 2000(0x7d0, double:9.88E-321)
            if (r7 == 0) goto L4a
            boolean r0 = r7.CdW()
            if (r0 == 0) goto L4a
            X.1v4 r0 = r7.A06()
            X.4o9 r0 = r0.A0N
            if (r0 == 0) goto L4a
            X.1v4 r0 = r7.A06()
            X.4o9 r0 = r0.A0N
            if (r0 == 0) goto L47
            java.lang.Integer r0 = r0.AwU()
            if (r0 == 0) goto L47
            int r0 = r0.intValue()
            long r2 = (long) r0
        L40:
            long r0 = r6.A0F(r7, r8, r9)
            long r0 = r0 + r4
            long r0 = r0 + r2
            return r0
        L47:
            r2 = 0
            goto L40
        L4a:
            long r0 = r6.A0F(r7, r8, r9)
            long r0 = r0 + r4
            return r0
        L50:
            if (r3 == 0) goto L6e
            if (r7 == 0) goto L66
            boolean r0 = A03(r7)
            if (r0 == 0) goto L66
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36598992583200105(0x820697000f0d69, double:3.208688509705398E-306)
        L61:
            long r0 = X.C18U.A01(r2, r9, r0)
            return r0
        L66:
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36598992583396714(0x82069700120d6a, double:3.2086885098297346E-306)
            goto L61
        L6e:
            if (r7 == 0) goto L7e
            boolean r0 = A03(r7)
            if (r0 == 0) goto L7e
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36598992583003495(0x820697000c0d67, double:3.208688509581061E-306)
            goto L61
        L7e:
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36598992582872422(0x820697000a0d66, double:3.20868850949817E-306)
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59942oc.A0G(X.5dq, X.Ghd, com.instagram.common.session.UserSession, boolean):long");
    }

    public static final boolean A0B(C120985dq c120985dq, UserSession userSession) {
        C06090Tz c06090Tz;
        long j;
        if (c120985dq.CdW()) {
            if (!c120985dq.A06().A0K.A5w()) {
                if (c120985dq.A06().A0K.A5m()) {
                    c06090Tz = C06090Tz.A05;
                    j = 36330943673353308L;
                } else if (c120985dq.A06().A0K.A5v()) {
                    c06090Tz = C06090Tz.A05;
                    j = 36330943673287771L;
                } else {
                    return false;
                }
                if (C18U.A06(c06090Tz, userSession, j)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
