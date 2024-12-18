package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.07T, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C07T {
    public AtomicReference A00 = new AtomicReference(null);

    public abstract C07S A07();

    public abstract void A09(C07W c07w);

    public abstract void A0A(C07W c07w);

    public AnonymousClass059 A08() {
        final C008002u A00 = C10E.A00(A07());
        A09(new InterfaceC09670ek() { // from class: X.0ir
            @Override // X.InterfaceC09670ek
            public final void DoQ(C07R c07r, C07X c07x) {
                C05A c05a = C05A.this;
                C14360o3.A0B(c05a, 0);
                C14360o3.A0B(c07r, 2);
                c05a.Egh(c07r.A00());
            }
        });
        return new AnonymousClass059(null, A00);
    }
}
