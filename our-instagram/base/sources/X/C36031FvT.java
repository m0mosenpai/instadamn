package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.FvT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36031FvT implements MPY {
    public final /* synthetic */ InterfaceC65569Tn2 A00;
    public final /* synthetic */ C62862tP A01;
    public final /* synthetic */ C35229FgM A02;
    public final /* synthetic */ C65981Txa A03;

    @Override // X.MPY
    public final void AUp(C60925Rbf c60925Rbf) {
        C14360o3.A0B(c60925Rbf, 0);
        C35229FgM c35229FgM = this.A02;
        C006802i c006802i = c35229FgM.A04;
        if (c006802i == null) {
            C14360o3.A0F("qpl");
            throw C00O.createAndThrow();
        }
        String Bqk = this.A00.Bqk();
        if (Bqk == null) {
            Bqk = "";
        }
        c006802i.markerAnnotate(896612552, TraceFieldType.FailureReason, AnonymousClass001.A0u("Failed to load ", Bqk, ". Error: ", c60925Rbf.A00.getMessage()));
        C35229FgM.A01(c35229FgM);
    }

    public C36031FvT(InterfaceC65569Tn2 interfaceC65569Tn2, C62862tP c62862tP, C35229FgM c35229FgM, C65981Txa c65981Txa) {
        this.A00 = interfaceC65569Tn2;
        this.A01 = c62862tP;
        this.A02 = c35229FgM;
        this.A03 = c65981Txa;
    }

    @Override // X.MPY
    public final void EpI() {
        this.A00.E2V(this.A01.A03, this.A03, VRA.A00(this.A02.A0D, false));
    }
}
