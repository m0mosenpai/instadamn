package X;

import android.os.SystemClock;

/* renamed from: X.PcV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57309PcV extends C0YY implements InterfaceC16820sZ {
    public static final C57309PcV A00 = new C57309PcV();

    public C57309PcV() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
