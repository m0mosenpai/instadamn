package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class K4U extends AbstractRunnableC94874Os {
    public final /* synthetic */ C49593Lvm A00;
    public final /* synthetic */ Map A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4U(C49593Lvm c49593Lvm, Map map) {
        super("start");
        this.A00 = c49593Lvm;
        this.A01 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        C49593Lvm c49593Lvm = this.A00;
        Map map = this.A01;
        if (map != null) {
            obj = map.get("MEMContextConnectionStateChangeUserInfoKey");
        } else {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null && number.intValue() == 0) {
            boolean z = c49593Lvm.A0A;
            InterfaceC03960Jm interfaceC03960Jm = c49593Lvm.A05;
            if (z) {
                if (interfaceC03960Jm != null) {
                    C49593Lvm.A03(c49593Lvm, interfaceC03960Jm, "MEMConnectionStateDisconnected");
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            if (interfaceC03960Jm != null) {
                C49593Lvm.A02(c49593Lvm, interfaceC03960Jm, "MEMConnectionStateDisconnected");
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
