package X;

import android.content.DialogInterface;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.ANt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC23154ANt implements DialogInterface.OnClickListener {
    public final /* synthetic */ C8JT A00;

    public DialogInterfaceOnClickListenerC23154ANt(C8JT c8jt) {
        this.A00 = c8jt;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C35133Fea c35133Fea = SimpleWebViewActivity.A02;
        C8JT c8jt = this.A00;
        c35133Fea.A02(c8jt.A11, c8jt.A1D, new SimpleWebViewConfig(new SXK("https://help.instagram.com/476003390920140")));
    }
}
