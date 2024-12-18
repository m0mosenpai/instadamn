package X;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Wxt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71646Wxt implements Thread.UncaughtExceptionHandler {
    public final AtomicReference A00;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        C14360o3.A0B(th, 1);
        C70193WFw c70193WFw = (C70193WFw) this.A00.get();
        if (c70193WFw != null) {
            X9S x9s = c70193WFw.A0H.A0D;
            Exception exc = new Exception(th);
            if (x9s != null) {
                x9s.CjB(exc, "videolite-video-upload", "UncaughtException in MediaUploader");
            }
            C70193WFw.A04(c70193WFw, new Exception(th));
        }
    }

    public C71646Wxt(C70193WFw c70193WFw) {
        this.A00 = new AtomicReference(c70193WFw);
    }
}
