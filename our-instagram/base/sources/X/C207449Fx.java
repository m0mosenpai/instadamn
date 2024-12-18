package X;

/* renamed from: X.9Fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207449Fx extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207449Fx(Object obj, String str, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            String str = (String) obj;
            C14360o3.A0B(str, 0);
            ((C2ZI) this.A02).A0B(str, this.A03, this.A01);
        } else {
            InterfaceC113515Ao interfaceC113515Ao = (InterfaceC113515Ao) obj;
            C14360o3.A0B(interfaceC113515Ao, 0);
            AbstractC113575Au.A03(interfaceC113515Ao, this.A03);
            AbstractC113575Au.A02(interfaceC113515Ao, 0);
            AbstractC113575Au.A04(interfaceC113515Ao, null, new C57249PbX(this.A01, 13, this.A02));
        }
        return C0eB.A00;
    }
}
