package X;

/* renamed from: X.7h7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169337h7 extends AbstractC169347h8 implements InterfaceC169467hM {
    public final C1GL A00;
    public final InterfaceC169327h6 A01;

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        C14360o3.A0B(str, 0);
        return this.A01.AN3(str);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    public C169337h7(C1GL c1gl, InterfaceC169327h6 interfaceC169327h6, boolean z) {
        super(null, new C169487hO(), z, false);
        this.A00 = c1gl;
        this.A01 = interfaceC169327h6;
    }

    @Override // X.InterfaceC169467hM
    public final C1GL BqZ() {
        return this.A00;
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }

    public C169337h7(C1GL c1gl, InterfaceC169327h6 interfaceC169327h6, InterfaceC169497hP interfaceC169497hP) {
        super(null, interfaceC169497hP, true, true);
        this.A00 = c1gl;
        this.A01 = interfaceC169327h6;
    }

    public C169337h7(C1GL c1gl, InterfaceC169327h6 interfaceC169327h6) {
        super(null, new C169487hO(), false, true);
        this.A00 = c1gl;
        this.A01 = interfaceC169327h6;
    }
}
