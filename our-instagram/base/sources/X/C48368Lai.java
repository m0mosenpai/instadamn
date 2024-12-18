package X;

/* renamed from: X.Lai, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48368Lai implements C6D2 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Boolean A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C48368Lai(Boolean bool, String str, String str2, String str3, long j) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = bool;
        this.A03 = str2;
        this.A04 = str3;
    }

    @Override // X.C6D2
    public final Object apply(Object obj) {
        long j = this.A00;
        String str = this.A02;
        Boolean bool = this.A01;
        String str2 = this.A03;
        String str3 = this.A04;
        return C42221xC.A07(new C48468LcL(obj, bool, str, str2, str3, 1, j), AbstractC137146It.A00("rxmailbox_add_reaction_message"));
    }
}
