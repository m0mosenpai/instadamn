package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public abstract class U7H {
    public static final U7K A04 = new Handler(Looper.getMainLooper());
    public static volatile InterfaceC14020nS A05 = C14120nc.A00();
    public final U7L A00;
    public final C14160ng A01;
    public volatile Integer A03 = C05F.A00;
    public final AtomicBoolean A02 = new AtomicBoolean();

    public void A05(Object obj) {
    }

    public final void A02(Object... objArr) {
        InterfaceC14020nS interfaceC14020nS = A05;
        if (this.A03 != C05F.A00) {
            int intValue = this.A03.intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    throw new IllegalStateException(AbstractC111324zv.A00(1525));
                }
            } else {
                throw new IllegalStateException(AbstractC111324zv.A00(1526));
            }
        }
        this.A03 = C05F.A01;
        A04();
        this.A00.A00 = objArr;
        interfaceC14020nS.ATN(this.A01);
    }

    public void A04() {
        C3DN c3dn;
        if (this instanceof V44) {
            U79 u79 = ((V44) this).A00;
            if (!u79.A02 && (c3dn = u79.A07) != null && !((C3DP) c3dn).A0h) {
                u79.A02 = true;
                U79.A03(u79);
            }
        }
    }

    public U7H() {
        U7L u7l = new U7L(this);
        this.A00 = u7l;
        this.A01 = new U7I(this, u7l);
    }

    public Object A03(Object... objArr) {
        return null;
    }
}
