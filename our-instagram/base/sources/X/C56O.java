package X;

import java.util.concurrent.Callable;

/* renamed from: X.56O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C56O extends AbstractC24481Hr {
    public final /* synthetic */ Callable A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56O(Callable callable, int i) {
        super(i);
        this.A00 = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            A0A(this.A00.call());
        } catch (Exception e) {
            if (!(e instanceof RuntimeException)) {
                A09(e);
                return;
            }
            throw e;
        }
    }

    public final String toString() {
        return this.A00.toString();
    }
}
