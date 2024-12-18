package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08310bt {
    public static InterfaceC08350bx A00;
    public static final C0LO A01;
    public static final InterfaceC08350bx A02;
    public static final InterfaceC08350bx A03 = new InterfaceC08350bx() { // from class: X.0MJ
        @Override // X.InterfaceC08350bx
        public final C08340bw[] AvJ() {
            return new C08340bw[0];
        }

        @Override // X.InterfaceC08350bx
        public final C08320bu[] BIq() {
            return new C08320bu[0];
        }

        @Override // X.InterfaceC08350bx
        public final boolean EiH() {
            return false;
        }
    };

    static {
        InterfaceC08350bx interfaceC08350bx = new InterfaceC08350bx() { // from class: X.0Ls
            @Override // X.InterfaceC08350bx
            public final C08340bw[] AvJ() {
                return C08310bt.A03().AvJ();
            }

            @Override // X.InterfaceC08350bx
            public final C08320bu[] BIq() {
                return C08310bt.A03().BIq();
            }

            @Override // X.InterfaceC08350bx
            public final boolean EiH() {
                return C08310bt.A03().EiH();
            }
        };
        A02 = interfaceC08350bx;
        A01 = new C0LO(interfaceC08350bx);
    }

    public static SharedPreferences A00(Context context) {
        if (context.isDeviceProtectedStorage()) {
            return A01(context);
        }
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        if (createDeviceProtectedStorageContext == null) {
            return null;
        }
        SharedPreferences A012 = A01(createDeviceProtectedStorageContext);
        if (A012 != null && !A012.getAll().isEmpty()) {
            return A012;
        }
        if (createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, "com.facebook.secure.switchoff")) {
            A012 = A01(createDeviceProtectedStorageContext);
        }
        if (A012 == null) {
            return A012;
        }
        A012.edit().putInt("marker", 1).apply();
        return A012;
    }

    public static SharedPreferences A01(Context context) {
        try {
            return context.getSharedPreferences("com.facebook.secure.switchoff", 0);
        } catch (Throwable th) {
            android.util.Log.w("DefaultSwitchOffs", "Could not load SharedPreferences", th);
            return null;
        }
    }

    public static synchronized C0LO A02() {
        C0LO c0lo;
        synchronized (C08310bt.class) {
            c0lo = A01;
        }
        return c0lo;
    }

    public static synchronized InterfaceC08350bx A03() {
        InterfaceC08350bx interfaceC08350bx;
        synchronized (C08310bt.class) {
            interfaceC08350bx = A00;
            if (interfaceC08350bx == null) {
                throw new IllegalStateException();
            }
        }
        return interfaceC08350bx;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0091 A[Catch: IOException | IllegalArgumentException -> 0x00ca, all -> 0x0155, TRY_LEAVE, TryCatch #4 {IOException | IllegalArgumentException -> 0x00ca, blocks: (B:16:0x0031, B:18:0x003c, B:41:0x0040, B:43:0x004b, B:45:0x0053, B:46:0x0058, B:47:0x00b2, B:47:0x00b2, B:48:0x005b, B:56:0x00b5, B:56:0x00b5, B:70:0x00c9, B:70:0x00c9, B:59:0x0084, B:60:0x0089, B:63:0x00ac, B:63:0x00ac, B:64:0x0091, B:66:0x0096, B:66:0x0096, B:69:0x00c2, B:69:0x00c2, B:71:0x0070, B:73:0x0076, B:77:0x00bb, B:77:0x00bb), top: B:15:0x0031, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A04(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08310bt.A04(android.content.Context):void");
    }
}
