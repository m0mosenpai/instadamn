package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.Wdu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70616Wdu implements C97X {
    public final int A00;
    public final Object A01;

    public C70616Wdu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C97X
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        switch (this.A00) {
            case 0:
                C31590DuI c31590DuI = (C31590DuI) obj;
                C14360o3.A0B(c31590DuI, 0);
                V16 v16 = (V16) this.A01;
                C208059Im c208059Im = c31590DuI.A00;
                if (c208059Im != null) {
                    str = c208059Im.A00(V16.A00(), v16.getSession());
                } else {
                    str = null;
                }
                v16.A0P = str;
                return;
            case 1:
                C69093Vhj c69093Vhj = (C69093Vhj) obj;
                C14360o3.A0B(c69093Vhj, 0);
                V16 v162 = (V16) this.A01;
                C208059Im c208059Im2 = c69093Vhj.A01;
                if (c208059Im2 != null) {
                    str2 = c208059Im2.A00(V16.A00(), v162.getSession());
                } else {
                    str2 = null;
                }
                v162.A0L = str2;
                return;
            case 2:
                C31590DuI c31590DuI2 = (C31590DuI) obj;
                C14360o3.A0B(c31590DuI2, 0);
                V15 v15 = (V15) this.A01;
                C208059Im c208059Im3 = c31590DuI2.A00;
                if (c208059Im3 != null) {
                    str3 = c208059Im3.A00(V15.A00(), (UserSession) v15.A0I.getValue());
                } else {
                    str3 = null;
                }
                v15.A0B = String.valueOf(str3);
                return;
            case 3:
                C69093Vhj c69093Vhj2 = (C69093Vhj) obj;
                C14360o3.A0B(c69093Vhj2, 0);
                V15 v152 = (V15) this.A01;
                C208059Im c208059Im4 = c69093Vhj2.A01;
                if (c208059Im4 != null) {
                    str4 = c208059Im4.A00(V15.A00(), (UserSession) v152.A0I.getValue());
                } else {
                    str4 = null;
                }
                v152.A07 = String.valueOf(str4);
                return;
            case 4:
                return;
            case 5:
                W2M w2m = (W2M) obj;
                PromoteData promoteData = ((W6E) this.A01).A03;
                promoteData.A1R = w2m.A00;
                promoteData.A10 = new SimpleImageUrl(w2m.A01);
                return;
            default:
                A9M a9m = (A9M) obj;
                C14360o3.A0B(a9m, 0);
                UFD ufd = (UFD) this.A01;
                C208059Im c208059Im5 = a9m.A00;
                if (c208059Im5 != null) {
                    UserSession userSession = ufd.A01;
                    CallerContext A01 = CallerContext.A01("PromoteCampaignControlsViewModel");
                    C14360o3.A0A(A01);
                    str5 = c208059Im5.A00(new C9CN(A01, "ig_android_promote_ads_manager_ig_to_fb_campaign_controls", "ads_manager", VG4.A05.toString(), "campaign_controls"), userSession);
                } else {
                    str5 = null;
                }
                ufd.A00 = str5;
                return;
        }
    }

    @Override // X.C97X
    public final void onError(Throwable th) {
    }
}
