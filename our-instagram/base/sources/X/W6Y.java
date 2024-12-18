package X;

import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes11.dex */
public abstract class W6Y {
    public static final List A00() {
        return AbstractC16960so.A1Q(EnumC129485tD.A02, EnumC129485tD.A0C, EnumC129485tD.A03, EnumC129485tD.A05, EnumC129485tD.A0J, EnumC129485tD.A0K, EnumC129485tD.A0D, EnumC129485tD.A0B, EnumC129485tD.A0F, EnumC129485tD.A0L);
    }

    public static final void A01(UFU ufu, EnumC72407Xcu enumC72407Xcu, String str) {
        Map linkedHashMap;
        Wap wap = C2FP.A01().A03;
        LoggingContext loggingContext = ufu.A0R;
        C70073W1q A05 = ufu.A0S.A05();
        LinkedHashMap A0o = AbstractC65702TsY.A0o(loggingContext);
        A0o.put("TARGET_NAME", str);
        A0o.put("CREDENTIAL_TYPE", enumC72407Xcu);
        Object obj = A0o.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof InterfaceC15590qF) && !(obj instanceof InterfaceC16540rz)) || (linkedHashMap = (Map) obj) == null)) {
            linkedHashMap = new LinkedHashMap();
        }
        C70199WGm.A08(A05, linkedHashMap);
        A0o.put("extra_data", linkedHashMap);
        ImmutableMap copyOf = ImmutableMap.copyOf((Map) A0o);
        C14360o3.A07(copyOf);
        wap.Chz(AbstractC58317Pt9.A00(30), copyOf);
    }

    public static final void A02(UFU ufu, String str) {
        Wap wap = C2FP.A01().A04;
        LoggingContext loggingContext = ufu.A0R;
        UFS ufs = ufu.A0S;
        Wap.A03(new C25531Mh(MSY.A0H(wap.A00, "user_click_ecpotc_atomic"), ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI), loggingContext, new MIG(loggingContext, UFS.A01(ufs), str, 2, !ufs.A0B()));
    }
}
