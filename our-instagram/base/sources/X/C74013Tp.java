package X;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: X.3Tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74013Tp {
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A00 = 0;
    public int A01 = 0;
    public int A05 = 0;

    public final boolean A00(C59722oF c59722oF) {
        int i;
        boolean z;
        int read;
        if (this.A05 == 6 || c59722oF == null || (i = c59722oF.A00) <= this.A02) {
            return false;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c59722oF.A02, 0, i);
        try {
            try {
                long j = this.A02;
                while (j > 0) {
                    long skip = byteArrayInputStream.skip(j);
                    if (skip <= 0) {
                        if (byteArrayInputStream.read() == -1) {
                            break;
                        }
                        skip = 1;
                    }
                    j -= skip;
                }
                int i2 = this.A01;
                while (true) {
                    z = true;
                    try {
                        if (this.A05 == 6 || (read = byteArrayInputStream.read()) == -1) {
                            break;
                        }
                        int i3 = this.A02 + 1;
                        this.A02 = i3;
                        int i4 = this.A05;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                int i5 = 3;
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        i5 = 5;
                                        if (i4 != 4) {
                                            if (i4 == 5) {
                                                int i6 = ((this.A03 << 8) + read) - 2;
                                                long j2 = i6;
                                                while (j2 > 0) {
                                                    long skip2 = byteArrayInputStream.skip(j2);
                                                    if (skip2 <= 0) {
                                                        if (byteArrayInputStream.read() == -1) {
                                                            break;
                                                        }
                                                        skip2 = 1;
                                                    }
                                                    j2 -= skip2;
                                                }
                                                this.A02 += i6;
                                            }
                                        }
                                        this.A05 = i5;
                                    } else {
                                        if (read != 255) {
                                            if (read != 0) {
                                                if (read != 218 && read != 217) {
                                                    if (read != 1) {
                                                        if (read >= 208) {
                                                            if (read <= 215) {
                                                            }
                                                        }
                                                        this.A05 = 4;
                                                    }
                                                } else {
                                                    int i7 = i3 - 2;
                                                    int i8 = this.A04;
                                                    if (i8 > 0) {
                                                        this.A00 = i7;
                                                    }
                                                    this.A04 = i8 + 1;
                                                    this.A01 = i8;
                                                }
                                                if (read != 217 && read != 216) {
                                                    this.A05 = 4;
                                                }
                                            }
                                        }
                                        this.A05 = i5;
                                    }
                                } else {
                                    if (read != 255) {
                                    }
                                    this.A05 = i5;
                                }
                            } else {
                                if (read == 216) {
                                }
                                this.A05 = 6;
                            }
                            this.A05 = 2;
                        } else {
                            if (read == 255) {
                                this.A05 = 1;
                            }
                            this.A05 = 6;
                        }
                        this.A03 = read;
                    } catch (IOException unused) {
                    }
                }
                try {
                    if (this.A05 != 6) {
                        if (this.A01 != i2) {
                            byteArrayInputStream.close();
                            return z;
                        }
                    }
                    byteArrayInputStream.close();
                    return z;
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
                z = false;
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        } catch (IOException unused2) {
            byteArrayInputStream.close();
            return false;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
