package X;

import android.os.Process;
import com.facebook.msys.mci.Execution;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: X.95l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049895l extends C15E {
    @Override // X.C15E
    public final int A00() {
        return 26;
    }

    @Override // X.C15E
    public final C15P A02(JSONObject jSONObject, int i) {
        C14360o3.A0B(jSONObject, 1);
        int optInt = jSONObject.optInt("priority");
        C15P c15p = new C15P();
        c15p.A02 = optInt;
        return c15p;
    }

    @Override // X.C15E
    public final InterfaceC219914z A01(C15P c15p, int i) {
        if (c15p == null) {
            C219714x c219714x = C219714x.A00;
            C14360o3.A0A(c219714x);
            return c219714x;
        }
        final int i2 = c15p.A02;
        return new AbstractC219814y(i2) { // from class: X.9al
            public C09530e4 A00 = AbstractC167007dF.A0o(false, 0);
            public final int A01;

            @Override // X.AbstractC219814y, X.InterfaceC219914z
            public final int AhK() {
                return 26;
            }

            @Override // X.AbstractC219814y
            public final C2050695w A02(int i3, int i4) {
                C2050695w c2050695w = new C2050695w();
                String valueOf = String.valueOf(AbstractC166987dD.A0H(this.A00.A01));
                Map map = c2050695w.A02;
                map.put("old_priority", valueOf);
                map.put("new_priority", String.valueOf(this.A01));
                map.put("is_boosted", String.valueOf(AbstractC166987dD.A1a(this.A00.A00)));
                this.A00 = AbstractC167007dF.A0o(false, 0);
                return c2050695w;
            }

            @Override // X.AbstractC219814y
            public final void A04() {
                AtomicInteger atomicInteger = A47.A01;
                if (atomicInteger.get() != 0) {
                    int decrementAndGet = atomicInteger.decrementAndGet();
                    if (decrementAndGet == 0) {
                        Execution.setThreadPriorities(Integer.valueOf(A47.A02));
                        A47.A00.set(false);
                    } else {
                        if (decrementAndGet >= 0) {
                            return;
                        }
                        atomicInteger.compareAndSet(decrementAndGet, 0);
                    }
                }
            }

            @Override // X.AbstractC219814y
            public final boolean A05() {
                boolean z;
                int threadPriority;
                int i3 = this.A01;
                int i4 = 0;
                if (A47.A00.compareAndSet(false, true)) {
                    List list = (List) AbstractC166997dE.A0m(Execution.sThreadIds, 2);
                    synchronized (list) {
                        if (list.isEmpty()) {
                            threadPriority = Integer.MIN_VALUE;
                        } else {
                            threadPriority = Process.getThreadPriority(((Integer) list.get(0)).intValue());
                        }
                    }
                    A47.A02 = threadPriority;
                    int i5 = A47.A02;
                    if (A47.A02 != Integer.MIN_VALUE) {
                        i4 = i5;
                    } else {
                        z = false;
                        this.A00 = AbstractC167007dF.A0o(z, i4);
                        return true;
                    }
                }
                Execution.setThreadPriorities(Integer.valueOf(i3));
                A47.A01.incrementAndGet();
                z = true;
                this.A00 = AbstractC167007dF.A0o(z, i4);
                return true;
            }

            {
                this.A01 = i2;
            }
        };
    }
}
