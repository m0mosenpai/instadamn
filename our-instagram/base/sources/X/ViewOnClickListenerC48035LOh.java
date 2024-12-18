package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LOh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48035LOh implements View.OnClickListener {
    public final /* synthetic */ InterfaceC164967Zl A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC48035LOh(InterfaceC164967Zl interfaceC164967Zl, String str) {
        this.A00 = interfaceC164967Zl;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1332222747);
        InterfaceC164967Zl interfaceC164967Zl = this.A00;
        if (interfaceC164967Zl != null) {
            interfaceC164967Zl.Eku(new MessageIdentifier(this.A01, null));
        }
        C0f9.A0C(954529466, A05);
    }
}
