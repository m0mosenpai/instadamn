package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.4DC, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4DC implements C4D8, Encoder {
    public final void A00(SerialDescriptor serialDescriptor, int i) {
        C4DA c4da;
        C4DB c4db = (C4DB) this;
        int ordinal = c4db.A06.ordinal();
        if (ordinal != 1) {
            boolean z = false;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    C4DA c4da2 = c4db.A05;
                    if (!c4da2.A00) {
                        c4da2.A01(',');
                    }
                    c4da2.A00();
                    C14360o3.A0B(c4db.A03, 1);
                    C14360o3.A0K(serialDescriptor.BKw(), C3TE.A00);
                    c4db.ASK(serialDescriptor.B0v(i));
                    c4da2.A01(':');
                    if (c4da2 instanceof C4DD) {
                        c4da2.A01(' ');
                        return;
                    }
                    return;
                }
                if (i == 0) {
                    c4db.A02 = true;
                    return;
                }
                if (i != 1) {
                    return;
                }
                C4DA c4da3 = c4db.A05;
                c4da3.A01(',');
                if (c4da3 instanceof C4DD) {
                    c4da3.A01(' ');
                }
                c4db.A02 = false;
                return;
            }
            c4da = c4db.A05;
            if (!c4da.A00) {
                if (i % 2 == 0) {
                    c4da.A01(',');
                    c4da.A00();
                    z = true;
                } else {
                    c4da.A01(':');
                    if (c4da instanceof C4DD) {
                        c4da.A01(' ');
                    }
                }
                c4db.A02 = z;
                return;
            }
            c4db.A02 = true;
        } else {
            c4da = c4db.A05;
            if (!c4da.A00) {
                c4da.A01(',');
            }
        }
        c4da.A00();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void AS1(boolean z) {
        C4DB c4db = (C4DB) this;
        if (c4db.A02) {
            c4db.ASK(String.valueOf(z));
        } else {
            c4db.A05.A01.FEJ(String.valueOf(z));
        }
    }

    @Override // X.C4D8
    public final void AS2(SerialDescriptor serialDescriptor, int i, boolean z) {
        C14360o3.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        AS1(z);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void AS3(byte b) {
        C4DB c4db = (C4DB) this;
        if (c4db.A02) {
            c4db.ASK(String.valueOf((int) b));
            return;
        }
        C4DA c4da = c4db.A05;
        if (c4da instanceof C4DG) {
            C4DG c4dg = (C4DG) c4da;
            boolean z = c4dg.A00;
            String valueOf = String.valueOf(b & 255);
            if (z) {
                c4dg.A02(valueOf);
                return;
            } else {
                c4dg.A03(valueOf);
                return;
            }
        }
        ((C4D4) c4da.A01).FEJ(String.valueOf(b));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void AS5(double d) {
        C4DB c4db = (C4DB) this;
        if (c4db.A02) {
            c4db.ASK(String.valueOf(d));
        } else {
            c4db.A05.A01.FEJ(String.valueOf(d));
        }
        if (!c4db.A04.A04) {
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            } else {
                throw WG2.A03(Double.valueOf(d), c4db.A05.A01.toString());
            }
        }
    }

    @Override // X.C4D8
    public final void AS6(SerialDescriptor serialDescriptor, double d, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        AS5(d);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void AS7(float f) {
        C4DB c4db = (C4DB) this;
        if (c4db.A02) {
            c4db.ASK(String.valueOf(f));
        } else {
            c4db.A05.A01.FEJ(String.valueOf(f));
        }
        if (!c4db.A04.A04) {
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            } else {
                throw WG2.A03(Float.valueOf(f), c4db.A05.A01.toString());
            }
        }
    }

    @Override // X.C4D8
    public final void AS8(SerialDescriptor serialDescriptor, float f, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        AS7(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r1 == false) goto L6;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.serialization.encoding.Encoder AS9(kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r5 = this;
            r3 = r5
            X.4DB r3 = (X.C4DB) r3
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            java.util.Set r0 = X.AbstractC22806A3z.A00
            boolean r2 = r6.isInline()
            if (r2 == 0) goto L16
            boolean r1 = r0.contains(r6)
            r0 = 1
            if (r1 != 0) goto L17
        L16:
            r0 = 0
        L17:
            r4 = 0
            if (r0 == 0) goto L33
            X.4DA r2 = r3.A05
            boolean r0 = r2 instanceof X.C4DG
            if (r0 != 0) goto L29
            X.4D5 r1 = r2.A01
            boolean r0 = r3.A02
            X.4DG r2 = new X.4DG
            r2.<init>(r1, r0)
        L29:
            X.3Sg r1 = r3.A03
            X.3T5 r0 = r3.A06
            X.4DB r3 = new X.4DB
            r3.<init>(r1, r2, r0, r4)
        L32:
            return r3
        L33:
            if (r2 == 0) goto L4d
            kotlinx.serialization.descriptors.SerialDescriptor r0 = X.AbstractC100754fe.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4d
            X.4DA r2 = r3.A05
            boolean r0 = r2 instanceof X.C73568YLb
            if (r0 != 0) goto L29
            X.4D5 r1 = r2.A01
            boolean r0 = r3.A02
            X.YLb r2 = new X.YLb
            r2.<init>(r1, r0)
            goto L29
        L4d:
            java.lang.String r0 = r3.A00
            if (r0 == 0) goto L32
            java.lang.String r0 = r6.BtR()
            r3.A01 = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4DC.AS9(kotlinx.serialization.descriptors.SerialDescriptor):kotlinx.serialization.encoding.Encoder");
    }

    @Override // X.C4D8
    public final Encoder ASA(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        return AS9(serialDescriptor.B0r(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void ASB(int i) {
        C4DB c4db = (C4DB) this;
        if (c4db.A02) {
            c4db.ASK(String.valueOf(i));
            return;
        }
        C4DA c4da = c4db.A05;
        if (c4da instanceof C4DG) {
            C4DG c4dg = (C4DG) c4da;
            boolean z = c4dg.A00;
            String l = Long.toString(i & 4294967295L, 10);
            if (z) {
                c4dg.A02(l);
                return;
            } else {
                c4dg.A03(l);
                return;
            }
        }
        ((C4D4) c4da.A01).FEJ(String.valueOf(i));
    }

    @Override // X.C4D8
    public final void ASC(SerialDescriptor serialDescriptor, int i, int i2) {
        C14360o3.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        ASB(i2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void ASD(long j) {
        String str;
        String str2;
        C4DB c4db = (C4DB) this;
        if (c4db.A02) {
            c4db.ASK(String.valueOf(j));
            return;
        }
        C4DA c4da = c4db.A05;
        if (c4da instanceof C4DG) {
            C4DG c4dg = (C4DG) c4da;
            if (c4dg.A00) {
                if (j == 0) {
                    str2 = "0";
                } else if (j > 0) {
                    str2 = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    int i = 63;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str2 = new String(cArr, i, 64 - i);
                }
                c4dg.A02(str2);
                return;
            }
            if (j == 0) {
                str = "0";
            } else if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                int i2 = 63;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i2--;
                    cArr2[i2] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i2, 64 - i2);
            }
            c4dg.A03(str);
            return;
        }
        ((C4D4) c4da.A01).FEJ(String.valueOf(j));
    }

    @Override // X.C4D8
    public final void ASE(SerialDescriptor serialDescriptor, int i, long j) {
        C14360o3.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        ASD(j);
    }

    @Override // X.C4D8
    public void ASG(Object obj, C3RA c3ra, SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        C14360o3.A0B(c3ra, 2);
        A00(serialDescriptor, i);
        if (!c3ra.getDescriptor().CZW() && obj == null) {
            ASF();
        } else {
            ASI(obj, c3ra);
        }
    }

    @Override // X.C4D8
    public final void ASH(Object obj, C3RA c3ra, SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        C14360o3.A0B(c3ra, 2);
        A00(serialDescriptor, i);
        ASI(obj, c3ra);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0080, code lost:
    
        if (X.C14360o3.A0K(r1, X.C192668g8.A00) == false) goto L45;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ASI(java.lang.Object r9, X.C3RA r10) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4DC.ASI(java.lang.Object, X.3RA):void");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void ASJ(short s) {
        C4DB c4db = (C4DB) this;
        if (c4db.A02) {
            c4db.ASK(String.valueOf((int) s));
            return;
        }
        C4DA c4da = c4db.A05;
        if (c4da instanceof C4DG) {
            C4DG c4dg = (C4DG) c4da;
            boolean z = c4dg.A00;
            String valueOf = String.valueOf(s & 65535);
            if (z) {
                c4dg.A02(valueOf);
                return;
            } else {
                c4dg.A03(valueOf);
                return;
            }
        }
        ((C4D4) c4da.A01).FEJ(String.valueOf(s));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void ASK(String str) {
        C14360o3.A0B(str, 0);
        ((C4DB) this).A05.A02(str);
    }

    @Override // X.C4D8
    public final void ASL(String str, SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        C14360o3.A0B(str, 2);
        A00(serialDescriptor, i);
        ASK(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void AS4(char c) {
        ASK(String.valueOf(c));
    }
}
