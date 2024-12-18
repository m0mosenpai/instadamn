package X;

import android.view.View;

/* renamed from: X.Fmp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35537Fmp implements View.OnClickListener {
    public final /* synthetic */ C7J6 A00;
    public final /* synthetic */ C23031Ai A01;

    public ViewOnClickListenerC35537Fmp(C7J6 c7j6, C23031Ai c23031Ai) {
        this.A01 = c23031Ai;
        this.A00 = c7j6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1559127572);
        AbstractC167007dF.A17(AbstractC166987dD.A0w(this.A01), "direct_thread_video_call_icon_tapped");
        this.A00.DoE(false);
        C0f9.A0C(-163539787, A05);
    }
}
