package X;

/* renamed from: X.Bhg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26155Bhg extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26155Bhg(X.C132175xv r8, int r9) {
        /*
            r7 = this;
            r7.A00 = r9
            r2 = 0
            X.BfP r1 = new X.BfP
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            if (r9 == 0) goto L13
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = 1
        Lf:
            r7.<init>(r8, r1, r0)
            return
        L13:
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26155Bhg.<init>(X.5xv, int):void");
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26155Bhg) && ((C26155Bhg) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return (C132175xv) this.A02;
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
            C26155Bhg c26155Bhg = (C26155Bhg) obj;
            if (!C14360o3.A0K(this.A02, c26155Bhg.A02) || !C14360o3.A0K(this.A01, c26155Bhg.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A02));
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A03;
    }

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public C26155Bhg(C132175xv c132175xv, C26036BfP c26036BfP, int i) {
        String A00;
        this.A00 = i;
        this.A02 = c132175xv;
        this.A01 = c26036BfP;
        if (i != 0) {
            A00 = "genailabel";
        } else {
            A00 = AbstractC43591JPw.A00(1233);
        }
        this.A03 = AbstractC132295y8.A01(this, A00, c132175xv.A03);
    }
}
