package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.4Pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95024Pl extends AbstractC95034Pm {
    public static final byte[] A09;
    public C4Pp A00;
    public C95054Po A01;
    public Boolean A02;
    public short A03;
    public final byte[] A04;
    public final long A05;
    public final long A06;
    public static final C95044Pn A08 = new Object();
    public static final C95054Po A07 = new C95054Po("", (byte) 0, 0);

    public static void A05(C95024Pl c95024Pl, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i & (-128);
            byte[] bArr = c95024Pl.A04;
            int i4 = i2 + 1;
            if (i3 == 0) {
                bArr[i2] = (byte) i;
                ((AbstractC95034Pm) c95024Pl).A00.A01(bArr, i4);
                return;
            } else {
                bArr[i2] = (byte) ((i & StringTreeSet.MAX_SYMBOL_COUNT) | 128);
                i >>>= 7;
                i2 = i4;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Pn, java.lang.Object] */
    static {
        A09 = r5;
        byte[] bArr = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9, 0, 0, 0, DalvikInternals.IOPRIO_CLASS_SHIFT};
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.4Pp, java.lang.Object] */
    public C95024Pl(C4PN c4pn) {
        super.A00 = c4pn;
        ?? obj = new Object();
        obj.A00 = -1;
        obj.A01 = new short[15];
        this.A00 = obj;
        this.A03 = (short) 0;
        this.A01 = null;
        this.A02 = null;
        this.A04 = new byte[10];
        this.A06 = -1L;
        this.A05 = -1L;
    }

    public static byte A00(byte b) {
        byte b2 = (byte) (b & 15);
        switch (b2) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return (byte) 15;
            case 10:
                return (byte) 14;
            case 11:
                return DalvikInternals.IOPRIO_CLASS_SHIFT;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return (byte) 12;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return (byte) 19;
            default:
                throw new RuntimeException(AnonymousClass001.A0O("don't know what type: ", b2));
        }
    }

    public static int A01(C95024Pl c95024Pl) {
        C4PO c4po = C4PN.A02;
        int i = 0;
        int i2 = 0;
        while (true) {
            byte A06 = c95024Pl.A06();
            i |= (A06 & Byte.MAX_VALUE) << i2;
            if ((A06 & 128) != 128) {
                return i;
            }
            i2 += 7;
        }
    }

    public static void A02(C95024Pl c95024Pl, byte b) {
        byte[] bArr = c95024Pl.A04;
        bArr[0] = b;
        ((AbstractC95034Pm) c95024Pl).A00.A01(bArr, 1);
    }

    public static void A03(C95024Pl c95024Pl, int i) {
        if (i >= 0) {
            long j = c95024Pl.A05;
            if (j > 0 && i > j) {
                throw new RuntimeException(String.format(AbstractC111324zv.A00(1558), Integer.valueOf(i), Long.valueOf(j)));
            }
            return;
        }
        throw new RuntimeException(AnonymousClass001.A0O(AbstractC111324zv.A00(320), i));
    }

    public static void A04(C95024Pl c95024Pl, int i) {
        if (i >= 0) {
            long j = c95024Pl.A06;
            if (j > 0 && i > j) {
                throw new RuntimeException(String.format(AbstractC111324zv.A00(1803), Integer.valueOf(i), Long.valueOf(j)));
            }
            return;
        }
        throw new RuntimeException(AnonymousClass001.A0O(AbstractC111324zv.A00(320), i));
    }

    public final void A0b(byte b) {
        int i = b & 15;
        if (i == 2 || i == 3 || i == 4 || i == 6 || i == 8 || i == 19) {
            return;
        }
        switch (i) {
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
                return;
            default:
                throw new RuntimeException(AnonymousClass001.A0O(AbstractC111324zv.A00(1833), (byte) i));
        }
    }
}
