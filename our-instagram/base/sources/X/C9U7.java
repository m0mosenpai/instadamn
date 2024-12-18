package X;

import android.os.Bundle;

/* renamed from: X.9U7, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9U7 extends AbstractC61592rM implements InterfaceC52932ba {
    public Bundle A00;
    public C07T A01;
    public C08U A02;

    @Override // X.AbstractC61592rM
    public final void A01(AbstractC52922bZ abstractC52922bZ) {
        C14360o3.A0B(abstractC52922bZ, 0);
        C08U c08u = this.A02;
        if (c08u != null) {
            C07T c07t = this.A01;
            C14360o3.A0A(c07t);
            C89U.A00(c07t, abstractC52922bZ, c08u);
        }
    }

    public abstract AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str);

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.A01 != null) {
                return A00(cls, canonicalName);
            }
            throw AbstractC166987dD.A1D("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(3664));
    }

    private final AbstractC52922bZ A00(Class cls, String str) {
        C08U c08u = this.A02;
        C14360o3.A0A(c08u);
        C07T c07t = this.A01;
        C14360o3.A0A(c07t);
        Bundle bundle = this.A00;
        AbstractC167017dG.A1N(c08u, c07t);
        C89V c89v = new C89V(RrA.A00(c08u.A00(str), bundle), str);
        c89v.A00(c07t, c08u);
        C89U.A01(c07t, c08u);
        AbstractC52922bZ A02 = A02(c89v.A01, cls, str);
        A02.addCloseable("androidx.lifecycle.savedstate.vm.tag", c89v);
        return A02;
    }

    public C9U7(Bundle bundle, InterfaceC08430c6 interfaceC08430c6) {
        this.A02 = interfaceC08430c6.getSavedStateRegistry();
        this.A01 = interfaceC08430c6.getLifecycle();
        this.A00 = bundle;
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        AbstractC167017dG.A1N(cls, abstractC52972be);
        String str = (String) abstractC52972be.A00(C53442cS.A01);
        if (str != null) {
            if (this.A02 != null) {
                return A00(cls, str);
            }
            return A02(AbstractC51872Zl.A00(abstractC52972be), cls, str);
        }
        throw AbstractC166987dD.A14(AbstractC111324zv.A00(3813));
    }
}
