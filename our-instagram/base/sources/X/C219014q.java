package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.14q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C219014q extends C0YY implements InterfaceC16820sZ {
    public static final C219014q A00 = new C219014q();

    public C219014q() {
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
