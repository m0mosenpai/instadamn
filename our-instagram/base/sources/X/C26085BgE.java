package X;

import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.BgE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26085BgE extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;

    public static final C26085BgE A01(Product product, List list, boolean z, boolean z2) {
        C14360o3.A0B(list, 0);
        return new C26085BgE(product, list, z, z2);
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof C26085BgE) && ((C26085BgE) obj).A00 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26085BgE.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto Lb5;
                case 1: goto L99;
                case 2: goto L7d;
                case 3: goto L6a;
                case 4: goto L57;
                case 5: goto L41;
                case 6: goto L28;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.A02
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AbstractC166997dE.A0J(r0, r1)
            boolean r1 = r3.A03
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L1b
            r0 = 1231(0x4cf, float:1.725E-42)
        L1b:
            int r2 = r2 + r0
            int r2 = r2 * 31
            boolean r0 = r3.A04
        L20:
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r0 == 0) goto L26
            r1 = 1231(0x4cf, float:1.725E-42)
        L26:
            int r1 = r1 + r2
            return r1
        L28:
            java.lang.Object r0 = r3.A02
            int r1 = X.AbstractC166987dD.A0G(r0)
            boolean r0 = r3.A04
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r0 = r3.A03
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A01
            int r1 = X.AbstractC167017dG.A0M(r0)
            goto L26
        L41:
            java.lang.Object r0 = r3.A01
            int r1 = X.AbstractC166987dD.A0G(r0)
            java.lang.Object r0 = r3.A02
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A04
            int r1 = X.AbstractC166987dD.A0K(r0, r1)
            goto Laf
        L57:
            java.lang.Object r0 = r3.A02
            int r1 = X.AbstractC166987dD.A0G(r0)
            boolean r0 = r3.A03
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r0 = r3.A04
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            goto Lc7
        L6a:
            java.lang.Object r0 = r3.A02
            int r1 = X.AbstractC166987dD.A0G(r0)
            boolean r0 = r3.A03
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
            goto L1b
        L7d:
            boolean r0 = r3.A03
            int r1 = X.AbstractC25225BEi.A08(r0)
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A04
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A02
            int r2 = X.AbstractC166997dE.A0I(r0)
            goto L26
        L99:
            boolean r0 = r3.A04
            int r1 = X.AbstractC25225BEi.A08(r0)
            java.lang.Object r0 = r3.A02
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC166997dE.A0I(r0)
            int r1 = r1 + r0
        Laf:
            int r2 = r1 * 31
            boolean r0 = r3.A03
            goto L20
        Lb5:
            boolean r0 = r3.A04
            int r1 = X.AbstractC25225BEi.A08(r0)
            boolean r0 = r3.A03
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A02
            int r2 = X.AbstractC166997dE.A0J(r0, r1)
        Lc7:
            java.lang.Object r0 = r3.A01
            int r1 = r0.hashCode()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26085BgE.hashCode():int");
    }

    public final String toString() {
        if (7 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(AbstractC43591JPw.A00(722));
        A1C.append(this.A02);
        A1C.append(AbstractC43591JPw.A00(506));
        A1C.append(this.A01);
        A1C.append(AbstractC43591JPw.A00(228));
        A1C.append(this.A03);
        A1C.append(AbstractC43591JPw.A00(230));
        return AbstractC25236BEt.A0a(A1C, this.A04);
    }

    public static final C26085BgE A00(AbstractC27827COq abstractC27827COq, InterfaceC30810Dgl interfaceC30810Dgl, boolean z, boolean z2) {
        AbstractC167017dG.A1R(interfaceC30810Dgl, abstractC27827COq);
        return new C26085BgE(abstractC27827COq, interfaceC30810Dgl, z, z2);
    }

    public C26085BgE(C26029BfI c26029BfI, List list, boolean z, boolean z2) {
        this.A00 = 7;
        C14360o3.A0B(list, 2);
        this.A02 = c26029BfI;
        this.A01 = list;
        this.A03 = z;
        this.A04 = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26085BgE(List list, List list2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2) {
        this(null, null, 1, false, false);
        this.A00 = 1;
    }

    public C26085BgE(Object obj, Object obj2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = obj;
        this.A04 = z2;
        this.A02 = obj2;
    }

    public C26085BgE(AbstractC27827COq abstractC27827COq, InterfaceC30810Dgl interfaceC30810Dgl, boolean z, boolean z2) {
        this.A00 = 0;
        AbstractC167007dF.A1F(interfaceC30810Dgl, 3, abstractC27827COq);
        this.A04 = z;
        this.A03 = z2;
        this.A02 = interfaceC30810Dgl;
        this.A01 = abstractC27827COq;
    }

    public C26085BgE(C26082BgB c26082BgB, List list, boolean z, boolean z2) {
        this.A00 = 4;
        this.A02 = list;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = c26082BgB;
    }

    public C26085BgE(C5QE c5qe, EnumC99704do enumC99704do, boolean z, boolean z2) {
        this.A00 = 3;
        this.A02 = c5qe;
        this.A03 = z;
        this.A01 = enumC99704do;
        this.A04 = z2;
    }

    public C26085BgE(Product product, List list, boolean z, boolean z2) {
        this.A00 = 5;
        this.A01 = list;
        this.A02 = product;
        this.A04 = z;
        this.A03 = z2;
    }

    public C26085BgE(User user, Integer num, boolean z, boolean z2) {
        this.A00 = 6;
        this.A02 = user;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26085BgE(C5QE c5qe, EnumC99704do enumC99704do, boolean z) {
        this(c5qe, enumC99704do, z, false);
        this.A00 = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26085BgE(AbstractC27827COq abstractC27827COq, InterfaceC30810Dgl interfaceC30810Dgl) {
        this(abstractC27827COq, interfaceC30810Dgl, false, false);
        this.A00 = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26085BgE() {
        this((Product) null, (List) C16930sl.A00, true, false);
        this.A00 = 5;
    }
}
