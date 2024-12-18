package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Pyx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58629Pyx implements InterfaceC65376Tj9 {
    public C1RW A00;
    public boolean A01;
    public final AtomicInteger A02;
    public final /* synthetic */ C58427Pv6 A03;
    public final /* synthetic */ C2M7 A04;
    public final /* synthetic */ C58621Pyp A05;
    public final /* synthetic */ C1RW A06;

    public C58629Pyx(C58427Pv6 c58427Pv6, C2M7 c2m7, C58621Pyp c58621Pyp, C1RW c1rw, boolean z) {
        this.A04 = c2m7;
        this.A06 = c1rw;
        this.A03 = c58427Pv6;
        this.A05 = c58621Pyp;
        this.A02 = MSW.A1C(c2m7.A01);
        this.A00 = c1rw;
        this.A01 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    @Override // X.InterfaceC65376Tj9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D6g(X.C58428Pv7 r12) {
        /*
            r11 = this;
            boolean r0 = r12.A07()
            r6 = 1
            if (r0 == 0) goto L21
            java.lang.Object r0 = r12.A04()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r12.A04()
            X.SLm r0 = (X.C62674SLm) r0
            int r0 = r0.A00
            if (r0 != r6) goto L21
            X.Pv6 r1 = r11.A03
            java.lang.Object r0 = r12.A04()
            r1.A01(r0)
        L20:
            return
        L21:
            X.2M7 r5 = r11.A04
            boolean r9 = r11.A01
            java.util.concurrent.atomic.AtomicInteger r4 = r11.A02
            X.1RW r10 = r11.A00
            X.1RW[] r3 = r5.A05
            java.util.concurrent.atomic.AtomicInteger r2 = r5.A04
            int r0 = r2.get()
            r7 = r3[r0]
            X.1RW r0 = r5.A02
            r1 = 0
            boolean r8 = X.AbstractC167007dF.A1X(r7, r0)
            java.util.ArrayList r7 = X.AbstractC166987dD.A1E()
            int r0 = r4.get()
            if (r0 <= 0) goto Lcf
            boolean r0 = r10.Cc3(r12)
            if (r0 == 0) goto Lcf
            X.Rfs r0 = X.EnumC61138Rfs.DECREMENT_RETRY
        L4c:
            r7.add(r0)
            X.Rfs r0 = X.EnumC61138Rfs.RETRY_DOWNLOAD
        L51:
            r7.add(r0)
            java.util.Iterator r8 = r7.iterator()
        L58:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r8.next()
            X.Rfs r0 = (X.EnumC61138Rfs) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto La2;
                case 1: goto L6c;
                case 2: goto L7e;
                case 3: goto L7a;
                case 4: goto Lbb;
                case 5: goto Lc1;
                case 6: goto Lca;
                default: goto L6b;
            }
        L6b:
            goto L58
        L6c:
            X.1RW r7 = r11.A00
            X.Pyp r0 = r11.A05
            X.Pv7 r7 = r7.A03(r0)
            java.util.concurrent.Executor r0 = r5.A03
            r7.A05(r11, r0)
            goto L58
        L7a:
            r4.decrementAndGet()
            goto L58
        L7e:
            java.lang.Object r0 = r12.A04()
            if (r0 == 0) goto L8e
            X.Pv6 r7 = r11.A03
            java.lang.Object r0 = r12.A04()
            r7.A01(r0)
            goto L58
        L8e:
            java.lang.Exception r0 = r12.A03()
            X.Pv6 r7 = r11.A03
            if (r0 == 0) goto L9b
            java.lang.Exception r0 = r12.A03()
            goto Lb7
        L9b:
            java.lang.String r0 = "Unexpected error: null"
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            goto Lb7
        La2:
            r2.incrementAndGet()
            int r7 = r2.get()
            int r0 = r3.length
            if (r7 < r0) goto L58
            r2.set(r1)
            X.Pv6 r7 = r11.A03
            java.lang.String r0 = "Exceeded number of downloaders available"
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
        Lb7:
            r7.A00(r0)
            goto L58
        Lbb:
            int r0 = r5.A01
            r4.set(r0)
            goto L58
        Lc1:
            int r0 = r2.get()
            r0 = r3[r0]
            r11.A00 = r0
            goto L58
        Lca:
            r5.A00 = r6
            r11.A01 = r1
            goto L58
        Lcf:
            if (r9 == 0) goto Le1
            X.Rfs r0 = X.EnumC61138Rfs.SET_FORCE_GP_FAILED
            r7.add(r0)
            if (r8 != 0) goto Le1
            X.Rfs r0 = X.EnumC61138Rfs.RESET_CURRENT_DOWNLOADER
            r7.add(r0)
            X.Rfs r0 = X.EnumC61138Rfs.RESET_RETRY_LIMIT
            goto L4c
        Le1:
            r2.get()
            X.Rfs r0 = X.EnumC61138Rfs.SET_EXCEPTION
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58629Pyx.D6g(X.Pv7):void");
    }
}
