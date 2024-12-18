package X;

import java.util.List;

/* renamed from: X.PbI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57234PbI extends C03E implements InterfaceC16600sD {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C57234PbI(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L12
            java.lang.Class<X.Nug> r3 = X.C54030Nug.class
            r1 = 4
            java.lang.String r4 = "exampleProvider"
            java.lang.String r5 = "exampleProvider(Ljava/lang/String;DLjava/util/List;J)Lcom/instagram/igsignalsproducts/ttnc/IgSignalsTtncEstimatorProductModelExample;"
        Lc:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L12:
            java.lang.Class<X.Nue> r3 = X.C54028Nue.class
            r1 = 4
            java.lang.String r4 = "exampleProvider"
            java.lang.String r5 = "exampleProvider(Ljava/lang/String;DLjava/util/List;J)Lcom/instagram/igsignalsproducts/clips/comments/IgSignalsClipsOpenCommentsProductModelExample;"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57234PbI.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.A00;
        String str = (String) obj;
        double A00 = MSW.A00(obj2);
        List list = (List) obj3;
        long A0N = AbstractC166987dD.A0N(obj4);
        if (i != 0) {
            AbstractC167017dG.A1O(str, list);
            return new C52C(str, list, A00, A0N);
        }
        AbstractC167017dG.A1O(str, list);
        return new C52C(str, list, A00, A0N);
    }
}
