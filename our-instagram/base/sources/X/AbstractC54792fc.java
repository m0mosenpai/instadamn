package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC54792fc {
    public static final String A00(AbstractC12990ll abstractC12990ll, int i) {
        C06090Tz c06090Tz;
        long j;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                c06090Tz = C06090Tz.A05;
                j = 36878487579656382L;
            } else {
                c06090Tz = C06090Tz.A05;
                j = 36878487579590845L;
            }
        } else {
            c06090Tz = C06090Tz.A05;
            j = 36878487579525308L;
        }
        String A04 = C18U.A04(c06090Tz, abstractC12990ll, j);
        if (A09(abstractC12990ll, A04)) {
            C0w9.A03("Nav3", AnonymousClass001.A0R("Duplicate header icon already used as tab: ", A04));
            return null;
        }
        return A04;
    }

    public static final boolean A08(AbstractC12990ll abstractC12990ll, String str) {
        Iterable c17u = new C17u(0, 2);
        if (!(c17u instanceof Collection) || !((Collection) c17u).isEmpty()) {
            Iterator it = c17u.iterator();
            while (it.hasNext()) {
                if (str.equals(A00(abstractC12990ll, ((AbstractC16880sg) it).A00()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A09(AbstractC12990ll abstractC12990ll, String str) {
        Iterable c17u = new C17u(0, 4);
        if (!(c17u instanceof Collection) || !((Collection) c17u).isEmpty()) {
            Iterator it = c17u.iterator();
            while (it.hasNext()) {
                if (str.equals(A01(abstractC12990ll, ((AbstractC16880sg) it).A00()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String A01(AbstractC12990ll abstractC12990ll, int i) {
        C06090Tz c06090Tz;
        long j;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        c06090Tz = C06090Tz.A05;
                        j = 36878487579263163L;
                    } else {
                        c06090Tz = C06090Tz.A05;
                        j = 36878487579197626L;
                    }
                } else {
                    c06090Tz = C06090Tz.A05;
                    j = 36878487579132089L;
                }
            } else {
                c06090Tz = C06090Tz.A05;
                j = 36878487579066552L;
            }
        } else {
            c06090Tz = C06090Tz.A05;
            j = 36878487579001015L;
        }
        return C18U.A04(c06090Tz, abstractC12990ll, j);
    }

    public static final boolean A07(AbstractC12990ll abstractC12990ll) {
        if (abstractC12990ll != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, abstractC12990ll, 36315537626828155L);
            if (Boolean.valueOf(A06) != null) {
                return A06;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(X.AbstractC12990ll r6) {
        /*
            java.lang.Boolean r0 = X.AbstractC54782fb.A00(r6)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L11
            java.lang.String r0 = "news"
            boolean r0 = A08(r6, r0)
            return r0
        L11:
            boolean r0 = A05(r6)
            if (r0 == 0) goto Lb9
            java.lang.Boolean r0 = X.AbstractC54782fb.A00(r6)
            boolean r0 = r0.booleanValue()
            r5 = 0
            if (r0 != 0) goto Lb9
            X.0qx r1 = X.C16030qx.A02
            android.content.Context r0 = X.AbstractC12290kX.A00
            java.lang.String r0 = r1.A04(r0)
            if (r0 == 0) goto L9e
            int r0 = r0.length()
            if (r0 == 0) goto L9e
            X.0vz r4 = X.AbstractC12960li.A00
            X.0y2 r0 = X.AbstractC19730y1.A00(r4)
            X.0xq r0 = r0.A00
            java.lang.String r3 = "session_based_client_config_success_fetched"
            boolean r0 = r0.getBoolean(r3, r5)
            if (r0 != 0) goto L7f
            java.lang.Boolean r0 = X.F8B.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7f
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 18301027447278827(0x4104b000050ceb, double:1.8933498958212713E-307)
            boolean r0 = X.C1AD.A06(r2, r0)
            if (r0 == 0) goto L7f
            r0 = 18301027447147753(0x4104b000030ce9, double:1.893349895769464E-307)
            boolean r0 = X.C1AD.A06(r2, r0)
            if (r0 == 0) goto L79
            r0 = 18301027447016680(0x4104b000010ce8, double:1.893349895717657E-307)
        L69:
            boolean r0 = X.C1AD.A06(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L71:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L90
        L77:
            r0 = 1
            return r0
        L79:
            r0 = 18301057511722235(0x4104b700000cfb, double:1.8933617788681907E-307)
            goto L69
        L7f:
            X.0y2 r0 = X.AbstractC19730y1.A00(r4)
            X.0xq r0 = r0.A00
            boolean r0 = r0.getBoolean(r3, r5)
            if (r0 != 0) goto L90
            java.lang.Boolean r0 = X.F8B.A00()
            goto L71
        L90:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36311285608022503(0x8100ec000101e7, double:3.026741460100082E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto Lb9
            goto L77
        L9e:
            java.lang.Boolean r0 = X.F8B.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb9
            X.0vz r0 = X.AbstractC12960li.A00
            X.0y2 r0 = X.AbstractC19730y1.A00(r0)
            X.0xq r1 = r0.A00
            java.lang.String r0 = "session_based_client_config_success_fetched"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 != 0) goto Lb9
            goto L77
        Lb9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54792fc.A02(X.0ll):boolean");
    }

    public static final boolean A03(AbstractC12990ll abstractC12990ll) {
        if (AbstractC54782fb.A00(abstractC12990ll).booleanValue()) {
            return A08(abstractC12990ll, "share");
        }
        if (A05(abstractC12990ll)) {
            if (AbstractC54782fb.A00(abstractC12990ll).booleanValue()) {
                if (!A09(abstractC12990ll, "share")) {
                    return true;
                }
                return false;
            }
            if (A06(abstractC12990ll)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A04(AbstractC12990ll abstractC12990ll) {
        if (AbstractC54782fb.A00(abstractC12990ll).booleanValue()) {
            return A09(abstractC12990ll, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
    
        if (r1.booleanValue() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A05(X.AbstractC12990ll r7) {
        /*
            java.lang.Boolean r0 = X.AbstractC54782fb.A00(r7)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4e
            X.0qx r1 = X.C16030qx.A02
            android.content.Context r0 = X.AbstractC12290kX.A00
            java.lang.String r0 = r1.A04(r0)
            if (r0 == 0) goto L1b
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L1c
        L1b:
            r1 = 1
        L1c:
            java.lang.String r0 = "activity_and_creation_in_header"
            if (r1 == 0) goto L50
            X.0vz r1 = X.AbstractC12960li.A00
            X.0y2 r1 = X.AbstractC19730y1.A00(r1)
            X.0xq r3 = r1.A00
            java.lang.String r2 = "session_based_client_config_success_fetched"
            r1 = 0
            boolean r1 = r3.getBoolean(r2, r1)
            if (r1 != 0) goto L50
            java.lang.Boolean r1 = X.F8B.A00()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L45
            java.lang.Boolean r1 = X.F8A.A00()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L50
        L45:
            java.lang.String r1 = "none"
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 == 0) goto L4f
        L4e:
            r0 = 0
        L4f:
            return r0
        L50:
            X.0vz r6 = X.AbstractC12960li.A00
            X.0y2 r1 = X.AbstractC19730y1.A00(r6)
            X.0xq r1 = r1.A00
            java.lang.String r5 = "session_based_client_config_success_fetched"
            r4 = 0
            boolean r1 = r1.getBoolean(r5, r4)
            if (r1 != 0) goto La7
            java.lang.Boolean r1 = X.F8A.A00()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L75
            java.lang.Boolean r1 = X.F8B.A00()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto La7
        L75:
            X.0Tz r3 = X.C06090Tz.A05
            r1 = 18301027447278827(0x4104b000050ceb, double:1.8933498958212713E-307)
            boolean r1 = X.C1AD.A06(r3, r1)
            if (r1 == 0) goto La7
            r1 = 18301027447147753(0x4104b000030ce9, double:1.893349895769464E-307)
            boolean r1 = X.C1AD.A06(r3, r1)
            if (r1 == 0) goto La1
            r1 = 18301027447016680(0x4104b000010ce8, double:1.893349895717657E-307)
        L92:
            boolean r1 = X.C1AD.A06(r3, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L9a:
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc2
            goto L45
        La1:
            r1 = 18301057511722235(0x4104b700000cfb, double:1.8933617788681907E-307)
            goto L92
        La7:
            X.0y2 r1 = X.AbstractC19730y1.A00(r6)
            X.0xq r1 = r1.A00
            boolean r1 = r1.getBoolean(r5, r4)
            if (r1 != 0) goto Lc2
            java.lang.Boolean r1 = X.F8A.A00()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L45
            java.lang.Boolean r1 = X.F8B.A00()
            goto L9a
        Lc2:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36874235561377819(0x8300ec0000001b, double:3.382753277419498E-306)
            java.lang.String r0 = X.C18U.A04(r2, r7, r0)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54792fc.A05(X.0ll):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A06(X.AbstractC12990ll r7) {
        /*
            java.lang.Boolean r0 = X.AbstractC54782fb.A00(r7)
            boolean r0 = r0.booleanValue()
            java.lang.String r5 = "enabled"
            java.lang.String r4 = "disabled"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L37
            java.lang.String r0 = "clips"
            boolean r2 = A09(r7, r0)
            if (r2 != 0) goto L19
            r5 = r4
        L19:
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            java.lang.String r4 = "Nav3Enabled, reel table %s"
        L1f:
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L36
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
        L2a:
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = java.lang.String.format(r4, r0)
            X.C14360o3.A07(r0)
        L36:
            return r2
        L37:
            X.0qx r1 = X.C16030qx.A02
            android.content.Context r0 = X.AbstractC12290kX.A00
            java.lang.String r0 = r1.A04(r0)
            if (r0 == 0) goto Ld9
            int r0 = r0.length()
            if (r0 == 0) goto Ld9
            X.0vz r6 = X.AbstractC12960li.A00
            X.0y2 r0 = X.AbstractC19730y1.A00(r6)
            X.0xq r0 = r0.A00
            java.lang.String r5 = "session_based_client_config_success_fetched"
            boolean r0 = r0.getBoolean(r5, r3)
            if (r0 != 0) goto La3
            java.lang.Boolean r0 = X.F8A.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La3
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 18301027447278827(0x4104b000050ceb, double:1.8933498958212713E-307)
            boolean r0 = X.C1AD.A06(r4, r0)
            if (r0 == 0) goto La3
            r0 = 18301027447147753(0x4104b000030ce9, double:1.893349895769464E-307)
            boolean r0 = X.C1AD.A06(r4, r0)
            if (r0 == 0) goto L93
            r0 = 18301027447016680(0x4104b000010ce8, double:1.893349895717657E-307)
            boolean r0 = X.C1AD.A06(r4, r0)
            if (r0 == 0) goto Lbe
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = "3rd place"
        L88:
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L36
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            goto L2a
        L93:
            r0 = 18301057511722235(0x4104b700000cfb, double:1.8933617788681907E-307)
            boolean r0 = X.C1AD.A06(r4, r0)
            if (r0 == 0) goto Lbe
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = "4rd place"
            goto L88
        La3:
            X.0y2 r0 = X.AbstractC19730y1.A00(r6)
            X.0xq r0 = r0.A00
            boolean r0 = r0.getBoolean(r5, r3)
            if (r0 != 0) goto Lbe
            java.lang.Boolean r0 = X.F8A.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbe
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = "5rd place"
            goto L88
        Lbe:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36311285608088040(0x8100ec000201e8, double:3.026741460141528E-306)
            boolean r2 = X.C18U.A06(r2, r7, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r4 = "final place, isEnabledFromPanoramaV2: %s, isEnabledFromVideoTab: %s"
            goto L1f
        Ld9:
            java.lang.Boolean r0 = X.F8A.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf3
            X.0vz r0 = X.AbstractC12960li.A00
            X.0y2 r0 = X.AbstractC19730y1.A00(r0)
            X.0xq r1 = r0.A00
            java.lang.String r0 = "session_based_client_config_success_fetched"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto Lf5
        Lf3:
            r2 = 0
            r5 = r4
        Lf5:
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            java.lang.String r4 = "device id is null, reel table %s"
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54792fc.A06(X.0ll):boolean");
    }
}
