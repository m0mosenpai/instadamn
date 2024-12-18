package X;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* renamed from: X.Tt0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65726Tt0 extends AbstractC65716Tsp {
    public float A00;
    public C65717Tsq A01;
    public boolean A02;

    @Override // X.AbstractC65716Tsp
    public final void A02() {
        C65717Tsq c65717Tsq = this.A01;
        if (c65717Tsq != null) {
            double d = (float) c65717Tsq.A02;
            if (d <= super.A00) {
                if (d >= super.A01) {
                    double abs = Math.abs(super.A02 * 0.75f);
                    c65717Tsq.A06 = abs;
                    c65717Tsq.A07 = abs * 62.5d;
                    super.A02();
                    return;
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public final void A08() {
        if (this.A01.A01 > 0.0d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.A06) {
                    this.A02 = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }

    public final void A09(float f) {
        if (this.A06) {
            this.A00 = f;
            return;
        }
        C65717Tsq c65717Tsq = this.A01;
        if (c65717Tsq == null) {
            c65717Tsq = new C65717Tsq(f);
            this.A01 = c65717Tsq;
        }
        c65717Tsq.A02 = f;
        A02();
    }

    public C65726Tt0(VK3 vk3, Object obj, float f) {
        super(vk3, obj);
        this.A01 = null;
        this.A00 = Float.MAX_VALUE;
        this.A02 = false;
        this.A01 = new C65717Tsq(f);
    }

    @Override // X.AbstractC65716Tsp
    public final void A01() {
        super.A01();
        float f = this.A00;
        if (f != Float.MAX_VALUE) {
            C65717Tsq c65717Tsq = this.A01;
            if (c65717Tsq == null) {
                this.A01 = new C65717Tsq(f);
            } else {
                c65717Tsq.A02 = f;
            }
            this.A00 = Float.MAX_VALUE;
        }
    }

    public C65726Tt0(VK3 vk3, Object obj) {
        super(vk3, obj);
        this.A01 = null;
        this.A00 = Float.MAX_VALUE;
        this.A02 = false;
    }
}
