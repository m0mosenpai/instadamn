package X;

import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;

/* renamed from: X.VwP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69839VwP {
    public static final FormCellLoggingEvents A00(String str) {
        return new FormCellLoggingEvents(new FormCellFocusEvents("user_click_shippingaddressdetails_atomic", "client_add_shippingaddressdetails_fail", "client_add_shippingaddressdetails_success", str));
    }

    public static C09530e4 A01(Object obj, String str) {
        return new C09530e4(obj, new FormCellLoggingEvents(new FormCellFocusEvents("client_add_credentialdetails_atomic", "client_add_credentialdetails_fail", "client_add_credentialdetails_success", str)));
    }
}
