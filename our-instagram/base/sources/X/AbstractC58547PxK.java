package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.PxK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58547PxK {
    public static int A01(C58548PxL msg, InterfaceC65595Tne schema, Object data, byte[] position, int limit, int endGroup, int registers) {
        int A0H = ((C58543PxB) schema).A0H(msg, data, position, limit, endGroup, registers);
        msg.A02 = data;
        return A0H;
    }

    public static int A02(C58548PxL schema, InterfaceC65595Tne data, byte[] position, int limit, int endGroup, int registers) {
        AbstractC58533Px1 CsQ = data.CsQ();
        int A01 = A01(schema, data, CsQ, position, limit, endGroup, registers);
        data.Cmk(CsQ);
        schema.A02 = CsQ;
        return A01;
    }

    public static int A03(C58548PxL tag, C58555PxV data, byte[] position, int limit, int unknownFields, int registers) {
        Object A01;
        int i = unknownFields;
        if ((limit >>> 3) != 0) {
            int i2 = limit & 7;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 5) {
                                data.A02(limit, Integer.valueOf(AbstractC58321PtD.A0F(position, unknownFields)));
                                return unknownFields + 4;
                            }
                        } else {
                            C58555PxV c58555PxV = new C58555PxV();
                            int i3 = (limit & (-8)) | 4;
                            int i4 = 0;
                            while (i < registers) {
                                i = A05(tag, position, i);
                                i4 = tag.A00;
                                if (i4 == i3) {
                                    break;
                                }
                                i = A03(tag, c58555PxV, position, i4, i, registers);
                            }
                            if (i <= registers && i4 == i3) {
                                data.A02(limit, c58555PxV);
                                return i;
                            }
                            throw C61032Re1.A01("Failed to parse the message.");
                        }
                    } else {
                        int A05 = A05(tag, position, unknownFields);
                        int i5 = tag.A00;
                        if (i5 >= 0) {
                            if (i5 <= position.length - A05) {
                                if (i5 == 0) {
                                    A01 = AbstractC58536Px4.A01;
                                } else {
                                    A01 = AbstractC58536Px4.A01(position, A05, i5);
                                }
                                data.A02(limit, A01);
                                return A05 + i5;
                            }
                            throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        throw C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                } else {
                    data.A02(limit, Long.valueOf(AbstractC58324PtG.A03(position, unknownFields)));
                    return unknownFields + 8;
                }
            } else {
                int A06 = A06(tag, position, unknownFields);
                data.A02(limit, Long.valueOf(tag.A01));
                return A06;
            }
        }
        throw C61032Re1.A01("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r5 >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.C58548PxL r6, X.InterfaceC65595Tne r7, java.lang.Object r8, byte[] r9, int r10, int r11) {
        /*
            int r4 = r10 + 1
            r3 = r9
            r5 = r9[r10]
            r1 = r6
            if (r5 >= 0) goto L10
            int r4 = A07(r6, r9, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L1c
        L10:
            int r11 = r11 - r4
            if (r5 > r11) goto L1c
            int r5 = r5 + r4
            r0 = r7
            r2 = r8
            r0.CpO(r1, r2, r3, r4, r5)
            r6.A02 = r8
            return r5
        L1c:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.Re1 r0 = X.C61032Re1.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC58547PxK.A00(X.PxL, X.Tne, java.lang.Object, byte[], int, int):int");
    }

    public static int A05(C58548PxL data, byte[] position, int registers) {
        int i = registers + 1;
        byte b = position[registers];
        if (b >= 0) {
            data.A00 = b;
            return i;
        }
        return A07(data, position, b, i);
    }

    public static int A06(C58548PxL data, byte[] position, int registers) {
        int i = registers + 1;
        long j = position[registers];
        if (j >= 0) {
            data.A01 = j;
            return i;
        }
        int i2 = i + 1;
        byte b = position[i];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i3 = 7;
        while (b < 0) {
            b = position[i2];
            i3 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i3;
            i2++;
        }
        data.A01 = j2;
        return i2;
    }

    public static int A07(C58548PxL firstByte, byte[] data, int position, int registers) {
        int i;
        int i2;
        int i3;
        int i4 = position & StringTreeSet.MAX_SYMBOL_COUNT;
        int i5 = registers + 1;
        int i6 = data[registers];
        if (i6 >= 0) {
            i = i6 << 7;
        } else {
            int i7 = i4 | ((i6 & StringTreeSet.MAX_SYMBOL_COUNT) << 7);
            int i8 = i5 + 1;
            int i9 = data[i5];
            if (i9 >= 0) {
                i2 = i9 << 14;
            } else {
                i4 = i7 | ((i9 & StringTreeSet.MAX_SYMBOL_COUNT) << 14);
                i5 = i8 + 1;
                int i10 = data[i8];
                i = i10 << 21;
                if (i10 < 0) {
                    i7 = i4 | ((i10 & StringTreeSet.MAX_SYMBOL_COUNT) << 21);
                    i8 = i5 + 1;
                    int i11 = data[i5];
                    i2 = i11 << 28;
                    if (i11 < 0) {
                        i3 = i7 | ((i11 & StringTreeSet.MAX_SYMBOL_COUNT) << 28);
                        while (true) {
                            i5 = i8 + 1;
                            if (data[i8] >= 0) {
                                break;
                            }
                            i8 = i5;
                        }
                        firstByte.A00 = i3;
                        return i5;
                    }
                }
            }
            firstByte.A00 = i7 | i2;
            return i8;
        }
        i3 = i4 | i;
        firstByte.A00 = i3;
        return i5;
    }

    public static int A04(C58548PxL data, byte[] position, int registers) {
        int A05 = A05(data, position, registers);
        int i = data.A00;
        if (i >= 0) {
            if (i <= position.length - A05) {
                if (i == 0) {
                    data.A02 = AbstractC58536Px4.A01;
                    return A05;
                }
                data.A02 = AbstractC58536Px4.A01(position, A05, i);
                return A05 + i;
            }
            throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
