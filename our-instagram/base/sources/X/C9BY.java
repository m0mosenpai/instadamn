package X;

/* renamed from: X.9BY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BY extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9BY(C132175xv c132175xv, C26036BfP c26036BfP, int i) {
        this.A00 = i;
        this.A02 = c132175xv;
        this.A01 = c26036BfP;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9BY) && ((C9BY) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        String str;
        if (this.A00 != 0) {
            str = "pinnedPost";
        } else {
            str = "firstPost";
        }
        return AbstractC132295y8.A01(this, str, ((C132175xv) this.A02).A03);
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
            C9BY c9by = (C9BY) obj;
            if (!C14360o3.A0K(this.A02, c9by.A02) || !C14360o3.A0K(this.A01, c9by.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A02.hashCode() * 31) + this.A01.hashCode();
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
    public C9BY(X.C132175xv r8, int r9) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C9BY.<init>(X.5xv, int):void");
    }
}
