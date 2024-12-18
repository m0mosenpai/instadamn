package X;

/* loaded from: classes12.dex */
public final class XNY implements C6D4 {
    public final C72091XNl A00;

    @Override // X.C6D4
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 2) {
            C72091XNl c72091XNl = this.A00;
            return c72091XNl.A00.apply(objArr[0], objArr[1]);
        }
        throw AbstractC25230BEn.A0n("Array of size 2 expected but got ", length);
    }

    public XNY(C72091XNl c72091XNl) {
        this.A00 = c72091XNl;
    }
}
