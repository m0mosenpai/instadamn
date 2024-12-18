package X;

import java.util.concurrent.CompletableFuture;

/* renamed from: X.KLs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45715KLs extends AbstractRunnableC14200nk {
    public final /* synthetic */ C63000SaO A00;
    public final /* synthetic */ CompletableFuture A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45715KLs(C63000SaO c63000SaO, CompletableFuture completableFuture) {
        super(1891369907, 2, false, true);
        this.A00 = c63000SaO;
        this.A01 = completableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        C0K8.A0D("EncryptedBackupsDeviceIdUtil", "getDeviceIdAsync runFDIDSync in runnable");
        C19U A01 = this.A00.A01();
        if (A01 != null) {
            str = A01.A01;
        } else {
            str = null;
        }
        C0K8.A0D("EncryptedBackupsDeviceIdUtil", AnonymousClass001.A0R("getDeviceIdAsync runFDIDSync in runnable sync done ", str));
        CompletableFuture completableFuture = this.A01;
        if (A01 == null || (str2 = A01.A01) == null) {
            str2 = "uniqueDeviceId";
        }
        completableFuture.complete(str2);
    }
}
