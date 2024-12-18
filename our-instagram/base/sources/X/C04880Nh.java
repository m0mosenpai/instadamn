package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.0Nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04880Nh extends C0YY implements InterfaceC16820sZ {
    public static final C04880Nh A00 = new C04880Nh();

    public C04880Nh() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        QuickPerformanceLogger quickPerformanceLogger = AbstractC12110kF.A00;
        if (quickPerformanceLogger == null) {
            C14360o3.A0F("internalLogger");
            throw C00O.createAndThrow();
        }
        return quickPerformanceLogger;
    }
}
