package X;

import com.mediatek.powerhalmgr.PowerHalMgr;
import com.mediatek.powerhalmgr.PowerHalMgrFactory;
import java.lang.reflect.Method;

/* renamed from: X.49y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49y {
    public static C15M A02;
    public static C15M A03;
    public static C15N A04;
    public static C15N A05;
    public static C15N A06;
    public static C15N A07;
    public static C15N A08;
    public static C15N A09;
    public final PowerHalMgr A00;
    public final Object A01;

    public final void A03(int i, int i2, int i3, int i4) {
        PowerHalMgr powerHalMgr = this.A00;
        if (powerHalMgr != null) {
            powerHalMgr.scnConfig(i, i2, i3, i4, 0, 0);
            return;
        }
        C15N c15n = A04;
        Object obj = this.A01;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 0, 0};
        Method method = c15n.A00;
        if (method == null || obj == null) {
            return;
        }
        try {
            method.invoke(obj, objArr);
        } catch (Exception unused) {
        }
    }

    static {
        C15M c15m = new C15M("com.mediatek.powerhalmgr.PowerHalMgrFactory");
        A02 = c15m;
        A07 = c15m.A02("getInstance", new Class[0]);
        A08 = A02.A02("makePowerHalMgr", new Class[0]);
        C15M c15m2 = new C15M("com.mediatek.powerhalmgr.PowerHalMgr");
        A03 = c15m2;
        Class cls = Integer.TYPE;
        A04 = c15m2.A02("scnConfig", cls, cls, cls, cls, cls, cls);
        A06 = A03.A02("scnEnable", cls, cls);
        A05 = A03.A02("scnDisable", cls);
        A09 = A03.A02("scnReg", new Class[0]);
    }

    public final int A00() {
        PowerHalMgr powerHalMgr = this.A00;
        if (powerHalMgr != null) {
            return powerHalMgr.scnReg();
        }
        return A09.A00(new Object[0], this.A01);
    }

    public final void A01(int i) {
        PowerHalMgr powerHalMgr = this.A00;
        if (powerHalMgr != null) {
            powerHalMgr.scnDisable(i);
            return;
        }
        A05.A00(new Object[]{Integer.valueOf(i)}, this.A01);
    }

    public final void A02(int i, int i2) {
        PowerHalMgr powerHalMgr = this.A00;
        if (powerHalMgr != null) {
            powerHalMgr.scnEnable(i, i2);
            return;
        }
        A06.A00(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this.A01);
    }

    public C49y() {
        if (A03.A03) {
            this.A00 = PowerHalMgrFactory.getInstance().makePowerHalMgr();
            return;
        }
        Object[] objArr = new Object[0];
        Method method = A07.A00;
        Object obj = null;
        if (method != null) {
            try {
                obj = method.invoke(null, objArr);
            } catch (Exception unused) {
            }
        }
        Object[] objArr2 = new Object[0];
        Method method2 = A08.A00;
        Object obj2 = null;
        if (method2 != null && obj != null) {
            try {
                obj2 = method2.invoke(obj, objArr2);
            } catch (Exception unused2) {
            }
        }
        this.A01 = obj2;
    }
}
