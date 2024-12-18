package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.Jrq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC44769Jrq extends C3OO implements View.OnClickListener {
    public InterfaceC16820sZ A00;
    public final TextView A01;

    public ViewOnClickListenerC44769Jrq(TextView textView) {
        super(textView);
        this.A01 = textView;
        int A02 = AbstractC43593JPy.A02(AbstractC37301Gc2.A03(this), 40);
        C0fQ.A00(this, textView);
        textView.setGravity(17);
        textView.setMinHeight(A02);
        textView.setMinWidth(A02);
        textView.setLayoutParams(new C3OP(-1, -1));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1883574400);
        InterfaceC16820sZ interfaceC16820sZ = this.A00;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        C0f9.A0C(867964175, A05);
    }
}
