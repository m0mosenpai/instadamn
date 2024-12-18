package X;

/* renamed from: X.KEh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45542KEh extends C1P1 {
    public final /* synthetic */ C6WQ A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public C45542KEh(C6WQ c6wq, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
        this.A00 = c6wq;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1308158818);
        C76833cV.A05(this.A00);
        C0f9.A0A(1793737360, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-777544533);
        int A032 = C0f9.A03(322254150);
        InterfaceC16820sZ interfaceC16820sZ = this.A01;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        } else {
            C76833cV.A05(this.A00);
        }
        C0f9.A0A(827121947, A032);
        C0f9.A0A(-1361102524, A03);
    }
}
