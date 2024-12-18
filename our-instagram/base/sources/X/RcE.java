package X;

import com.instagram.inappbrowser.service.BrowserLiteCallbackService;

/* loaded from: classes10.dex */
public final class RcE extends AbstractRunnableC14200nk {
    public final /* synthetic */ C1ON A00;
    public final /* synthetic */ BrowserLiteCallbackService.BrowserLiteCallbackImpl A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcE(C1ON c1on, BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl) {
        super(137, 3, true, false);
        this.A01 = browserLiteCallbackImpl;
        this.A00 = c1on;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
    }
}
