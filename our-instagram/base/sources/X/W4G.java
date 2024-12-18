package X;

import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W4G {
    public final LoggingContext A00;
    public final UFS A01;

    public final void A00(FormCellFocusEvents formCellFocusEvents, Boolean bool, boolean z) {
        String str;
        String str2;
        String str3;
        Map linkedHashMap;
        if (z) {
            str = formCellFocusEvents.A02;
            str2 = formCellFocusEvents.A03;
            str3 = null;
        } else {
            if (AbstractC31177DnL.A1b(bool)) {
                str = formCellFocusEvents.A01;
            } else {
                str = formCellFocusEvents.A00;
            }
            str2 = null;
            str3 = formCellFocusEvents.A03;
        }
        Wap wap = C2FP.A01().A03;
        LoggingContext loggingContext = this.A00;
        C70073W1q A05 = this.A01.A05();
        C14360o3.A0B(loggingContext, 0);
        LinkedHashMap A0o = AbstractC65702TsY.A0o(loggingContext);
        if (str2 != null) {
            A0o.put("TARGET_NAME", str2);
        }
        if (str3 != null) {
            A0o.put("VIEW_NAME", str3);
        }
        Object obj = A0o.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof InterfaceC15590qF) && !(obj instanceof InterfaceC16540rz)) || (linkedHashMap = (Map) obj) == null)) {
            linkedHashMap = new LinkedHashMap();
        }
        C70199WGm.A08(A05, linkedHashMap);
        Wap.A09(wap, "extra_data", linkedHashMap, str, A0o);
    }

    public W4G(LoggingContext loggingContext, UFS ufs) {
        this.A00 = loggingContext;
        this.A01 = ufs;
    }

    public W4G() {
    }
}
