package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.30P, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C30P {
    public final InterfaceC60442pS A00;
    public final String A01;

    public C4T2 A06(C4T2 c4t2, Object obj) {
        Integer num;
        String str;
        C14360o3.A0B(c4t2, 1);
        String str2 = C1QM.A00.A02.A00;
        if (str2 != null) {
            c4t2.A06("nav_chain", str2);
        }
        String A02 = A02();
        if (A02 != null) {
            c4t2.A06("chaining_session_id", A02);
        }
        String A09 = A09();
        if (A09 != null) {
            c4t2.A06("viewer_session_id", A09);
        }
        C4SH A07 = A07(obj);
        if (A07 != null) {
            C75363a3 c75363a3 = A07.A04;
            boolean z = A07.A0P;
            EnumC40111tc enumC40111tc = A07.A02;
            if (z) {
                num = C05F.A01;
            } else if (c75363a3 != null) {
                ProductType productType = c75363a3.A09;
                if (productType == null || (str = productType.A00) == null) {
                    num = c75363a3.A0E;
                }
                c4t2.A06("video_type", str);
            } else if (enumC40111tc != EnumC40111tc.A09 && enumC40111tc != EnumC40111tc.A0B) {
                if (enumC40111tc == EnumC40111tc.A0L) {
                    num = C05F.A0N;
                } else if (enumC40111tc == EnumC40111tc.A0Q) {
                    num = C05F.A15;
                } else {
                    str = "unknown";
                    c4t2.A06("video_type", str);
                }
            } else {
                num = C05F.A00;
            }
            str = AbstractC95674Sb.A00(num);
            c4t2.A06("video_type", str);
        }
        return c4t2;
    }

    public void A0A(C19280xC c19280xC, C4SW c4sw) {
    }

    public boolean A0B(Object obj) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0Zx, X.4So] */
    public final C95804So A01(UserSession userSession, C38321qM c38321qM) {
        String str;
        EnumC95784Sm enumC95784Sm;
        InterfaceC60442pS interfaceC60442pS = this.A00;
        String str2 = null;
        if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
            enumC95784Sm = EnumC95784Sm.PAID;
            str = AbstractC41071vF.A0F(userSession, c38321qM);
        } else if (AbstractC75423a9.A01(c38321qM, interfaceC60442pS)) {
            enumC95784Sm = EnumC95784Sm.ORGANIC;
            str = c38321qM.A0C.getOrganicTrackingToken();
        } else {
            if (c38321qM.CW9()) {
                str = c38321qM.A0C.BHD();
            } else {
                str = null;
            }
            enumC95784Sm = EnumC95784Sm.ORGANIC;
        }
        String A03 = A03(c38321qM);
        User A2E = c38321qM.A1g(userSession).A2E(userSession);
        if (A2E != null) {
            str2 = A2E.getId();
        }
        ?? c0Zx = new C0Zx();
        c0Zx.A05("media_id", Long.valueOf(C4Sq.A00.A01(A03)));
        c0Zx.A01(enumC95784Sm, "tracking_type");
        c0Zx.A06("current_watching_module", interfaceC60442pS.getModuleName());
        c0Zx.A06("tracking_token", str);
        c0Zx.A06("author_id", str2);
        c0Zx.A06("pre_processing_media_id", A03);
        return c0Zx;
    }

    public final String A02() {
        if (this instanceof C4SZ) {
            return ((C4SZ) this).A05;
        }
        return null;
    }

    public final String A04(String str) {
        if (this instanceof C4SU) {
            C14360o3.A0B(str, 0);
            if (((C4SU) this).A0H.Cc5()) {
                return "cobroadcast_finish";
            }
            return str;
        }
        C14360o3.A0B(str, 0);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011f, code lost:
    
        if (r3 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
    
        r3 = "57320893950";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
    
        r4 = new X.C0Zx();
        r4.A05("media_id", java.lang.Long.valueOf(r0));
        r4.A01(X.EnumC95784Sm.ORGANIC, "tracking_type");
        r4.A06("current_watching_module", ((X.C30P) r2).A00.getModuleName());
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        if (r5 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0146, code lost:
    
        r2 = (java.lang.String) r5.A06.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014e, code lost:
    
        r4.A06("tracking_token", r2);
        r4.A06("author_id", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0158, code lost:
    
        if (r5 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015a, code lost:
    
        r1 = r5.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015c, code lost:
    
        r4.A06("pre_processing_media_id", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0161, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0162, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0166, code lost:
    
        if (r5 != null) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Zx, X.4So] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C95804So A05(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30P.A05(java.lang.Object):X.4So");
    }

    public C4SH A07(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long A03;
        C105824pt c105824pt;
        String str6;
        String str7;
        String str8;
        String str9;
        if (this instanceof C4SZ) {
            return ((C4SZ) this).A0C((C120985dq) obj);
        }
        if (this instanceof C30O) {
            C30O c30o = (C30O) this;
            C38321qM c38321qM = (C38321qM) obj;
            C14360o3.A0B(c38321qM, 0);
            InterfaceC60442pS interfaceC60442pS = ((C30P) c30o).A00;
            boolean z = true;
            boolean z2 = false;
            FollowStatus followStatus = null;
            if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
                str7 = AbstractC41071vF.A0F(c30o.A00, c38321qM);
                z = false;
                z2 = true;
            } else if (AbstractC75423a9.A01(c38321qM, interfaceC60442pS)) {
                str7 = c38321qM.A0C.getOrganicTrackingToken();
            } else {
                if (c38321qM.CW9()) {
                    str7 = c38321qM.A0C.BHD();
                } else {
                    str7 = null;
                }
                z = false;
            }
            UserSession userSession = c30o.A00;
            User A2E = c38321qM.A2E(userSession);
            EnumC40111tc BRp = c38321qM.BRp();
            if (BRp == EnumC40111tc.A09) {
                str8 = c30o.A03(c38321qM);
            } else {
                str8 = null;
            }
            String id = c38321qM.getId();
            if (id != null) {
                EnumC76383bi A1x = c38321qM.A1x();
                C14360o3.A0B(A1x, 2);
                String id2 = c38321qM.getId();
                if (A2E != null) {
                    str9 = A2E.getId();
                } else {
                    str9 = null;
                }
                if (A2E != null) {
                    followStatus = A2E.B7L();
                }
                return new C4SH(A1x, BRp, followStatus, C30O.A00(c38321qM, c30o), null, id, null, id2, str7, str9, c38321qM.A2h(), null, null, null, c38321qM.A0C.BJN(), null, null, null, AbstractC41071vF.A0H(userSession, c38321qM.getId()), str8, null, c38321qM.A1B(), false, z, z2, c38321qM.A4g(), c38321qM.A4x());
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (this instanceof C4SU) {
            C4SU c4su = (C4SU) this;
            C41181vS c41181vS = (C41181vS) obj;
            C14360o3.A0B(c41181vS, 0);
            boolean A1Z = c41181vS.A1Z();
            boolean z3 = true;
            boolean z4 = false;
            String str10 = null;
            if (A1Z) {
                C105814ps c105814ps = c41181vS.A0d;
                c105814ps.getClass();
                String str11 = c105814ps.A00.A3t;
                A03 = c41181vS.A03();
                str4 = null;
                str10 = str11;
                str5 = null;
            } else if (c41181vS.A18() || (((c105824pt = c41181vS.A0c) != null && c105824pt.A0Z != null) || c41181vS.A0e == EnumC41231vY.A04)) {
                C105824pt c105824pt2 = c41181vS.A0c;
                if (c105824pt2 != null) {
                    str4 = c105824pt2.A0e;
                    str4.getClass();
                    str5 = c105824pt2.A0h;
                } else {
                    str4 = null;
                    str5 = null;
                }
                A03 = c41181vS.A03();
            } else if (c41181vS.A1m()) {
                A03 = c41181vS.A03();
                str5 = null;
                z3 = false;
                str4 = null;
            } else {
                C38321qM c38321qM2 = c41181vS.A0b;
                if (c38321qM2 != null) {
                    InterfaceC60442pS interfaceC60442pS2 = ((C30P) c4su).A00;
                    if (AbstractC75423a9.A02(c38321qM2, interfaceC60442pS2)) {
                        str5 = c41181vS.BzL(c4su.A0G);
                        z3 = false;
                        z4 = true;
                    } else if (AbstractC75423a9.A01(c38321qM2, interfaceC60442pS2)) {
                        str5 = c38321qM2.A0C.getOrganicTrackingToken();
                    } else {
                        if (c38321qM2.CW9()) {
                            str5 = c38321qM2.A0C.BHD();
                        } else {
                            str5 = null;
                        }
                        z3 = false;
                    }
                    str4 = c38321qM2.getId();
                    A03 = c38321qM2.A1B();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            User user = c41181vS.A0i;
            if (user != null) {
                String str12 = c41181vS.A0j;
                C14360o3.A07(str12);
                EnumC76383bi A0B = c41181vS.A0B();
                C14360o3.A07(A0B);
                String id3 = user.getId();
                FollowStatus B7L = user.B7L();
                boolean A0n = c41181vS.A0n();
                EnumC40111tc A0C = c41181vS.A0C();
                C75363a3 A0M = c41181vS.A0M(c4su.A0G);
                ReelCTAIntf A0A = c41181vS.A0A();
                if (A0A != null) {
                    str6 = C6T4.A00(A0A);
                } else {
                    str6 = null;
                }
                return new C4SH(A0B, A0C, B7L, A0M, null, str12, str10, str4, str5, id3, str6, null, null, null, null, null, null, null, null, null, c41181vS.A0M, A03, A1Z, z3, z4, A0n, c41181vS.A0t());
            }
            throw new IllegalStateException("Required value was null.");
        }
        MusicDataSource musicDataSource = (MusicDataSource) ((C678533z) this).A00.get();
        if (musicDataSource == null || (str = musicDataSource.A03) == null) {
            str = "null";
        }
        EnumC76383bi enumC76383bi = EnumC76383bi.A06;
        if (musicDataSource == null || (str2 = musicDataSource.A02) == null) {
            str2 = "57320893950";
        }
        EnumC40111tc enumC40111tc = EnumC40111tc.A07;
        if (musicDataSource != null) {
            str3 = (String) musicDataSource.A06.getValue();
        } else {
            str3 = null;
        }
        return new C4SH(enumC76383bi, enumC40111tc, null, null, null, str, null, str, str3, str2, null, null, null, null, null, null, null, null, null, null, null, 0L, false, false, false, false, false);
    }

    public Integer A08() {
        if (this instanceof C4SZ) {
            return C05F.A0N;
        }
        if (this instanceof C30O) {
            if (((C30O) this) instanceof C30N) {
                return C05F.A01;
            }
            return C05F.A05;
        }
        if (this instanceof C4SU) {
            return C05F.A0C;
        }
        return C05F.A06;
    }

    public String A09() {
        if (this instanceof C4SZ) {
            return ((C4SZ) this).A06;
        }
        if (this instanceof C4SU) {
            return ((C4SU) this).A0J;
        }
        return this.A01;
    }

    public C30P(InterfaceC60442pS interfaceC60442pS, String str) {
        this.A00 = interfaceC60442pS;
        this.A01 = str;
    }

    public String A03(C38321qM c38321qM) {
        String id = c38321qM.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
