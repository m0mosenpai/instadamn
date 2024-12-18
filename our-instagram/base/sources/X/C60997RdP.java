package X;

import dalvik.system.PathClassLoader;

/* renamed from: X.RdP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60997RdP extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
