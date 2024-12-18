package X;

/* renamed from: X.KEk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45545KEk extends C1P1 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ boolean A06;

    public C45545KEk(String str, String str2, String str3, String str4, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        this.A06 = z;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = j;
        this.A02 = str4;
        this.A05 = interfaceC16660sJ;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -363595952);
        if (this.A06) {
            String str2 = this.A04;
            String str3 = this.A03;
            K8I k8i = (K8I) abstractC115105If.A00();
            if (k8i != null) {
                str = k8i.A01;
            } else {
                str = null;
            }
            C0K8.A0O("IgMailboxEncryptedBackups", "Failed to get restoration url in background. Thread id: %s, otid: %s, URL response status code: %s, deliveryObjectId: %s, messageTimestampMs: %d, memMediaType: %s", str2, str3, str, this.A01, Long.valueOf(this.A00), this.A02);
        }
        this.A05.invoke(null);
        C0f9.A0A(-1093718833, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        String str;
        int A03 = C0f9.A03(-1830730513);
        K8I k8i = (K8I) obj;
        int A0N = AbstractC167017dG.A0N(k8i, -553659484);
        if (this.A06 && ((str = k8i.A00) == null || str.length() == 0)) {
            C0K8.A0O("IgMailboxEncryptedBackups", "Got empty restoration url in background. Thread id: %s, otid: %s, URL response status code: %s, deliveryObjectId: %s, messageTimestampMs: %d, memMediaType: %s", this.A04, this.A03, k8i.A01, this.A01, Long.valueOf(this.A00), this.A02);
        }
        this.A05.invoke(k8i.A00);
        C0f9.A0A(-1918115658, A0N);
        C0f9.A0A(494786523, A03);
    }
}
