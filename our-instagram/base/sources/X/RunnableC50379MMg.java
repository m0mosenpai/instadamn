package X;

/* renamed from: X.MMg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50379MMg extends C1UX implements Runnable {
    public final long A00;

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.A00;
        AbstractC89993zf.A04(((AbstractC23681Dy) this).A00);
        A0T(new C902540k(AnonymousClass001.A0e(AbstractC111324zv.A00(1820), " ms", j), this));
    }

    public RunnableC50379MMg(InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(interfaceC23621Ds, interfaceC23621Ds.getContext());
        this.A00 = j;
    }

    @Override // X.AbstractC23681Dy, X.AnonymousClass198
    public final String A0G() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.A0G());
        A1C.append("(timeMillis=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
