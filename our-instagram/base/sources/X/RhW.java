package X;

import com.facebook.proxygen.TraceFieldType;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class RhW {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ RhW[] A02;
    public static final RhW A0c;
    public static final RhW A0u;
    public String A00;
    public static final RhW A0A = A00("ACTION_INITIALIZATION_STARTED", "initialization_started", 0);
    public static final RhW A09 = A00("ACTION_INITIALIZATION_RESTARTED", "initialization_restarted", 1);
    public static final RhW A0C = A00("ACTION_STORE_INIT_CONNECTION_ESTABLISHED", "store_init_connection_established", 2);
    public static final RhW A0D = A00("ACTION_STORE_INIT_CONNECTION_FAILED", "store_init_connection_failed", 3);
    public static final RhW A0E = A00("ACTION_STORE_INIT_PURCHASES_FAILED", "store_init_purchases_failed", 4);
    public static final RhW A0F = A00("ACTION_STORE_INIT_PURCHASES_FETCHED", "store_init_purchases_fetched", 5);
    public static final RhW A08 = A00("ACTION_INITIALIZATION_FAILED", "initialization_failed", 6);
    public static final RhW A0B = A00("ACTION_INITIALIZATION_SUCCESS", "initialization_success", 7);
    public static final RhW A0H = A00("ACTION_SYNCHRONIZATION_INITIATED", "synchronization_initiated", 8);
    public static final RhW A0G = A00("ACTION_SYNCHRONIZATION_FAILED", "synchronization_failed", 9);
    public static final RhW A0I = A00("ACTION_SYNCHRONIZATION_SUCCESS", "synchronization_success", 10);
    public static final RhW A06 = A00("ACTION_EXTERNAL_CONSUME_INITIATED", "external_consume_initiated", 11);
    public static final RhW A05 = A00("ACTION_EXTERNAL_CONSUME_FAILED", "external_consume_failed", 12);
    public static final RhW A07 = A00("ACTION_EXTERNAL_CONSUME_SUCCESS", "external_consume_success", 13);
    public static final RhW A04 = A00("ACTION_ASYNC_OPERATION_STARTED", "async_operation_started", 14);
    public static final RhW A03 = A00("ACTION_ASYNC_OPERATION_ENDED", "async_operation_ended", 15);
    public static final RhW A0M = A00("BILLING_CLIENT_RETRY_TYPE", "billing_client_retry_type", 16);
    public static final RhW A0J = A00("BILLING_CLIENT_ATTEMPTS", "billing_client_attempts", 17);
    public static final RhW A0L = A00("BILLING_CLIENT_RETRY_DELAY", "billing_client_retry_delay", 18);
    public static final RhW A0K = A00("BILLING_CLIENT_CONNECTION_API_TRIGGER", "billing_client_connection_api_trigger", 19);
    public static final RhW A0N = A00("BILLING_LIBRARY_ENDPOINT", "billing_library_endpoint", 20);
    public static final RhW A0O = A00("CATALOG_IDS", "catalog_ids", 21);
    public static final RhW A0P = A00("CATALOG_TYPE", "catalog_type", 22);
    public static final RhW A0Q = A00("DCP_ORDER_ID", "dcp_order_id", 23);
    public static final RhW A0R = A00("ERROR_CODE", TraceFieldType.ErrorCode, 24);
    public static final RhW A0S = A00("ERROR_MESSAGE", "error_message", 25);
    public static final RhW A0T = A00("EXCEPTION_TRACE", "exception_trace", 26);
    public static final RhW A0U = A00("EXTERNAL_PRODUCT_ID", "external_product_id", 27);
    public static final RhW A0V = A00("EXTERNAL_TRANSACTION_ID", "external_transaction_id", 28);
    public static final RhW A0W = A00("EXTERNAL_TRANSACTION_IDS", "external_transaction_ids", 29);
    public static final RhW A0Y = A00("GOOGLE_PLAY_SERVICES_AVAILABILITY_STATUS", "google_play_services_availability_status", 30);
    public static final RhW A0X = A00("GAME_SESSION_ID", "game_session_id", 31);
    public static final RhW A0Z = A00("HAS_PLAY_STORE_ENABLED", "has_play_store_enabled", 32);
    public static final RhW A0a = A00("IS_MOCK_PURCHASE", "is_mock_purchase", 33);
    public static final RhW A0b = A00("IS_MODDED_APP", "is_modded_app", 34);
    public static final RhW A0d = A00("IS_RETRY", "is_retry", 35);
    public static final RhW A0e = A00("OFFER_ID", "offer_id", 36);
    public static final RhW A0f = A00("OLD_EXTERNAL_PRODUCT_ID", "old_external_product_id", 37);
    public static final RhW A0h = A00("PAYMENT_ID", "payment_id", 38);
    public static final RhW A0g = A00("PAYEE_ID", "payee_id", 39);
    public static final RhW A0k = A00("PRODUCT_ID", "product_id", 40);
    public static final RhW A0l = A00("PRODUCT_IDS", "product_ids", 41);
    public static final RhW A0m = A00("PRODUCT_SESSION_ID", "product_session_id", 42);
    public static final RhW A0i = A00("PRICE", "price", 43);
    public static final RhW A0j = A00("PRICE_CURRENCY_CODE", "currency_code", 44);
    public static final RhW A0n = A00("PRODUCT_TYPE", "product_type", 45);
    public static final RhW A0o = A00("PURCHASE_MESSAGE", "purchase_message", 46);
    public static final RhW A0q = A00("PURCHASE_TOKEN", "purchase_token", 47);
    public static final RhW A0p = A00("PURCHASE_RESPONSE", "purchase_response", 48);
    public static final RhW A0r = A00("QUOTE_ID", "quote_id", 49);
    public static final RhW A0s = A00("REASON", "reason", 50);
    public static final RhW A0t = A00("REQUEST_ID", TraceFieldType.RequestID, 51);

    static {
        RhW A00 = A00("SESSION_ID", AbstractC58361Pu1.A00(), 52);
        A0u = A00;
        RhW A002 = A00("IS_PREFETCH_QUOTE", "is_prefetch_quote", 53);
        A0c = A002;
        RhW[] rhWArr = new RhW[54];
        System.arraycopy(new RhW[]{A0A, A09, A0C, A0D, A0E, A0F, A08, A0B, A0H, A0G, A0I, A06, A05, A07, A04, A03, A0M, A0J, A0L, A0K, A0N, A0O, A0P, A0Q, A0R, A0S, A0T}, 0, rhWArr, 0, 27);
        System.arraycopy(new RhW[]{A0U, A0V, A0W, A0Y, A0X, A0Z, A0a, A0b, A0d, A0e, A0f, A0h, A0g, A0k, A0l, A0m, A0i, A0j, A0n, A0o, A0q, A0p, A0r, A0s, A0t, A00, A002}, 0, rhWArr, 27, 27);
        A02 = rhWArr;
        A01 = AbstractC12190kN.A00(rhWArr);
    }

    public static RhW A00(String str, String str2, int i) {
        return new RhW(str, i, str2);
    }

    public static RhW valueOf(String str) {
        return (RhW) Enum.valueOf(RhW.class, str);
    }

    public static RhW[] values() {
        return (RhW[]) A02.clone();
    }

    public RhW(String str, int i, String str2) {
        this.A00 = str2;
    }
}
