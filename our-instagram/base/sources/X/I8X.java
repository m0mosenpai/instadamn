package X;

/* loaded from: classes7.dex */
public abstract class I8X {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "BUSINESS_MANAGER";
                    break;
                case 2:
                    str2 = "SHARED_WITH_BUSINESS";
                    break;
                default:
                    str2 = "FACEBOOK_PAGE";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        C0w9.A03("CatalogSource", AnonymousClass001.A0R("Unexpected review status: ", str));
        return C05F.A00;
    }
}
