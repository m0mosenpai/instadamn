package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.reels.chat.model.ChatStickerChannelType;

/* renamed from: X.FYj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34874FYj {
    public static final void A00(Activity activity, View view, UserSession userSession, InterfaceC144306fC interfaceC144306fC, String str, String str2, int i, boolean z) {
        interfaceC144306fC.EYT(true);
        AbstractC147806l5.A00(userSession).A0V(str, str2, AbstractC111324zv.A00(5197), null, null, i, z, false, false, false, false);
        C1ON A06 = DirectThreadApi.A06(userSession, str, null);
        A06.A00 = new ETY(activity, view, userSession, interfaceC144306fC, str, str2, i);
        C1GJ.A03(A06);
    }

    public static final void A01(View view, FragmentActivity fragmentActivity, StoryJoinChatStatus storyJoinChatStatus, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC144306fC interfaceC144306fC, IE9 ie9, String str, String str2, int i) {
        AbstractC167007dF.A1E(userSession, 1, str);
        if (!AbstractC34105F3h.A00(userSession).A00.contains(str) && storyJoinChatStatus != StoryJoinChatStatus.A04 && storyJoinChatStatus != StoryJoinChatStatus.A05) {
            if (C18U.A06(C06090Tz.A05, userSession, 2342158856077774454L) && !AbstractC166987dD.A0x(userSession).getBoolean("broadcast_chat_joinflow_nux", false)) {
                C189448aO A0X = AbstractC31177DnL.A0X(userSession, true);
                A0X.A03 = 0.9f;
                A0X.A1O = true;
                A0X.A0U = new GH3(view, fragmentActivity, userSession, interfaceC144306fC, ie9, str, str2, i);
                C189478aR A00 = A0X.A00();
                EKK ekk = new EKK();
                Bundle A0b = AbstractC166987dD.A0b();
                AbstractC60492pY.A03(A0b, userSession);
                A0b.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                A0b.putString("thread_v2_id", str2);
                ekk.setArguments(A0b);
                A00.A02(fragmentActivity, ekk);
                return;
            }
            A00(fragmentActivity, view, userSession, interfaceC144306fC, str, str2, i, false);
            return;
        }
        C33091Eir c33091Eir = (C33091Eir) userSession.A01(C33091Eir.class, new C37058GUs(userSession, 27));
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            F3I.A00(fragmentActivity, interfaceC60442pS, userSession, c33091Eir, A2u, AbstractC25231BEo.A0t(AbstractC25226BEj.A14(c38321qM)), ChatStickerChannelType.A05.A00, str, new J7R(ie9, 22), i, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
