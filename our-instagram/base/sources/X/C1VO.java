package X;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;

/* renamed from: X.1VO, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1VO implements Closeable, Cloneable {
    public static int A04;
    public boolean A00;
    public final C1VV A01;
    public final C3QG A02;
    public final Throwable A03;
    public static final C1VS A06 = new C1VS() { // from class: X.1VR
        @Override // X.C1VS
        public final /* bridge */ /* synthetic */ void EE3(Object obj) {
            Closeable closeable = (Closeable) obj;
            if (closeable != null) {
                try {
                    try {
                        closeable.close();
                    } catch (IOException e) {
                        STO.A00.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
                    }
                } catch (IOException unused) {
                }
            }
        }
    };
    public static final C1VV A05 = new C1VV() { // from class: X.1VU
        @Override // X.C1VV
        public final void EHn(C3QG c3qg, Throwable th) {
            String name;
            Object A01 = c3qg.A01();
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            Integer valueOf2 = Integer.valueOf(System.identityHashCode(c3qg));
            if (A01 == null) {
                name = null;
            } else {
                name = A01.getClass().getName();
            }
            C0I2.A02(C1VO.class, "Finalized without closing: %x %x (type = %s)", valueOf, valueOf2, name);
        }
    };

    public C1VO(C1VV c1vv, C1VS c1vs, Object obj, boolean z) {
        this.A00 = false;
        this.A02 = new C3QG(c1vs, obj, z);
        this.A01 = c1vv;
        this.A03 = null;
    }

    public static C1VO A00(C1VV c1vv, C1VS c1vs, Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof C3QD)) {
            int i = A04;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new C1VO(null, null, obj, false);
                    }
                } else {
                    return new C1VO(c1vv, c1vs, obj, false);
                }
            } else {
                return new UMA(c1vv, c1vs, obj);
            }
        }
        return new C107964tf(c1vv, c1vs, obj);
    }

    public abstract C1VO A02();

    public synchronized C1VO A03() {
        C1VO c1vo;
        if (A05()) {
            c1vo = A02();
        } else {
            c1vo = null;
        }
        return c1vo;
    }

    public final synchronized Object A04() {
        Object A01;
        boolean z = false;
        if (!this.A00) {
            z = true;
        }
        C0Hf.A01(z);
        A01 = this.A02.A01();
        A01.getClass();
        return A01;
    }

    public synchronized boolean A05() {
        return !this.A00;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.A00) {
                return;
            }
            this.A00 = true;
            this.A02.A02();
        }
    }

    public static void A01(C1VO c1vo) {
        if (c1vo != null) {
            c1vo.close();
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        throw C00O.createAndThrow();
    }

    public C1VO(C1VV c1vv, C3QG c3qg, Throwable th) {
        this.A00 = false;
        this.A02 = c3qg;
        synchronized (c3qg) {
            C3QG.A00(c3qg);
            c3qg.A00++;
        }
        this.A01 = c1vv;
        this.A03 = th;
    }
}
