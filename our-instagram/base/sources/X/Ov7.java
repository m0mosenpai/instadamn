package X;

/* loaded from: classes9.dex */
public final class Ov7 implements InterfaceC66482zP {
    public final Integer A00;
    public final String A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(AbstractC53850Nre.A00(this.A00));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Ov7 ov7 = (Ov7) obj;
        C14360o3.A0B(ov7, 0);
        return AbstractC167007dF.A1P(AbstractC53850Nre.A00(this.A00), AbstractC53850Nre.A00(ov7.A00));
    }

    public Ov7(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }
}
