package X;

import com.facebook.msys.mca.Mailbox;
import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;

/* loaded from: classes8.dex */
public final class M8I implements Consumer {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ C15370ps A01;

    public M8I(CountDownLatch countDownLatch, C15370ps c15370ps) {
        this.A01 = c15370ps;
        this.A00 = countDownLatch;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C5Fn A00 = AbstractC137146It.A00("IgMailbox.get");
        A00.A00.A01(new RunnableC49996M5l((Mailbox) obj, this.A00, this.A01));
    }
}
