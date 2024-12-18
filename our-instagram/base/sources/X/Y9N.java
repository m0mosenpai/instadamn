package X;

import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Collections;

/* loaded from: classes12.dex */
public final class Y9N implements C0BT {
    public final /* synthetic */ C73299Xzp A00;

    public Y9N(C73299Xzp c73299Xzp) {
        this.A00 = c73299Xzp;
    }

    @Override // X.C0BT
    public final void DEG(Object obj) {
        C02780Bc c02780Bc = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (c02780Bc) {
            SparseArray sparseArray = c02780Bc.A01;
            if (sparseArray.get(identityHashCode, null) != null) {
                sparseArray.remove(identityHashCode);
                c02780Bc.A02.delete(identityHashCode);
                c02780Bc.A00.remove(identityHashCode);
            }
        }
    }

    @Override // X.C0BT
    public final void DWc(Object obj) {
        C02780Bc c02780Bc = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (c02780Bc) {
            Throwable th = new Throwable();
            c02780Bc.A01.append(identityHashCode, th);
            c02780Bc.A02.append(identityHashCode, true);
            c02780Bc.A00.append(identityHashCode, Long.valueOf(SystemClock.uptimeMillis()));
            if (C218914p.A08()) {
                c02780Bc.A04.EmS(new C02760Ba(C05F.A01, th, Collections.unmodifiableList(AbstractC166987dD.A1F(c02780Bc.A05))), "CameraLeakListener:ON_OPEN_IN_BACKGROUND");
            }
        }
    }

    @Override // X.C0BT
    public final void DeZ(Object obj) {
        C02780Bc c02780Bc = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (c02780Bc) {
            SparseBooleanArray sparseBooleanArray = c02780Bc.A02;
            if (sparseBooleanArray.get(identityHashCode, false)) {
                long uptimeMillis = SystemClock.uptimeMillis();
                SparseArray sparseArray = c02780Bc.A00;
                if (sparseArray.get(identityHashCode, null) != null && uptimeMillis - ((Long) sparseArray.get(identityHashCode)).longValue() > 6000) {
                    c02780Bc.A04.EmS(new C02760Ba(C05F.A0C, (Throwable) c02780Bc.A01.get(identityHashCode), Collections.unmodifiableList(AbstractC166987dD.A1F(c02780Bc.A05))), "CameraLeakListener:RELEASE_WITHOUT_PREVIEW");
                }
                sparseBooleanArray.delete(identityHashCode);
            }
            c02780Bc.A01.remove(identityHashCode);
            c02780Bc.A00.remove(identityHashCode);
        }
    }

    @Override // X.C0BT
    public final void Do6(Object obj) {
        C02780Bc c02780Bc = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (c02780Bc) {
            c02780Bc.A02.delete(identityHashCode);
        }
    }

    @Override // X.C0BT
    public final void Dox(Object obj) {
    }
}
