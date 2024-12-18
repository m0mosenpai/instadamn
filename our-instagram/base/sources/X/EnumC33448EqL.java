package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EqL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33448EqL {
    public static final /* synthetic */ EnumC33448EqL[] A01;
    public static final EnumC33448EqL A02;
    public static final EnumC33448EqL A03;
    public final String A00;

    static {
        EnumC33448EqL A00 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A03 = A00;
        EnumC33448EqL A002 = A00("ADD_PAYMENT_METHOD", 1);
        EnumC33448EqL A003 = A00("B2C_BUY_AGAIN", 2);
        EnumC33448EqL A004 = A00("B2C_FB_CANCEL_ORDER", 3);
        EnumC33448EqL A005 = A00("B2C_FB_UPDATE_PAYMENT_METHOD", 4);
        EnumC33448EqL A006 = A00("B2C_GET_HELP_WITH_FB_ORDER", 5);
        EnumC33448EqL A007 = A00("B2C_GET_HELP_WITH_IG_ORDER", 6);
        EnumC33448EqL A008 = A00("B2C_IG_CANCEL_ORDER", 7);
        EnumC33448EqL A009 = A00("B2C_IG_UPDATE_PAYMENT_METHOD", 8);
        EnumC33448EqL A0010 = A00("B2C_NAVIGATE_TO_ORDER_ITEM", 9);
        EnumC33448EqL A0011 = A00("B2C_NAVIGATE_TO_ORDER_ITEM_V2", 10);
        EnumC33448EqL A0012 = A00("B2C_OPEN_FB_ORDER_DETAILS", 11);
        EnumC33448EqL A0013 = A00("B2C_OPEN_IG_ORDER_DETAILS", 12);
        EnumC33448EqL A0014 = A00("B2C_OPEN_ORDER_ITEM_DETAILS", 13);
        EnumC33448EqL A0015 = A00("B2C_RETURN_ORDER", 14);
        EnumC33448EqL A0016 = A00("CANCEL_SUBSCRIPTION", 15);
        EnumC33448EqL A0017 = A00("EXPANDED_VIEW", 16);
        EnumC33448EqL A0018 = A00("FB_SHOP_OPEN_REFERRAL_DETAILS", 17);
        EnumC33448EqL A0019 = A00("FB_SHOP_SHARE_REFERRAL", 18);
        EnumC33448EqL A0020 = A00("MANAGE_SUBSCRIPTION", 19);
        EnumC33448EqL A0021 = A00("OFFSITE_PAYMENT_STATUS", 20);
        EnumC33448EqL A0022 = A00("OPEN_RECEIPT", 21);
        A02 = A0022;
        EnumC33448EqL A0023 = A00("OPEN_RECEIPT_CARE", 22);
        EnumC33448EqL A0024 = A00("OPEN_UNAUTHORIZED_DISPUTE", 23);
        EnumC33448EqL A0025 = A00("P2P_ACCEPT_MONEY", 24);
        EnumC33448EqL A0026 = A00("P2P_ACCEPT_REQUEST", 25);
        EnumC33448EqL A0027 = A00("P2P_CANCEL_REQUEST", 26);
        EnumC33448EqL[] enumC33448EqLArr = new EnumC33448EqL[34];
        System.arraycopy(new EnumC33448EqL[]{A00("P2P_DECLINE_MONEY", 27), A00("P2P_DECLINE_REQUEST", 28), A00("P2P_SHOW_ANIMATION", 29), A00("P2P_UPDATE_CARD", 30), A00("P2P_VERIFY_INFO", 31), A00("SELLER_SUCCESS_MESSAGE_SELLER", 32), A00("URI", 33)}, AbstractC31175DnJ.A1b(new EnumC33448EqL[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, enumC33448EqLArr) ? 1 : 0, enumC33448EqLArr, 27, 7);
        A01 = enumC33448EqLArr;
    }

    public static EnumC33448EqL A00(String str, int i) {
        return new EnumC33448EqL(str, i, str);
    }

    public static EnumC33448EqL valueOf(String str) {
        return (EnumC33448EqL) Enum.valueOf(EnumC33448EqL.class, str);
    }

    public static EnumC33448EqL[] values() {
        return (EnumC33448EqL[]) A01.clone();
    }

    public EnumC33448EqL(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
