package X;

import android.util.Pair;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5cH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120185cH {
    public static final InterfaceC28041Xi A08 = new InterfaceC28041Xi() { // from class: X.5cI
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // X.InterfaceC28041Xi
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            String str;
            MNP mnp = (MNP) obj;
            if (mnp != null) {
                JTV jtv = (JTV) mnp;
                String str2 = jtv.A02;
                switch (str2.hashCode()) {
                    case -948696717:
                        if (str2.equals("queued") && jtv.A00 <= 0) {
                            return true;
                        }
                        break;
                    case 1501196714:
                        str = "upload_failed_permanent";
                        break;
                    case 1563991648:
                        str = "uploaded";
                        break;
                    case 1885454214:
                        str = "upload_failed_transient";
                        break;
                }
                if (!str2.equals(str)) {
                    return false;
                }
                return true;
            }
            return false;
        }
    };
    public final C13920nI A00;
    public final C119885bm A01;
    public final C120175cG A05;
    public final C120165cF A06;
    public final C2DS A07;
    public final Map A02 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A03 = new HashMap();

    public static void A00(C120185cH c120185cH) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c120185cH.A02.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((AbstractMap) it.next()).values());
        }
        C28741aC c28741aC = ((C2DU) c120185cH.A07).A0H;
        if (!C49682Qb.A06.A03()) {
            c28741aC.A02.ATO(new JTX(c28741aC, arrayList));
        }
    }

    public final Pair A01(String str) {
        this.A03.remove(str);
        Object remove = this.A04.remove(str);
        if (remove == null) {
            return null;
        }
        Map map = this.A02;
        AbstractMap abstractMap = (AbstractMap) map.get(remove);
        if (abstractMap == null) {
            return null;
        }
        C1OW c1ow = (C1OW) abstractMap.remove(str);
        if (abstractMap.isEmpty()) {
            map.remove(remove);
        }
        if (c1ow == null) {
            return null;
        }
        A00(this);
        return new Pair(c1ow, new JTV(JTU.A00(c1ow)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r2.equals("executing") == false) goto L7;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(X.C1OW r8, X.MNP r9) {
        /*
            r7 = this;
            java.lang.String r6 = r8.A05
            java.util.Map r0 = r7.A04
            boolean r1 = r0.containsKey(r6)
            r0 = 0
            if (r1 != 0) goto Lc
            return r0
        Lc:
            X.JTY.A00(r8, r9)
            X.JTV r9 = (X.JTV) r9
            java.lang.String r2 = r9.A02
            int r0 = r2.hashCode()
            r1 = 2
            r5 = 1
            switch(r0) {
                case -1090974990: goto L5b;
                case -948696717: goto L4e;
                case 1501196714: goto L2e;
                case 1563991648: goto L2b;
                case 1885454214: goto L28;
                default: goto L1c;
            }
        L1c:
            java.lang.String r0 = "Unsupported lifecycleState: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r2)
            java.lang.String r0 = "DirectMutationStore_setLifecycleState"
            X.C0w9.A03(r0, r1)
        L27:
            return r5
        L28:
            java.lang.String r0 = "upload_failed_transient"
            goto L30
        L2b:
            java.lang.String r0 = "uploaded"
            goto L30
        L2e:
            java.lang.String r0 = "upload_failed_permanent"
        L30:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1c
            X.5bm r1 = r7.A01
            java.lang.String r0 = r8.A02()
            X.1Og r0 = r1.A00(r0)
            long r3 = r0.A00(r2)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L64
            r7.A01(r6)
            return r5
        L4e:
            java.lang.String r0 = "queued"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1c
            int r0 = r9.A00
            if (r0 <= r1) goto L64
            return r5
        L5b:
            java.lang.String r0 = "executing"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L27
            goto L1c
        L64:
            A00(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120185cH.A03(X.1OW, X.MNP):boolean");
    }

    public C120185cH(C13920nI c13920nI, C119885bm c119885bm, C120175cG c120175cG, C120165cF c120165cF, C2DS c2ds) {
        this.A00 = c13920nI;
        this.A06 = c120165cF;
        this.A07 = c2ds;
        this.A01 = c119885bm;
        this.A05 = c120175cG;
    }

    public final String A02(C1OW c1ow, MNP mnp) {
        JTY.A00(c1ow, mnp);
        String AXT = ((InterfaceC25971Oe) this.A01.A01(c1ow.A02()).A05.getValue()).AXT(c1ow);
        AXT.getClass();
        String str = c1ow.A05;
        Map map = this.A04;
        String str2 = (String) map.get(str);
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DirectMutation has already been dispatched: mutation=");
            sb.append(c1ow);
            C0w9.A04("DuplicateDispatch", sb.toString(), 1);
            return str2;
        }
        Map map2 = this.A02;
        AbstractMap abstractMap = (AbstractMap) map2.get(AXT);
        if (abstractMap == null) {
            abstractMap = new LinkedHashMap();
            map2.put(AXT, abstractMap);
        }
        abstractMap.put(str, c1ow);
        map.put(str, AXT);
        A00(this);
        return AXT;
    }
}
