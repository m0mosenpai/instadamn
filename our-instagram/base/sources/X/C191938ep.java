package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.8ep, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191938ep {
    public static final C191938ep A04 = new C191938ep();
    public final C20030yX A00 = new C005001p(0);
    public final C20030yX A01 = new C005001p(0);
    public final C191948eq A02 = C191948eq.A00;
    public final Handler A03 = new Handler(AbstractC191958er.A00);

    public static C191968es A00(C191938ep c191938ep, String str) {
        c191938ep.A01.remove(str);
        C9QU c9qu = C9QU.A03;
        synchronized (c9qu.A01) {
            c9qu.A00.remove(str);
        }
        return (C191968es) c191938ep.A00.remove(str);
    }

    public final C191968es A02(AbstractC191868ei abstractC191868ei) {
        C191968es A00;
        synchronized (this.A02) {
            A00 = A00(this, abstractC191868ei.A01());
        }
        return A00;
    }

    public final void A03(Context context, AbstractC191868ei abstractC191868ei, long j) {
        AbstractC191868ei abstractC191868ei2 = abstractC191868ei;
        if (j >= 0) {
            final String A01 = abstractC191868ei2.A01();
            C9QU c9qu = C9QU.A03;
            synchronized (this.A02) {
                if (!this.A00.containsKey(A01) && !this.A01.containsKey(A01)) {
                    return;
                }
                synchronized (c9qu.A01) {
                    C20030yX c20030yX = c9qu.A00;
                    c20030yX.put(A01, Integer.valueOf(((Integer) c20030yX.getOrDefault(A01, 0)).intValue() + 1));
                }
                boolean equals = Boolean.TRUE.equals(abstractC191868ei2.A00());
                final AbstractC191868ei abstractC191868ei3 = abstractC191868ei2;
                if (equals) {
                    Context applicationContext = context.getApplicationContext();
                    C191858eh c191858eh = (C191858eh) abstractC191868ei2;
                    Bundle bundle = new Bundle();
                    bundle.putString("appId", c191858eh.A03);
                    bundle.putLong("secondsUnderWhichToOnlyServeCache", c191858eh.A01);
                    bundle.putLong("secondsCacheIsValidFor", c191858eh.A00);
                    HashMap hashMap = c191858eh.A05;
                    if (hashMap != null) {
                        bundle.putSerializable("params", hashMap);
                    }
                    C191858eh c191858eh2 = new C191858eh();
                    ((AbstractC191868ei) c191858eh2).A00 = applicationContext.getApplicationContext();
                    BitSet bitSet = new BitSet(2);
                    bitSet.clear();
                    String string = bundle.getString("appId");
                    string.getClass();
                    c191858eh2.A03 = string;
                    bitSet.set(1);
                    c191858eh2.A01 = bundle.getLong("secondsUnderWhichToOnlyServeCache", 0L);
                    c191858eh2.A00 = bundle.getLong("secondsCacheIsValidFor", 0L);
                    c191858eh2.A05 = (HashMap) bundle.getSerializable("params");
                    AbstractC191878ej.A00(bitSet, new String[]{"session", "appId"});
                    c191858eh2.A04 = AbstractC191888ek.A00(c191858eh2.A05, c191858eh2.A03, null);
                    abstractC191868ei3 = c191858eh2;
                }
                this.A03.postDelayed(new Runnable() { // from class: X.9JD
                    @Override // java.lang.Runnable
                    public final void run() {
                        int intValue;
                        C191968es c191968es;
                        C191938ep c191938ep = C191938ep.this;
                        C191938ep c191938ep2 = C191938ep.A04;
                        synchronized (c191938ep.A02) {
                            C9QU c9qu2 = C9QU.A03;
                            String str = A01;
                            synchronized (c9qu2.A01) {
                                C20030yX c20030yX2 = c9qu2.A00;
                                intValue = ((Integer) c20030yX2.getOrDefault(str, 0)).intValue() - 1;
                                if (intValue == 0) {
                                    c20030yX2.remove(str);
                                } else if (intValue >= 1) {
                                    c20030yX2.put(str, Integer.valueOf(intValue));
                                }
                            }
                            if (intValue != 0) {
                                c191968es = null;
                            } else {
                                c191968es = C191938ep.A00(c191938ep, str);
                            }
                        }
                        if (c191968es != null) {
                            c191968es.A02.A02();
                        }
                    }
                }, j);
            }
        }
    }

    public final C191968es A01(AbstractC191868ei abstractC191868ei) {
        C8f5 c8f5;
        boolean z;
        String A01 = abstractC191868ei.A01();
        synchronized (this.A02) {
            C191968es c191968es = (C191968es) this.A00.get(A01);
            if (c191968es == null || (c8f5 = c191968es.A02) == null) {
                return null;
            }
            if (!c8f5.A00.A00.A01().equals(abstractC191868ei.A01())) {
                A02(abstractC191868ei);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c8f5.A02();
                return null;
            }
            return c191968es;
        }
    }
}
