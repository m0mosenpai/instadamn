package X;

import android.content.Context;

/* renamed from: X.1uG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40471uG extends AbstractC40481uH {
    public long A00;
    public Context A01;
    public HandlerC40531uM A02;
    public C14080nY A03;
    public C14080nY A04;

    @Override // X.AbstractC40481uH
    public final long A01(int i) {
        return this.A00;
    }

    @Override // X.AbstractC40481uH
    public final void A02(C40401u8 c40401u8, String str, int i, long j, long j2) {
        HandlerC40531uM handlerC40531uM = this.A02;
        handlerC40531uM.A00.A00 = j;
        handlerC40531uM.sendMessageDelayed(handlerC40531uM.obtainMessage(1, i, -1, c40401u8), j);
    }
}
