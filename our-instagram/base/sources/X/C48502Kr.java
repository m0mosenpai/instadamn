package X;

import android.content.Context;
import java.util.HashSet;

/* renamed from: X.2Kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48502Kr {
    public final Context A00;

    public C48502Kr(Context context) {
        this.A00 = context;
    }

    public final java.util.Set A00() {
        java.util.Set<String> hashSet;
        synchronized (C48502Kr.class) {
            try {
                hashSet = this.A00.getSharedPreferences("playcore_split_install_internal", 0).getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }
}
