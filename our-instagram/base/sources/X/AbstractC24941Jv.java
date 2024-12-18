package X;

import android.os.Looper;
import android.util.SparseIntArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: X.1Jv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC24941Jv {
    public static final Thread A07 = Looper.getMainLooper().getThread();
    public long A00;
    public HandlerC24971Jy A01;
    public C24981Jz A02;
    public boolean A04;
    public final C0JO A06 = AwakeTimeSinceBootClock.INSTANCE;
    public final SparseIntArray A05 = new SparseIntArray();
    public boolean A03 = false;

    public static void A00(AbstractC24941Jv abstractC24941Jv) {
        if (abstractC24941Jv.A03) {
        } else {
            throw new RuntimeException("accessing before initialized");
        }
    }

    public final void A02(int i) {
        SparseIntArray sparseIntArray = this.A05;
        if (sparseIntArray.size() == 0 && !this.A04) {
            C12050k9 c12050k9 = (C12050k9) this;
            Y0z y0z = c12050k9.A00;
            if (y0z == null) {
                y0z = new Y0z(C0w9.A01);
                c12050k9.A00 = y0z;
                y0z.A01(c12050k9);
            }
            boolean z = false;
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z = true;
            }
            C18C.A0H(z, "this operation must run on UI thread");
            Y0z.A00(y0z);
            y0z.A00.A02();
            this.A04 = true;
        }
        sparseIntArray.put(i, i);
    }

    public final void A03(int i) {
        SparseIntArray sparseIntArray = this.A05;
        sparseIntArray.delete(i);
        if (sparseIntArray.size() == 0) {
            if (this.A04) {
                C12050k9 c12050k9 = (C12050k9) this;
                Y0z y0z = c12050k9.A00;
                if (y0z == null) {
                    y0z = new Y0z(C0w9.A01);
                    c12050k9.A00 = y0z;
                    y0z.A01(c12050k9);
                }
                boolean z = false;
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    z = true;
                }
                C18C.A0H(z, "this operation must run on UI thread");
                Y0z.A00(y0z);
                y0z.A00.A01();
                this.A04 = false;
            }
            C24981Jz c24981Jz = this.A02;
            c24981Jz.getClass();
            c24981Jz.A00();
        }
    }

    public final C72799XnM A01() {
        A00(this);
        C24981Jz c24981Jz = this.A02;
        c24981Jz.getClass();
        C1K0 c1k0 = c24981Jz.A02;
        C1K0 c1k02 = new C1K0(c1k0.A02, c1k0.A00, c1k0.A01);
        C1K0 c1k03 = c24981Jz.A01;
        C1K0 c1k04 = new C1K0(c1k03.A02, c1k03.A00, c1k03.A01);
        C1K0 c1k05 = c24981Jz.A00;
        return new C72799XnM(c1k02, c1k04, new C1K0(c1k05.A02, c1k05.A00, c1k05.A01), ImmutableList.copyOf((Collection) c24981Jz.A03.A01), ImmutableList.copyOf((Collection) c24981Jz.A03.A00), c24981Jz.A04.now());
    }
}
