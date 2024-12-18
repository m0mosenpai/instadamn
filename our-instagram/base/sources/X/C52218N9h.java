package X;

/* renamed from: X.N9h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52218N9h extends C1P1 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C52011MzC A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C52218N9h(C52011MzC c52011MzC, long j, boolean z, boolean z2) {
        this.A01 = c52011MzC;
        this.A00 = j;
        this.A03 = z;
        this.A02 = z2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(52691871);
        C0K8.A0D("IgDevXAgentAppProxy", "Failed to fetch user for peer ID provided. Cannot start call from DevXAgent.");
        C0f9.A0A(-986322478, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-34741602);
        int A032 = C0f9.A03(741590910);
        this.A01.A00(this.A00, this.A03, this.A02);
        C0f9.A0A(-1101560984, A032);
        C0f9.A0A(98961794, A03);
    }
}
