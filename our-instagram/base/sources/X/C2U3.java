package X;

import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;

/* renamed from: X.2U3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2U3 implements C0SW, InterfaceC06270Us, C0f2 {
    public volatile Integer A00 = C05F.A0C;

    @Override // X.C0SW
    public final Integer CAQ() {
        return this.A00;
    }

    @Override // X.InterfaceC06270Us
    public final void D9M(C0SJ c0sj) {
        SystraceMessage.A00(SystraceMessage.A01, "", 1L).A02();
    }

    @Override // X.C0f2
    public final void DuR() {
        Integer num;
        if (Systrace.A0E(1L)) {
            num = C05F.A00;
        } else {
            num = C05F.A0C;
        }
        this.A00 = num;
    }

    @Override // X.C0f2
    public final void DuT() {
        this.A00 = C05F.A0C;
    }

    @Override // X.InterfaceC06270Us
    public final void Cus(C0SJ c0sj) {
        String str;
        String tag = c0sj.getTag();
        int type = c0sj.getType();
        AbstractC09720ep A00 = SystraceMessage.A00(SystraceMessage.A00, tag, 1L);
        C05620Rm c05620Rm = (C05620Rm) c0sj;
        long j = c05620Rm.A05;
        if (j != -1) {
            str = String.valueOf(c05620Rm.A02);
        } else {
            str = null;
        }
        A00.A00(str, "runnable_parent");
        int i = c05620Rm.A00;
        A00.A00(String.valueOf(i), "runnable_identifier");
        int i2 = c05620Rm.A01;
        if ((i2 & 1) == 0) {
            A00.A00(true, "indirect_edge");
        }
        int i3 = i2 & 2;
        boolean z = false;
        if (i3 != 0) {
            z = true;
            A00.A00(true, "manual_point");
        }
        A00.A01("app_custom_type", type);
        A00.A02();
        if (z) {
            long j2 = c05620Rm.A04;
            Systrace.A07(1L, tag, (((int) (j2 ^ (j2 >>> 32))) * 31) + i);
        } else {
            if (j == -1) {
                return;
            }
            int i4 = (((int) (j ^ (j >>> 32))) * 31) + c05620Rm.A02;
            if (i4 == -1) {
                return;
            }
            Systrace.A05(1L, tag, i4);
        }
    }
}
