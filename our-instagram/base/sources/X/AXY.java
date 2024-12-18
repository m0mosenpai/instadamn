package X;

/* loaded from: classes4.dex */
public final class AXY implements InterfaceC48212Jk {
    public final /* synthetic */ InterfaceC16820sZ A00;

    public AXY(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C0f5 AEp = C18950wb.A01.AEp("Ad eligibility query ValidateNewIgMediaForAdsEligibilityQuery failed", 652426058);
        String message = th.getMessage();
        if (message == null) {
            message = "null";
        }
        AEp.ABW("error_message", message);
        this.A00.invoke();
    }
}
