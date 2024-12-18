package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.fragment.InviteFollowersV2Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.FcF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35042FcF {
    public InviteFollowersV2Fragment A00;
    public C36731GHa A01;
    public final Fragment A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C1GL A05;

    public C35042FcF(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1GL c1gl) {
        C14360o3.A0B(userSession, 5);
        this.A02 = fragment;
        this.A05 = c1gl;
        this.A03 = interfaceC11380iw;
        this.A04 = userSession;
    }

    public final void A01(List list, String str) {
        C14360o3.A0B(str, 1);
        Fragment fragment = this.A02;
        Context requireContext = fragment.requireContext();
        UserSession userSession = this.A04;
        boolean A01 = C54P.A01(requireContext, userSession);
        Integer num = C05F.A0j;
        RunnableC36923GOs runnableC36923GOs = new RunnableC36923GOs(this, A01);
        boolean A00 = AbstractC1565371b.A00(userSession);
        GHY ghy = new GHY(fragment.requireContext(), new ViewOnClickListenerC35609Fo0(4, runnableC36923GOs, this, num, A00), str);
        ghy.A03 = R.drawable.instagram_mail_pano_outline_24;
        ghy.A09 = A00;
        list.add(ghy);
    }

    public final void A02(List list, String str) {
        C14360o3.A0B(str, 1);
        boolean A00 = AbstractC1565371b.A00(this.A04);
        GHY ghy = new GHY(this.A02.requireContext(), new ViewOnClickListenerC35669Fp4(14, this, A00), str);
        ghy.A03 = R.drawable.instagram_user_follow_pano_outline_24;
        ghy.A09 = A00;
        list.add(ghy);
    }

    public final void A03(List list, String str) {
        C14360o3.A0B(str, 1);
        Fragment fragment = this.A02;
        Context requireContext = fragment.requireContext();
        UserSession userSession = this.A04;
        boolean A01 = C54P.A01(requireContext, userSession);
        boolean A00 = AbstractC1565371b.A00(userSession);
        GHY ghy = new GHY(fragment.requireContext(), new ViewOnClickListenerC35583Fna(this, 2, A00, A01), str);
        ghy.A03 = R.drawable.instagram_share_android_pano_outline_24;
        ghy.A09 = A00;
        list.add(ghy);
    }

    public final void A04(List list, String str) {
        C14360o3.A0B(str, 1);
        Fragment fragment = this.A02;
        Context requireContext = fragment.requireContext();
        UserSession userSession = this.A04;
        boolean A01 = C54P.A01(requireContext, userSession);
        Integer num = C05F.A0Y;
        RunnableC36924GOt runnableC36924GOt = new RunnableC36924GOt(this, A01);
        boolean A00 = AbstractC1565371b.A00(userSession);
        GHY ghy = new GHY(fragment.requireContext(), new ViewOnClickListenerC35609Fo0(4, runnableC36924GOt, this, num, A00), str);
        ghy.A03 = R.drawable.instagram_sms_pano_outline_24;
        ghy.A09 = A00;
        list.add(ghy);
    }

    public final void A05(List list, String str) {
        C14360o3.A0B(str, 1);
        UserSession userSession = this.A04;
        boolean A00 = AbstractC1565371b.A00(userSession);
        Fragment fragment = this.A02;
        GHY ghy = new GHY(fragment.requireContext(), new ViewOnClickListenerC35583Fna(this, 3, A00, C54P.A01(fragment.requireContext(), userSession)), str);
        ghy.A03 = R.drawable.instagram_app_whatsapp_pano_outline_24;
        ghy.A09 = A00;
        list.add(ghy);
    }

    public static final void A00(C35042FcF c35042FcF, Object obj, String str) {
        Integer num;
        InviteFollowersV2Fragment inviteFollowersV2Fragment = c35042FcF.A00;
        if (inviteFollowersV2Fragment != null) {
            Integer[] A00 = C05F.A00(10);
            int length = A00.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    num = A00[i];
                    if (C14360o3.A0K(F8Q.A00(num), str)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    num = null;
                    break;
                }
            }
            num.getClass();
            int intValue = num.intValue();
            if (intValue != 6) {
                if (intValue == 7 && (obj instanceof FRF)) {
                    C34593FMc c34593FMc = ((FRF) obj).A00;
                    c34593FMc.getClass();
                    String str2 = c34593FMc.A02;
                    String str3 = inviteFollowersV2Fragment.A05;
                    str3.getClass();
                    C32306EKt c32306EKt = new C32306EKt();
                    Bundle A08 = AbstractC31176DnK.A08(str3);
                    A08.putString("ARG_TARGET_USER_ID", str2);
                    AbstractC31177DnL.A15(c32306EKt, AbstractC31173DnH.A0J(A08, c32306EKt, inviteFollowersV2Fragment), inviteFollowersV2Fragment.A04);
                }
            } else {
                FragmentActivity requireActivity = inviteFollowersV2Fragment.requireActivity();
                UserSession userSession = inviteFollowersV2Fragment.A04;
                AbstractC34023F0c.A00(requireActivity, inviteFollowersV2Fragment.requireContext(), userSession, C05F.A0u, inviteFollowersV2Fragment.getString(2131964669));
            }
            InviteFollowersV2Fragment.A00(inviteFollowersV2Fragment, str);
            inviteFollowersV2Fragment.A06 = true;
            ActionButton actionButton = inviteFollowersV2Fragment.A01;
            actionButton.getClass();
            actionButton.setEnabled(true);
        }
    }
}
