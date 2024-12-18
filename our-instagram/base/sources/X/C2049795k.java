package X;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: X.95k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049795k extends C15E {
    @Override // X.C15E
    public final int A00() {
        return 8;
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
        return new AbstractC219814y(i2) { // from class: X.9Q5
            public C09530e4 A00 = AbstractC167007dF.A0o(false, 0);
            public final int A01;

            @Override // X.AbstractC219814y, X.InterfaceC219914z
            public final int AhK() {
                return 8;
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
                AtomicInteger atomicInteger = C9Q8.A01;
                if (atomicInteger.get() != 0) {
                    int decrementAndGet = atomicInteger.decrementAndGet();
                    if (decrementAndGet == 0) {
                        Process.setThreadPriority(Process.myPid(), C9Q8.A02);
                        C9Q8.A00.set(false);
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
                Integer valueOf;
                int i3 = this.A01;
                int myPid = Process.myPid();
                AtomicBoolean atomicBoolean = C9Q8.A00;
                int i4 = 0;
                if (atomicBoolean.compareAndSet(false, true)) {
                    C9Q8.A02 = Process.getThreadPriority(myPid);
                    int i5 = C9Q8.A02;
                    if (C9Q8.A02 <= i3) {
                        atomicBoolean.set(false);
                        z = false;
                        valueOf = Integer.valueOf(C9Q8.A02);
                        this.A00 = AbstractC166987dD.A1L(z, valueOf);
                        return true;
                    }
                    i4 = i5;
                }
                Process.setThreadPriority(myPid, i3);
                C9Q8.A01.incrementAndGet();
                z = true;
                valueOf = Integer.valueOf(i4);
                this.A00 = AbstractC166987dD.A1L(z, valueOf);
                return true;
            }

            {
                this.A01 = i2;
            }
        };
    }
}
