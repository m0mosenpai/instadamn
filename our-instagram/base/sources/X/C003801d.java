package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.StringTreeSet;
import java.nio.MappedByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.01d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C003801d {
    public static AtomicReference A03 = new AtomicReference();
    public String A00;
    public final C07920bC A01;
    public final Object A02;

    private void A00(int i, int i2, long j, long j2) {
        boolean z = false;
        if (i2 != -103) {
            z = true;
            if (i2 < 0) {
                throw new IllegalArgumentException(String.format("Offset %d cannot be negative", Integer.valueOf(i2)));
            }
        }
        if (j >= 0) {
            synchronized (this.A02) {
                MappedByteBuffer mappedByteBuffer = this.A01.A00;
                mappedByteBuffer.put(i, (byte) 1);
                if (z) {
                    mappedByteBuffer.put(i2, (byte) 1);
                }
                mappedByteBuffer.putLong(i + 1, j);
                if (z) {
                    mappedByteBuffer.putLong(i2 + 1, j);
                }
                mappedByteBuffer.putLong(i + 9, j2);
                if (z) {
                    mappedByteBuffer.putLong(i2 + 9, j2);
                }
                mappedByteBuffer.put(i, (byte) 0);
                if (z) {
                    mappedByteBuffer.put(i2, (byte) 0);
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void A08(long j, long j2, boolean z) {
        A01(j);
        A01(j2);
        int i = -103;
        if (z) {
            i = 258;
        }
        A00(241, i, j, j2);
        synchronized (this.A02) {
            A02(this);
        }
    }

    public final void A09(long j, long j2, boolean z) {
        A01(j);
        A01(j2);
        int i = -103;
        if (z) {
            i = 224;
        }
        A00(207, i, j, j2);
        synchronized (this.A02) {
            A02(this);
        }
    }

    public C003801d(C07920bC c07920bC) {
        Object obj = new Object();
        this.A02 = obj;
        this.A01 = c07920bC;
        if (C0DN.A00(null, this, A03)) {
            A03(this, C05F.A02, null, null, "", ' ', '0', false, true, false, false, false);
            A0B(C0MI.A0c);
            A05(' ');
            synchronized (this.A02) {
                this.A01.A00.put(205, (byte) 32);
                A02(this);
            }
            synchronized (this.A02) {
                this.A01.A00.put(206, (byte) 48);
                A02(this);
            }
            A0A(0L, "", false);
            A06(-1);
            A0C("unknown");
            A09(0L, 0L, true);
            A08(0L, 0L, true);
            synchronized (obj) {
                c07920bC.A00.put(2242, (byte) 0);
            }
            synchronized (this.A02) {
                this.A01.A00.putLong(1769, 0L);
                A02(this);
            }
        }
    }

    public static void A01(long j) {
        if (j >= 0) {
        } else {
            throw new IllegalArgumentException(String.format("Timestamp %d is invalid since it is negative", Long.valueOf(j)));
        }
    }

    public static void A04(C003801d c003801d, String str, int i, int i2, boolean z) {
        if (str == null) {
            str = "";
        }
        synchronized (c003801d.A02) {
            c003801d.A01.A00.put(i, z ? (byte) 1 : (byte) 0);
            c003801d.A0D(str, i2, 128);
            A02(c003801d);
        }
    }

    public final void A05(char c) {
        synchronized (this.A02) {
            this.A01.A00.put(166, (byte) c);
            A02(this);
        }
    }

    public final void A06(int i) {
        synchronized (this.A02) {
            MappedByteBuffer mappedByteBuffer = this.A01.A00;
            mappedByteBuffer.putInt(749, i);
            mappedByteBuffer.putLong(1753, System.currentTimeMillis());
            mappedByteBuffer.putLong(1761, SystemClock.uptimeMillis());
            A02(this);
        }
    }

    public final void A07(long j) {
        synchronized (this.A02) {
            A0D(Long.toString(j), 180, 15);
        }
    }

    public final void A0A(long j, String str, boolean z) {
        int i = z ? 49 : 48;
        synchronized (this.A02) {
            MappedByteBuffer mappedByteBuffer = this.A01.A00;
            mappedByteBuffer.put(275, (byte) i);
            mappedByteBuffer.putLong(276, j);
            A0D(str, 284, 80);
            A02(this);
        }
    }

    public final void A0B(C0MI c0mi) {
        char c = c0mi.A01;
        synchronized (this.A02) {
            this.A01.A00.put(0, (byte) c);
            A02(this);
        }
    }

    public static void A02(C003801d c003801d) {
        c003801d.A07(System.currentTimeMillis());
    }

    public static void A03(C003801d c003801d, Integer num, Integer num2, Integer num3, String str, char c, char c2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        char A00 = C0AL.A00(num);
        if (c >= 0 && c <= 127) {
            synchronized (c003801d.A02) {
                MappedByteBuffer mappedByteBuffer = c003801d.A01.A00;
                mappedByteBuffer.put(1, (byte) A00);
                mappedByteBuffer.put(196, (byte) c2);
                mappedByteBuffer.put(2, (byte) c);
                int i = 49;
                int i2 = 48;
                if (z) {
                    i2 = 49;
                }
                mappedByteBuffer.put(198, (byte) i2);
                if (z2 || num.compareTo(C05F.A0Y) < 0) {
                    mappedByteBuffer.put(202, (byte) 48);
                    mappedByteBuffer.put(200, (byte) 48);
                }
                byte b = -1;
                int i3 = StringTreeSet.MAX_SYMBOL_COUNT;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    if (intValue > 127) {
                        intValue = StringTreeSet.MAX_SYMBOL_COUNT;
                    }
                    mappedByteBuffer.put(203, (byte) intValue);
                } else {
                    mappedByteBuffer.put(203, (byte) -1);
                }
                if (num3 != null) {
                    int intValue2 = num3.intValue();
                    if (intValue2 <= 127) {
                        i3 = intValue2;
                    }
                    b = (byte) i3;
                }
                mappedByteBuffer.put(204, b);
                if (z3) {
                    int i4 = 48;
                    if (z4) {
                        i4 = 49;
                    }
                    mappedByteBuffer.put(1985, (byte) i4);
                    if (!z5) {
                        i = 48;
                    }
                    mappedByteBuffer.put(1986, (byte) i);
                }
                if (str != null) {
                    c003801d.A0D(str, 1987, 255);
                }
                A02(c003801d);
            }
            return;
        }
        throw new IllegalStateException("State byte should be ASCII");
    }

    public final void A0C(String str) {
        int i = 0;
        if (str.length() > 1000) {
            str = str.substring(0, 1000);
        }
        synchronized (this.A02) {
            MappedByteBuffer mappedByteBuffer = this.A01.A00;
            mappedByteBuffer.putShort(753, (short) 0);
            byte[] bytes = str.getBytes();
            while (true) {
                int length = bytes.length;
                if (i < length) {
                    mappedByteBuffer.put(i + 755, bytes[i]);
                    i++;
                } else {
                    mappedByteBuffer.putShort(753, (short) length);
                    A02(this);
                }
            }
        }
    }

    public final void A0D(String str, int i, int i2) {
        int i3 = 0;
        if (str.length() > i2) {
            str = str.substring(0, i2);
        }
        synchronized (this.A02) {
            MappedByteBuffer mappedByteBuffer = this.A01.A00;
            mappedByteBuffer.put(i, (byte) 0);
            byte[] bytes = str.getBytes();
            while (true) {
                int length = bytes.length;
                if (i3 < length) {
                    mappedByteBuffer.put(i + 1 + i3, bytes[i3]);
                    i3++;
                } else {
                    mappedByteBuffer.put(i, (byte) length);
                }
            }
        }
    }
}
