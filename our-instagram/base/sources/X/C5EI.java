package X;

/* renamed from: X.5EI, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5EI extends C03E implements InterfaceC16820sZ {
    public C5EI(Object obj) {
        super(0, obj, C1129658f.class, "invalidateNodes", "invalidateNodes()V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        EnumC118935aA enumC118935aA;
        C1129658f c1129658f = (C1129658f) this.receiver;
        C18570vk c18570vk = c1129658f.A01;
        Object[] objArr = c18570vk.A03;
        long[] jArr = c18570vk.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((j & ((j ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j & 255) < 128) {
                            Object obj = (InterfaceC114145Da) objArr[(i << 3) + i3];
                            if (((C58J) obj).A03.A08) {
                                C58J c58j = ((C58J) obj).A03;
                                C57S c57s = null;
                                while (c58j != null) {
                                    if (c58j instanceof C58Z) {
                                        c1129658f.A02.A09(c58j);
                                    } else if ((c58j.A01 & 1024) != 0 && (c58j instanceof C5AY)) {
                                        int i4 = 0;
                                        for (C58J c58j2 = ((C5AY) c58j).A00; c58j2 != null; c58j2 = c58j2.A02) {
                                            if ((c58j2.A01 & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    c58j = c58j2;
                                                } else {
                                                    if (c57s == null) {
                                                        c57s = new C57S(new C58J[16]);
                                                    }
                                                    if (c58j != null) {
                                                        c57s.A09(c58j);
                                                        c58j = null;
                                                    }
                                                    c57s.A09(c58j2);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    c58j = AbstractC114335Dx.A00(c57s);
                                }
                                C58J c58j3 = ((C58J) obj).A03;
                                if (c58j3.A08) {
                                    C57S c57s2 = new C57S(new C58J[16]);
                                    C58J c58j4 = c58j3.A02;
                                    if (c58j4 == null) {
                                        AbstractC114335Dx.A06(c57s2, c58j3);
                                    } else {
                                        c57s2.A09(c58j4);
                                    }
                                    while (true) {
                                        int i5 = c57s2.A00;
                                        if (i5 != 0) {
                                            C58J c58j5 = (C58J) c57s2.A00(i5 - 1);
                                            if ((c58j5.A00 & 1024) == 0) {
                                                AbstractC114335Dx.A06(c57s2, c58j5);
                                            } else {
                                                while (true) {
                                                    if ((c58j5.A01 & 1024) != 0) {
                                                        C57S c57s3 = null;
                                                        do {
                                                            if (c58j5 instanceof C58Z) {
                                                                c1129658f.A02.A09(c58j5);
                                                            } else if ((c58j5.A01 & 1024) != 0 && (c58j5 instanceof C5AY)) {
                                                                int i6 = 0;
                                                                for (C58J c58j6 = ((C5AY) c58j5).A00; c58j6 != null; c58j6 = c58j6.A02) {
                                                                    if ((c58j6.A01 & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            c58j5 = c58j6;
                                                                        } else {
                                                                            if (c57s3 == null) {
                                                                                c57s3 = new C57S(new C58J[16]);
                                                                            }
                                                                            if (c58j5 != null) {
                                                                                c57s3.A09(c58j5);
                                                                                c58j5 = null;
                                                                            }
                                                                            c57s3.A09(c58j6);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            c58j5 = AbstractC114335Dx.A00(c57s3);
                                                        } while (c58j5 != null);
                                                    } else {
                                                        c58j5 = c58j5.A02;
                                                        if (c58j5 != null) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                            } else {
                                continue;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        c18570vk.A05();
        C18570vk c18570vk2 = c1129658f.A00;
        Object[] objArr2 = c18570vk2.A03;
        long[] jArr2 = c18570vk2.A02;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j2 = jArr2[i7];
                if ((((j2 ^ (-1)) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - (((i7 - length2) ^ (-1)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((j2 & 255) < 128) {
                            C5DY c5dy = (C5DY) objArr2[(i7 << 3) + i9];
                            if (!((C58J) c5dy).A03.A08) {
                                c5dy.DHg(EnumC118935aA.Inactive);
                            } else {
                                C58J c58j7 = ((C58J) c5dy).A03;
                                C58Z c58z = null;
                                C57S c57s4 = null;
                                boolean z = false;
                                boolean z2 = true;
                                while (c58j7 != null) {
                                    if (c58j7 instanceof C58Z) {
                                        C58Z c58z2 = (C58Z) c58j7;
                                        if (c58z != null) {
                                            z = true;
                                        }
                                        if (c1129658f.A02.A04(c58z2)) {
                                            c1129658f.A03.A09(c58z2);
                                            z2 = false;
                                        }
                                        c58z = c58z2;
                                    } else if ((c58j7.A01 & 1024) != 0 && (c58j7 instanceof C5AY)) {
                                        int i10 = 0;
                                        for (C58J c58j8 = ((C5AY) c58j7).A00; c58j8 != null; c58j8 = c58j8.A02) {
                                            if ((c58j8.A01 & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    c58j7 = c58j8;
                                                } else {
                                                    if (c57s4 == null) {
                                                        c57s4 = new C57S(new C58J[16]);
                                                    }
                                                    if (c58j7 != null) {
                                                        c57s4.A09(c58j7);
                                                        c58j7 = null;
                                                    }
                                                    c57s4.A09(c58j8);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    c58j7 = AbstractC114335Dx.A00(c57s4);
                                }
                                C58J c58j9 = ((C58J) c5dy).A03;
                                if (c58j9.A08) {
                                    C57S c57s5 = new C57S(new C58J[16]);
                                    C58J c58j10 = c58j9.A02;
                                    if (c58j10 == null) {
                                        AbstractC114335Dx.A06(c57s5, c58j9);
                                    } else {
                                        c57s5.A09(c58j10);
                                    }
                                    while (true) {
                                        int i11 = c57s5.A00;
                                        if (i11 == 0) {
                                            break;
                                        }
                                        C58J c58j11 = (C58J) c57s5.A00(i11 - 1);
                                        if ((c58j11.A00 & 1024) == 0) {
                                            AbstractC114335Dx.A06(c57s5, c58j11);
                                        } else {
                                            while (true) {
                                                if ((c58j11.A01 & 1024) != 0) {
                                                    C57S c57s6 = null;
                                                    do {
                                                        if (c58j11 instanceof C58Z) {
                                                            C58Z c58z3 = (C58Z) c58j11;
                                                            if (c58z != null) {
                                                                z = true;
                                                            }
                                                            if (c1129658f.A02.A04(c58z3)) {
                                                                c1129658f.A03.A09(c58z3);
                                                                z2 = false;
                                                            }
                                                            c58z = c58z3;
                                                        } else if ((c58j11.A01 & 1024) != 0 && (c58j11 instanceof C5AY)) {
                                                            int i12 = 0;
                                                            for (C58J c58j12 = ((C5AY) c58j11).A00; c58j12 != null; c58j12 = c58j12.A02) {
                                                                if ((c58j12.A01 & 1024) != 0) {
                                                                    i12++;
                                                                    if (i12 == 1) {
                                                                        c58j11 = c58j12;
                                                                    } else {
                                                                        if (c57s6 == null) {
                                                                            c57s6 = new C57S(new C58J[16]);
                                                                        }
                                                                        if (c58j11 != null) {
                                                                            c57s6.A09(c58j11);
                                                                            c58j11 = null;
                                                                        }
                                                                        c57s6.A09(c58j12);
                                                                    }
                                                                }
                                                            }
                                                            if (i12 == 1) {
                                                            }
                                                        }
                                                        c58j11 = AbstractC114335Dx.A00(c57s6);
                                                    } while (c58j11 != null);
                                                } else {
                                                    c58j11 = c58j11.A02;
                                                    if (c58j11 != null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (z2) {
                                        if (z) {
                                            enumC118935aA = AbstractC118955aC.A00(c5dy);
                                        } else if (c58z == null || (enumC118935aA = c58z.A0G()) == null) {
                                            enumC118935aA = EnumC118935aA.Inactive;
                                        }
                                        c5dy.DHg(enumC118935aA);
                                    }
                                } else {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
            }
        }
        c18570vk2.A05();
        C18570vk c18570vk3 = c1129658f.A02;
        Object[] objArr3 = c18570vk3.A03;
        long[] jArr3 = c18570vk3.A02;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i13 = 0;
            while (true) {
                long j3 = jArr3[i13];
                if ((((j3 ^ (-1)) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - (((i13 - length3) ^ (-1)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j3 & 255) < 128) {
                            C58Z c58z4 = (C58Z) objArr3[(i13 << 3) + i15];
                            if (c58z4.A08) {
                                EnumC118935aA A0G = c58z4.A0G();
                                c58z4.A0H();
                                if (A0G != c58z4.A0G() || c1129658f.A03.A04(c58z4)) {
                                    AbstractC118955aC.A01(c58z4);
                                }
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length3) {
                    break;
                }
                i13++;
            }
        }
        c18570vk3.A05();
        c1129658f.A03.A05();
        c1129658f.A04.invoke();
        if (c18570vk.A01 == 0) {
            if (c18570vk2.A01 == 0) {
                if (c18570vk3.A01 == 0) {
                    return C0eB.A00;
                }
                str = "Unprocessed FocusTarget nodes";
            } else {
                str = "Unprocessed FocusEvent nodes";
            }
        } else {
            str = "Unprocessed FocusProperties nodes";
        }
        AbstractC28290Cdc.A01(str);
        throw C00O.createAndThrow();
    }
}
