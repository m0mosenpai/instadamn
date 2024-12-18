package X;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.2cR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C53432cR extends C53442cS {
    public static C53432cR A01;
    public static final InterfaceC51892Zn A02 = new InterfaceC51892Zn() { // from class: X.2cT
    };
    public final Application A00;

    @Override // X.C53442cS, X.InterfaceC52932ba
    public AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        Application application = this.A00;
        if (application != null) {
            return A00(application, cls);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    private final AbstractC52922bZ A00(Application application, Class cls) {
        if (C193578hc.class.isAssignableFrom(cls)) {
            try {
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) cls.getConstructor(Application.class).newInstance(application);
                C14360o3.A05(abstractC52922bZ);
                return abstractC52922bZ;
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot create an instance of ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (InstantiationException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot create an instance of ");
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            } catch (NoSuchMethodException e3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Cannot create an instance of ");
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3);
            } catch (InvocationTargetException e4) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Cannot create an instance of ");
                sb4.append(cls);
                throw new RuntimeException(sb4.toString(), e4);
            }
        }
        return AbstractC152416tR.A00(cls);
    }

    public C53432cR(Application application) {
        this.A00 = application;
    }

    public C53432cR() {
        this.A00 = null;
    }

    @Override // X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 0);
        C14360o3.A0B(abstractC52972be, 1);
        if (this.A00 != null) {
            return create(cls);
        }
        Application application = (Application) abstractC52972be.A00(A02);
        if (application != null) {
            return A00(application, cls);
        }
        if (!C193578hc.class.isAssignableFrom(cls)) {
            return AbstractC152416tR.A00(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }
}
