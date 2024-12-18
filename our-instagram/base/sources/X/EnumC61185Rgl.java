package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rgl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61185Rgl {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC61185Rgl[] A03;
    public static final EnumC61185Rgl A04;
    public static final EnumC61185Rgl A05;
    public static final EnumC61185Rgl A06;
    public static final EnumC61185Rgl A07;
    public static final EnumC61185Rgl A08;
    public static final EnumC61185Rgl A09;
    public static final EnumC61185Rgl A0A;
    public static final EnumC61185Rgl A0B;
    public static final EnumC61185Rgl A0C;
    public static final EnumC61185Rgl A0D;
    public static final EnumC61185Rgl A0E;
    public static final EnumC61185Rgl A0F;
    public static final EnumC61185Rgl A0G;
    public static final EnumC61185Rgl A0H;
    public static final EnumC61185Rgl A0I;
    public static final EnumC61185Rgl A0J;
    public static final EnumC61185Rgl A0K;
    public static final EnumC61185Rgl A0L;
    public static final EnumC61185Rgl A0M;
    public static final EnumC61185Rgl A0N;
    public static final EnumC61185Rgl A0O;
    public static final EnumC61185Rgl A0P;
    public static final EnumC61185Rgl A0Q;
    public final String A00;
    public final boolean A01;

    static {
        EnumC61185Rgl enumC61185Rgl = new EnumC61185Rgl("BILLING_CLIENT_DISCONNECTED", "Google Billing client disconnected or unavailable", 0, true);
        A04 = enumC61185Rgl;
        EnumC61185Rgl enumC61185Rgl2 = new EnumC61185Rgl("CONSUME_FAILURE", "Failed to consume Google purchase, refund will issue in 3 days", 1, true);
        A06 = enumC61185Rgl2;
        EnumC61185Rgl enumC61185Rgl3 = new EnumC61185Rgl("CONSUME_SKIPPED", "No purchases need to be consumed", 2, false);
        A07 = enumC61185Rgl3;
        EnumC61185Rgl enumC61185Rgl4 = new EnumC61185Rgl("DCP_NOT_ENABLED", "DCP is not enabled for user", 3, true);
        A08 = enumC61185Rgl4;
        EnumC61185Rgl enumC61185Rgl5 = new EnumC61185Rgl("DCP_NOT_ENABLED_FOR_COUNTRY", "DCP is not enabled for the user country", 4, true);
        A09 = enumC61185Rgl5;
        EnumC61185Rgl enumC61185Rgl6 = new EnumC61185Rgl("FB_SYNC_FAILED", "Sync with FB server failed", 5, true);
        A0A = enumC61185Rgl6;
        EnumC61185Rgl enumC61185Rgl7 = new EnumC61185Rgl("FETCH_INTERNAL_BILLING_INFO_FAILED", "Failed to fetch internal billing info", 6, true);
        A0B = enumC61185Rgl7;
        EnumC61185Rgl enumC61185Rgl8 = new EnumC61185Rgl("IAB_INIT_FAILED", "Error while initializing connection with Google", 7, true);
        A0C = enumC61185Rgl8;
        EnumC61185Rgl enumC61185Rgl9 = new EnumC61185Rgl("IAB_PRODUCT_FETCH_FAILED", "Unable to retrieve user purchases from Google", 8, true);
        A0D = enumC61185Rgl9;
        EnumC61185Rgl enumC61185Rgl10 = new EnumC61185Rgl("MALFORMED_DATA", "Data didn't parse properly", 9, true);
        A0F = enumC61185Rgl10;
        EnumC61185Rgl enumC61185Rgl11 = new EnumC61185Rgl("NETWORK_FAILURE", "Network failure, failed to sync with fb", 10, true);
        A0G = enumC61185Rgl11;
        EnumC61185Rgl enumC61185Rgl12 = new EnumC61185Rgl("PENDING_PURCHASE", "Purchase pending on google play", 11, true);
        A0H = enumC61185Rgl12;
        EnumC61185Rgl enumC61185Rgl13 = new EnumC61185Rgl("SERVER_QUOTING_FAILED", "Failed to create quote", 12, true);
        A0J = enumC61185Rgl13;
        EnumC61185Rgl enumC61185Rgl14 = new EnumC61185Rgl("SERVER_VERIFICATION_FAILED", "Failed to verify purchase", 13, true);
        A0K = enumC61185Rgl14;
        EnumC61185Rgl enumC61185Rgl15 = new EnumC61185Rgl("SUCCESSFUL", "", 14, false);
        A0L = enumC61185Rgl15;
        EnumC61185Rgl enumC61185Rgl16 = new EnumC61185Rgl("USER_CANCELLED_PAYMENT", "User cancelled the payment", 15, true);
        A0P = enumC61185Rgl16;
        EnumC61185Rgl enumC61185Rgl17 = new EnumC61185Rgl("USER_PAYMENT_FAILED", "Purchase was unsuccessful in user flow", 16, true);
        A0Q = enumC61185Rgl17;
        EnumC61185Rgl enumC61185Rgl18 = new EnumC61185Rgl("INVALID_OFFER_TOKEN", "No valid offer token to purchase subs products", 17, true);
        A0E = enumC61185Rgl18;
        EnumC61185Rgl enumC61185Rgl19 = new EnumC61185Rgl("UNKNOWN_FAILURE", "Got Unknown State from google", 18, true);
        A0O = enumC61185Rgl19;
        EnumC61185Rgl enumC61185Rgl20 = new EnumC61185Rgl("BILLING_UNAVAILABLE", "Billing API version is not supported for the type requested", 19, true);
        A05 = enumC61185Rgl20;
        EnumC61185Rgl enumC61185Rgl21 = new EnumC61185Rgl("PENDING_PURCHASE_ON_SKU", "Failure to purchase since item is already owned or active subscription on the same sku", 20, true);
        A0I = enumC61185Rgl21;
        EnumC61185Rgl enumC61185Rgl22 = new EnumC61185Rgl("SYNCHRONIZATION_SUCCESS", "Action to synchronize payments with Google completed successfully", 21, false);
        A0N = enumC61185Rgl22;
        EnumC61185Rgl enumC61185Rgl23 = new EnumC61185Rgl("SYNCHRONIZATION_FAILED", "Action to synchronize payments with Google completed unsuccessfully", 22, true);
        A0M = enumC61185Rgl23;
        EnumC61185Rgl[] enumC61185RglArr = {enumC61185Rgl, enumC61185Rgl2, enumC61185Rgl3, enumC61185Rgl4, enumC61185Rgl5, enumC61185Rgl6, enumC61185Rgl7, enumC61185Rgl8, enumC61185Rgl9, enumC61185Rgl10, enumC61185Rgl11, enumC61185Rgl12, enumC61185Rgl13, enumC61185Rgl14, enumC61185Rgl15, enumC61185Rgl16, enumC61185Rgl17, enumC61185Rgl18, enumC61185Rgl19, enumC61185Rgl20, enumC61185Rgl21, enumC61185Rgl22, enumC61185Rgl23};
        A03 = enumC61185RglArr;
        A02 = AbstractC12190kN.A00(enumC61185RglArr);
    }

    public static EnumC61185Rgl valueOf(String str) {
        return (EnumC61185Rgl) Enum.valueOf(EnumC61185Rgl.class, str);
    }

    public static EnumC61185Rgl[] values() {
        return (EnumC61185Rgl[]) A03.clone();
    }

    public EnumC61185Rgl(String str, String str2, int i, boolean z) {
        this.A00 = str2;
        this.A01 = z;
    }
}
