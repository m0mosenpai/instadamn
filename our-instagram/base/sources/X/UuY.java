package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UuY extends UGL {
    public final int A00;
    public final AbstractC10360h2 A01;
    public final String A02;
    public final Map A03;
    public final InterfaceC16660sJ A04;

    public final void A08(UIQ uiq) {
        C14360o3.A0B(uiq, 0);
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Fragment A0Q = abstractC10360h2.A0Q(this.A02);
        if (A0Q != null && C14360o3.A0K(this.A03.get(uiq), A0Q)) {
            C14240no c14240no = new C14240no(abstractC10360h2);
            c14240no.A03(A0Q);
            c14240no.A06();
        }
    }

    public final void A09(UIQ uiq, C63406Sjd c63406Sjd) {
        boolean A1R = AbstractC167007dF.A1R(0, c63406Sjd, uiq);
        InlineFormItem inlineFormItem = (InlineFormItem) c63406Sjd.A01;
        if (inlineFormItem != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("ECP_FORM_FRAGMENT_PARAMS", inlineFormItem.A00);
            LoggingContext loggingContext = super.A03;
            bundle.putString("ECP_SESSION_ID", loggingContext.A02);
            bundle.putString("ECP_PRODUCT_ID", String.valueOf(loggingContext.A00));
            bundle.putString("ECP_CLIENT_RECEIVER_ID", inlineFormItem.A01);
            bundle.putParcelable("logging_context", loggingContext);
            C67722Uwo c67722Uwo = new C67722Uwo();
            c67722Uwo.setArguments(bundle);
            InterfaceC16660sJ interfaceC16660sJ = this.A04;
            C14360o3.A0B(interfaceC16660sJ, 0);
            c67722Uwo.A0I = interfaceC16660sJ;
            this.A03.put(uiq, c67722Uwo);
            C14240no c14240no = new C14240no(this.A01);
            c14240no.A0G = A1R;
            c14240no.A0D(c67722Uwo, this.A02, this.A00);
            c14240no.A0K();
        }
    }

    public UuY(AbstractC10360h2 abstractC10360h2, LoggingContext loggingContext, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(VG3.A05, loggingContext, false);
        this.A01 = abstractC10360h2;
        this.A00 = i;
        this.A04 = interfaceC16660sJ;
        this.A02 = AnonymousClass001.A0O("form_", i);
        this.A03 = new LinkedHashMap();
    }
}
