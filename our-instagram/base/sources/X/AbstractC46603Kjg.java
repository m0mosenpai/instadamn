package X;

/* renamed from: X.Kjg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46603Kjg {
    public static final String A00(Integer num) {
        String str;
        switch (num.intValue()) {
            case 0:
                str = "QUERY_GIFTS_TRIGGER_REPOSITORY";
                break;
            case 1:
                str = "QUERY_GIFTS_LOAD_GIFT_IMAGE";
                break;
            default:
                str = "UPDATE_BALANCE_TRIGGER_REPOSITORY";
                break;
        }
        return AnonymousClass001.A0R(AbstractC167007dF.A0h(str), "_end");
    }
}
