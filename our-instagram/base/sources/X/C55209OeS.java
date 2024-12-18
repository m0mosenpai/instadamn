package X;

import android.content.Context;
import android.util.LruCache;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OeS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55209OeS {
    public final C75H A00;
    public final HashMap A01;
    public final LruCache A02;
    public final C23031Ai A03;
    public final HashMap A04;

    public C55209OeS(Context context, UserSession userSession, C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 3);
        this.A03 = c23031Ai;
        C191498e5 A0B = c23031Ai.A0B();
        this.A02 = A0B == null ? AbstractC191488e4.A00() : A0B;
        this.A00 = new C75H(context, userSession);
        this.A04 = AbstractC166987dD.A1G();
        this.A01 = AbstractC166987dD.A1G();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C55209OeS r7, java.lang.String r8, java.util.List r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 33
            boolean r0 = X.PX6.A02(r10, r3)
            if (r0 == 0) goto Lb0
            r6 = r10
            X.PX6 r6 = (X.PX6) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb0
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r2 = r6.A04
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L5b
            if (r0 != r1) goto Lbc
            java.lang.Object r4 = r6.A03
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r8 = r6.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r6.A01
            X.OeS r7 = (X.C55209OeS) r7
            X.AbstractC09560e7.A00(r2)
        L30:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L42
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto Lb7
            r0 = 0
            A05(r0)
            X.8jk r2 = X.AbstractC25227BEk.A0h()
        L42:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L52
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            java.util.List r0 = (java.util.List) r0
            A03(r7, r8, r0, r4)
        L4f:
            X.0eB r5 = X.C0eB.A00
            return r5
        L52:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L4f
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L5b:
            X.AbstractC09560e7.A00(r2)
            java.util.LinkedHashMap r4 = X.AbstractC166987dD.A1I()
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            A04(r7, r9, r0, r4)
            X.75H r3 = r7.A00
            X.PX6.A00(r7, r8, r4, r6, r1)
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        L76:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L88
            X.1qM r0 = X.AbstractC31172DnG.A0i(r1)
            com.instagram.common.gallery.Medium r0 = r3.A00(r0)
            r2.add(r0)
            goto L76
        L88:
            r0 = 0
            X.5eQ r3 = r3.A01(r2, r0)
            X.1Jo r2 = X.AbstractC25232BEp.A1H(r6)
            r1 = 5
            X.EZ5 r0 = new X.EZ5
            r0.<init>(r1, r2, r7)
            r3.A00 = r0
            r1 = 49
            X.DRm r0 = new X.DRm
            r0.<init>(r3, r1)
            r2.CPA(r0)
            r0 = 1394228119(0x531a3b97, float:6.624247E11)
            X.C1GJ.A04(r3, r0)
            java.lang.Object r2 = r2.A0E()
            if (r2 != r5) goto L30
            return r5
        Lb0:
            X.PX6 r6 = new X.PX6
            r6.<init>(r7, r10, r3)
            goto L16
        Lb7:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lbc:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55209OeS.A00(X.OeS, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C55209OeS r5, java.lang.String r6, java.util.List r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 27
            boolean r0 = X.C57147PWz.A02(r8, r3)
            if (r0 == 0) goto L5a
            r4 = r8
            X.PWz r4 = (X.C57147PWz) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r2 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L48
            if (r0 != r1) goto L60
            java.lang.Object r6 = r4.A02
            java.lang.Object r5 = r4.A01
            X.OeS r5 = (X.C55209OeS) r5
            X.AbstractC09560e7.A00(r2)
        L2a:
            java.util.HashMap r0 = r5.A04
            java.lang.Object r3 = r0.get(r6)
            if (r3 != 0) goto L47
            X.0wb r2 = X.C18950wb.A01
            r1 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r0 = "ClipsAutoCreatedReelsMediaFetcher"
            X.0f5 r2 = r2.AEp(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Failed to get medium list from downloading source media"
            r2.ABW(r1, r0)
            r2.report()
        L47:
            return r3
        L48:
            X.AbstractC09560e7.A00(r2)
            java.util.HashMap r0 = r5.A01
            r0.put(r6, r7)
            X.C57147PWz.A00(r5, r6, r4, r1)
            java.lang.Object r0 = A00(r5, r6, r7, r4)
            if (r0 != r3) goto L2a
            return r3
        L5a:
            X.PWz r4 = new X.PWz
            r4.<init>(r5, r8, r3)
            goto L16
        L60:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55209OeS.A01(X.OeS, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    public static final List A02(C55209OeS c55209OeS, String str) {
        Object obj;
        List A18 = MSW.A18(str, c55209OeS.A01);
        if (A18 == null) {
            return null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A18.iterator();
        while (it.hasNext()) {
            C38321qM A0i = AbstractC31172DnG.A0i(it);
            LruCache lruCache = c55209OeS.A02;
            if (lruCache != null && (obj = lruCache.get(A0i.A2u())) != null) {
                A1E.add(obj);
            }
        }
        HashMap hashMap = c55209OeS.A04;
        hashMap.put(str, A1E);
        return MSW.A18(str, hashMap);
    }

    public static final void A05(Exception exc) {
        AbstractC167007dF.A15(C18950wb.A01.AEp("ClipsAutoCreatedReelsMediaFetcher", 817902720), DialogModule.KEY_MESSAGE, "getRemoteMediaTask failed", exc);
    }

    public static final boolean A06(C55209OeS c55209OeS, String str) {
        List A18 = MSW.A18(str, c55209OeS.A01);
        if (A18 == null) {
            return false;
        }
        if (!(A18 instanceof Collection) || !A18.isEmpty()) {
            Iterator it = A18.iterator();
            while (it.hasNext()) {
                C38321qM A0i = AbstractC31172DnG.A0i(it);
                LruCache lruCache = c55209OeS.A02;
                if (lruCache == null) {
                    return false;
                }
                String A2u = A0i.A2u();
                if (A2u != null) {
                    Medium medium = (Medium) lruCache.get(A2u);
                    if (medium == null || !medium.A06() || !MSY.A1Z(medium.A0X)) {
                        return false;
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        return true;
    }

    public static final void A03(C55209OeS c55209OeS, String str, List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Medium medium = (Medium) it.next();
            LruCache lruCache = c55209OeS.A02;
            if (lruCache != null) {
                lruCache.put(medium.A0Y, medium);
            }
            map.put(medium.A0Y, medium);
        }
        LruCache lruCache2 = c55209OeS.A02;
        if (lruCache2 != null) {
            c55209OeS.A03.A0o(lruCache2);
        }
        c55209OeS.A04.put(str, AbstractC001800i.A0X(AbstractC001800i.A0a(map.values())));
    }

    public static final void A04(C55209OeS c55209OeS, List list, List list2, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38321qM A0i = AbstractC31172DnG.A0i(it);
            String A2u = A0i.A2u();
            if (A2u != null) {
                map.remove(A2u);
                LruCache lruCache = c55209OeS.A02;
                if (lruCache != null) {
                    String A2u2 = A0i.A2u();
                    if (A2u2 != null) {
                        Medium medium = (Medium) lruCache.get(A2u2);
                        if (medium != null && medium.A06() && MSY.A1Z(medium.A0X)) {
                            String A2u3 = A0i.A2u();
                            if (A2u3 != null) {
                                map.put(A2u3, medium);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                list2.add(A0i);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
    }

    public final Object A07(List list, String str, InterfaceC23621Ds interfaceC23621Ds) {
        if (A06(this, str)) {
            List A02 = A02(this, str);
            if (A02 == null) {
                C0f5 AEp = C18950wb.A01.AEp("ClipsAutoCreatedReelsMediaFetcher", 817902720);
                AEp.ABW(DialogModule.KEY_MESSAGE, "Failed to get from existing mediums");
                AEp.report();
            }
            return A02;
        }
        return A01(this, str, list, interfaceC23621Ds);
    }
}
