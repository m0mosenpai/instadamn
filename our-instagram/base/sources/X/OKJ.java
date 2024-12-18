package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes9.dex */
public final class OKJ {
    public final /* synthetic */ NTL A00;

    public OKJ(NTL ntl) {
        this.A00 = ntl;
    }

    public final void A00() {
        NTL ntl = this.A00;
        C51877MwL c51877MwL = ntl.A00;
        if (c51877MwL != null) {
            String str = c51877MwL.A05;
            if (str != null) {
                AbstractC54148Nwk.A00(ntl.A04);
                OXJ.A00(str, 15);
            }
            ntl.A06.A03(new PBZ("Open thread"));
            Context context = ntl.A03;
            C12260kU.A00.A07().A0G(context, AbstractC34770FTt.A01(context, ntl.A04.userId, c51877MwL.A04, null, "via_push_notification", null, null));
        }
    }

    public final void A01(int i) {
        String str;
        NTL ntl = this.A00;
        String A0p = AbstractC166997dE.A0p(ntl.A03, i);
        C51877MwL c51877MwL = ntl.A00;
        if (c51877MwL != null && (str = c51877MwL.A04) != null) {
            AbstractC165967bO.A00(ntl.A04).EOZ(null, new DirectThreadKey(str, null), A0p, NetInfoModule.CONNECTION_TYPE_NONE, null, false);
        }
        A00();
    }
}
