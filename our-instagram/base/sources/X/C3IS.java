package X;

import androidx.lifecycle.CoroutineLiveData;

/* renamed from: X.3IS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IS implements C3IT {
    public CoroutineLiveData A00;
    public final C12W A01;

    public C3IS(CoroutineLiveData coroutineLiveData, C12W c12w) {
        C14360o3.A0B(coroutineLiveData, 1);
        C14360o3.A0B(c12w, 2);
        this.A00 = coroutineLiveData;
        C12T c12t = C12P.A00;
        this.A01 = c12w.plus(AnonymousClass131.A00.A06());
    }

    @Override // X.C3IT
    public final Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object A00 = AbstractC23641Du.A00(interfaceC23621Ds, this.A01, new C9D3(this, obj, (InterfaceC23621Ds) null, 9));
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }
}
