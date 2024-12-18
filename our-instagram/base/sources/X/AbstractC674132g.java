package X;

import android.widget.Adapter;

/* renamed from: X.32g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC674132g extends AbstractC674232h {
    public int A00;
    public int A01;
    public final int A02;

    public final boolean A04(Adapter adapter, int i) {
        if (this instanceof C674332i) {
            Object item = adapter.getItem(i);
            if (!(item instanceof C38321qM) || ((C38321qM) item).A0s() <= 0) {
                return false;
            }
            return true;
        }
        Object item2 = adapter.getItem(i);
        if (item2 instanceof C38321qM) {
            return ((C38321qM) item2).A55();
        }
        return false;
    }

    public AbstractC674132g(int i) {
        super(i);
        this.A00 = Integer.MIN_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A02 = i;
    }
}
