package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.93j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045093j implements InterfaceC13000lm {
    public static final C2045193k A0B = new C2045193k(TimeUnit.MINUTES.toMillis(720), false, false, true);
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final long A03;
    public final InterfaceC41501vz A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C2045093j(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A07 = C18U.A06(c06090Tz, userSession, 36328117585919170L);
        this.A01 = C18U.A06(c06090Tz, userSession, 36316370849501486L);
        this.A02 = C18U.A06(c06090Tz, userSession, 36317925627401919L);
        this.A06 = C18U.A06(c06090Tz, userSession, 36316370850091316L);
        this.A08 = C18U.A06(c06090Tz, userSession, 36316370849960242L);
        this.A0A = C18U.A06(c06090Tz, userSession, 36316370850025779L);
        this.A05 = !C18U.A06(c06090Tz, userSession, 36325201302336374L);
        this.A03 = TimeUnit.MILLISECONDS.toSeconds(C18U.A01(c06090Tz, userSession, 36609592562685873L));
        this.A09 = AnonymousClass502.A00(userSession);
        InterfaceC42271xH interfaceC42271xH = new InterfaceC42271xH() { // from class: X.93l
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                EnumC2045493n enumC2045493n;
                C70083Cs c70083Cs = (C70083Cs) obj;
                C14360o3.A0B(c70083Cs, 0);
                C38321qM c38321qM = c70083Cs.A00.A1C;
                if (c38321qM != null) {
                    C2045093j c2045093j = C2045093j.this;
                    UserSession userSession2 = c2045093j.A00;
                    User A2E = c38321qM.A2E(userSession2);
                    if (A2E != null) {
                        String id = A2E.getId();
                        if (c2045093j.A02) {
                            enumC2045493n = EnumC2045493n.A09;
                        } else {
                            enumC2045493n = EnumC2045493n.A0B;
                        }
                        String A01 = AbstractC2044993i.A01(enumC2045493n, id);
                        C1P3 A00 = C1P2.A00(userSession2);
                        C14360o3.A0B(A01, 0);
                        return A00.A00.containsKey(A01);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                IllegalStateException illegalStateException;
                int i;
                int A03 = C0f9.A03(-1542496114);
                C70083Cs c70083Cs = (C70083Cs) obj;
                int A032 = C0f9.A03(684647060);
                C14360o3.A0B(c70083Cs, 0);
                C38321qM c38321qM = c70083Cs.A00.A1C;
                if (c38321qM != null) {
                    C2045093j c2045093j = C2045093j.this;
                    User A2E = c38321qM.A2E(c2045093j.A00);
                    if (A2E != null) {
                        c2045093j.A0A(A2E.getId());
                        C0f9.A0A(1632552961, A032);
                        C0f9.A0A(144021562, A03);
                        return;
                    }
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i = -1635528709;
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i = -949137455;
                }
                C0f9.A0A(i, A032);
                throw illegalStateException;
            }
        };
        this.A04 = interfaceC42271xH;
        AbstractC25651Mw.A00(userSession).A01(interfaceC42271xH, C70083Cs.class);
    }

    public static final void A07(C2045093j c2045093j, String str, String str2, String str3, boolean z) {
        String A00;
        UserSession userSession = c2045093j.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36327597894089431L);
        String A002 = MSV.A00(277);
        if (A06) {
            C23711Eb c23711Eb = new C23711Eb(userSession, 302881412, 1, false);
            c23711Eb.A05();
            c23711Eb.A01 = new C23751Eh(new C07510aQ(userSession), new C25611Mr(null), C2046093u.class, true, false);
            c23711Eb.A0B("users/{user_id}/info_stream/");
            c23711Eb.A0A = A002;
            c23711Eb.A0C = "user_info_stream_by_id";
            c23711Eb.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
            if (C18U.A06(c06090Tz, userSession, 36327005188339960L)) {
                c23711Eb.A9s("is_user_chuck_optimization_enabled", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            c23711Eb.A04();
            c23711Eb.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
            c23711Eb.A9s("is_prefetch", "true");
            c23711Eb.A9s(AbstractC43591JPw.A00(1101), "false");
            c23711Eb.A9s("module", str2);
            if (!AbstractC14480oK.A01(userSession.deviceSession.A06())) {
                c23711Eb.A9s("push_disabled", "true");
            }
            C24531Hw A0N = c23711Eb.A0N();
            C1IA A003 = C1I9.A00(userSession);
            String A01 = AbstractC2044993i.A01(EnumC2045493n.A0D, str);
            C14360o3.A0B(A01, 0);
            C1IA.A00(A003, C23561AcF.A00, null, null, A0N, null, A01, c2045093j.A03, c2045093j.A05, false);
            return;
        }
        String str4 = "";
        if (c2045093j.A06 && (A00 = c2045093j.A00(str)) != null) {
            str4 = A00;
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0P(null, C2045893s.class, C2046093u.class, false);
        c25621Ms.A0B(A002);
        c25621Ms.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        c25621Ms.A0G("x_RESPONSE_SHAPE_LOGGING", str4);
        c25621Ms.A0A = A002;
        c25621Ms.A08(C05F.A0Y);
        if (!z) {
            c25621Ms.A0I("is_profile_prefetch", C18U.A06(c06090Tz, userSession, 36329998780809849L));
        }
        C1ON A0N2 = c25621Ms.A0N();
        C1P3 A004 = C1P2.A00(userSession);
        String A012 = AbstractC2044993i.A01(EnumC2045493n.A0D, str);
        C14360o3.A0B(A012, 0);
        C1P3.A00(A004, C207869Hs.A00, null, null, A0N2, null, A012, c2045093j.A03, c2045093j.A05, false);
    }

    public final void A0A(String str) {
        EnumC2045493n enumC2045493n;
        C14360o3.A0B(str, 0);
        if (this.A02) {
            enumC2045493n = EnumC2045493n.A09;
        } else {
            enumC2045493n = EnumC2045493n.A0B;
        }
        String A01 = AbstractC2044993i.A01(enumC2045493n, str);
        C1P3 A00 = C1P2.A00(this.A00);
        synchronized (A00) {
            C14360o3.A0B(A01, 0);
            A00.A00.remove(A01);
        }
    }

    public final boolean A0B(C1P1 c1p1, C1GL c1gl, EnumC2045493n enumC2045493n, String str) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c1gl, 3);
        if (C1P2.A00(this.A00).A05(c1p1, c1gl, AbstractC2044993i.A01(enumC2045493n, str), TimeUnit.MINUTES.toSeconds(720L), false, true) == C05F.A0C) {
            return false;
        }
        return true;
    }

    public final boolean A0C(InterfaceC24551Hy interfaceC24551Hy, C1GL c1gl, EnumC2045493n enumC2045493n, String str) {
        C14360o3.A0B(str, 1);
        if (C1I9.A00(this.A00).A05(interfaceC24551Hy, c1gl, AbstractC2044993i.A01(enumC2045493n, str), TimeUnit.MINUTES.toSeconds(15L), false, true, false) == C05F.A0C) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (r3 == (-1)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0D(X.EnumC2045493n r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 0
            X.C14360o3.A0B(r12, r0)
            r4 = 1
            X.C14360o3.A0B(r11, r4)
            java.lang.String r5 = X.AbstractC2044993i.A01(r11, r12)
            com.instagram.common.session.UserSession r3 = r10.A00
            X.93n r0 = X.EnumC2045493n.A09
            if (r11 != r0) goto L65
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36317925627729602(0x8106f6000516c2, double:3.0309406353000646E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L65
            X.ABi r8 = X.AbstractC46581KjK.A00(r3)
            X.93k r1 = X.C2045093j.A0B
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.C14360o3.A0B(r1, r4)
            java.util.Map r0 = r8.A04
            r0.get(r5)
            java.util.Map r0 = r8.A05
            java.lang.Object r0 = r0.get(r5)
            X.2h1 r0 = (X.InterfaceC55612h1) r0
            r9 = 0
            if (r0 == 0) goto L63
            long r3 = r1.A00
            long r6 = android.os.SystemClock.uptimeMillis()
            long r0 = r0.Ajf()
            long r6 = r6 - r0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L52
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto L53
        L52:
            r2 = 1
        L53:
            java.util.Map r0 = r8.A03
            java.lang.Object r1 = r0.get(r5)
            r0 = 0
            if (r1 == 0) goto L5d
            r0 = 1
        L5d:
            if (r2 != 0) goto L61
            if (r0 == 0) goto L62
        L61:
            r9 = 1
        L62:
            return r9
        L63:
            r2 = 0
            goto L53
        L65:
            X.93n r0 = X.EnumC2045493n.A0D
            r9 = 1
            if (r11 != r0) goto L77
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327597894089431(0x810fc200053ad7, double:3.037057415493111E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L88
        L77:
            X.93n r0 = X.EnumC2045493n.A0B
            if (r11 != r0) goto L9f
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327597894154968(0x810fc200063ad8, double:3.037057415534557E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L9f
        L88:
            X.1IA r2 = X.C1I9.A00(r3)
            boolean r1 = r2.A07(r5)
            monitor-enter(r2)
            r0 = 0
            X.C14360o3.A0B(r5, r0)     // Catch: java.lang.Throwable -> Le2
            java.util.Map r0 = r2.A00     // Catch: java.lang.Throwable -> Le2
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> Le2
            monitor-exit(r2)
            if (r1 != 0) goto L62
            goto Lde
        L9f:
            X.1P3 r6 = X.C1P2.A00(r3)
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.util.Map r0 = r6.A00
            boolean r1 = r0.containsKey(r5)
            java.lang.Long r0 = r6.A07(r5)
            if (r0 == 0) goto Lda
            long r7 = r0.longValue()
            if (r1 == 0) goto Ld7
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 720(0x2d0, double:3.557E-321)
            long r1 = r2.toSeconds(r0)
        Lc1:
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L62
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r0.toMillis(r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto Lda
            return r9
        Ld7:
            long r1 = r10.A03
            goto Lc1
        Lda:
            boolean r0 = r6.A09(r5)
        Lde:
            if (r0 != 0) goto L62
            r9 = 0
            return r9
        Le2:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2045093j.A0D(X.93n, java.lang.String):boolean");
    }

    private final String A00(String str) {
        C40701ud A01 = AbstractC40691uc.A01(this.A00);
        C55684Oo9 A00 = AbstractC54111Nw9.A00();
        A00.A00(str);
        C1Dk A002 = A00.A00();
        C14360o3.A07(A002);
        boolean z = this.A06;
        if (z) {
            A002.addAdditionalHttpHeader("x_RESPONSE_SHAPE_LOGGING", String.valueOf(A002.hashCode()));
        }
        boolean z2 = this.A08;
        if (z2) {
            A002.setEnsureCacheWrite(true);
            A002.setNetworkTimeoutSeconds(4);
        } else if (this.A0A) {
            A002.setCacheFallbackByDuration_EXPERIMENTAL(4000L);
        }
        A002.addTrackedHttpResponseHeader("X-IG-Request-Elapsed-Time-MS");
        A06(AnonymousClass963.A00(A01.A03(A002)), this, str, z2);
        if (z) {
            return String.valueOf(A002.hashCode());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r7.A01 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r2, 36329092542840848L) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r2, 36329092542447626L) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r0 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r5 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r6, X.C2045093j r7, X.EnumC2045493n r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            com.instagram.common.session.UserSession r2 = r7.A00
            java.lang.String r0 = r2.userId
            boolean r5 = X.C14360o3.A0K(r0, r9)
            if (r8 != 0) goto L71
            boolean r0 = r7.A02
            if (r0 == 0) goto L40
            X.500 r0 = new X.500
            r0.<init>(r9)
            r7.A02(r6, r0)
        L16:
            if (r5 == 0) goto L38
        L18:
            if (r11 == 0) goto L38
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36329092542775311(0x81111e0006400f, double:3.0380026373405286E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 != 0) goto L2a
            r7.A04(r6, r9)
        L2a:
            r0 = 36329092542906385(0x81111e00084011, double:3.0380026374234204E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 != 0) goto L38
            r7.A08(r9)
        L38:
            boolean r0 = r7.A01
            if (r0 == 0) goto L82
        L3c:
            r7.A00(r9)
        L3f:
            return
        L40:
            if (r5 == 0) goto L68
            if (r11 == 0) goto L52
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36329092542840848(0x81111e00074010, double:3.0380026373819745E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            r4 = 1
            if (r0 != 0) goto L53
        L52:
            r4 = 0
        L53:
            if (r10 == 0) goto L63
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36329092542447626(0x81111e0001400a, double:3.0380026371332993E-306)
            boolean r1 = X.C18U.A06(r3, r2, r0)
            r0 = 1
            if (r1 != 0) goto L64
        L63:
            r0 = 0
        L64:
            if (r4 != 0) goto L18
            if (r0 != 0) goto L18
        L68:
            X.500 r0 = new X.500
            r0.<init>(r9)
            r7.A03(r6, r0)
            goto L16
        L71:
            int r0 = r8.ordinal()
            switch(r0) {
                case 0: goto L94;
                case 1: goto L87;
                case 2: goto L7e;
                case 3: goto L79;
                case 4: goto La5;
                case 5: goto La1;
                default: goto L78;
            }
        L78:
            return
        L79:
            boolean r0 = r7.A01
            if (r0 == 0) goto L3f
            goto L3c
        L7e:
            boolean r0 = r7.A01
            if (r0 != 0) goto L3f
        L82:
            r0 = 0
            A07(r7, r9, r0, r0, r10)
            return
        L87:
            boolean r0 = r7.A02
            if (r0 == 0) goto L3f
            X.500 r0 = new X.500
            r0.<init>(r9)
            r7.A02(r6, r0)
            return
        L94:
            boolean r0 = r7.A02
            if (r0 != 0) goto L3f
            X.500 r0 = new X.500
            r0.<init>(r9)
            r7.A03(r6, r0)
            return
        La1:
            r7.A08(r9)
            return
        La5:
            r7.A04(r6, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2045093j.A01(android.content.Context, X.93j, X.93n, java.lang.String, boolean, boolean):void");
    }

    private final void A02(Context context, AnonymousClass500 anonymousClass500) {
        Integer num;
        Throwable illegalStateException;
        String str = anonymousClass500.A00;
        UserSession userSession = this.A00;
        boolean A0K = C14360o3.A0K(userSession.userId, str);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36317925628057286L)) {
            num = C05F.A0N;
        } else {
            num = C05F.A0C;
        }
        C1Dk A012 = C93o.A01(userSession, num, str, null, null, null, false, false, false, false, false, false, this.A09, false, false);
        C1ON A00 = AnonymousClass963.A00(A01.A03(A012));
        N9L n9l = new N9L(new C2045693q(context, this, A0K), this);
        C2045693q c2045693q = new C2045693q(context, this, A0K);
        if (C18U.A06(c06090Tz, userSession, 36317925627729602L)) {
            C22983ABi A002 = AbstractC46581KjK.A00(userSession);
            String A013 = AbstractC2044993i.A01(EnumC2045493n.A09, str);
            C55810OqL c55810OqL = new C55810OqL(c2045693q, this);
            C2045193k c2045193k = A0B;
            C57748Pjb c57748Pjb = new C57748Pjb(this, 20);
            C14360o3.A0B(A013, 0);
            C14360o3.A0B(c2045193k, 4);
            C23553Ac7 c23553Ac7 = new C23553Ac7(c55810OqL, A002, c2045693q, A013, c57748Pjb);
            if (A012.getMaxToleratedCacheAgeMs() <= 0 && !A012.getEnsureCacheWrite()) {
                illegalStateException = new IllegalArgumentException("Prefetch Request must be cacheable.");
            } else if (A002.A00.A00(EnumC23071Am.A0G)) {
                illegalStateException = new IllegalStateException("Prefetch cannot run during peak hours");
            } else {
                A002.A00(A012, c55810OqL, c2045193k, c2045693q, A013, c57748Pjb);
                return;
            }
            c23553Ac7.onFailure(illegalStateException);
            return;
        }
        A05(n9l, A00, EnumC2045493n.A09, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        if (X.C18U.A06(r4, r6, 36329998780482164L) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03(android.content.Context r26, X.AnonymousClass500 r27) {
        /*
            r25 = this;
            r0 = r25
            com.instagram.common.session.UserSession r6 = r0.A00
            X.0Tz r4 = X.C06090Tz.A05
            r1 = 36327597894154968(0x810fc200063ad8, double:3.037057415534557E-306)
            boolean r3 = X.C18U.A06(r4, r6, r1)
            r8 = r27
            java.lang.String r1 = r8.A00
            java.lang.String r2 = r6.userId
            boolean r5 = X.C14360o3.A0K(r2, r1)
            if (r3 == 0) goto L6a
            if (r5 == 0) goto L64
            r2 = 36329998780744312(0x8111f100044278, double:3.038575745881252E-306)
        L22:
            boolean r2 = X.C18U.A06(r4, r6, r2)
            r16 = 0
            if (r2 == 0) goto L2c
            r16 = 1
        L2c:
            r7 = 0
            java.lang.Integer r2 = X.C05F.A01
            X.1ET r5 = new X.1ET
            r5.<init>(r2)
            r12 = 1
            r13 = 0
            r9 = r7
            r10 = r7
            r11 = r7
            r14 = r13
            r15 = r12
            X.1Hw r18 = X.AnonymousClass748.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1IA r14 = X.C1I9.A00(r6)
            X.93n r2 = X.EnumC2045493n.A0B
            java.lang.String r3 = X.AbstractC2044993i.A01(r2, r1)
            X.C14360o3.A0B(r3, r13)
            X.AcF r15 = X.C23561AcF.A00
            long r1 = r0.A03
            boolean r0 = r0.A05
            r16 = r7
            r17 = r7
            r19 = r7
            r20 = r3
            r21 = r1
            r23 = r0
            r24 = r13
            X.C1IA.A00(r14, r15, r16, r17, r18, r19, r20, r21, r23, r24)
            return
        L64:
            r2 = 36329998780678775(0x8111f100034277, double:3.0385757458398064E-306)
            goto L22
        L6a:
            r2 = 36324673025159546(0x810d19003f317a, double:3.03520771660435E-306)
            boolean r2 = X.C18U.A06(r4, r6, r2)
            if (r2 != 0) goto L81
            r2 = 36329998780482164(0x8111f100004274, double:3.038575745715469E-306)
            boolean r2 = X.C18U.A06(r4, r6, r2)
            r15 = 0
            if (r2 == 0) goto L82
        L81:
            r15 = 1
        L82:
            r7 = 0
            boolean r14 = r0.A09
            r12 = 1
            r13 = 0
            r9 = r7
            r10 = r7
            r11 = r7
            r16 = r13
            X.1ON r4 = X.AnonymousClass748.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.93q r3 = new X.93q
            r2 = r26
            r3.<init>(r2, r0, r5)
            X.93n r2 = X.EnumC2045493n.A0B
            r0.A05(r3, r4, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2045093j.A03(android.content.Context, X.500):void");
    }

    private final void A04(Context context, String str) {
        UserSession userSession = this.A00;
        C98934cD A05 = AbstractC1571873x.A05(context, userSession, null, null, null, C05F.A0Y, null, str, true);
        C1P3 A00 = C1P2.A00(userSession);
        String A01 = AbstractC2044993i.A01(EnumC2045493n.A0C, str);
        C14360o3.A0B(A01, 0);
        C207869Hs c207869Hs = C207869Hs.A00;
        C1ON c1on = A05.A00;
        C14360o3.A0B(c1on, 0);
        C1P3.A00(A00, c207869Hs, null, null, c1on, null, A01, this.A03, this.A05, false);
    }

    private final void A05(C1P1 c1p1, C1ON c1on, EnumC2045493n enumC2045493n, String str) {
        C1P3 A00 = C1P2.A00(this.A00);
        String A01 = AbstractC2044993i.A01(enumC2045493n, str);
        C14360o3.A0B(A01, 0);
        C1P3.A00(A00, C207869Hs.A00, null, c1p1, c1on, null, A01, this.A03, this.A05, false);
    }

    public static final void A06(C1ON c1on, final C2045093j c2045093j, final String str, final boolean z) {
        C1P3 A00 = C1P2.A00(c2045093j.A00);
        String A01 = AbstractC2044993i.A01(EnumC2045493n.A0A, str);
        C14360o3.A0B(A01, 0);
        C1P3.A00(A00, C207869Hs.A00, null, new C1P1(c2045093j) { // from class: X.9gC
            public final /* synthetic */ C2045093j A00;

            {
                this.A00 = c2045093j;
            }

            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(-20905212);
                if (z) {
                    C2045093j c2045093j2 = this.A00;
                    String str2 = str;
                    C55684Oo9 A002 = AbstractC54111Nw9.A00();
                    UserSession userSession = c2045093j2.A00;
                    A002.A00(userSession.userId);
                    C1Dk A003 = A002.A00();
                    A003.setFreshCacheAgeMs(1036800000L);
                    A003.setNetworkTimeoutSeconds(0);
                    C2045093j.A06(AnonymousClass963.A00(AbstractC40691uc.A01(userSession).A03(A003)), c2045093j2, str2, false);
                }
                C0f9.A0A(1654346714, A03);
            }
        }, c1on, null, A01, c2045093j.A03, c2045093j.A05, false);
    }

    private final void A08(String str) {
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36328117586050243L)) {
            C1ON A00 = C1OU.A00(userSession, str);
            C14360o3.A07(A00);
            C1P3 A002 = C1P2.A00(userSession);
            String A01 = AbstractC2044993i.A01(EnumC2045493n.A0E, str);
            C14360o3.A0B(A01, 0);
            C1P3.A00(A002, C207869Hs.A00, null, null, A00, null, A01, this.A03, this.A05, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36323822617636474L) != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(android.content.Context r22, java.lang.String r23, boolean r24, boolean r25) {
        /*
            r21 = this;
            r13 = r25
            r5 = 0
            r8 = r22
            X.C14360o3.A0B(r8, r5)
            r2 = 1
            r11 = r23
            X.C14360o3.A0B(r11, r2)
            r9 = r21
            boolean r0 = r9.A07
            r12 = r24
            if (r0 == 0) goto L59
            boolean r6 = r9.A02
            boolean r4 = r9.A01
            java.util.HashSet r0 = X.AbstractC2045393m.A00(r6, r4)
            java.util.Iterator r7 = r0.iterator()
        L22:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r10 = r7.next()
            X.93n r10 = (X.EnumC2045493n) r10
            r3 = 1
            if (r10 == 0) goto L3d
            boolean r0 = r9.A0D(r10, r11)
            r3 = r0 ^ 1
        L37:
            if (r3 == 0) goto L22
            A01(r8, r9, r10, r11, r12, r13)
            goto L22
        L3d:
            java.util.HashSet r0 = X.AbstractC2045393m.A00(r6, r4)
            java.util.Iterator r1 = r0.iterator()
        L45:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r1.next()
            X.93n r0 = (X.EnumC2045493n) r0
            boolean r0 = r9.A0D(r0, r11)
            if (r0 == 0) goto L45
            r3 = 0
            goto L45
        L59:
            r10 = 0
            r3 = 1
            boolean r1 = r9.A02
            boolean r0 = r9.A01
            java.util.HashSet r0 = X.AbstractC2045393m.A00(r1, r0)
            java.util.Iterator r1 = r0.iterator()
        L67:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r1.next()
            X.93n r0 = (X.EnumC2045493n) r0
            boolean r0 = r9.A0D(r0, r11)
            if (r0 == 0) goto L67
            r3 = 0
            goto L67
        L7b:
            if (r3 == 0) goto L80
            A01(r8, r9, r10, r11, r12, r13)
        L80:
            com.instagram.common.session.UserSession r4 = r9.A00
            java.lang.String r0 = r4.userId
            boolean r1 = X.C14360o3.A0K(r0, r11)
            X.0sy r0 = X.C08730cb.A00(r4)
            com.instagram.user.model.User r6 = r0.A00()
            boolean r0 = r6.A2I()
            if (r1 == 0) goto Ldc
            if (r0 != 0) goto Lb7
            java.lang.Integer r3 = r6.A0M()
            java.lang.Integer r0 = X.C05F.A0C
            r1 = 0
            if (r3 != r0) goto La2
            r1 = 1
        La2:
            boolean r0 = r6.A2I()
            if (r1 != 0) goto Ldc
            if (r0 != 0) goto Ldc
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36323822617636474(0x810c5300022e7a, double:3.034669915462443E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 == 0) goto Ldc
        Lb7:
            java.lang.String r0 = "{\"is_badged\":"
            r3 = 125(0x7d, float:1.75E-43)
            java.lang.String r1 = X.AnonymousClass001.A0L(r0, r3, r5)
            java.lang.String r0 = "{\"server_params\":"
            java.lang.String r1 = X.AnonymousClass001.A0S(r0, r1, r3)
            java.lang.String r0 = "params"
            java.util.HashMap r18 = X.AbstractC167017dG.A0r(r0, r1)
            long r19 = X.C9JC.A00()
            X.8eZ r15 = new X.8eZ
            r15.<init>(r4)
            java.lang.String r16 = "com.bloks.www.ig.pro_dash.entry_point.hypercard"
            r17 = 0
            r14 = r8
            X.AbstractC191798eb.A03(r14, r15, r16, r17, r18, r19)
        Ldc:
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36330664500413397(0x81128c000043d5, double:3.0389967496806196E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 != 0) goto Lf2
            r0 = 2342168210515833715(0x20810d9400023373, double:4.069996143237822E-152)
            boolean r13 = X.C18U.A06(r3, r4, r0)
        Lf2:
            if (r13 == 0) goto L106
            X.0sy r0 = X.C08730cb.A00(r4)
            com.instagram.user.model.User r3 = r0.A00()
            X.93y r1 = new X.93y
            r1.<init>()
            java.lang.String r0 = ""
            X.AbstractC2046593z.A00(r1, r4, r3, r0, r2)
        L106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2045093j.A09(android.content.Context, java.lang.String, boolean, boolean):void");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC25651Mw.A00(this.A00).A02(this.A04, C70083Cs.class);
    }
}
