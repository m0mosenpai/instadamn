package X;

import java.util.LinkedList;

/* loaded from: classes4.dex */
public final class AVS implements InterfaceC176207sd {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AVS(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC176207sd
    public final void onError(Throwable th) {
        if (this.A00 != 0) {
            C176117sU c176117sU = (C176117sU) this.A01;
            InterfaceC176037sM interfaceC176037sM = c176117sU.A03;
            long A0M = AbstractC166987dD.A0M(this);
            interfaceC176037sM.ClA(new C212409b9(th), "recording_controller_error", "RecordingControllerImpl", c176117sU.A04.A02(), "low", "Warmup", A0M);
            ((InterfaceC176207sd) this.A02).onError(th);
            return;
        }
        ACL acl = (ACL) this.A01;
        synchronized (acl) {
            acl.A02 = true;
            AbstractC72880XqE.A01(acl.A03, acl.A04, th);
            while (true) {
                LinkedList linkedList = acl.A05;
                if (!linkedList.isEmpty()) {
                    ((Runnable) linkedList.pop()).run();
                }
            }
        }
    }

    @Override // X.InterfaceC176207sd
    public final void onSuccess() {
        if (this.A00 != 0) {
            ((InterfaceC176207sd) this.A02).onSuccess();
            return;
        }
        ACL acl = (ACL) this.A01;
        synchronized (acl) {
            int addAndGet = acl.A06.addAndGet(1);
            if (acl.A02) {
                Runnable runnable = (Runnable) this.A02;
                if (runnable != null) {
                    runnable.run();
                }
            } else if (acl.A01 && addAndGet == acl.A00) {
                Object obj = this.A02;
                if (obj != null) {
                    acl.A05.add(obj);
                }
                AbstractC72880XqE.A00(acl.A03, acl.A04);
            } else {
                Object obj2 = this.A02;
                if (obj2 != null) {
                    acl.A05.add(obj2);
                }
            }
        }
    }
}
