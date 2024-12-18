package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.19e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C227619e {
    public static final C227619e A08 = new C227619e();
    public String A00;
    public String A01;
    public InterfaceC08830cm A02;
    public InterfaceC08830cm A03;
    public final Object A04 = new Object();
    public final List A05 = new ArrayList();
    public final AtomicBoolean A06 = new AtomicBoolean();
    public final AtomicBoolean A07 = new AtomicBoolean(false);

    public static void A00(C227619e c227619e, String str, String str2) {
        InterfaceC08830cm interfaceC08830cm = c227619e.A03;
        if (interfaceC08830cm != null) {
            C18920wW c18920wW = (C18920wW) ((InterfaceC02550Ad) interfaceC08830cm.get());
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "mobile_config_general_cases");
            if (A00.isSampled()) {
                A00.AAP("mc_event_name", "mobile_config_api2_consistency");
                A00.A9M("str_data", new C64906TZg(c227619e, str, str2));
                A00.Cht();
            }
        }
    }

    public final /* synthetic */ void A01(String str, String str2) {
        AbstractC09800fd.A01("MobileConfigApi2GeneralLoggerImpl_scheduleLog", 1616975295);
        try {
            A00(this, str, str2);
            AbstractC09800fd.A00(866794368);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1988461039);
            throw th;
        }
    }

    public final synchronized void A02(String str, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        AtomicBoolean atomicBoolean = this.A07;
        if (!atomicBoolean.get()) {
            this.A03 = interfaceC08830cm;
            this.A02 = interfaceC08830cm2;
            this.A00 = str;
            this.A01 = "ig4a";
            atomicBoolean.set(true);
        }
    }
}
