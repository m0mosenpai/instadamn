package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class TH4 implements MQM {
    public final /* synthetic */ Rb2 A00;

    public TH4(Rb2 rb2) {
        this.A00 = rb2;
    }

    @Override // X.MQM
    public final void DLE(Integer num) {
        AbstractC63248Sg4.A03(this.A00);
    }

    @Override // X.MQM
    public final void DLF() {
        Rb2 rb2 = this.A00;
        Context context = rb2.A00;
        C14360o3.A0A(context);
        UserSession userSession = rb2.A08;
        C14360o3.A0A(userSession);
        rb2.requireActivity();
        AbstractC10360h2 abstractC10360h2 = rb2.A07;
        C14360o3.A0A(abstractC10360h2);
        FYS.A01(context, abstractC10360h2, userSession);
    }
}
