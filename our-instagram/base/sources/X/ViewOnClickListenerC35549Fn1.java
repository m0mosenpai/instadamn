package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Fn1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35549Fn1 implements View.OnClickListener {
    public final /* synthetic */ C163147Rz A00;
    public final /* synthetic */ C31967E2v A01;

    public ViewOnClickListenerC35549Fn1(C163147Rz c163147Rz, C31967E2v c31967E2v) {
        this.A00 = c163147Rz;
        this.A01 = c31967E2v;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7ZX c7zx;
        int A05 = C0f9.A05(922785040);
        C163147Rz c163147Rz = this.A00;
        MessageIdentifier messageIdentifier = c163147Rz.A01;
        if (messageIdentifier != null && (c7zx = this.A01.A02) != null) {
            c7zx.Ekd(messageIdentifier, null, c163147Rz.A03, null, null, null, "comment_pill");
        }
        view.performHapticFeedback(3);
        C0f9.A0C(-264350462, A05);
    }
}
