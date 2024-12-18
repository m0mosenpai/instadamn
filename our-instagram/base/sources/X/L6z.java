package X;

import java.util.concurrent.CompletableFuture;

/* loaded from: classes8.dex */
public final class L6z {
    public CompletableFuture A00;
    public final java.util.Set A01 = AbstractC31171DnF.A0l();

    public final synchronized void A00(String str) {
        CompletableFuture completableFuture;
        C14360o3.A0B(str, 0);
        java.util.Set set = this.A01;
        set.remove(str);
        if (set.isEmpty() && (completableFuture = this.A00) != null) {
            completableFuture.complete(C0eB.A00);
            this.A00 = null;
        }
    }
}
