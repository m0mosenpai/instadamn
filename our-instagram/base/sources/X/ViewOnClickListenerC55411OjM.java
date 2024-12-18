package X;

import android.view.View;
import java.util.Map;

/* renamed from: X.OjM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55411OjM implements View.OnClickListener {
    public final /* synthetic */ InterfaceC55362gb A00;
    public final /* synthetic */ C4NJ A01;
    public final /* synthetic */ C66082yk A02;
    public final /* synthetic */ Map A03;

    public ViewOnClickListenerC55411OjM(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, C66082yk c66082yk, Map map) {
        this.A01 = c4nj;
        this.A02 = c66082yk;
        this.A00 = interfaceC55362gb;
        this.A03 = map;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1443417266);
        C4NJ c4nj = this.A01;
        C4NV c4nv = c4nj.A08.A02;
        if (this.A02.A00 && c4nv != null && c4nv.A04) {
            this.A00.Dcp(c4nj);
        } else {
            this.A00.Dco(c4nj, C05F.A0C, this.A03);
        }
        C0f9.A0C(1932220306, A05);
    }
}
