package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

/* loaded from: classes9.dex */
public abstract class OQ4 {
    public static final void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, Integer num, String str, DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr, int i, boolean z) {
        String str2;
        C14360o3.A0B(userSession, 0);
        if (bundle == null) {
            bundle = AbstractC166987dD.A0b();
        }
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_TITLE", fragmentActivity.getString(i));
        if (num != null) {
            str2 = fragmentActivity.getString(num.intValue());
        } else {
            str2 = "";
        }
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_DESCRIPTION", str2);
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTION_NAME", str);
        bundle.putParcelableArray("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTIONS", directMessageInteropReachabilityOptionsArr);
        bundle.putParcelable("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_VIEW_MODEL", directMessagesInteropOptionsViewModel);
        bundle.putBoolean("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ADD_HEADER_AND_FOOTER", z);
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ENTRY_POINT", bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY));
        AbstractC31175DnJ.A0t(bundle, new C52779NXm(), AbstractC31173DnH.A0P(fragmentActivity, userSession));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f1, code lost:
    
        if (r13 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fa, code lost:
    
        r6 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r14 == false) goto L60;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r9, X.InterfaceC58070Pov r10, X.EnumC222416a r11, java.lang.String r12, boolean r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OQ4.A01(com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel, X.Pov, X.16a, java.lang.String, boolean, boolean, boolean):void");
    }
}
