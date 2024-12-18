package X;

import android.view.View;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.OnFeedMessagesIntf;

/* loaded from: classes11.dex */
public final class WMX implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ V1H A01;
    public final /* synthetic */ String A02;

    public WMX(V1H v1h, String str, long j) {
        this.A01 = v1h;
        this.A00 = j;
        this.A02 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1175510980);
        V1H v1h = this.A01;
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = v1h.A01;
        C65886Tvq c65886Tvq = v1h.A06;
        OnFeedMessagesIntf onFeedMessagesIntf = v1h.A02;
        if (onFeedMessagesIntf != null && c65886Tvq != null && iGCTMessagingAdsInfoDict != null) {
            String str = v1h.A09;
            if (str == null) {
                str = "-1";
            }
            c65886Tvq.A08(str, this.A02, AbstractC76663cE.A00(onFeedMessagesIntf), VTE.A00(iGCTMessagingAdsInfoDict), this.A00);
        }
        C0f9.A0C(1432255666, A05);
    }
}
