package X;

import android.view.View;

/* renamed from: X.Amf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24094Amf implements InterfaceC125355lh {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public C24094Amf(View view, InterfaceC16820sZ interfaceC16820sZ, float f) {
        this.A00 = f;
        this.A02 = interfaceC16820sZ;
        this.A01 = view;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        AbstractC141496aS.A00(this.A01, this.A02, this.A00);
    }
}
