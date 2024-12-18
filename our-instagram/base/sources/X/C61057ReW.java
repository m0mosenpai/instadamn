package X;

import com.google.firebase.iid.zzm;

/* renamed from: X.ReW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61057ReW extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
            android.util.Log.isLoggable("FirebaseInstanceId", 3);
            return zzm.class;
        }
        return super.loadClass(str, z);
    }
}
