package X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;

/* renamed from: X.0DX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0DX implements C0JX {
    @Override // X.C0JX
    public final void AHO(String str) {
        C14360o3.A0B(str, 0);
        ClassTracingLogger.beginClassLoad(str);
    }

    @Override // X.C0JX
    public final void AHM(String str, Class cls) {
        C14360o3.A0A(cls);
        ClassTracingLogger.classLoaded(cls);
    }

    @Override // X.C0JX
    public final void AHN(String str) {
        ClassTracingLogger.classNotFound();
    }
}
