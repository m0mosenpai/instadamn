package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1JW, reason: invalid class name */
/* loaded from: classes.dex */
public class C1JW {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C1JW.class, "_handled$volatile");
    public final Throwable A00;
    public volatile /* synthetic */ int _handled$volatile;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }

    public C1JW(boolean z, Throwable th) {
        this.A00 = th;
        this._handled$volatile = z ? 1 : 0;
    }
}
