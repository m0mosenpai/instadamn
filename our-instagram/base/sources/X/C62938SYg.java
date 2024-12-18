package X;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;

/* renamed from: X.SYg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62938SYg {
    public static C62938SYg A03;
    public GoogleSignInAccount A00;
    public GoogleSignInOptions A01;
    public final C63215SfL A02;

    public final synchronized void A01() {
        C63215SfL c63215SfL = this.A02;
        Lock lock = c63215SfL.A01;
        lock.lock();
        try {
            AbstractC58320PtC.A1E(c63215SfL.A00);
            lock.unlock();
            this.A00 = null;
            this.A01 = null;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static synchronized C62938SYg A00(Context context) {
        C62938SYg c62938SYg;
        synchronized (C62938SYg.class) {
            Context applicationContext = context.getApplicationContext();
            c62938SYg = A03;
            if (c62938SYg == null) {
                c62938SYg = new C62938SYg(applicationContext);
                A03 = c62938SYg;
            }
        }
        return c62938SYg;
    }

    public C62938SYg(Context context) {
        C63215SfL A00 = C63215SfL.A00(context);
        this.A02 = A00;
        this.A00 = A00.A01();
        this.A01 = A00.A02();
    }
}
