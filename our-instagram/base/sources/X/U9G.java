package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class U9G extends Handler {
    public final C4RP A00;
    public final AtomicReference A01;
    public final C4RP A02;
    public volatile int A03;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C14360o3.A0B(message, 0);
        C95964Tf c95964Tf = C95964Tf.A02;
        try {
            C0SJ A02 = C06600Wq.A02("PlayedForThreeSecondsDetectingHandler", 0);
            try {
                if (message.what == 2) {
                    A00(this);
                    if (this.A01.get() == EnumC68129VCn.A03) {
                        removeMessages(2);
                        sendEmptyMessageDelayed(2, 200L);
                    }
                }
                A02.close();
            } finally {
            }
        } finally {
            AbstractC95954Te.A00();
        }
    }

    public static final void A00(U9G u9g) {
        AtomicReference atomicReference = u9g.A01;
        if (atomicReference.get() == EnumC68129VCn.A04) {
            AbstractC459729h.A02("PlayedForThreeSecondsDetectingHandler", "PlayedForThreeSeconds status shouldn't be unknown when attempting to send event", new Object[0]);
            return;
        }
        Object obj = atomicReference.get();
        EnumC68129VCn enumC68129VCn = EnumC68129VCn.A02;
        if (obj == enumC68129VCn || ((int) u9g.A02.A0I.A08()) - u9g.A03 < 3000) {
            return;
        }
        atomicReference.set(enumC68129VCn);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9G(Looper looper, C4RP c4rp, C4RP c4rp2) {
        super(looper);
        C14360o3.A0A(looper);
        this.A02 = c4rp;
        this.A00 = c4rp2;
        this.A01 = new AtomicReference(EnumC68129VCn.A04);
    }
}
