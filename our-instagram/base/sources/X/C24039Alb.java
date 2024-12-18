package X;

import android.os.Build;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Alb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24039Alb implements InterfaceC03950Jk {
    @Override // X.InterfaceC03950Jk
    public final /* bridge */ /* synthetic */ void ATX(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm, Object obj) {
        AbstractC167007dF.A1D(userSession, 0, interfaceC03960Jm);
        SessionedNotificationCenter sessionedNotificationCenter = C61A.A02(userSession, true).getSessionedNotificationCenter();
        C14360o3.A07(sessionedNotificationCenter);
        CompletableFuture[] completableFutureArr = (CompletableFuture[]) ((C48523LdL) userSession.A01(C48523LdL.class, new MHJ(sessionedNotificationCenter, 18))).A02.toArray(new CompletableFuture[0]);
        CompletableFuture<Void> allOf = CompletableFuture.allOf((CompletableFuture[]) Arrays.copyOf(completableFutureArr, completableFutureArr.length));
        C14360o3.A07(allOf);
        CompletableFuture[] completableFutureArr2 = (CompletableFuture[]) AbstractC16960so.A1Q(allOf, AbstractC47001KqK.A00(userSession).A00()).toArray(new CompletableFuture[0]);
        CompletableFuture<Void> allOf2 = CompletableFuture.allOf((CompletableFuture[]) Arrays.copyOf(completableFutureArr2, completableFutureArr2.length));
        if (Build.VERSION.SDK_INT >= 31) {
            allOf2.completeOnTimeout(null, 2L, TimeUnit.MINUTES);
        }
        allOf2.thenRun((Runnable) new RunnableC24456Asb(interfaceC03960Jm));
    }
}
