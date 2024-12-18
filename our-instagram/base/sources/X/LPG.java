package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes8.dex */
public final class LPG implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C3Y8 A01;
    public final /* synthetic */ C86773tp A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    public LPG(Context context, C3Y8 c3y8, C86773tp c86773tp, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = c86773tp;
        this.A00 = context;
        this.A03 = interfaceC16820sZ;
        this.A01 = c3y8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-108716018);
        this.A02.A00(this.A00, this.A03);
        this.A01.A00(EnumC79303gb.A02);
        C0f9.A0C(-1980290086, A05);
    }
}
