package X;

/* loaded from: classes9.dex */
public final class PSV implements Runnable {
    public final /* synthetic */ C3MQ A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;

    public PSV(C3MQ c3mq, Integer num, String str) {
        this.A00 = c3mq;
        this.A01 = num;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3MQ c3mq = this.A00;
        String mediaId = c3mq.A01.getMediaId();
        if (mediaId != null) {
            C14120nc.A00().ATO(new C52381NGc(this, AbstractC25229BEm.A0h(c3mq.A00, mediaId), mediaId));
        }
    }
}
