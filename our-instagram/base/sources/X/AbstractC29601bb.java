package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC29601bb {
    public final C1YP database;
    public final AtomicBoolean lock;
    public final InterfaceC09390do stmt$delegate;

    public AbstractC29601bb(C1YP c1yp) {
        C14360o3.A0B(c1yp, 1);
        this.database = c1yp;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = AbstractC09440dt.A01(new C9EV(this, 41));
    }

    public abstract String createQuery();

    public void release(InterfaceC37561ot interfaceC37561ot) {
        C14360o3.A0B(interfaceC37561ot, 0);
        if (interfaceC37561ot == getStmt()) {
            this.lock.set(false);
        }
    }

    private final InterfaceC37561ot getStmt(boolean z) {
        if (z) {
            return getStmt();
        }
        return createNewStatement();
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC37561ot createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    public InterfaceC37561ot acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    private final InterfaceC37561ot getStmt() {
        return (InterfaceC37561ot) this.stmt$delegate.getValue();
    }
}
