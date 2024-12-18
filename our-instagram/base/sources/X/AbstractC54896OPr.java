package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.OPr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54896OPr {
    public static final void A00(Activity activity, DialogInterface.OnClickListener onClickListener) {
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        AbstractC31172DnG.A1C(activity, A0H, 2131968564);
        AbstractC31173DnH.A16(activity, A0H, 2131968563);
        AbstractC31176DnK.A16(onClickListener, A0H, 2131968948);
    }

    public static final void A01(Context context, FragmentActivity fragmentActivity, UserSession userSession, ArrayList arrayList, boolean z) {
        AbstractC25234BEr.A1P(fragmentActivity, userSession, arrayList);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("enableGeoGating", z);
        A0b.putStringArrayList("selectedRegions", arrayList);
        A0b.putString("settingType", "reel");
        AbstractC27401Ut.getInstance();
        C64501TGn c64501TGn = new C64501TGn(userSession, "IgMediaGeoGatingSettingsApp");
        c64501TGn.A07 = context.getString(2131973624);
        c64501TGn.A00(A0b);
        c64501TGn.EqV(fragmentActivity).A04();
    }
}
