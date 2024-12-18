package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: X.0ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12500ku implements Iterator, C0s1 {
    public int A00;
    public final /* synthetic */ ViewGroup A01;

    public C12500ku(ViewGroup viewGroup) {
        this.A01 = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 >= this.A01.getChildCount()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        ViewGroup viewGroup = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.A01;
        int i = this.A00 - 1;
        this.A00 = i;
        viewGroup.removeViewAt(i);
    }
}
