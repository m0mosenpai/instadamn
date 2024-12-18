package X;

/* renamed from: X.Xox, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72846Xox {
    public final int A00;
    public final AbstractC72846Xox A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, X.XYl, X.1AI] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, X.XYl, X.1AI] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, X.XYl, X.1AI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C72215XYl A00(X.C72215XYl r6) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC72846Xox.A00(X.XYl):X.XYl");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.XYl, X.1AI] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.XYl, X.1AI] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, X.XYl, X.1AI] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.XYl, X.1AI] */
    public final C72215XYl A01(C72215XYl c72215XYl) {
        boolean A1P;
        C72215XYl A06;
        if (c72215XYl == null) {
            return null;
        }
        C72215XYl A00 = A00(c72215XYl);
        if (A00 != null) {
            return A00;
        }
        boolean z = this instanceof XVH;
        if (z) {
            A1P = AbstractC167007dF.A1N(this.A00);
        } else if (this instanceof XVG) {
            A1P = AbstractC167007dF.A1P(this.A00, 3);
        } else {
            boolean z2 = this instanceof XVI;
            int i = this.A00;
            if (z2) {
                A1P = AbstractC167007dF.A1P(i, 5);
            } else {
                A1P = AbstractC167007dF.A1P(i, 3);
            }
        }
        if (A1P) {
            return A00;
        }
        if (z) {
            ?? obj = new Object();
            A06 = AbstractC72049XLp.A06(obj, c72215XYl, obj, 6);
        } else if (this instanceof XVG) {
            ?? obj2 = new Object();
            A06 = AbstractC72049XLp.A06(obj2, c72215XYl, obj2, 26);
        } else if (this instanceof XVI) {
            ?? obj3 = new Object();
            A06 = AbstractC72049XLp.A06(obj3, c72215XYl, obj3, 12);
        } else {
            ?? obj4 = new Object();
            A06 = AbstractC72049XLp.A06(obj4, c72215XYl, obj4, 6);
        }
        AbstractC72846Xox abstractC72846Xox = this.A01;
        if (abstractC72846Xox == null) {
            return A06;
        }
        return abstractC72846Xox.A01(A06);
    }

    public AbstractC72846Xox(AbstractC72846Xox abstractC72846Xox, int i) {
        this.A00 = i;
        this.A01 = abstractC72846Xox;
    }
}
