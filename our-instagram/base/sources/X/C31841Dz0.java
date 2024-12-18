package X;

import java.util.List;

/* renamed from: X.Dz0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31841Dz0 extends AbstractC52922bZ {
    public final InterfaceC15070pN A00;
    public final FHI A01;
    public final String A02;
    public final InterfaceC06180Ui A03;
    public final C05A A04;

    public C31841Dz0(FHI fhi, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = fhi;
        this.A02 = str;
        this.A04 = AbstractC25225BEi.A1H(new C51750MtZ((List) C16930sl.A00, 18));
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A03 = A00;
        this.A00 = new C06160Ug(null, A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C31841Dz0 r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 48
            boolean r0 = X.C57146PWy.A01(r7, r3)
            if (r0 == 0) goto Lb1
            r4 = r7
            X.PWy r4 = (X.C57146PWy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb1
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L57
            if (r0 != r5) goto Lb8
            X.AbstractC09560e7.A00(r1)
        L27:
            X.0eB r3 = X.C0eB.A00
            return r3
        L2a:
            X.AbstractC09560e7.A00(r1)
            X.FHI r0 = r6.A01
            java.lang.String r1 = r6.A02
            r4.A01 = r6
            r4.A00 = r2
            X.FHH r0 = r0.A00
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "media/%s/comment_likers/"
            java.lang.String r1 = X.AbstractC13670mt.A06(r0, r1)
            r0 = 831(0x33f, float:1.164E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.1ON r1 = X.AbstractC35238FgX.A02(r2, r1, r0)
            r0 = 558575316(0x214b2ed4, float:6.884105E-19)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r3) goto L5e
            return r3
        L57:
            java.lang.Object r6 = r4.A01
            X.Dz0 r6 = (X.C31841Dz0) r6
            X.AbstractC09560e7.A00(r1)
        L5e:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            r2 = 0
            if (r0 == 0) goto L9e
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.7ex r0 = (X.C168027ex) r0
            java.util.List r0 = r0.getItems()
            java.util.ArrayList r3 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r2 = r0.iterator()
        L77:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8a
            com.instagram.user.model.User r1 = X.AbstractC25226BEj.A15(r2)
            X.MtZ r0 = new X.MtZ
            r0.<init>(r1)
            r3.add(r0)
            goto L77
        L8a:
            X.05A r2 = r6.A04
            X.059 r0 = r6.A01()
            r0.getValue()
            r1 = 18
            X.MtZ r0 = new X.MtZ
            r0.<init>(r3, r1)
            r2.Egh(r0)
            goto L27
        L9e:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L27
            X.0Ui r1 = r6.A03
            X.Fa1 r0 = X.C34915Fa1.A00
            r4.A01 = r2
            r4.A00 = r5
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L27
            return r3
        Lb1:
            X.PWy r4 = new X.PWy
            r4.<init>(r6, r7, r3)
            goto L16
        Lb8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31841Dz0.A00(X.Dz0, X.1Ds):java.lang.Object");
    }

    public final AnonymousClass059 A01() {
        C05A c05a = this.A04;
        C0UL c0ul = new C0UL(new PXT(this, null, 19), c05a);
        return AbstractC208910l.A01(c05a.getValue(), AbstractC141776au.A00(this), c0ul, C10I.A01);
    }
}
