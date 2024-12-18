package X;

/* renamed from: X.5EF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EF extends C5AY implements InterfaceC1129358c, InterfaceC1129458d {
    public Bf4 A00;
    public InterfaceC60442pS A01;
    public final BZn A02;
    public final Integer A03;
    public final InterfaceC43457JHv A04;

    public C5EF(Bf4 bf4, Integer num) {
        C14360o3.A0B(bf4, 1);
        C14360o3.A0B(num, 2);
        this.A00 = bf4;
        this.A03 = num;
        C29448CyO c29448CyO = new C29448CyO(this);
        this.A04 = c29448CyO;
        String str = bf4.A05;
        BZn bZn = new BZn(c29448CyO, AbstractC28345Cf3.A00(new C45124Jxt((Integer) null, (Integer) null, 28, true, false)), num, AnonymousClass001.A0R("updates_hub_", str), str);
        A0F(bZn);
        this.A02 = bZn;
    }

    @Override // X.InterfaceC1129358c
    public final void DWO() {
        AbstractC137676Lo.A00(this, new C50162MDp(this, 22));
    }
}
