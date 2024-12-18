package X;

import java.util.LinkedList;

/* renamed from: X.0ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19110ws implements InterfaceC14020nS {
    public static final C19110ws A02 = new C19110ws();
    public boolean A00;
    public final LinkedList A01 = new LinkedList();

    @Override // X.InterfaceC14020nS
    public final synchronized void ATO(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        if (this.A00) {
            C14120nc.A00().ATO(abstractRunnableC14200nk);
        } else {
            this.A01.addLast(abstractRunnableC14200nk);
        }
    }

    @Override // X.InterfaceC14020nS
    public final void ATN(C14160ng c14160ng) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
