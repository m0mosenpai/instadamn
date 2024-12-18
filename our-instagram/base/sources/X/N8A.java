package X;

/* loaded from: classes9.dex */
public final class N8A extends AbstractC193068gm {
    public final /* synthetic */ C54983OTr A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        C14360o3.A0B(abstractC115105If, 0);
        C0K8.A0F("InstagramConsentBloksActionLauncher", "Failure in prefetching consent payloads.", abstractC115105If.A01());
    }

    public N8A(C54983OTr c54983OTr, String str, String str2) {
        this.A00 = c54983OTr;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q c66246U5q = (C66246U5q) obj;
        C14360o3.A0B(c66246U5q, 0);
        this.A00.A02.put(this.A01, new C45127Jxw(c66246U5q, this.A02));
    }
}
