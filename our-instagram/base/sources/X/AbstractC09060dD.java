package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.0dD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09060dD {
    public static long A00(InterfaceC09010d5 interfaceC09010d5, ByteBuffer byteBuffer, long j) {
        A01(interfaceC09010d5, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    public static void A01(InterfaceC09010d5 interfaceC09010d5, ByteBuffer byteBuffer, int i, long j) {
        int E7n;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (E7n = interfaceC09010d5.E7n(byteBuffer, j)) != -1) {
            j += E7n;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new UnsatisfiedLinkError("ELF file truncated");
    }

    public static String[] A02(InterfaceC09010d5 interfaceC09010d5) {
        long j;
        short s;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long A00 = A00(interfaceC09010d5, allocate, 0L);
        if (A00 == 1179403647) {
            A01(interfaceC09010d5, allocate, 1, 4L);
            boolean z = true;
            if (((short) (allocate.get() & 255)) != 1) {
                z = false;
            }
            A01(interfaceC09010d5, allocate, 1, 5L);
            if (((short) (allocate.get() & 255)) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                j = A00(interfaceC09010d5, allocate, 28L);
                A01(interfaceC09010d5, allocate, 2, 44L);
                s = 65535;
                j2 = allocate.getShort() & 65535;
                j3 = 42;
            } else {
                A01(interfaceC09010d5, allocate, 8, 32L);
                j = allocate.getLong();
                A01(interfaceC09010d5, allocate, 2, 56L);
                s = 65535;
                j2 = allocate.getShort() & 65535;
                j3 = 54;
            }
            A01(interfaceC09010d5, allocate, 2, j3);
            int i = allocate.getShort() & s;
            if (j2 == 65535) {
                if (z) {
                    j14 = A00(interfaceC09010d5, allocate, 32L) + 28;
                } else {
                    A01(interfaceC09010d5, allocate, 8, 40L);
                    j14 = allocate.getLong() + 44;
                }
                j2 = A00(interfaceC09010d5, allocate, j14);
            }
            long j15 = j;
            long j16 = 0;
            while (true) {
                if (j16 >= j2) {
                    break;
                }
                if (A00(interfaceC09010d5, allocate, j15) == 2) {
                    if (z) {
                        j4 = A00(interfaceC09010d5, allocate, j15 + 4);
                    } else {
                        A01(interfaceC09010d5, allocate, 8, j15 + 8);
                        j4 = allocate.getLong();
                    }
                    if (j4 != 0) {
                        long j17 = j4;
                        long j18 = 0;
                        int i2 = 0;
                        do {
                            if (z) {
                                j5 = A00(interfaceC09010d5, allocate, j17);
                            } else {
                                A01(interfaceC09010d5, allocate, 8, j17);
                                j5 = allocate.getLong();
                            }
                            if (j5 == 1) {
                                if (i2 != Integer.MAX_VALUE) {
                                    i2++;
                                } else {
                                    throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                                }
                            } else if (j5 == 5) {
                                if (z) {
                                    j18 = A00(interfaceC09010d5, allocate, j17 + 4);
                                } else {
                                    A01(interfaceC09010d5, allocate, 8, j17 + 8);
                                    j18 = allocate.getLong();
                                }
                            }
                            j6 = 16;
                            if (z) {
                                j7 = 8;
                            } else {
                                j7 = 16;
                            }
                            j17 += j7;
                        } while (j5 != 0);
                        if (j18 != 0) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= j2) {
                                    break;
                                }
                                if (A00(interfaceC09010d5, allocate, j) == 1) {
                                    if (z) {
                                        j8 = A00(interfaceC09010d5, allocate, j + 8);
                                        j9 = A00(interfaceC09010d5, allocate, j + 20);
                                    } else {
                                        A01(interfaceC09010d5, allocate, 8, j + j6);
                                        j8 = allocate.getLong();
                                        A01(interfaceC09010d5, allocate, 8, j + 40);
                                        j9 = allocate.getLong();
                                    }
                                    if (j8 <= j18 && j18 < j9 + j8) {
                                        if (z) {
                                            j10 = A00(interfaceC09010d5, allocate, j + 4);
                                        } else {
                                            A01(interfaceC09010d5, allocate, 8, j + 8);
                                            j10 = allocate.getLong();
                                        }
                                        long j19 = j10 + (j18 - j8);
                                        if (j19 != 0) {
                                            String[] strArr = new String[i2];
                                            int i4 = 0;
                                            do {
                                                if (z) {
                                                    j11 = A00(interfaceC09010d5, allocate, j4);
                                                } else {
                                                    A01(interfaceC09010d5, allocate, 8, j4);
                                                    j11 = allocate.getLong();
                                                }
                                                if (j11 == 1) {
                                                    if (z) {
                                                        j13 = A00(interfaceC09010d5, allocate, j4 + 4);
                                                    } else {
                                                        A01(interfaceC09010d5, allocate, 8, j4 + 8);
                                                        j13 = allocate.getLong();
                                                    }
                                                    long j20 = j13 + j19;
                                                    StringBuilder sb = new StringBuilder();
                                                    while (true) {
                                                        long j21 = 1 + j20;
                                                        A01(interfaceC09010d5, allocate, 1, j20);
                                                        short s2 = (short) (allocate.get() & 255);
                                                        if (s2 == 0) {
                                                            break;
                                                        }
                                                        sb.append((char) s2);
                                                        j20 = j21;
                                                    }
                                                    strArr[i4] = sb.toString();
                                                    if (i4 != Integer.MAX_VALUE) {
                                                        i4++;
                                                    } else {
                                                        throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                                                    }
                                                }
                                                if (z) {
                                                    j12 = 8;
                                                } else {
                                                    j12 = 16;
                                                }
                                                j4 += j12;
                                            } while (j11 != 0);
                                            if (i4 == i2) {
                                                return strArr;
                                            }
                                            throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                                        }
                                    }
                                }
                                j += i;
                                i3++;
                                j6 = 16;
                            }
                            throw new UnsatisfiedLinkError("did not find file offset of DT_STRTAB table");
                        }
                        throw new UnsatisfiedLinkError("Dynamic section string-table not found");
                    }
                } else {
                    j15 += i;
                    j16++;
                }
            }
            throw new UnsatisfiedLinkError("ELF file does not contain dynamic linking information");
        }
        throw new UnsatisfiedLinkError(AnonymousClass001.A0u("file is not ELF: magic is 0x", Long.toHexString(A00), ", it should be ", Long.toHexString(1179403647L)));
    }
}
