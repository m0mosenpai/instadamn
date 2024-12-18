package X;

/* renamed from: X.9G0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9G0 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9G0(Object obj, String str, int i, int i2, boolean z) {
        super(1);
        this.A00 = i2;
        this.A03 = str;
        this.A01 = i;
        this.A02 = obj;
        this.A04 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean AG4;
        switch (this.A00) {
            case 0:
                C2VK c2vk = (C2VK) obj;
                C14360o3.A0B(c2vk, 0);
                AG4 = c2vk.AG3(this.A02, this.A03, this.A01, this.A04);
                break;
            case 1:
                C2VK c2vk2 = (C2VK) obj;
                C14360o3.A0B(c2vk2, 0);
                AG4 = c2vk2.AG4(this.A03, (InterfaceC16660sJ) this.A02, this.A01, this.A04);
                break;
            default:
                C2VK c2vk3 = (C2VK) obj;
                C14360o3.A0B(c2vk3, 0);
                return c2vk3.Ajj(this.A02, this.A03, this.A01, this.A04);
        }
        return Boolean.valueOf(AG4);
    }
}
