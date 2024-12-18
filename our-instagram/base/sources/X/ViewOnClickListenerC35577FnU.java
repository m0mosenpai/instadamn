package X;

import android.view.View;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import java.util.HashMap;

/* renamed from: X.FnU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35577FnU implements View.OnClickListener {
    public final /* synthetic */ InterfaceC55362gb A00;
    public final /* synthetic */ C4NJ A01;
    public final /* synthetic */ C81413kB A02;

    public ViewOnClickListenerC35577FnU(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, C81413kB c81413kB) {
        this.A02 = c81413kB;
        this.A00 = interfaceC55362gb;
        this.A01 = c4nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        PhoneNumberUtil phoneNumberUtil;
        int A05 = C0f9.A05(-888576407);
        C81413kB c81413kB = this.A02;
        EditPhoneNumberView editPhoneNumberView = c81413kB.A01;
        if (editPhoneNumberView == null) {
            i = 1822849106;
        } else {
            try {
                phoneNumberUtil = editPhoneNumberView.A09;
            } catch (C40f unused) {
            }
            if (phoneNumberUtil.A0N(phoneNumberUtil.A0F(editPhoneNumberView.getPhoneNumber(), null))) {
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("custom_param_phone_number", editPhoneNumberView.getPhoneNumber());
                InterfaceC55362gb interfaceC55362gb = this.A00;
                if (interfaceC55362gb != null) {
                    interfaceC55362gb.Dco(this.A01, C05F.A01, A1G);
                }
                i = -1792652286;
            }
            editPhoneNumberView.A05.A04(AbstractC166997dE.A0L(c81413kB.itemView).getString(2131964637));
            i = -1792652286;
        }
        C0f9.A0C(i, A05);
    }
}
