package X;

import android.os.SystemClock;

/* renamed from: X.Pe8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57410Pe8 extends C0YY implements InterfaceC16820sZ {
    public static final C57410Pe8 A00 = new C57410Pe8();

    public C57410Pe8() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
