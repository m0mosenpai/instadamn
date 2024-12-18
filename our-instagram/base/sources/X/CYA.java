package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* loaded from: classes5.dex */
public abstract class CYA {
    public static final void A01(Activity activity, UserSession userSession, MQS mqs, String str) {
        C14360o3.A0B(userSession, 0);
        C26857BtJ c26857BtJ = new C26857BtJ();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("args_media_id", str);
        AbstractC03240Dh.A00(A0b, userSession);
        c26857BtJ.setArguments(A0b);
        c26857BtJ.A00 = mqs;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        C14360o3.A0C(c26857BtJ, MSV.A00(3));
        A0y.A0T = c26857BtJ;
        C189478aR A0x = AbstractC25228BEl.A0x(activity, C3DN.A00);
        if (A0x != null) {
            C189478aR c189478aR = A0x.A03.A02;
            if (c189478aR != null) {
                c189478aR.A0F(c26857BtJ, A0y);
                return;
            }
            return;
        }
        A0y.A00().A02(activity, c26857BtJ);
    }

    public static final void A00(Activity activity, UserSession userSession, MQS mqs, PromptStickerModel promptStickerModel, String str) {
        C26860BtM c26860BtM = new C26860BtM();
        Bundle A0b = AbstractC166987dD.A0b();
        if (promptStickerModel != null) {
            A0b.putParcelable("prompt_sticker_model", promptStickerModel.A02());
        }
        if (str != null) {
            A0b.putString("args_media_id", str);
        }
        AbstractC03240Dh.A00(A0b, userSession);
        c26860BtM.setArguments(A0b);
        c26860BtM.A00 = mqs;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        C14360o3.A0C(c26860BtM, MSV.A00(3));
        A0y.A0T = c26860BtM;
        C189478aR A0x = AbstractC25228BEl.A0x(activity, C3DN.A00);
        if (A0x != null) {
            C189478aR c189478aR = A0x.A03.A02;
            if (c189478aR != null) {
                c189478aR.A0F(c26860BtM, A0y);
                return;
            }
            return;
        }
        A0y.A00().A02(activity, c26860BtM);
    }
}
