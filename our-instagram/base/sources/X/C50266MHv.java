package X;

/* renamed from: X.MHv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50266MHv extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final long A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50266MHv(long j, long j2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        String str;
        int i = this.A00;
        C19670xu c19670xu = (C19670xu) obj;
        C14360o3.A0B(c19670xu, 0);
        long j2 = this.A01;
        InterfaceC105054oL interfaceC105054oL = c19670xu.A00;
        if (i != 0) {
            interfaceC105054oL.E7F("last_app_task_removal_timestamp", j2);
            j = this.A02;
            str = "last_app_task_removal_unixtime";
        } else {
            interfaceC105054oL.E7F("last_app_background_timestamp", j2);
            j = this.A02;
            str = "last_app_background_unixtime";
        }
        interfaceC105054oL.E7F(str, j);
        return C0eB.A00;
    }
}
