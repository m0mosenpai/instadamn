package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3Yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75033Yt {
    public Object A00;
    public final AtomicReference A02 = new AtomicReference(AbstractC75043Yu.A00);
    public final Object A01 = new Object();

    public final Object A00() {
        long id = Thread.currentThread().getId();
        if (id == AbstractC74903Yf.A00) {
            return this.A00;
        }
        C75053Yv c75053Yv = (C75053Yv) this.A02.get();
        int A00 = C75053Yv.A00(c75053Yv, id);
        if (A00 >= 0) {
            return c75053Yv.A02[A00];
        }
        return null;
    }

    public final void A01(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == AbstractC74903Yf.A00) {
            this.A00 = obj;
            return;
        }
        synchronized (this.A01) {
            AtomicReference atomicReference = this.A02;
            C75053Yv c75053Yv = (C75053Yv) atomicReference.get();
            int A00 = C75053Yv.A00(c75053Yv, id);
            if (A00 < 0) {
                int i = c75053Yv.A00;
                Object[] objArr = c75053Yv.A02;
                int i2 = 0;
                int i3 = 0;
                for (Object obj2 : objArr) {
                    if (obj2 != null) {
                        i3++;
                    }
                }
                int i4 = i3 + 1;
                long[] jArr = new long[i4];
                Object[] objArr2 = new Object[i4];
                if (i4 > 1) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i) {
                            break;
                        }
                        long j = c75053Yv.A01[i5];
                        Object obj3 = objArr[i5];
                        if (j > id) {
                            jArr[i2] = id;
                            objArr2[i2] = obj;
                            i2++;
                            break;
                        } else {
                            if (obj3 != null) {
                                jArr[i2] = j;
                                objArr2[i2] = obj3;
                                i2++;
                            }
                            i5++;
                            if (i2 >= i4) {
                                break;
                            }
                        }
                    }
                    if (i5 == i) {
                        i2 = i4 - 1;
                    } else {
                        while (i2 < i4) {
                            long j2 = c75053Yv.A01[i5];
                            Object obj4 = objArr[i5];
                            if (obj4 != null) {
                                jArr[i2] = j2;
                                objArr2[i2] = obj4;
                                i2++;
                            }
                            i5++;
                        }
                        atomicReference.set(new C75053Yv(jArr, objArr2, i4));
                    }
                }
                jArr[i2] = id;
                objArr2[i2] = obj;
                atomicReference.set(new C75053Yv(jArr, objArr2, i4));
            } else {
                c75053Yv.A02[A00] = obj;
            }
        }
    }
}
