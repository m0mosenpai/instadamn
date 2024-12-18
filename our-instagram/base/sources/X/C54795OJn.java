package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.OJn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54795OJn {
    public ExecutionException A00;
    public boolean A01;
    public final Context A03;
    public final UserSession A04;
    public final C47Z A05;
    public final String A06;
    public final ExecutorService A08;
    public final boolean A09;
    public boolean A02 = true;
    public final CountDownLatch A07 = new CountDownLatch(1);

    public C54795OJn(Context context, UserSession userSession, C47Z c47z, String str, ExecutorService executorService, boolean z) {
        this.A08 = executorService;
        this.A06 = str;
        this.A05 = c47z;
        this.A09 = z;
        this.A03 = context;
        this.A04 = userSession;
    }

    public final synchronized void A00() {
        C47Z c47z = this.A05;
        String str = c47z.A3V;
        if (str != null) {
            try {
                AbstractC166987dD.A11(str).delete();
            } catch (RuntimeException unused) {
            } catch (Throwable th) {
                c47z.A0g(null);
                c47z.A0f(null);
                c47z.A0O();
                throw th;
            }
            c47z.A0g(null);
            c47z.A0f(null);
            c47z.A0O();
        }
        this.A08.shutdownNow();
        this.A02 = false;
        this.A01 = false;
        this.A07.countDown();
    }
}
