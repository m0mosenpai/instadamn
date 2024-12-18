package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class SML {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ InterfaceC103384lE A03;

    public SML(C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2) {
        this.A03 = interfaceC103384lE;
        this.A00 = c6fg;
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE2;
    }

    public final void A00(Integer num) {
        String str;
        InterfaceC103384lE interfaceC103384lE = this.A02;
        if (interfaceC103384lE != null) {
            C6FG c6fg = this.A00;
            switch (num.intValue()) {
                case 0:
                    str = MessageAvailabilityResponseId$Companion.NOT_AVAILABLE;
                    break;
                case 1:
                    str = "NO_PERMISSION";
                    break;
                case 2:
                    str = "USER_CANCELLED";
                    break;
                default:
                    str = "INTERNAL_ERROR";
                    break;
            }
            C131845xK.A00(this.A01, new C6FW(Arrays.asList(c6fg, str)), interfaceC103384lE);
        }
    }
}
