package X;

/* renamed from: X.AZu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23421AZu implements InterfaceC25159BBe {
    public final /* synthetic */ InterfaceC176207sd A00;
    public final /* synthetic */ C176097sS A01;

    public C23421AZu(InterfaceC176207sd interfaceC176207sd, C176097sS c176097sS) {
        this.A01 = c176097sS;
        this.A00 = interfaceC176207sd;
    }

    @Override // X.InterfaceC25159BBe
    public final void onFinished() {
        this.A00.onError(new AbstractC223559ty(20004, AnonymousClass001.A0g("prepareRecordingVideo can't be called in ", C9LW.A00(this.A01.A04), " state")));
    }
}
