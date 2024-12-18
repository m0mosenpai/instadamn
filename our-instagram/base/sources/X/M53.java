package X;

/* loaded from: classes8.dex */
public final class M53 implements Runnable {
    public final /* synthetic */ InterfaceC25601Mq A00;
    public final /* synthetic */ AbstractC24481Hr A01;
    public final /* synthetic */ C47282Kut A02;

    public M53(InterfaceC25601Mq interfaceC25601Mq, AbstractC24481Hr abstractC24481Hr, C47282Kut c47282Kut) {
        this.A02 = c47282Kut;
        this.A01 = abstractC24481Hr;
        this.A00 = interfaceC25601Mq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC24481Hr abstractC24481Hr = this.A01;
        try {
            C47282Kut c47282Kut = this.A02;
            c47282Kut.A00.A0A(this.A00.then(abstractC24481Hr));
        } catch (C46341KfP e) {
            this.A02.A00.A09(e);
        } catch (Exception e2) {
            if (!(e2 instanceof RuntimeException)) {
                this.A02.A00.A09(e2);
                return;
            }
            throw e2;
        }
    }
}
