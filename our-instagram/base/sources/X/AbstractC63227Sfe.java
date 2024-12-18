package X;

import java.util.List;

/* renamed from: X.Sfe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract /* synthetic */ class AbstractC63227Sfe {
    public static final AbstractC63227Sfe $redex_init_class = null;

    static {
        C64775TTj c64775TTj = InterfaceC65616To7.A00;
    }

    public static ROY A00(SYG syg, int i, int i2) {
        try {
            ROL A00 = ROY.A00();
            ROM A002 = ROX.A00();
            A002.A06(syg.A00);
            A002.A08(syg.A01);
            A002.A07(i);
            A00.A07(A002);
            A00.A06(i2);
            return (ROY) A00.A01();
        } catch (Exception e) {
            AbstractC63398SjT.A0B("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static ROV A01(int i) {
        try {
            ROJ A00 = ROV.A00();
            A00.A06(i);
            return (ROV) A00.A01();
        } catch (Exception e) {
            AbstractC63398SjT.A0B("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static C60720ROa A02(List list) {
        try {
            ROO A00 = C60720ROa.A00();
            A00.A07(3);
            A00.A0A(list);
            return (C60720ROa) A00.A01();
        } catch (Exception e) {
            AbstractC63398SjT.A0B("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
