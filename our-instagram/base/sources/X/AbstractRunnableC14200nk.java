package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.0nk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC14200nk implements Runnable {
    public static final C14190nj Companion = new Object();
    public volatile C0SJ furyContext;
    public final boolean isMayRunDuringStartup;
    public final boolean isSendToNetworkThreadPool;
    public final int priority;
    public final int runnableId;

    public AbstractRunnableC14200nk(int i) {
        this(i, 3, false, false);
    }

    public static final AbstractRunnableC14200nk create(int i, int i2, boolean z, boolean z2, Runnable runnable) {
        return C14190nj.A00(runnable, i, i2, z, z2);
    }

    public static final AbstractRunnableC14200nk create(int i, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        return new C18320vJ(i, runnable);
    }

    public C0SJ getFuryContext() {
        return this.furyContext;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getRunnableId() {
        return this.runnableId;
    }

    public final boolean isMayRunDuringStartup() {
        return this.isMayRunDuringStartup;
    }

    public final boolean isSendToNetworkThreadPool() {
        return this.isSendToNetworkThreadPool;
    }

    public void setFuryContext(C0SJ c0sj) {
        this.furyContext = c0sj;
    }

    public AbstractRunnableC14200nk(int i, int i2, boolean z) {
        this(i, i2, z, false);
    }

    public /* synthetic */ AbstractRunnableC14200nk(int i, int i2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 3 : i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2);
    }

    public AbstractRunnableC14200nk(int i, int i2, boolean z, boolean z2) {
        this.runnableId = i;
        this.priority = i2;
        this.isSendToNetworkThreadPool = z;
        this.isMayRunDuringStartup = z2;
    }

    public AbstractRunnableC14200nk(int i, int i2) {
        this(i, i2, false, false);
    }
}
