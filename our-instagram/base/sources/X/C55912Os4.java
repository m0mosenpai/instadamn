package X;

/* renamed from: X.Os4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55912Os4 implements InterfaceC151096rC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C54694ODu A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC151096rC
    public final void CjI(String str) {
        C14360o3.A0B(str, 0);
        C54428O3i c54428O3i = this.A01.A04;
        MSZ.A0V(c54428O3i.A00.A0A).A09(this.A02);
    }

    @Override // X.InterfaceC151096rC
    public final void Cko() {
    }

    @Override // X.InterfaceC151096rC
    public final void Clw() {
    }

    public C55912Os4(C54694ODu c54694ODu, String str, int i) {
        this.A01 = c54694ODu;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // X.InterfaceC151096rC
    public final void Ci5() {
        C54428O3i c54428O3i = this.A01.A04;
        String str = this.A02;
        int i = this.A00;
        InterfaceC09390do interfaceC09390do = c54428O3i.A00.A0A;
        MSZ.A0V(interfaceC09390do).A05(i, "http task aborted");
        MSZ.A0V(interfaceC09390do).A08(str);
    }

    @Override // X.InterfaceC151096rC
    public final void Cj9(String str) {
        C54428O3i c54428O3i = this.A01.A04;
        MSZ.A0V(c54428O3i.A00.A0A).A09(this.A02);
    }

    @Override // X.InterfaceC151096rC
    public final void Ckj() {
        C54428O3i c54428O3i = this.A01.A04;
        String str = this.A02;
        int i = this.A00;
        InterfaceC09390do interfaceC09390do = c54428O3i.A00.A0A;
        MSZ.A0V(interfaceC09390do).A05(i, "http task cancelled");
        MSZ.A0V(interfaceC09390do).A08(str);
    }

    @Override // X.InterfaceC151096rC
    public final void Ckk() {
        C54428O3i c54428O3i = this.A01.A04;
        MSZ.A0V(c54428O3i.A00.A0A).A0A(this.A02);
    }

    @Override // X.InterfaceC151096rC
    public final void ClN() {
        C54428O3i c54428O3i = this.A01.A04;
        MSZ.A0V(c54428O3i.A00.A0A).A04(this.A00);
    }

    @Override // X.InterfaceC151096rC
    public final void ClO() {
        C54428O3i c54428O3i = this.A01.A04;
        MSZ.A0V(c54428O3i.A00.A0A).A03(this.A00);
    }
}
