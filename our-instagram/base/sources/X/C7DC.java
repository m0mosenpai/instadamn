package X;

import com.instagram.user.model.User;

/* renamed from: X.7DC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DC {
    public static final C7DD A08 = new Object();
    public final int A00;
    public final long A01;
    public final C7DI A02;
    public final C2EE A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final String A02(C150866ql c150866ql) {
        User Ba5;
        User Ba52;
        C14360o3.A0B(c150866ql, 0);
        C2EE c2ee = this.A03;
        boolean z = true;
        if (c2ee == null || (Ba52 = c2ee.Ba5()) == null || !Ba52.CS0(c150866ql)) {
            z = false;
        }
        if (!z || (Ba5 = c2ee.Ba5()) == null) {
            return null;
        }
        return Ba5.getId();
    }

    public final C2EE A00() {
        C7DI c7di = this.A02;
        if (c7di != C7DI.A0E && c7di != C7DI.A0F && c7di != C7DI.A06 && c7di != C7DI.A03 && c7di != C7DI.A02 && c7di != C7DI.A0G && c7di != C7DI.A0H && c7di != C7DI.A0C && c7di != C7DI.A0I) {
            throw new IllegalStateException("Check failed.");
        }
        C2EE c2ee = this.A03;
        if (c2ee != null) {
            return c2ee;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C2EE A01() {
        C7DI c7di = this.A02;
        if (c7di != C7DI.A0E && c7di != C7DI.A0F && c7di != C7DI.A06 && c7di != C7DI.A03 && c7di != C7DI.A02 && c7di != C7DI.A0G && c7di != C7DI.A0H && c7di != C7DI.A0C && c7di != C7DI.A0I) {
            return this.A03;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean A03() {
        C7DI c7di = this.A02;
        if (c7di != C7DI.A0K && c7di != C7DI.A0F) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r4 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7DC(X.C7DI r3, X.C2EE r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, long r10) {
        /*
            r2 = this;
            r2.<init>()
            X.7DI r0 = X.C7DI.A0E
            if (r3 != r0) goto La
            r0 = 0
            if (r4 == 0) goto Lb
        La:
            r0 = 1
        Lb:
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L74
            X.7DI r0 = X.C7DI.A0F
            if (r3 != r0) goto L1b
            if (r4 != 0) goto L1b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L1b:
            X.7DI r0 = X.C7DI.A06
            if (r3 != r0) goto L27
            if (r4 != 0) goto L27
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L27:
            X.7DI r0 = X.C7DI.A03
            if (r3 != r0) goto L33
            if (r4 != 0) goto L33
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L33:
            X.7DI r0 = X.C7DI.A02
            if (r3 != r0) goto L3f
            if (r4 != 0) goto L3f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L3f:
            X.7DI r0 = X.C7DI.A0G
            if (r3 != r0) goto L4b
            if (r4 != 0) goto L4b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L4b:
            X.7DI r0 = X.C7DI.A0H
            if (r3 != r0) goto L57
            if (r4 != 0) goto L57
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L57:
            X.7DI r0 = X.C7DI.A0I
            if (r3 != r0) goto L63
            if (r4 != 0) goto L63
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L63:
            r2.A02 = r3
            r2.A03 = r4
            r2.A01 = r10
            r2.A05 = r5
            r2.A06 = r6
            r2.A00 = r9
            r2.A04 = r7
            r2.A07 = r8
            return
        L74:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7DC.<init>(X.7DI, X.2EE, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long):void");
    }
}
