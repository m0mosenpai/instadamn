package X;

import java.lang.reflect.Array;

/* renamed from: X.0ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13660ms {
    public int A00;
    public InterfaceC13640mq A03;
    public InterfaceC13650mr A04;
    public Object[] A05;
    public final Class A06;
    public C18480va A02 = null;
    public int A01 = 0;

    public static int A01(AbstractC13660ms abstractC13660ms, Object obj, boolean z) {
        int A00 = A00(abstractC13660ms, obj, 1);
        if (A00 == -1) {
            A00 = 0;
        } else if (A00 < abstractC13660ms.A01) {
            Object obj2 = abstractC13660ms.A05[A00];
            InterfaceC13650mr interfaceC13650mr = abstractC13660ms.A04;
            if (interfaceC13650mr.ACR(obj2, obj)) {
                boolean ACO = interfaceC13650mr.ACO(obj2, obj);
                abstractC13660ms.A05[A00] = obj;
                if (!ACO) {
                    abstractC13660ms.A03.D2i(A00, 1);
                    return A00;
                }
                return A00;
            }
        }
        int i = abstractC13660ms.A01;
        if (A00 <= i) {
            Object[] objArr = abstractC13660ms.A05;
            int length = objArr.length;
            if (i == length) {
                Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) abstractC13660ms.A06, length + 10);
                System.arraycopy(abstractC13660ms.A05, 0, objArr2, 0, A00);
                objArr2[A00] = obj;
                System.arraycopy(abstractC13660ms.A05, A00, objArr2, A00 + 1, abstractC13660ms.A01 - A00);
                abstractC13660ms.A05 = objArr2;
            } else {
                System.arraycopy(objArr, A00, objArr, A00 + 1, i - A00);
                abstractC13660ms.A05[A00] = obj;
            }
            abstractC13660ms.A01++;
            if (z) {
                abstractC13660ms.A03.DMJ(A00, 1);
            }
            return A00;
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A02(A00, i, "cannot add item to ", " because size is "));
    }

    public final void A07(Object obj) {
        int A00 = A00(this, obj, 2);
        if (A00 != -1) {
            A02(this, A00, true);
        }
    }

    public AbstractC13660ms(InterfaceC13640mq interfaceC13640mq, InterfaceC13650mr interfaceC13650mr, Class cls) {
        this.A00 = 0;
        this.A06 = cls;
        this.A05 = (Object[]) Array.newInstance((Class<?>) cls, 10);
        this.A04 = interfaceC13650mr;
        this.A03 = interfaceC13640mq;
        this.A00 = 0;
    }

    public static int A00(AbstractC13660ms abstractC13660ms, Object obj, int i) {
        Object obj2;
        int i2 = abstractC13660ms.A01;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (i3 + i2) / 2;
            Object obj3 = abstractC13660ms.A05[i4];
            InterfaceC13650mr interfaceC13650mr = abstractC13660ms.A04;
            int compare = interfaceC13650mr.compare(obj3, obj);
            if (compare < 0) {
                i3 = i4 + 1;
            } else {
                if (compare == 0) {
                    if (!interfaceC13650mr.ACR(obj3, obj)) {
                        int i5 = i4;
                        int i6 = i4 - 1;
                        while (i6 >= i3) {
                            Object obj4 = abstractC13660ms.A05[i6];
                            if (interfaceC13650mr.compare(obj4, obj) != 0) {
                                break;
                            }
                            if (interfaceC13650mr.ACR(obj4, obj)) {
                                break;
                            }
                            i6--;
                        }
                        do {
                            i5++;
                            if (i5 < i2) {
                                obj2 = abstractC13660ms.A05[i5];
                                if (interfaceC13650mr.compare(obj2, obj) == 0) {
                                }
                            }
                            i6 = -1;
                            break;
                        } while (!interfaceC13650mr.ACR(obj2, obj));
                        i6 = i5;
                        if (i == 1) {
                            if (i6 != -1) {
                                return i6;
                            }
                        } else {
                            return i6;
                        }
                    }
                    return i4;
                }
                i2 = i4;
            }
        }
        if (i != 1) {
            return -1;
        }
        return i3;
    }

    public static void A02(AbstractC13660ms abstractC13660ms, int i, boolean z) {
        Object[] objArr = abstractC13660ms.A05;
        System.arraycopy(objArr, i + 1, objArr, i, (abstractC13660ms.A01 - i) - 1);
        int i2 = abstractC13660ms.A01 - 1;
        abstractC13660ms.A01 = i2;
        abstractC13660ms.A05[i2] = null;
        if (z) {
            abstractC13660ms.A03.DfC(i, 1);
        }
    }

    public final Object A04(int i) {
        int i2 = this.A01;
        if (i < i2 && i >= 0) {
            return this.A05[i];
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, i2, "Asked to get item at ", " but size is "));
    }

    public final void A05() {
        this.A00++;
        if (this.A02 == null) {
            C18480va c18480va = new C18480va(this.A03);
            this.A02 = c18480va;
            this.A03 = c18480va;
            c18480va.CzH();
        }
    }

    public final void A06() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            C18480va c18480va = this.A02;
            if (c18480va != null) {
                c18480va.A00();
                InterfaceC13640mq interfaceC13640mq = this.A03;
                if (interfaceC13640mq == c18480va) {
                    interfaceC13640mq = c18480va.A03;
                    this.A03 = interfaceC13640mq;
                }
                interfaceC13640mq.DDa();
            }
            this.A02 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r5.A04.ACO(r4, r6) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A03(java.lang.Object r6, int r7) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.A04(r7)
            r3 = 0
            r2 = 1
            if (r4 == r6) goto L11
            X.0mr r0 = r5.A04
            boolean r0 = r0.ACO(r4, r6)
            r1 = 0
            if (r0 != 0) goto L12
        L11:
            r1 = 1
        L12:
            if (r4 == r6) goto L28
            X.0mr r0 = r5.A04
            int r0 = r0.compare(r4, r6)
            if (r0 != 0) goto L28
            java.lang.Object[] r0 = r5.A05
            r0[r7] = r6
            if (r1 == 0) goto L27
            X.0mq r0 = r5.A03
            r0.D2i(r7, r2)
        L27:
            return r7
        L28:
            if (r1 == 0) goto L2f
            X.0mq r0 = r5.A03
            r0.D2i(r7, r2)
        L2f:
            A02(r5, r7, r3)
            int r1 = A01(r5, r6, r3)
            if (r7 == r1) goto L3d
            X.0mq r0 = r5.A03
            r0.DTy(r7, r1)
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC13660ms.A03(java.lang.Object, int):int");
    }
}
