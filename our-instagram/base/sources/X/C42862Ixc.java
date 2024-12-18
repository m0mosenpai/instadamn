package X;

import com.instagram.shopping.fragment.variantselector.MultiVariantSelectorLoadingFragment;

/* renamed from: X.Ixc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42862Ixc implements JHP {
    public final int A00;
    public final Object A01;

    public C42862Ixc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.JHP
    public final void DFf() {
        InterfaceC1119153d interfaceC1119153d;
        if (this.A00 != 0) {
            C41049IFs c41049IFs = ((MultiVariantSelectorLoadingFragment) this.A01).A01;
            if (c41049IFs != null) {
                C41742IeG c41742IeG = c41049IFs.A01;
                c41742IeG.A01 = new C36720GGp(3);
                AbstractC167007dF.A16(c41742IeG.A00);
                if (c41742IeG.A02 && (interfaceC1119153d = c41742IeG.A01) != null) {
                    interfaceC1119153d.Czx();
                    c41742IeG.A01 = null;
                    return;
                }
                return;
            }
            return;
        }
        HC1.A00(((C41205ILt) this.A01).A00.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (X.AbstractC199308rX.A05(r4, false) != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.instagram.user.model.Product] */
    @Override // X.JHP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dq0(com.instagram.model.shopping.ProductGroup r13) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42862Ixc.Dq0(com.instagram.model.shopping.ProductGroup):void");
    }
}
