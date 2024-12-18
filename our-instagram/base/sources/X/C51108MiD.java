package X;

import android.content.Context;

/* renamed from: X.MiD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51108MiD extends C110814yt {
    public final InterfaceC16820sZ A00;

    public C51108MiD(Context context, InterfaceC16820sZ interfaceC16820sZ) {
        super(context);
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.C110814yt, X.AbstractC110824yu
    public final void A02() {
        super.A02();
        InterfaceC16820sZ interfaceC16820sZ = this.A00;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }

    @Override // X.C110814yt
    public final int A0B(int i, int i2, int i3, int i4, int i5) {
        return AbstractC50522MSa.A04(i4, i3, i2, i);
    }
}
