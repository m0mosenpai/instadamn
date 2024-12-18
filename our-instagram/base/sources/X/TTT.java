package X;

import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TTT implements ListIterator, InterfaceC15590qF {
    public int A00;
    public final int A01;
    public final int A02;
    public final /* synthetic */ C5BP A03;

    public TTT(C5BP c5bp, int i, int i2, int i3) {
        this.A03 = c5bp;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A01);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AbstractC25230BEn.A1S(this.A00, this.A02);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Object[] objArr = this.A03.A04;
        int i = this.A00;
        this.A00 = i + 1;
        Object obj = objArr[i];
        C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00 - this.A02;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        Object[] objArr = this.A03.A04;
        int i = this.A00 - 1;
        this.A00 = i;
        Object obj = objArr[i];
        C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.A00 - this.A02) - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw AbstractC58321PtD.A10();
    }
}
