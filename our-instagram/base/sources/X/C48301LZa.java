package X;

/* renamed from: X.LZa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48301LZa implements InterfaceC66482zP {
    public final AbstractC46509Ki8 A00;
    public final EnumC46164Kc2 A01;
    public final Integer A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C48301LZa c48301LZa = (C48301LZa) obj;
        C14360o3.A0B(c48301LZa, 0);
        return AbstractC167007dF.A1X(this.A01, c48301LZa.A01);
    }

    public C48301LZa(AbstractC46509Ki8 abstractC46509Ki8, EnumC46164Kc2 enumC46164Kc2, Integer num) {
        this.A00 = abstractC46509Ki8;
        this.A01 = enumC46164Kc2;
        this.A02 = num;
    }
}
