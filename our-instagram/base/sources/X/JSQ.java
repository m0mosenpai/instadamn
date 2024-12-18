package X;

/* loaded from: classes8.dex */
public final class JSQ implements C6D4 {
    public final C43948Jbx A00;

    @Override // X.C6D4
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 4) {
            C43948Jbx c43948Jbx = this.A00;
            return c43948Jbx.A00.ABs(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
        throw AbstractC25230BEn.A0n("Array of size 4 expected but got ", length);
    }

    public JSQ(C43948Jbx c43948Jbx) {
        this.A00 = c43948Jbx;
    }
}
