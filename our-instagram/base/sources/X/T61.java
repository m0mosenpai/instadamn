package X;

/* loaded from: classes10.dex */
public final class T61 implements InterfaceC65412Tjj {
    public final C72767Xmj A00;
    public final Object A01;

    public T61(C72767Xmj c72767Xmj, Object obj) {
        this.A01 = obj;
        this.A00 = c72767Xmj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Rjv, java.lang.Exception] */
    @Override // X.InterfaceC65412Tjj
    public final Object FFc() {
        if (AbstractC62367S8r.A01 == null) {
            AbstractC62367S8r.A01 = new Exception();
        }
        synchronized (AbstractC62367S8r.A00) {
        }
        throw AbstractC166987dD.A14("Must call PhenotypeContext.setContext() first");
    }
}
