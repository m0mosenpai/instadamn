package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LOk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48038LOk implements View.OnClickListener {
    public final /* synthetic */ C163137Ry A00;
    public final /* synthetic */ C44733JrG A01;

    public ViewOnClickListenerC48038LOk(C163137Ry c163137Ry, C44733JrG c44733JrG) {
        this.A00 = c163137Ry;
        this.A01 = c44733JrG;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1523739566);
        C163137Ry c163137Ry = this.A00;
        MessageIdentifier messageIdentifier = c163137Ry.A03;
        if (messageIdentifier != null) {
            C44733JrG c44733JrG = this.A01;
            C7ZX c7zx = c44733JrG.A04;
            if (c7zx != null) {
                c7zx.EkI(c163137Ry.A02, messageIdentifier, "multi_react_pill", c163137Ry.A00, c163137Ry.A05);
            }
            view.performHapticFeedback(3);
            AbstractC13880nE.A0O(view);
            C7RB c7rb = c44733JrG.A03;
            String str = messageIdentifier.A01;
            String str2 = c163137Ry.A04;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c7rb.A00, "direct_message_multi_react_add_pill");
            if (A0f.isSampled()) {
                AbstractC31171DnF.A1C(A0f, "tap");
                A0f.AAP("message_id", str);
                AbstractC31171DnF.A1H(A0f, str2);
                A0f.Cht();
            }
        }
        C0f9.A0C(421583386, A05);
    }
}
