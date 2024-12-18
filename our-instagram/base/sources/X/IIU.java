package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import java.util.HashSet;

/* loaded from: classes7.dex */
public final class IIU {
    public final AdsProductPageFragment A00;
    public final C42274Iny A01;
    public final IJH A02;
    public final HashSet A03;

    public IIU(Context context, AbstractC018607g abstractC018607g, UserSession userSession, AdsProductPageFragment adsProductPageFragment) {
        C14360o3.A0B(userSession, 2);
        long j = C42274Iny.A04;
        C42274Iny A00 = I93.A00(userSession);
        IJH ijh = new IJH(context, userSession, new C61972ry(context, abstractC018607g, null));
        C14360o3.A0B(A00, 1);
        this.A01 = A00;
        this.A02 = ijh;
        this.A00 = adsProductPageFragment;
        this.A03 = AbstractC166987dD.A1H();
    }
}
