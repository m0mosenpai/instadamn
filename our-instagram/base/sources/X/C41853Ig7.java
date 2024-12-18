package X;

import android.os.MessageQueue;

/* renamed from: X.Ig7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41853Ig7 implements MessageQueue.IdleHandler {
    public final /* synthetic */ C61442r7 A00;

    public C41853Ig7(C61442r7 c61442r7) {
        this.A00 = c61442r7;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        C61442r7 c61442r7 = this.A00;
        C226618u c226618u = C61442r7.A0V;
        if (c61442r7.A0I.A0W()) {
            Integer num = c61442r7.A0O;
            Integer num2 = C05F.A00;
            if (num == num2 || c61442r7.A0P == num2) {
                Integer num3 = C05F.A0Y;
                c61442r7.A0O = num3;
                c61442r7.A0P = num3;
                C61442r7.A01(c61442r7);
                return false;
            }
            return false;
        }
        return false;
    }
}
