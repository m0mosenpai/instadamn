package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.ILu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41206ILu {
    public final long A00;
    public final UserFlowLogger A01;
    public final InterfaceC43417JGh A02;
    public final EnumC39583Hdt A03;

    public C41206ILu(UserFlowLogger userFlowLogger, EnumC39583Hdt enumC39583Hdt, InterfaceC43417JGh interfaceC43417JGh, long j) {
        C14360o3.A0B(interfaceC43417JGh, 4);
        this.A00 = j;
        this.A01 = userFlowLogger;
        this.A03 = enumC39583Hdt;
        this.A02 = interfaceC43417JGh;
    }

    public final void A00() {
        String str;
        UserFlowLogger userFlowLogger = this.A01;
        long j = this.A00;
        EnumC39583Hdt enumC39583Hdt = this.A03;
        userFlowLogger.flowStart(j, new UserFlowConfig(enumC39583Hdt.toString(), true));
        if (1 - enumC39583Hdt.A00.intValue() != 0) {
            str = "BLOKS";
        } else {
            str = "NATIVE";
        }
        userFlowLogger.flowAnnotate(j, "framework_source", str);
    }
}
