package X;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* renamed from: X.Tsp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65716Tsp implements InterfaceC71834X6r {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public final VK3 A08;
    public final Object A09;
    public final ArrayList A0A;
    public final ArrayList A0B;
    public static final AbstractC66379UEn A0I = new C65712Tsl(2);
    public static final AbstractC66379UEn A0G = new C65712Tsl(3);
    public static final AbstractC66379UEn A0H = new C65712Tsl(4);
    public static final AbstractC66379UEn A0D = new C65712Tsl(5);
    public static final AbstractC66379UEn A0E = new C65712Tsl(6);
    public static final AbstractC66379UEn A0F = new C65712Tsl(7);
    public static final AbstractC66379UEn A0J = new C65712Tsl(8);
    public static final AbstractC66379UEn A0K = new C65712Tsl(0);
    public static final AbstractC66379UEn A0C = new C65712Tsl(1);

    public static void A00(AbstractC65716Tsp abstractC65716Tsp, boolean z) {
        ArrayList arrayList;
        int i = 0;
        abstractC65716Tsp.A06 = false;
        ThreadLocal threadLocal = C141536aW.A05;
        if (threadLocal.get() == null) {
            threadLocal.set(new C141536aW());
        }
        C141536aW c141536aW = (C141536aW) threadLocal.get();
        c141536aW.A02.remove(abstractC65716Tsp);
        ArrayList arrayList2 = c141536aW.A04;
        int indexOf = arrayList2.indexOf(abstractC65716Tsp);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            c141536aW.A01 = true;
        }
        abstractC65716Tsp.A05 = 0L;
        abstractC65716Tsp.A07 = false;
        while (true) {
            arrayList = abstractC65716Tsp.A0A;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((C3M6) arrayList.get(i)).Cwa(abstractC65716Tsp, abstractC65716Tsp.A03, abstractC65716Tsp.A04, z);
            }
            i++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }

    public final void A04(float f) {
        ArrayList arrayList;
        this.A08.A01(this.A09, f);
        int i = 0;
        while (true) {
            arrayList = this.A0B;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((C3M7) arrayList.get(i)).Cwj(this, this.A03, this.A04);
            }
            i++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }

    public final void A05(C3M6 c3m6) {
        MSZ.A1P(c3m6, this.A0A);
    }

    public final void A06(C3M7 c3m7) {
        if (!this.A06) {
            MSZ.A1P(c3m7, this.A0B);
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public boolean A07(long j) {
        double d;
        float f;
        long j2 = j;
        C65726Tt0 c65726Tt0 = (C65726Tt0) this;
        boolean z = c65726Tt0.A02;
        float f2 = c65726Tt0.A00;
        if (z) {
            if (f2 != Float.MAX_VALUE) {
                c65726Tt0.A01.A02 = f2;
                c65726Tt0.A00 = Float.MAX_VALUE;
            }
            c65726Tt0.A03 = (float) c65726Tt0.A01.A02;
            c65726Tt0.A04 = 0.0f;
            c65726Tt0.A02 = false;
            return true;
        }
        C65717Tsq c65717Tsq = c65726Tt0.A01;
        if (f2 != Float.MAX_VALUE) {
            j2 = j / 2;
            C68873VdV A00 = c65717Tsq.A00(c65726Tt0.A03, c65726Tt0.A04, j2);
            c65717Tsq.A02 = f2;
            c65726Tt0.A00 = Float.MAX_VALUE;
            d = A00.A00;
            f = A00.A01;
        } else {
            d = c65726Tt0.A03;
            f = c65726Tt0.A04;
        }
        C68873VdV A002 = c65717Tsq.A00(d, f, j2);
        float f3 = A002.A00;
        c65726Tt0.A03 = f3;
        c65726Tt0.A04 = A002.A01;
        float max = Math.max(f3, ((AbstractC65716Tsp) c65726Tt0).A01);
        c65726Tt0.A03 = max;
        c65726Tt0.A03 = Math.min(max, ((AbstractC65716Tsp) c65726Tt0).A00);
        if (Math.abs(r4) < c65717Tsq.A07) {
            float f4 = (float) c65717Tsq.A02;
            if (Math.abs(r8 - f4) < c65717Tsq.A06) {
                c65726Tt0.A03 = f4;
                c65726Tt0.A04 = 0.0f;
                return true;
            }
            return false;
        }
        return false;
    }

    public AbstractC65716Tsp(C3M5 c3m5) {
        this.A04 = 0.0f;
        this.A03 = Float.MAX_VALUE;
        this.A07 = false;
        this.A06 = false;
        this.A00 = Float.MAX_VALUE;
        this.A01 = -3.4028235E38f;
        this.A05 = 0L;
        this.A0A = new ArrayList();
        this.A0B = new ArrayList();
        this.A09 = null;
        this.A08 = new C65718Tsr(this, c3m5);
        this.A02 = 1.0f;
    }

    public void A01() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.A06) {
                A00(this, true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public void A02() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.A06) {
                this.A06 = true;
                if (!this.A07) {
                    this.A03 = this.A08.A00(this.A09);
                }
                float f = this.A03;
                if (f <= this.A00 && f >= this.A01) {
                    ThreadLocal threadLocal = C141536aW.A05;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new C141536aW());
                    }
                    C141536aW c141536aW = (C141536aW) threadLocal.get();
                    ArrayList arrayList = c141536aW.A04;
                    if (arrayList.size() == 0) {
                        C141556aY c141556aY = c141536aW.A00;
                        if (c141556aY == null) {
                            c141556aY = new C141556aY(c141536aW.A03);
                            c141536aW.A00 = c141556aY;
                        }
                        c141556aY.A01.postFrameCallback(c141556aY.A00);
                    }
                    MSZ.A1P(this, arrayList);
                    return;
                }
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    public void A03(float f) {
    }

    public AbstractC65716Tsp(VK3 vk3, Object obj) {
        float f;
        this.A04 = 0.0f;
        this.A03 = Float.MAX_VALUE;
        this.A07 = false;
        this.A06 = false;
        this.A00 = Float.MAX_VALUE;
        this.A01 = -3.4028235E38f;
        this.A05 = 0L;
        this.A0A = new ArrayList();
        this.A0B = new ArrayList();
        this.A09 = obj;
        this.A08 = vk3;
        if (vk3 != A0D && vk3 != A0E && vk3 != A0F) {
            if (vk3 != A0C && vk3 != A0G && vk3 != A0H) {
                f = 1.0f;
            } else {
                this.A02 = 0.00390625f;
                return;
            }
        } else {
            f = 0.1f;
        }
        this.A02 = f;
    }
}
