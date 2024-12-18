package X;

/* renamed from: X.Bhh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26156Bhh extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public C26156Bhh(InterfaceC109864xE interfaceC109864xE, C132175xv c132175xv, C26036BfP c26036BfP, int i, boolean z) {
        String str;
        this.A00 = i;
        this.A03 = c132175xv;
        this.A02 = c26036BfP;
        this.A05 = z;
        this.A01 = interfaceC109864xE;
        if (i != 0) {
            str = "redesignedbannerview";
        } else {
            str = "bannerview";
        }
        this.A04 = AbstractC132295y8.A01(this, str, c132175xv.A03);
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26156Bhh) && ((C26156Bhh) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return (C132175xv) this.A03;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (A00(obj, i)) {
            C26156Bhh c26156Bhh = (C26156Bhh) obj;
            if (!C14360o3.A0K(this.A03, c26156Bhh.A03) || !C14360o3.A0K(this.A02, c26156Bhh.A02) || this.A05 != c26156Bhh.A05 || !C14360o3.A0K(this.A01, c26156Bhh.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A03))) + AbstractC167017dG.A0M(this.A01);
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A04;
    }

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26156Bhh(X.InterfaceC109864xE r13, X.C132175xv r14, int r15, boolean r16) {
        /*
            r12 = this;
            r6 = r12
            r12.A00 = r15
            r1 = 0
            X.BfP r0 = new X.BfP
            if (r15 == 0) goto L19
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            r10 = 1
        L10:
            r7 = r13
            r8 = r14
            r11 = r16
            r9 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return
        L19:
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            r10 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26156Bhh.<init>(X.4xE, X.5xv, int, boolean):void");
    }
}
