package X;

/* renamed from: X.CbY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28185CbY {
    public final InterfaceC60442pS A00;
    public final C1M0 A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final C25605BTs A06;

    public C28185CbY(C26025BfE c26025BfE) {
        String A00;
        C14360o3.A0B(c26025BfE, 1);
        C25605BTs c25605BTs = new C25605BTs(c26025BfE.A0G, c26025BfE.A0d, c26025BfE.A0Z, c26025BfE.A0f);
        this.A06 = c25605BTs;
        this.A00 = c25605BTs;
        if (c25605BTs.A00) {
            A00 = "self_comments_v2";
        } else {
            A00 = AbstractC111324zv.A00(834);
        }
        this.A04 = A00;
        this.A03 = AbstractC167017dG.A0j();
        this.A01 = C1M0.A01.A01(c26025BfE.A0E);
        this.A05 = c26025BfE.A0c;
        this.A02 = c26025BfE.A03;
    }

    public static InterfaceC60442pS A00(InterfaceC09390do interfaceC09390do) {
        return ((C28185CbY) interfaceC09390do.getValue()).A00;
    }
}
