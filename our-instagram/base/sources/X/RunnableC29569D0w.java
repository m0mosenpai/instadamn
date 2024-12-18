package X;

import com.facebook.pando.IPandoGraphQLService;

/* renamed from: X.D0w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29569D0w implements Runnable {
    public final IPandoGraphQLService.Token A00;

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.cancel();
    }

    public RunnableC29569D0w(IPandoGraphQLService.Token token) {
        this.A00 = token;
    }
}
