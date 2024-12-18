package X;

/* renamed from: X.Lxq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49721Lxq implements InterfaceC42241xE {
    public final /* synthetic */ C41761wQ A00;
    public final /* synthetic */ C7IT A01;
    public final /* synthetic */ C3o9 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C49721Lxq(C41761wQ c41761wQ, C7IT c7it, C3o9 c3o9, String str, String str2, String str3) {
        this.A03 = str;
        this.A01 = c7it;
        this.A02 = c3o9;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = c41761wQ;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
        if (this.A03 == null && !(interfaceC132965zL instanceof C48496Lcn)) {
            Object A01 = AbstractC132975zM.A01(interfaceC132965zL);
            C14360o3.A07(A01);
            String str = (String) A01;
            C7IT c7it = this.A01;
            C3o9 c3o9 = this.A02;
            String str2 = this.A05;
            String str3 = this.A04;
            if (C7IT.A01(c7it, c3o9)) {
                AbstractC46920Kp1.A00(c7it.A00).A00(JRE.A03(c3o9), str, str2, str3);
                c7it.A02.Avk().E40();
            }
        } else if (interfaceC132965zL instanceof C48496Lcn) {
            C0w9.A08("Failed to send Armadillo Text message", (Throwable) AbstractC132975zM.A00(interfaceC132965zL));
        }
        this.A00.A01();
    }
}
