package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F7W {
    public static final void A00(Context context, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2, boolean z3) {
        String username;
        String str9 = str7;
        AbstractC167007dF.A1E(userSession, 1, str2);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("DirectReplyModalFragment.content_id", str3);
        A0b.putString("DirectReplyModalFragment.source_module_name", str2);
        A0b.putString("DirectReplyModalFragment.reel_id", str4);
        A0b.putString("DirectReplyModalFragment.reel_item_id", str5);
        A0b.putBoolean("ClickToMessagingOnFeedBottomSheetFragment.should_send_attachment", z2);
        A0b.putString(AbstractC111324zv.A00(297), str9);
        A0b.putString(AbstractC111324zv.A00(149), str8);
        A0b.putString(AbstractC111324zv.A00(617), "_ctd");
        InterfaceC37193Ga4 A00 = AbstractC34891FZd.A00(A0b, userSession, AbstractC34891FZd.A00, str);
        C2DS A002 = AbstractC28761aE.A00(userSession);
        ImageUrl imageUrl = PendingRecipient.A0g;
        List A0j = AbstractC31177DnL.A0j(A00.CE6());
        C81663kb BZR = A002.BZR(null, null, null, A0j);
        DirectShareTarget directShareTarget = new DirectShareTarget(AbstractC31232DoF.A00(BZR.C7I(), A0j), BZR.C7l(), A0j, true);
        C7NF A003 = C7ND.A00(userSession);
        A003.A01();
        if (str7 == null) {
            str9 = "";
        }
        A003.A01 = str9;
        A003.A03 = A00.CE6().getId();
        String C7I = BZR.C7I();
        String str10 = "";
        if (C7I == null) {
            C7I = "";
        }
        A003.A04 = C7I;
        String C7q = BZR.C7q();
        if (C7q != null) {
            str10 = C7q;
        }
        A003.A05 = str10;
        A003.A00 = i;
        A00.EOe(BZR, A002, directShareTarget, str6, z);
        User CE6 = A00.CE6();
        if (z3) {
            username = CE6.B8y();
        } else {
            username = CE6.getUsername();
        }
        C2OG A01 = C2OG.A01();
        C34648FOf A004 = C35129FeW.A00(userSession.userId);
        A004.A0G = "direct_reply_modal_notification_type";
        A004.A0H = AbstractC166997dE.A0r(context.getResources(), username, 2131960438);
        A004.A04 = CE6.Bhu();
        A004.A0E = str6;
        A004.A03 = PushChannelType.A09;
        A004.A08 = new G8S(userSession, directShareTarget, str2, 1);
        C35129FeW.A01(A004, A01);
    }
}
