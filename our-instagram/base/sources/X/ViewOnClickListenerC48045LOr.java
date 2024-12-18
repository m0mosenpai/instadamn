package X;

import android.view.View;

/* renamed from: X.LOr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48045LOr implements View.OnClickListener {
    public final /* synthetic */ C86773tp A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public ViewOnClickListenerC48045LOr(C86773tp c86773tp, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c86773tp;
        this.A01 = interfaceC16820sZ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(163101390);
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(this.A00.A00);
        AbstractC167007dF.A18(A0x, "zero_rating_feed_video_nux_count", AbstractC31172DnG.A01(A0x, "zero_rating_feed_video_nux_count") + 1);
        this.A01.invoke();
        C0f9.A0C(-1759725822, A05);
    }
}
