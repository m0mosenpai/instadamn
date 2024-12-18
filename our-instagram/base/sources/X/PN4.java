package X;

/* loaded from: classes9.dex */
public final class PN4 implements Runnable {
    public final /* synthetic */ MTF A00;

    public PN4(MTF mtf) {
        this.A00 = mtf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MTF mtf = this.A00;
        synchronized (mtf) {
            AbstractC10360h2 abstractC10360h2 = mtf.A07.A02;
            if (abstractC10360h2 != null) {
                mtf.A00 = true;
                AbstractC63248Sg4.A02(abstractC10360h2);
            } else {
                C0w9.A01(EnumC12410kj.A0A, "InstagramDownloadableModuleTask:displaySpinner", "display spinner called, but spinner not enabled");
            }
        }
    }
}
