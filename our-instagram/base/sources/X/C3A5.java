package X;

import android.widget.Adapter;

/* renamed from: X.3A5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3A5 implements C3A6 {
    public final Adapter A00;

    @Override // X.C3A6
    public final Object CAM(int i) {
        Adapter adapter = this.A00;
        if (i < adapter.getCount()) {
            return adapter.getItem(i);
        }
        return null;
    }

    @Override // X.C3A6
    public final Class CAN(Object obj) {
        if (obj instanceof C3Py) {
            return C3Py.class;
        }
        if (obj instanceof C40971v4) {
            return C38321qM.class;
        }
        return obj.getClass();
    }

    public C3A5(Adapter adapter) {
        this.A00 = adapter;
    }
}
