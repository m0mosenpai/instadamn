package X;

/* loaded from: classes6.dex */
public abstract class F7M {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "canceled_during_loading";
            case 1:
                return "creator_dict_fetch_failed";
            case 2:
                return "fan_club_info_fetch_failed";
            case 3:
                return "localized_price_fetch_failed";
            case 4:
                return "unsupported_iap_failure";
            case 5:
                return "null_sku_failure";
            case 6:
                return "null_benefits_failure";
            case 7:
                return "null_fan_club_id_failure";
            default:
                return "null_member_count_failure";
        }
    }
}
