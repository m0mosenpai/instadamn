package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.direct.sharetostory.data.JoinChatStickerData;
import com.instagram.modal.TransparentModalActivity;
import java.util.Locale;

/* renamed from: X.FWs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34835FWs {
    public static final void A00(Activity activity, UserSession userSession, InviteLinkShareInfo inviteLinkShareInfo) {
        C14360o3.A0B(userSession, 0);
        String str = inviteLinkShareInfo.A07;
        String str2 = inviteLinkShareInfo.A09;
        String str3 = inviteLinkShareInfo.A08;
        int i = inviteLinkShareInfo.A00;
        A01(activity, userSession, new JoinChatStickerData(inviteLinkShareInfo.A04, str, str2, str3, AbstractC31172DnG.A16(Locale.ROOT, "SHARE_SHEET"), i, inviteLinkShareInfo.A01, inviteLinkShareInfo.A02, inviteLinkShareInfo.A0C, false, false));
    }

    public static final void A01(Activity activity, UserSession userSession, JoinChatStickerData joinChatStickerData) {
        Bundle A0C = AbstractC31177DnL.A0C(userSession);
        A0C.putSerializable(AbstractC111324zv.A00(676), C22P.A5N);
        A0C.putParcelable(AbstractC111324zv.A00(677), joinChatStickerData);
        AbstractC31173DnH.A0v(activity, A0C, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(2972));
    }
}
