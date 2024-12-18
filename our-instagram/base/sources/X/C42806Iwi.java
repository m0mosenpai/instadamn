package X;

/* renamed from: X.Iwi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42806Iwi implements GZO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C42806Iwi(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.GZO
    public final void Dpp(InterfaceC40821up interfaceC40821up) {
        if (this.A00 != 0) {
            if (this.A01 == EnumC77213d7.A03) {
                C9GR.A07(((C37600Ggv) this.A02).A00, 2131976207);
                return;
            }
            return;
        }
        ((C1P1) this.A02).onSuccess(interfaceC40821up);
    }

    @Override // X.GZO
    public final void onFail(AbstractC115105If abstractC115105If) {
        if (this.A00 == 0) {
            ((C1P1) this.A02).onFail(abstractC115105If);
        }
    }
}
