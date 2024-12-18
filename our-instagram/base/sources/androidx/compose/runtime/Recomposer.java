package androidx.compose.runtime;

import X.AbstractC74903Yf;
import X.AnonymousClass195;
import X.AnonymousClass197;
import X.C008002u;
import X.C05A;
import X.C10E;
import X.C1127457f;
import X.C117415Ta;
import X.C12W;
import X.C14360o3;
import X.C16930sl;
import X.C18570vk;
import X.C1EM;
import X.C206929Dx;
import X.C3Z1;
import X.C57I;
import X.C57J;
import X.C57P;
import X.C57Q;
import X.C57S;
import X.C57T;
import X.C57U;
import X.C5UB;
import X.C5Z1;
import X.C9EV;
import X.COO;
import X.InterfaceC09390do;
import X.InterfaceC24901Jp;
import X.VIJ;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class Recomposer extends C57I {
    public long A00;
    public C18570vk A01;
    public Throwable A02;
    public List A03;
    public Set A04;
    public InterfaceC24901Jp A05;
    public AnonymousClass195 A06;
    public boolean A07;
    public COO A08;
    public List A09;
    public final C57P A0A;
    public final C57U A0B;
    public final C57S A0C;
    public final Object A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final Map A0H;
    public final Map A0I;
    public final C12W A0J;
    public final C05A A0K;
    public final AnonymousClass197 A0L;
    public static final C05A A0N = C10E.A00(C57J.A03);
    public static final AtomicReference A0M = new AtomicReference(false);

    public static final List A00(Recomposer recomposer) {
        List list = recomposer.A03;
        if (list == null) {
            List list2 = recomposer.A0E;
            if (list2.isEmpty()) {
                list = C16930sl.A00;
            } else {
                list = new ArrayList(list2);
            }
            recomposer.A03 = list;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC24901Jp A01(androidx.compose.runtime.Recomposer r4) {
        /*
            X.05A r2 = r4.A0K
            java.lang.Object r1 = r2.getValue()
            X.57T r1 = (X.C57T) r1
            X.57T r0 = X.C57T.ShuttingDown
            int r0 = r1.compareTo(r0)
            r1 = 0
            if (r0 > 0) goto L3f
            java.util.List r0 = r4.A0E
            r0.clear()
            X.0sl r0 = X.C16930sl.A00
            r4.A03 = r0
            r2 = 6
            X.0vk r0 = new X.0vk
            r0.<init>(r2)
            r4.A01 = r0
            X.57S r0 = r4.A0C
            r0.A01()
            java.util.List r0 = r4.A0G
            r0.clear()
            java.util.List r0 = r4.A0F
            r0.clear()
            r4.A09 = r1
            X.1Jp r0 = r4.A05
            if (r0 == 0) goto L3a
            r0.AGJ(r1)
        L3a:
            r4.A05 = r1
            r4.A08 = r1
        L3e:
            return r1
        L3f:
            X.COO r0 = r4.A08
            if (r0 != 0) goto L94
            X.195 r0 = r4.A06
            if (r0 != 0) goto L68
            r3 = 6
            X.0vk r0 = new X.0vk
            r0.<init>(r3)
            r4.A01 = r0
            X.57S r0 = r4.A0C
            r0.A01()
            boolean r0 = A05(r4)
            if (r0 == 0) goto L94
            X.57T r3 = X.C57T.InactivePendingWork
        L5c:
            r2.Egh(r3)
            X.57T r0 = X.C57T.PendingWork
            if (r3 != r0) goto L3e
            X.1Jp r0 = r4.A05
            r4.A05 = r1
            return r0
        L68:
            X.57S r0 = r4.A0C
            int r0 = r0.A00
            if (r0 != 0) goto L91
            X.0vk r0 = r4.A01
            int r0 = r0.A01
            if (r0 != 0) goto L91
            java.util.List r0 = r4.A0G
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L91
            java.util.List r0 = r4.A0F
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L91
            boolean r0 = A05(r4)
            if (r0 != 0) goto L91
            X.57T r3 = X.C57T.Idle
            goto L5c
        L91:
            X.57T r3 = X.C57T.PendingWork
            goto L5c
        L94:
            X.57T r3 = X.C57T.Inactive
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A01(androidx.compose.runtime.Recomposer):X.1Jp");
    }

    public static final void A02(C57Q c57q, Recomposer recomposer) {
        List list = recomposer.A09;
        if (list == null) {
            list = new ArrayList();
            recomposer.A09 = list;
        }
        if (!list.contains(c57q)) {
            list.add(c57q);
        }
        recomposer.A0E.remove(c57q);
        recomposer.A03 = null;
    }

    public static final void A03(C57Q c57q, Recomposer recomposer, Exception exc) {
        if (((Boolean) A0M.get()).booleanValue() && !(exc instanceof VIJ)) {
            synchronized (recomposer.A0D) {
                InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                recomposer.A0G.clear();
                recomposer.A0C.A01();
                recomposer.A01 = new C18570vk(6);
                recomposer.A0F.clear();
                recomposer.A0I.clear();
                recomposer.A0H.clear();
                recomposer.A08 = new COO(exc);
                if (c57q != null) {
                    A02(c57q, recomposer);
                }
                A01(recomposer);
            }
            return;
        }
        synchronized (recomposer.A0D) {
            COO coo = recomposer.A08;
            if (coo == null) {
                recomposer.A08 = new COO(exc);
            } else {
                throw coo.A00;
            }
        }
        throw exc;
    }

    public static final boolean A05(Recomposer recomposer) {
        if (!recomposer.A07 && recomposer.A0A.A03.get() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (A05(r3) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A06(androidx.compose.runtime.Recomposer r3) {
        /*
            java.lang.Object r2 = r3.A0D
            monitor-enter(r2)
            X.0vk r0 = r3.A01     // Catch: java.lang.Throwable -> L19
            int r0 = r0.A01     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L16
            X.57S r0 = r3.A0C     // Catch: java.lang.Throwable -> L19
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L16
            boolean r1 = A05(r3)     // Catch: java.lang.Throwable -> L19
            r0 = 0
            if (r1 == 0) goto L17
        L16:
            r0 = 1
        L17:
            monitor-exit(r2)
            return r0
        L19:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A06(androidx.compose.runtime.Recomposer):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A07(Recomposer recomposer) {
        List A00;
        AtomicReference atomicReference;
        Object obj;
        C1127457f c1127457f;
        boolean z;
        Object obj2 = recomposer.A0D;
        synchronized (obj2) {
            C18570vk c18570vk = recomposer.A01;
            if (c18570vk.A01 == 0) {
                if (recomposer.A0C.A00 == 0) {
                    if (A05(recomposer)) {
                    }
                    z = false;
                }
                z = true;
            } else {
                C1127457f c1127457f2 = new C1127457f(c18570vk);
                recomposer.A01 = new C18570vk(6);
                synchronized (obj2) {
                    A00 = A00(recomposer);
                }
                try {
                    int size = A00.size();
                    for (int i = 0; i < size; i++) {
                        C117415Ta c117415Ta = (C117415Ta) ((C57Q) A00.get(i));
                        do {
                            atomicReference = c117415Ta.A0F;
                            obj = atomicReference.get();
                            if (obj != null && !obj.equals(C5UB.A00)) {
                                if (obj instanceof Set) {
                                    c1127457f = new Set[]{(Set) obj, c1127457f2};
                                } else if (obj instanceof Object[]) {
                                    Object[] objArr = (Object[]) obj;
                                    C14360o3.A0B(objArr, 0);
                                    int length = objArr.length;
                                    Object[] copyOf = Arrays.copyOf(objArr, length + 1);
                                    copyOf[length] = c1127457f2;
                                    c1127457f = copyOf;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("corrupt pendingModifications: ");
                                    sb.append(atomicReference);
                                    throw new IllegalStateException(sb.toString());
                                }
                            } else {
                                c1127457f = c1127457f2;
                            }
                        } while (!C1EM.A00(obj, c1127457f, atomicReference));
                        if (obj == null) {
                            synchronized (c117415Ta.A0D) {
                                try {
                                    C117415Ta.A02(c117415Ta);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        if (((C57T) recomposer.A0K.getValue()).compareTo(C57T.ShuttingDown) <= 0) {
                            break;
                        }
                    }
                    synchronized (obj2) {
                        try {
                            recomposer.A01 = new C18570vk(6);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    synchronized (obj2) {
                        if (A01(recomposer) == null) {
                            if (recomposer.A0C.A00 == 0) {
                                if (A05(recomposer)) {
                                }
                                z = false;
                            }
                            z = true;
                        } else {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                    }
                } catch (Throwable th3) {
                    synchronized (obj2) {
                        recomposer.A01.A08(c1127457f2);
                        throw th3;
                    }
                }
            }
        }
        return z;
    }

    public final void A0E() {
        synchronized (this.A0D) {
            C05A c05a = this.A0K;
            if (((C57T) c05a.getValue()).compareTo(C57T.Idle) >= 0) {
                c05a.Egh(C57T.ShuttingDown);
            }
        }
        this.A0L.AGH(null);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.57U] */
    public Recomposer(C12W c12w) {
        C57P c57p = new C57P(new C9EV(this, 15));
        this.A0A = c57p;
        this.A0D = new Object();
        this.A0E = new ArrayList();
        this.A01 = new C18570vk(6);
        this.A0C = new C57S(new C57Q[16]);
        this.A0G = new ArrayList();
        this.A0F = new ArrayList();
        this.A0I = new LinkedHashMap();
        this.A0H = new LinkedHashMap();
        this.A0K = new C008002u(C57T.Inactive);
        AnonymousClass197 anonymousClass197 = new AnonymousClass197((AnonymousClass195) c12w.get(AnonymousClass195.A00));
        anonymousClass197.CPD(new C206929Dx(this, 34));
        this.A0L = anonymousClass197;
        this.A0J = c12w.plus(c57p).plus(anonymousClass197);
        this.A0B = new Object() { // from class: X.57U
        };
    }

    public static final void A04(C3Z1 c3z1) {
        try {
            if (!(c3z1.A0K() instanceof C5Z1)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c3z1.A0H();
        }
    }
}
