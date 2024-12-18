package X;

import android.view.View;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Oj7 implements View.OnClickListener {
    public final /* synthetic */ InterfaceC55362gb A00;
    public final /* synthetic */ C4NJ A01;
    public final /* synthetic */ Map A02;

    public Oj7(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, Map map) {
        this.A00 = interfaceC55362gb;
        this.A01 = c4nj;
        this.A02 = map;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-796329528);
        InterfaceC55362gb interfaceC55362gb = this.A00;
        if (interfaceC55362gb != null) {
            interfaceC55362gb.Dco(this.A01, C05F.A01, this.A02);
        }
        C0f9.A0C(-2024930380, A05);
    }
}
