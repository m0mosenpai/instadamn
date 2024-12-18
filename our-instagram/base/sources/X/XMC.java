package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes12.dex */
public final class XMC implements View.OnClickListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C87173ua A01;

    public XMC(TextView textView, C87173ua c87173ua) {
        this.A01 = c87173ua;
        this.A00 = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(861318452);
        InterfaceC16660sJ interfaceC16660sJ = this.A01.A00.A03;
        Context context = this.A00.getContext();
        C14360o3.A07(context);
        interfaceC16660sJ.invoke(context);
        C0f9.A0C(359234333, A05);
    }
}
