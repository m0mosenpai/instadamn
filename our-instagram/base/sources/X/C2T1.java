package X;

import android.os.MessageQueue;

/* renamed from: X.2T1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2T1 implements InterfaceC12870lZ {
    public long A00;
    public Integer A01 = C05F.A00;
    public final InterfaceC19630xq A02;
    public final C2T0 A03;

    public static void A00(C2T1 c2t1, boolean z) {
        Integer[] numArr;
        InterfaceC19630xq interfaceC19630xq = c2t1.A02;
        long j = interfaceC19630xq.getLong("sp_ts_011", 0L);
        if (j > 0 && j != c2t1.A00) {
            if (z) {
                Integer num = C05F.A00;
                numArr = new Integer[]{num, C05F.A0C, num, C05F.A01};
            } else {
                Integer num2 = C05F.A00;
                numArr = new Integer[]{num2, C05F.A0C, num2};
            }
            c2t1.A03.A00(numArr, j);
            if (interfaceC19630xq.getLong("sp_ts_011", 0L) == j) {
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.EEj("sp_ts_011");
                ARD.apply();
            }
        }
    }

    public C2T1(InterfaceC19630xq interfaceC19630xq, C2T0 c2t0) {
        this.A02 = interfaceC19630xq;
        C218914p.A03(EnumC220415e.A03, this);
        this.A03 = c2t0;
        boolean z = C11P.A00;
        C11P.A00(new MessageQueue.IdleHandler() { // from class: X.2T2
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                C2T1 c2t1 = C2T1.this;
                if (c2t1.A01 != C05F.A01) {
                    c2t1.A01 = C05F.A0C;
                    return true;
                }
                return true;
            }
        });
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1752437952);
        if (this.A00 <= 0) {
            this.A01 = C05F.A0C;
        }
        C0f9.A0A(-415937852, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-1577333938);
        A00(this, true);
        long j = this.A00;
        if (j > 0) {
            this.A03.A00(new Integer[]{C05F.A00, C05F.A0C, C05F.A01}, j);
            InterfaceC19630xq interfaceC19630xq = this.A02;
            if (interfaceC19630xq.getLong("sp_ts_011", 0L) == j) {
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.EEj("sp_ts_011");
                ARD.apply();
            }
        } else {
            this.A01 = C05F.A01;
        }
        C0f9.A0A(667138886, A03);
    }
}
