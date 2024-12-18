package X;

/* renamed from: X.Lru, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49361Lru implements InterfaceC71916XAa {
    public final int A00;
    public final Object A01;

    public C49361Lru(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC71916XAa
    public final void DQ1(C46h c46h) {
        Object obj;
        boolean z = c46h instanceof C4JL;
        if (this.A00 != 0) {
            if (z) {
                C143316dW c143316dW = (C143316dW) this.A01;
                C45078Jx7 c45078Jx7 = (C45078Jx7) c46h.A03();
                c143316dW.A05 = c45078Jx7;
                if (c45078Jx7 != null) {
                    c143316dW.A0V.runOnUiThread(new RunnableC49907M2a(c143316dW));
                    return;
                }
                return;
            }
            return;
        }
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
        if (z) {
            obj = c46h.A03();
        } else {
            obj = null;
        }
        interfaceC23621Ds.resumeWith(obj);
    }
}
