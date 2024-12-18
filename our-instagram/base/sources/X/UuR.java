package X;

import android.view.ContextThemeWrapper;
import com.facebook.R;
import com.facebookpay.logging.LoggingContext;

/* loaded from: classes11.dex */
public final class UuR extends UGL {
    public final int A00;
    public final int A01;
    public final ContextThemeWrapper A02;
    public final InterfaceC65383TjG A03;
    public final InterfaceC16660sJ A04;

    public UuR(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext, InterfaceC65383TjG interfaceC65383TjG, InterfaceC16660sJ interfaceC16660sJ) {
        super(VG3.A0H, loggingContext, false);
        this.A02 = contextThemeWrapper;
        this.A03 = interfaceC65383TjG;
        this.A04 = interfaceC16660sJ;
        this.A00 = WFM.A00(contextThemeWrapper, R.attr.fbpay_widget_component_horizontal_margin);
        this.A01 = AbstractC167017dG.A06(contextThemeWrapper);
    }
}
