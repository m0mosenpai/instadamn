package X;

/* renamed from: X.6Nd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138016Nd {
    public final C57S A00 = new C57S(new C138026Ne[16]);

    public final void A00(Throwable th) {
        C57S c57s = this.A00;
        int i = c57s.A00;
        InterfaceC24901Jp[] interfaceC24901JpArr = new InterfaceC24901Jp[i];
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC24901JpArr[i2] = ((C138026Ne) c57s.A02[i2]).A01;
        }
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC24901JpArr[i3].AGJ(th);
        }
        if (c57s.A00 != 0) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }
}
