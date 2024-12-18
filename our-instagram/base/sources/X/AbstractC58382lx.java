package X;

/* renamed from: X.2lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58382lx {
    public int A00 = -1;
    public boolean A01;
    public final InterfaceC58362lv A02;
    public final /* synthetic */ C2GT A03;

    public void A00() {
    }

    public abstract boolean A02();

    public AbstractC58382lx(C2GT c2gt, InterfaceC58362lv interfaceC58362lv) {
        this.A03 = c2gt;
        this.A02 = interfaceC58362lv;
    }

    public final void A01(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            C2GT c2gt = this.A03;
            int i = -1;
            if (z) {
                i = 1;
            }
            int i2 = c2gt.A00;
            c2gt.A00 = i + i2;
            if (!c2gt.A03) {
                c2gt.A03 = true;
                while (true) {
                    try {
                        int i3 = c2gt.A00;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0) {
                            if (i3 > 0) {
                                c2gt.A03();
                            }
                        } else if (i2 > 0 && i3 == 0) {
                            c2gt.A04();
                        }
                        i2 = i3;
                    } finally {
                        c2gt.A03 = false;
                    }
                }
            }
            if (this.A01) {
                c2gt.A07(this);
            }
        }
    }

    public final boolean A03(C07X c07x) {
        if (!(this instanceof C58372lw) || ((C58372lw) this).A00 != c07x) {
            return false;
        }
        return true;
    }
}
