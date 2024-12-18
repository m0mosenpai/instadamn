package X;

import android.view.View;

/* renamed from: X.OiT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55362OiT implements View.OnClickListener {
    public final /* synthetic */ C3O0 A00;

    public ViewOnClickListenerC55362OiT(C3O0 c3o0) {
        this.A00 = c3o0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1784946362);
        C3O0 c3o0 = this.A00;
        c3o0.A0D = true;
        C54971OTd c54971OTd = c3o0.A06;
        if (c54971OTd != null) {
            c54971OTd.A02.DhE();
        }
        C3O0.A03(c3o0, true);
        C0f9.A0C(1631987159, A05);
    }
}
