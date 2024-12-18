package X;

/* renamed from: X.SJx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62640SJx {
    public final boolean A00(byte[] bArr, int i, int i2) {
        byte b;
        int i3;
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i < i2) {
            while (i < i2) {
                int i4 = i + 1;
                byte b2 = bArr[i];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i4 >= i2 || b2 < -62) {
                            return false;
                        }
                        i = i4 + 1;
                        b = bArr[i4];
                    } else {
                        if (b2 < -16) {
                            if (i4 < i2 - 1) {
                                int i5 = i4 + 1;
                                byte b3 = bArr[i4];
                                if (b3 > -65) {
                                    return false;
                                }
                                if (b2 == -32) {
                                    if (b3 < -96) {
                                        return false;
                                    }
                                } else if (b2 == -19 && b3 >= -96) {
                                    return false;
                                }
                                i = i5 + 1;
                                b = bArr[i5];
                            }
                        } else if (i4 < i2 - 2) {
                            int i6 = i4 + 1;
                            byte b4 = bArr[i4];
                            if (b4 > -65 || AbstractC58322PtE.A04(b2, b4) != 0) {
                                return false;
                            }
                            int i7 = i6 + 1;
                            if (bArr[i6] > -65) {
                                return false;
                            }
                            i4 = i7 + 1;
                            if (bArr[i7] > -65) {
                                return false;
                            }
                        }
                        C62640SJx c62640SJx = S7D.A00;
                        int i8 = i2 - i4;
                        byte b5 = bArr[i4 - 1];
                        if (i8 == 0) {
                            return false;
                        }
                        if (i8 != 1) {
                            if (i8 == 2) {
                                byte b6 = bArr[i4];
                                byte b7 = bArr[i4 + 1];
                                if (b5 > -12 || b6 > -65 || b7 > -65) {
                                    return false;
                                }
                                i3 = (b7 << 16) ^ ((b6 << 8) ^ b5);
                            } else {
                                throw AbstractC58318PtA.A0V();
                            }
                        } else {
                            byte b8 = bArr[i4];
                            if (b5 > -12 || b8 > -65) {
                                return false;
                            }
                            i3 = (b8 << 8) ^ b5;
                        }
                        if (i3 != 0) {
                            return false;
                        }
                    }
                    if (b > -65) {
                        return false;
                    }
                }
                i = i4;
            }
        }
        return true;
    }
}
