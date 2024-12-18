package X;

/* renamed from: X.10O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10O implements C19D {
    public long A00;
    public final Object A01;
    public final InterfaceC23621Ds A02;
    public final AnonymousClass057 A03;

    @Override // X.C19D
    public final void dispose() {
        AnonymousClass057 anonymousClass057 = this.A03;
        synchronized (anonymousClass057) {
            long j = this.A00;
            if (j >= Math.min(anonymousClass057.A02, anonymousClass057.A03)) {
                Object[] objArr = anonymousClass057.A04;
                C14360o3.A0A(objArr);
                int length = (objArr.length - 1) & ((int) j);
                if (objArr[length] == this) {
                    objArr[length] = C10M.A00;
                    AnonymousClass057.A05(anonymousClass057);
                }
            }
        }
    }

    public C10O(Object obj, InterfaceC23621Ds interfaceC23621Ds, AnonymousClass057 anonymousClass057, long j) {
        this.A03 = anonymousClass057;
        this.A00 = j;
        this.A01 = obj;
        this.A02 = interfaceC23621Ds;
    }
}
