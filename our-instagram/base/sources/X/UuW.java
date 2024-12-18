package X;

import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.apm.APMConfigurationImpl;
import com.facebookpay.bloks.nativeprops.APMBloksNativeProps;
import com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.apm.ApmButtonsView;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class UuW extends UGL {
    public final ContextThemeWrapper A00;
    public final FragmentActivity A01;
    public final InterfaceC16660sJ A02;

    public UuW(ContextThemeWrapper contextThemeWrapper, FragmentActivity fragmentActivity, LoggingContext loggingContext, InterfaceC16660sJ interfaceC16660sJ) {
        super(VG3.A0B, loggingContext, false);
        this.A00 = contextThemeWrapper;
        this.A01 = fragmentActivity;
        this.A02 = interfaceC16660sJ;
    }

    public final void A08(UID uid, C63406Sjd c63406Sjd) {
        APMConfiguration aPMConfiguration;
        Integer num;
        boolean A1a = AbstractC167017dG.A1a(c63406Sjd, uid);
        APMButtonsItem aPMButtonsItem = (APMButtonsItem) c63406Sjd.A01;
        if (aPMButtonsItem != null && (num = aPMButtonsItem.A02) != null) {
            uid.A00.setPayWithCardText(num.intValue());
        }
        if (C63406Sjd.A0H(c63406Sjd)) {
            uid.A00.A00.A06(A1a);
            return;
        }
        ApmButtonsView apmButtonsView = uid.A00;
        apmButtonsView.A00.A05();
        if (aPMButtonsItem == null || (aPMConfiguration = aPMButtonsItem.A01) == null) {
            return;
        }
        APMBloksNativeProps aPMBloksNativeProps = aPMButtonsItem.A00;
        aPMBloksNativeProps.A00 = this.A02;
        FragmentActivity fragmentActivity = this.A01;
        XGq xGq = ((APMConfigurationImpl) aPMConfiguration).A00;
        LinkedHashMap A07 = AbstractC06930Yk.A07(new C09530e4(AbstractC63083Sc6.A00(), aPMBloksNativeProps.A06), new C09530e4("client_mutation_id", aPMBloksNativeProps.A02), new C09530e4(AbstractC111324zv.A00(4096), aPMBloksNativeProps.A03), new C09530e4(AbstractC58317Pt9.A00(896), aPMBloksNativeProps.A05), new C09530e4("amount", aPMBloksNativeProps.A01), new C09530e4("currency_code", aPMBloksNativeProps.A04));
        InterfaceC16660sJ interfaceC16660sJ = aPMBloksNativeProps.A00;
        if (interfaceC16660sJ != null) {
            A07.put("on_complete_callback", new C66237U5h(new C50358MLk(interfaceC16660sJ, 43)));
        }
        apmButtonsView.setupBloksApms(fragmentActivity, xGq, A07);
    }
}
