package X;

import android.os.Handler;

/* renamed from: X.5uO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130185uO implements InterfaceC123265i1 {
    public final /* synthetic */ C96024Tl A00;

    public C130185uO(InterfaceC53292cD interfaceC53292cD, C96024Tl c96024Tl) {
        this.A00 = c96024Tl;
        interfaceC53292cD.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // X.InterfaceC123265i1
    public final void DIP(InterfaceC53292cD interfaceC53292cD, long j, long j2) {
        C96024Tl c96024Tl = this.A00;
        if (this == c96024Tl.A0Q) {
            c96024Tl.A0X();
        }
    }
}
