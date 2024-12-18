package X;

/* renamed from: X.IlR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42117IlR implements C2JL {
    public final /* synthetic */ C2OR A00;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
    }

    public C42117IlR(C2OR c2or) {
        this.A00 = c2or;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C40993IDo c40993IDo = (C40993IDo) obj;
        if (c40993IDo != null) {
            C40992IDn c40992IDn = c40993IDo.A00;
            if (c40992IDn != null) {
                C2OR c2or = this.A00;
                C41056IFz c41056IFz = c40992IDn.A00;
                if (c41056IFz != null) {
                    C2OR.A00(c2or, c41056IFz.A00, c41056IFz.A01);
                    return;
                }
                str = "quietTimeSettings";
            } else {
                str = "data";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
