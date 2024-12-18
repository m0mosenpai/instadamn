package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.Puh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58403Puh {
    public Unsafe A00;

    public static Object A00(Object obj, long j) {
        return C58400Pue.A01.A00.getObject(obj, j);
    }

    public byte A01(Object obj, long j) {
        boolean z = this instanceof C58404Pui;
        boolean z2 = C58400Pue.A08;
        int i = C58400Pue.A01.A00.getInt(obj, (-4) & j);
        if (z) {
            if (z2) {
                return AbstractC58323PtF.A00(i, j ^ (-1));
            }
            return AbstractC58323PtF.A00(i, j);
        }
        if (z2) {
            return AbstractC58323PtF.A00(i, j ^ (-1));
        }
        return AbstractC58323PtF.A00(i, j);
    }

    public double A02(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A03(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final int A04(Class cls) {
        return this.A00.arrayBaseOffset(cls);
    }

    public final int A05(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A06(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public final Object A07(Object obj, long j) {
        return this.A00.getObject(obj, j);
    }

    public final void A08(Class cls) {
        this.A00.arrayIndexScale(cls);
    }

    public void A09(Object obj, long j, byte b) {
        boolean z = C58400Pue.A08;
        long j2 = (-4) & j;
        int A05 = C58400Pue.A01.A05(obj, j2);
        int i = (int) j;
        if (z) {
            C58400Pue.A05(obj, j2, AbstractC58321PtD.A07(i ^ (-1), A05, b));
        } else {
            C58400Pue.A05(obj, j2, AbstractC58321PtD.A07(i, A05, b));
        }
    }

    public final void A0C(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0D(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public final void A0E(Object obj, long j, Object obj2) {
        this.A00.putObject(obj, j, obj2);
    }

    public void A0F(Object obj, long j, boolean z) {
        boolean z2 = C58400Pue.A08;
        byte b = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        int A05 = C58400Pue.A01.A05(obj, j2);
        int i = (int) j;
        if (z2) {
            C58400Pue.A05(obj, j2, AbstractC58321PtD.A07(i ^ (-1), A05, b));
        } else {
            C58400Pue.A05(obj, j2, AbstractC58321PtD.A07(i, A05, b));
        }
    }

    public final void A0G(Field field) {
        this.A00.objectFieldOffset(field);
    }

    public boolean A0H(Object obj, long j) {
        byte A00;
        byte A002;
        boolean z = this instanceof C58404Pui;
        boolean z2 = C58400Pue.A08;
        int i = C58400Pue.A01.A00.getInt(obj, (-4) & j);
        if (z) {
            if (z2) {
                A002 = AbstractC58323PtF.A00(i, j ^ (-1));
            } else {
                A002 = AbstractC58323PtF.A00(i, j);
            }
            return AbstractC167007dF.A1M(A002);
        }
        if (z2) {
            A00 = AbstractC58323PtF.A00(i, j ^ (-1));
        } else {
            A00 = AbstractC58323PtF.A00(i, j);
        }
        return AbstractC167007dF.A1M(A00);
    }

    public AbstractC58403Puh(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A0A(Object obj, long j, double d) {
        A0D(obj, j, Double.doubleToLongBits(d));
    }

    public void A0B(Object obj, long j, float f) {
        A0C(obj, j, Float.floatToIntBits(f));
    }
}
