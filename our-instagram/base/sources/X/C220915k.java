package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.15k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C220915k {
    public static C220915k A03;
    public final Context A00;
    public final C0h7 A01;
    public final InterfaceC08830cm A02;

    public static C220915k A00() {
        C220915k c220915k = A03;
        boolean z = false;
        if (c220915k != null) {
            z = true;
        }
        C0J8.A09(z, "Call FixieReflectionConfig.init() first");
        return c220915k;
    }

    public final C0f5 A01(String str) {
        return ((C0f6) this.A02.get()).AEq(true, str, 817901561);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0gv, X.0h7, java.lang.Object] */
    public C220915k(Context context, InterfaceC08830cm interfaceC08830cm) {
        this.A00 = context;
        this.A02 = interfaceC08830cm;
        InterfaceC08830cm interfaceC08830cm2 = new InterfaceC08830cm() { // from class: X.15l
            @Override // X.InterfaceC08830cm
            public final Object get() {
                Context context2 = C220915k.this.A00;
                boolean z = false;
                if (Thread.currentThread().getId() != 0) {
                    z = true;
                }
                C0J8.A09(z, "Do NOT call on the main thread");
                String[] strArr = {"org.chromium.arc", "org.chromium.arc.device_management"};
                PackageManager packageManager = context2.getPackageManager();
                boolean z2 = false;
                if (packageManager != null) {
                    int i = 0;
                    while (true) {
                        if (packageManager.hasSystemFeature(strArr[i])) {
                            z2 = true;
                            break;
                        }
                        i++;
                        if (i >= 2) {
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        };
        ?? obj = new Object();
        obj.A00 = interfaceC08830cm2;
        this.A01 = obj;
    }
}
