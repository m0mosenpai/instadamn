package X;

import android.view.View;

/* renamed from: X.3tA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86373tA {
    public static final void A00(View.OnClickListener onClickListener, InterfaceC86303t2 interfaceC86303t2, C3t9 c3t9, InterfaceC86283sz interfaceC86283sz, C3YD c3yd) {
        C14360o3.A0B(interfaceC86303t2, 2);
        if (c3t9 == null) {
            c3yd.A0A();
            return;
        }
        C75113Zb c75113Zb = c3t9.A04;
        C3YE c3ye = c3t9.A05;
        String str = c3t9.A07;
        C75113Zb c75113Zb2 = c3yd.A02;
        if (c75113Zb2 != null) {
            c75113Zb2.A0M(c3yd, Integer.valueOf(c3yd.A00), true);
        }
        c3yd.A00 = -1;
        c3yd.A02 = null;
        C14360o3.A0B(c3ye, 0);
        c3yd.A03 = c3ye;
        c3yd.A0F(c3t9.A01);
        String str2 = c3t9.A06;
        C3YD.A07(c3yd);
        C80593io c80593io = c3yd.A06;
        if (c80593io != null) {
            c80593io.A01.setContentDescription(str2);
        }
        c3yd.A0H(str);
        int i = c3t9.A00;
        C14360o3.A0B(c75113Zb, 1);
        c3yd.A00 = i;
        c3yd.A02 = c75113Zb;
        c75113Zb.A0L(c3yd, Integer.valueOf(i), false);
        C86393tC A07 = c75113Zb.A07(i, c3ye.ordinal());
        if (c75113Zb.A2F || c75113Zb.A1y) {
            A07.A00 = C05F.A00;
        }
        A07.A02 = c3t9.A0H;
        A07.A06 = c3t9.A0F;
        if (c3t9.A0E) {
            A07.A00 = C05F.A0C;
            c3yd.A0E = true;
        }
        if (c3t9.A0G) {
            A07.A03 = true;
        }
        C80593io c80593io2 = c3yd.A06;
        if (c80593io2 != null) {
            C0fQ.A00(onClickListener, c80593io2.A00);
        }
        c3yd.A05 = interfaceC86283sz;
        c3yd.A0C();
        c3yd.A04 = c3t9;
        C3YD.A07(c3yd);
        C80593io c80593io3 = c3yd.A06;
        if (c80593io3 != null) {
            ((InterfaceC16620sF) c3t9.A02.A04).invoke(c80593io3.A01, interfaceC86303t2);
        }
        c3yd.A0D();
        if (c3t9.A03 != null) {
            ((InterfaceC16820sZ) c3t9.A02.A03).invoke();
        } else if (c3t9.A0A) {
            ((InterfaceC16660sJ) c3t9.A02.A05).invoke(interfaceC86303t2.CGJ());
        }
        if (c3ye == C3YE.A08) {
            ((InterfaceC16820sZ) c3t9.A02.A02).invoke();
        }
        c3yd.A0B();
    }
}
