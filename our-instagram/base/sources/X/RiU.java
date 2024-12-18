package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class RiU implements InterfaceC02530Ab {
    public static final /* synthetic */ RiU[] A01;
    public static final RiU A02;
    public static final RiU A03;
    public final String A00;

    static {
        RiU riU = new RiU("UNKNOWN", 0, "unknown");
        RiU riU2 = new RiU("EXPIRATION", 1, "expiration");
        RiU riU3 = new RiU("PURCHASE", 2, "purchase");
        A03 = riU3;
        RiU riU4 = new RiU("REFUND", 3, "refund");
        RiU riU5 = new RiU("GOOGLE_CONFIRMATION", 4, "google_confirmation");
        RiU riU6 = new RiU("SPEND", 5, "spend");
        RiU riU7 = new RiU("BREAKAGE", 6, "breakage");
        RiU riU8 = new RiU("RENEWAL", 7, "renewal");
        RiU riU9 = new RiU("CANCELLATION", 8, "cancellation");
        RiU riU10 = new RiU("NOTIFICATION", 9, "notification");
        RiU riU11 = new RiU("CONSUME", 10, "consume");
        RiU riU12 = new RiU("XGRADE", 11, "xgrade");
        RiU riU13 = new RiU("UPGRADE", 12, "upgrade");
        RiU riU14 = new RiU("DOWNGRADE", 13, "downgrade");
        RiU riU15 = new RiU("PAUSE", 14, "pause");
        RiU riU16 = new RiU("GRACE_PERIOD", 15, "grace_period");
        RiU riU17 = new RiU("SEED", 16, "seed");
        RiU riU18 = new RiU("SUBS_MANAGEMENT", 17, "subs_management");
        RiU riU19 = new RiU("DCP_ASYNC_SIGNAL_INFRA", 18, "dcp_async_signal_infra");
        RiU riU20 = new RiU("LOYALTY_ACCOUNTS_MANAGEMENT", 19, "loyalty_accounts_management");
        RiU riU21 = new RiU("LOGGED_OUT_FORM_CANCELLATION", 20, "logged_out_form_cancellation");
        RiU riU22 = new RiU("REACTIVATE", 21, "reactivate");
        RiU riU23 = new RiU("CHARGEBACK_REVERSAL", 22, "chargeback_reversal");
        RiU riU24 = new RiU("IAP_SYNC", 23, "iap_sync");
        RiU riU25 = new RiU("SUBSCRIPTION_DETAILS", 24, "subscription_details");
        RiU riU26 = new RiU("SUBSCRIPTION_FULFILLED_PLAN_INFO", 25, "subscription_fulfilled_plan_info");
        RiU riU27 = new RiU("CATALOG", 26, "catalog");
        A02 = riU27;
        RiU riU28 = new RiU("SAFETYNET", 27, "safetynet");
        RiU[] riUArr = new RiU[28];
        System.arraycopy(new RiU[]{riU, riU2, riU3, riU4, riU5, riU6, riU7, riU8, riU9, riU10, riU11, riU12, riU13, riU14, riU15, riU16, riU17, riU18, riU19, riU20, riU21, riU22, riU23, riU24, riU25, riU26, riU27}, 0, riUArr, 0, 27);
        System.arraycopy(new RiU[]{riU28}, 0, riUArr, 27, 1);
        A01 = riUArr;
    }

    public static RiU valueOf(String str) {
        return (RiU) Enum.valueOf(RiU.class, str);
    }

    public static RiU[] values() {
        return (RiU[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    public RiU(String str, int i, String str2) {
        this.A00 = str2;
    }
}
