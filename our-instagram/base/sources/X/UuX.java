package X;

import android.view.ContextThemeWrapper;
import android.widget.TextView;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutToggleItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.otc.AnonCheckoutToggleButton;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class UuX extends UGL {
    public final ContextThemeWrapper A00;
    public final InterfaceC65383TjG A01;
    public final InterfaceC16660sJ A02;
    public final boolean A03;

    public final void A08(C66461UIl c66461UIl, C63406Sjd c63406Sjd) {
        boolean A1R = AbstractC167007dF.A1R(0, c63406Sjd, c66461UIl);
        AnonCheckoutToggleItem anonCheckoutToggleItem = (AnonCheckoutToggleItem) c63406Sjd.A01;
        if (C63406Sjd.A0J(c63406Sjd) && anonCheckoutToggleItem != null) {
            c66461UIl.A00.A05();
            AnonCheckoutToggleButton anonCheckoutToggleButton = c66461UIl.A01;
            anonCheckoutToggleButton.setToggleOn(anonCheckoutToggleItem.A02);
            C0fQ.A00(super.A00, anonCheckoutToggleButton);
            anonCheckoutToggleButton.setOnToggleCheckedListener(this.A02);
            TextView textView = anonCheckoutToggleButton.A02;
            R0Z r0z = anonCheckoutToggleItem.A01;
            String str = null;
            if (r0z != null) {
                str = r0z.getOptionalStringField(0, "text");
            }
            textView.setText(str);
            WF7.A02(textView, VEP.A0o);
            anonCheckoutToggleButton.A03.setVisibility(0);
            anonCheckoutToggleButton.setEnableRedesign(this.A03);
            R0Z r0z2 = anonCheckoutToggleItem.A00;
            if (r0z2 != null) {
                TextView textView2 = anonCheckoutToggleButton.A01;
                String optionalStringField = r0z2.getOptionalStringField(0, "text");
                if (optionalStringField != null) {
                    ImmutableList A0E = r0z2.A0E();
                    C14360o3.A07(A0E);
                    SLH A00 = AbstractC62201S1w.A00(optionalStringField, W6V.A02(A0E, 0, A1R));
                    InterfaceC65383TjG interfaceC65383TjG = this.A01;
                    C14360o3.A0B(interfaceC65383TjG, 0);
                    textView2.setText(A00.A00(interfaceC65383TjG, false));
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            return;
        }
        if (!C63406Sjd.A0H(c63406Sjd)) {
            return;
        }
        c66461UIl.A01.A03.setVisibility(4);
        c66461UIl.A00.A06(A1R);
    }

    public UuX(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext, InterfaceC65383TjG interfaceC65383TjG, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(VG3.A0A, loggingContext, false);
        this.A00 = contextThemeWrapper;
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC65383TjG;
        this.A03 = z;
    }
}
