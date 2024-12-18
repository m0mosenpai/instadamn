package X;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WyD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71661WyD implements Iterator {
    public final Object A02;
    public final int A01 = 0;
    public int A00 = 0;

    public C71661WyD(List list) {
        this.A02 = list;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.A01;
        int i3 = this.A00;
        if (i2 != 0) {
            i = ((List) this.A02).size();
        } else {
            i = ((C71196Wpl) this.A02).A03;
        }
        return AbstractC167007dF.A1Q(i3, i);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A01 != 0) {
            List list = (List) this.A02;
            int i = this.A00;
            this.A00 = i + 1;
            return new ModuleHolder((NativeModule) list.get(i));
        }
        C71193Wpi[] c71193WpiArr = ((C71196Wpl) this.A02).A07;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        return c71193WpiArr[i2].A04;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.A01 != 0) {
            throw new UnsupportedOperationException("Cannot remove methods ");
        }
        throw new UnsupportedOperationException();
    }

    public C71661WyD(C71196Wpl c71196Wpl) {
        this.A02 = c71196Wpl;
    }
}
