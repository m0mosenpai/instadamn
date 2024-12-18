package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.ANj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC23144ANj implements DialogInterface.OnClickListener {
    public final /* synthetic */ C189588ad A00;

    public DialogInterfaceOnClickListenerC23144ANj(C189588ad c189588ad) {
        this.A00 = c189588ad;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C189588ad c189588ad = this.A00;
        Context context = c189588ad.getContext();
        if (context != null) {
            SimpleWebViewActivity.A02.A02(context, c189588ad.getSession(), new SimpleWebViewConfig(new SXK("https://help.instagram.com/476003390920140")));
        }
    }
}
