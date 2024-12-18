package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.FoE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35623FoE implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C31446Drq A02;
    public final /* synthetic */ InterfaceC132405yL A03;
    public final /* synthetic */ DirectShareTarget A04;
    public final /* synthetic */ String A05;

    public ViewOnClickListenerC35623FoE(C31446Drq c31446Drq, InterfaceC132405yL interfaceC132405yL, DirectShareTarget directShareTarget, String str, int i, int i2) {
        this.A03 = interfaceC132405yL;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = directShareTarget;
        this.A05 = str;
        this.A02 = c31446Drq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1456398419);
        InterfaceC132405yL interfaceC132405yL = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        interfaceC132405yL.Dld(this.A02, this.A04, this.A05, i, i2, -1, 0, 7);
        C0f9.A0C(22186875, A05);
    }
}
