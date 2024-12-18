package X;

import java.lang.reflect.Constructor;

/* renamed from: X.SCr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62464SCr {
    public static C62464SCr A01;
    public Constructor A00;

    public C62464SCr() {
        try {
            Constructor<?> constructor = Class.forName("android.app.RemoteServiceException").getConstructor(String.class);
            this.A00 = constructor;
            constructor.setAccessible(true);
        } catch (Throwable unused) {
            this.A00 = null;
        }
    }
}
