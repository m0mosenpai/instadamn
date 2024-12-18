package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes9.dex */
public abstract class OXk {
    public static final void A01(Activity activity, String str) {
        AbstractC167007dF.A1K(activity, str);
        Object systemService = activity.getApplicationContext().getSystemService("clipboard");
        C14360o3.A0C(systemService, AbstractC111324zv.A00(68));
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("VIEW_AR_EFFECT_ID", str));
        if (C9GR.A01(activity, null, 2131953149, 0) == null) {
            C9GR.A07(activity, 2131953150);
        }
    }

    public static final void A00(Activity activity, EffectAttribution effectAttribution, UserSession userSession) {
        AbstractC167017dG.A1O(userSession, activity);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("ar_effect_licensing", effectAttribution);
        AbstractC31173DnH.A1C(A0b, userSession);
        AbstractC25228BEl.A1G(activity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(905));
    }

    public static final void A02(Context context, Integer num, String str) {
        StringBuilder A11;
        int intValue;
        AbstractC167017dG.A1N(context, str);
        Intent A04 = AbstractC31171DnF.A04();
        A04.setAction("android.intent.action.SEND");
        String A00 = AbstractC43591JPw.A00(384);
        if (num != null && ((intValue = num.intValue()) == 10 || intValue == 9)) {
            A11 = AbstractC166997dE.A11(A00);
            A11.append(str);
            str = "/?src=vc";
        } else {
            A11 = AbstractC166997dE.A11(A00);
        }
        A04.putExtra("android.intent.extra.TEXT", AbstractC166997dE.A0x(str, A11));
        A04.setType("text/plain");
        C12260kU.A0E(context, Intent.createChooser(A04, null));
    }
}
