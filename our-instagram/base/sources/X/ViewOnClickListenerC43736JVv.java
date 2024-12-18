package X;

import android.view.View;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.JVv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC43736JVv implements View.OnClickListener {
    public final /* synthetic */ C163107Rv A00;
    public final /* synthetic */ C43740JVz A01;

    public ViewOnClickListenerC43736JVv(C163107Rv c163107Rv, C43740JVz c43740JVz) {
        this.A01 = c43740JVz;
        this.A00 = c163107Rv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-708299178);
        C43740JVz c43740JVz = this.A01;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C7RB c7rb = c43740JVz.A09;
        C163107Rv c163107Rv = this.A00;
        MessageIdentifier messageIdentifier = c163107Rv.A09;
        if (messageIdentifier != null) {
            str = messageIdentifier.A01;
        } else {
            str = null;
        }
        String str2 = c163107Rv.A0C;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c7rb.A00, "direct_message_multi_react_reaction_pill");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, "tap");
            A0f.AAP("message_id", str);
            AbstractC31171DnF.A1H(A0f, str2);
            A0f.Cht();
        }
        C7ZX c7zx = c43740JVz.A0B;
        if (c7zx != null) {
            long j = c163107Rv.A02;
            c7zx.DTC(c163107Rv.A08, messageIdentifier, c163107Rv.A0B, NetInfoModule.CONNECTION_TYPE_NONE, "multi_react_pill", null, j, c163107Rv.A0E, c163107Rv.A0D);
        }
        C0f9.A0C(1014291212, A05);
    }
}
