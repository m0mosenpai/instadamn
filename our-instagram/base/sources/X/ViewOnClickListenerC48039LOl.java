package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LOl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48039LOl implements View.OnClickListener {
    public final /* synthetic */ C163117Rw A00;
    public final /* synthetic */ C44734JrH A01;

    public ViewOnClickListenerC48039LOl(C163117Rw c163117Rw, C44734JrH c44734JrH) {
        this.A00 = c163117Rw;
        this.A01 = c44734JrH;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-259533308);
        C163117Rw c163117Rw = this.A00;
        MessageIdentifier messageIdentifier = c163117Rw.A01;
        if (messageIdentifier != null) {
            C44734JrH c44734JrH = this.A01;
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            C7ZX c7zx = c44734JrH.A04;
            if (c7zx != null) {
                c7zx.F81(messageIdentifier, c163117Rw.A04);
            }
            view.performHapticFeedback(3);
            c44734JrH.A03.A00(messageIdentifier.A01, c163117Rw.A03);
        }
        C0f9.A0C(1905884232, A05);
    }
}
