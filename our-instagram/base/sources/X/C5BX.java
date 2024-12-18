package X;

import java.util.HashMap;

/* renamed from: X.5BX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BX {
    public int A01;
    public C18630vq A02;
    public Object A03;
    public final InterfaceC16660sJ A0B;
    public int A00 = -1;
    public final C117455Te A09 = new C117455Te();
    public final C18590vm A04 = new C18590vm(6);
    public final C18570vk A05 = new C18570vk(6);
    public final C57S A07 = new C57S(new InterfaceC113785Bq[16]);
    public final InterfaceC117545Tp A06 = new InterfaceC117545Tp() { // from class: X.5aO
        @Override // X.InterfaceC117545Tp
        public final void AQD(InterfaceC113785Bq interfaceC113785Bq) {
            C5BX c5bx = C5BX.this;
            c5bx.A01--;
        }

        @Override // X.InterfaceC117545Tp
        public final void Eme(InterfaceC113785Bq interfaceC113785Bq) {
            C5BX.this.A01++;
        }
    };
    public final C117455Te A08 = new C117455Te();
    public final HashMap A0A = new HashMap();

    public static final void A00(C18630vq c18630vq, C5BX c5bx, Object obj, Object obj2, int i) {
        if (c5bx.A01 <= 0) {
            int i2 = -1;
            int A01 = C18630vq.A01(c18630vq, obj);
            if (A01 < 0) {
                A01 ^= -1;
            } else {
                i2 = c18630vq.A02[A01];
            }
            c18630vq.A04[A01] = obj;
            c18630vq.A02[A01] = i;
            if ((obj instanceof InterfaceC113785Bq) && i2 != i) {
                C113795Br Aul = ((InterfaceC113785Bq) obj).Aul();
                c5bx.A0A.put(obj, Aul.A04);
                AbstractC004001f abstractC004001f = Aul.A03;
                C117455Te c117455Te = c5bx.A08;
                c117455Te.A00(obj);
                Object[] objArr = abstractC004001f.A04;
                long[] jArr = abstractC004001f.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - (((i3 - length) ^ (-1)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    InterfaceC74933Yj interfaceC74933Yj = (InterfaceC74933Yj) objArr[(i3 << 3) + i5];
                                    if (interfaceC74933Yj instanceof AbstractC74923Yi) {
                                        ((AbstractC74923Yi) interfaceC74933Yj).A01(2);
                                    }
                                    c117455Te.A01(interfaceC74933Yj, obj);
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            if (i2 == -1) {
                if (obj instanceof AbstractC74923Yi) {
                    ((AbstractC74923Yi) obj).A01(2);
                }
                c5bx.A09.A01(obj, obj2);
            }
        }
    }

    public static final void A01(C5BX c5bx, Object obj, Object obj2) {
        C117455Te c117455Te = c5bx.A09;
        c117455Te.A02(obj2, obj);
        if ((obj2 instanceof InterfaceC113785Bq) && !c117455Te.A00.A04(obj2)) {
            c5bx.A08.A00(obj2);
            c5bx.A0A.remove(obj2);
        }
    }

    public C5BX(InterfaceC16660sJ interfaceC16660sJ) {
        this.A0B = interfaceC16660sJ;
    }
}
