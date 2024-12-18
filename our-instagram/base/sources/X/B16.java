package X;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B16 implements Callable {
    public final /* synthetic */ C2RB A00;
    public final /* synthetic */ Object A01;

    public B16(C2RB c2rb, Object obj) {
        this.A00 = c2rb;
        this.A01 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AbstractC09800fd.A01("DirectSQLiteTable.asyncPostProcess", -320520058);
        try {
            C2RB c2rb = this.A00;
            Object A0D = c2rb.A0D(c2rb.A00, this.A01);
            AbstractC09800fd.A00(-1302670957);
            return A0D;
        } catch (Throwable th) {
            AbstractC09800fd.A00(1699433574);
            throw th;
        }
    }
}
