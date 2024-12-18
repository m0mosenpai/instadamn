package X;

import android.content.Context;
import android.os.Message;
import android.widget.Adapter;

/* renamed from: X.32h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC674232h {
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MAX_VALUE;
    public final int A02;

    public static final Object A00(Adapter adapter, int i) {
        if (i >= 0 && i < adapter.getCount()) {
            return adapter.getItem(i);
        }
        return null;
    }

    public void A01(Adapter adapter, int i) {
        if (this instanceof C674332i) {
            C674332i c674332i = (C674332i) this;
            if (i >= 0) {
                InterfaceC65282xQ interfaceC65282xQ = c674332i.A02;
                if (i < interfaceC65282xQ.getCount() && (interfaceC65282xQ.getItem(i) instanceof C38321qM)) {
                    C38321qM c38321qM = (C38321qM) interfaceC65282xQ.getItem(i);
                    C75113Zb BRZ = interfaceC65282xQ.BRZ(c38321qM);
                    C673932e c673932e = c674332i.A01;
                    int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                    C57332k8 c57332k8 = c673932e.A03;
                    Context context = c674332i.A00;
                    boolean z = BRZ.A1p;
                    boolean A0L = AbstractC75103Za.A0L(c38321qM, BRZ.A03);
                    boolean z2 = false;
                    if (BRZ.A3b.A00 == EnumC75183Zl.A06) {
                        z2 = true;
                    }
                    int i3 = 0;
                    if (A0L) {
                        i3 = 1 << 0;
                    }
                    if (z) {
                        i3 |= 1 << 1;
                    }
                    if (z2) {
                        i3 |= 1 << 2;
                    }
                    AnonymousClass341 anonymousClass341 = BRZ.A0o;
                    String moduleName = c673932e.A02.getModuleName();
                    C14360o3.A0B(c38321qM, 1);
                    C14360o3.A0B(moduleName, 4);
                    HandlerC57442kJ handlerC57442kJ = c57332k8.A0K;
                    Message obtainMessage = handlerC57442kJ.obtainMessage(2, new C123295i4(context, c38321qM, anonymousClass341, moduleName));
                    C14360o3.A07(obtainMessage);
                    obtainMessage.arg1 = i3;
                    handlerC57442kJ.A00(obtainMessage);
                    return;
                }
                return;
            }
            return;
        }
        C674032f c674032f = (C674032f) this;
        C673932e.A00(c674032f.A00, adapter, c674032f.A01, i);
    }

    public final void A02(Adapter adapter, int i) {
        int i2;
        if (this instanceof AbstractC674132g) {
            AbstractC674132g abstractC674132g = (AbstractC674132g) this;
            abstractC674132g.A01 = Integer.MAX_VALUE;
            int max = Math.max(i, abstractC674132g.A00);
            Object A00 = A00(adapter, max);
            int i3 = 0;
            for (int i4 = i + 1; i3 < abstractC674132g.A02 && i4 < adapter.getCount(); i4++) {
                if (abstractC674132g.A04(adapter, i4) && A00 != A00(adapter, i4)) {
                    if (i4 > max) {
                        abstractC674132g.A01(adapter, i4);
                        A00 = adapter.getItem(i4);
                    }
                    abstractC674132g.A00 = i4;
                    i3++;
                }
            }
            return;
        }
        this.A01 = Integer.MAX_VALUE;
        boolean z = true;
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.A02 && (i2 = i + i6) < adapter.getCount()) {
            if (A00(adapter, i2) != A00(adapter, i2 - 1)) {
                i5++;
            }
            i6++;
        }
        int i7 = i + i6;
        for (int max2 = Math.max(i, this.A00) + 1; max2 <= i7; max2++) {
            if (z || A00(adapter, max2) != A00(adapter, max2 - 1)) {
                if (max2 >= 0 && max2 < adapter.getCount()) {
                    A01(adapter, max2);
                }
                z = false;
            }
        }
        this.A00 = i7;
    }

    public final void A03(Adapter adapter, int i) {
        int i2;
        if (this instanceof AbstractC674132g) {
            AbstractC674132g abstractC674132g = (AbstractC674132g) this;
            abstractC674132g.A00 = Integer.MIN_VALUE;
            int min = Math.min(i, abstractC674132g.A01);
            Object A00 = A00(adapter, min);
            int i3 = 0;
            for (int i4 = i - 1; i3 < abstractC674132g.A02 && i4 >= 0; i4--) {
                if (i4 < adapter.getCount() && abstractC674132g.A04(adapter, i4) && A00 != A00(adapter, i4)) {
                    if (i4 < min) {
                        abstractC674132g.A01(adapter, i4);
                        A00 = A00(adapter, i4);
                    }
                    abstractC674132g.A01 = i4;
                    i3++;
                }
            }
            return;
        }
        this.A00 = Integer.MIN_VALUE;
        boolean z = true;
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.A02 && (i2 = i - i6) >= 0) {
            if (A00(adapter, i2) != A00(adapter, i2 + 1)) {
                i5++;
            }
            i6++;
        }
        int i7 = i - i6;
        for (int min2 = Math.min(i, this.A01) - 1; min2 >= i7; min2--) {
            if (z || A00(adapter, min2) != A00(adapter, min2 + 1)) {
                if (min2 >= 0 && min2 < adapter.getCount()) {
                    A01(adapter, min2);
                }
                z = false;
            }
        }
        this.A01 = i7;
    }

    public AbstractC674232h(int i) {
        this.A02 = i;
    }
}
