package X;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.57I, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C57I {
    public final C12W A08() {
        if (this instanceof Recomposer) {
            return ((Recomposer) this).A0J;
        }
        return ((C117615Tw) this).A07.A0U.A08();
    }

    public final void A09(C57Q c57q) {
        InterfaceC24901Jp interfaceC24901Jp;
        if (this instanceof C117615Tw) {
            C117505Tk c117505Tk = ((C117615Tw) this).A07;
            C57I c57i = c117505Tk.A0U;
            c57i.A09(c117505Tk.A0V);
            c57i.A09(c57q);
            return;
        }
        Recomposer recomposer = (Recomposer) this;
        synchronized (recomposer.A0D) {
            C57S c57s = recomposer.A0C;
            if (!c57s.A0A(c57q)) {
                c57s.A09(c57q);
                interfaceC24901Jp = Recomposer.A01(recomposer);
            } else {
                interfaceC24901Jp = null;
            }
        }
        if (interfaceC24901Jp == null) {
            return;
        }
        interfaceC24901Jp.resumeWith(C0eB.A00);
    }

    public final void A0A(C57Q c57q) {
        if (this instanceof Recomposer) {
            Recomposer recomposer = (Recomposer) this;
            synchronized (recomposer.A0D) {
                java.util.Set set = recomposer.A04;
                if (set == null) {
                    set = new LinkedHashSet();
                    recomposer.A04 = set;
                }
                set.add(c57q);
            }
            return;
        }
        ((C117615Tw) this).A07.A0U.A0A(c57q);
    }

    public final void A0B(C57Q c57q) {
        if (this instanceof C117615Tw) {
            ((C117615Tw) this).A07.A0U.A0B(c57q);
            return;
        }
        Recomposer recomposer = (Recomposer) this;
        synchronized (recomposer.A0D) {
            recomposer.A0E.remove(c57q);
            recomposer.A03 = null;
            recomposer.A0C.A0B(c57q);
            recomposer.A0G.remove(c57q);
        }
    }

    public final void A0C(C57Q c57q, InterfaceC16620sF interfaceC16620sF) {
        if (this instanceof Recomposer) {
            Recomposer recomposer = (Recomposer) this;
            C117415Ta c117415Ta = (C117415Ta) c57q;
            C117505Tk c117505Tk = c117415Ta.A05;
            boolean z = c117505Tk.A0L;
            try {
                C3Z1 A00 = C3Z5.A00(new C206929Dx(c57q, 35), new C9F3(6, (Object) null, c57q));
                try {
                    C75033Yt c75033Yt = AbstractC75013Yr.A05;
                    Snapshot snapshot = (Snapshot) c75033Yt.A00();
                    c75033Yt.A01(A00);
                    try {
                        synchronized (c117415Ta.A0D) {
                            C117415Ta.A01(c117415Ta);
                            C117455Te c117455Te = c117415Ta.A00;
                            c117415Ta.A00 = new C117455Te();
                            try {
                                if (c117505Tk.A0E.A00.A02 == 0) {
                                    C117505Tk.A0J(c117505Tk, c117455Te, interfaceC16620sF);
                                } else {
                                    C5UC.A03("Expected applyChanges() to have been called");
                                    throw C00O.createAndThrow();
                                }
                            } catch (Exception e) {
                                c117415Ta.A00 = c117455Te;
                                throw e;
                            }
                        }
                        Recomposer.A04(A00);
                        if (!z) {
                            AbstractC75013Yr.A00().A06();
                        }
                        Object obj = recomposer.A0D;
                        synchronized (obj) {
                            if (((C57T) recomposer.A0K.getValue()).compareTo(C57T.ShuttingDown) > 0 && !Recomposer.A00(recomposer).contains(c57q)) {
                                recomposer.A0E.add(c57q);
                                recomposer.A03 = null;
                            }
                        }
                        synchronized (obj) {
                            try {
                                List list = recomposer.A0F;
                                if (0 < list.size()) {
                                    list.get(0);
                                    throw new NullPointerException("getComposition$runtime_release");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            c57q.AC3();
                            c57q.ACA();
                            if (!z) {
                                AbstractC75013Yr.A00().A06();
                            }
                        } catch (Exception e2) {
                            Recomposer.A03(null, recomposer, e2);
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Recomposer.A04(A00);
                    throw th2;
                }
            } catch (Exception e3) {
                Recomposer.A03(c57q, recomposer, e3);
            }
        } else {
            ((C117615Tw) this).A07.A0U.A0C(c57q, interfaceC16620sF);
        }
    }

    public final boolean A0D() {
        if (this instanceof Recomposer) {
            return ((Boolean) Recomposer.A0M.get()).booleanValue();
        }
        return ((C117615Tw) this).A07.A0U.A0D();
    }
}
