package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1y7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42791y7 implements InterfaceC42801y8 {
    public long A00;
    public ProductType A01;
    public Integer A02;
    public String A03;
    public final List A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final UserSession A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C42791y7(UserSession userSession, int i, long j) {
        C14360o3.A0B(userSession, 1);
        this.A09 = userSession;
        this.A07 = j;
        this.A05 = i;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        C14360o3.A07(synchronizedList);
        this.A04 = synchronizedList;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0D = C18U.A06(c06090Tz, userSession, 36320506903732839L);
        this.A06 = (int) C18U.A01(c06090Tz, userSession, 36606324091917754L);
        this.A0C = C18U.A06(c06090Tz, userSession, 36324849115345424L);
        this.A0B = C18U.A06(c06090Tz, userSession, 36324849116000791L);
        this.A08 = C18U.A01(c06090Tz, userSession, 36606324092638653L);
        this.A0A = C18U.A06(c06090Tz, userSession, 36324849116066328L);
    }

    @Override // X.InterfaceC42801y8
    public final boolean CQy() {
        synchronized (this) {
            List list = this.A04;
            if (list.size() >= this.A07) {
                if (this.A0B) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = this.A00;
                    if (j == 0) {
                        this.A00 = currentTimeMillis;
                        j = currentTimeMillis;
                    }
                    if (currentTimeMillis - j > this.A08) {
                        if (this.A0A) {
                            for (C4AF c4af : (C4AF[]) list.toArray(new C4AF[0])) {
                                c4af.DzS(false);
                            }
                        } else {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((C4AF) it.next()).DzS(false);
                            }
                        }
                        list.clear();
                        this.A00 = 0L;
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r7 == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r6.A01 != com.instagram.model.mediatype.ProductType.IG_REELS_AUDIO_AD) goto L11;
     */
    @Override // X.InterfaceC42801y8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AGN(boolean r7) {
        /*
            r6 = this;
            java.lang.Integer r1 = r6.A02
            java.lang.Integer r0 = X.C05F.A01
            r5 = 1
            if (r1 != r0) goto La
            r3 = 1
            if (r7 != 0) goto Lb
        La:
            r3 = 0
        Lb:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L16
            com.instagram.model.mediatype.ProductType r2 = r6.A01
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IG_REELS_AUDIO_AD
            r1 = 1
            if (r2 == r0) goto L17
        L16:
            r1 = 0
        L17:
            java.lang.String r4 = r6.A03
            if (r4 == 0) goto L55
            com.instagram.common.session.UserSession r0 = r6.A09
            if (r3 != 0) goto L22
            if (r1 != 0) goto L22
            r5 = 0
        L22:
            X.1wL r0 = X.C41711wL.A01(r0)
            X.29d r2 = r0.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r0}
            java.lang.String r0 = "cancelPrefetchForOrigin %s, exclude ads:%b"
            X.C2QC.A03(r0, r1)
            X.2C8 r1 = r2.A08
            if (r1 == 0) goto L44
            monitor-enter(r1)
            java.util.Map r0 = r1.A00     // Catch: java.lang.Throwable -> L40
            r0.clear()     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L43:
            monitor-exit(r1)
        L44:
            X.2Bh r3 = r2.A0B
            java.lang.String r2 = "CANCELED_FOR_ORIGIN"
            X.2Bj r1 = r3.A03
            X.Vtp r0 = new X.Vtp
            r0.<init>(r3, r4, r5)
            r1.A01(r0, r2)
            r0 = 0
            r6.A03 = r0
        L55:
            java.util.List r0 = r6.A04
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42791y7.AGN(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r2.A0T == false) goto L6;
     */
    @Override // X.InterfaceC42801y8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E5E(final X.C5OF r6, X.C5OD r7) {
        /*
            r5 = this;
            java.lang.String r4 = r7.A03
            r5.A03 = r4
            X.3a3 r2 = r7.A02
            java.lang.Integer r0 = r2.A0E
            r5.A02 = r0
            com.instagram.model.mediatype.ProductType r0 = r2.A09
            r5.A01 = r0
            X.5OG r1 = new X.5OG
            r1.<init>()
            java.util.List r0 = r5.A04
            r0.add(r1)
            X.4AD r3 = new X.4AD
            r3.<init>(r2, r4)
            r0 = 524288(0x80000, float:7.34684E-40)
            r3.A02 = r0
            int r0 = r7.A00
            r3.A01 = r0
            int r0 = r5.A06
            r3.A01(r1, r0)
            boolean r0 = r5.A0C
            if (r0 == 0) goto L33
            boolean r1 = r2.A0T
            r0 = 1
            if (r1 != 0) goto L34
        L33:
            r0 = 0
        L34:
            r3.A06 = r0
            boolean r0 = r7.A05
            r3.A05 = r0
            boolean r0 = r7.A04
            r3.A04 = r0
            X.0nS r2 = X.C14120nc.A00()
            com.instagram.common.session.UserSession r1 = r7.A01
            X.5OH r0 = new X.5OH
            r0.<init>()
            r2.ATO(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42791y7.E5E(X.5OF, X.5OD):void");
    }

    public static final void A00(final C5OF c5of, C42791y7 c42791y7, final boolean z) {
        if (C11T.A08()) {
            InterfaceC14020nS A00 = C14120nc.A00();
            C14360o3.A07(A00);
            final int i = c42791y7.A05;
            A00.ATO(new AbstractRunnableC14200nk(i) { // from class: X.5fo
                @Override // java.lang.Runnable
                public final void run() {
                    C5OF.this.DHK(z);
                }
            });
            return;
        }
        c5of.DHK(z);
    }
}
