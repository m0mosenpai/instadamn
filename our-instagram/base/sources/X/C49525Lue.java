package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.Lue, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49525Lue implements MRU {
    public static final C49525Lue A00 = new Object();
    public static final UserFlowLogger A01 = JQY.A00;

    @Override // X.MRU
    public final /* synthetic */ MRU EWP(long j, boolean z) {
        return this;
    }

    @Override // X.MRU
    public final /* synthetic */ MRU Ea4(long j, boolean z) {
        return this;
    }

    @Override // X.MRU
    public final /* synthetic */ MRU Efm(long j, boolean z) {
        return this;
    }

    @Override // X.MRU
    public final long Enf(Integer num) {
        return 0L;
    }

    public static final void A00(long j) {
        UserFlowLogger userFlowLogger = A01;
        if (userFlowLogger.isOngoingFlow(j)) {
            userFlowLogger.flowDrop(j);
        }
    }

    @Override // X.MRU
    public final boolean CZf(long j) {
        return A01.isOngoingFlow(j);
    }

    @Override // X.MRU
    public final Integer Cn5(String str, long j) {
        A00(j);
        return C05F.A01;
    }

    @Override // X.MRU
    public final Integer DWA(Integer num, String str, int i, long j) {
        A00(j);
        return C05F.A01;
    }

    @Override // X.MRU
    public final void DW4(long j, int i, String str) {
        A00(j);
    }

    @Override // X.MRU
    public final void DW6(long j) {
        A00(j);
    }

    @Override // X.MRU
    public final void DW7(long j, int i, String str) {
        A00(j);
    }

    @Override // X.MRU
    public final void DW5(long j, Integer num) {
        A00(j);
    }

    @Override // X.MRU
    public final void DW9(long j, Integer num) {
        A00(j);
    }

    @Override // X.MRU
    public final void DWB(long j, Integer num) {
        A00(j);
    }

    @Override // X.MRU
    public final MRU EPq(String str, long j) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU ES0(String str, long j) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU EWa(long j, boolean z) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU EWo(String str, long j) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU EZ7(long j, long j2) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU EZ8(String str, long j) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU EZj(String str, long j) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU EaJ(String str, long j) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU Ebw(String str, long j) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU Ebx(String str, long j) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU EcB(String str, long j) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU Edf(String str, long j) {
        A00(j);
        return this;
    }

    @Override // X.MRU
    public final MRU Efl(String str, long j) {
        A00(j);
        return this;
    }
}
