package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TtE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65739TtE {
    public final UserSession A00;
    public final XED A01;
    public final XDR A02;
    public final List A03;
    public final int A04;
    public final C13920nI A05;

    public C65739TtE(UserSession userSession, XED xed, XDR xdr, int i) {
        ArrayList arrayList;
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = xed;
        this.A02 = xdr;
        this.A04 = i;
        this.A05 = C13920nI.A00;
        synchronized (this) {
            XDR xdr2 = this.A02;
            UserSession userSession2 = this.A00;
            String B8o = xdr2.B8o(userSession2);
            arrayList = new ArrayList();
            if (B8o != null) {
                try {
                    ArrayList AOw = this.A01.AOw(userSession2, B8o);
                    if (AOw != null) {
                        arrayList = AOw;
                    }
                } catch (IOException unused) {
                    xdr2.AHx(userSession2);
                }
            }
            C01T.A1C(arrayList);
        }
        this.A03 = arrayList;
    }

    private final synchronized void A00() {
        try {
            XDR xdr = this.A02;
            UserSession userSession = this.A00;
            xdr.ELw(userSession, this.A01.EOs(userSession, this.A03));
        } catch (IOException e) {
            C0K8.A0F("RecentSearchCache", "Error saving recent searches. Clearing results.", e);
            this.A02.AHx(this.A00);
        }
    }

    public final synchronized List A01() {
        ArrayList arrayList;
        List list = this.A03;
        arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.A01.Avj((AbstractC65924TwV) it.next()));
        }
        return arrayList;
    }

    public final synchronized List A02() {
        return AbstractC001800i.A0a(this.A03);
    }

    public final synchronized void A03() {
        this.A03.clear();
        this.A02.AHx(this.A00);
    }

    public final synchronized void A04(Object obj) {
        Object obj2;
        long A06;
        List list = this.A03;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                XED xed = this.A01;
                if (C14360o3.A0K(xed.BF9(obj), xed.BF9(xed.Avj((AbstractC65924TwV) obj2)))) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        AbstractC65924TwV abstractC65924TwV = (AbstractC65924TwV) obj2;
        if (abstractC65924TwV instanceof C152526tf) {
            A06 = System.currentTimeMillis();
        } else {
            A06 = AbstractC31177DnL.A06();
        }
        if (abstractC65924TwV == null) {
            list.add(0, this.A01.AM9(this.A00, obj, A06));
        } else {
            abstractC65924TwV.A02 = A06;
            list.remove(abstractC65924TwV);
            list.add(0, abstractC65924TwV);
        }
        while (list.size() > this.A04) {
            list.remove(list.size() - 1);
        }
        A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r5.remove(r3);
        A00();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A05(java.lang.Object r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List r5 = r6.A03     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r4 = r5.iterator()     // Catch: java.lang.Throwable -> L2f
        L7:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2d
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Throwable -> L2f
            X.TwV r3 = (X.AbstractC65924TwV) r3     // Catch: java.lang.Throwable -> L2f
            X.XED r2 = r6.A01     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r2.BF9(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r2.Avj(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r2.BF9(r0)     // Catch: java.lang.Throwable -> L2f
            boolean r0 = X.C14360o3.A0K(r1, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L7
            r5.remove(r3)     // Catch: java.lang.Throwable -> L2f
            r6.A00()     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r6)
            return
        L2f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65739TtE.A05(java.lang.Object):void");
    }

    public final synchronized void A06(List list) {
        List list2 = this.A03;
        list2.clear();
        list2.addAll(list);
        A00();
    }
}
