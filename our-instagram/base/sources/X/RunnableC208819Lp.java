package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.9Lp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC208819Lp implements Runnable {
    public int A00;
    public int A01;
    public YRL A02;
    public AbstractC208809Lo A03;
    public boolean A04;
    public final C208719Lf A05;
    public final UserSession A09;
    public volatile Long A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public final Object A07 = new Object();
    public final Object A0A = new Object();
    public final Object A06 = new Object();
    public volatile Integer A0B = C05F.A00;
    public final Queue A08 = new LinkedList();

    public final void A00() {
        this.A0D = false;
        this.A05.A01();
        Object obj = this.A07;
        synchronized (obj) {
            obj.notify();
        }
        Object obj2 = this.A06;
        synchronized (obj2) {
            obj2.notify();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01da, code lost:
    
        if (r10.A03 != null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01dc, code lost:
    
        X.C14360o3.A0F("renderController");
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e5, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01cf, code lost:
    
        if (r10.A03 != null) goto L137;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC208819Lp.run():void");
    }

    public final void A01() {
        synchronized (this.A06) {
            this.A0E = true;
        }
        A03(null);
    }

    public final void A02(Integer num) {
        if (this.A0B != num && this.A0B == C05F.A01) {
            this.A0B = num;
            A03(null);
        } else {
            this.A0B = num;
        }
    }

    public final void A03(Long l) {
        if (l != null) {
            this.A0C = l;
        }
        Object obj = this.A07;
        synchronized (obj) {
            obj.notify();
        }
    }

    public RunnableC208819Lp(UserSession userSession, C208719Lf c208719Lf, int i, int i2, int i3, int i4) {
        this.A05 = c208719Lf;
        this.A01 = i3;
        this.A00 = i4;
        this.A09 = userSession;
        this.A02 = new C72093XNn(i, i2);
    }
}
