package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Od7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55146Od7 {
    public boolean A00;
    public final UserSession A01;
    public final ShareType A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C55146Od7(UserSession userSession, ShareType shareType, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(shareType, 2);
        this.A01 = userSession;
        this.A02 = shareType;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A03 = z4;
    }

    public static final boolean A02(C55146Od7 c55146Od7, ShareType shareType, int i) {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        if (i <= 0) {
            return false;
        }
        if (shareType == ShareType.A08) {
            if (i < 480) {
                userSession = c55146Od7.A01;
                c06090Tz = C06090Tz.A05;
                j = 36328607211470512L;
            } else if (i < 720) {
                userSession = c55146Od7.A01;
                c06090Tz = C06090Tz.A05;
                j = 36328607211536049L;
            } else {
                if (i >= 1080) {
                    return false;
                }
                userSession = c55146Od7.A01;
                c06090Tz = C06090Tz.A05;
                j = 36328607211339438L;
            }
        } else {
            if (shareType != ShareType.A0V && (shareType != ShareType.A0W || !c55146Od7.A03)) {
                return false;
            }
            if (i < 480) {
                userSession = c55146Od7.A01;
                c06090Tz = C06090Tz.A05;
                j = 36328607211273901L;
            } else if (i < 720) {
                userSession = c55146Od7.A01;
                c06090Tz = C06090Tz.A05;
                j = 36328607211404975L;
            } else {
                if (i >= 1080) {
                    return false;
                }
                userSession = c55146Od7.A01;
                c06090Tz = C06090Tz.A05;
                j = 36328607211601586L;
            }
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r2 == 4) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C70125W5g r5) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r4.A00()
            boolean r0 = r4.A00()
            if (r0 == 0) goto L36
            X.WDI r3 = r5.A02
            if (r3 == 0) goto L31
            boolean r0 = r4.A01()
            if (r0 == 0) goto L31
            com.instagram.pendingmedia.model.constants.ShareType r1 = r4.A02
            X.Nq7 r0 = X.AbstractC53755Nq7.$redex_init_class
            int r2 = r1.ordinal()
            r0 = 9
            if (r2 == r0) goto L32
            r0 = 2
            if (r2 == r0) goto L2a
            r1 = 4
            r0 = -1
            if (r2 != r1) goto L2d
        L2a:
            r0 = 5000000(0x4c4b40, float:7.006492E-39)
        L2d:
            r3.A01 = r0
            r3.A04 = r0
        L31:
            return
        L32:
            r0 = 6000000(0x5b8d80, float:8.407791E-39)
            goto L2d
        L36:
            boolean r0 = r4.A04()
            if (r0 == 0) goto L31
            com.instagram.pendingmedia.model.constants.ShareType r1 = r4.A02
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0W
            if (r1 == r0) goto L31
            X.WDI r3 = r5.A02
            if (r3 == 0) goto L4a
            r0 = 9000000(0x895440, float:1.2611686E-38)
            goto L2d
        L4a:
            java.lang.String r1 = "ig_media_transcode_param"
            java.lang.String r0 = "null transcode param"
            X.C0w9.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55146Od7.A03(X.W5g):void");
    }

    public final boolean A09(C47Z c47z) {
        UserSession userSession = this.A01;
        String A03 = C50702MZx.A03(userSession, c47z, null, true);
        if (C14360o3.A0K(A03, "direct_permanent") || C14360o3.A0K(A03, "direct_ephemeral")) {
            return C18U.A06(C06090Tz.A05, userSession, 36320524082750089L);
        }
        return false;
    }

    public final boolean A04() {
        boolean z = this.A06;
        if (z) {
            UserSession userSession = this.A01;
            if (C18U.A06(C06090Tz.A05, userSession, 36320240614776992L)) {
                return AbstractC23021Ah.A00(userSession).A20();
            }
        }
        UserSession userSession2 = this.A01;
        if (!z) {
            if (!AbstractC23021Ah.A00(userSession2).A20()) {
                return false;
            }
            ShareType shareType = this.A02;
            AbstractC53755Nq7 abstractC53755Nq7 = AbstractC53755Nq7.$redex_init_class;
            switch (shareType.ordinal()) {
                case 0:
                case 2:
                case 7:
                case 9:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    return true;
                case 1:
                case 3:
                case 5:
                case 6:
                case 8:
                case 10:
                case 11:
                default:
                    return false;
                case 4:
                    if (!this.A03 || !C18U.A06(C06090Tz.A05, userSession2, 36316087381790673L)) {
                        return false;
                    }
                    return true;
            }
        }
        InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession2);
        A0e.E7D("high_quality_media_upload", 0);
        A0e.apply();
        return false;
    }

    public final boolean A07() {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        ShareType shareType = this.A02;
        AbstractC53755Nq7 abstractC53755Nq7 = AbstractC53755Nq7.$redex_init_class;
        int ordinal = shareType.ordinal();
        if (ordinal != 1 && ordinal != 3) {
            userSession = this.A01;
            c06090Tz = C06090Tz.A05;
            j = 36320524082619015L;
        } else {
            userSession = this.A01;
            c06090Tz = C06090Tz.A05;
            j = 36320524082684552L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    private final boolean A00() {
        if (!A04() && !A08()) {
            int A01 = (int) C1BU.A00().A01();
            if (A01 < 0) {
                C0w9.A03("download_bw_reading_err", AnonymousClass001.A0O("value ", A01));
            } else {
                ShareType shareType = this.A02;
                AbstractC53755Nq7 abstractC53755Nq7 = AbstractC53755Nq7.$redex_init_class;
                if (shareType.ordinal() == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r2 == 4) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A01() {
        /*
            r4 = this;
            X.1BU r0 = X.C1BU.A00()
            double r0 = r0.A01()
            int r3 = (int) r0
            com.instagram.pendingmedia.model.constants.ShareType r1 = r4.A02
            X.Nq7 r0 = X.AbstractC53755Nq7.$redex_init_class
            int r2 = r1.ordinal()
            r0 = 9
            if (r2 == r0) goto L1e
            r0 = 2
            if (r2 == r0) goto L1e
            r1 = 4
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L20
        L1e:
            r0 = 1250(0x4e2, float:1.752E-42)
        L20:
            boolean r0 = X.AbstractC43593JPy.A1Z(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55146Od7.A01():boolean");
    }

    public final boolean A05() {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        if (A04()) {
            ShareType shareType = this.A02;
            AbstractC53755Nq7 abstractC53755Nq7 = AbstractC53755Nq7.$redex_init_class;
            int ordinal = shareType.ordinal();
            if (ordinal != 9) {
                if (ordinal == 4) {
                    userSession = this.A01;
                    c06090Tz = C06090Tz.A05;
                    j = 36316087381790673L;
                } else {
                    return false;
                }
            } else {
                if (this.A00) {
                    if (shareType == ShareType.A08 && A04()) {
                        if (!C18U.A06(C06090Tz.A05, this.A01, 36328607211077290L)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                userSession = this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36316087381725136L;
            }
            if (C18U.A06(c06090Tz, userSession, j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A06() {
        C17280tP A0y = AbstractC166987dD.A0y();
        if (!AbstractC167017dG.A1b(A0y, A0y.A0v, C17280tP.A4G, 180) && (!A04() || this.A02 == ShareType.A0W)) {
            if (A00() && A01()) {
                ShareType shareType = this.A02;
                AbstractC53755Nq7 abstractC53755Nq7 = AbstractC53755Nq7.$redex_init_class;
                if (shareType.ordinal() != 9) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final boolean A08() {
        if (A04() && !A05()) {
            A05();
        } else if (!this.A05) {
            if (!this.A06) {
                ShareType shareType = this.A02;
                AbstractC53755Nq7 abstractC53755Nq7 = AbstractC53755Nq7.$redex_init_class;
                int ordinal = shareType.ordinal();
                if (ordinal == 9 || ordinal == 2 || ordinal == 4 || ordinal == 1 || ordinal == 3 || this.A04) {
                }
            }
            return true;
        }
        return false;
    }
}
