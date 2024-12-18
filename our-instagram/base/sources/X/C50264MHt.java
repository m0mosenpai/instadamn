package X;

/* renamed from: X.MHt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50264MHt extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50264MHt(long j, String str, String str2) {
        super(1);
        this.A02 = str;
        this.A00 = j;
        this.A01 = str2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C42221xC.A07(new C48454Lc7((C133255zr) obj, this.A02, this.A01, this.A00), AbstractC137146It.A00("upsert_instagram_user"));
    }
}
