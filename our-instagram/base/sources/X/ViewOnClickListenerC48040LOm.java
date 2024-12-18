package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LOm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48040LOm implements View.OnClickListener {
    public final /* synthetic */ C163127Rx A00;
    public final /* synthetic */ C44721Jr4 A01;

    public ViewOnClickListenerC48040LOm(C163127Rx c163127Rx, C44721Jr4 c44721Jr4) {
        this.A01 = c44721Jr4;
        this.A00 = c163127Rx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-1223231621);
        C44721Jr4 c44721Jr4 = this.A01;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C7ZX c7zx = c44721Jr4.A03;
        if (c7zx != null) {
            C163127Rx c163127Rx = this.A00;
            c7zx.DDJ(c163127Rx.A01, c163127Rx.A04);
        }
        view.performHapticFeedback(3);
        C7RB c7rb = c44721Jr4.A02;
        C163127Rx c163127Rx2 = this.A00;
        MessageIdentifier messageIdentifier = c163127Rx2.A01;
        if (messageIdentifier != null) {
            str = messageIdentifier.A01;
        } else {
            str = null;
        }
        c7rb.A00(str, c163127Rx2.A03);
        C0f9.A0C(-1255176276, A05);
    }
}
