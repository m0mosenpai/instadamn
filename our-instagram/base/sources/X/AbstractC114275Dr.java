package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.5Dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114275Dr {
    public static final C18630vq A00;

    public static final int A00(C58O c58o) {
        int i = c58o instanceof InterfaceC118865a3 ? 3 : 1;
        if (c58o instanceof InterfaceC118875a4) {
            i |= 4;
        }
        if (c58o instanceof InterfaceC118625Ya) {
            i |= 8;
        }
        if (c58o instanceof InterfaceC118745Yt) {
            i |= 16;
        }
        if ((c58o instanceof InterfaceC118885a5) || (c58o instanceof InterfaceC118895a6)) {
            i |= 32;
        }
        if (c58o instanceof InterfaceC118905a7) {
            i |= 256;
        }
        if (c58o instanceof InterfaceC118915a8) {
            return i | 64;
        }
        return i;
    }

    static {
        C18630vq c18630vq = AbstractC004101g.A00;
        A00 = new C18630vq(6);
    }

    public static final int A01(C58J c58j) {
        int i = c58j.A01;
        if (i != 0) {
            return i;
        }
        C18630vq c18630vq = A00;
        Class<?> cls = c58j.getClass();
        int A03 = c18630vq.A03(cls);
        if (A03 >= 0) {
            return c18630vq.A02[A03];
        }
        int i2 = 1;
        if (c58j instanceof C5DW) {
            i2 = 3;
        }
        if (c58j instanceof InterfaceC113445Ag) {
            i2 |= 4;
        }
        if (c58j instanceof C58L) {
            i2 |= 8;
        }
        if (c58j instanceof C5DX) {
            i2 |= 16;
        }
        if (c58j instanceof InterfaceC1129158a) {
            i2 |= 32;
        }
        if (c58j instanceof C5Dc) {
            i2 |= 64;
        }
        if (c58j instanceof C5DZ) {
            i2 |= 128;
        }
        if (c58j instanceof InterfaceC114155Db) {
            i2 |= 256;
        }
        if (c58j instanceof C58Z) {
            i2 |= 1024;
        }
        if (c58j instanceof InterfaceC114145Da) {
            i2 |= C3OO.FLAG_MOVED;
        }
        if (c58j instanceof C5DY) {
            i2 |= 4096;
        }
        if (c58j instanceof InterfaceC114285Ds) {
            i2 |= 8192;
        }
        if (c58j instanceof InterfaceC114295Dt) {
            i2 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        if (c58j instanceof InterfaceC1129458d) {
            i2 |= Constants.LOAD_RESULT_PGO;
        }
        if (c58j instanceof InterfaceC1130758u) {
            i2 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
        }
        c18630vq.A06(cls, i2);
        return i2;
    }

    public static final int A02(C58J c58j) {
        if (c58j instanceof C5AY) {
            C5AY c5ay = (C5AY) c58j;
            int i = c5ay.A01;
            for (C58J c58j2 = c5ay.A00; c58j2 != null; c58j2 = c58j2.A02) {
                i |= A02(c58j2);
            }
            return i;
        }
        return A01(c58j);
    }

    public static final void A03(C58J c58j) {
        if (!c58j.A08) {
            AbstractC28290Cdc.A01("autoInvalidateInsertedNode called on unattached node");
            throw C00O.createAndThrow();
        }
        A05(c58j, -1, 1);
    }

    public static final void A04(C58J c58j) {
        if (!c58j.A08) {
            AbstractC28290Cdc.A01("autoInvalidateUpdatedNode called on unattached node");
            throw C00O.createAndThrow();
        }
        A05(c58j, -1, 0);
    }

    public static final void A05(C58J c58j, int i, int i2) {
        if (c58j instanceof C5AY) {
            C5AY c5ay = (C5AY) c58j;
            int i3 = c5ay.A01;
            A06(c58j, i3 & i, i2);
            int i4 = (i3 ^ (-1)) & i;
            for (C58J c58j2 = c5ay.A00; c58j2 != null; c58j2 = c58j2.A02) {
                A05(c58j2, i4, i2);
            }
            return;
        }
        A06(c58j, i & c58j.A01, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0120, code lost:
    
        X.AbstractC114335Dx.A06(r6, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C58J r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC114275Dr.A06(X.58J, int, int):void");
    }
}
