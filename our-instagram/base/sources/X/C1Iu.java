package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.1Iu, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Iu extends C13C {
    public final C24721Ip A00;
    public final /* synthetic */ AtomicReferenceArray A01;

    @Override // X.C13C
    public final int A04() {
        return AbstractC24761It.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r4 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        X.C14360o3.A0A(r5.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0067, code lost:
    
        r3.set(r1, null);
     */
    @Override // X.C13C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(java.lang.Throwable r6, X.C12W r7, int r8) {
        /*
            r5 = this;
            int r0 = X.AbstractC24761It.A01
            r4 = 0
            if (r8 < r0) goto L7
            r4 = 1
            int r8 = r8 - r0
        L7:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.A01
            int r1 = r8 * 2
            r3.get(r1)
        Le:
            int r0 = r1 + 1
            java.lang.Object r2 = r3.get(r0)
            boolean r0 = r2 instanceof X.InterfaceC24871Jm
            if (r0 != 0) goto L50
            boolean r0 = r2 instanceof X.C51O
            if (r0 != 0) goto L50
            X.0zt r0 = X.AbstractC24761It.A0A
            if (r2 == r0) goto L67
            X.0zt r0 = X.AbstractC24761It.A09
            if (r2 == r0) goto L67
            X.0zt r0 = X.AbstractC24761It.A0F
            if (r2 == r0) goto Le
            X.0zt r0 = X.AbstractC24761It.A0G
            if (r2 == r0) goto Le
            X.0zt r0 = X.AbstractC24761It.A07
            if (r2 == r0) goto L72
            X.0zt r0 = X.AbstractC24761It.A03
            if (r2 == r0) goto L72
            X.0zt r0 = X.AbstractC24761It.A04
            if (r2 == r0) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unexpected state: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L50:
            if (r4 == 0) goto L64
            X.0zt r0 = X.AbstractC24761It.A0A
        L54:
            boolean r0 = r5.A0A(r8, r2, r0)
            if (r0 == 0) goto Le
            r0 = 0
            r3.set(r1, r0)
            r0 = r4 ^ 1
            r5.A09(r8, r0)
            goto L6b
        L64:
            X.0zt r0 = X.AbstractC24761It.A09
            goto L54
        L67:
            r0 = 0
            r3.set(r1, r0)
        L6b:
            if (r4 == 0) goto L72
            X.1Ip r0 = r5.A00
            X.C14360o3.A0A(r0)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Iu.A06(java.lang.Throwable, X.12W, int):void");
    }

    public final void A09(int i, boolean z) {
        if (z) {
            C24721Ip c24721Ip = this.A00;
            C14360o3.A0A(c24721Ip);
            c24721Ip.A0K((super.A00 * AbstractC24761It.A01) + i);
        }
        A05();
    }

    public final boolean A0A(int i, Object obj, Object obj2) {
        return C1AM.A00(obj, obj2, this.A01, (i * 2) + 1);
    }

    public C1Iu(C24721Ip c24721Ip, C1Iu c1Iu, int i, long j) {
        super(c1Iu, i, j);
        this.A00 = c24721Ip;
        this.A01 = new AtomicReferenceArray(AbstractC24761It.A01 * 2);
    }
}
