package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.48U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48U implements Runnable {
    public final long A00;
    public final int A01;
    public final UserFlowLoggerImpl A02;
    public final LinkedList A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;

    public C48U(UserFlowLoggerImpl userFlowLoggerImpl, LinkedList linkedList, Map map, Map map2, Map map3, int i, long j) {
        C14360o3.A0B(userFlowLoggerImpl, 1);
        C14360o3.A0B(map, 2);
        C14360o3.A0B(map2, 4);
        C14360o3.A0B(map3, 6);
        C14360o3.A0B(linkedList, 7);
        this.A02 = userFlowLoggerImpl;
        this.A06 = map;
        this.A01 = i;
        this.A05 = map2;
        this.A00 = j;
        this.A04 = map3;
        this.A03 = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserFlowLoggerImpl userFlowLoggerImpl = this.A02;
        long j = this.A00;
        userFlowLoggerImpl.flowEndTimeout(j);
        Map map = this.A05;
        Long valueOf = Long.valueOf(j);
        map.remove(valueOf);
        this.A06.remove(Integer.valueOf(this.A01));
        this.A04.remove(valueOf);
        LinkedList linkedList = this.A03;
        linkedList.addFirst(valueOf);
        if (linkedList.size() > 200) {
            linkedList.removeLast();
        }
    }
}
