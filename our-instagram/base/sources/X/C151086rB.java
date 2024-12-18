package X;

/* renamed from: X.6rB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151086rB implements InterfaceC151096rC {
    public final int A00;
    public final C006802i A01;

    @Override // X.InterfaceC151096rC
    public final void CjI(String str) {
        C14360o3.A0B(str, 0);
        this.A01.markerPoint(31784979, this.A00, "http_request_faulted", str);
    }

    @Override // X.InterfaceC151096rC
    public final void Ci5() {
        this.A01.markerPoint(31784979, this.A00, "http_request_aborted");
    }

    @Override // X.InterfaceC151096rC
    public final void Cj9(String str) {
        this.A01.markerPoint(31784979, this.A00, "http_request_error", str);
    }

    @Override // X.InterfaceC151096rC
    public final void Ckj() {
        this.A01.markerPoint(31784979, this.A00, "http_request_cancel");
    }

    @Override // X.InterfaceC151096rC
    public final void Ckk() {
        this.A01.markerPoint(31784979, this.A00, "http_request_finish");
    }

    @Override // X.InterfaceC151096rC
    public final void Cko() {
        this.A01.markerPoint(31784979, this.A00, "http_request_start");
    }

    @Override // X.InterfaceC151096rC
    public final void ClN() {
        this.A01.markerPoint(31784979, this.A00, "http_request_run");
    }

    @Override // X.InterfaceC151096rC
    public final void ClO() {
        this.A01.markerPoint(31784979, this.A00, "http_request_run_finished");
    }

    @Override // X.InterfaceC151096rC
    public final void Clw() {
        this.A01.markerPoint(31784979, this.A00, "http_request_success");
    }

    public C151086rB(int i) {
        this.A00 = i;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A01 = c006802i;
    }
}
