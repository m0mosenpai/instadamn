package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.2hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55962hh {
    public long A00;
    public C55952hg A01;
    public boolean A02;
    public final Choreographer.FrameCallback A03;
    public final Choreographer A04;

    public C55962hh(Choreographer choreographer) {
        this.A04 = choreographer;
        this.A03 = new Choreographer.FrameCallback() { // from class: X.2hi
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C55952hg c55952hg;
                boolean z;
                C55962hh c55962hh = C55962hh.this;
                if (c55962hh.A02 && (c55952hg = c55962hh.A01) != null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    double d = uptimeMillis - c55962hh.A00;
                    CopyOnWriteArraySet copyOnWriteArraySet = c55952hg.A04;
                    Iterator it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC148026lY) it.next()).CzD(c55952hg);
                    }
                    java.util.Set<C55982hj> set = c55952hg.A03;
                    for (C55982hj c55982hj : set) {
                        boolean A0C = c55982hj.A0C();
                        if (A0C && c55982hj.A07) {
                            set.remove(c55982hj);
                        } else {
                            double d2 = d / 1000.0d;
                            if (!A0C || !c55982hj.A07) {
                                double d3 = 0.064d;
                                if (d2 <= 0.064d) {
                                    d3 = d2;
                                }
                                double d4 = c55982hj.A04 + d3;
                                c55982hj.A04 = d4;
                                C55942hf c55942hf = c55982hj.A05;
                                double d5 = c55942hf.A01;
                                double d6 = c55942hf.A00;
                                C55992hk c55992hk = c55982hj.A09;
                                double d7 = c55992hk.A00;
                                double d8 = c55992hk.A01;
                                C55992hk c55992hk2 = c55982hj.A0B;
                                double d9 = c55992hk2.A00;
                                double d10 = c55992hk2.A01;
                                while (d4 >= 0.001d) {
                                    d4 -= 0.001d;
                                    c55982hj.A04 = d4;
                                    if (d4 < 0.001d) {
                                        C55992hk c55992hk3 = c55982hj.A0A;
                                        c55992hk3.A00 = d7;
                                        c55992hk3.A01 = d8;
                                    }
                                    double d11 = c55982hj.A01;
                                    double d12 = ((d11 - d9) * d5) - (d6 * d8);
                                    double d13 = d8 + (d12 * 0.001d * 0.5d);
                                    double d14 = ((d11 - (((d8 * 0.001d) * 0.5d) + d7)) * d5) - (d6 * d13);
                                    double d15 = d8 + (d14 * 0.001d * 0.5d);
                                    double d16 = ((d11 - (d7 + ((d13 * 0.001d) * 0.5d))) * d5) - (d6 * d15);
                                    d9 = d7 + (d15 * 0.001d);
                                    d10 = d8 + (d16 * 0.001d);
                                    d7 += (d8 + ((d13 + d15) * 2.0d) + d10) * 0.16666666666666666d * 0.001d;
                                    d8 += (d12 + ((d14 + d16) * 2.0d) + (((d11 - d9) * d5) - (d6 * d10))) * 0.16666666666666666d * 0.001d;
                                }
                                c55992hk2.A00 = d9;
                                c55992hk2.A01 = d10;
                                c55992hk.A00 = d7;
                                c55992hk.A01 = d8;
                                if (d4 > 0.0d) {
                                    double d17 = d4 / 0.001d;
                                    C55992hk c55992hk4 = c55982hj.A0A;
                                    double d18 = 1.0d - d17;
                                    d7 = (d7 * d17) + (c55992hk4.A00 * d18);
                                    c55992hk.A00 = d7;
                                    c55992hk.A01 = (d8 * d17) + (c55992hk4.A01 * d18);
                                }
                                boolean z2 = true;
                                if (c55982hj.A0C() || (c55982hj.A06 && c55982hj.A0D())) {
                                    if (d5 > 0.0d) {
                                        double d19 = c55982hj.A01;
                                        c55982hj.A03 = d19;
                                        c55992hk.A00 = d19;
                                    } else {
                                        c55982hj.A01 = d7;
                                        c55982hj.A03 = d7;
                                    }
                                    c55982hj.A07(0.0d);
                                    A0C = true;
                                }
                                if (c55982hj.A07) {
                                    c55982hj.A07 = false;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (A0C) {
                                    c55982hj.A07 = true;
                                } else {
                                    z2 = false;
                                }
                                Iterator it2 = c55982hj.A0D.iterator();
                                while (it2.hasNext()) {
                                    InterfaceC55932he interfaceC55932he = (InterfaceC55932he) it2.next();
                                    if (z) {
                                        interfaceC55932he.Dnj(c55982hj);
                                    }
                                    interfaceC55932he.Dnm(c55982hj);
                                    if (z2) {
                                        interfaceC55932he.Dnk(c55982hj);
                                    }
                                }
                            }
                        }
                    }
                    if (set.isEmpty()) {
                        c55952hg.A00 = true;
                    }
                    Iterator it3 = copyOnWriteArraySet.iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC148026lY) it3.next()).Cw4(c55952hg);
                    }
                    if (c55952hg.A00) {
                        C55962hh c55962hh2 = c55952hg.A01;
                        c55962hh2.A02 = false;
                        c55962hh2.A04.removeFrameCallback(c55962hh2.A03);
                    }
                    c55962hh.A00 = uptimeMillis;
                    c55962hh.A04.postFrameCallback(c55962hh.A03);
                }
            }
        };
    }

    public C55962hh() {
    }
}
