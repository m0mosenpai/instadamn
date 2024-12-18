package X;

/* renamed from: X.6Fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136316Fk {
    public int A00;
    public final int A01;
    public final C136286Fh A02;

    public static Object A00(C136316Fk c136316Fk, int i) {
        int i2 = c136316Fk.A00;
        boolean z = true;
        boolean z2 = false;
        if (i2 != -1) {
            z2 = true;
        }
        if (z2) {
            if (i >= i2) {
                z = false;
            }
            C6Ff.A00(z, "invalid instr stack argument");
            C136286Fh c136286Fh = c136316Fk.A02;
            return c136286Fh.A05[c136316Fk.A01 + i];
        }
        throw new IllegalStateException("InstrStackArgs is not initialized");
    }

    public static void A01(C136316Fk c136316Fk, Object obj) {
        int i = c136316Fk.A00;
        boolean z = false;
        if (i != -1) {
            z = true;
        }
        if (z) {
            C136286Fh c136286Fh = c136316Fk.A02;
            c136286Fh.A0L(i);
            C136286Fh.A0E(c136286Fh, obj);
            c136316Fk.A00 = -1;
            return;
        }
        throw new IllegalStateException("InstrStackArgs is not initialized");
    }

    public static boolean A02(double d) {
        double floor;
        if (d < 0.0d) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        if (floor != d) {
            return false;
        }
        return true;
    }

    public C136316Fk(C136286Fh c136286Fh, int i) {
        int i2;
        this.A02 = c136286Fh;
        this.A00 = i;
        if (i > 0) {
            i2 = (c136286Fh.A01 - 1) - (i - 1);
        } else {
            i2 = -1;
        }
        this.A01 = i2;
    }
}
