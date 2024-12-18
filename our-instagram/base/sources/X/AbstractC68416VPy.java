package X;

/* renamed from: X.VPy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68416VPy {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(1);
        if (!(A03 instanceof String)) {
            A03 = null;
        }
        boolean A0K = C14360o3.A0K(A03, AbstractC111324zv.A00(501));
        AbstractC10360h2 parentFragmentManager = C6BQ.A00(C6BQ.A09(c6fq)).getParentFragmentManager();
        if (A0K || C14360o3.A0K(A03, AbstractC111324zv.A00(259))) {
            while (true) {
                if (parentFragmentManager.A0L() <= 0) {
                    break;
                }
                Object A0S = parentFragmentManager.A0S(parentFragmentManager.A0L() - 1);
                C14360o3.A07(A0S);
                if (C14360o3.A0K(((AbstractC016706m) A0S).A09, AbstractC111324zv.A00(159))) {
                    if (A0K) {
                        parentFragmentManager.A12();
                        return null;
                    }
                } else {
                    parentFragmentManager.A12();
                }
            }
        } else {
            AbstractC70132W6e.A00(C6BQ.A04(c6fq), parentFragmentManager);
        }
        return null;
    }
}
