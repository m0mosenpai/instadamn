package X;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDB extends C03E implements InterfaceC16620sF {
    public static final MDB A00 = new MDB();

    public MDB() {
        super(2, LJK.class, "generateFbPayReferralUrl", "generateFbPayReferralUrl(Lcom/instagram/direct/model/DirectFbPayReferralShare;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C50679MYx c50679MYx = (C50679MYx) obj;
        AbstractC167017dG.A1N(c50679MYx, obj2);
        return AnonymousClass001.A0u("https://www.instagram.com/_n/fbpay_referral_details?referral_id=", c50679MYx.A00, "&sender_id=", c50679MYx.A01);
    }
}
