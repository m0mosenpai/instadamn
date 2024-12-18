package X;

import java.util.PriorityQueue;

/* renamed from: X.L1u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47635L1u {
    public PriorityQueue A00;
    public final String A01;
    public final C09530e4 A02;

    public C47635L1u(String str, C09530e4 c09530e4, int i) {
        C14360o3.A0B(str, 2);
        this.A02 = c09530e4;
        this.A01 = str;
        PriorityQueue priorityQueue = new PriorityQueue(i, new C50040M7d((InterfaceC16620sF) MMG.A00, 8));
        this.A00 = priorityQueue;
        priorityQueue.addAll(C16930sl.A00);
    }
}
