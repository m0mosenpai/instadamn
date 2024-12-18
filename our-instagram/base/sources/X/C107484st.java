package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.4st, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107484st {
    public static C107484st A08;
    public final C107494su A07;
    public final java.util.Set A06 = new LinkedHashSet();
    public final ArrayList A02 = new ArrayList();
    public final Map A05 = new HashMap();
    public boolean A01 = false;
    public final List A04 = new ArrayList();
    public final List A03 = new ArrayList();
    public boolean A00 = false;

    public final synchronized void A00(C107534sy c107534sy) {
        if (c107534sy.A02) {
            if (this.A01) {
                this.A03.add(c107534sy);
            } else {
                java.util.Set set = this.A06;
                set.add(c107534sy);
                ArrayList arrayList = c107534sy.A05;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = arrayList.get(i);
                    Map map = this.A05;
                    C107654tA c107654tA = (C107654tA) map.get(obj);
                    if (c107654tA != null) {
                        c107654tA.A00++;
                    } else {
                        C107654tA c107654tA2 = new C107654tA();
                        c107654tA2.A00 = 1;
                        map.put(obj, c107654tA2);
                    }
                }
                if (set.size() == 1) {
                    C107494su c107494su = this.A07;
                    if (c107494su.A01 != null) {
                        if (!c107494su.A03) {
                            c107494su.A03 = true;
                            if (!c107494su.A02) {
                                c107494su.A05.A01(c107494su.A04);
                                c107494su.A02 = true;
                            }
                        } else {
                            throw new RuntimeException("Tried to start but was already running.");
                        }
                    } else {
                        throw new RuntimeException("Must set a binding graph first.");
                    }
                }
                this.A00 = true;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected added GraphBinding to be active: ");
            sb.append(c107534sy);
        }
    }

    public final synchronized void A01(C107534sy c107534sy) {
        if (this.A01) {
            this.A04.add(c107534sy);
        } else {
            java.util.Set set = this.A06;
            if (set.remove(c107534sy)) {
                ArrayList arrayList = c107534sy.A05;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = arrayList.get(i);
                    Map map = this.A05;
                    C107654tA c107654tA = (C107654tA) map.get(obj);
                    int i2 = c107654tA.A00 - 1;
                    c107654tA.A00 = i2;
                    if (i2 == 0) {
                        map.remove(obj);
                    }
                }
                if (set.isEmpty()) {
                    C107494su c107494su = this.A07;
                    if (c107494su.A03) {
                        c107494su.A03 = false;
                        C107504sv c107504sv = c107494su.A05;
                        AbstractC107524sx abstractC107524sx = c107494su.A04;
                        abstractC107524sx.A02.set(null);
                        Choreographer choreographer = c107504sv.A00;
                        if (choreographer != null) {
                            Choreographer.FrameCallback frameCallback = abstractC107524sx.A00;
                            if (frameCallback == null) {
                                frameCallback = new ChoreographerFrameCallbackC107664tB(abstractC107524sx);
                                abstractC107524sx.A00 = frameCallback;
                            }
                            choreographer.removeFrameCallback(frameCallback);
                        } else {
                            Handler handler = c107504sv.A01;
                            Runnable runnable = abstractC107524sx.A01;
                            if (runnable == null) {
                                runnable = new RunnableC24262ApT(abstractC107524sx);
                                abstractC107524sx.A01 = runnable;
                            }
                            handler.removeCallbacks(runnable);
                        }
                        c107494su.A02 = false;
                        this.A02.clear();
                        if (!this.A05.isEmpty()) {
                            throw new RuntimeException("Failed to clean up all nodes");
                        }
                    } else {
                        throw new RuntimeException("Tried to stop but wasn't running.");
                    }
                }
                this.A00 = true;
            } else {
                throw new RuntimeException("Tried to unregister non-existent binding");
            }
        }
    }

    public C107484st(C107494su c107494su) {
        this.A07 = c107494su;
    }
}
