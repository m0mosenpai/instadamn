package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.81l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1810981l extends AbstractC52922bZ {
    public C22P A00;
    public C81O A01;
    public C55U A02;
    public boolean A03;
    public C1811981v A04;
    public boolean A06;
    public final C1811981v A07;
    public final C1811981v A08;
    public final C1811981v A09;
    public final UserSession A0A;
    public final C1811081m A0B;
    public final EnumMap A0C;
    public final EnumMap A0D;
    public final HashMap A0E;
    public final Map A0F;
    public final AnonymousClass822 A0K;
    public final EnumMap A0L;
    public final java.util.Set A0G = new CopyOnWriteArraySet();
    public final java.util.Set A0J = new CopyOnWriteArraySet();
    public final java.util.Set A0I = new CopyOnWriteArraySet();
    public boolean A05 = true;
    public final java.util.Set A0H = new LinkedHashSet();

    public final C1811881u A09(C55U c55u) {
        String str;
        C14360o3.A0B(c55u, 0);
        C1811081m c1811081m = this.A0B;
        C81O c81o = this.A01;
        if (c81o == null) {
            str = "cameraConfigurationSetup";
        } else {
            Map map = this.A0F;
            C22P c22p = this.A00;
            if (c22p == null) {
                str = "entryPoint";
            } else {
                return c1811081m.A00(c22p, c81o, c55u, map);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A0D(C22P c22p, CameraConfiguration cameraConfiguration) {
        C14360o3.A0B(c22p, 1);
        C1811981v c1811981v = this.A09;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(cameraConfiguration.A04);
        c1811981v.A02(linkedHashSet);
        this.A00 = c22p;
        C81O c81o = this.A01;
        if (c81o == null) {
            C14360o3.A0F("cameraConfigurationSetup");
            throw C00O.createAndThrow();
        }
        LinkedHashSet A01 = this.A0B.A01(c22p, c81o);
        C1811981v c1811981v2 = this.A07;
        if (!C14360o3.A0K(A01, c1811981v2.A00)) {
            c1811981v2.A03(A01);
        }
        Object obj = cameraConfiguration.A03;
        if (!((java.util.Set) c1811981v2.A00).contains(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("destination is not an available destination: ");
            sb.append(obj);
            AbstractC12120kG.A07("CameraConfigurationRepositoryImpl", sb.toString(), null);
            obj = C208509Kk.A00;
        }
        this.A08.A03(obj);
        this.A04.A03(Boolean.valueOf(cameraConfiguration.A00));
    }

    public final void A0E(C22P c22p, C81O c81o, C55U c55u, EnumC172837mv enumC172837mv, java.util.Set set, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c81o, 0);
        C14360o3.A0B(c22p, 3);
        this.A01 = c81o;
        this.A00 = c22p;
        this.A09.A03(AbstractC001800i.A0k(set));
        LinkedHashSet A01 = this.A0B.A01(c22p, c81o);
        C1811981v c1811981v = this.A07;
        if (!C14360o3.A0K(A01, c1811981v.A00)) {
            c1811981v.A03(A01);
        }
        if (!((java.util.Set) c1811981v.A00).contains(c55u)) {
            StringBuilder sb = new StringBuilder();
            sb.append("init destination is not an available destination: ");
            sb.append(c55u);
            AbstractC12120kG.A07("CameraConfigurationRepositoryImpl", sb.toString(), null);
            c55u = C208509Kk.A00;
        }
        this.A08.A03(c55u);
        this.A04.A03(Boolean.valueOf(z));
        this.A06 = z2;
        this.A05 = z3;
        if (enumC172837mv != null) {
            C81W c81w = C81W.A0U;
            EnumC172837mv[] enumC172837mvArr = AbstractC172827mu.A00;
            ArrayList arrayList = new ArrayList();
            AnonymousClass016.A18(arrayList, enumC172837mvArr);
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (it.next() == enumC172837mv) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            int intValue = Integer.valueOf(i).intValue();
            if (intValue != -1) {
                A0O(c81w, intValue);
            }
        }
    }

    public final void A0F(C22P c22p, C55U c55u) {
        C14360o3.A0B(c22p, 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(c55u);
        A0E(c22p, C81O.A02.A01(linkedHashSet), c55u, null, C16910sj.A00, true, false, true);
    }

    public final void A0H(AnonymousClass822 anonymousClass822) {
        C14360o3.A0B(anonymousClass822, 0);
        this.A0I.add(anonymousClass822);
        this.A08.A00(anonymousClass822);
    }

    public final void A0K(C55U c55u, C81W c81w, boolean z) {
        C14360o3.A0B(c55u, 0);
        HashMap hashMap = this.A0E;
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(c55u);
        if (abstractCollection == null) {
            abstractCollection = new HashSet();
            hashMap.put(c55u, abstractCollection);
        }
        if (!abstractCollection.contains(c81w)) {
            A04(c55u, c81w, this, z);
        }
    }

    public final void A0L(C81W c81w) {
        C14360o3.A0B(c81w, 0);
        if (!A0W(c81w)) {
            A0M(c81w);
        }
    }

    public final void A0N(C81W c81w) {
        C14360o3.A0B(c81w, 0);
        if (A0W(c81w)) {
            A0M(c81w);
        }
    }

    public final boolean A0T(C55U c55u, C81W c81w) {
        String str;
        C14360o3.A0B(c55u, 0);
        C14360o3.A0B(c81w, 1);
        C1811081m c1811081m = this.A0B;
        C81O c81o = this.A01;
        if (c81o == null) {
            str = "cameraConfigurationSetup";
        } else {
            Map map = this.A0F;
            C22P c22p = this.A00;
            if (c22p == null) {
                str = "entryPoint";
            } else {
                return new LinkedHashSet(c1811081m.A00(c22p, c81o, c55u, map).A01).contains(c81w);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0U(X.C55U r11, X.C81W... r12) {
        /*
            r10 = this;
            r8 = 0
            X.C14360o3.A0B(r11, r8)
            r7 = 1
            X.C14360o3.A0B(r12, r7)
            int r6 = r12.length
            r5 = 0
        La:
            if (r5 >= r6) goto L6a
            r4 = r12[r5]
            X.81m r3 = r10.A0B
            X.81O r2 = r10.A01
            if (r2 != 0) goto L1e
            java.lang.String r0 = "cameraConfigurationSetup"
        L16:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1e:
            java.util.Map r1 = r10.A0F
            X.22P r0 = r10.A00
            if (r0 != 0) goto L27
            java.lang.String r0 = "entryPoint"
            goto L16
        L27:
            X.81u r3 = r3.A00(r0, r2, r11, r1)
            java.util.LinkedHashSet r0 = r3.A00()
            java.util.Iterator r9 = r0.iterator()
            X.C14360o3.A07(r9)
            r2 = 0
        L37:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r9.next()
            X.C14360o3.A07(r0)
            X.81W r0 = (X.C81W) r0
            if (r0 == r4) goto L67
            java.util.LinkedHashSet r0 = r3.A01(r0)
            java.util.Iterator r1 = r0.iterator()
            X.C14360o3.A07(r1)
        L53:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r1.next()
            X.C14360o3.A07(r0)
            if (r0 != r4) goto L53
            r2 = 1
            goto L37
        L64:
            if (r2 != 0) goto L67
            return r8
        L67:
            int r5 = r5 + 1
            goto La
        L6a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810981l.A0U(X.55U, X.81W[]):boolean");
    }

    public final boolean A0W(C81W... c81wArr) {
        for (C81W c81w : c81wArr) {
            if (((java.util.Set) this.A09.A00).contains(c81w)) {
                return true;
            }
        }
        return false;
    }

    public C1810981l(UserSession userSession, C1811081m c1811081m) {
        AbstractC1811781t abstractC1811781t;
        this.A0A = userSession;
        this.A0B = c1811081m;
        HashMap hashMap = new HashMap();
        C81R c81r = C81R.A00;
        C81S c81s = C81S.A00;
        C208509Kk c208509Kk = C208509Kk.A00;
        C81U c81u = C81U.A00;
        C1811181n c1811181n = C1811181n.A00;
        C128535rM c128535rM = C128535rM.A00;
        C1811281o c1811281o = C1811281o.A00;
        C81T c81t = C81T.A00;
        C1811381p c1811381p = C1811381p.A00;
        C1811481q c1811481q = C1811481q.A00;
        C81Q c81q = C81Q.A00;
        C55U[] c55uArr = {c81r, c81s, c208509Kk, c81u, c1811181n, c128535rM, c1811281o, c81t, c1811381p, c1811481q, c81q};
        C14360o3.A0B(c55uArr, 0);
        for (C55U c55u : AbstractC009903n.A0K(c55uArr)) {
            if (C14360o3.A0K(c55u, c81s)) {
                abstractC1811781t = new AbstractC1811781t(c1811081m.A02, c1811081m.A03, c81s, false);
            } else if (!C14360o3.A0K(c55u, c208509Kk) && !C14360o3.A0K(c55u, c81t)) {
                if (c55u instanceof C81V) {
                    Context context = c1811081m.A02;
                    UserSession userSession2 = c1811081m.A03;
                    C14360o3.A0B(c55u, 3);
                    abstractC1811781t = new AbstractC1811781t(context, userSession2, c55u, false);
                } else {
                    if (!C14360o3.A0K(c55u, C1811581r.A00) && !C14360o3.A0K(c55u, c1811481q) && !C14360o3.A0K(c55u, c81q) && !C14360o3.A0K(c55u, c128535rM) && !C14360o3.A0K(c55u, c1811281o) && !C14360o3.A0K(c55u, c1811381p) && !C14360o3.A0K(c55u, c81r)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unknown destination, please create a pairings manager: ");
                        sb.append(c55u);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    Context context2 = c1811081m.A02;
                    UserSession userSession3 = c1811081m.A03;
                    C14360o3.A0B(c55u, 3);
                    abstractC1811781t = new AbstractC1811781t(context2, userSession3, c55u, false);
                }
            } else {
                Context context3 = c1811081m.A02;
                UserSession userSession4 = c1811081m.A03;
                boolean z = c1811081m.A01;
                C14360o3.A0B(c55u, 3);
                abstractC1811781t = new AbstractC1811781t(context3, userSession4, c55u, z);
            }
            hashMap.put(c55u, abstractC1811781t);
        }
        this.A0F = hashMap;
        this.A0E = new HashMap();
        this.A0K = new AnonymousClass822() { // from class: X.821
            @Override // X.AnonymousClass822
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                Pair pair = (Pair) obj;
                C14360o3.A0B(pair, 0);
                C1810981l c1810981l = C1810981l.this;
                if (c1810981l.A01 != null) {
                    for (AnonymousClass822 anonymousClass822 : c1810981l.A0H) {
                        C1811881u c1811881u = (C1811881u) pair.second;
                        C81O c81o = c1810981l.A01;
                        if (c81o == null) {
                            C14360o3.A0F("cameraConfigurationSetup");
                            throw C00O.createAndThrow();
                        }
                        c1811881u.A02(c81o.A01);
                        anonymousClass822.onChanged(pair);
                    }
                }
            }
        };
        C16910sj c16910sj = C16910sj.A00;
        this.A09 = new C1811981v(c16910sj);
        this.A07 = new C1811981v(c16910sj);
        this.A08 = new C1811981v(c208509Kk);
        this.A04 = new C1811981v(true);
        this.A0C = new EnumMap(C81W.class);
        this.A0L = new EnumMap(C81W.class);
        this.A0D = new EnumMap(C81W.class);
        A0H(new AnonymousClass822() { // from class: X.823
            @Override // X.AnonymousClass822
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                C55U c55u2 = (C55U) obj;
                C14360o3.A0B(c55u2, 0);
                C1810981l c1810981l = C1810981l.this;
                C55U c55u3 = c1810981l.A02;
                if (!C14360o3.A0K(c55u3, c55u2)) {
                    if (c55u3 != null && !c55u3.A03 && c55u2.A03) {
                        C22P c22p = C22P.A0f;
                        UserSession userSession5 = c1810981l.A0A;
                        AbstractC189688an.A00(c22p);
                        AbstractC189688an.A01(userSession5, c55u2, ((C22F) AnonymousClass229.A01(userSession5)).A04.A0L);
                        AbstractC189688an.A03(userSession5, "ui_ready_to_interact", true);
                    }
                    c1810981l.A02 = c55u2;
                    C82X.A00(c1810981l.A0A).A00 = c55u2;
                    for (Map.Entry entry : c1810981l.A0C.entrySet()) {
                        C81W c81w = (C81W) entry.getKey();
                        C1811981v c1811981v = (C1811981v) entry.getValue();
                        C14360o3.A0A(c81w);
                        c1811981v.A03(Integer.valueOf(C8GX.A00(c81w)));
                    }
                }
            }
        });
        for (AbstractC1811781t abstractC1811781t2 : hashMap.values()) {
            abstractC1811781t2.A01.A00(this.A0K);
        }
    }

    public static C55U A02(C1810981l c1810981l) {
        return (C55U) c1810981l.A08.A00;
    }

    public static final void A04(C55U c55u, C81W c81w, C1810981l c1810981l, boolean z) {
        AbstractC1811781t abstractC1811781t = (AbstractC1811781t) c1810981l.A0F.get(c55u);
        if (abstractC1811781t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("no pairings manager for destination: ");
            sb.append(c55u);
            AbstractC12120kG.A07("CameraConfigurationRepositoryImpl", sb.toString(), null);
            return;
        }
        C14360o3.A0B(c81w, 0);
        abstractC1811781t.A04.put(c81w, Boolean.valueOf(z));
        C1811981v c1811981v = abstractC1811781t.A01;
        Pair pair = (Pair) c1811981v.A00;
        C1811881u c1811881u = (C1811881u) pair.second;
        HashSet A00 = AbstractC1811781t.A00(abstractC1811781t);
        java.util.Set set = c1811881u.A01;
        set.clear();
        set.addAll(A00);
        c1811981v.A02(pair);
    }

    public final CameraConfiguration A08() {
        return new CameraConfiguration((C55U) this.A08.A00, (java.util.Set) this.A09.A00, ((Boolean) this.A04.A00).booleanValue(), this.A06, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        if (r7 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        if (r5.isEmpty() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        r7 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        if (r7 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d4, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        r7 = X.C8GX.A04((X.C81W) r5.iterator().next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
    
        if (r7 != null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A0A() {
        /*
            r8 = this;
            X.81v r0 = r8.A08
            java.lang.Object r4 = r0.A00
            X.55U r4 = (X.C55U) r4
            X.81v r0 = r8.A09
            java.lang.Object r3 = r0.A00
            java.util.Set r3 = (java.util.Set) r3
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            r1 = 1
            X.C14360o3.A0B(r3, r1)
            X.9Kk r6 = X.C208509Kk.A00
            r2 = 0
            if (r4 == r6) goto La0
            X.81T r5 = X.C81T.A00
            if (r4 == r5) goto La0
            X.81S r0 = X.C81S.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L4c
            java.lang.Integer r7 = X.C05F.A00
        L27:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r3)
            java.util.Iterator r6 = r5.iterator()
            X.C14360o3.A07(r6)
        L33:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r0 = r6.next()
            X.81W r0 = (X.C81W) r0
            X.C14360o3.A0A(r0)
            java.lang.Integer r0 = X.C8GX.A04(r0)
            if (r0 != 0) goto L33
            r6.remove()
            goto L33
        L4c:
            X.81q r0 = X.C1811481q.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9d
            X.81r r0 = X.C1811581r.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9d
            boolean r0 = r4.equals(r6)
            if (r0 != 0) goto L9d
            boolean r0 = r4.equals(r5)
            if (r0 != 0) goto L9d
            X.81Q r0 = X.C81Q.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9d
            X.81R r0 = X.C81R.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9d
            boolean r0 = r4 instanceof X.C81V
            if (r0 != 0) goto L9d
            X.81o r0 = X.C1811281o.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L87
            java.lang.Integer r7 = X.C05F.A0j
            goto L27
        L87:
            X.5rM r0 = X.C128535rM.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L92
            java.lang.Integer r7 = X.C05F.A02
            goto L27
        L92:
            X.81p r0 = X.C1811381p.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Le5
            java.lang.Integer r7 = X.C05F.A04
            goto L27
        L9d:
            java.lang.Integer r7 = X.C05F.A1I
            goto L27
        La0:
            r7 = r2
            goto L27
        La2:
            int r0 = r5.size()
            if (r0 > r1) goto Lb2
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lc1
            if (r7 == 0) goto Lc3
        Lb2:
            java.lang.String r1 = "reach out to @HaydenChristensen: current set of camera tools and camera destination are not compatible: "
            java.lang.String r0 = X.AbstractC226029yL.A00(r4, r3)
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r0 = "CaptureFormatUtil"
            X.AbstractC12120kG.A07(r0, r1, r2)
        Lc1:
            if (r7 != 0) goto Le4
        Lc3:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Ld5
            java.lang.Integer r7 = X.C05F.A0C
        Lcb:
            if (r7 != 0) goto Le4
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        Ld5:
            java.util.Iterator r0 = r5.iterator()
            java.lang.Object r0 = r0.next()
            X.81W r0 = (X.C81W) r0
            java.lang.Integer r7 = X.C8GX.A04(r0)
            goto Lcb
        Le4:
            return r7
        Le5:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810981l.A0A():java.lang.Integer");
    }

    public final void A0B() {
        C1811981v c1811981v = this.A09;
        if (!((java.util.Set) c1811981v.A00).isEmpty()) {
            c1811981v.A03(C16910sj.A00);
        }
    }

    public final void A0C() {
        C1811981v c1811981v = this.A09;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(A08().A04);
        c1811981v.A02(linkedHashSet);
        C1811981v c1811981v2 = this.A08;
        c1811981v2.A02(c1811981v2.A00);
        C1811981v c1811981v3 = this.A04;
        c1811981v3.A02(c1811981v3.A00);
        Collection<C1811981v> values = this.A0C.values();
        C14360o3.A07(values);
        for (C1811981v c1811981v4 : values) {
            c1811981v4.A02(c1811981v4.A00);
        }
        Collection<C1811981v> values2 = this.A0L.values();
        C14360o3.A07(values2);
        for (C1811981v c1811981v5 : values2) {
            c1811981v5.A02(c1811981v5.A00);
        }
        C1811981v c1811981v6 = this.A07;
        c1811981v6.A02(c1811981v6.A00);
    }

    public final void A0G(final AnonymousClass822 anonymousClass822) {
        A0I(new AnonymousClass822() { // from class: X.82a
            @Override // X.AnonymousClass822
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                AnonymousClass822.this.onChanged(this.A08());
            }
        });
        A0H(new AnonymousClass822() { // from class: X.82b
            @Override // X.AnonymousClass822
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                AnonymousClass822.this.onChanged(this.A08());
            }
        });
    }

    public final void A0I(AnonymousClass822 anonymousClass822) {
        this.A0J.add(anonymousClass822);
        this.A09.A00(anonymousClass822);
    }

    public final void A0J(C55U c55u) {
        C1811981v c1811981v = this.A08;
        if (c1811981v.A00 != c55u) {
            A0B();
        }
        java.util.Set set = (java.util.Set) this.A07.A00;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (it.next().getClass() == c55u.getClass()) {
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("destination is not an available destination: ");
        sb.append(c55u);
        AbstractC12120kG.A07("CameraConfigurationRepositoryImpl", sb.toString(), null);
        c55u = C208509Kk.A00;
        if (c1811981v.A00 != c55u) {
            c1811981v.A03(c55u);
        }
    }

    public final void A0P(C81W c81w, long j) {
        C81W c81w2 = C81W.A0y;
        if (c81w == c81w2) {
            EnumMap enumMap = this.A0D;
            C1811981v c1811981v = (C1811981v) enumMap.get(c81w2);
            if (c1811981v == null) {
                c1811981v = new C1811981v(Long.valueOf(C8GX.A02(c81w2)));
                enumMap.put((EnumMap) c81w2, (C81W) c1811981v);
            }
            c1811981v.A02(Long.valueOf(j));
            return;
        }
        if (!A0V(c81w)) {
            return;
        }
        this.A0D.put((EnumMap) c81w, (C81W) new C1811981v(Long.valueOf(j)));
    }

    public final boolean A0Q() {
        if ((this.A08.A00 instanceof C81V) && A0W(C81W.A0z)) {
            return true;
        }
        return false;
    }

    public final boolean A0R() {
        Object obj = this.A08.A00;
        if (!(obj instanceof C81V)) {
            if (!C14360o3.A0K(obj, C81S.A00)) {
                if (!C14360o3.A0K(obj, C208509Kk.A00) && !C14360o3.A0K(obj, C81T.A00)) {
                    return false;
                }
                if (!((java.util.Set) this.A09.A00).isEmpty()) {
                    if (!A0W(C81W.A0M, C81W.A0B, C81W.A0T)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (A0W(C81W.A0D)) {
            return false;
        }
        return true;
    }

    public final boolean A0S() {
        Object obj = this.A08.A00;
        if ((obj == C208509Kk.A00 || obj == C81T.A00) && ((java.util.Set) this.A09.A00).isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A0V(C81W... c81wArr) {
        java.util.Set set = (java.util.Set) this.A07.A00;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (A0U((C55U) it.next(), (C81W[]) Arrays.copyOf(c81wArr, 1))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        for (AbstractC1811781t abstractC1811781t : this.A0F.values()) {
            AnonymousClass822 anonymousClass822 = this.A0K;
            C14360o3.A0B(anonymousClass822, 0);
            abstractC1811781t.A01.A01(anonymousClass822);
        }
    }

    public static final C1811981v A00(C81W c81w, C1810981l c1810981l) {
        if (C8GX.A01(c81w) == 1) {
            EnumMap enumMap = c1810981l.A0C;
            C1811981v c1811981v = (C1811981v) enumMap.get(c81w);
            if (c1811981v == null) {
                C1811981v c1811981v2 = new C1811981v(Integer.valueOf(C8GX.A00(c81w)));
                enumMap.put((EnumMap) c81w, (C81W) c1811981v2);
                return c1811981v2;
            }
            return c1811981v;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("camera tool is not a secondary picker tool: ");
        sb.append(c81w);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final C1811981v A01(C81W c81w, C1810981l c1810981l) {
        if (C8GX.A01(c81w) == 2) {
            EnumMap enumMap = c1810981l.A0L;
            C1811981v c1811981v = (C1811981v) enumMap.get(c81w);
            if (c1811981v == null) {
                if (c81w.ordinal() == 11) {
                    C1811981v c1811981v2 = new C1811981v(new A56());
                    enumMap.put((EnumMap) c81w, (C81W) c1811981v2);
                    return c1811981v2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("camera tool is not secondary slider menu tool: ");
                sb.append(c81w);
                throw new IllegalArgumentException(sb.toString());
            }
            return c1811981v;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("camera tool is not a secondary slider tool: ");
        sb2.append(c81w);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void A03(C198438ps c198438ps, C8YY c8yy, String str, Throwable th) {
        String stackTraceString = android.util.Log.getStackTraceString(th);
        C14360o3.A07(stackTraceString);
        c198438ps.A03(AnonymousClass001.A0R(str, C00Q.A03(stackTraceString, 1000)), AnonymousClass001.A0R("camera_destination ", ((C55U) c8yy.A0F.A08.A00).A02));
    }

    public static boolean A05(C81W c81w, C1810981l c1810981l) {
        return c1810981l.A0W(c81w);
    }

    public final int A06(C81W c81w) {
        return ((Number) A00(c81w, this).A00).intValue();
    }

    public final long A07(C81W c81w) {
        if (A0V(c81w)) {
            C1811981v c1811981v = (C1811981v) this.A0D.get(c81w);
            if (c1811981v != null) {
                return ((Number) c1811981v.A00).longValue();
            }
            return C8GX.A02(c81w);
        }
        AbstractC12120kG.A07("CameraConfigurationRepositoryImpl", AnonymousClass001.A0g("Camera tool ", c81w.name(), " not available"), null);
        return Long.MIN_VALUE;
    }

    public final void A0M(C81W c81w) {
        LinkedHashSet linkedHashSet;
        Object obj;
        StringBuilder sb;
        if (!C8GX.A05(c81w)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("cannot select tool: ");
            sb = sb2;
            obj = c81w;
        } else {
            C1811981v c1811981v = this.A08;
            C1811881u A09 = A09((C55U) c1811981v.A00);
            if (!A09.A00.containsKey(c81w) && !A09.A03(c81w)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("tool(");
                sb3.append(c81w);
                sb3.append(") is not available for current destination: ");
                sb = sb3;
                obj = c1811981v.A00;
            } else {
                C1811981v c1811981v2 = this.A09;
                if (((java.util.Set) c1811981v2.A00).contains(c81w)) {
                    linkedHashSet = new LinkedHashSet();
                    for (Object obj2 : (java.util.Set) c1811981v2.A00) {
                        if (obj2 != c81w) {
                            linkedHashSet.add(obj2);
                        }
                    }
                } else {
                    linkedHashSet = new LinkedHashSet();
                    for (C81W c81w2 : (java.util.Set) c1811981v2.A00) {
                        if (!A09.A04(c81w, c81w2)) {
                            linkedHashSet.add(c81w2);
                        }
                    }
                    linkedHashSet.add(c81w);
                }
                c1811981v2.A03(linkedHashSet);
                return;
            }
        }
        sb.append(obj);
        AbstractC12120kG.A07("CameraConfigurationRepositoryImpl", sb.toString(), null);
    }

    public final void A0O(C81W c81w, int i) {
        if (C8GX.A06(c81w) && C8GX.A00(c81w) != i) {
            A0L(c81w);
        } else if (A0W(c81w)) {
            A0M(c81w);
        }
        if (((Number) A00(c81w, this).A00).intValue() != i) {
            A00(c81w, this).A03(Integer.valueOf(i));
        }
    }
}
