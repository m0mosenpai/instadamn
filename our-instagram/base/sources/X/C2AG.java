package X;

import java.util.concurrent.Callable;

/* renamed from: X.2AG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2AG extends C2AH implements C11R, Callable {
    public AbstractC24481Hr task;

    @Override // X.C11R
    public String getName() {
        return "SimpleListenableTask";
    }

    @Override // X.C11R
    public void onCancel() {
    }

    @Override // X.C2AH, X.C11R
    public void onFinish() {
        AbstractC24481Hr abstractC24481Hr = this.task;
        if (abstractC24481Hr != null) {
            boolean A0D = abstractC24481Hr.A0D();
            AbstractC24481Hr abstractC24481Hr2 = this.task;
            if (!A0D) {
                if (abstractC24481Hr2 != null) {
                    onSuccess(abstractC24481Hr2.A07());
                    return;
                }
            } else if (abstractC24481Hr2 != null) {
                Exception A06 = abstractC24481Hr2.A06();
                C14360o3.A0A(A06);
                onFail(A06);
                return;
            }
        }
        C14360o3.A0F("task");
        throw C00O.createAndThrow();
    }

    @Override // X.C11R
    public void run() {
        AbstractC24481Hr abstractC24481Hr = this.task;
        if (abstractC24481Hr == null) {
            C14360o3.A0F("task");
            throw C00O.createAndThrow();
        }
        abstractC24481Hr.run();
    }

    @Override // X.C2AH, X.C11R
    public void onStart() {
        this.task = new C56O(this, getRunnableId());
    }
}
