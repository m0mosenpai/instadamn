package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.09i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C023409i {
    public static String A09 = "NotInitiated";
    public static final C09Y A0A = new Object();
    public C023309h A00;
    public final C18720vz A01;
    public final AnonymousClass088 A02;
    public final C17110t6 A03;
    public final C17090t4 A04;
    public final C03390Gq A05;
    public final C19740y2 A06;
    public final C17120t7 A07;
    public volatile C07270a1 A08;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        if (r6 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.0sz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C023409i(X.C18720vz r13, X.C17090t4 r14, X.C221715s r15) {
        /*
            r12 = this;
            r7 = 1
            X.C14360o3.A0B(r13, r7)
            r0 = 3
            X.C14360o3.A0B(r15, r0)
            r12.<init>()
            r12.A01 = r13
            r12.A04 = r14
            X.0y2 r0 = X.AbstractC19730y1.A00(r13)
            r12.A06 = r0
            X.0AB r1 = new X.0AB
            r1.<init>(r13)
            java.lang.Class<X.088> r0 = X.AnonymousClass088.class
            java.lang.Object r9 = r13.A01(r0, r1)
            X.088 r9 = (X.AnonymousClass088) r9
            r12.A02 = r9
            X.0A1 r1 = new X.0A1
            r1.<init>(r13)
            java.lang.Class<X.0t6> r0 = X.C17110t6.class
            java.lang.Object r3 = r13.A01(r0, r1)
            X.0t6 r3 = (X.C17110t6) r3
            r12.A03 = r3
            X.01W r1 = X.C01W.A00
            java.lang.Class<X.0t7> r0 = X.C17120t7.class
            java.lang.Object r2 = r13.A01(r0, r1)
            X.0t7 r2 = (X.C17120t7) r2
            r12.A07 = r2
            r10 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L50
            r1 = 1068310329(0x3fad1f39, float:1.3525153)
            java.lang.String r0 = "loadCurrentUser"
            X.C0fO.A01(r0, r1)
        L50:
            X.0Gq r8 = new X.0Gq
            r8.<init>(r13, r2, r3)
            r12.A05 = r8
            X.0c4 r1 = X.C17070sz.A01
            monitor-enter(r1)
            X.0sz r0 = X.C17070sz.A00     // Catch: java.lang.Throwable -> Lee
            if (r0 != 0) goto L65
            X.0sz r0 = new X.0sz     // Catch: java.lang.Throwable -> Lee
            r0.<init>()     // Catch: java.lang.Throwable -> Lee
            X.C17070sz.A00 = r0     // Catch: java.lang.Throwable -> Lee
        L65:
            monitor-exit(r1)
            X.0y2 r0 = r9.A00
            X.0xq r1 = r0.A00
            java.lang.String r0 = "current"
            r5 = 0
            java.lang.String r0 = r1.getString(r0, r5)
            r6 = 0
            if (r0 == 0) goto Lab
            com.instagram.user.model.User r6 = X.AbstractC221815t.A00(r0)     // Catch: java.io.IOException -> Lb3
            java.lang.String r4 = r6.getId()     // Catch: java.io.IOException -> Lb3
            java.util.Map r0 = r9.A01     // Catch: java.io.IOException -> Lb3
            java.util.Set r0 = r0.keySet()     // Catch: java.io.IOException -> Lb3
            java.util.Iterator r3 = r0.iterator()     // Catch: java.io.IOException -> Lb3
        L87:
            boolean r0 = r3.hasNext()     // Catch: java.io.IOException -> Lb3
            r2 = 0
            if (r0 == 0) goto La2
            java.lang.Object r1 = r3.next()     // Catch: java.io.IOException -> Lb3
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0     // Catch: java.io.IOException -> Lb3
            if (r0 == 0) goto L9b
            java.lang.String r2 = r0.getId()     // Catch: java.io.IOException -> Lb3
        L9b:
            boolean r0 = X.C14360o3.A0K(r2, r4)     // Catch: java.io.IOException -> Lb3
            if (r0 == 0) goto L87
            r2 = r1
        La2:
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2     // Catch: java.io.IOException -> Lb3
            if (r2 == 0) goto La7
            r6 = r2
        La7:
            r9.A07(r6)     // Catch: java.io.IOException -> Lb3
            goto Lb5
        Lab:
            X.0a1 r0 = new X.0a1
            r0.<init>(r13)
            r12.A08 = r0
            goto Lb8
        Lb3:
            if (r6 == 0) goto Lab
        Lb5:
            r8.A03(r6, r7)
        Lb8:
            com.instagram.common.session.UserSession r4 = r8.A00
            if (r4 == 0) goto Le1
            X.0Bo r0 = X.C0BQ.A00(r4)
            X.0t6 r0 = (X.C17110t6) r0
            X.088 r0 = r0.A02
            java.util.List r0 = r0.A03(r5)
            java.util.Iterator r3 = r0.iterator()
        Lcc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Le1
            java.lang.Object r2 = r3.next()
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.18A r1 = X.AnonymousClass189.A00(r4)
            r0 = 0
            r1.A01(r2, r0, r0)
            goto Lcc
        Le1:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto Led
            r0 = -30465874(0xfffffffffe2f20ae, float:-5.8196145E37)
            X.C0fO.A00(r0)
        Led:
            return
        Lee:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C023409i.<init>(X.0vz, X.0t4, X.15s):void");
    }

    public final synchronized UserSession A00() {
        return this.A05.A00;
    }

    public final synchronized UserSession A01(InterfaceC03370Gm interfaceC03370Gm, User user) {
        UserSession A02;
        C14360o3.A0B(user, 0);
        A02 = A02(user);
        if (interfaceC03370Gm != null) {
            interfaceC03370Gm.EOw(A02);
        }
        this.A02.A07(user);
        C09Y.A01(false);
        C17090t4 c17090t4 = this.A04;
        if (c17090t4 != null) {
            C17090t4.A00(c17090t4, false);
        } else {
            throw new IllegalStateException("Required value was null.");
        }
        return A02;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.IllegalStateException, X.09h] */
    public final UserSession A02(User user) {
        try {
            user.A0a(0);
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            user.A05 = c16920sk;
            C19740y2 c19740y2 = this.A06;
            String A00 = AbstractC225717y.A00(user);
            InterfaceC19610xo ARD = c19740y2.A00.ARD();
            ARD.E7K("current", A00);
            ARD.apply();
            UserSession A002 = A00();
            if (A002 != null) {
                if (!C14360o3.A0K(A002.userId, user.getId())) {
                    C0CN.A00(A002).A01(false);
                    this.A05.A03(user, true);
                } else if (AbstractC1565471c.A00(A002).A00() != null) {
                    C0CN.A00(A002).A01(false);
                    this.A05.A03(user, true);
                } else {
                    this.A02.A07(user);
                }
            } else {
                this.A05.A03(user, true);
                this.A02.A07(user);
            }
            C07270a1 c07270a1 = this.A08;
            if (c07270a1 != null) {
                if (!c07270a1.A01) {
                    c07270a1.A06();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(" - thread: ");
                sb.append(Thread.currentThread());
                this.A00 = new IllegalStateException(AnonymousClass001.A0R("current logged out session was cleared", sb.toString()));
                this.A08 = null;
            }
            UserSession A003 = A00();
            if (A003 != null) {
                return A003;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Exception e) {
            throw new RuntimeException("Unable to write current user", e);
        }
    }

    public final synchronized void A04(UserSession userSession) {
        String str;
        C03390Gq c03390Gq = this.A05;
        String str2 = userSession.userId;
        if (str2 != null) {
            UserSession userSession2 = c03390Gq.A00;
            if (userSession2 != null) {
                str = userSession2.userId;
            } else {
                str = null;
            }
            if (str2.equals(str)) {
                AnonymousClass088 anonymousClass088 = this.A02;
                User A00 = C08730cb.A00(userSession).A00();
                Map map = anonymousClass088.A01;
                if (map.containsKey(A00)) {
                    anonymousClass088.A02.remove(A00);
                    map.remove(A00);
                    AnonymousClass088.A01(anonymousClass088);
                    anonymousClass088.A05(A00);
                }
                C0CN.A00(userSession).A01(true);
                if (this.A08 == null) {
                    this.A08 = new C07270a1(this.A01);
                }
                c03390Gq.A00 = null;
                InterfaceC19610xo ARD = this.A06.A00.ARD();
                ARD.E7K("current", null);
                ARD.apply();
                C09Y.A01(true);
            }
        }
    }

    public final boolean A05(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A05.A00;
        if (userSession != null) {
            str2 = userSession.userId;
        } else {
            str2 = null;
        }
        if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final UserSession A03(String str) {
        if (str != null) {
            if (!str.equals("IgSessionManager.LOGGED_OUT_TOKEN")) {
                UserSession A00 = A00();
                if (A00 != null) {
                    if (!AbstractC03260Dj.A00(str, A00.token)) {
                        C0w9.A03("user_session_mismatch", AnonymousClass001.A11("requested user session (", str, ") does not match current user session (", A00.token, ")."));
                        if (AbstractC001900j.A0a(str, ":", false)) {
                            List A0Q = AbstractC001900j.A0Q(str, new char[]{':'}, 0);
                            if (A0Q.size() > 1) {
                                str = (String) A0Q.get(1);
                            } else {
                                throw new IllegalStateException("Check failed.");
                            }
                        }
                        User BOa = this.A03.BOa(str);
                        if (BOa != null) {
                            return C03390Gq.A01(this.A05, BOa, false, false);
                        }
                        C023309h c023309h = this.A00;
                        StringBuilder sb = new StringBuilder();
                        sb.append(" - thread: ");
                        sb.append(Thread.currentThread());
                        throw new IllegalStateException(AnonymousClass001.A0R("Requesting UserSession for not logged in user", sb.toString()), c023309h);
                    }
                    return A00;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Requesting UserSession while passing logged out session token");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
