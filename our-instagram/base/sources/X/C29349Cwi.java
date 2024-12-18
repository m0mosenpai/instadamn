package X;

/* renamed from: X.Cwi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29349Cwi implements InterfaceC30998Djx {
    public final /* synthetic */ InterfaceC30998Djx A00;
    public final /* synthetic */ C27929CSo A01;

    public C29349Cwi(InterfaceC30998Djx interfaceC30998Djx, C27929CSo c27929CSo) {
        this.A01 = c27929CSo;
        this.A00 = interfaceC30998Djx;
    }

    @Override // X.InterfaceC30998Djx
    public final void DG4(String str) {
        C0K8.A0P("connectivity_prober", "Connectivity probe failed (%s).", str);
        C27929CSo c27929CSo = this.A01;
        C006802i c006802i = c27929CSo.A04;
        c006802i.markerAnnotate(79501264, "error_message", str);
        c006802i.markerAnnotate(79501264, AbstractC43591JPw.A00(201), c27929CSo.A02);
        c006802i.markerEnd(79501264, (short) 3);
        this.A00.DG4(str);
    }

    @Override // X.InterfaceC30998Djx
    public final void Dph(int i, int i2) {
        C0K8.A0P("connectivity_prober", MSV.A00(725), AbstractC25228BEl.A1Y(i));
        C006802i c006802i = this.A01.A04;
        c006802i.markerAnnotate(79501264, AbstractC58317Pt9.A00(13), i);
        c006802i.markerAnnotate(79501264, AbstractC43591JPw.A00(201), i2);
        c006802i.markerEnd(79501264, (short) 2);
        this.A00.Dph(i, i2);
    }
}
