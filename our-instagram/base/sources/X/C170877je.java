package X;

/* renamed from: X.7je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170877je extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170877je(Object obj, Object obj2, String str, int i, boolean z) {
        super(1);
        this.A03 = str;
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A04 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C2VK c2vk = (C2VK) obj;
        C14360o3.A0B(c2vk, 0);
        c2vk.E78(this.A02, this.A01, this.A03, this.A00, this.A04);
        return C0eB.A00;
    }
}
