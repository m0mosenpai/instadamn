package X;

/* renamed from: X.9GE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GE extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9GE(Object obj, String str, String str2, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A03 = str;
        this.A01 = obj;
        this.A02 = str2;
        this.A04 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                C2VK c2vk = (C2VK) obj;
                C14360o3.A0B(c2vk, 0);
                c2vk.FBB((InterfaceC1124255u) this.A01, this.A03, this.A02, this.A04);
                break;
            case 1:
                C2VK c2vk2 = (C2VK) obj;
                C14360o3.A0B(c2vk2, 0);
                c2vk2.FBC((InterfaceC1124255u) this.A01, this.A03, this.A02, this.A04);
                break;
            default:
                C166137bh c166137bh = (C166137bh) obj;
                C14360o3.A0B(c166137bh, 0);
                return AbstractC166327c1.A06(c166137bh, this.A03, this.A02, new DHP(5, this.A01, this.A04));
        }
        return C0eB.A00;
    }
}
