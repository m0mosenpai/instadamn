package X;

import java.util.concurrent.Callable;

/* renamed from: X.5eQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121275eQ implements C11R {
    public C2AH A00;
    public final int A01;
    public final AbstractC24481Hr A02;

    @Override // X.C11R
    public final String getName() {
        return "ListenableTask";
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return this.A01;
    }

    @Override // X.C11R
    public final void onFinish() {
        C2AH c2ah = this.A00;
        if (c2ah != null) {
            c2ah.onFinish();
            AbstractC24481Hr abstractC24481Hr = this.A02;
            if (!abstractC24481Hr.A0D()) {
                c2ah.onSuccess(abstractC24481Hr.A07());
                return;
            }
            Exception A06 = abstractC24481Hr.A06();
            C14360o3.A0A(A06);
            c2ah.onFail(A06);
        }
    }

    @Override // X.C11R
    public final void onStart() {
        C2AH c2ah = this.A00;
        if (c2ah != null) {
            c2ah.onStart();
        }
    }

    @Override // X.C11R
    public final void run() {
        this.A02.run();
    }

    public C121275eQ(Callable callable, int i) {
        this.A01 = i;
        this.A02 = new C56O(callable, i);
    }
}
