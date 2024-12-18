package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC74923Yi implements InterfaceC74933Yj {
    public final C74983Yo A00 = new AtomicInteger(0);

    public final void A01(int i) {
        C74983Yo c74983Yo;
        int i2;
        do {
            c74983Yo = this.A00;
            i2 = c74983Yo.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!c74983Yo.compareAndSet(i2, i2 | i));
    }

    @Override // X.InterfaceC74933Yj
    public /* synthetic */ AbstractC75003Yq CpR(AbstractC75003Yq abstractC75003Yq, AbstractC75003Yq abstractC75003Yq2, AbstractC75003Yq abstractC75003Yq3) {
        if (this instanceof ParcelableSnapshotMutableState) {
            C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            C14360o3.A0C(abstractC75003Yq3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            if (((ParcelableSnapshotMutableState) this).A01.AT1(((C74993Yp) abstractC75003Yq2).A00, ((C74993Yp) abstractC75003Yq3).A00)) {
                return abstractC75003Yq2;
            }
            return null;
        }
        return null;
    }
}
