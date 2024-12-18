package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;
import java.util.ArrayList;

/* renamed from: X.FcR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35054FcR {
    public static final ArrayList A00(Context context, UserSession userSession, Boolean bool, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, boolean z, boolean z2) {
        int i;
        int i2;
        Integer A0p;
        C37055GUl c37055GUl;
        ArrayList A12 = AbstractC166997dE.A12(userSession, 1);
        if (z && C18U.A06(C06090Tz.A05, userSession, 36324247820120084L)) {
            int i3 = 2131954980;
            if (z2) {
                i3 = 2131954979;
            }
            A12.add(AbstractC35247Fgg.A04(context, true, null, C37051GUh.A00(interfaceC16820sZ4, 49), i3, R.drawable.instagram_menu_pano_outline_24));
        }
        if (C14360o3.A0K(bool, true)) {
            if (C18U.A06(C06090Tz.A05, userSession, 36324247819464715L)) {
                A12.add(AbstractC35247Fgg.A04(context, true, null, new C37055GUl(interfaceC16820sZ, 0), 2131954964, R.drawable.instagram_circle_x_pano_outline_24));
            }
            i = 2131954953;
            i2 = R.drawable.instagram_delete_pano_outline_24;
            A0p = AbstractC31174DnI.A0p(context);
            c37055GUl = new C37055GUl(interfaceC16820sZ2, 1);
        } else {
            i = 2131972368;
            i2 = R.drawable.instagram_report_pano_outline_24;
            A0p = AbstractC31174DnI.A0p(context);
            c37055GUl = new C37055GUl(interfaceC16820sZ3, 2);
        }
        A12.add(AbstractC35247Fgg.A04(context, true, A0p, c37055GUl, i, i2));
        return A12;
    }

    public static final void A01(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ChannelChallengeShareInfo channelChallengeShareInfo) {
        C14360o3.A0B(userSession, 0);
        C36387G3n c36387G3n = new C36387G3n(fragmentActivity, 0);
        C34726FRp A07 = C28531Zo.A04.A02.A07(interfaceC11380iw, userSession, C2EY.A0R);
        A07.A07.putParcelable("DirectShareSheetConstants.channel_challenge", channelChallengeShareInfo);
        A07.A01 = c36387G3n;
        AbstractC31176DnK.A0x(fragmentActivity, A07.A00(), C3DN.A00);
    }

    public static final void A02(InterfaceC56362iU interfaceC56362iU, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        interfaceC56362iU.EkS(true);
        AbstractC31179DnN.A1G(interfaceC56362iU);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_more_horizontal_outline_44;
        A0B.A05 = 2131966899;
        A0B.A07 = 0;
        A0B.A0B = 0;
        AbstractC31176DnK.A1B(ViewOnClickListenerC35681FpG.A00(interfaceC16660sJ, 31), A0B, interfaceC56362iU);
        C3LO A0B2 = AbstractC31171DnF.A0B();
        A0B2.A06 = R.drawable.instagram_direct_pano_outline_24;
        A0B2.A05 = 2131973639;
        AbstractC31176DnK.A1B(ViewOnClickListenerC35681FpG.A00(interfaceC16820sZ, 32), A0B2, interfaceC56362iU);
    }
}
