package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GAG implements GZH {
    public final UserSession A00;
    public final C31250DoY A01;

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(enumC33370Ep3, 1);
        return AbstractC167007dF.A1X(enumC33370Ep3, EnumC33370Ep3.A07);
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        String str;
        User A04;
        C14360o3.A0B(c5hw, 0);
        String str2 = c5hw.A04.A0f;
        if (str2 != null && AbstractC31252Doa.A00(this.A00, str2)) {
            str = "notification_message_button";
        } else {
            PrivateReplyStatus privateReplyStatus = c5hw.A04.A00;
            if (privateReplyStatus != null && privateReplyStatus.ordinal() == 3) {
                str = AbstractC111324zv.A00(499);
            } else {
                str = "private_reply_message";
            }
        }
        if (c5hw.A00 == 101) {
            C31250DoY c31250DoY = this.A01;
            C3DN A0r = AbstractC31172DnG.A0r(c31250DoY.A05);
            if (A0r != null && (A04 = c5hw.A04()) != null) {
                UserSession userSession = c31250DoY.A0A;
                String id = A04.getId();
                C14360o3.A0B(userSession, 0);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "send_quick_message");
                if (A0f.isSampled()) {
                    A0f.AAP("target_id", id);
                    A0f.AAP("view_module", "activity_feed");
                    A0f.AAP("request_type", "button_tapped");
                    A0f.Cht();
                }
                C34725FRo A06 = C28531Zo.A04.A02.A06(c31250DoY.A0B, userSession, "activity_feed");
                Bundle bundle = A06.A01;
                bundle.putBoolean(AbstractC111324zv.A00(148), true);
                bundle.putString("DirectReplyModalFragment.message_recipient_user_id", A04.getId());
                A0r.A0J(A06.A00());
                return;
            }
            return;
        }
        this.A01.Day(c5hw, str);
    }

    public GAG(UserSession userSession, C31250DoY c31250DoY) {
        this.A01 = c31250DoY;
        this.A00 = userSession;
    }
}
