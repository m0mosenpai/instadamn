package X;

import java.util.ArrayList;

/* renamed from: X.1wS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41781wS implements InterfaceC41801wU, InterfaceC41821wW {
    public C42651xt A00;
    public volatile boolean A01;

    public static final void A00(C42651xt c42651xt) {
        if (c42651xt != null) {
            ArrayList arrayList = null;
            for (Object obj : c42651xt.A03) {
                if (obj instanceof InterfaceC41801wU) {
                    try {
                        ((InterfaceC41801wU) obj).dispose();
                    } catch (Throwable th) {
                        AbstractC62281S5a.A00(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList != null) {
                if (arrayList.size() == 1) {
                    throw Y4X.A00((Throwable) arrayList.get(0));
                }
                throw new C64866TXr(arrayList);
            }
        }
    }

    @Override // X.InterfaceC41821wW
    public final boolean AOa(InterfaceC41801wU interfaceC41801wU) {
        C42651xt c42651xt;
        int i;
        Object obj;
        AbstractC42141x4.A01(interfaceC41801wU, "Disposable item is null");
        if (this.A01) {
            return false;
        }
        synchronized (this) {
            if (!this.A01 && (c42651xt = this.A00) != null) {
                Object[] objArr = c42651xt.A03;
                int i2 = c42651xt.A00;
                int hashCode = interfaceC41801wU.hashCode() * (-1640531527);
                int i3 = (hashCode ^ (hashCode >>> 16)) & i2;
                Object obj2 = objArr[i3];
                while (obj2 != null) {
                    if (obj2.equals(interfaceC41801wU)) {
                        c42651xt.A02--;
                        while (true) {
                            int i4 = i3 + 1;
                            while (true) {
                                i = i4 & i2;
                                obj = objArr[i];
                                if (obj == null) {
                                    objArr[i3] = null;
                                    return true;
                                }
                                int hashCode2 = obj.hashCode() * (-1640531527);
                                int i5 = (hashCode2 ^ (hashCode2 >>> 16)) & i2;
                                if (i3 > i) {
                                    if (i3 < i5) {
                                        continue;
                                        i4 = i + 1;
                                    }
                                } else if (i3 >= i5) {
                                    break;
                                }
                                if (i5 > i) {
                                    break;
                                }
                                i4 = i + 1;
                            }
                            objArr[i3] = obj;
                            i3 = i;
                        }
                    } else {
                        i3 = (i3 + 1) & i2;
                        obj2 = objArr[i3];
                    }
                }
            }
            return false;
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A01) {
            synchronized (this) {
                if (this.A01) {
                    return;
                }
                this.A01 = true;
                C42651xt c42651xt = this.A00;
                this.A00 = null;
                A00(c42651xt);
            }
        }
    }

    @Override // X.InterfaceC41821wW
    public final boolean A7o(InterfaceC41801wU interfaceC41801wU) {
        Object obj;
        AbstractC42141x4.A01(interfaceC41801wU, "d is null");
        if (!this.A01) {
            synchronized (this) {
                if (!this.A01) {
                    C42651xt c42651xt = this.A00;
                    if (c42651xt == null) {
                        c42651xt = new C42651xt();
                        this.A00 = c42651xt;
                    }
                    Object[] objArr = c42651xt.A03;
                    int i = c42651xt.A00;
                    int hashCode = interfaceC41801wU.hashCode() * (-1640531527);
                    int i2 = (hashCode ^ (hashCode >>> 16)) & i;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        boolean equals = obj2.equals(interfaceC41801wU);
                        while (!equals) {
                            i2 = (i2 + 1) & i;
                            Object obj3 = objArr[i2];
                            if (obj3 != null) {
                                equals = obj3.equals(interfaceC41801wU);
                            }
                        }
                        return true;
                    }
                    objArr[i2] = interfaceC41801wU;
                    int i3 = c42651xt.A02 + 1;
                    c42651xt.A02 = i3;
                    if (i3 >= c42651xt.A01) {
                        Object[] objArr2 = c42651xt.A03;
                        int length = objArr2.length;
                        int i4 = length << 1;
                        int i5 = i4 - 1;
                        Object[] objArr3 = new Object[i4];
                        while (true) {
                            int i6 = i3 - 1;
                            if (i3 == 0) {
                                break;
                            }
                            do {
                                length--;
                                obj = objArr2[length];
                            } while (obj == null);
                            int hashCode2 = obj.hashCode() * (-1640531527);
                            int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
                            if (objArr3[i7] == null) {
                                objArr3[i7] = objArr2[length];
                                i3 = i6;
                            }
                            do {
                                i7 = (i7 + 1) & i5;
                            } while (objArr3[i7] != null);
                            objArr3[i7] = objArr2[length];
                            i3 = i6;
                        }
                        c42651xt.A00 = i5;
                        c42651xt.A01 = (int) (i4 * 0.75f);
                        c42651xt.A03 = objArr3;
                    }
                    return true;
                }
            }
        }
        interfaceC41801wU.dispose();
        return false;
    }

    @Override // X.InterfaceC41821wW
    public final boolean EEm(InterfaceC41801wU interfaceC41801wU) {
        if (AOa(interfaceC41801wU)) {
            interfaceC41801wU.dispose();
            return true;
        }
        return false;
    }
}
