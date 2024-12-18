package X;

import android.content.Context;

/* loaded from: classes4.dex */
public final class AVK implements YPH {
    public final float A00;
    public final InterfaceC199678sJ A01;

    @Override // X.YPH
    public final float Awk() {
        return this.A00;
    }

    @Override // X.YPH
    public final int getHeight() {
        return this.A01.BI0();
    }

    @Override // X.YPH
    public final int getWidth() {
        return this.A01.BIB();
    }

    public AVK(Context context, InterfaceC199678sJ interfaceC199678sJ) {
        this.A01 = interfaceC199678sJ;
        this.A00 = AbstractC167007dF.A0K(context).density;
    }
}
