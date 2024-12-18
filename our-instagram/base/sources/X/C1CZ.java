package X;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: X.1CZ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1CZ {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1Cb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Ca, java.lang.Object] */
    public static C23411Cd A00(final Context context, InterfaceC08830cm interfaceC08830cm) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        return new C23411Cd(telephonyManager, new Object(), new Object(), interfaceC08830cm, new InterfaceC08830cm() { // from class: X.1Cc
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return C100004eN.A00(context);
            }
        });
    }
}
