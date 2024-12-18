package X;

import android.util.SparseArray;

/* renamed from: X.0Rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05690Rt extends SparseArray implements InterfaceC07540aT {
    public boolean A00 = false;

    private void A00() {
        if (!this.A00) {
        } else {
            throw new IllegalStateException("Map is locked from modifications");
        }
    }

    @Override // android.util.SparseArray
    public final void append(int i, Object obj) {
        A00();
        super.append(i, obj);
    }

    @Override // android.util.SparseArray
    public final void clear() {
        A00();
        super.clear();
    }

    @Override // android.util.SparseArray, X.InterfaceC07540aT
    public final void put(int i, Object obj) {
        A00();
        super.put(i, obj);
    }

    @Override // android.util.SparseArray
    public final void remove(int i) {
        A00();
        super.remove(i);
    }

    @Override // android.util.SparseArray
    public final void removeAt(int i) {
        A00();
        super.removeAt(i);
    }

    @Override // android.util.SparseArray
    public final void setValueAt(int i, Object obj) {
        A00();
        super.setValueAt(i, obj);
    }
}
