package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.google.ar.core.dependencies.c;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.SNu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62730SNu {
    public Context A00;
    public ILoadedInstanceCreator A01;
    public final C62742SOj A02;

    public C62730SNu(C62742SOj c62742SOj) {
        this.A02 = c62742SOj;
    }

    public final synchronized Context A00(Context context) {
        Context context2;
        context2 = this.A00;
        if (context2 == null) {
            try {
                context2 = context.createPackageContext(this.A02.A00, 3);
                this.A00 = context2;
            } catch (PackageManager.NameNotFoundException unused) {
                throw new Exception();
            }
        }
        return context2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.google.ar.core.dependencies.c] */
    public final synchronized ILoadedInstanceCreator A01(Context context) {
        ILoadedInstanceCreator iLoadedInstanceCreator;
        ILoadedInstanceCreator iLoadedInstanceCreator2;
        ILoadedInstanceCreator iLoadedInstanceCreator3 = this.A01;
        iLoadedInstanceCreator = iLoadedInstanceCreator3;
        if (iLoadedInstanceCreator3 == null) {
            try {
                try {
                    try {
                        try {
                            try {
                                IBinder iBinder = (IBinder) AbstractC58320PtC.A0t(A00(context).getClassLoader().loadClass("com.google.vr.dynamite.LoadedInstanceCreator"));
                                if (iBinder == null) {
                                    iLoadedInstanceCreator2 = null;
                                } else {
                                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                                    if (queryLocalInterface instanceof ILoadedInstanceCreator) {
                                        iLoadedInstanceCreator2 = (ILoadedInstanceCreator) queryLocalInterface;
                                    } else {
                                        ?? cVar = new c("com.google.vr.dynamite.client.ILoadedInstanceCreator", iBinder);
                                        C0f9.A0A(1993359244, C0f9.A03(578768120));
                                        iLoadedInstanceCreator2 = cVar;
                                    }
                                }
                                this.A01 = iLoadedInstanceCreator2;
                                iLoadedInstanceCreator = iLoadedInstanceCreator2;
                            } catch (IllegalAccessException e) {
                                throw new IllegalStateException("Unable to call the default constructor of ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e);
                            }
                        } catch (InstantiationException e2) {
                            throw new IllegalStateException("Unable to instantiate the remote class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e2);
                        }
                    } catch (InvocationTargetException e3) {
                        throw new IllegalStateException("Unable to invoke constructor of dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e3);
                    }
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException("Unable to find dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e4);
                }
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException("No constructor for dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e5);
            }
        }
        return iLoadedInstanceCreator;
    }
}
