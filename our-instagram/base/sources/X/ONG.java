package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class ONG {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public static final MVN A00(C51614Mr7 c51614Mr7, int i, int i2, boolean z) {
        float f;
        C26076Bg5 c26076Bg5;
        float f2;
        UQ7 uq7 = c51614Mr7.A02;
        int intValue = c51614Mr7.A03.intValue();
        Float A0l = AbstractC25227BEk.A0l();
        switch (intValue) {
            case 0:
                return null;
            case 1:
                c26076Bg5 = null;
                f2 = -(uq7.A03 + uq7.A00);
                return new MVN(c26076Bg5, c26076Bg5, Float.valueOf(f2), c26076Bg5, c26076Bg5, c26076Bg5, 29, !z, z);
            case 2:
                f = -(uq7.A02 + uq7.A01);
                return new MVN(null, Float.valueOf(f), null, null, null, null, 30, !z, z);
            case 3:
                c26076Bg5 = null;
                int i3 = uq7.A00;
                f2 = (i3 - uq7.A03) + ((i2 - i3) * 2.0f);
                return new MVN(c26076Bg5, c26076Bg5, Float.valueOf(f2), c26076Bg5, c26076Bg5, c26076Bg5, 29, !z, z);
            case 4:
                int i4 = uq7.A02;
                f = (i4 - uq7.A01) + ((i - i4) * 2.0f);
                return new MVN(null, Float.valueOf(f), null, null, null, null, 30, !z, z);
            case 5:
                return new MVN(null, null, null, A0l, A0l, null, 19, !z, z);
            case 6:
                return new MVN(null, null, null, null, null, A0l, 15, !z, z);
            default:
                throw B4Z.A00();
        }
    }

    public static final C51614Mr7 A01(List list, long j) {
        Object obj;
        AbstractC09800fd.A01("findOutputItem", -589794435);
        try {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C51614Mr7) obj).A01 == j) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C51614Mr7 c51614Mr7 = (C51614Mr7) obj;
            AbstractC09800fd.A00(2032410821);
            return c51614Mr7;
        } catch (Throwable th) {
            AbstractC09800fd.A00(654576426);
            throw th;
        }
    }
}
