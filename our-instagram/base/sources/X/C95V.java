package X;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: X.95V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C95V extends C15E {
    @Override // X.C15E
    public final int A00() {
        return 6;
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
        return new AbstractC219814y(i2) { // from class: X.96Y
            public C09530e4 A00 = new C09530e4(false, 0);
            public final int A01;

            @Override // X.AbstractC219814y, X.InterfaceC219914z
            public final int AhK() {
                return 6;
            }

            @Override // X.AbstractC219814y
            public final C2050695w A02(int i3, int i4) {
                C2050695w c2050695w = new C2050695w();
                String valueOf = String.valueOf(((Number) this.A00.A01).intValue());
                Map map = c2050695w.A02;
                map.put("old_priority", valueOf);
                map.put("new_priority", String.valueOf(this.A01));
                map.put("is_boosted", String.valueOf(((Boolean) this.A00.A00).booleanValue()));
                this.A00 = new C09530e4(false, 0);
                return c2050695w;
            }

            @Override // X.AbstractC219814y
            public final void A04() {
                AtomicInteger atomicInteger = AbstractC154696xK.A01;
                if (atomicInteger.get() != 0) {
                    int decrementAndGet = atomicInteger.decrementAndGet();
                    if (decrementAndGet == 0) {
                        int A00 = C15T.A00();
                        if (A00 >= 0) {
                            Process.setThreadPriority(A00, AbstractC154696xK.A02);
                            AbstractC154696xK.A00.set(false);
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
                int i3 = this.A01;
                int A00 = C15T.A00();
                boolean z2 = false;
                if (A00 >= 0) {
                    z2 = true;
                }
                int i4 = 0;
                if (!z2) {
                    z = false;
                } else {
                    if (AbstractC154696xK.A00.compareAndSet(false, true)) {
                        AbstractC154696xK.A02 = Process.getThreadPriority(A00);
                        i4 = AbstractC154696xK.A02;
                    }
                    Process.setThreadPriority(A00, i3);
                    AbstractC154696xK.A01.incrementAndGet();
                    z = true;
                }
                this.A00 = new C09530e4(z, Integer.valueOf(i4));
                return true;
            }

            {
                this.A01 = i2;
            }
        };
    }
}
