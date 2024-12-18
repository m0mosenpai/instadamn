package X;

/* renamed from: X.CtP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29158CtP implements InterfaceC66482zP {
    public final AbstractC151906sa A00;

    public C29158CtP(AbstractC151906sa abstractC151906sa) {
        C14360o3.A0B(abstractC151906sa, 1);
        this.A00 = abstractC151906sa;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A03;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C29158CtP c29158CtP = (C29158CtP) obj;
        C14360o3.A0B(c29158CtP, 0);
        AbstractC151906sa abstractC151906sa = this.A00;
        String str = abstractC151906sa.A03;
        AbstractC151906sa abstractC151906sa2 = c29158CtP.A00;
        if (C14360o3.A0K(str, abstractC151906sa2.A03) && C14360o3.A0K(abstractC151906sa.A01(), abstractC151906sa2.A01())) {
            return true;
        }
        return false;
    }
}
