package X;

/* renamed from: X.Enr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33296Enr extends GFY {
    public final /* synthetic */ C31535DtK A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33296Enr(C31535DtK c31535DtK) {
        super(c31535DtK);
        this.A00 = c31535DtK;
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        YFT yft = (YFT) interfaceC40821up;
        AbstractC167017dG.A1N(str, yft);
        C31535DtK c31535DtK = this.A00;
        C34672FPh c34672FPh = c31535DtK.A0G;
        if (c34672FPh == null) {
            C14360o3.A0F("tailLoadPerfLogger");
            throw C00O.createAndThrow();
        }
        int size = yft.getItems().size();
        int i = c34672FPh.A00;
        if (i != 0) {
            C006802i c006802i = c34672FPh.A01;
            c006802i.markerPoint(i, AbstractC111324zv.A00(3018));
            c006802i.markerAnnotate(c34672FPh.A00, AbstractC111324zv.A00(3023), size);
        }
        C31535DtK.A0G(c31535DtK, yft, str);
    }
}
