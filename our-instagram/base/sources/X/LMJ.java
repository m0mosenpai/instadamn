package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* loaded from: classes8.dex */
public final class LMJ implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public LMJ(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                UserSession userSession = (UserSession) this.A02;
                VRC.A00(userSession).A08("promotion_list", "view_appeal", this.A04, null);
                C63397SjR A0y = AbstractC25228BEl.A0y((Context) this.A01, userSession, C2Fb.A35, this.A03);
                A0y.A0S = "promote_ads_manager_fragment";
                A0y.A0A();
                return;
            case 1:
                Context context = (Context) this.A01;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                String str = this.A03;
                String str2 = this.A04;
                SXK sxk = new SXK(str);
                sxk.A02 = str2;
                SimpleWebViewActivity.A00(context, abstractC12990ll, new SimpleWebViewConfig(sxk));
                return;
            default:
                C3KX.A04((Reel) this.A01, (C3KX) this.A02, this.A03);
                return;
        }
    }
}
