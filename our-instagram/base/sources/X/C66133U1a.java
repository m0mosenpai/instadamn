package X;

/* renamed from: X.U1a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66133U1a extends AbstractC64162vb {
    public final /* synthetic */ U1Z A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66133U1a(C1BX c1bx, U1Z u1z) {
        super(c1bx);
        this.A00 = u1z;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C69248VkH c69248VkH = (C69248VkH) obj;
        ((Number) obj2).intValue();
        C14360o3.A0B(c69248VkH, 0);
        String A0b = AbstractC31178DnM.A0b();
        Integer num = c69248VkH.A00;
        if (num == C05F.A00) {
            AbstractC66181U2w.A00(this.A00.A00, A0b, c69248VkH.A02, c69248VkH.A01, c69248VkH.A03);
            return;
        }
        if (num != C05F.A01) {
            return;
        }
        C18920wW c18920wW = this.A00.A00;
        String str = c69248VkH.A02;
        String str2 = c69248VkH.A01;
        AbstractC66181U2w.A00(c18920wW, A0b, str, str2, "");
        AbstractC65702TsY.A1P(c18920wW, "instagram_search_meta_ai_airplane_impression", str, str2, A0b);
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        ((Number) obj2).intValue();
    }
}
