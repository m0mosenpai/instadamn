package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.Fmq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35538Fmq implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC148366m6 A01;

    public ViewOnClickListenerC35538Fmq(View view, InterfaceC148366m6 interfaceC148366m6) {
        this.A00 = view;
        this.A01 = interfaceC148366m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(254564271);
        View view2 = this.A00;
        InterfaceC148366m6 interfaceC148366m6 = this.A01;
        View findViewById = view2.findViewById(R.id.nux_banner);
        C14360o3.A0A(findViewById);
        findViewById.setVisibility(8);
        interfaceC148366m6.DWL();
        C0f9.A0C(2022752916, A05);
    }
}
