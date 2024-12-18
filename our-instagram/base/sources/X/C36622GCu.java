package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.GCu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36622GCu implements GYB {
    public final Activity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String str;
        String str2;
        UserSession userSession = this.A01;
        if (C5SJ.A01(userSession)) {
            C142846ck A00 = AbstractC147806l5.A00(userSession);
            boolean A002 = AbstractC31269Dor.A00(userSession);
            A00.A01 = AbstractC166997dE.A0n();
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1I(A0I, "creator_nux_sheet_rendered");
                A0I.A0o("start_broadcast_chat_button");
                if (A002) {
                    str = "inbox_sbc_qp";
                } else {
                    str = "inbox";
                }
                A0I.A0p(str);
                if (A002) {
                    str2 = "subscriber_broadcast";
                } else {
                    str2 = "instagram";
                }
                A0I.A0n(str2);
                A0I.A0u(A00.A01);
                A0I.Cht();
            }
            InterfaceC37154GYr A01 = AbstractC35055FcS.A01(userSession, new ChannelCreationFlowExtraArgs(null, null, null), ChannelCreationSource.A0B, EnumC33330EoP.A02, false);
            Activity activity = this.A00;
            AbstractC31171DnF.A1P(activity);
            A01.Cgf((FragmentActivity) activity);
        }
    }

    public C36622GCu(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
