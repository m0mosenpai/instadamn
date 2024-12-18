package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.XNf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ViewOnClickListenerC72086XNf implements View.OnClickListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C87173ua A01;

    public ViewOnClickListenerC72086XNf(TextView textView, C87173ua c87173ua) {
        this.A01 = c87173ua;
        this.A00 = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(81875544);
        InterfaceC16660sJ interfaceC16660sJ = this.A01.A00.A08;
        Context context = this.A00.getContext();
        C14360o3.A07(context);
        interfaceC16660sJ.invoke(context);
        C0f9.A0C(1413927507, A05);
    }
}
