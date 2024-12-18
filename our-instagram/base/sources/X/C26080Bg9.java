package X;

import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import java.util.List;

/* renamed from: X.Bg9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26080Bg9 extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26080Bg9(X.C6R r2, java.lang.Integer r3, java.lang.Integer r4, kotlin.jvm.internal.DefaultConstructorMarker r5, X.C5Hc r6, X.C5Hc r7, int r8, int r9, boolean r10) {
        /*
            r1 = this;
            r0 = 2
            r1.A00 = r0
            X.5HZ r5 = X.C5HZ.A01
            X.C6R r2 = X.C6R.A03
            r3 = 0
            r7 = 0
            r4 = r3
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26080Bg9.<init>(X.C6R, java.lang.Integer, java.lang.Integer, kotlin.jvm.internal.DefaultConstructorMarker, X.5Hc, X.5Hc, int, int, boolean):void");
    }

    public static /* synthetic */ C26080Bg9 A00(C50526MSf c50526MSf, C51758Mth c51758Mth, C26080Bg9 c26080Bg9, C51740MtP c51740MtP, C6R c6r, C6R c6r2, int i) {
        C50526MSf c50526MSf2 = c50526MSf;
        C51758Mth c51758Mth2 = c51758Mth;
        C51740MtP c51740MtP2 = c51740MtP;
        C6R c6r3 = c6r2;
        C6R c6r4 = c6r;
        boolean z = false;
        if ((i & 1) != 0) {
            c6r4 = (C6R) c26080Bg9.A03;
        }
        if ((i & 2) != 0) {
            c6r3 = (C6R) c26080Bg9.A05;
        }
        if ((i & 4) != 0) {
            z = c26080Bg9.A06;
        }
        if ((i & 8) != 0) {
            c51740MtP2 = (C51740MtP) c26080Bg9.A04;
        }
        if ((i & 16) != 0) {
            c51758Mth2 = (C51758Mth) c26080Bg9.A02;
        }
        if ((i & 32) != 0) {
            c50526MSf2 = (C50526MSf) c26080Bg9.A01;
        }
        AbstractC25233BEq.A0x(3, c51740MtP2, c51758Mth2, c50526MSf2);
        return new C26080Bg9(c50526MSf2, c51758Mth2, c51740MtP2, c6r4, c6r3, z);
    }

    public static /* synthetic */ C26080Bg9 A01(C26080Bg9 c26080Bg9, InterfaceC30813Dgo interfaceC30813Dgo, C28224CcU c28224CcU, C6Q c6q, C5Hb c5Hb, int i, boolean z) {
        C6Q c6q2 = c6q;
        boolean z2 = z;
        InterfaceC30813Dgo interfaceC30813Dgo2 = interfaceC30813Dgo;
        C5Hb c5Hb2 = c5Hb;
        C28224CcU c28224CcU2 = c28224CcU;
        C61 c61 = null;
        if ((i & 1) != 0) {
            c28224CcU2 = (C28224CcU) c26080Bg9.A02;
        }
        if ((i & 2) != 0) {
            c5Hb2 = (C5Hb) c26080Bg9.A01;
        }
        if ((i & 4) != 0) {
            interfaceC30813Dgo2 = (InterfaceC30813Dgo) c26080Bg9.A04;
        }
        if ((i & 8) != 0) {
            z2 = c26080Bg9.A06;
        }
        if ((i & 16) != 0) {
            c6q2 = (C6Q) c26080Bg9.A03;
        }
        if ((i & 32) != 0) {
            c61 = (C61) c26080Bg9.A05;
        }
        AbstractC25234BEr.A1P(c5Hb2, interfaceC30813Dgo2, c6q2);
        return new C26080Bg9(interfaceC30813Dgo2, c61, c28224CcU2, c6q2, c5Hb2, z2);
    }

    public final boolean equals(Object obj) {
        C26080Bg9 c26080Bg9;
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C26080Bg9)) {
                        return false;
                    }
                    C26080Bg9 c26080Bg92 = (C26080Bg9) obj;
                    if (c26080Bg92.A00 != 0 || !C14360o3.A0K(this.A02, c26080Bg92.A02) || !C14360o3.A0K(this.A01, c26080Bg92.A01) || !C14360o3.A0K(this.A04, c26080Bg92.A04) || this.A06 != c26080Bg92.A06 || this.A03 != c26080Bg92.A03 || this.A05 != c26080Bg92.A05) {
                        return false;
                    }
                    return true;
                }
                return true;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C26080Bg9)) {
                        return false;
                    }
                    C26080Bg9 c26080Bg93 = (C26080Bg9) obj;
                    if (c26080Bg93.A00 != 1 || this.A03 != c26080Bg93.A03 || this.A05 != c26080Bg93.A05 || this.A06 != c26080Bg93.A06 || !C14360o3.A0K(this.A04, c26080Bg93.A04) || !C14360o3.A0K(this.A02, c26080Bg93.A02) || !C14360o3.A0K(this.A01, c26080Bg93.A01)) {
                        return false;
                    }
                    return true;
                }
                return true;
            case 2:
                if (this != obj) {
                    if (!(obj instanceof C26080Bg9)) {
                        return false;
                    }
                    c26080Bg9 = (C26080Bg9) obj;
                    if (c26080Bg9.A00 != 2 || !C14360o3.A0K(this.A05, c26080Bg9.A05) || !C14360o3.A0K(this.A03, c26080Bg9.A03) || this.A04 != c26080Bg9.A04 || !C14360o3.A0K(this.A01, c26080Bg9.A01)) {
                        return false;
                    }
                    obj2 = this.A02;
                    obj3 = c26080Bg9.A02;
                    break;
                } else {
                    return true;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof C26080Bg9) {
                        c26080Bg9 = (C26080Bg9) obj;
                        if (c26080Bg9.A00 == 3 && C14360o3.A0K(this.A01, c26080Bg9.A01) && C14360o3.A0K(this.A02, c26080Bg9.A02) && C14360o3.A0K(this.A05, c26080Bg9.A05) && C14360o3.A0K(this.A04, c26080Bg9.A04)) {
                            obj2 = this.A03;
                            obj3 = c26080Bg9.A03;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (!C14360o3.A0K(obj2, obj3) || this.A06 != c26080Bg9.A06) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L82;
                case 1: goto L58;
                case 2: goto L35;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.A01
            int r1 = X.AbstractC166987dD.A0G(r0)
            java.lang.Object r0 = r3.A02
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A05
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.Object r0 = r3.A04
            int r0 = X.AbstractC166997dE.A0I(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            int r1 = X.AbstractC166987dD.A0I(r0, r1)
        L29:
            int r2 = r1 * 31
            boolean r0 = r3.A06
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r0 == 0) goto L33
            r1 = 1231(0x4cf, float:1.725E-42)
        L33:
            int r1 = r1 + r2
            return r1
        L35:
            java.lang.Object r0 = r3.A05
            int r1 = X.AbstractC166987dD.A0G(r0)
            java.lang.Object r0 = r3.A03
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.Object r0 = r3.A04
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AbstractC166997dE.A0I(r0)
            int r1 = r1 + r0
            goto L29
        L58:
            java.lang.Object r0 = r3.A03
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A05
            int r0 = X.AbstractC166997dE.A0I(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A06
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A04
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.Object r0 = r3.A02
            int r2 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.Object r0 = r3.A01
            int r1 = r0.hashCode()
            goto L33
        L82:
            java.lang.Object r0 = r3.A02
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.Object r0 = r3.A04
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            boolean r0 = r3.A06
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A03
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.Object r0 = r3.A05
            int r2 = X.AbstractC166997dE.A0I(r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26080Bg9.hashCode():int");
    }

    public C26080Bg9(C38321qM c38321qM, ProductCollectionCover productCollectionCover, CharSequence charSequence, CharSequence charSequence2, List list, boolean z) {
        C14360o3.A0B(productCollectionCover, 1);
        AbstractC167007dF.A1G(charSequence, 3, list);
        this.A01 = productCollectionCover;
        this.A02 = c38321qM;
        this.A05 = charSequence;
        this.A04 = charSequence2;
        this.A03 = list;
        this.A06 = z;
    }

    public C26080Bg9(C6R c6r, Integer num, Integer num2, C5Hc c5Hc, C5Hc c5Hc2, boolean z) {
        this.A05 = c5Hc;
        this.A03 = c5Hc2;
        this.A04 = c6r;
        this.A01 = num;
        this.A02 = num2;
        this.A06 = z;
    }

    public C26080Bg9(InterfaceC30813Dgo interfaceC30813Dgo, C61 c61, C28224CcU c28224CcU, C6Q c6q, C5Hb c5Hb, boolean z) {
        this.A02 = c28224CcU;
        this.A01 = c5Hb;
        this.A04 = interfaceC30813Dgo;
        this.A06 = z;
        this.A03 = c6q;
        this.A05 = c61;
    }

    public C26080Bg9(C50526MSf c50526MSf, C51758Mth c51758Mth, C51740MtP c51740MtP, C6R c6r, C6R c6r2, boolean z) {
        this.A03 = c6r;
        this.A05 = c6r2;
        this.A06 = z;
        this.A04 = c51740MtP;
        this.A02 = c51758Mth;
        this.A01 = c50526MSf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26080Bg9() {
        /*
            r10 = this;
            r9 = 1
            r3 = r10
            r10.A00 = r9
            r7 = 0
            r2 = 3
            r1 = 0
            r0 = 7
            X.MtP r6 = new X.MtP
            r6.<init>(r0)
            r0 = 19
            X.Mth r5 = new X.Mth
            r5.<init>(r7, r2, r0)
            r0 = 11
            X.MSf r4 = new X.MSf
            r4.<init>(r2, r0, r1)
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26080Bg9.<init>():void");
    }
}
