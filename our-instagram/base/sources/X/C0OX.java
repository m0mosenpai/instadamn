package X;

import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0OX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OX {
    public static C0OX A04;
    public static final boolean A05;
    public final C0HB A00;
    public final C0Pe A01;
    public final Map A02 = new HashMap();
    public final AbstractC04410Lh A03;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        }
        A05 = z;
    }

    public C0OX(Context context, C0Pe c0Pe) {
        AbstractC04410Lh abstractC04410Lh = new AbstractC04410Lh() { // from class: X.0hQ
            @Override // X.AbstractC04410Lh, X.C0HV
            public final void DEj(Object obj, String str, Method method, Object[] objArr, long j) {
                C0OW c0ow;
                if (str.equals("activity")) {
                    try {
                        if (method.getName().equals("getContentProvider") && obj != null) {
                            C0OX c0ox = C0OX.this;
                            boolean z = C0OX.A05;
                            char c = 4;
                            if (z) {
                                c = 3;
                            }
                            if (((Boolean) objArr[c]).booleanValue()) {
                                char c2 = 2;
                                if (z) {
                                    c2 = 1;
                                }
                                String str2 = (String) objArr[c2];
                                C0HB c0hb = c0ox.A00;
                                IBinder iBinder = (IBinder) c0hb.A01(obj, "connection");
                                IInterface iInterface = (IInterface) c0hb.A01(obj, "provider");
                                if (iBinder != null && iInterface != null) {
                                    Map map = c0ox.A02;
                                    if (!map.containsKey(iBinder)) {
                                        map.put(iBinder, new C0OW(iBinder, iInterface.asBinder(), c0ox, str2));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (method.getName().equals("removeContentProvider")) {
                            C0OX c0ox2 = C0OX.this;
                            Object obj2 = objArr[0];
                            if (obj2 != null && (c0ow = (C0OW) c0ox2.A02.remove(obj2)) != null) {
                                c0ow.A00.unlinkToDeath(c0ow, 0);
                            }
                        }
                    } catch (Throwable th) {
                        C0PC.A00().DEh("getContentProvider", th, null);
                    }
                }
            }
        };
        this.A03 = abstractC04410Lh;
        this.A00 = C0HB.A00(context.getApplicationContext());
        this.A01 = c0Pe;
        C0HU.A02(context, "activity");
        C0HU.A03(abstractC04410Lh);
    }
}
