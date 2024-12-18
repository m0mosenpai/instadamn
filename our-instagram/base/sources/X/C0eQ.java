package X;

import android.os.ConditionVariable;

/* renamed from: X.0eQ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0eQ {
    public static final ConditionVariable A00 = new ConditionVariable(true);

    public static final void A00() {
        StringBuilder sb;
        ConditionVariable conditionVariable = A00;
        if (conditionVariable.block(-1L)) {
            sb = new StringBuilder();
            sb.append("Not blocking Service (");
        } else {
            C0K8.A0D("InitStatus", AnonymousClass001.A0I("Blocking Service (", ')', conditionVariable.hashCode()));
            C0BJ.A00("ServiceWaitForInit");
            try {
                conditionVariable.block();
                C0BI.A00();
                sb = new StringBuilder();
                sb.append("Unblocked Service (");
            } catch (Throwable th) {
                C0BI.A00();
                C0K8.A0D("InitStatus", AnonymousClass001.A0I("Unblocked Service (", ')', conditionVariable.hashCode()));
                throw th;
            }
        }
        sb.append(conditionVariable.hashCode());
        sb.append(')');
        C0K8.A0D("InitStatus", sb.toString());
    }
}
