package X;

import java.util.Iterator;

/* renamed from: X.TIq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64534TIq implements Iterable {
    public final /* synthetic */ C58619Pyn A00;
    public final /* synthetic */ CharSequence A01;

    public C64534TIq(final C58619Pyn this$0, final CharSequence val$sequence) {
        this.A00 = this$0;
        this.A01 = val$sequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C58619Pyn c58619Pyn = this.A00;
        return new RPa(c58619Pyn.A01, c58619Pyn, this.A01);
    }

    public final String toString() {
        C71473Il c71473Il = new C71473Il(", ");
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('[');
        c71473Il.A03(A1C, iterator());
        return AbstractC58320PtC.A14(A1C);
    }
}
