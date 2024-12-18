package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.ANw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC23157ANw implements DialogInterface.OnClickListener {
    public final /* synthetic */ C191478dz A00;

    public DialogInterfaceOnClickListenerC23157ANw(C191478dz c191478dz) {
        this.A00 = c191478dz;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C35133Fea c35133Fea = SimpleWebViewActivity.A02;
        C191478dz c191478dz = this.A00;
        Context context = c191478dz.A0S;
        UserSession userSession = c191478dz.A0b;
        SXK sxk = new SXK(MSV.A00(51));
        sxk.A02 = context.getString(2131965052);
        c35133Fea.A02(context, userSession, new SimpleWebViewConfig(sxk));
    }
}
