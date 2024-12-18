package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.0vF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18280vF extends AbstractRunnableC14200nk {
    public final String mName;

    public abstract void loggedRun();

    @Override // java.lang.Runnable
    public final void run() {
        if (Systrace.A0E(1L)) {
            C0fO.A01(this.mName, 979945565);
        }
        try {
            loggedRun();
            if (Systrace.A0E(1L)) {
                C0fO.A00(476114827);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1026774426);
            }
            throw th;
        }
    }

    public AbstractC18280vF(String str, int i) {
        super(i);
        this.mName = str;
    }

    public AbstractC18280vF(String str, int i, int i2, boolean z, boolean z2) {
        super(i, i2, z, z2);
        this.mName = str;
    }
}
