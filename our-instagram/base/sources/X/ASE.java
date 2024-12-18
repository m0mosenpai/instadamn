package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ASE implements View.OnClickListener {
    public final /* synthetic */ C87183ub A00;
    public final /* synthetic */ C87023uI A01;
    public final /* synthetic */ C15370ps A02;

    public ASE(C87183ub c87183ub, C87023uI c87023uI, C15370ps c15370ps) {
        this.A02 = c15370ps;
        this.A00 = c87183ub;
        this.A01 = c87023uI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1891213827);
        C14360o3.A0B(view, 0);
        C71313Hs c71313Hs = (C71313Hs) this.A02.A00;
        if (c71313Hs != null) {
            c71313Hs.A0B(view, new String[0]);
        }
        ((InterfaceC16660sJ) this.A00.A00.A05).invoke(this.A01.A01);
        C0f9.A0C(543835843, A05);
    }
}
