package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OOv {
    public static final void A01(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A07(layoutParams);
        if (z) {
            view.setVisibility(0);
            layoutParams.height = -2;
        } else {
            view.setVisibility(8);
            layoutParams.height = 0;
        }
        view.setLayoutParams(layoutParams);
    }

    public static final EnumC53171NfS A00(UserSession userSession, EnumC76383bi enumC76383bi) {
        boolean A1X = AbstractC167007dF.A1X(MSZ.A0i(userSession), C05F.A0C);
        if (enumC76383bi == EnumC76383bi.A04) {
            return EnumC53171NfS.A02;
        }
        if (enumC76383bi == EnumC76383bi.A0C) {
            return EnumC53171NfS.A05;
        }
        if (enumC76383bi == EnumC76383bi.A07) {
            return EnumC53171NfS.A04;
        }
        if (A1X) {
            return EnumC53171NfS.A06;
        }
        return EnumC53171NfS.A03;
    }
}
