package X;

/* loaded from: classes10.dex */
public enum RiW implements InterfaceC02530Ab {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    QUOTE("quote"),
    PAYMENT("payment"),
    /* JADX INFO: Fake field, exist only in values array */
    UPGRADE("upgrade"),
    /* JADX INFO: Fake field, exist only in values array */
    INCENTIVE("incentive"),
    /* JADX INFO: Fake field, exist only in values array */
    CATALOG("catalog"),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNGRADE("downgrade"),
    FULFILLMENT("fulfillment"),
    /* JADX INFO: Fake field, exist only in values array */
    FINALIZATION("finalization"),
    /* JADX INFO: Fake field, exist only in values array */
    REFUND("refund"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTIFICATION("notification"),
    /* JADX INFO: Fake field, exist only in values array */
    DCP_INITIATED_NOTIFICATION("dcp_initiated_notification"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIPTION_CANCELLATION("subscription_cancellation"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIPTION_RTU("subscription_rtu"),
    /* JADX INFO: Fake field, exist only in values array */
    UNBLOCK_STUCK_ORDER("unblock_stuck_order"),
    /* JADX INFO: Fake field, exist only in values array */
    DCP_ASYNC_SIGNAL_SCHEDULE("dcp_async_signal_schedule"),
    /* JADX INFO: Fake field, exist only in values array */
    DCP_ASYNC_SIGNAL_IDEMPOTENT_SCHEDULE("dcp_async_signal_idempotent_schedule"),
    /* JADX INFO: Fake field, exist only in values array */
    DCP_ASYNC_SIGNAL_CALLBACK("dcp_async_signal_callback"),
    /* JADX INFO: Fake field, exist only in values array */
    DCP_ASYNC_SUBSCRIPTION_FIP_PRECHECK("dcp_async_subscription_fip_precheck"),
    /* JADX INFO: Fake field, exist only in values array */
    LOGGED_OUT_FORM_ORDINARY_CANCELLATION("logged_out_form_ordinary_cancellation"),
    /* JADX INFO: Fake field, exist only in values array */
    LOGGED_OUT_FORM_EXTRAORDINARY_CANCELLATION("logged_out_form_extraordinary_cancellation"),
    /* JADX INFO: Fake field, exist only in values array */
    WWW_THRIFT_OFFLOAD("www_thrift_offload"),
    /* JADX INFO: Fake field, exist only in values array */
    SKU_MANAGEMENT("sku_management"),
    /* JADX INFO: Fake field, exist only in values array */
    SAFETYNET_EVENT_PROCESSOR("safetynet_event_processor");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    RiW(String str) {
        this.A00 = str;
    }
}
