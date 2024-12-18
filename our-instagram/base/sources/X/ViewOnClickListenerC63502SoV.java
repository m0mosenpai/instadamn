package X;

import android.view.View;
import com.fbpay.hub.form.params.FormLogEvents;
import java.util.LinkedHashMap;

/* renamed from: X.SoV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC63502SoV implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public ViewOnClickListenerC63502SoV(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                View view2 = (View) this.A01;
                boolean z = this.A02;
                C193328hC c193328hC = new C193328hC(view2.getContext());
                int i2 = 2131968696;
                if (z) {
                    i2 = 2131973147;
                }
                c193328hC.A0A(i2);
                int i3 = 2131968695;
                if (z) {
                    i3 = 2131973146;
                }
                c193328hC.A09(i3);
                AbstractC31176DnK.A17(new DialogInterfaceOnClickListenerC35301Fha(1), c193328hC, 2131973145);
                return;
            case 1:
                A05 = C0f9.A05(1070164980);
                View view3 = (View) this.A01;
                boolean z2 = this.A02;
                C193328hC c193328hC2 = new C193328hC(view3.getContext());
                int i4 = 2131968696;
                if (z2) {
                    i4 = 2131973147;
                }
                c193328hC2.A0A(i4);
                int i5 = 2131968695;
                if (z2) {
                    i5 = 2131973146;
                }
                c193328hC2.A09(i5);
                AbstractC31176DnK.A17(DialogInterfaceOnClickListenerC63423Sk1.A00, c193328hC2, 2131973145);
                i = 1488421587;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(258322339);
                REL rel = (REL) this.A01;
                boolean z3 = this.A02;
                LinkedHashMap A08 = AbstractC58442PvL.A08(rel.A00);
                A08.put("target_name", "add_email");
                rel.A03.Chz("user_add_contact_enter", A08);
                REL.A00(rel, S21.A00(rel.A00, new FormLogEvents("fbpay_add_email_cancel", "fbpay_delete_email_cancel", "fbpay_delete_email_click", "fbpay_add_email_display", "fbpay_delete_email_api_init", "fbpay_delete_email_display", "fbpay_delete_email_failure", "fbpay_delete_email_success", "fbpay_add_email_api_init", "fbpay_add_email_click", "fbpay_add_email_failure", "fbpay_add_email_success"), null, null, z3));
                i = -1158973624;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(-464675253);
                REL rel2 = (REL) this.A01;
                boolean z4 = this.A02;
                LinkedHashMap A082 = AbstractC58442PvL.A08(rel2.A00);
                A082.put("target_name", "add_phone");
                rel2.A03.Chz("user_add_contact_enter", A082);
                REL.A00(rel2, S22.A00(rel2.A00, new FormLogEvents("fbpay_add_phone_cancel", "fbpay_delete_phone_cancel", "fbpay_delete_phone_click", "fbpay_add_phone_display", "fbpay_delete_phone_api_init", "fbpay_delete_phone_display", "fbpay_delete_phone_failure", "fbpay_delete_phone_success", "fbpay_add_phone_api_init", "fbpay_add_phone_click", "fbpay_add_phone_failure", "fbpay_add_phone_success"), null, null, z4));
                i = -1343180615;
                C0f9.A0C(i, A05);
                return;
        }
    }
}
