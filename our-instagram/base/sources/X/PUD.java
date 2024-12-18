package X;

import com.facebook.react.common.mapbuffer.WritableMapBuffer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
public final class PUD implements Iterator, InterfaceC15590qF {
    public int A00;
    public final int A01 = 1;
    public final Object A02;

    public PUD(PV3 pv3) {
        this.A00 = pv3.A00;
        this.A02 = pv3.A01.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A01 != 0) {
            if (this.A00 > 0 && ((Iterator) this.A02).hasNext()) {
                return true;
            }
            return false;
        }
        int i = this.A00;
        WritableMapBuffer writableMapBuffer = (WritableMapBuffer) this.A02;
        WritableMapBuffer writableMapBuffer2 = WritableMapBuffer.$redex_init_class;
        if (i < writableMapBuffer.A00.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A01 != 0) {
            int i = this.A00;
            if (i != 0) {
                this.A00 = i - 1;
                return ((Iterator) this.A02).next();
            }
            throw new NoSuchElementException();
        }
        WritableMapBuffer writableMapBuffer = (WritableMapBuffer) this.A02;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        return new T0M(writableMapBuffer, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.A01;
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(30));
    }

    public PUD(WritableMapBuffer writableMapBuffer) {
        this.A02 = writableMapBuffer;
    }
}
