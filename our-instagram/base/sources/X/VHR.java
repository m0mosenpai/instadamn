package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VHR implements InterfaceC02530Ab {
    public static final /* synthetic */ VHR[] A01;
    public final String A00;

    static {
        VHR vhr = new VHR("AMOUNT", 0, "amount");
        VHR vhr2 = new VHR("CURRENCY", 1, "currency");
        VHR vhr3 = new VHR("DISABLE_LOGGING", 2, "disable_logging");
        VHR vhr4 = new VHR("PRODUCT_ITEM_ID", 3, "product_item_id");
        VHR vhr5 = new VHR("FROM_CANVAS_PLAYER", 4, "from_canvas_player");
        VHR vhr6 = new VHR("QUANTITY", 5, "quantity");
        VHR vhr7 = new VHR("QUANTITY_MIN", 6, "quantity_min");
        VHR vhr8 = new VHR("QUANTITY_MAX", 7, "quantity_max");
        VHR vhr9 = new VHR("PRODUCT_URL", 8, "product_url");
        VHR vhr10 = new VHR("PAYMENTS_LITE_PRODUCT_ID", 9, "payments_lite_product_id");
        VHR vhr11 = new VHR("PAYMENTS_LITE_DEVELOPER_PRODUCT_ID", 10, "payments_lite_developer_product_id");
        VHR vhr12 = new VHR("REQUEST_ID", 11, TraceFieldType.RequestID);
        VHR vhr13 = new VHR("DEVELOPER_PAYLOAD", 12, "developer_payload");
        VHR vhr14 = new VHR("CLIENT_HASH", 13, "client_hash");
        VHR vhr15 = new VHR("CLIENT_TYPE", 14, "client_type");
        VHR vhr16 = new VHR("DERIVED_PACKAGE_NAMES", 15, "derived_package_names");
        VHR vhr17 = new VHR("INSTALLER_PACKAGE_NAME", 16, "installer_package_name");
        VHR vhr18 = new VHR("PACKAGE_NAME", 17, "package_name");
        VHR vhr19 = new VHR("SKU", 18, "sku");
        VHR vhr20 = new VHR("AD_ID", 19, "ad_id");
        VHR vhr21 = new VHR("CONTAINER_CONTEXT", 20, "container_context");
        VHR vhr22 = new VHR("CLIENT_RECEIVER_ID", 21, "client_receiver_id");
        VHR vhr23 = new VHR("MERCHANT_NAME", 22, "merchant_name");
        VHR vhr24 = new VHR("PROCESSING_MODE", 23, "processing_mode");
        VHR vhr25 = new VHR("SECURITY_ORIGIN", 24, "security_origin");
        VHR vhr26 = new VHR("PAYMENT_METHOD_ONLY", 25, "payment_method_only");
        VHR vhr27 = new VHR("ORDER_STUB_ID", 26, "order_stub_id");
        VHR[] vhrArr = new VHR[53];
        System.arraycopy(new VHR[]{new VHR("JS_HANDLE", 27, "js_handle"), new VHR("COOKIES", 28, "cookies"), new VHR("CHECKBOX_STATE", 29, "checkbox_state"), new VHR("IS_MONTHLY_SUBSCRIPTION", 30, "is_monthly_subscription"), new VHR("PRIVACY_ROW_INPUT", 31, "privacy_row_input"), new VHR("SOURCE_DATA", 32, "source_data"), new VHR("SOURCE_NAME", 33, "source_name"), new VHR("FEE_AMOUNT_COVERED", 34, "fee_amount_covered"), new VHR("FEE_AMOUNT_IF_DONOR_NOT_COVERING", 35, "fee_amount_if_donor_not_covering"), new VHR("FEE_AMOUNT_IF_DONOR_IS_COVERING", 36, "fee_amount_if_donor_is_covering"), new VHR("IS_DONOR_COVERING_FEES", 37, "is_donor_covering_fees"), new VHR("CAN_DONOR_COVER_FEES", 38, "can_donor_cover_fees"), new VHR("IS_ADDING_PROFILE_FUNDRAISER_SELECTED", 39, "is_adding_profile_fundraiser_selected"), new VHR("FEEDBACK_ID", 40, "feedback_id"), new VHR("SHOPPING_SESSION_ID", 41, "shopping_session_id"), new VHR("ENTRY_POINT", 42, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY), new VHR("RISK_FEATURES", 43, "risk_features"), new VHR("PRODUCTS", 44, "products"), new VHR("AD_TRACKING_TOKEN", 45, "ad_tracking_token"), new VHR("COMMERCE_REF_TYPE", 46, "commerce_ref_type"), new VHR("SELLER_ID", 47, "seller_id"), new VHR("SELECTED_SELLING_PLAN_IDS", 48, "selected_selling_plan_ids"), new VHR("PRODUCT_CUSTOMIZATION_INFO_IDS", 49, "product_customization_info_ids"), new VHR("APPROVAL_FLOW_ID", 50, "approval_flow_id"), new VHR("CONSENT_OTP", 51, "consent_otp"), new VHR("BUYER_INITIATED_OFFER", 52, "buyer_initiated_offer")}, AbstractC31175DnJ.A1b(new VHR[]{vhr, vhr2, vhr3, vhr4, vhr5, vhr6, vhr7, vhr8, vhr9, vhr10, vhr11, vhr12, vhr13, vhr14, vhr15, vhr16, vhr17, vhr18, vhr19, vhr20, vhr21, vhr22, vhr23, vhr24, vhr25, vhr26, vhr27}, vhrArr) ? 1 : 0, vhrArr, 27, 26);
        A01 = vhrArr;
    }

    public static VHR valueOf(String str) {
        return (VHR) Enum.valueOf(VHR.class, str);
    }

    public static VHR[] values() {
        return (VHR[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    public VHR(String str, int i, String str2) {
        this.A00 = str2;
    }
}
