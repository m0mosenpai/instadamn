package X;

/* loaded from: classes8.dex */
public final class JRH implements C6D4 {
    public final C43903JbE A00;

    @Override // X.C6D4
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 3) {
            C43903JbE c43903JbE = this.A00;
            return c43903JbE.A00.ABr(objArr[0], objArr[1], objArr[2]);
        }
        throw AbstractC25230BEn.A0n("Array of size 3 expected but got ", length);
    }

    public JRH(C43903JbE c43903JbE) {
        this.A00 = c43903JbE;
    }
}
