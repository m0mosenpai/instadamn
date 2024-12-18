package X;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.6tO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152386tO extends AbstractC61592rM implements InterfaceC52932ba {
    public Application A00;
    public Bundle A01;
    public C07T A02;
    public C08U A03;
    public final InterfaceC52932ba A04;

    @Override // X.AbstractC61592rM
    public final void A01(AbstractC52922bZ abstractC52922bZ) {
        C14360o3.A0B(abstractC52922bZ, 0);
        C07T c07t = this.A02;
        if (c07t != null) {
            C08U c08u = this.A03;
            C14360o3.A0A(c08u);
            C89U.A00(c07t, abstractC52922bZ, c08u);
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.2cS, java.lang.Object] */
    public final AbstractC52922bZ A02(Class cls, String str) {
        List list;
        Object[] objArr;
        Application application;
        C07T c07t = this.A02;
        if (c07t != null) {
            boolean isAssignableFrom = C193578hc.class.isAssignableFrom(cls);
            if (isAssignableFrom && this.A00 != null) {
                list = AbstractC152396tP.A00;
            } else {
                list = AbstractC152396tP.A01;
            }
            Constructor A01 = AbstractC152396tP.A01(cls, list);
            if (A01 == null) {
                if (this.A00 != null) {
                    return this.A04.create(cls);
                }
                C53442cS c53442cS = C53442cS.A00;
                C53442cS c53442cS2 = c53442cS;
                if (c53442cS == null) {
                    ?? obj = new Object();
                    C53442cS.A00 = obj;
                    c53442cS2 = obj;
                }
                C14360o3.A0A(c53442cS2);
                return c53442cS2.create(cls);
            }
            C08U c08u = this.A03;
            C14360o3.A0A(c08u);
            Bundle bundle = this.A01;
            C14360o3.A0B(c08u, 0);
            C89V c89v = new C89V(RrA.A00(c08u.A00(str), bundle), str);
            c89v.A00(c07t, c08u);
            C89U.A01(c07t, c08u);
            if (isAssignableFrom && (application = this.A00) != null) {
                objArr = new Object[]{application, c89v.A01};
            } else {
                objArr = new Object[]{c89v.A01};
            }
            AbstractC52922bZ A00 = AbstractC152396tP.A00(cls, A01, objArr);
            A00.addCloseable("androidx.lifecycle.savedstate.vm.tag", c89v);
            return A00;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return A02(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C152386tO(Application application, Bundle bundle, InterfaceC08430c6 interfaceC08430c6) {
        C53432cR c53432cR;
        this.A03 = interfaceC08430c6.getSavedStateRegistry();
        this.A02 = interfaceC08430c6.getLifecycle();
        this.A01 = bundle;
        this.A00 = application;
        if (application != null) {
            c53432cR = C53432cR.A01;
            if (c53432cR == null) {
                c53432cR = new C53432cR(application);
                C53432cR.A01 = c53432cR;
            }
            C14360o3.A0A(c53432cR);
        } else {
            c53432cR = new C53432cR();
        }
        this.A04 = c53432cR;
    }

    public C152386tO() {
        this.A04 = new C53432cR();
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        List list;
        Object[] objArr;
        C14360o3.A0B(cls, 0);
        C14360o3.A0B(abstractC52972be, 1);
        String str = (String) abstractC52972be.A00(C53442cS.A01);
        if (str != null) {
            if (abstractC52972be.A00(AbstractC51872Zl.A01) != null && abstractC52972be.A00(AbstractC51872Zl.A02) != null) {
                Object A00 = abstractC52972be.A00(C53432cR.A02);
                boolean isAssignableFrom = C193578hc.class.isAssignableFrom(cls);
                if (isAssignableFrom && A00 != null) {
                    list = AbstractC152396tP.A00;
                } else {
                    list = AbstractC152396tP.A01;
                }
                Constructor A01 = AbstractC152396tP.A01(cls, list);
                if (A01 == null) {
                    return this.A04.create(cls, abstractC52972be);
                }
                if (isAssignableFrom && A00 != null) {
                    objArr = new Object[]{A00, AbstractC51872Zl.A00(abstractC52972be)};
                } else {
                    objArr = new Object[]{AbstractC51872Zl.A00(abstractC52972be)};
                }
                return AbstractC152396tP.A00(cls, A01, objArr);
            }
            if (this.A02 != null) {
                return A02(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }
}
