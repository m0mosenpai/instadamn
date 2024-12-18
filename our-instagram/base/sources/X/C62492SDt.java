package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.SDt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62492SDt {
    public final List A00;
    public final PriorityQueue A01;

    public C62492SDt(Collection collection) {
        int size;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(collection);
        this.A00 = A1E;
        if (collection.isEmpty()) {
            size = 1;
        } else {
            size = collection.size();
        }
        this.A01 = new PriorityQueue(size, new TSN(C65080TdD.A00));
    }
}
