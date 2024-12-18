package X;

import android.os.Process;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: X.95W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C95W extends C15E {
    @Override // X.C15E
    public final int A00() {
        return 9;
    }

    @Override // X.C15E
    public final InterfaceC219914z A01(C15P c15p, int i) {
        if (c15p == null) {
            return C219714x.A00;
        }
        final int i2 = c15p.A02;
        return new AbstractC219814y(i2) { // from class: X.9ak
            public Pair A00 = new Pair(false, 0);
            public final int A01;

            @Override // X.AbstractC219814y, X.InterfaceC219914z
            public final int AhK() {
                return 9;
            }

            @Override // X.AbstractC219814y
            public final C2050695w A02(int i3, int i4) {
                C2050695w c2050695w = new C2050695w();
                String obj = this.A00.second.toString();
                Map map = c2050695w.A02;
                map.put("old_priority", obj);
                map.put("new_priority", String.valueOf(this.A01));
                map.put("is_boosted", this.A00.first.toString());
                this.A00 = new Pair(false, 0);
                return c2050695w;
            }

            @Override // X.AbstractC219814y
            public final void A04() {
                AtomicInteger atomicInteger = A4D.A01;
                if (atomicInteger.get() != 0) {
                    int decrementAndGet = atomicInteger.decrementAndGet();
                    if (decrementAndGet == 0) {
                        if (A4D.A03 != null && A4D.A03.intValue() >= 0) {
                            Process.setThreadPriority(A4D.A03.intValue(), A4D.A02);
                            A4D.A00.set(false);
                            return;
                        }
                        return;
                    }
                    if (decrementAndGet >= 0) {
                        return;
                    }
                    atomicInteger.compareAndSet(decrementAndGet, 0);
                }
            }

            @Override // X.AbstractC219814y
            public final boolean A05() {
                boolean z;
                int i3;
                int i4 = this.A01;
                if (A4D.A03 == null) {
                    int[] A00 = C15U.A00("(ComponentLayout)");
                    if (A00.length != 1) {
                        i3 = -1;
                    } else {
                        i3 = A00[0];
                    }
                    A4D.A03 = Integer.valueOf(i3);
                }
                int intValue = A4D.A03.intValue();
                boolean z2 = false;
                if (intValue >= 0) {
                    z2 = true;
                }
                int i5 = 0;
                if (!z2) {
                    z = false;
                } else {
                    if (A4D.A00.compareAndSet(false, true)) {
                        A4D.A02 = Process.getThreadPriority(intValue);
                        i5 = A4D.A02;
                    }
                    Process.setThreadPriority(intValue, i4);
                    A4D.A01.incrementAndGet();
                    z = true;
                }
                this.A00 = new Pair(z, Integer.valueOf(i5));
                return true;
            }

            {
                this.A01 = i2;
            }
        };
    }

    @Override // X.C15E
    public final C15P A02(JSONObject jSONObject, int i) {
        int optInt = jSONObject.optInt("priority");
        C15P c15p = new C15P();
        c15p.A02 = optInt;
        return c15p;
    }
}
