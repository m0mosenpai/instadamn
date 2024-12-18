package X;

/* renamed from: X.IoC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42288IoC implements InterfaceC66482zP {
    public final C38652Gyt A00;

    public C42288IoC(C38652Gyt c38652Gyt) {
        C14360o3.A0B(c38652Gyt, 1);
        this.A00 = c38652Gyt;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A03;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38652Gyt c38652Gyt;
        C42288IoC c42288IoC = (C42288IoC) obj;
        C38652Gyt c38652Gyt2 = this.A00;
        if (c42288IoC != null) {
            c38652Gyt = c42288IoC.A00;
        } else {
            c38652Gyt = null;
        }
        return C14360o3.A0K(c38652Gyt2, c38652Gyt);
    }
}
