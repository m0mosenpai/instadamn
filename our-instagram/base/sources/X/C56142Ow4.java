package X;

import android.widget.Toast;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.Ow4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56142Ow4 implements InterfaceC13000lm {
    public Toast A00;
    public C1P1 A01;
    public C1ON A02;
    public C1ON A03;
    public NAF A04;
    public String A05;
    public final C23031Ai A06;
    public final java.util.Set A07;
    public final java.util.Set A08;
    public final C1P1 A09;
    public final UserSession A0A;
    public final OQ5 A0B;

    public final synchronized void A01(C34997FbU c34997FbU, boolean z) {
        if (this.A02 == null) {
            this.A01 = new C32545EUv(12, c34997FbU, this, z);
            UserSession userSession = this.A0A;
            String str = c34997FbU.A01;
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("accounts/set_linked_page_ig_direct_message_access/");
            A0c.A9s("setting_enabled_for_linked_page_ig_dm_access", String.valueOf(z));
            A0c.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            C1ON A0e = AbstractC25227BEk.A0e(A0c, C32184ECf.class, FXW.class);
            this.A02 = A0e;
            C1P1 c1p1 = this.A01;
            C14360o3.A0C(c1p1, "null cannot be cast to non-null type com.instagram.common.api.base.ApiCallback<com.instagram.settings.privacy.messages.api.FbsMessageAccessSettingResponse, com.instagram.api.response.IgResponse>");
            A0e.A00 = c1p1;
            C1ON c1on = this.A02;
            if (c1on != null) {
                C1GJ.A03(c1on);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
    }

    public final synchronized void A02(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        this.A05 = str;
        try {
            C23031Ai c23031Ai = this.A06;
            AbstractC31171DnF.A1S(c23031Ai, OY8.A01(directMessagesInteropOptionsViewModel), c23031Ai.A5y, C23031Ai.A8c, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        } catch (IOException e) {
            C0w9.A06("DirectMessagesOptionChooserController", "Error while serializing DirectMessagesInteropOptionsViewModel", e);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = directMessagesInteropOptionsViewModel.A05;
        String str11 = null;
        if (directMessageInteropReachabilityOptions != null) {
            str2 = directMessageInteropReachabilityOptions.A03;
        } else {
            str2 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = directMessagesInteropOptionsViewModel.A08;
        if (directMessageInteropReachabilityOptions2 != null) {
            str3 = directMessageInteropReachabilityOptions2.A03;
        } else {
            str3 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = directMessagesInteropOptionsViewModel.A00;
        if (directMessageInteropReachabilityOptions3 != null) {
            str4 = directMessageInteropReachabilityOptions3.A03;
        } else {
            str4 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4 = directMessagesInteropOptionsViewModel.A01;
        if (directMessageInteropReachabilityOptions4 != null) {
            str5 = directMessageInteropReachabilityOptions4.A03;
        } else {
            str5 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5 = directMessagesInteropOptionsViewModel.A09;
        if (directMessageInteropReachabilityOptions5 != null) {
            str6 = directMessageInteropReachabilityOptions5.A03;
        } else {
            str6 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6 = directMessagesInteropOptionsViewModel.A07;
        if (directMessageInteropReachabilityOptions6 != null) {
            str7 = directMessageInteropReachabilityOptions6.A03;
        } else {
            str7 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7 = directMessagesInteropOptionsViewModel.A03;
        if (directMessageInteropReachabilityOptions7 != null) {
            str8 = directMessageInteropReachabilityOptions7.A03;
        } else {
            str8 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8 = directMessagesInteropOptionsViewModel.A02;
        if (directMessageInteropReachabilityOptions8 != null) {
            str9 = directMessageInteropReachabilityOptions8.A03;
        } else {
            str9 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9 = directMessagesInteropOptionsViewModel.A04;
        if (directMessageInteropReachabilityOptions9 != null) {
            str10 = directMessageInteropReachabilityOptions9.A03;
        } else {
            str10 = null;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions10 = directMessagesInteropOptionsViewModel.A06;
        if (directMessageInteropReachabilityOptions10 != null) {
            str11 = directMessageInteropReachabilityOptions10.A03;
        }
        C25621Ms A0c = AbstractC167017dG.A0c(this.A0A);
        A0c.A0B("users/set_message_settings_v2/");
        A0c.A0H("ig_followers", str2);
        A0c.A0H("others_on_ig", str3);
        A0c.A0H("fb_friends", str4);
        A0c.A0H("fb_friends_of_friends", str5);
        A0c.A0H("people_with_your_phone_number", str6);
        A0c.A0H("others_on_fb", str7);
        A0c.A0H("fb_messaged_your_page", str8);
        A0c.A0H("fb_liked_or_followed_your_page", str9);
        A0c.A0H("group_message_setting", str10);
        A0c.A0H("ig_verified", str11);
        C1ON A0e = AbstractC25227BEk.A0e(A0c, C52097N2x.class, OQ7.class);
        this.A03 = A0e;
        A0e.A00 = this.A09;
        C1GJ.A03(A0e);
    }

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        this.A08.clear();
    }

    public static final synchronized void A00(C56142Ow4 c56142Ow4, C52097N2x c52097N2x) {
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel;
        synchronized (c56142Ow4) {
            try {
                C23031Ai c23031Ai = c56142Ow4.A06;
                InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
                String string = interfaceC19630xq.getString("interop_reachability_setting", "");
                C14360o3.A07(string);
                DirectMessagesInteropOptionsViewModel parseFromJson = OY8.parseFromJson(C16V.A00(string));
                String A0j = MSX.A0j(c23031Ai, c23031Ai.A5y, C23031Ai.A8c, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
                if (A0j != null) {
                    directMessagesInteropOptionsViewModel = OY8.parseFromJson(C16V.A00(A0j));
                } else {
                    directMessagesInteropOptionsViewModel = new DirectMessagesInteropOptionsViewModel(null, null, null, null, null, null, null, null, null, null);
                }
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.EEj("interop_reachability_setting_PENDING");
                ARD.apply();
                Iterator it = c56142Ow4.A07.iterator();
                while (it.hasNext()) {
                    NAF naf = ((O5T) it.next()).A00;
                    OQ3.A00(naf.A05);
                    NAF.A00(naf);
                }
                for (InterfaceC58069Pou interfaceC58069Pou : c56142Ow4.A08) {
                    String str = c56142Ow4.A05;
                    C14360o3.A0A(directMessagesInteropOptionsViewModel);
                    interfaceC58069Pou.FAy(parseFromJson, directMessagesInteropOptionsViewModel, c52097N2x, str);
                }
            } catch (IOException e) {
                C0w9.A06("DirectMessagesInteropOptionsUpdateHelper", "Error while parsing DirectMessagesInteropOptionsViewModel", e);
            }
        }
    }

    public C56142Ow4(UserSession userSession, C23031Ai c23031Ai, OQ5 oq5) {
        AbstractC167027dH.A13(userSession, oq5, c23031Ai);
        this.A0A = userSession;
        this.A0B = oq5;
        this.A06 = c23031Ai;
        this.A09 = new C50689MZh(this, 24);
        this.A08 = AbstractC166987dD.A1H();
        this.A07 = AbstractC166987dD.A1H();
    }
}
