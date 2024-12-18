package X;

/* renamed from: X.Lfx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48669Lfx implements MQY {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C48669Lfx(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.MQY
    public final void DVx() {
        this.A00.invoke(KPW.A00);
    }

    @Override // X.MQY
    public final void onFailure() {
        this.A00.invoke(new KPV("Failed to create auto backup"));
    }

    @Override // X.MQY
    public final void onSuccess() {
        this.A00.invoke(KPX.A00);
    }
}
