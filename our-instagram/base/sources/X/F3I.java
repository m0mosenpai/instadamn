package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.groupinvites.GroupPreviewFragmentLauncher$launchForMessageShareSticker$1;
import com.instagram.reels.chat.model.ChatStickerChannelType;

/* loaded from: classes6.dex */
public abstract class F3I {
    public static final void A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C33091Eir c33091Eir, String str, String str2, String str3, String str4, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        boolean A1a = AbstractC31175DnJ.A1a(c33091Eir);
        AbstractC167017dG.A1U(str3, str4);
        if (z) {
            i2 = 1219;
        } else {
            i2 = 2990;
        }
        String A00 = AbstractC111324zv.A00(i2);
        if (VW2.A00(str3) == ChatStickerChannelType.A05 && FU1.A01(userSession, str4, i)) {
            C28531Zo.A04.A03(fragmentActivity, interfaceC11380iw, userSession, str4, null, null, A00, i);
            return;
        }
        C6WQ c6wq = new C6WQ(fragmentActivity, A1a);
        AbstractC31176DnK.A13(fragmentActivity, c6wq);
        C0fJ.A00(c6wq);
        C57312k6 A002 = C07Y.A00(fragmentActivity);
        GroupPreviewFragmentLauncher$launchForMessageShareSticker$1 groupPreviewFragmentLauncher$launchForMessageShareSticker$1 = new GroupPreviewFragmentLauncher$launchForMessageShareSticker$1(fragmentActivity, interfaceC11380iw, userSession, c33091Eir, c6wq, str, str3, A00, str2, null, interfaceC16820sZ, z);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, groupPreviewFragmentLauncher$launchForMessageShareSticker$1, A002);
        AbstractC23641Du.A05(anonymousClass191, new MBX(c33091Eir, str3, str, (InterfaceC23621Ds) null, 16), ((C4A7) c33091Eir).A01);
    }
}
