package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes12.dex */
public final class XN1 implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C87173ua A01;
    public final /* synthetic */ boolean A02;

    public XN1(Context context, C87173ua c87173ua, boolean z) {
        this.A02 = z;
        this.A01 = c87173ua;
        this.A00 = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC16660sJ interfaceC16660sJ;
        int A05 = C0f9.A05(-1176052323);
        boolean z = this.A02;
        C87163uZ c87163uZ = this.A01.A00;
        if (z) {
            interfaceC16660sJ = c87163uZ.A08;
        } else {
            interfaceC16660sJ = c87163uZ.A03;
        }
        Context context = this.A00;
        C14360o3.A0A(context);
        interfaceC16660sJ.invoke(context);
        C0f9.A0C(1895896984, A05);
    }
}
