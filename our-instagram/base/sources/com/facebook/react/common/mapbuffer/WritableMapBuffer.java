package com.facebook.react.common.mapbuffer;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25230BEn;
import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.C14360o3;
import X.InterfaceC72045XLb;
import X.MSW;
import X.PUD;
import X.STW;
import android.util.SparseArray;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class WritableMapBuffer implements InterfaceC72045XLb {
    public static final WritableMapBuffer $redex_init_class = null;
    public final SparseArray A00 = AbstractC58318PtA.A0G();

    private final int[] getKeys() {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    private final Object[] getValues() {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            Object valueAt = sparseArray.valueAt(i);
            C14360o3.A07(valueAt);
            objArr[i] = valueAt;
        }
        return objArr;
    }

    @Override // X.InterfaceC72045XLb
    public final boolean contains(int i) {
        return AbstractC167007dF.A1W(this.A00.get(i));
    }

    @Override // X.InterfaceC72045XLb
    public final boolean getBoolean(int i) {
        Object obj = this.A00.get(i);
        if (obj != null) {
            if (obj instanceof Boolean) {
                return AbstractC166987dD.A1a(obj);
            }
            throw AbstractC58323PtF.A0h(Boolean.class, obj, AbstractC58322PtE.A0t(), i);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // X.InterfaceC72045XLb
    public final int getCount() {
        return this.A00.size();
    }

    @Override // X.InterfaceC72045XLb
    public final double getDouble(int i) {
        Object obj = this.A00.get(i);
        if (obj != null) {
            if (obj instanceof Double) {
                return MSW.A00(obj);
            }
            throw AbstractC58323PtF.A0h(Double.class, obj, AbstractC58322PtE.A0t(), i);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // X.InterfaceC72045XLb
    public final int getInt(int i) {
        Object obj = this.A00.get(i);
        if (obj != null) {
            if (obj instanceof Integer) {
                return AbstractC166987dD.A0H(obj);
            }
            throw AbstractC58323PtF.A0h(Integer.class, obj, AbstractC58322PtE.A0t(), i);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // X.InterfaceC72045XLb
    public final InterfaceC72045XLb getMapBuffer(int i) {
        Object obj = this.A00.get(i);
        if (obj != null) {
            if (obj instanceof InterfaceC72045XLb) {
                return (InterfaceC72045XLb) obj;
            }
            throw AbstractC58323PtF.A0h(InterfaceC72045XLb.class, obj, AbstractC58322PtE.A0t(), i);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // X.InterfaceC72045XLb
    public final String getString(int i) {
        Object obj = this.A00.get(i);
        if (obj != null) {
            if (obj instanceof String) {
                return (String) obj;
            }
            throw AbstractC58323PtF.A0h(String.class, obj, AbstractC58322PtE.A0t(), i);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new PUD(this);
    }

    static {
        STW.A00();
    }
}
