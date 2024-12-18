package X;

import android.content.Context;
import android.media.MediaFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class U7X {
    public VN4 A00;
    public boolean A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final Context A07;
    public final MediaFormat A08;
    public final C58647PzK A09;
    public final MYB A0A;
    public final InterfaceC58019Po5 A0B;
    public final C70129W5q A0C;
    public final X9U A0D;
    public final InterfaceC72006XEu A0E;
    public final InterfaceC71972XDf A0F;
    public final C69489VoC A0G;
    public final XCA A0H;
    public final InterfaceC71998XEm A0I;
    public Map A02 = new HashMap();
    public Map A01 = new HashMap();
    public final List A0J = new ArrayList();

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Tyj, java.lang.Object] */
    public final synchronized void A00() {
        ?? obj = new Object();
        int i = 0;
        while (true) {
            this.A00.getClass();
            if (i < 1) {
                InterfaceC72000XEo interfaceC72000XEo = (InterfaceC72000XEo) AbstractC166997dE.A0m(this.A01, i);
                if (interfaceC72000XEo != null) {
                    try {
                        interfaceC72000XEo.cancel();
                    } catch (Throwable th) {
                        C66046Tyj.A00(obj, th);
                    }
                }
                C66280U7a c66280U7a = (C66280U7a) AbstractC166997dE.A0m(this.A02, i);
                if (c66280U7a != null) {
                    try {
                        try {
                            C66280U7a.A02(c66280U7a, true);
                        } catch (Throwable th2) {
                            C66046Tyj.A00(obj, th2);
                        }
                    } catch (IOException | RuntimeException unused) {
                    }
                    c66280U7a.A06 = false;
                }
                i = 1;
            } else {
                this.A02.clear();
                this.A01.clear();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.Tyj, java.lang.Object] */
    public final synchronized void A01() {
        ?? obj = new Object();
        int i = 0;
        while (true) {
            this.A00.getClass();
            if (i < 1) {
                C66280U7a c66280U7a = (C66280U7a) AbstractC166997dE.A0m(this.A02, i);
                if (c66280U7a != null && c66280U7a.A06) {
                    this.A0C.A0W = true;
                    try {
                        c66280U7a.stop();
                    } catch (Throwable th) {
                        C66046Tyj.A00(obj, th);
                    }
                }
                InterfaceC72000XEo interfaceC72000XEo = (InterfaceC72000XEo) AbstractC166997dE.A0m(this.A01, i);
                if (interfaceC72000XEo != null) {
                    try {
                        interfaceC72000XEo.release();
                    } catch (Throwable th2) {
                        C66046Tyj.A00(obj, th2);
                    }
                }
                i = 1;
            } else {
                this.A02.clear();
                this.A01.clear();
                obj.A01();
            }
        }
    }

    public final boolean A03() {
        int i = 0;
        boolean z = true;
        while (true) {
            this.A00.getClass();
            if (i < 1) {
                InterfaceC72000XEo interfaceC72000XEo = (InterfaceC72000XEo) this.A01.get(Integer.valueOf(i));
                if (interfaceC72000XEo != null) {
                    if (z) {
                        z = true;
                        if (interfaceC72000XEo.CRW()) {
                        }
                    }
                    z = false;
                }
                i = 1;
            } else {
                return z;
            }
        }
    }

    public final void A02(long j) {
        Map map = this.A01;
        if (map.get(0) != null) {
            ((InterfaceC72000XEo) map.get(0)).EGl(j);
            this.A00.getClass();
            int i = 0;
            while (true) {
                VN4 vn4 = this.A00;
                if (i < 1) {
                    vn4.getClass();
                    Object obj = map.get(Integer.valueOf(i));
                    obj.getClass();
                    ((InterfaceC72000XEo) obj).APt(j);
                    i = 1;
                } else {
                    return;
                }
            }
        }
    }

    public U7X(Context context, MediaFormat mediaFormat, C58647PzK c58647PzK, MYB myb, InterfaceC58019Po5 interfaceC58019Po5, C70129W5q c70129W5q, X9U x9u, InterfaceC72006XEu interfaceC72006XEu, InterfaceC71972XDf interfaceC71972XDf, C69489VoC c69489VoC, XCA xca, InterfaceC71998XEm interfaceC71998XEm, int i, long j, long j2) {
        this.A0D = x9u;
        this.A0F = interfaceC71972XDf;
        this.A0G = c69489VoC;
        this.A0C = c70129W5q;
        this.A0B = interfaceC58019Po5;
        this.A07 = context;
        this.A04 = i;
        this.A08 = mediaFormat;
        this.A0I = interfaceC71998XEm;
        this.A0E = interfaceC72006XEu;
        this.A09 = c58647PzK;
        this.A0H = xca;
        this.A06 = j;
        this.A05 = j2;
        this.A0A = myb;
    }
}
